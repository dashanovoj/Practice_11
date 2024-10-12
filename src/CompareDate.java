import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class CompareDate {
    public static class DateComparator {
        // Поля данных класса (год-месяц-день час:минута:секунда)
        int year, month, day, hour, minute, second;
        // Получаем экземпляры класса Calendar - Григорианский календарь (ч/з метод getInstance)
        Calendar cal = Calendar.getInstance(); // текущей даты
        Calendar calUser = Calendar.getInstance(); // даты, введенной пользователем
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // определяем формат даты

        // Конструктор текущей даты
        public DateComparator() {
            year = cal.get(Calendar.YEAR);
            month = cal.get(Calendar.MONTH);
            day = cal.get(Calendar.DAY_OF_MONTH);
            hour = cal.get(Calendar.HOUR_OF_DAY);
            minute = cal.get(Calendar.MINUTE);
            second = cal.get(Calendar.SECOND);
        }

        // Конструктор даты, введенной пользователем (устанавливаем год-месяц-день пользователя и текущее системное время)
        public DateComparator(int userYear, int userMonth, int userDay) {
            calUser.set(Calendar.YEAR, userYear);
            calUser.set(Calendar.MONTH, userMonth - 1);
            calUser.set(Calendar.DAY_OF_MONTH, userDay);
            calUser.get(Calendar.HOUR_OF_DAY);
            calUser.get(Calendar.MINUTE);
            calUser.get(Calendar.SECOND);
        }

        public void outCurrent() {
            System.out.println("Текущее время: " + sdf.format(cal.getTime()));
        }

        public void outUser() {
            System.out.println("Введённое время: " + sdf.format(calUser.getTime()));
        }

        // Сравниваем даты
        public void compareCal(DateComparator currentDate) {
            // Используем методы before, after для сравнения дат
            if (calUser.getTime().before(cal.getTime())) {
                System.out.println("Введенная дата и время раньше текущей даты и времени");
            } else if (calUser.getTime().after(cal.getTime())) {
                System.out.println("Введенная дата и время позже текущей даты и времени");
            } else System.out.println("Введенная дата и время равны текущей дате и времени");
        }
    }

    public static void main(String[] args) {
        // Создаём экземпляры дат
        DateComparator currentDate = new DateComparator(); // текущего времени
        DateComparator userDate = new DateComparator(2017, 5, 25); // введенной пользователем

        // Выводим даты
        currentDate.outCurrent(); // текущую
        userDate.outUser(); // введённую

        userDate.compareCal(currentDate); // сравниваем даты
    }

}
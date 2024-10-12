import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalDateFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год, месяц и число (в формате ГГГГ ММ ДД):");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        System.out.println("Введите часы и минуты (в формате ЧЧ ММ):");
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        // Создаём объект Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1); // Месяцы в Calendar нумеруются с 0
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour); // Используем HOUR_OF_DAY для 24-часового формата
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, 0); // Устанавливаем секунды и миллисекунды в 0
        calendar.set(Calendar.MILLISECOND, 0);

        // Создаём объект Date (ч/з объект класса Calendar для более удобной работы)
        Date date = calendar.getTime();

        // Вывод результатов
        System.out.println("Созданный объект Date: " + date);
        System.out.println("Созданный объект Calendar: " + calendar.getTime());
    }
}

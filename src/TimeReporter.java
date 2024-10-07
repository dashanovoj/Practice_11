import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeReporter {

    // Создаём класс для определения фамилии разработчика
    public static class Developer {
        String Surname; // поле для фамилии

        // Конструктор
        public Developer(String surname) {
            Surname = surname;
        }

        // Getter и Setter
        public String getSurname() {
            return Surname;
        }

        public void setSurname(String surname) {
            Surname = surname;
        }

        // Вывод экземпляра класса
        @Override
        public String toString() {
            return "Разработчик: " + Surname;
        }
    }

    // Создаём класс для определения даты и времени получения задания
    public static class TaskTime {
        private Date taskTimeDate; // поле объекта Date,

        // Конструктор
        public TaskTime(Date taskTimeDate) {
            this.taskTimeDate = taskTimeDate;
        }

        // Форматирование даты и времени по определенному паттерну и их вывод
        public String outTaskTime() {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return "Дата и время получения задания: " + sdf.format(taskTimeDate);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // определяем формат даты
        sdf.setLenient(false); // отключаем возможность исправления даты и времени

        // Получаем фамилию разработчика
        System.out.println("Введите фамилию разработчика: ");
        String surname = sc.nextLine();
        Developer developer = new Developer(surname);


        Date taskTimeDate = null; // создаём переменную типа Date, в ней будет храниться дата и время выдачи задания
        while (taskTimeDate == null) { // пока значение даты и времени не было введено
            System.out.print("Введите дату и время получения задания в формате гггг-мм-дд чч:мм:сс: ");
            String taskTimeInput = sc.nextLine(); // вводим дату и время
            try {
                taskTimeDate = sdf.parse(taskTimeInput); // если ввод корректен, вводимые с клавиатуры дата и время присвоятся переменной taskTimeDate
            } catch (ParseException e) { // при возникновении синтаксической ошибки
                System.out.println("Неправильное значение. Введите ещё раз."); // просим ввести дату и время еще раз
            }
        }
        TaskTime taskTime = new TaskTime(taskTimeDate); // создаём экземпляр класса taskTime - дата и время выдачи задания
        Date currentDate = new Date(); // получаем дату и время сдачи задания (текущее время) ч/з объект Date
        // Выводим полученные данные
        System.out.println(developer + "\n"+ taskTime.outTaskTime() + "\nДата и время сдачи задания: " + sdf.format(currentDate));

    }

}

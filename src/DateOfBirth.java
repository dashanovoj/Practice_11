import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateOfBirth {

    // Класс Student, передающий характеристики студента
    public static class Student {
        private String firstName;
        private String lastName;
        private LocalDate dateOfBirth;
        private String speciality;
        private int course;
        private String group;
        private double GPA;

        // Конструктор
        public Student(String firstName, String lastName, String speciality, int course, String group, double GPA, LocalDate dateOfBirth) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.speciality = speciality;
            this.course = course;
            this.group = group;
            this.GPA = GPA;
            this.dateOfBirth = dateOfBirth;
        }

        // Getter'ы и Setter'ы
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getSpeciality() {
            return speciality;
        }

        public void setSpeciality(String speciality) {
            this.speciality = speciality;
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public double getGPA() {
            return GPA;
        }

        public void setGPA(double GPA) {
            this.GPA = GPA;
        }

        // Определяем метод для форматирования даты
        public String FormattedDate(String format) {
            // Экземпляр класса DateTimeFormatter для представления даты в определенном формате
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            return dateOfBirth.format(formatter);
        }

        // Вывод характеристики студента
        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", speciality='" + speciality + '\'' +
                    ", course=" + course +
                    ", group='" + group + '\'' +
                    ", GPA=" + GPA + '\'' +
                    ", dateOfBirth=" + dateOfBirth +
                    '}';
        }
    }

    public static void main(String[] args) {
        // Экземпляр класса Student - передаём статически характеристику студента
        Student student = new Student("Дарья", "Новожилова","Информатика и вычислительная техника", 2, "КВБО-02-23", 4, LocalDate.of(2005, 8, 9));
        // Выводим дату рождения в разных форматах
        System.out.println("Дата рождения в коротком формате: " + student.FormattedDate("dd.MM.yy"));
        System.out.println("Дата рождения в среднем формате: " + student.FormattedDate("dd MMM yyyy"));
        System.out.println("Дата рождения в полном формате: " + student.FormattedDate("EEEE, dd MMMM yyyy"));
    }

}

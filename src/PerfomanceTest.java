import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerfomanceTest {

    // Определяем метод для теста списка типа ArrayList
    public static void testArrayList(int size) {
        List<Integer> list = new ArrayList<>();
        long startTime, endTime; // поля для хранения начала и конца выполнения операции

        // Вставка элемента в начало списка
        startTime = System.nanoTime();
        for(int i = 0; i < size; i++) {
            list.addFirst(i); // метод для добавления указанного элемента в первую позицию списка
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList: Вставка в начало списка - " + (endTime - startTime) + " нс");

        // Удаление элемента из начала списка
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list.removeFirst(); // метод для удаления элемента из начала списка
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList: Удаление из начала списка - " + (endTime - startTime) + " нс");

        // Добавление элемента в конец списка
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list.add(i); // метод для добавления элемента в конец списка
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList: Добавление в конец списка - " + (endTime - startTime) + " нс");

        // Поиск элемента по образцу в списке
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list.contains(i); // метод для проверки на содержание указанного элемента
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList: Поиск по образцу в списке - " + (endTime - startTime) + " нс");
    }

    // Определяем метод для теста списка типа LinkedList
    public static void testLinkedList(int size) {
        List<Integer> list = new LinkedList<>();
        long startTime, endTime;

        // Вставка элемента в начало списка
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList: Вставка в начало списка - " + (endTime - startTime) + " нс");

        // Удаление элемента из начала списка
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList: Удаление из начала списка - " + (endTime - startTime) + " нс");

        // Добавление элемента в конец списка
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList: Добавление в конец списка - " + (endTime - startTime) + " нс");

        // Поиск элемента по образцу в списке
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList: Поиск по образцу в списке - " + (endTime - startTime) + " нс");
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000}; // массив размеров списков
        for (int size : sizes) {
            System.out.println("Размер списка: " + size);
            testArrayList(size);
            testLinkedList(size);
            System.out.println();
        }
    }

}

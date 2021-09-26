package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        Scanner scanner = new Scanner(System.in);
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка: ");
        int sizeList = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();
        Random random = new Random();
        logger.log("Создаём и наполняем список");
        List<Integer> source = new ArrayList<>();
        for (int i = 0; i < sizeList; i++) {
            source.add(random.nextInt(maxValue));
        }
        System.out.println("Вот случайный список: " + source);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int threshold = scanner.nextInt();
        Filter filter = new Filter(threshold);
        List<Integer> result = filter.filterOut(source);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершаем программу");
    }
}

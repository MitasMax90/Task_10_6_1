import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StreamResult {
    public static void main(String[] args) {
        // Создаём новый обект класса File, передаём путь к файлу
        File file = new File("testInput");
        // Обрабатываем исключения для реализации нашей задачи
        try {
            Scanner scanner = new Scanner(file);
            // Считываем нашу едингственную строку
            String line = scanner.nextLine();
            String[] numbers = line.split(" "); // Возвращаем массив "элементов", нах-ся между пробелами
            // Проверяем, сколько файлов в массиве
            if (numbers.length != 10)
                throw new IllegalArgumentException(); // Выкидываем исключение, "Неправильное количество аргументов"
            // Считаем сумму всех элементов, переведя строку String в  реальное число int (если это возможно)
            int sum = 0;
            for (String number: numbers)
                sum += Integer.parseInt(number);
            // Выводим сумму
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден"); // Ловим исключение и выводим сообщение в консоль
        } catch (IllegalArgumentException e) {
            System.out.println("Неккоректный входящий файл");
        }
    }
}

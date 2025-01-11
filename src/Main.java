import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }
        System.out.println("Створений масив: " + Arrays.toString(array));
        int negativeSum = 0;
        for (int num : array) {
            if (num < 0) {
                negativeSum += num;
            }
        }
        System.out.println("Сума від'ємних чисел: " + negativeSum);
        int evenCount = 0;
        int oddCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Найбільший елемент: " + max + ", індекс: " + maxIndex);
        System.out.println("Найменший елемент: " + min + ", індекс: " + minIndex);
        int firstNegativeIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        if (firstNegativeIndex != -1) {
            int sumAfterNegative = 0;
            int countAfterNegative = 0;
            for (int i = firstNegativeIndex + 1; i < array.length; i++) {
                sumAfterNegative += array[i];
                countAfterNegative++;
            }
            if (countAfterNegative > 0) {
                double averageAfterNegative = (double) sumAfterNegative / countAfterNegative;
                System.out.println("Середнє арифметичне після першого від'ємного числа: " + averageAfterNegative);
            } else {
                System.out.println("Після першого від'ємного числа немає інших елементів.");
            }
        } else {
            System.out.println("У масиві немає від'ємних чисел.");
        }
    }
}

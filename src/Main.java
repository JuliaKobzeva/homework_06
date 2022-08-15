import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task() {

        //Задание 1

        int[] arr = generateRandomArray();

        int sum = 0;

        for (int element : arr) {
            sum += element;
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //Задание 2

        System.out.println(Arrays.toString (arr));

        int maxExpense = -1;
        for (int current : arr) {
            if (current > maxExpense) {
                maxExpense = current;
            }
        }


        System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей.");

        int minExpense = arr[0];
        for (int current2 : arr) {
            if (current2 < minExpense){
                minExpense = current2;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей.");

        //Задание 3

        double AverageExpense = sum / 30;

        System.out.println("Средняя сумма трат за месяц составила " + AverageExpense + " рублей.");

        //Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for(int i = 10; i >= 0; i-- ){
            System.out.print(reverseFullName [i]);
        }
        System.out.println();
    }
}
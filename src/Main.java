import java.util.Arrays;
import java.util.Random;

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

        //Задание 5
        int [] [] apple = new int [3] [3];
        apple [0] [0] = 1;
        apple [0] [1] = 1;
        apple [0] [2] = 1;
        apple [1] [0] = 1;
        apple [1] [1] = 1;
        apple [1] [2] = 1;
        apple [2] [0] = 1;
        apple [2] [1] = 1;
        apple [2] [2] = 1;

        for (int[] row : apple) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        int [] [] orange = {{1,2,3},{1,2,3},{1,2,3}};

        for (int i = 0; i < orange.length; i++) {
            for (int j = 0; j < orange[0].length; j++) {
                System.out.print(orange[j][i] + " ");
            }
            System.out.println();
        }

        //Задание 6
        int [] banana = {5, 4, 3, 2, 1};

        System.out.println(Arrays.toString (banana));

        Arrays.sort(banana);

        System.out.println(Arrays.toString (banana));

        //Задание 7
        int [] cherry = {5, 8, 2, 3, 9};

        System.out.println(Arrays.toString (cherry));

        for(int i = 4; i >= 0; i-- ){
            System.out.print(cherry [i] + " ");
        }
        System.out.println();

        //Задание 8
        int [] pear = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};

        Arrays.sort(pear);
        System.out.println(Arrays.toString (pear));

        for (int i = 0; i < pear.length - 3; i++){
           int sum2 = pear[i] + pear [i+3];
            if (sum2 == -2) {
                System.out.println(pear[i] + " + " + pear[i+3] + " = " + sum2);
            }
        }

        //Задание 9
        int [] pear2 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};

        Arrays.sort(pear2);
        System.out.println(Arrays.toString (pear2));

        for (int i = 0; i < pear2.length - 1;i++){
            int sum3 = pear[i] + pear [i+1];
            if (sum3 == -2) {
                System.out.println(pear[i] + " + " + pear[i+1] + " = " + sum3);
            }
        }

        for (int i = 0; i < pear2.length - 2;i++){
            int sum3 = pear[i] + pear [i+2];
            if (sum3 == -2) {
                System.out.println(pear[i] + " + " + pear[i+2] + " = " + sum3);
            }
        }

        for (int i = 0; i < pear2.length - 3;i++){
            int sum3 = pear[i] + pear [i+3];
            if (sum3 == -2) {
                System.out.println(pear[i] + " + " + pear[i+3] + " = " + sum3);
            }
        }

        for (int i = 0; i < pear2.length - 4;i++){
            int sum3 = pear[i] + pear [i+4];
            if (sum3 == -2) {
                System.out.println(pear[i] + " + " + pear[i+4] + " = " + sum3);
            }
        }

        for (int i = 0; i < pear2.length - 5;i++){
            int sum3 = pear[i] + pear [i+5];
            if (sum3 == -2) {
                System.out.println(pear[i] + " + " + pear[i+5] + " = " + sum3);
            }
        }

        for (int i = 0; i < pear2.length - 6;i++){
            int sum3 = pear[i] + pear [i+6];
            if (sum3 == -2) {
                System.out.println(pear[i] + " + " + pear[i+6] + " = " + sum3);
            }
        }

        for (int i = 0; i < pear2.length - 7;i++){
            int sum3 = pear[i] + pear [i+7];
            if (sum3 == -2) {
                System.out.println(pear[i] + " + " + pear[i+7] + " = " + sum3);
            }
        }

        for (int i = 0; i < pear2.length - 8;i++){
            int sum3 = pear[i] + pear [i+8];
            if (sum3 == -2) {
                System.out.println(pear[i] + " + " + pear[i+8] + " = " + sum3);
            }
        }

    }
}
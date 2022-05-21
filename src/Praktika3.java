import java.util.Arrays;
import java.util.Scanner;

public class Praktika3 {
    public static void main(String[] args) {
        int tsk;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания: ");
        tsk = scanner.nextInt();
        switch (tsk) {
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3();
                break;
            default:
                System.out.println("Что ты вводишь?");
        }
        scanner.close();
    }

    public static void task1() {
        int[] arr = {5, 24, 3, 66, 38, 16, 27};
        Arrays.sort(arr);
        System.out.println(arr[2]);
    }

    public static void task2() {
        String login, pass;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        login = scanner.nextLine();
        System.out.print("Введите пароль от 8 до 15 символов: ");
        pass = scanner.nextLine();
        while (pass.length() < 8 || pass.length() > 15) {
            System.out.println("Длина вашего пароля: " + pass.length());
            System.out.print("Введите пароль от 8 до 15 символов: ");
            pass = scanner.nextLine();
        }
        System.out.println("Ваш логин: " + login);
        System.out.println("Ваш пароль: " + pass);
    }

    public static void task3() {
        String[] arrS = {"Саша", "Игорь", "Миша", "Коля", "Владимир"};
        int[][] arr = {
                {4, 3, 2, 5, 1},
                {3, 4, 4, 6, 2},
                {2, 5, 4, 3, 2},
                {8, 4, 2, 0, 4},
                {4, 4, 3, 2, 9},
        };
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sum += arr[i][j];
            }
            arrS[i] = arrS[i] + " " + sum + " баллов";
            System.out.println(arrS[i]);
            sum = 0;
        }
    }
}

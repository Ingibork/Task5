package task;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя...");
        String name = scanner.nextLine();
        if (name.equals("Вася")) {
            System.out.print("Привет! \nЯ тебя так долго ждал\n");
        }

        if (name.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        }

        if (!name.equals("Вася") && !name.equals("Анастасия")) {
            System.out.println("Добрый день, а вы кто?");
        }


        // if else *************************************************************

        System.out.println("Введите ваше имя...");
        String name2 = scanner.nextLine();
        if (name2.equals("Вася")) {
            System.out.print("Привет! \nЯ тебя так долго ждал\n");
        } else if (name2.equals("Анастасия"))
            System.out.println("Я тебя так долго ждал");

        else System.out.println("Добрый день, а вы кто?");

        // switch **************************************************************

        System.out.println("Введите ваше имя...");
        String name3 = scanner.nextLine();
        switch (name3) {
            case "Вася":
                System.out.print("Привет! \nЯ тебя так долго ждал\n");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;

        }
    }
}


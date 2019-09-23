package com.company;
import java.util.Scanner;

public class Main
{
    private static final int MAX = 100;
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_CYAN = "\u001B[32m";
    private static final String ANSI_BLUE = "\u001B[34m";

    public static int readInt(Scanner in)
    {
        System.out.println("Введите Ваше число");
        // Запрет на ввод символов
        while (!in.hasNextInt())
        {
            System.out.println("ЭТО НЕ ЧИСЛО!!!");
            in.next();
        }
        return in.nextInt();
    }

    public static void main(String[] args)
    {
        int b, sum = 1;
        int a = (int)(Math.random() * MAX);
        Scanner in = new Scanner(System.in);

        System.out.println("Ваша задача угадать число от 0 до " + MAX);
        while ((b = readInt(in)) != a) {
//            System.out.println(a > b
//                    ? ANSI_RED + "Мое число больше" + ANSI_RESET
//                    : ANSI_RED + "Мое число меньше" + ANSI_RESET);
            int abs =  Math.abs(a-b);

            if      (abs < 3)  System.out.println("Огонь!");
            else if (abs < 10)  System.out.println("Пекло");
            else if (abs < 40)  System.out.println("Пустыня");
            else if (abs < 70)  System.out.println("Холодно!");
            else if (abs < 100) System.out.println("Антарктида");

            sum++;
        }

        System.out.println(ANSI_CYAN + "CONGRATULATION!" + ANSI_RESET);
        System.out.println( ANSI_BLUE + "Количество попыток: " + sum);
    }
}
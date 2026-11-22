package l2.h2;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        while (true) {
            printMenu();
            
            String choice = scan.next();
            if (choice.equals("end")) {
                break;
            }

            switch(choice) {
                case "1": 
                    compare();
                    break;
                case "2": 
                    round();
                    break;
                case "3": 
                    discardFractionalPart();
                    break;
                default: 
                    System.out.println("Неизвестная операция");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println(
            "\nОперации над double/float\n" +
            "1. Сравнить\n" +
            "2. Округлить\n" +
            "3. Отбросить дробную часть"
        );
    }

    private static void compare() {
        System.out.println("Введите первое число (double)");
        double a = scan.nextDouble();
        System.out.println("Введите второе число (float)");
        float b = scan.nextFloat();

        if (a > b) {
            System.out.println("Первое (" + a + ") число больше второго (" + b + ")");
        } else if (a < b) {
            System.out.println("Второе (" + b + ") число больше первого (" + a + ")");
        } else {
            System.out.println("Они равны");
        }
        
    };
    
    private static void round() {
        System.out.println("Введите число (double)");
        double a = scan.nextDouble();
        double result = Math.round(a * 100.0) / 100.0;
        System.out.println(result);
    }

    private static void discardFractionalPart() {
        System.out.println("Введите число (double)");
        int a = (int) scan.nextDouble();
        System.out.println(a);
    }
}

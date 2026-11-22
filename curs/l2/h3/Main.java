package l2.h3;

import java.util.Scanner;

public class Main {
    public static final Scanner scan = new Scanner(System.in);
    private static Product[] arr = new Product[3]; 
    
    public static void main(String[] args) {
        while (true) {
            printMenu();
           
            String choice = scan.next();
            if (choice.equals("end")) {
                if (arr[0] != null) {
                    printBasket();
                }
                break;
            }

            int quantity = scan.nextInt();
            if (quantity < 0) {
                System.out.println("Количество не может быть отрицательным! ");
                continue;
            }
            
            switch (choice) {
                case "1":
                    addProduct(0, "Молоко", quantity, 50);
                    break;
                case "2":
                    addProduct(1,"Хлеб",  quantity, 14);
                    break;
                case "3":
                    addProduct(2,"Гречневая крупа", quantity, 80);
                    break;
                default:
                    System.out.println("Неизвестная операция.");
                    break;
            }
        }
    }

    private static void addProduct(int index, String name, int quantity, int price) {
        Product product = new Product();
        product.price = price * quantity;
        product.name = name;
        product.quantity = quantity;
        arr[index] = product; 
    }   

    private static void printMenu() {
        System.out.println(
            "\nСписок возможных товаров для покупки" +
            "\n1. Молоко 50 руб/шт" +
            "\n2. Хлеб 14 руб/шт" +
            "\n3. Гречневая крупа 80 руб/шт"
        );
    };

    private static void printBasket() {
        System.out.println("\nВаша корзина:");
        int total = 0;
        for (int i = 0; i < 3; i ++ ) {
            if (arr[i] != null) {
                System.out.println(arr[i].name+": " + arr[i].quantity + "шт. " + arr[i].price + " руб");
                total += arr[i].price;
            }
        }
        System.out.println("Итого: " + total + " рублей");
    }
}

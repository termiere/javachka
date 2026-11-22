package l2.h1;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double profit = 0;
        double expenses = 0;
        
        while (true) {
            printMenu();
            
            String choice = scan.next();
            if (choice.equals("end")) {
                break;
            }

            switch (choice) {
                case "1":
                    profit += addProfit(); 
                    break;
                case "2":
                    expenses += addExpenses(); 
                    break;
                case "3":
                    selectTax(profit, expenses);
                    break;
                default:
                    System.out.println("Неизвестная операция");
            }
        }
    }

    private static void printMenu() {
        System.out.println(
            "\nВыберите операцию и введите её номер\r\n" +
            "1. Добавить новый доход\r\n" +
            "2. Добавить новый расход\r\n" +
            "3. Выбрать систему налогообложения\r"
        );
    }

    private static double addProfit() {
        System.out.println("Введите сумму дохода:");
        return scan.nextDouble();
    };

    private static double addExpenses() {
        System.out.println("Введите сумму расхода:");
        return scan.nextDouble();
    };
    
    private static void selectTax(double profit, double expenses) {
        double ProfitTax = 0.06 * profit;
        double ProfitMinusExpensesTax  = 0.15 * (profit - expenses);
        
        double bestTax = Math.min(ProfitTax, ProfitMinusExpensesTax);
        double worseTax = Math.max(ProfitTax, ProfitMinusExpensesTax);
        
        double economy = worseTax - bestTax;
        
        if (ProfitTax <= ProfitMinusExpensesTax) {
            System.out.println("Мы советуем вам УСН доходы");
        } else {
            System.out.println("Мы советуем вам УСН доходы минус расходы");
        }
        
        System.out.println("Ваш налог составит: " + bestTax + " рублей");
        System.out.println("Налог по другой системе: " + worseTax + " рублей");
        System.out.println("Экономия: " + economy + " рублей");
    }
}

package l1.h2;
import static java.lang.Math.PI;

public class Main {
    private static double pow(double number, int n) {
        double result = 1;
        for (int i = 0; i < n; i ++) {
            result *= number;
        }
        return result;
    } 

    public static double toCutOffPiece(int peopleCount, double diameter) {
        try {
            if (peopleCount < 0 || diameter <= 0 ) {
                System.out.println("peopleCount должен быть > 0");
                return -1;
            }

            if (peopleCount == 0) {
                return PI * pow(diameter, 2) / (4);
            }

            double result = PI * pow(diameter, 2) / (4 * peopleCount);
            return result;

        } catch(Exception e) {
            System.out.println(e);
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Площадь кусочков для 2 людей: " + toCutOffPiece(2, 10.0));
    }
}

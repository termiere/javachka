package l1.h1;

public class Main {
    static double e = 0.0001;

    public static double abs(double n1, double n2) {
        double abs = n1 - n2;
        if (abs < 0) {
            return -(abs);
        }
        return abs;
    }
    
    public static double deg(double num, int n) {
        double result = 1.0;
        for (int i = 0; i < n; i ++) {
            result *= num;
        }
        return result;
    }

    public static double sqrt(int num, int n) {
        double x_n = num;
        double x_next = 0;

        while (abs(x_next, x_n) >= e) {
            x_next = 1.0/n * ((n-1) * x_n + (double) num / deg(x_n, n - 1));
            
            double temp = x_n;
            x_n = x_next;
            x_next = temp;
        };
        
        return x_next;
    }
    
    public static void main(String[] args) {
        int number = 9;
        System.out.println(sqrt(number, 2));
    }
}

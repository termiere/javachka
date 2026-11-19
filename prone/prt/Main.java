package prone.prt;
import java.util.Date;

public class Main {
    public static int getPseudorandom() {
        Date date = new Date();
        long time = date.getTime() % 100;
        return (int) time;
    } 

    public static void main(String[] args) {
        System.out.println(getPseudorandom());
    }
}

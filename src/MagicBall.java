import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Enter your question");

        Scanner scan = new Scanner(System.in);
        scan.next();
        scan.close();

        Random rand = new Random();

        int r = rand.nextInt(5);

        if (r == 0) {
            System.out.println("Find out yourself!");
        } else if (r == 1) {
            System.out.println("Yes");
        } else if (r == 2) {
            System.out.println("No");
        } else if (r == 3) {
            System.out.println("Absolutely");
        } else if (r == 4) {
            System.out.println("Maybe");
        }
    }
}

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        boolean fl = true;
        while (a > 0) {
            if (a % 10 == 0 && fl) {
                a /= 10;
                continue;
            } else if (fl) {
                fl = false;
                System.out.print(a % 10);
            } else {
                System.out.print(a % 10);
            }
            a /= 10;
        }
    }
}
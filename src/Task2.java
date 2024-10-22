import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = "";
        int c = 1;

        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                c++;
            } else {
                b += a.charAt(i - 1)  +""+ c;
                c = 1;
            }
        }

        if (a.length() > 0) {
            b += a.charAt(a.length() - 1)+""  + c;
        }

        System.out.print(b);
    }
}
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c;
        while (b!=0){
            c = (a&b)<<1;
            a = a^b;
            b = c;
        }
        System.out.print(a);
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        n=n.toLowerCase();
        char[] a = new char[n.length()];
        String n1 = in.nextLine();
        n1=n1.toLowerCase();
        char[] a1 = new char[n1.length()];
        if(n1.length()== n.length()) {
            for (int i = 0; i < n.length(); i++) {
                a[i] = n.charAt(i);
            }
            for (int i = 0; i < n1.length(); i++) {
                a1[i] = n1.charAt(i);
            }
            Arrays.sort(a);
            Arrays.sort(a1);
            boolean fl=true;
            for (int i = 0; i < n.length(); i++) {
                if(a1[i]!=a[i]){
                    fl=false;
                    break;
                }
            }
            if(fl){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
        } else{
            System.out.println("No");
        }
    }
}
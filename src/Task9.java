import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int[] a = new int[10];
        char[] c = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            c[i]=s.charAt(i);
            a[c[i]-48]++;
        }
        rec(a,"",s.length());
    }

    public static void rec(int[] a, String res, int left) { // Обожаю (нет) рекурсии х2
        if (left==0) {
            System.out.println(res);
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (a[i]>0) {
                if (left!=a.length && (i!=0 || res.length()>0)) {
                    a[i]--;
                    rec(a,res+i,left-1);
                    a[i]++;
                }
            }
        }
    }
}
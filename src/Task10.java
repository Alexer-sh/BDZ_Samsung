import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {// Ура, мне хоть для чего-то понадобилась z-функция с уроков информатики!
        Scanner in = new Scanner(System.in);// Я уж думал, что она совсем бесполезная

        String s = in.next();
        String t = in.next();
        int n = t.length();
        t += s;
        int[] z = new int[t.length()];
        int l = 0, r = 0;
        for (int i = 1; i < t.length(); ++i) {
            if (i <= r) {
                z[i] = Math.min(r - i + 1, z[i - l]);
            }
            while (i + z[i] < t.length() && t.charAt(z[i]) == t.charAt(i + z[i])) {
                ++z[i];
            }
            if (i + z[i] - 1 > r) {
                l = i;
                r = i + z[i] - 1;
            }
        }
        boolean fl=false;
        for (int i = n; i < t.length(); i++) {
            if (z[i] >= n) {
                fl = true;
                System.out.print(i - n + " ");
            }
        }
        if(!fl) System.out.println(-1);
    }
}
import java.util.Scanner;
import static java.lang.Math.max;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(j<=i) a[i][j] = in.nextInt();
            }
        }
        for (int i=n-2;i>=0;i--){
            for (int j=0;j<n;j++){
                if(j<=i) a[i][j] += max(a[i+1][j],a[i+1][j+1]);
            }
        }
        System.out.print(a[0][0]);
    }
}
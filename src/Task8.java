import java.util.Scanner;

public class Task8 {
    public static char[] a={'A','B','C'};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        rec(n,0,2,1);
    }
    public static void rec(int n,int from,int to,int temp) { //Обожаю (нет) рекурсию
        if (n>0){
            rec(n-1,from,temp,to);
            System.out.println("Move disk "+n+" from "+a[from]+" to "+a[to]);
            rec(n-1,temp,to,from);
        }
    }
}
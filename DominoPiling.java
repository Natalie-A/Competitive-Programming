import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m,n;
        Scanner obj = new Scanner(System.in);
        m = obj.nextInt();
        n = obj.nextInt();
        System.out.println(dominoPiling(m,n));
    }
    public static int dominoPiling(int m,int n){
        int ans =0;
        ans = (m*n)/2;
        return ans;
    }
}
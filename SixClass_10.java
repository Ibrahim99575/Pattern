import java.util.*;
public class SixClass_10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        //Upper half
        for(int i=1;i<=n;i++) {
            //Print *
            for(int j=1;j<=i;j++) {
                if (j==1 || j==i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            //Print space
            int m = 2*(n-i);
            for (int k=1;k<=m;k++) {
                System.out.print("  ");
            }
            //Print *
            for(int j=1;j<=i;j++) {
                if (j==1 || j==i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //Lower half
        for(int i=n;i>=1;i--) {
            //Print *
            for(int j=1;j<=i;j++) {
                if (j==1 || j==i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            //Print space
            int m = 2*(n-i);
            for (int k=1;k<=m;k++) {
                System.out.print("  ");
            }
            //Print *
            for(int j=1;j<=i;j++) {
                if (j==1 || j==i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
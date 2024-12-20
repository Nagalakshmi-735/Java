import java.io.*;
import java.util.*;
public class DiagonalElements{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        if (r!=c) {
            System.out.println("Addition not possible.");
            System.exit(0);
        } else {
            int a[][] = new int[r][c];
            System.out.println("Enter " + (r* c) + " elements into the matrix a:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            int sum=0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if(i==j){
                        sum=sum+a[i][j];
                    }
                }
            }
            System.out.println("The elements of the matrix are");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
             System.out.println("Sum of principal diagonal elements is "+sum);
        }
     }
}

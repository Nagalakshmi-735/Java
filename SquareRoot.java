import java.util.Scanner;
 public class Main
{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number to find square root: ");
    int x = in.nextInt();
    System.out.println("x value is " + x);
    System.out.println(Math.sqrt(x));            
    in.close();  
}
}


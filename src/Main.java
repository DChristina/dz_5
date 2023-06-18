import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter 4 integers, after each entry press Enter.");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int sum1 = a + b;
        int sum2 = c + d;

        System.out.println("First sum bigger than second?  Answer:" + (sum1>sum2));

        sum1++;
        sum2 = sum2 -2;
        System.out.println("After increasing sum1 by one and reducing sum2 by two, first sum bigger than second?  Answer:" + (sum1>sum2));
        System.out.println( "At list one sum is multiple of two?. Answer:" + (sum1%2==0||sum2%2==0));

    }
}

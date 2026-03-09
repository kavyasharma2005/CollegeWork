import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers to find the maximum:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a>b ? (a>c ? a : c) : (b>c ? b : c);
        System.out.println("Maximum of " + a + ", " + b + ", and " + c + " is: " + max);
    }
}
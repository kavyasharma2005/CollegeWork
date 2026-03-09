import java.util.Scanner;
public class maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,max=0;
        System.out.print("Enter the first number: ");
        a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        c = scanner.nextInt();
         max = a>b ? (a>c ? a :c) : (b>c ? b : c);
        System.out.println("The maximum number is: " + max);
    }
}
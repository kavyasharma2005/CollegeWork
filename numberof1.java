import java.util.Scanner;
public class numberof1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int count = 0;
        while (n != 0) 
        {
            count =count+ n & 1;
            n=n >> 1;
        }
        System.out.println("Number of 1s in binary representation: " + count);
    }
}
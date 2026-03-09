import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,x,rev=0,d;
        System.out.println("Enter a number to reverse:");
        num=sc.nextInt();
        x=num;
        while(x>0) {
            d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        System.out.println("Reversed number: " + rev);
    }
}
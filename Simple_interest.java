import java.util.Scanner;
class Simple_interest {
    void main() 
    {
        Scanner sc=new Scanner(System.in);
        int si=0;
        int p,r,t;
        System.out.println("Enter the principal amount, rate of interest and time");
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        System.out.println("Simple Interest is: "+(si=(p*r*t)/100));
    }
    
}
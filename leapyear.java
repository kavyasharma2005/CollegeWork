import java.util.Scanner;
public class leapyear {
    void main(){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0))
            System.out.println("Yes");
            else
            System.out.println("no");

        
    }
}

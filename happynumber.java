import java.util.Scanner;
public class happynumber 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        while(num!=4 && num!=1)
        {
            sum=0;
            while(num>0)
            {
                int d=num%10;
                sum+=d*d;
                num=num/10;
            }
            num=sum;
        }
        if(sum==1)
        {
            System.out.println(n+" is a happy number");
        }
        else
        {
            System.out.println(n+" is not a happy number");
        }
    }
}
        
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int num=0;
        int num1=0;
        int digits=0;
        for(int i=1;i<=n;i++)
        {
            num=i;
            digits=0;
            sum=0;
        while(num>0)
        {
            num/=10;
            digits++;
        }
        num1=i;
        while(num1>0)
        {
            int r=num1%10;
            sum+=Math.pow(r,digits);
            num1/=10;
        }
        if(sum==i)
            System.out.println(i);
        }
        
    }
    
}

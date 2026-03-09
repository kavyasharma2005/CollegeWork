import java.util.*;
class robinson
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        int num=i;
        int sum=0;
        while(num!=0)
        {
            int d=num%10;
            num=num/10;
            sum=sum+fact(d);
        }
        if(sum==i)
        System.out.println(sum);
    }
    }
    static int fact(int n)
    {
        if(n==0 || n==1)
            return 1;
        else 
            for(int i=n-1;i>0;i--)
        {
            n=n*i;
        }
        return n;
    }
}
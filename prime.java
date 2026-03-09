import java.util.Scanner;
public class prime 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        boolean c=true;
        int n=sc.nextInt();
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                c=false;
            }
        }
        if(c)
            System.out.println(n+" is a prime number.");
        else
            System.out.println(n+" is not a prime number.");
    int m=sc.nextInt();
    int count=0;
     c=true;
    for(int i=n;i<=m;i++)
    {
        c=true;
        for(int j=2;j<=Math.sqrt(i);j++)
        {
            if(i%j==0)
            {  
                c=false;
                break;
            }
        }
        if(c)
        {
            System.out.println(i);
        count++;
        }
    }
    System.out.println("Total prime numbers between "+m+" and "+n+" are: "+count);
}
}

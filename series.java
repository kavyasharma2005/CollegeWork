import java.util.Scanner;
class series 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            double s=Math.pow(x,i)/fact(i);
            System.out.println(s+"+");
        }
    } 
    }
     static int fact(int i)
        {
            if(i==0||i==1)
            {
                return 1;
            }
            else
            {
                return i*fact(i-1);
            }
}

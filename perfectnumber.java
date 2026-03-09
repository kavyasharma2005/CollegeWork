import java.util.Scanner;
public class perfectnumber 
{
    void main()
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<n;i++)
    {
        if(n%i==0)
        {
            sum+=i;
        }
    }
    if(sum==n)
    {
        System.out.println(n+" is a perfect number");
    }
    else
    {
        System.out.println(n+" is not a perfect number");
    } 
}
}

import java.util.*;
public class Singlenumber 
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int result=0,count=0;
        for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(a[i]==a[j])
                    {
                        a[i]=0;
                        a[j]=0;
                        count++;
                    }
                    else if(count==0 && j==n-1)
                    {
                        result=a[i];
                    }
                }
            }
        System.out.println("The single number is: "+result);
        }
}

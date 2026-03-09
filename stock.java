import java.util.Scanner;
public class stock 
{
    void main()
    {
        int i,j,n,dif=0,maxprf=0;
        System.out.println("Enter the number of stocks:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the prices of stocks:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                dif=arr[j]-arr[i];
                if(dif>maxprf)
                {
                    maxprf=dif;
                    dif=0;
                }
            }
        }
     System.out.println("Maximum profit is: "+maxprf);
    }
}

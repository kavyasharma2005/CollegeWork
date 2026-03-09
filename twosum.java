import java.util.*;
public class twosum
{
    int i,j,taregt,sum=0;
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        taregt=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                sum=arr[i]+arr[j];
                if(sum==taregt)
                {
                    System.out.println("Indices of elements whose sum is equal to target are: "+i+" and "+j);
                }
            }
        }
    }
    
}

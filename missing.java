
import java.util.*;
public class missing {
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
        int sum=(n*(n+1))/2;
        int actual_sum=0;
        for(int i=0;i<n;i++)
        {
            actual_sum+=a[i];
        }
        System.out.println("Missing number is: "+(sum-actual_sum));
    }
}

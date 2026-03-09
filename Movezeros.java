import java.util.*;
public class  Movezeros 
{
    public static void main()
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
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(a[j]!=0)
                    {
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                        break;
                    }
                }
            }
            
        }
        System.out.println("Array after moving zeros to the end:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
    
}

public class fibonaccipattern {
    public static void main(String[] args)
    {
        int a=1,b=1,c=0;
        System.out.println(0);
        System.out.println(1+" "+1);
        for(int i=3;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
            
            }
          
            System.out.println();
        }
    }
}

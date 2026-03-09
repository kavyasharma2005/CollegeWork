public class primepostionsum {
    public static void main()
    {
        int n=1234567;
        int d;
        int sum=0;
        while(n>0)
        {
            d=n%10;
            sumofprime(n,d);
            n=n/10;
        }
        System.out.print(sum);
    }
    static int sumofprime(int n,int d)
    { 
        boolean isprime=true;
        int sum=0;
        for(int i=2;i<=n;i++)
        {
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                isprime=false;
                break;
                }
            }
            if(isprime)
            {
                sum=sum+d;
            }
        }
return sum;
    }
    
}

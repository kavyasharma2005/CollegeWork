public class reverse3 
{
    public static void main()
    {
        int num=12345,count=0;
        int n=num;
        while(num>0)
        {
            num=num/10;
            count++;
        }
        while(n>0)
        {
            int d=n/(int)Math.pow(10,count-1);
            n=n%(int)Math.pow(10,count-1);
            System.out.println(d);
            count--;
        }
    }
    
}

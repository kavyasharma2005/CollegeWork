public class evenreplacement 
{
  public  void main()
  {
    int n=1234567,num=n,count=0;
    int rev=0,d=0,i=0;
    {
        while(n>0)
        {
            d=n%10;
            if(d%2==0)
            {
            rev=rev*10+d;
            }
            n=n/10;
            count++;
        }
        while(i<count)
        {
           d=num%10;
            if(d%2==0)
            {
                n=n*10+(rev%10);
                rev=rev/10;
            }
            else
            {
                n=n*10+d;
            }
            num=num/10;
            i++;
        }
        while(n>0)
        {
            rev=rev*10+(n%10);
            n=n/10;
        }
        System.out.println(rev);
    }
  }
}
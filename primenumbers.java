public class primenumbers 
{
    void main()
    {
        int n=9;
        boolean c=true;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {  
                    c=false;
                    break;
                }
            }
        }
        if(c)
        {
            System.out.println(n+" is a prime number.");
        }
        else
        {
            System.out.println(n+" is not a prime number.");
        }
    }
    
}

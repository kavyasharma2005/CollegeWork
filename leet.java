public class leet {
    public int countEven(int num) 
    {
        int i=0,count=0,d=0,sum=0;
        while(i<=num)
        {
            i++;
            while(i!=0)
            {
                d=i%10;
                sum+=d;
                i=i/10;
            }
            if(sum%2==0)
            count++;
        }
        return count++;
    }
    int main()
    {
        leet obj=new leet();
        int result=obj.countEven(4);
        System.out.println(result);
    }
}


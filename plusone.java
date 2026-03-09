public class plusone 
{
    int [] plusOne(int[] digits) {
    int i,j,size=digits.length,count=0,c=0;
    while(c!=size-1)
        {
            if(digits[i]==9)
            count++;
            c++;
        }
        if(count==size-1)
        {
            int a[]=new int[size+1];
            a[0]=1;
            return a;
        }
        else
        {
            for(i=size-1;i>=0;i--)
            {
                if(digits[i]==9)
                digits[i]=0;
                else
                {
                    digits[i]++;
                    break;
                }
            }
        }
    }
}

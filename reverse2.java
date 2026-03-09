import java.util.Scanner;
public class reverse2  
    {
        public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(reverse(n));
      sc.close();
    }
    static int reverse(int x)
    {
        int d;
        long rev=0;
        while(x!=0)
        {
            d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        else return (int) rev;
    }
}

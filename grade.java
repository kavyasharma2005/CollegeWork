
import java.util.Scanner;
public class grade 
{
    void main()
    {
    Scanner sc=new Scanner(System.in); 
   double amarks;
   int m1,m2,m3,m4,m5;
    void input()
         System.out.println("Enter marks of 5 subjects:");
         m1=sc.nextInt();
         m2=sc.nextInt();
         m3=sc.nextInt();
         m4=sc.nextInt();
         m5=sc.nextInt();
         amarks=(m1+m2+m3+m4+m5)/5.0;
         if(amarks>=90)
            System.out.println("A+");
            else if(amarks>=80 && amarks<90)
                System.out.println("A");
                else if(amarks>=70 && amarks<80)
                    System.out.println("B");
                    else if(amarks>=60 && amarks<70)
                        System.out.println("C");
                        else if(amarks>=50 && 
                            System.out.println("");
    }
}

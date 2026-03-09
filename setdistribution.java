import java.util.*;
public class setdistribution {
    void main () 
    {
        int students,i,j,set,roll;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        students=sc.nextInt();
        System.out.println("Enter the number of sets:");
        set=sc.nextInt();
        System.out.println("Enter the roll numbers of student:");
        roll=sc.nextInt();
        if(roll%set==0)
        {
            System.out.println("The set distributed to student with roll number is :"+set);
        }
        else
        System.out.println("The set distributed to student with roll number is :"+(roll%set)); 
    }

    
}

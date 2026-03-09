import java.util.Scanner;
public class BusFare
{
    int main()
    {
    int distance;
    Double fare,oc=0.0,st=0.0,bf=50.0,totalfare;
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance travelled in km:");
        distance=sc.nextInt();
        if(distance>0 && distance<=5)
        {
            fare=distance*12.0;
        }
        else if(distance>5 && distance<=20)
        {
            fare=60.0+(distance-5)*10.0;
        }
        else if(distance>20 && distance<=50)
        {
            fare=+60.0+150.0+(distance-20)*8.0;
        }
        else 
            {
            fare=+60.0+150.0+240.0+(distance-50)*6.0;
            }
        if(distance>10)
        {
            oc=(fare*20)/100;
        }
        st=(fare*5)/100;
        totalfare=fare+oc+st+bf;
        System.out.println("The total bus fare is:"+totalfare);
    }
    return 0;

    }
}
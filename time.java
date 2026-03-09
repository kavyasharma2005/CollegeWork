import java.util.Scanner;
public class time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time in seconds: ");
        int seconds = scanner.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;
        System.out.println("Time is " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
    }
}
import java.util.Scanner;
public class letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);
        if("aeiouAEIOU".indexOf(ch) != -1) {
            System.out.println(ch + " is a vowel.");
        }
         else {
            System.out.println(ch + " is a consonant.");
        }
    }
}
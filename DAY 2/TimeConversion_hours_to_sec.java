import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hours = sc.nextInt();
        int seconds = hours * 60 * 60;
        System.out.println("Seconds: " + seconds);
        sc.close();
    }
}

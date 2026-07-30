import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		if(age>=18)
		{
		    System.out.println("You're Eligible to vote");
		}
		else
		{
		    System.out.println("You're not Eligible to vote");
		}
	}
}

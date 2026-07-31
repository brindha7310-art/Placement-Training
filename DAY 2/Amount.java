import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        double amount = price * quantity;
        System.out.println("Total Amount = " + amount);
        sc.close();
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
         System.out.print("Enter a Range:");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            System.out.println(i+"*"+n+"="+(i*n));
        }
    }
}

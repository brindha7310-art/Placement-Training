import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Range:");
        int range = sc.nextInt();
        for(int itr=1;itr<=range;itr++)
        {
            int rem,rev=0;
            int N=itr;
            int temp=itr;
            while(N!=0)
            {
                rem=N%10;
                rev=rev*10+rem;
                N=N/10;
            }
            if(rev==temp)
            {
                System.out.print(temp+"");
            }
        }
	}
}

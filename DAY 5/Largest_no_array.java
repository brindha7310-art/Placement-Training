public class Main 
{
    public static void main(String[] args) 
    {
        int[] arr = {10,49,56,43,21};
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
           if(arr[i]>largest)
           {
               largest = arr[i];
           }
        }
        System.out.println("Largest element = " + largest);
    }
}

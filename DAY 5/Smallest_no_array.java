public class Main 
{
    public static void main(String[] args) 
    {
        int[] arr = {10,49,56,43,21};
        int smallest = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
           if(arr[i]<smallest)
           {
               smallest = arr[i];
           }
        }
        System.out.println("Smallest element = " + smallest);
    }
}

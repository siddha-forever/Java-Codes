import java.util.*;

public class Main 
{
    public static void freq(int array[]) 
    {
        Arrays.sort(array);

        int currentNum = array[0];
        int count = 0;

        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] == currentNum) 
            {
                count++;
            } else 
            {
                System.out.print(count + " ");
                currentNum = array[i];
                count = 1;
            }
        }

        System.out.print(count);
    }

    public static void main(String[] args) 
    {
        Scanner ns = new Scanner(System.in);
        int len = ns.nextInt();
        int arr[] = new int[len + 1];
        arr[0] = 0;
        for (int i = 1; i < len + 1; i++) 
        {
            arr[i] = ns.nextInt();
        }
        freq(arr);

        ns.close();
    }
}
                                                                                                                            

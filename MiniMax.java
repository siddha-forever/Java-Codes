import java.util.Arrays;
import java.util.Scanner;

public class MiniMax {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        long arr[] = new long[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = ns.nextLong();
        }
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        long min = 0;
        long max = 0;
        min = arr[0] + arr[1] + arr[2] + arr[3];
        max = arr[2] + arr[3] + arr[4] + arr[5];
        System.out.println(min + ", " + max);

        ns.close();
    }
}

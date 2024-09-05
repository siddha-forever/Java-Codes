import java.util.Arrays;
import java.util.Scanner;

public class ClosestTriplets {

    public static void returnSum(int arr[], int target) {
        Arrays.sort(arr);

        int closetSum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int currSum = arr[i] + arr[left] + arr[right];
                int currDiff = Math.abs(currSum - target);

                if (currDiff < minDiff) {
                    minDiff = currDiff;
                    closetSum = currSum;
                }

                if (currSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(closetSum);

    }

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        String input = ns.nextLine();
        String[] digitStrings = input.split(" ");

        // Converting each digit string to an integer
        int[] data = new int[digitStrings.length - 1];
        for (int i = 0; i < digitStrings.length - 1; i++) {
            data[i] = Integer.parseInt(digitStrings[i]);
        }
        // System.out.println(Arrays.toString(digitStrings));
        // System.out.println(Arrays.toString(data));
        // int t = Integer.parseInt(input.charAt(input.length() - 1));
        char ch = input.charAt(input.length() - 1);
        int t = ch - '0';
        // System.out.println(t);
        returnSum(data, t);

        ns.close();
    }
}

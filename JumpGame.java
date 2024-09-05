import java.util.Scanner;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                // If the current index is unreachable from the current maxReach, return false
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);

            if (maxReach >= nums.length - 1) {
                // If the maxReach is greater than or equal to the last index, return true
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // int[] nums = { 3, 2, 4, 0, 0, 7 };
        Scanner ns = new Scanner(System.in);
        String input = ns.nextLine();
        String[] digitStrings = input.split(" ");

        // Converting each digit string to an integer
        int[] nums = new int[digitStrings.length - 1];
        for (int i = 0; i < digitStrings.length - 1; i++) {
            nums[i] = Integer.parseInt(digitStrings[i]);
        }
        boolean result = canJump(nums);
        System.out.println(result); // Output: true
    }
}

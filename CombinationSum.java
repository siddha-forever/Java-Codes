import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<List<Integer>>> dp = new ArrayList<>();

        // Initialize dp list
        for (int i = 0; i <= target; i++) {
            dp.add(new ArrayList<>());
        }

        // Seed for target = 0 (empty combination)
        dp.get(0).add(new ArrayList<>());

        // Iterate through candidates and build combinations iteratively
        for (int candidate : candidates) {
            for (int currentTarget = candidate; currentTarget <= target; currentTarget++) {
                for (List<Integer> combination : dp.get(currentTarget - candidate)) {
                    List<Integer> newCombination = new ArrayList<>(combination);
                    newCombination.add(candidate);
                    dp.get(currentTarget).add(newCombination);
                }
            }
        }

        return dp.get(target);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // // Input array
        // System.out.print("Enter the number of elements in the array: ");
        // int n = scanner.nextInt();
        // int[] candidates = new int[n];
        // System.out.println("Enter the elements of the array:");
        // for (int i = 0; i < n; i++) {
        // candidates[i] = scanner.nextInt();
        // }

        // // Target value
        // System.out.print("Enter the target value: ");
        // int target = scanner.nextInt();

        String input = scanner.nextLine();
        int target = scanner.nextInt();
        String[] digitStrings = input.split(" ");

        // Converting each digit string to an integer
        int[] candidates = new int[digitStrings.length - 1];
        for (int i = 0; i < digitStrings.length - 1; i++) {
            candidates[i] = Integer.parseInt(digitStrings[i]);
        }

        // Output
        List<List<Integer>> result = combinationSum(candidates, target);
        // System.out.println("The unique combinations are: " + result);
        System.out.println(result);

        scanner.close();
    }
}

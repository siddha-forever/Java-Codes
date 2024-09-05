import java.util.*;

public class SortingColors {

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        // Accepting the input as a string
        String inputString = ns.nextLine();

        // Split the input string into an array of strings
        String[] digitStrings = inputString.split(" ");

        // Converting each digit string to an integer
        int[] data = new int[digitStrings.length];
        for (int i = 0; i < digitStrings.length; i++) {
            data[i] = Integer.parseInt(digitStrings[i]);
        }

        // System.out.println(Arrays.toString(data));

        // bubble sort
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // swap
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        // print the sorted array
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        ns.close();
    }
}

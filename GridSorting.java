import java.util.Arrays;
import java.util.Scanner;

public class GridSorting {

    public static String checkGridSorting(int rows, int cols, String[] grid) {
        // Rearrange elements in each row in ascending alphabetical order
        for (int i = 0; i < rows; i++) {
            char[] rowChars = grid[i].toCharArray();
            Arrays.sort(rowChars);
            grid[i] = new String(rowChars);
        }

        // Check if the columns are in ascending alphabetical order
        for (int j = 0; j < cols; j++) {
            for (int i = 1; i < rows; i++) {
                if (grid[i].charAt(j) < grid[i - 1].charAt(j)) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        int rec = ns.nextInt();
        int row = ns.nextInt();
        int cols = ns.nextInt();

        String grid[] = new String[row];
        for (int i = 0; i < row; i++) {
            grid[i] = ns.next();
        }

        System.out.println(checkGridSorting(row, cols, grid));

        ns.close();
    }
}

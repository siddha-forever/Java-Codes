import java.util.Scanner;

public class Main {
    static int n, m;

    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (backtrack(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean backtrack(char[][] board, String word, int i, int j, int k) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(k)) {
            return false;
        }

        if (k == word.length() - 1) {
            return true;
        }

        char tmp = board[i][j];
        board[i][j] = '/';
        boolean result = (backtrack(board, word, i + 1, j, k + 1) ||
                backtrack(board, word, i - 1, j, k + 1) ||
                backtrack(board, word, i, j + 1, k + 1) ||
                backtrack(board, word, i, j - 1, k + 1));
        board[i][j] = tmp;

        return result;
    }

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        m = ns.nextInt();
        n = ns.nextInt();
        char grid[][] = new char[m][n];
        String targetWord = ns.next();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = ns.next().charAt(0);
            }
        }

        boolean result = exist(grid, targetWord);
        System.out.println((result==true) ? "Yes" : "No");

        ns.close();
    }
}

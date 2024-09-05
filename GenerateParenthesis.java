import java.util.*;;

public class GenerateParenthesis {

    public static List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();

        if (n <= 0) {
            return result;
        }

        // Initialize the list with the first combination
        result.add("(");

        // Iteratively generate combinations
        for (int i = 1; i < 2 * n; i++) {
            List<String> temp = new LinkedList<>();
            for (String str : result) {
                int openCount = countOpen(str);
                int closeCount = i - openCount;

                // Add '(' if there are remaining open parentheses
                if (openCount < n) {
                    temp.add(str + "(");
                }

                // Add ')' if there are more open parentheses than close parentheses
                if (closeCount < openCount) {
                    temp.add(str + ")");
                }
            }
            result = temp;
        }

        return result;
    }

    private static int countOpen(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        int n = ns.nextInt();
        List<String> result = generateParenthesis(n);
        System.out.println(result);

        ns.close();// closing scanner class
    }
}

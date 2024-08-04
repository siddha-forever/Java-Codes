import java.util.Scanner;

public class TowerBreaker {

    public static int towerGameWinner(int n, int m) {
        // If there is only one tower, Player 1 wins regardless of the tower's height
        if (n == 1) {
            return 1;
        }

        // If the height of any tower is 1, Player 1 wins
        if (m == 1) {
            return 1;
        }

        // If the height of any tower is even, Player 2 wins
        if (m % 2 == 0) {
            return 2;
        }

        // Player 1 wins in all other cases
        return 1;
    }

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        int n = ns.nextInt();
        int m = ns.nextInt();

        System.out.println(towerGameWinner(n, m));

        ns.close();
    }
}

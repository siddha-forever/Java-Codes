import java.util.Scanner;

public class ReverseSen {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        String s = ns.nextLine();

        ReverseSen obj = new ReverseSen();
        obj.reverse(s);

        ns.close();
    }

    void reverse(String s) {
        String revString = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == ' ') {
            } else {
                revString = ch + revString;
            }
        }
        // System.out.println(revString);
        int j = 0;
        for (int i = 1; i < revString.length(); i++) {
            ch = s.charAt(i);
            // System.out.print(revString);
            System.out.print(revString.charAt(j));
            j++;
            if (ch == ' ') {
                System.out.print(" ");
            }
        }
    }
}

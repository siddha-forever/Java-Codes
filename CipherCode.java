import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CipherCode {

    public static String substitutionCipher(String word, Map<Character, Character> cipher) {
        StringBuilder encryptedWord = new StringBuilder();
        for (char ch : word.toCharArray()) {
            if (cipher.containsKey(ch)) {
                encryptedWord.append(cipher.get(ch));
            } else {
                encryptedWord.append(ch);
            }
        }
        return encryptedWord.toString();
    }

    public static String encryptWord(int key, String operation, String word) {
        if (!(key >= Integer.MIN_VALUE && key <= Integer.MAX_VALUE)) {
            return "Enter valid key";
        }

        if (!operation.equals("addition") && !operation.equals("subtraction")) {
            return "Invalid Operation";
        }

        if (word.equals(word.toLowerCase())) {
            return "Word should be in capitals";
        }

        Map<Character, Character> cipher = new HashMap<>();
        cipher.put('A', 'Z');
        cipher.put('B', 'Y');
        cipher.put('C', 'X');
        cipher.put('D', 'W');
        cipher.put('E', 'V');
        cipher.put('F', 'U');
        cipher.put('G', 'T');
        cipher.put('H', 'S');
        cipher.put('I', 'R');
        cipher.put('J', 'Q');
        cipher.put('K', 'P');
        cipher.put('L', 'O');
        cipher.put('M', 'N');
        cipher.put('N', 'M');
        cipher.put('O', 'L');
        cipher.put('P', 'K');
        cipher.put('Q', 'J');
        cipher.put('R', 'I');
        cipher.put('S', 'H');
        cipher.put('T', 'G');
        cipher.put('U', 'F');
        cipher.put('V', 'E');
        cipher.put('W', 'D');
        cipher.put('X', 'C');
        cipher.put('Y', 'B');
        cipher.put('Z', 'A');

        String encryptedWord = substitutionCipher(word, cipher);

        StringBuilder resultWord = new StringBuilder();
        for (char ch : encryptedWord.toCharArray()) {
            if (operation.equals("addition")) {
                resultWord.append((char) ((ch - 'A' + key) % 26 + 'A'));
            } else if (operation.equals("subtraction")) {
                resultWord.append((char) ((ch - 'A' - key + 26) % 26 + 'A'));
            }
        }

        return resultWord.toString();
    }

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter key: ");
        int key = ns.nextInt();
        System.out.println("Enter operation: ");
        String opp = ns.next();
        System.out.println("Enter word: ");
        String word = ns.next();
        System.out.println(encryptWord(key, opp, word));

        ns.close();
    }
}

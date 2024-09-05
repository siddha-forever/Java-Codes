import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        String input = ns.next();

        convert(input);// calling the function to find out the value
        ns.close();// closing the scanner
    }

    public static void convert(String s) {
        int result = 0; // initial Value

        // iterating through the romal string
        for (int i = 0; i < s.length(); i++) {
            int currVal = getVal(s.charAt(i));

            // checking for previous character
            if (i < s.length() - 1 && currVal < getVal(s.charAt(i + 1))) {
                result -= currVal;
            } else {
                result += currVal;
            }
        }

        System.out.println(result);
    }

    public static int getVal(char romVal) {
        // assigning default values
        switch (romVal) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; // invalid case

        }
    }
}

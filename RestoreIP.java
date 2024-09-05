import java.util.*;

public class RestoreIP {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter IP address: ");
        String input = ns.next();
        restoreIPAddresses(input, 0, "");

        ns.close();
    }

    private static void restoreIPAddresses(String s, int segment, String current) {
        if (segment == 4) {
            if (s.isEmpty()) {
                System.out.println("Update/Corected IP Address(s): ");
                System.out.print(current.substring(1) + " "); // Remove the leading dot
            }
            return;
        }

        for (int i = 1; i <= Math.min(3, s.length()); i++) {
            String part = s.substring(0, i);

            if (isValidPart(part)) {
                restoreIPAddresses(s.substring(i), segment + 1, current + "." + part);
            }
        }
    }

    private static boolean isValidPart(String part) {
        if (part.length() > 1 && part.charAt(0) == '0') {
            return false; // Leading zero is not allowed
        }

        int value = Integer.parseInt(part);
        return value >= 0 && value <= 255;
    }
}

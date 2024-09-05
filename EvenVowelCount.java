import java.util.*;

class EvenVowelCount {
    public static int findTheLongestSubstring(String s) {
        final String kVowels = "aeiou";
        int ans = 0;
        int prefix = 0; // binary prefix
        Map<Integer, Integer> prefixToIndex = new HashMap<>();
        prefixToIndex.put(0, -1);

        for (int i = 0; i < s.length(); ++i) {
            final int index = kVowels.indexOf(s.charAt(i));
            if (index != -1)
                prefix ^= 1 << index;
            prefixToIndex.putIfAbsent(prefix, i);
            ans = Math.max(ans, i - prefixToIndex.get(prefix));
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        String s = ns.next();

        System.out.println(findTheLongestSubstring(s));
        ns.close();
    }
}
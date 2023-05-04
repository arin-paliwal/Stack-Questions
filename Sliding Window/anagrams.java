import java.util.Arrays;

// Count Occurences of Anagrams
public class anagrams {
    public static int search(String s, String target) {
        int n = s.length();
        int k = target.length();

        if (n < k) {
            return 0;
        }

        int[] freqS = new int[26];
        int[] freqT = new int[26];

        // frequency arrays for first window
        for (int i = 0; i < k; i++) {
            freqS[s.charAt(i) - 'a']++;
            freqT[target.charAt(i) - 'a']++;
        }

        int count = 0;

        // Slide window and update frequency of arrays
        for (int i = k; i < n; i++) {
            if (Arrays.equals(freqS, freqT)) {
                count++;
            }

            freqS[s.charAt(i - k) - 'a']--;
            freqS[s.charAt(i) - 'a']++;
        }

        // Checking last window
        if (Arrays.equals(freqS, freqT)) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(search("forxxorfxdofr", "for"));
    }
}

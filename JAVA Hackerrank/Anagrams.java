import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int alen = a.length();
        int blen = b.length();
        if(alen != blen) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] charfreq = new int[26];

        for(int i = 0; i < alen; i++){
            char curr_char = a.charAt(i);
            int index = curr_char - 'a';
            charfreq[index]++;
        }
        for(int i = 0; i < blen; i++){
            char curr_char = b.charAt(i);
            int index = curr_char - 'a';
            charfreq[index]--;
        }

        for(int i = 0; i < 26 ; i++){
            if (charfreq[i] != 0) return false;
        }
        return true;

    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

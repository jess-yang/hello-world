import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Given a string S and a set of words D, find the longest word in D that is a subsequence of S.
//
// Word W is a subsequence of S if some number of characters, possibly zero, can be deleted from S to form W, without reordering the remaining characters.
//
// Note: D can appear in any format (list, hash table, prefix tree, etc.
//
// For example, given the input of S = "abppplee" and D = {"able", "ale", "apple", "bale", "kangaroo"} the correct output would be "apple"
//
// The words "able" and "ale" are both subsequences of S, but they are shorter than "apple".
// The word "bale" is not a subsequence of S because even though S has all the right letters, they are not in the right order.
// The word "kangaroo" is the longest word in D, but it isn't a subsequence of S.

public class subsequence {
    public static void main(String[] args) {
        List<String> test = Arrays.asList("able", "ale", "apple", "bale", "kangaroo");
        System.out.println(find("abppplee", test));
    }

    public static String find(String s, List<String> d) {
        ArrayList<String> valids = new ArrayList<String>();
        for (String word : d) {
            String sCopy = s;
            for (int i = 0; i < word.length(); i++) {
                char current = word.charAt(i);
                boolean used = true;
                if (sCopy.contains(String.valueOf(current))) {
                    int index = sCopy.indexOf(current);
                    sCopy = sCopy.substring(index+1);
                } else {
                    used = false;
                    break;
                }

            if (used) {
                valids.add(word);
            }
        }
    }
        int max = valids.get(0).length();
        String longest = valids.get(0);
        for (String valid : valids) {
            int temp = valid.length();
            if (temp > max) {
                max = temp;
                longest = valid;
            }

        }

        return longest;

}

}

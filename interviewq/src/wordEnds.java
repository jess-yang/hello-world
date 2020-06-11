public class wordEnds {
    /**
     * Question:
     * Given a string and a non-empty word string, return a string made of each char
     * just before and just after every appearance of the word in the string.
     * Ignore cases where there is no char before or after the word,
     * and a char may be included twice if it is between two words.
     * */
    public static void main (String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
   //"c13i"
        System.out.println(wordEnds("XY123XY", "XY"));
   //"13"
        System.out.println(wordEnds("XY1XY", "XY"));
   //"11"
    }

    /**
     * This method works by going through every letter of str to check for the word.
     * It stops iterating the length of the word away from the end (to avoid out of bounds)
     * Then it checks that the word is found.
     * If the word is found, it performs some boundary checks and appends the before and after to the return string
     * finally, the ret string is returned. */
    public static String wordEnds(String str, String word) {
        String ret = "";
        for (int i = 0; i < str.length()-word.length()+1; i ++) {
            if (str.substring(i,i+word.length()).equals(word)){
                if (i > 0) {
                    ret += str.charAt(i-1);
                }
                if (i + word.length() < str.length()) {
                    ret += str.charAt(i+word.length());
                }

            }
        }
        return ret;
    }

}

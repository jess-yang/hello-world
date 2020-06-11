public class stringYak {
    /** Question:
     * Suppose the string "yak" is unlucky.
     * Given a string, return a version where all the "yak" are removed, but the "a" can be any char.
     * The "yak" strings will not overlap.*/

    public static void main (String[] args) {
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
    }

    /** this method iterates through each letter in str.
     * If there are still 2 more letters from the end, it checks if the immediate substring is "yak".
     *      (If there are not, then I automatically know that the remaining is not "yak").
     * If it is yak, it will skip over that substring.
     * if it is NOT yak, it will add the letter to a return string
     * Finally it returns the end string.
     *
     * Mistake1: I cannot iterate by 3s. Example: YakPak, aYakPak : second example shows iterating by threes would miss the Yak.
     * Mistake2: I cannot iterate to str.length()-2. Because of the way I wrote the else statement, it adds each letter.
     *          If i iterated to str.length()-2, I would be missing 2 of the last letters.
     * */
    public static String stringYak(String str) {
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length()-2 && str.substring(i, i+3).equals("yak")) {
                i += 2;
            } else {
                ret += str.charAt(i);
            }
        }
        return ret;
    }

}

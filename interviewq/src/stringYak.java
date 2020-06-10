public class stringYak {
    /** Question:
     * Suppose the string "yak" is unlucky.
     * Given a string, return a version where all the "yak" are removed, but the "a" can be any char.
     * The "yak" strings will not overlap.*/

    public static void main (String[] args) {
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
    }

    /** 
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

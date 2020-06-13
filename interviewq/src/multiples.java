public class multiples {
    /** Question:
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
     * The sum of these multiples is 23.
     * Find the sum of all the multiples of 3 or 5 below 1000.
     * */

    public static void main (String[] args) {
        System.out.println(multiples(10));
        System.out.println(multiples(1000));
    }

    public static int multiples(int num) {
        int sum = 0;
        int count = 0;
        while (count < num) {
            if (count % 3 == 0 || count % 5 == 0) {
                sum += count;
            }
            count++;
        }
        return sum;
    }
}

public class task14 {
    public static long transformDigits(long n) {
        if (n == 0) return 1; // 0 — четное число, увеличивается до 1

        long result = 0;
        long place = 1;

        while (n > 0) {
            long digit = n % 10;
            if (digit % 2 == 0) {
                digit += 1;
            } else {
                digit -= 1;
            }
            result += digit * place;
            place *= 10;
            n /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        long n = 983210;
        System.out.println("Result: " + transformDigits(n));
    }
}
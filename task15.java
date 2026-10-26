public class task15 {
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int n) {
        if (n < 0) return false;
        return n == reverseNumber(n);
    }

    public static void main(String[] args) {
        int n = 121;
        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
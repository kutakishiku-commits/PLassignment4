public class task11 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int a = 6, b = 8;
        System.out.println("LCM = " + lcm(a, b));
    }
}
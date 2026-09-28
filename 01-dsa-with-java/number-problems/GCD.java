public class GCD {
    public static void main(String[] args) {
        gcd(12, 18);
    }

    public static void gcd(int a, int b){
        // GCD(a, b) = GCD(b, a % b) 
        while(b != 0){
            int temp = a;
            a = b;
            b = temp % b;
        }
        System.out.println("GCD is: " + a);
    }
}

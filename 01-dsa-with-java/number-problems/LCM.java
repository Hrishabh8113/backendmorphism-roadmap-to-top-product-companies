public class LCM {
    public static void main(String[] args) {
        lcm(12, 18);
    }

    public static void lcm(int a, int b){
        // LCM(a, b) = (a * b) / GCD(a, b)
        int ab = a * b;
        int gcd = gcd(a, b);
        System.out.println("LCM is: " + (ab / gcd));
    }

    public static int gcd(int a, int b){
        // GCD(a, b) = GCD(b, a % b) 
        while(b != 0){
            int temp = a;
            a = b;
            b = temp % b;
        }
        
        return a;
    }
}

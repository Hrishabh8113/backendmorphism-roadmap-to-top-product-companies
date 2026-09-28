public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 12321;
        int originalNumber = number;
        int reverse = 0;
        while(number > 0){
            int rem = number % 10;
            reverse = reverse*10 + rem;
            number = number /10;
        }

        if(originalNumber == reverse){
            System.out.println(originalNumber + " is a Palindrome Number");
        } else {
            System.out.println(originalNumber + " is not a Palindrome Number");
        }
    }
}

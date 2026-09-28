public class CountDigitInNumber {
    public static void main(String[] args) {
        int number = 1234567890;
        int count = 0;
        while(number > 0){
            count++;
            number = number/10;
        }
        System.out.println("Total digits in the number: " + count);
    }
}

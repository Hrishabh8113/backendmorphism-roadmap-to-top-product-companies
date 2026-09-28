public class CountNumberOfEvenDigits {
    public static void main(String[] args) {
        int number = 7516257;
        int counter = 0;

        while(number > 0){
            int rem = number % 10;
            if(rem % 2 == 0){
                counter++;
            }
            number = number / 10;
        }

        System.out.println("Number of Even Digit is " + counter);
    }
}

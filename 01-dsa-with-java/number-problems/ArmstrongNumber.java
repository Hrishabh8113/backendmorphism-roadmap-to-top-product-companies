public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int sum = 0;
        while(number > 0){
            int rem = number % 10;
            sum = sum + rem*rem*rem; //or you can use Math.pow(rem, 3)
            number = number / 10;
        }
        if(sum == originalNumber){
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number");
        }
    }
}

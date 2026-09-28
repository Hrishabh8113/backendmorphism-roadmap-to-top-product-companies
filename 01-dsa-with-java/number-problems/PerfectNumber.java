public class PerfectNumber {
    public static void main(String[] args) {
        int number = 6;
        int originalNumber = number;

        //method 1
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == originalNumber) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }


        //method 2 using prime number nethod
        int result = 1;
        for(int i = 2; i*i <= number ; i++){
            if(number % i == 0){
                int firstDivisor = i;
                int secondDivior = number/i;
                result = result + firstDivisor + secondDivior;
            }
        }
        if(result == number)
            System.out.println(originalNumber + " is Perfect Number");
        else    
            System.out.println(originalNumber + " is not Perfect Number");
    }
}

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = true;

        for(int i=2; i*i<=number; i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        //Print All Prime Numbers from 1 to n
        int range = 50;
        for(int i = 1; i<=range; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}

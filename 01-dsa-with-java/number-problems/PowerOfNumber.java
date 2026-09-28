public class PowerOfNumber {
    public static void main(String[] args) {
        int number = 5;
        int power = 4;
        int result = 1;

        while(power > 0){
            result = result*number;
            power--; 
        }
        System.out.println("Power Of a number: "+ result);
    }
}

public class CountLengthOfStringWithoutLengthFunction {

    public static void main(String ar[]) {
        String str = "Hello World";

        //method 1
        char chArray[] = str.toCharArray();
        int counter = 0;
        for(char ch: chArray){
            counter++;
        }
        System.out.println("Length of String is: " + counter);

        //method 2
        System.out.println("Length of String is: " + chArray.length);

        //method 3
        System.out.println("Length of String is: " + str.split("").length);

    }
}
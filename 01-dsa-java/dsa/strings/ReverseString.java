public class ReverseString {
    public static void main(String[] args) {
        String str ="Hello";

        //method 1
        String res = "";
        for(int i=str.length()-1; i>=0; i--){
            res = res + str.charAt(i);
        }
        System.out.println("Reverse of the string is: " + res);
        
        //method 2
        char []charArray = str.toCharArray();   
        String reverse = "";
        for(int i=charArray.length-1; i>=0; i--){
            reverse = reverse + charArray[i];
        }
        System.out.println("Reverse of the string is: " + reverse);

        //method 3
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reverse of the string is: " + sb.reverse().toString());
    }
}

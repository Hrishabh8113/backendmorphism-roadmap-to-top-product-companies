public class CountVowelsInString {
    public static void main(String[] args) {
        String str = "Hello World, What's up?";

        //method 1
        int count = 0;
        char []charArray = str.toCharArray();
        for(char ch: charArray){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                count++;
            }
        }
        System.out.println("Number of vowels in the string is: " + count);  

        //method 2
        int counter = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                counter++;
            }
        }
        System.out.println("Number of vowels in the string is: " + counter);

        //method 3 - using toLowerCase() method - bit optimized version of method 2
        String strLowerCase = str.toLowerCase();
        int vowelCount = 0;
        for(int i=0; i<strLowerCase.length(); i++){
            char ch = strLowerCase.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            }
        }   
        System.out.println("Number of vowels in the string is: " + vowelCount);
    }
}

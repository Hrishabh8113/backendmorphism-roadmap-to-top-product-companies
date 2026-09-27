public class StringToUpperCaseWithoutMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        
        // Calculate the difference between lowercase and uppercase ASCII values
        int difference = 'a' - 'A';
        System.out.println("Difference between 'a' and 'A': " + difference);

        String upperCaseStr = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                upperCaseStr = upperCaseStr + (char)(ch - difference);
            }else{
                upperCaseStr = upperCaseStr + ch;
            }
        }

        System.out.println("Uppercase String: " + upperCaseStr);
    }
}

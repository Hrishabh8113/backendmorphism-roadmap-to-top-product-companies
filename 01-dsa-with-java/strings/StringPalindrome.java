public class StringPalindrome {
    public static void main(String[] args) {
        //for checking string without special characters is palindrome or not, we can use two methods
        String str = "level";
        String strLowerCase = str.toLowerCase();

        //method 1
        String reverse = "";

        for(int i = strLowerCase.length()-1; i>=0; i--){
            reverse = reverse + strLowerCase.charAt(i);
        }

        if(strLowerCase.equals(reverse)){
            System.out.println("String is Palindrome");     
        }else{
            System.out.println("String is not Palindrome");
        }

        //method 2
        StringBuilder sb = new StringBuilder(strLowerCase);
        if(strLowerCase.equals(sb.reverse().toString())){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        } 

        //for checking string with special characters is palindrome or not. In this we ignore the special characters and spaces and check only the alphanumeric characters.
        String str1 = "A man, a plan, a canal: Panama";
        str1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //[^a-zA-Z0-9] what this means is that it will remove all the special characters and spaces from the string and only keep the alphanumeric characters.

        //method 1
        String reverse1 = "";
        for(int i=str1.length()-1; i>=0; i--){
            reverse1 = reverse1 + str1.charAt(i);
        }

        if(str1.equals(reverse1)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }

        //method 2
        StringBuilder sb1 = new StringBuilder(str1);
        if(str1.equals(sb1.reverse().toString())){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
    }
}

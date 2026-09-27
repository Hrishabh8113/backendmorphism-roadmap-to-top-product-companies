public class StringContainsOnlyDigits {
    public static void main(String[] args) {

        String str = "12345 456789";
        str = str.replaceAll("\\s", "");
        boolean isOnlyDigits = true;
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            //if(ch> 'a' && ch<='z' || ch>='A' && ch<='Z'){
            if(ch < '0' || ch > '9'){
                isOnlyDigits = false;
                break;
            }
        }
        System.out.println("String contains only digits: " + isOnlyDigits); 

        
    }
}

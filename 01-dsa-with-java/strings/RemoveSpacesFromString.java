public class RemoveSpacesFromString {
    public static void main(String[] args) {
        String str = "Backend Morphism Channel";

        //method 1: using replaceAll() method
        str = str.replaceAll("\\s","");
        System.out.println("String after removing spaces: " + str);

        //method 2: without using replaceAll() method
        String str1 = "Backend Morphism Channel";
        String withoutSpacesString = "";
        for(int i=0; i< str1.length(); i++){
            if(str1.charAt(i) != ' '){
                withoutSpacesString += str1.charAt(i);
            }
        }
        System.out.println("String after removing spaces: " + withoutSpacesString);
    }
}

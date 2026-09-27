public class PrintEachCharacterFromString {
    public static void main(String[] args) {
        String str = "Hello World";
        //method 1
        for(int i=0; i< str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }

        System.out.println();
        
        //method 2
        char charArray[] = str.toCharArray();
        for(char ch: charArray){
            System.out.print(ch + " ");
        }
    }
}
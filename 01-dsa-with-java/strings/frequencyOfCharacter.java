public class frequencyOfCharacter {
    public static void main(String[] args) {
        String str = "BackendMorphism Channel";

        //find the frequency of character 'n' in the string
        char ch = 'n';

        int frequency = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                frequency++;
            }
        }
        System.out.println("Frequency of '" + ch + "': " + frequency);

        //Key point to note here is that we are using '==' operator to compare the characters. In Java, the '==' operator compares primitive data types (like char) by their values, not by memory addresses. Since 'char' is a primitive type, using '==' to compare two characters will work as expected and will compare their actual values.
        //here i have one question, == operatore uses memory address to compare the values of two objects, but here we are comparing the values of two characters, so it will work fine.
        //Yes, you are correct. In Java, the '==' operator compares primitive data types (like char) by their values, not by memory addresses. Since 'char' is a primitive type, using '==' to compare two characters will work as expected and will compare their actual values.
        // However, if you were comparing two objects (like Strings), you would need to use the .equals() method to compare their values instead of '=='.



        //Now take it bit more further and find the frequency of all unique characters in the string
        System.out.println("Frequency of all characters in the string:");

        int []freq = new int[256];
        for(int i =0; i< str.length(); i++){
            freq[str.charAt(i)]++;
        }
        
        for(int i=0; i<freq.length; i++){
            if(freq[i] != 0){
                System.out.println((char)i + " : " + freq[i]);
            }
        }

    }
}

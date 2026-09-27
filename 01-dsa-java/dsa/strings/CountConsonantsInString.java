public class CountConsonantsInString {
    public static void main(String[] args) {
        String str = "Hello World, What's up?";
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int count =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                count++;
            }
        }
        System.out.println("Number of consonants in the string: " + count);
    }
}

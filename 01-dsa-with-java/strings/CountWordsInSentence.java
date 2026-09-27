public class CountWordsInSentence {
    public static void main(String[] args) {
        String sentence = "Backend Morphism is platform for learning concepts of backend development";
        
        //method 1
        int count = 0;
        for(int i=0; i< sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println("Number of words in the sentence: " + (count + 1));

        //method 2
        System.out.println("Number of words in the sentence: " + sentence.split(" ").length);
    }
}

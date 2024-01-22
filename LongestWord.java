public class LongestWord {

    public String findLongest(String word){

        String longestWord = "";
        String currentWord = "";

        for(int i = 0; i < word.length(); i++){
            char currentChar = word.charAt(i);
            if(currentChar != ' '){
                currentWord += currentChar;
            }else{
                if(currentWord.length()>longestWord.length()){
                    longestWord = currentWord;
                }
                currentWord = "";
            }
        }
        if(currentWord.length()>longestWord.length()){
            longestWord = currentWord;
        }



        return longestWord;
    }

    public static void main(String[] args) {
        String test = "pick the middle one";
        LongestWord object = new LongestWord();
        System.out.println(object.findLongest(test));
    }
    
}


    


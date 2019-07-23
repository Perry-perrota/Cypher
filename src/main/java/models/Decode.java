package models;

public class Decode {
    private String word;
    String decodedWord="";

    public Decode(String word){
        this.word=word;
    }

    public String getWord() {
        return word;
    }
    public String DecodeWord(String sentence) {
        String[] sentenceWords = sentence.split(""); //converts sentence to word
        for (String word : sentenceWords) {                 //manipulates every word in the array
            char[] wordChar;
            char shifted;
            wordChar = word.toCharArray();
            for (int i = 0; i < wordChar.length; i++) {     //manipulates individual characters in a word

                char ch = word.charAt(i);
                if (ch == 'a') {
                    shifted = 'y';

                } else if (ch == 'b') {
                    shifted = 'z';

                }else if(ch==' '){
                    shifted=' ';
                }
                else {
                    shifted = (char) (ch - 2);

                }
                decodedWord += shifted;
            }

        }
        return decodedWord;
    }
}

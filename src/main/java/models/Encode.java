package models;

public class Encode {
    private String word;
    String encodedWord="";

    public Encode(String word){
        this.word=word;
    }
    public String getWord(){
        return word;
    }
    public String EncodeWord(String sentence){
        String[] sentenceWords=sentence.split(""); //converts sentence to word
        for(String word:sentenceWords){                 //manipulates every word in the array
            char[] wordChar;
            wordChar=word.toCharArray();
            for (int i = 0; i < wordChar.length; i++) {

                char ch = word.charAt(i);
                char shifted;
                if(ch=='y'){
                    shifted='a';

                }
                else if(ch=='z'){
                    shifted='b';
                }
                else if(ch==' '){
                    shifted=' ';
                }

                else {
                    shifted = (char) (ch + 2);
                }

                encodedWord += shifted;
            }

        }
        return encodedWord;
    }
}

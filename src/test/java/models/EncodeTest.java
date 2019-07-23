package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncodeTest {

    @Test
    public void Encode_instantiatesCorrectly_true(){
        Encode newEncode=new Encode("steve");
        assertTrue(newEncode instanceof Encode);
    }

    @Test
    public void getWord() {
        Encode newEncode=new Encode("steve");
        assertEquals("steve",newEncode.getWord());
    }
    @Test
    public void EncodeWord_returnsExpectedValue_true(){
        Encode newWord=new Encode("yx");
        assertEquals("az",newWord.EncodeWord("yx"));
    }
}
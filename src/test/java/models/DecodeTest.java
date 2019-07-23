package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeTest {
    @Test
    public void Decode_instantiatesCorrectly_True(){
        Decode newWord=new Decode("Steve");
        assertTrue(newWord instanceof Decode);
    }

    @Test
    public void getWord() {
        Decode newWord=new Decode("Steve");
        assertEquals("Steve",newWord.getWord());
    }

    @Test
    public void DecodeWord_returnsExpectedValue_true(){
        Decode newWord=new Decode("az");
        assertEquals("yx",newWord.DecodeWord("az"));
    }
}
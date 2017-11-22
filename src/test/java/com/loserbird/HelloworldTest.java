package com.loserbird;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class HelloworldTest {

    @Test
    public void testSay() {
        Helloworld helloWord = new Helloworld();
        String result = helloWord.say();
        assertEquals("helloworld", result);

    }
}

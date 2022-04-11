package study;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        System.out.println("테스트실행");
        assertEquals("adc",actual);

    }
}

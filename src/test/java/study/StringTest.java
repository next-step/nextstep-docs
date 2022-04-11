package study;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
public class StringTest {
    @Test
    @DisplayName("문자열 바꾸기테스트")
    void replace() {
        String actual = "abc".replace("b", "d");
        System.out.println("replace run");
        assertEquals("adc",actual);
    }

    @Test
    @DisplayName("문자열 쪼개기테스트")
    void split() {
        String[] actual = "1,2".split(",");
        String[] expected={"1","2"};
        System.out.println("split run");
        assertArrayEquals(actual,expected);

    }

    @Test
    @DisplayName("문자열 추출테스트")
    void subString(){
        String actual="(1,2)".substring(1,4);
        System.out.println("subString run");
        assertEquals("1,2",actual);
    }

    @Test
    @DisplayName("경계값 예외테스트")
    void indexOutException() {

        String s = "abc";
        System.out.println("indexOutException run");
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            s.charAt(4);
        }, "String index out of range: 4");

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            s.charAt(2);
        }, "index 2는 예외가발생하지 않았습니다.");

//        assertThatThrownBy(() -> {
//            s.charAt(4); }).isInstanceOf(IndexOutOfBoundsException.class)
//                .hasMessageContaining("String index out of range: 4");
//
    }
}

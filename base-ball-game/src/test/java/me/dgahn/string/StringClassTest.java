package me.dgahn.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringClassTest {

    @Test
    @DisplayName("String 클래스의 split() 함수는 문자열을 분리한다.")
    void splitTest() {
        // given
        String str = "1,2";

        // when
        String[] split = str.split(",");

        // then
        assertThat(split[0]).isEqualTo("1");
        assertThat(split[1]).isEqualTo("2");
    }

    @Test
    @DisplayName("String 클래스의 substring() 함수는 문자열의 부분 문자열을 가져올 수 있다.")
    void substringTest() {
        // given
        String str = "(1,2)";

        // when
        String substring = str.substring(1, 4);

        assertThat(substring).isEqualTo("1,2");
    }

    @Test
    @DisplayName("String 클래스의 charAt() 함수는 특정 위치의 문자를 가져올 수 있다.")
    void charAtTest() {
        // given
        String str = "abc";

        // when
        char c1 = str.charAt(0);
        char c2 = str.charAt(1);
        char c3 = str.charAt(2);

        // given
        assertThat(c1).isEqualTo('a');
        assertThat(c2).isEqualTo('b');
        assertThat(c3).isEqualTo('c');
    }

    @Test
    @DisplayName("String 클래스의 charAt() 함수는 배열의 인덱스를 넘어가면 StringIndexOutOfBoundException이 발생한다.")
    void charAtExceptionTest() {
        // given
        String str = "abc";

        // when
        assertThatThrownBy(() -> { str.charAt(4); })
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 4");
    }
}

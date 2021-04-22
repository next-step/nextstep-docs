package me.dgahn.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Locale;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetCollectionTest {

    @Test
    @DisplayName("Set의 size() 메소드는 Set의 크기를 구할 수 있다.")
    void sizeTest() {
        Set<Integer> numbers = Set.of(1, 2, 3);

        assertThat(numbers.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("Set의 contains() 메소드는 Set에 element가 포함되면 true를 반환한다.")
    void containsTest() {
        Set<Integer> numbers = Set.of(1, 2, 3);

        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();
    }

    @ParameterizedTest
    @DisplayName("Set의 contains() 메소드는 Set에 element가 포함되면 true를 반환한다. [ParameterizedTest 활용]")
    @ValueSource(ints = {1, 2, 3})
    void containsParameterizedTest(int input) {
        Set<Integer> numbers = Set.of(1, 2, 3);

        assertThat(numbers.contains(input)).isTrue();
    }

    @Test
    @DisplayName("Set의 contains() 메소드는 포함하지 않으면 false를 반환한다.")
    void containsFalseTest() {
        Set<Integer> numbers = Set.of(1, 2, 3);

        assertThat(numbers.contains(true)).isFalse();
        assertThat(numbers.contains(4)).isFalse();
        assertThat(numbers.contains(5)).isFalse();
    }

    @ParameterizedTest
    @DisplayName("@CsvSource를 활용하여 테스트를 진행할 수 있다.")
    @CsvSource(value = {"test:test", "tEst:test", "Java:java"}, delimiter = ':')
    void csvSourceTest(String input, String expected) {
        String actualValue = input.toLowerCase();
        assertThat(actualValue).isEqualTo(expected);
    }
}

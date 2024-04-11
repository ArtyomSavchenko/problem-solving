package org.example.tasks.string;

import org.example.tasks.array.RansomNote;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LastWordTest {
    private static Stream<Arguments> testLastWord() {
        return Stream.of(
                Arguments.of(
                        "",
                        0
                ),
                Arguments.of(
                        "aa",
                        2
                ),
                Arguments.of(
                        "abc   ",
                        3
                ),
                Arguments.of(
                        "     aaddccc",
                        7
                ),
                Arguments.of(
                        "     aad   dccc     ",
                        4
                ),
                Arguments.of(
                        "     aad   dccc     a",
                        1
                )
        );
    }
    @ParameterizedTest
    @MethodSource
    void testLastWord(String str, int expectedResult) {
        LastWord lastWord = new LastWord();
        assertEquals(expectedResult, lastWord.lengthOfLastWord(str));
    }
}
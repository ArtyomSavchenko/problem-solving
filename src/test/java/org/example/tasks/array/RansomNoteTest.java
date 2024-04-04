package org.example.tasks.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RansomNoteTest {
    private static Stream<Arguments> testCanConstruct() {
        return Stream.of(
                Arguments.of(
                        "",
                        "",
                        true
                ),
                Arguments.of(
                        "aa",
                        "bb",
                        false
                ),
                Arguments.of(
                        "abc",
                        "cffgabba",
                        true
                ),
                Arguments.of(
                        "aaddffccc",
                        "aaddffccqqqqq",
                        false
                )
        );
    }
    @ParameterizedTest
    @MethodSource
    void testCanConstruct(String ransom, String magazine, boolean expectedResult) {
        RansomNote ransomNote = new RansomNote();
        assertEquals(expectedResult, ransomNote.canConstruct(ransom, magazine));
    }
}
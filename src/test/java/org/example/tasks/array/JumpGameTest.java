package org.example.tasks.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {
    private static Stream<Arguments> testJumpGame() {
        return Stream.of(
                Arguments.of(
                        List.of(1, 2, 2, 2, 3, 4),
                        true
                ),
                Arguments.of(
                        List.of(0),
                        true
                ),
                Arguments.of(
                        List.of(0, 1),
                        false
                ),
                Arguments.of(
                        List.of(1, 1, 1, 0, 1, 1),
                        false
                ),
                Arguments.of(
                        List.of(10, 1, 1, 0, 1, 1),
                        true
                ),
                Arguments.of(
                        List.of(2, 0, 0),
                        true
                ),
                Arguments.of(
                        List.of(2, 5, 0, 0),
                        true
                )
        );
    }

    @ParameterizedTest
    @MethodSource
    void testJumpGame(List<Integer> list, boolean expectedResult) {
        int[] array = list.stream().mapToInt(i -> i).toArray();

        JumpGame jumpGame = new JumpGame();
        boolean result = jumpGame.canJump(array);
        assertEquals(expectedResult, result);
    }
}
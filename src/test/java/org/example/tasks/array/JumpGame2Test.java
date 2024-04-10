package org.example.tasks.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class JumpGame2Test {
    private static Stream<Arguments> testJumpGame() {
        return Stream.of(
                Arguments.of(
                        List.of(1, 2, 2, 2, 3, 4),
                        3
                ),
                Arguments.of(
                        List.of(0),
                        0
                ),
                Arguments.of(
                        List.of(10, 0, 0, 0, 0, 1),
                        1
                ),
                Arguments.of(
                        List.of(3, 0, 3, 0, 0, 1),
                        2
                ),
                Arguments.of(
                        List.of(1, 1, 1, 1, 1, 1),
                        5
                ),
                Arguments.of(
                        List.of(2, 0, 0),
                        1
                ),
                Arguments.of(
                        List.of(2, 5, 0, 0),
                        2
                )
        );
    }

    @ParameterizedTest
    @MethodSource
    void testJumpGame(List<Integer> list, int expectedResult) {
        int[] array = list.stream().mapToInt(i -> i).toArray();

        JumpGame2 jumpGame = new JumpGame2();
        int result = jumpGame.jump(array);
        assertEquals(expectedResult, result);
    }
}
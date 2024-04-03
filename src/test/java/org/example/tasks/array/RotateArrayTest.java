package org.example.tasks.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {
    private static Stream<Arguments> testRotateArray() {
        return Stream.of(
                Arguments.of(
                        List.of(),
                        1,
                        List.of()
                ),
                Arguments.of(
                        List.of(1, 2, 3),
                        1,
                        List.of(3, 1, 2)
                ),
                Arguments.of(
                        List.of(1, 2, 3, 4, 5, 6),
                        2,
                        List.of(5, 6, 1, 2, 3, 4)
                ),
                Arguments.of(
                        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                        5,
                        List.of(6, 7, 8, 9, 10, 1, 2, 3, 4, 5)
                ),
                Arguments.of(
                        List.of(0, 1, 3),
                        6,
                        List.of(0, 1, 3)
                ),
                Arguments.of(
                        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12),
                        6,
                        List.of(7, 8, 9, 10, 11, 12, 1, 2, 3, 4, 5, 6)
                ),
                Arguments.of(
                        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12),
                        15,
                        List.of(10, 11, 12, 1, 2, 3, 4, 5, 6, 7, 8, 9)
                )
        );
    }

    @ParameterizedTest
    @MethodSource
    void testRotateArray(List<Integer> list1, Integer rotateStep, List<Integer> expected) {
        int[] array1 = list1.stream().mapToInt(i -> i).toArray();
        int[] expectedArray = expected.stream().mapToInt(i -> i).toArray();


        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(array1, rotateStep);
        assertArrayEquals(array1, expectedArray);
    }
}
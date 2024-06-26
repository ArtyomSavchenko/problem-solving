package org.example.tasks.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAllDuplicatesTest {
    private static Stream<Arguments> testRemoveSomeDuplicates() {
        return Stream.of(
                Arguments.of(
                        List.of(),
                        List.of(),
                        0
                ),
                Arguments.of(
                        List.of(1, 2, 2, 2, 3, 4),
                        List.of(1, 2, 3, 4, 0, 0),
                        4
                ),
                Arguments.of(
                        List.of(0, 0, 1, 2, 2, 3, 4, 4, 4),
                        List.of(0, 1, 2, 3, 4, 0, 0, 0, 0),
                        5
                )
        );
    }

    @ParameterizedTest
    @MethodSource
    void testRemoveSomeDuplicates(List<Integer> list1, List<Integer> expected, Integer expectedCount) {
        int[] array1 = list1.stream().mapToInt(i -> i).toArray();
        int[] expectedArray = expected.stream().mapToInt(i -> i).toArray();


        RemoveAllDuplicates uniqueSortedArray = new RemoveAllDuplicates();
        int existingCount = uniqueSortedArray.removeDuplicates(array1);
        assertArrayEquals(expectedArray, array1);
        assertEquals(expectedCount, existingCount);
    }
}
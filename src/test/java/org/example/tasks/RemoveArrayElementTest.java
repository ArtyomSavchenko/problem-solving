package org.example.tasks;

import org.example.tasks.RemoveArrayElement;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveArrayElementTest {
    private static Stream<Arguments> testRemoveElement() {
        return Stream.of(
                Arguments.of(
                        List.of(),
                        1,
                        List.of()
                ),
                Arguments.of(
                        List.of(-111111, 0, 5),
                        0,
                        List.of(-111111, 5, 0)
                ),
                Arguments.of(
                        List.of(-101, -100, 0, 1, 200, 201),
                        -101,
                        List.of(-100, 0, 1, 200, 201, 0)
                ),
                Arguments.of(
                        List.of(1, 2, 3, 2, 4, 2),
                        2,
                        List.of(1, 3, 4, 0, 0, 0)
                ),
                Arguments.of(
                        List.of(0, 1, 2, 2, 3, 0, 4, 2),
                        2,
                        List.of(0, 1, 3, 0, 4, 0, 0, 0)
                )
        );
    }

    @ParameterizedTest
    @MethodSource
    void testRemoveElement(List<Integer> list1, Integer toDelete, List<Integer> expected) {
        int[] array1 = list1.stream().mapToInt(i -> i).toArray();
        int[] expectedArray = expected.stream().mapToInt(i -> i).toArray();


        RemoveArrayElement removeArrayElement = new RemoveArrayElement();
        int existingCount = removeArrayElement.removeElement(array1, toDelete);
        assertArrayEquals(array1, expectedArray);

        int expectedCount = (int) list1.stream()
                .filter(num -> !num.equals(toDelete))
                .count();
        assertEquals(expectedCount, existingCount);
    }
}
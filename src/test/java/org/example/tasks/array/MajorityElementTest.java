package org.example.tasks.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {
    private static Stream<Arguments> testMajorityElement() {
        return Stream.of(
                Arguments.of(
                        List.of(1, 2, 2, 2, 3, 4),
                        2
                ),
                Arguments.of(
                        List.of(-1),
                        -1
                ),
                Arguments.of(
                        List.of(1, 3, 0, 1, 0, 0),
                        0
                ),
                Arguments.of(
                        List.of(111111, 3, 111111, 1, 111111, 0),
                        111111
                )
        );
    }

    @ParameterizedTest
    @MethodSource
    void testMajorityElement(List<Integer> list1, Integer expectedElement) {
        int[] array1 = list1.stream().mapToInt(i -> i).toArray();

        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.majorityElement(array1);
        assertEquals(expectedElement, element);
    }
}
package org.example.tasks;


import org.example.tasks.MergeSortedArrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArraysTest {
    private static Stream<Arguments> testArraysMerge() {
        return Stream.of(
                Arguments.of(
                        List.of(),
                        List.of(1, 4 ,5),
                        List.of(1, 4 ,5)
                ),
                Arguments.of(
                        List.of(-111111, 0, 5),
                        List.of(),
                        List.of(-111111, 0, 5)
                ),
                Arguments.of(
                        List.of(-100, 0, 200),
                        List.of(-101, 1, 201),
                        List.of(-101, -100, 0, 1, 200, 201)
                ),
                Arguments.of(
                        List.of(-1, 0, 1),
                        List.of(-1, 0, 1),
                        List.of(-1, -1, 0, 0, 1, 1)
                )
        );
    }

    @ParameterizedTest
    @MethodSource
    void testArraysMerge(List<Integer> list1, List<Integer> list2, List<Integer> expected) {
        int[] array1 = new int[list1.size() + list2.size()];
        for (int i = 0; i < list1.size(); i++) {
            array1[i] = list1.get(i);
        }
        int[] array2 = list2.stream().mapToInt(i -> i).toArray();
        int[] expectedArray = expected.stream().mapToInt(i -> i).toArray();

        MergeSortedArrays merger = new MergeSortedArrays();
        merger.merge(array1, list1.size(), array2, list2.size());
        assertArrayEquals(array1, expectedArray);
    }

}
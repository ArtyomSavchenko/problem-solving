package org.example.tasks.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSell2Test {
    private static Stream<Arguments> testProfit() {
        return Stream.of(
                Arguments.of(
                        List.of(1, 2, 2, 2, 3),
                        2
                ),
                Arguments.of(
                        List.of(1),
                        0
                ),
                Arguments.of(
                        List.of(1, 10),
                        9
                ),
                Arguments.of(
                        List.of(10, 1),
                        0
                ),
                Arguments.of(
                        List.of(1, 100, 1, 2, 1, 6),
                        105
                ),
                Arguments.of(
                        List.of(1, 2, 1, 3, 1, 0),
                        3
                ),
                Arguments.of(
                        List.of(0, 1, 2, 3, 4, 5),
                        5
                )
        );
    }

    @ParameterizedTest
    @MethodSource
    void testProfit(List<Integer> list1, Integer expectedElement) {
        int[] array1 = list1.stream().mapToInt(i -> i).toArray();

        BestTimeToBuyAndSell2 bestTimeToBuyAndSell = new BestTimeToBuyAndSell2();
        int profit = bestTimeToBuyAndSell.maxProfit(array1);
        assertEquals(expectedElement, profit);
    }
}
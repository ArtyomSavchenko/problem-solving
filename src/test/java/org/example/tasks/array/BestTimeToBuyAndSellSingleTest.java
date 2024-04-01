package org.example.tasks.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellSingleTest {
    private static Stream<Arguments> testMajorityElement() {
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
                        List.of(1, 100, 1, 1, 1, 0),
                        99
                ),
                Arguments.of(
                        List.of(1, 1, 1, 1, 1, 1),
                        0
                )
        );
    }

    @ParameterizedTest
    @MethodSource
    void testMajorityElement(List<Integer> list1, Integer expectedElement) {
        int[] array1 = list1.stream().mapToInt(i -> i).toArray();

        BestTimeToBuyAndSellSingle bestTimeToBuyAndSell = new BestTimeToBuyAndSellSingle();
        int profit = bestTimeToBuyAndSell.maxProfit(array1);
        assertEquals(expectedElement, profit);
    }
}
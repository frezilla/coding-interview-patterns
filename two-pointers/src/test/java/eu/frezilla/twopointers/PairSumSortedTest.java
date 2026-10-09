package eu.frezilla.twopointers;

import eu.frezilla.twopointers.pairsumsorted.PairSum;
import eu.frezilla.twopointers.pairsumsorted.PairSumSorted;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairSumSortedTest {

    @Test
    public void test_01() {
        int[] array = {};
        int target = 0;
        Set<PairSum> result = PairSumSorted.searchPairs(array, target);
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    public void test_02() {
        int[] array = {1};
        int target = 1;
        Set<PairSum> result = PairSumSorted.searchPairs(array, target);
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    public void test_03() {
        int[] array = {2, 3};
        int target = 5;
        Set<PairSum> result = PairSumSorted.searchPairs(array, target);
        Assertions.assertTrue(result.contains(new PairSum(0, 1)));
    }

    @Test
    public void test_04() {
        int[] array = {2, 4};
        int target = 5;
        Set<PairSum> result = PairSumSorted.searchPairs(array, target);
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    public void test_05() {
        int[] array = {2, 2, 3};
        int target = 5;
        Set<PairSum> result = PairSumSorted.searchPairs(array, target);
        Assertions.assertTrue(
                result.containsAll(
                        Set.of(
                                new PairSum(0, 2),
                                new PairSum(1, 2)
                        )
                )
        );
    }

    @Test
    public void test_06() {
        int[] array = {-1, 2, 3};
        int target = 2;
        Set<PairSum> result = PairSumSorted.searchPairs(array, target);
        Assertions.assertTrue(result.contains(new PairSum(0, 2)));
    }

    @Test
    public void test_07() {
        int[] array = {-3, -2, -1};
        int target = -5;
        Set<PairSum> result = PairSumSorted.searchPairs(array, target);
        Assertions.assertTrue(result.contains(new PairSum(0, 1)));
    }
}

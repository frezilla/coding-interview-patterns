package eu.frezilla.twopointers.pairsumsorted;

import java.util.HashSet;
import java.util.Set;

public class PairSumSorted {

    public static Set<PairSum> searchPairs(int[] sortedArray, int target) {
        if (sortedArray == null) {
            throw new IllegalArgumentException("sortedArray is null");
        }

        Set<PairSum> result = new HashSet<>();
        if (sortedArray.length < 2) {
            return result;
        }

        int leftIndex = 0;
        while (leftIndex < sortedArray.length) {
            int leftValue = sortedArray[leftIndex];
            int targetValue = target - leftValue;
            int rightIndex = leftIndex;
            int rightIndexStep = targetValue > leftValue ? 1 : -1;

            while (rightIndex >= 0 && rightIndex < sortedArray.length) {
                if (rightIndex != leftIndex) {
                    int rightValue = sortedArray[rightIndex];
                    if (rightValue == targetValue) {
                        result.add(new PairSum(leftIndex, rightIndex));
                        break;
                    } else if (Math.abs(rightValue) > Math.abs(target)) {
                        break;
                    }
                }
                rightIndex += rightIndexStep;
            }
            leftIndex++;
        }
        return result;
    }
}

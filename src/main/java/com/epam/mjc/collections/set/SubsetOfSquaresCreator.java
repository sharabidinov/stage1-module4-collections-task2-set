package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> result = new TreeSet<>();
        for (int item : sourceList) {
            if (item * item >= lowerBound && item * item <= upperBound) {
                result.add(item * item);
            }
        }
        return result;
    }
}

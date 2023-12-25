package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (int item : sourceList) {
            if (item % 2 == 0) {
                result.add(item);
                while (item != 1) {
                    result.add(item / 2);
                    item = item % 2 + item / 2;
                }
            } else {
                result.add(item);
                result.add(2 * item);
            }
        }
        return result;
    }
}

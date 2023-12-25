package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public static void main(String[] args) {
        SetCombinationCreator test = new SetCombinationCreator();
        test.createSetCombination(
//                new HashSet<>(Set.of("Java", "Collection", "framework", "interface", "class", "Queue")),
//                new HashSet<>(Set.of("Queue", "iterator", "Java", "Collection", "comparator")),
//                new HashSet<>(Set.of("Java", "Set", "Map", "List"))
                new HashSet<>(Set.of("Java", "SortedSet", "Map", "Collections", "Iterable", "Set", "NavigableSet")),
                new HashSet<>(Set.of("Queue", "SortedSet", "NavigableSet", "List", "Set", "Iterator", "Comparator")),
                new HashSet<>(Set.of("Java", "Iterable", "Comparator"))
//                "Collection", "Queue", "Set", "Map", "List"
        );
    }

    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();
        firstSet.removeAll(thirdSet);
        firstSet.retainAll(secondSet);
//        System.out.println(firstSet);
        thirdSet.removeAll(secondSet);
        thirdSet.removeAll(firstSet);
//        System.out.println(thirdSet);
        result.addAll(firstSet);
        result.addAll(thirdSet);
        System.out.println(result);
        return result;
    }
}

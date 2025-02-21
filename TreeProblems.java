/*
 * *** Rachel Riemersma / 001 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

    /**
     * Method different()
     *
     * Given two TreeSets of integers, return a TreeSet containing all elements
     * that are NOT in both sets. In other words, return a TreeSet of all the
     * elements that are in one set but not the other.
     */

    public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
        // New TreeSet with elements from setA
        Set<Integer> result = new TreeSet<>(setA);
        // New TreeSet with elements from setB
        Set<Integer> temp = new TreeSet<>(setB);
        // Add all the elements from setB to result (union)
        result.addAll(setB);
        // Find elements that are in both A and B (intersection)
        temp.retainAll(setA);
        // Remove all elements that are common to A and B (~intersection)
        result.removeAll(temp);
        return result;
    }


    /**
     * Method removeEven()
     *
     * Given a treeMap with the key as an integer, and the value as a String,
     * remove all <key, value> pairs where the key is even.
     */

    public static void removeEven(Map<Integer, String> treeMap) {
        // Iterator to access elements sequentially for the keySet of TreeMap
        Iterator<Integer> iterator = treeMap.keySet().iterator();
        // Iterate through the map
        while (iterator.hasNext()) {
            // If the key is even, remove the current key-value pair
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
    }


    /**
     * Method treesEqual()
     *
     * Given two treeMaps, each with the key as an integer, and the value as a String,
     * return a boolean value indicating if the two trees are equal or not.
     */

    public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
        // Directly compare maps
        return tree1.equals(tree2);
    }

} // end treeProblems class

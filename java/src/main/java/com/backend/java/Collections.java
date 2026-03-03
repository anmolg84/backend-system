package com.backend.java;

import java.util.*;
import java.util.Arrays;

/**
    * Java Collections Framework: set of interfaces & classes that provide unified architecture for representing & manipulating collections of objects.
    * Includes interfaces like List, Set, Map, Queue, & classes like ArrayList, HashSet, HashMap, LinkedList, TreeSet, TreeMap.
    * Set: Collection of unique elements with no specific order
    * TreeSet: Store Sorted Values
    * List: allowing duplicate elements and maintains insertion order of elements
    * ArrayList: Implements List Interface using Dynamic Array.
    * LinkedList: Implements List & Deque using doubly linked lists.
    * HashMap: Non Synchronized (not thread safe), allows null key and null values.
    * Hashtable: Synchronized (thread-safe), does not allow null keys or null values. Slower due to synchronization overhead.
    * Iterator: interface that provides standard way of traverse elements in collections
        * Fail-fast iterators: Throw a ConcurrentModificationException immediately if the underlying collection is structurally modified after the iterator is created.
            * Examples: ArrayList, HashMap iterators.
        * Fail-safe iterators: Does not throw an exception if the underlying collection is modified. They work on a copy of the collection or use specific concurrent data structures
            * Examples: Iterators for ConcurrentHashMap, CopyOnWriteArrayList.
    * Stream-API: powerful and functional way to process collection of objects, Filtering, Mapping & Reducing Data (Filter-Map-Reduce)
        * Method Reference: .map(System.out::println), .map(String::toUpperCase)
        * Constructor Reference: .map(className::new)
    * Optional<T>: Helps in avoiding NullPointerException, forcing to handle case when value might be missing
 * */
public class Collections {
    public static void main(String[] args) {

        // ArrayList
        List<Integer> nums = new ArrayList<>();
        List<Integer> nums2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        System.out.println(nums2.get(3));
        nums2.forEach(num -> System.out.print(":" + num));
        System.out.println();

        // Set & TreeSet
        Set<Integer> set = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(299); treeSet.add(65);
        System.out.println(treeSet);

        // Iterator
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // HashMaps and HashTables
        Map<String,Integer> mp = new HashMap<>();
        Map<String,Integer> mp2 = new Hashtable<>();
        mp.put("Anmol",23); mp.put("Gupta",24);
        for(String key:mp.keySet()){
            System.out.println(key + ":" + mp.get(key));
        }

        // Stream-API: Filter-Map-Reduce
        int number = nums2.stream()
                .filter(num -> num%2==0)
                .map(num-> num*2)
                .reduce(0, Integer::sum);
        System.out.println(number);

        // Using Parallel Streams (MultiThreading)
        int number2 = nums2.parallelStream()
                .filter(num -> num%2==0)
                .map(num-> num*2)
                .reduce(0, Integer::sum);
        System.out.println(number2);

        // Optional<T> Class: Avoids NullPointerException
        List<String> names = Arrays.asList("Anmol","Gupta","Space");
        Optional<String> filteredNames = names.stream().filter(str -> str.contains("X")).findFirst();
        System.out.println(filteredNames.orElse("No Relevant String Found"));

    }
}

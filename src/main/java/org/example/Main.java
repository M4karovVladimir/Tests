package org.example;
import first_task.SetMerger;

import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        SetMerger setMerger = new SetMerger();

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> resultSet1 = setMerger.mergeSets(set1, set2);
        System.out.println("Тест 1 - Пересекающиеся множества: " + resultSet1);

        Set<Integer> set3 = new HashSet<>();
        set3.add(4);
        set3.add(5);
        set3.add(6);

        Set<Integer> resultSet2 = setMerger.mergeSets(set1, set3);
        System.out.println("Тест 2 - Непересекающиеся множества: " + resultSet2);

        Set<Integer> emptySet = new HashSet<>();
        Set<Integer> resultSet3 = setMerger.mergeSets(set1, emptySet);
        System.out.println("Тест 3 - Пустое и полное множество: " + resultSet3);

        Set<Integer> resultSet4 = setMerger.mergeSets(set1, set1);
        System.out.println("Тест 4 - Объединение множества с самим собой: "+ resultSet4);

        Set<Integer> resultSet5 = setMerger.mergeSets(emptySet, emptySet);
        System.out.println("Тест 5 - Два пустых множества" + resultSet5);
    }
}
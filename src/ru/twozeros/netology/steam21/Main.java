package ru.twozeros.netology.steam21;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> filteredList = new ArrayList<>();
        for (var value : intList) {
            if(value > 0 && value % 2 ==0) {
                filteredList.add(value);
            }
        }
        Collections.sort(filteredList);
        System.out.println(filteredList);
    }
}

package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer[] array = new Integer[20];
        Random random = new Random();
        System.out.println("~~~~~~~~~~~~~~~~ Array ~~~~~~~~~~~~~~~~");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 2);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~ ArrayList ~~~~~~~~~~~~~~");
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        for (Integer g : arrayList) {
            System.out.print(g + " ");
        }
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~ LinkedList ~~~~~~~~~~~~~");
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
        Collections.sort(linkedList);
        for (Integer h : linkedList) {
            System.out.print(h + " ");
        }
    }
}
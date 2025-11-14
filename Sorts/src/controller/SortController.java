package controller;

import model.*;

public class SortController {
    public static long runSort(String name, int[] data){
        int[] copy = data.clone();
        long start = System.nanoTime();
        switch(name){
            case "bubble": BubbleSort.sort(copy); break;
            case "insertion": InsertionSort.sort(copy); break;
            case "quick": QuickSort.sort(copy); break;
        }
        return System.nanoTime()-start;
    }
}

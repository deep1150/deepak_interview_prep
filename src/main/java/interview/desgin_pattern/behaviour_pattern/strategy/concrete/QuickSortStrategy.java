package deepak_lld_prep.behaviour_pattern.strategy.concrete;

import deepak_lld_prep.behaviour_pattern.strategy.strategy.SortStrategy;

public class QuickSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] numbers) {
        System.out.println("Sorting using BubbleSort");
        // BubbleSort algorithm implementation
    }
}


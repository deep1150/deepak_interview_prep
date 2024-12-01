package deepak_lld_prep.behaviour_pattern.strategy.client;

import deepak_lld_prep.behaviour_pattern.strategy.Context.SortingContext;
import deepak_lld_prep.behaviour_pattern.strategy.concrete.BubbleSortStrategy;
import deepak_lld_prep.behaviour_pattern.strategy.concrete.MergeSortStrategy;
import deepak_lld_prep.behaviour_pattern.strategy.concrete.QuickSortStrategy;

public class StrategyExample {
    public static void main(String[] args) {
        SortingContext context = new SortingContext();
        int[] numbers = {5, 3, 8, 2};

        // Use QuickSort
        context.setSortStrategy(new QuickSortStrategy());
        context.executeSort(numbers);

        // Use MergeSort
        context.setSortStrategy(new MergeSortStrategy());
        context.executeSort(numbers);

        // Use BubbleSort
        context.setSortStrategy(new BubbleSortStrategy());
        context.executeSort(numbers);
    }
}


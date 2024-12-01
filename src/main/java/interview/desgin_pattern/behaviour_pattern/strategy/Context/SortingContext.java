package deepak_lld_prep.behaviour_pattern.strategy.Context;

import deepak_lld_prep.behaviour_pattern.strategy.strategy.SortStrategy;

public class SortingContext {
    private SortStrategy sortStrategy;

    // Set the sorting strategy at runtime
    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    // Use the selected strategy to sort
    public void executeSort(int[] numbers) {
        sortStrategy.sort(numbers);
    }
}

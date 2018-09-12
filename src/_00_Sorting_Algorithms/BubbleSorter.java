package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter {
	public BubbleSorter() {
		type = "Bubble";
	}

	// 1. Use the bubble sorting algorithm to sort the array.
	// You can use display.updateDisplay() to show the current
	// progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean changed = false;
		do {
			changed = false;
			for (int i = 1; i < array.length; i++) {
				if (array[i - 1] > array[i]) {
					changed = true;
					int a = array[i];
					array[i] = array[i - 1];
					array[i - 1] = a;
					display.updateDisplay();
				}

			}

		} while (changed == true);
	}

}

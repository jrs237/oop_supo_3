package uk.ac.cam.jrs237;

import java.util.List;

public class Exercise1 {
	public static int mean_regular_for(List<Integer> ints) {
		int total = 0;
		for (int i = 0; i < ints.size(); i++) {
			total += ints.get(i);
		}
		return total / ints.size();
	}

	public static int mean_for_each(List<Integer> ints) {
		int total = 0;
		for (int item: ints) {
			total += item;
		}
		return total / ints.size();
	}

	public static int mean_iterator(List<Integer> ints) {
		return ints.stream().reduce(0, Integer::sum) / ints.size();
	}
}

package uk.ac.cam.jrs237;

import java.util.ArrayList;

public class Exercise1 {
	public static int mean_regular_for(ArrayList<Integer> ints) {
		int total = 0;
		for (int i = 0; i < ints.size(); i++) {
			total += ints.get(i);
		}
		return total / ints.size();
	}

	public static int mean_for_each(ArrayList<Integer> ints) {
		int total = 0;
		for (int item: ints) {
			total += item;
		}
		return total / ints.size();
	}

	public static int mean_iterator(ArrayList<Integer> ints) {
		return ints.stream().reduce(0, Integer::sum) / ints.size();
	}
}

package uk.ac.cam.jrs237;

public class Exercise6 {
	public static double sqrt(double num) {
		if (num < 0)
			throw new IllegalArgumentException("argument cannot be below 0");

		int iterations = 10;

		double x = num;
		for (int i = 0; i < iterations; i++) {
			// f(x) = x² - num
			// f'(x) = 2x
			// x_1 = x_0 - f(x_0) / f'(x_0)
			// x_1 = x_0 - (x_0² - num) / (2 * x_0)
			x = x - (x * x - num) / (2 * x);
		}

		return x;
	}
}

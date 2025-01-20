import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import uk.ac.cam.jrs237.Exercise6;

@RunWith(JUnit4.class)
public class Exercise6Test {
	@Test
	public void whole_root() {
		double num = 16.0;

		double result = Exercise6.sqrt(num);

		assertEquals(4.0, result, 1E-7);
	}

	@Test
	public void irrational_root() {
		double num = 20.0;

		double result = Exercise6.sqrt(num);

		assertEquals(4.4721360, result, 1E-7);
	}

	@Test(expected = IllegalArgumentException.class)
	public void root_negative() {
		double num = -4.0;

		Exercise6.sqrt(num);
	}
}

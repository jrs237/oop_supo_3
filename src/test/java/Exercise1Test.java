import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import uk.ac.cam.jrs237.Exercise1;

@RunWith(JUnit4.class)
public class Exercise1Test {
	@Test
	public void for_loop_test() {
		List<Integer> list = new ArrayList<>(List.of(1, 2, 3));

		int result = Exercise1.mean_regular_for(list);

		assertEquals(result, 2);
	}

	@Test
	public void for_each_test() {
		List<Integer> list = new ArrayList<>(List.of(1, 2, 3));

		int result = Exercise1.mean_for_each(list);

		assertEquals(result, 2);
	}

	@Test
	public void iterator_test() {
		List<Integer> list = new ArrayList<>(List.of(1, 2, 3));

		int result = Exercise1.mean_iterator(list);

		assertEquals(result, 2);
	}
}

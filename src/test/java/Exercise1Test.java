import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import uk.ac.cam.jrs237.Exercise1;

@RunWith(JUnit4.class)
public class Exercise1Test {
	@Test
	public void for_loop_test() {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);

		int result = Exercise1.mean_regular_for(arrayList);

		assertEquals(result, 2);
	}

	@Test
	public void for_each_test() {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);

		int result = Exercise1.mean_for_each(arrayList);

		assertEquals(result, 2);
	}

	@Test
	public void iterator_test() {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);

		int result = Exercise1.mean_iterator(arrayList);

		assertEquals(result, 2);
	}
}

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//import Quiz3.Triangle;

public class TriangleTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Triangle testMyTriangle = new Triangle(3.0, 4.0, 5.0);
		assertEquals("Testing Perimeter",testMyTriangle.getPerimeter(), 12.0, .1);
		assertEquals("Testing Area", testMyTriangle.getArea(), 6.0, .1);
	}

}

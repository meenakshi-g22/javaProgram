package testPrograms;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class callCircle {

	@Test
	void test() {
		circle c = new circle ();
		System.out.print(c.calculateArea(6));
		assertEquals(0, c.calculateArea(0));
	}

}

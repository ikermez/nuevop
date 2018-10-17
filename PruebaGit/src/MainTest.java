import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		org.junit.jupiter.api.Assertions.assertEquals(Main.Cuadrado(4), 16);
	}
	
	@Test
	void test2() {
		org.junit.jupiter.api.Assertions.assertEquals(Main.max(3, 4), 4);
	}

}

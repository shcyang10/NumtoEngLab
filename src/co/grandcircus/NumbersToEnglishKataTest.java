package co.grandcircus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumbersToEnglishKataTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test1() {
		NumbersToEnglishKata convert = new NumbersToEnglishKata();
		
		int expected = 745;
		int actual = convert.amount(745, "seven hundred forty five");
		
		assertEquals(expected, actual);
		
	}
	@Test
	void test2() {
		NumbersToEnglishKata convert = new NumbersToEnglishKata();
		
		int expected = 45;
		int actual = convert.amount(45, "forty-five");
		
		assertEquals(expected, actual);
	}
}

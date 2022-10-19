import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {

	@Test
	public void test() {
		SdlcAssFour test = new SdlcAssFour();
		String actual = "three three three";
		String output = test.wordCount(actual);
		assertEquals("1. three 3", output.toString());
	}

}

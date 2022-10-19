import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {

	@Test
	public void test() {
		SdlcAssFour test = new SdlcAssFour();
		String actual = "two two";
		String output = test.wordCount(actual);
		assertEquals("1. two 2", output.toString());
	}

}

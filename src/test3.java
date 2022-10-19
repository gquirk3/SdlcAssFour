import static org.junit.Assert.*;

import org.junit.Test;

public class test3 {

	@Test
	public void test() {
		SdlcAssFour test = new SdlcAssFour();
		String actual = "two two";
		String output = test.wordCount(actual);
		assertNotEquals("1. three 2", output.toString());
	}

}

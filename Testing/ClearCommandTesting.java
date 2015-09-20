package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClearCommandTesting {

	@Test
	public void test() {
		TextBuddy test = new TextBuddy(null);
		String str = test.processCommand("clear");
		assertEquals("all content deleted from mytextfile.txt", str);
	}

}

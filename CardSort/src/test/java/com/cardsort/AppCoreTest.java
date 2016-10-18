package com.cardsort;

import org.junit.Assert;
import org.junit.Test;

public class AppCoreTest {

	private static final String TEST_FILE = "resources/selvala-test.txt";

	
	@Test
	public void testExecute()  {
		
		AppCore core = new AppCore();
		
		core.addAppOption("file", TEST_FILE);
				
		core.execute(true);
		
		core.printDeckList();
		
		Assert.assertEquals(88, core.getDeckListSize());
		
		}

}

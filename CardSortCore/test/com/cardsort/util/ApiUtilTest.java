package com.cardsort.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ApiUtilTest {

	@Test
	public void testFetchCardInfo() {
		
		String CardNameToTest = "Time Walk";
		
		 ApiUtil.fetchCardInfo(CardNameToTest);
		
	}

}

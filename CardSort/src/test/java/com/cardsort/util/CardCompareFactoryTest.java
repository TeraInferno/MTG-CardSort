package com.cardsort.util;

import java.util.Comparator;

import org.junit.BeforeClass;
import org.junit.Test;

 import org.junit.Assert;

 import static org.junit.Assert.assertEquals;
 import static org.junit.Assert.assertTrue;
 


import com.cardsort.models.Card;
import com.cardsort.util.CardCompareFactory.CardNameComparator;
import com.cardsort.util.CardCompareFactory.CardTypesComparator;

public class CardCompareFactoryTest {
	
	private static CardCompareFactory factory = null;

	@BeforeClass
	public static void setupTestClass()
	{	
		factory = new CardCompareFactory();
	}
	
	@Test
	public void testGetComparator()
	{
		Comparator<Card> comparator = factory.getComparator("name");
		assertTrue("Assert Failed", comparator instanceof CardNameComparator);
		
		comparator = factory.getComparator("types");
		assertTrue("Assert Failed", comparator instanceof CardTypesComparator);
	}
}

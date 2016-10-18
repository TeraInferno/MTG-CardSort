package com.cardsort.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cardsort.AppCore;
import com.cardsort.models.Card;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

public class CardSorterTest {
	
	private static CardSorter sorter;
	private static AppCore core;
	private static final String TEST_FILE = "resources/selvala-test.txt";


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sorter = new CardSorter();
		core = new AppCore();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSortName()
	{
		core.addAppOption("file", TEST_FILE);
		core.execute(true);
		
		ArrayList<Card> list = (ArrayList<Card>) core.getDeckList();
		
		sorter.addSortOption("name");
		
		ArrayList<Card> sortedList = new ArrayList<>();
		sortedList = sorter.sort(list);

		ArrayList<String> cardNames = new ArrayList<>();
		for (Card card : sortedList) {
			cardNames.add(card.name);
		}

	}
	
	@Test
	public void testSortCmc()
	{
		core.addAppOption("file", TEST_FILE);
		core.execute(true);
		
		ArrayList<Card> list = (ArrayList<Card>) core.getDeckList();
				
		sorter.addSortOption("cmc");
		
		ArrayList<Card> sortedList = new ArrayList<>();
		sortedList = sorter.sort(list);
		
		ArrayList<String> cardNames = new ArrayList<>();
		for (Card card : sortedList) {
			cardNames.add(card.name);
		}

	}
	
	@Test
	public void testSortTypes()
	{
		core.addAppOption("file", TEST_FILE);
		core.execute(true);
		
		ArrayList<Card> list = (ArrayList<Card>) core.getDeckList();
				
		sorter.addSortOption("types");
		
		ArrayList<Card> sortedList = new ArrayList<>();
		sortedList = sorter.sort(list);
		
		ArrayList<String> cardNames = new ArrayList<>();
		for (Card card : sortedList) {
			cardNames.add(card.name);
		}
		
		sorter.printSortMsg("Sorted by Types: " + cardNames.toString());
	}



}

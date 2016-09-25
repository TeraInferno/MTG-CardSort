package com.cardsort.util;

import static org.junit.Assert.*;

import java.io.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cardsort.models.Card;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class ApiUtilTest {

	private static Gson gson;
	
	private static Log log = LogFactory.getLog(ApiUtilTest.class);
	
	
	@BeforeClass
	public static void setupForAllTests()
	{
		gson = new Gson();
	}
	
	@Test
	public void testFetchCardInfo() {
		
		String CardNameToTest = "Time Walk";
		
		Card fetchedCard = ApiUtil.fetchCardInfo(CardNameToTest);
		
		log.debug("API returned: " + fetchedCard.toString());
		
		assertTrue(null != fetchedCard);
		
		assertTrue(CardNameToTest.equals(fetchedCard.name));
		
		
	}

	@Test
	public void testJsonFileParse()
	{
		String etchedChampPath = "resources/EtchedChampionResponse.json";
		File cardFile = new File(etchedChampPath);
		
		String cardNameToTest = "Etched Champion";

		log.debug("Testing with card name = Etched Champion");
		

	
		try(JsonReader reader = new JsonReader(new FileReader(cardFile))) {
			Card[] etchedCard = gson.fromJson(reader, Card[].class);
			
			log.debug("Card name from json: " + etchedCard[0].name);
			
			assertTrue(cardNameToTest.equals(etchedCard[0].name));
			

			
		} catch (IOException e) {
			log.error("Exception Occured");
			e.printStackTrace();
		}

	}


}

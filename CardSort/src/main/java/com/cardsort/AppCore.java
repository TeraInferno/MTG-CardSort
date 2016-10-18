package com.cardsort;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.cardsort.util.CardSorter;
import com.cardsort.models.*;
import com.cardsort.util.*;

public class AppCore {
	
	private static Log log = LogFactory.getLog(AppCore.class);
	protected static ApiUtil apiUtil = new ApiUtil();
	
	private static final String TEST_SORT_OPT = "types";
	private static final String SEPERATOR = "\t";
//	private static final String TEST_FILE = "resources/selvala-test.txt";

	private boolean testMode = false;

	
	private HashMap<String, String> appOptions; 
	
	private CardSorter sorter;
	
	private List<Card> deckList;
	private Map<Card, Integer> deckEntryMap;


	public AppCore()
	{
		appOptions = new HashMap<>();
		sorter = new CardSorter();
		deckList = new ArrayList<>();
		deckEntryMap = new LinkedHashMap<>();
		
	}
	
	public AppCore(HashMap<String, String> opt)
	{
		
		appOptions = new HashMap<>();
		sorter = new CardSorter();
		deckList = new ArrayList<>();
		deckEntryMap = new LinkedHashMap<>();


		appOptions = opt;
	}
	
	public void execute()
	{
		List<String> deckStringList = readDeckStrings();		
		
		if ("FAILED".equals(deckStringList.get(0))) {
			log.error("Decklist is empty: Nothing to do...");
		} else {
			for (String deckEntryStr : deckStringList) {
				
				if (!deckEntryStr.isEmpty()) {
					
					String trimmedStr = deckEntryStr.trim();				
					String[] splitStr = trimmedStr.split("\\s+", 2);

					if (splitStr.length > 0 && splitStr.length <= 2) {
						String cardStr = splitStr[1];
						
						Card card = ApiUtil.fetchCardInfo(cardStr);
						deckList.add(card);
						
						log.debug(card.name);
						
						String cardQt = splitStr[0].replace("x", "").replace("X", "");					
						deckEntryMap.put(card, Integer.parseInt(cardQt));
					}
				}			
			}
			
			if (testMode) {
				sorter.addSortOption(TEST_SORT_OPT);
			} else {
				sorter.addSortOption(TEST_SORT_OPT);
			}
			
			ArrayList<Card> sortedList = new ArrayList<>();
			sortedList = sorter.sort((ArrayList<Card>) deckList);
			
			
			writeSortedFile(sortedList);

			
		}
		
		
		
	}
	
	public void execute(boolean test)
	{
		testMode = test;
		execute();
	}
	
	public String formatOutputString(ArrayList<Card> list)
	{
		StringBuilder builder = new StringBuilder();
		
		for (Card card : list) {
			builder.append(deckEntryMap.get(card).toString() + "    " + card.name + System.lineSeparator());
		}
		
		return builder.toString();
	}
	
	
	
	
	public void writeSortedFile(ArrayList<Card> sortedDeckList)
	{
		try (FileWriter writer = new FileWriter("output"))
		{
			String outputStr = formatOutputString(sortedDeckList);
			writer.write(outputStr);
		} catch (IOException e) {
			log.error("Unexpected IO Exception");
			e.printStackTrace();
		} 
	}
	
	public List<String> readDeckStrings()
	{
		List<String> listStr = new ArrayList<>();
		
		if (appOptions.containsKey("file")) 
		{
			String filename = appOptions.get("file");
			log.debug("Found filename[" + filename + "] in appOptions");
			
			try(Stream<String> stream = Files.lines(Paths.get(filename)))
			{
				listStr = stream.collect(Collectors.toList());
				return listStr;
				
			} catch (IOException e) {
				log.error("Unexpected IO Exception");
				e.printStackTrace();
			}
		} 
		log.warn("No File to work with. Doing nothing.");
		listStr.add("FAILED");
		return listStr;
	}
	
	
	public void setAppOptions(HashMap<String, String> opt)
	{
		appOptions = opt;
	}
	
	public void addAppOption(String key, String Value)
	{
		appOptions.put(key, Value);
	}
	
	public void printDeckStrings(List<String> list)
	{
		list.forEach(System.out::println);
	}
	
	public void printDeckList()
	{
		for (Card card : deckList) {
			log.debug(card.name + " " + card.cost);
		}
	}
	
	public int getDeckListSize()
	{
		return deckList.size();
	}
	
	public List<Card> getDeckList()
	{
		return deckList;
	}
	
}

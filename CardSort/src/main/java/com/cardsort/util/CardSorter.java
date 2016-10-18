package com.cardsort.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.cardsort.models.Card;

public class CardSorter {
	
	private List<String> sortOptions;
	private static CardCompareFactory compareFactory = new CardCompareFactory();
	private static Log log = LogFactory.getLog(CardSorter.class);

	
	public CardSorter()
	{
		sortOptions = new ArrayList<>();
	}
	
	public void addSortOption(String opt)
	{
		sortOptions.add(opt);
	}
	
	public void clearSortOptions()
	{
		sortOptions.clear();
	}
	
	public ArrayList<Card> sort(ArrayList<Card> deckList)
	{
		String option = sortOptions.get(0);
		
		Comparator<Card> comparator = compareFactory.getComparator(option);
		Collections.sort(deckList, comparator);			
		
		return deckList;
	}
	
	public void printSortMsg(String msg){
		log.info(msg);
	}
}

package com.cardsort.util;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.cardsort.AppCore;
import com.cardsort.models.Card;

public class CardCompareFactory {
	
	private static Class<Card> cardClass = Card.class;
	private static Log log = LogFactory.getLog(CardCompareFactory.class);

	private List<Field> cardFieldList;

	public CardCompareFactory()
	{
		cardFieldList = new ArrayList<>(Arrays.asList(cardClass.getFields()));		
	}
	
	public Comparator<Card> getComparator(String type)
	{
		if (type == null) {
			throw new IllegalArgumentException("Argument String was null");
		}
		
		boolean isValid = false;
		for (Field field : cardFieldList) {
			if (type.equalsIgnoreCase(field.getName())) {
				isValid = true;
				break;
			}	
		}
		
		if (isValid) {
			switch (type) {
			case "name":
				return new CardNameComparator();
			case "cmc":
				return new CardCmcComparator();
			case "types":
				return new CardTypesComparator();
			default:
				log.warn("Comparator for type: " + type + " not yet implemented. Returning default comparator");
				return new CardNameComparator();
			}
		} else {
			log.warn("Arguemnt was not a valid type. Returning default comparator");
			return new CardNameComparator();
		}
	}	
	
	public static class CardNameComparator implements Comparator<Card>
	{

		@Override
		public int compare(Card card1, Card card2) {
			return card1.name.compareTo(card2.name);	
		}
	}
	
	public class CardCmcComparator implements Comparator<Card>
	{

		@Override
		public int compare(Card card1, Card card2) {
			
			if (card1.cmc == card2.cmc) {
				return 0;
			} else if (card1.cmc > card2.cmc) {
				return 1;
			} else {
				return -1;
			}
		}
	}
	
	public class CardTypesComparator implements Comparator<Card>
	{

		@Override
		public int compare(Card card1, Card card2) {
			
			List<String> card1TypeList = card1.types;
			List<String> card2TypeList = card2.types;
			
			String card1Type = card1TypeList.get(0);
			String card2Type = card2TypeList.get(0);
			
			return card1Type.compareTo(card2Type);
		}
	}

}

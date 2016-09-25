package com.cardsort.util;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.impl.LogFactoryImpl;

import com.cardsort.models.Card;


import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.gson.GsonFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.TypeAdapter;

/**
 * @author agrossnickle
 *
 */
public class ApiUtil {
	static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
	static final JsonFactory JSON_FACTORY = new GsonFactory();

	static final HttpRequestFactory REQUEST_FACTORY = HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {

		@Override
		public void initialize(HttpRequest request) throws IOException {
			request.setParser(new JsonObjectParser(JSON_FACTORY));

		}
	});
	
//	Old API 
//	static final String BASE_URL = "https://api.magicthegathering.io/v1/cards";
	
	static final String BASE_URL = "https://api.deckbrew.com/mtg/cards";

	private static Log log = LogFactory.getLog(ApiUtil.class);

	protected static Gson gson = new Gson();


	public ApiUtil() {
		
	}


	public static Card getCardFromResponse(HttpResponse response)
	{
		String responseString = "";
		try {
			responseString = response.parseAsString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Card[] returnedCardArr = gson.fromJson(responseString, Card[].class);
		
		return returnedCardArr[0];		
	}


	public static Card fetchCardInfo(String card){
		
		String cardUrlToFetch = BASE_URL + "?name=\"" + card + "\"";
		
		log.debug("URL to send to API: " + cardUrlToFetch);
		
		Card fetchedCard = null;		

		
		GenericUrl url = new GenericUrl(cardUrlToFetch);
		
		try {
			HttpRequest request = REQUEST_FACTORY.buildGetRequest(url);			
			
			fetchedCard = getCardFromResponse(request.execute());			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}		
		
		return fetchedCard;

	}



}

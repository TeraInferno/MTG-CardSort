package com.cardsort.util;

import java.io.IOException;
import java.time.chrono.JapaneseChronology;

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
import com.google.gson.JsonObject;

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
	
	static final String BASE_URL = "https://api.magicthegathering.io/v1/cards";
	
	



	public ApiUtil() {
		
	}




	public static Card fetchCardInfo(String card){
		
		String cardUrlToFetch = BASE_URL + "?name=\"" + card + "\"";
		
		Card fetchedCard = null;
		
		GenericUrl url = new GenericUrl(cardUrlToFetch);
		
		try {
			HttpRequest request = REQUEST_FACTORY.buildGetRequest(url);
		
			HttpResponse response = request.execute();
						
			fetchedCard = new Card(response.parseAs(JsonObject.class));
		
			
//			String responeString = response.parseAsString();
			
//			System.out.println(responeString);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		return fetchedCard;

		


	}





}

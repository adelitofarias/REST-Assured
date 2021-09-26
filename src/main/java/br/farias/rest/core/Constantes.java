package br.farias.rest.core;

import io.restassured.http.ContentType;

public interface Constantes {
	
	/*http
	 * String APP_BASE_URL = "http://barrigarest.wcaquino.me";
	Integer APP_PORT = 80;*/

	//https
	String APP_BASE_URL = "https://barrigarest.wcaquino.me";
	Integer APP_PORT = 443;
	String APP_BASE_PATH = "";
	
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	
	Long MAX_TIMEOUT = 5000L;
}
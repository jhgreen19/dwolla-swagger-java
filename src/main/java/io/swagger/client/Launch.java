package io.swagger.client;

import io.swagger.client.ApiClient;
import io.swagger.client.api.*;
import io.swagger.client.model.*;

import static java.lang.System.out;

public class Launch {

	private final static String basePath = "https://api-sandbox.dwolla.com";
	
	//for now, get this from below URL and change EVERY 60 Minutes!
	//https://dashboard-sandbox.dwolla.com/applications-legacy
	private final static String accessToken = "Lr8WWn9YtCO82iUKHNBCokSZ9tfZzTc8xcP3V1mL3KdJd8n21K";
	//last used 2:58pm PDT, 4/25/19
	
	public static void main(String[] args) throws ApiException {
		// TODO Auto-generated method stub 

		ApiClient a = new ApiClient();
		a.setBasePath(basePath);
		a.setAccessToken(accessToken);

		CustomersApi c = new CustomersApi();

		/////////////// Abstract and move into SetUpCustomer //////////////////////
		
		CreateCustomer myNewCust = new CreateCustomer();
		myNewCust.setEmail("name@mail.com");
		myNewCust.setFirstName("First");
		myNewCust.setLastName("Last");

		Unit$ r = c.create(myNewCust);
		/*
		out.println("r.getLocationHeader(): " + r.getLocationHeader());				
		/////////////// Abstract and move into SetUpCustomer //////////////////////
		out.println("Launchit!");
		*/
	}

}

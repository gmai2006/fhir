package org.fhir.rest;

import org.fhir.pojo.Account;
import org.fhir.utils.FileUtils;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

public class TestAccount  {

	@BeforeClass
  public static void setupURL()
  {
      // here we setup the default URL and API base path to use throughout the tests
      RestAssured.baseURI = "http://localhost:8080";
      RestAssured.basePath = "/fhir/rest/";
  }
	
	@Test
	public void testFetchAll() {
		Response response = get("/Account");
		if (200 == response.getStatusCode()) {
  		List<Account> accounts = Arrays.asList(response.getBody().as(Account[].class));
  		assertEquals("Account", accounts.get(0).getResourceType());
		} else System.out.println("No data found");
	}
	
	@Test
	public void testPut() throws Exception {
		String inputFile = "/media/paul/workspace/fhir-data/examples-json/account-example.json";
		String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
		System.out.println(json);
		Response response = given().contentType("application/json").body(json)
		.when().post("/Account");
		assertEquals(200, response.getStatusCode());
	}
}

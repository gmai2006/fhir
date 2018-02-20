package org.fhir.rest;

import org.junit.Test;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

import static io.restassured.RestAssured.get;

public class TestAccount {
	@Test
	public void testAccount() throws Exception {
//		get("/Account").then().body("lotto.lottoId", equalTo(5));
	}
}

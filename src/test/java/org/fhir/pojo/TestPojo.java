package org.fhir.pojo;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.fhir.utils.FileUtils;
import org.fhir.utils.JsonUtils;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class TestPojo {
	@Test
	public void testReadAccountFromJson() throws Exception {
		String inputFile = "/media/paul/workspace/fhir-data/examples-json/account-example.json";
		
		String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
		Account account = Account.fromJson(json);
		assertEquals("Expect status", "active", account.getStatus());
		Coding coding = account.getType().getCoding().get(0);
		assertEquals("Expect code", "PBILLACCT", coding.getCode());
	}
	
	@Test
	public void testFindClassNameFromFHIRJsonFile() throws Exception {
		Path inputPath = Paths.get("../../fhir-data/examples-json/account-questionnaire.json");
		JsonObject o = JsonUtils.parseJson(inputPath);
		String className = o.get("resourceType").getAsString();
		assertEquals("Expect name", "Questionnaire", className);

		Class clazz = Class.forName("org.fhir.pojo." + className);
		
		try {
			Gson gson = new GsonBuilder().create();
			Object result = gson.fromJson(new BufferedReader(new FileReader(inputPath.toFile())), clazz);
			assertEquals("Expect name", "qs1", ((Questionnaire)result).getId());
		} catch (Exception ex) {}
	}
	
}

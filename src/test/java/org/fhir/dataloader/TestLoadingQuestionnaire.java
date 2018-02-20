package org.fhir.dataloader;

import static org.junit.Assert.assertEquals;

import java.nio.charset.Charset;
import java.util.List;

import org.fhir.GoogleGuiceTest;
import org.fhir.dao.AccountDao;
import org.fhir.dao.AccountDaoImpl;
import org.fhir.dao.QuestionnaireDao;
import org.fhir.dao.QuestionnaireDaoImpl;
import org.fhir.entity.AccountModel;
import org.fhir.pojo.Account;
import org.fhir.pojo.AccountHelper;
import org.fhir.pojo.Coding;
import org.fhir.pojo.Questionnaire;
import org.fhir.pojo.QuestionnaireHelper;
import org.fhir.service.AccountService;
import org.fhir.service.AccountServiceImpl;
import org.fhir.utils.FileUtils;
import org.junit.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Module;

public class TestLoadingQuestionnaire extends GoogleGuiceTest {
	String inputFile;
  String json;
  Object result;
  int count = 0;
  java.util.Map<String, String> duplicates = new java.util.HashMap<>();
  
	@Inject
	QuestionnaireDao questionnaireDao;

	@Override
	protected Module getTestModule() {
		return new AbstractModule() {
			@Override
			protected void configure() {
				bind(QuestionnaireDao.class).to(QuestionnaireDaoImpl.class);
			}
		};
	}
	
	@Test
	public void test() throws Exception {
		inputFile = "../../fhir-data/examples-json/testreport-questionnaire.json";
 	 json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
 	 result = QuestionnaireHelper.fromJson(json);
 	 count++;
 	 if (!duplicates.containsKey(((Questionnaire)result).getId())) {
 		 duplicates.put(((Questionnaire)result).getId(), ((Questionnaire)result).getId());
 	 } else {
 		 ((Questionnaire)result).setId(((Questionnaire)result).getId() + count);
 		 //System.out.println("Found duplicate in ... Questionnaire " + count++);
 	 }
 	 try {
 		 questionnaireDao.create((Questionnaire)result);
 	 } catch (Exception ex) { System.err.println("Cannot save Questionnaire : ../../fhir-data/examples-json/testreport-questionnaire.json due to " + ex.getMessage()); }
 	 
 	inputFile = "../../fhir-data/examples-json/endpoint-questionnaire.json";
	 json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
	 result = QuestionnaireHelper.fromJson(json);
	 count++;
	 if (!duplicates.containsKey(((Questionnaire)result).getId())) {
		 duplicates.put(((Questionnaire)result).getId(), ((Questionnaire)result).getId());
	 } else {
		 ((Questionnaire)result).setId(((Questionnaire)result).getId() + count);
		 //System.out.println("Found duplicate in ... Questionnaire " + count++);
	 }
	 try {
		 questionnaireDao.create((Questionnaire)result);
	 } catch (Exception ex) { ex.printStackTrace(); }
	 
	 inputFile = "../../fhir-data/examples-json/linkage-questionnaire.json";
	 json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
	 result = QuestionnaireHelper.fromJson(json);
	 count++;
	 if (!duplicates.containsKey(((Questionnaire)result).getId())) {
		 duplicates.put(((Questionnaire)result).getId(), ((Questionnaire)result).getId());
	 } else {
		 ((Questionnaire)result).setId(((Questionnaire)result).getId() + count);
		 //System.out.println("Found duplicate in ... Questionnaire " + count++);
	 }
	 try {
		 questionnaireDao.create((Questionnaire)result);
	 } catch (Exception ex) { ex.printStackTrace(); }
	 
	 inputFile = "../../fhir-data/examples-json/medicationrequest-questionnaire.json";
	 json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
	 result = QuestionnaireHelper.fromJson(json);
	 count++;
	 if (!duplicates.containsKey(((Questionnaire)result).getId())) {
		 duplicates.put(((Questionnaire)result).getId(), ((Questionnaire)result).getId());
	 } else {
		 ((Questionnaire)result).setId(((Questionnaire)result).getId() + count);
		 //System.out.println("Found duplicate in ... Questionnaire " + count++);
	 }
	 try {
		 questionnaireDao.create((Questionnaire)result);
	 } catch (Exception ex) { ex.printStackTrace(); }

	 inputFile = "../../fhir-data/examples-json/processresponse-questionnaire.json";
	 json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
	 result = QuestionnaireHelper.fromJson(json);
	 count++;
	 if (!duplicates.containsKey(((Questionnaire)result).getId())) {
		 duplicates.put(((Questionnaire)result).getId(), ((Questionnaire)result).getId());
	 } else {
		 ((Questionnaire)result).setId(((Questionnaire)result).getId() + count);
		 //System.out.println("Found duplicate in ... Questionnaire " + count++);
	 }
	 try {
		 questionnaireDao.create((Questionnaire)result);
	 } catch (Exception ex) { ex.printStackTrace(); }

	}
}

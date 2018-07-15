package org.fhir.dataloader;

import java.nio.charset.Charset;

import org.fhir.GoogleGuiceTest;
import org.fhir.dao.QuestionnaireDao;
import org.fhir.dao.QuestionnaireDaoImpl;
import org.fhir.pojo.Questionnaire;
import org.fhir.pojo.QuestionnaireHelper;
import org.fhir.utils.FileUtils;
import org.junit.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Module;

/**
 * A sample hand written code and will be served as blueprint
 * for code generation
 * @author paul
 *
 */
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
		inputFile = "./test/examples-json/testreport-questionnaire.json";
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
 	 } catch (Exception ex) { System.err.println("Cannot save Questionnaire : ./test/examples-json/testreport-questionnaire.json due to " + ex.getMessage()); }
 	 
 	inputFile = "./test/examples-json/endpoint-questionnaire.json";
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
	 
	 inputFile = "./test/examples-json/linkage-questionnaire.json";
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
	 
	 inputFile = "./test/examples-json/medicationrequest-questionnaire.json";
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

	 inputFile = "./test/examples-json/processresponse-questionnaire.json";
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

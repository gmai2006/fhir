package org.fhir.entity;

import static org.junit.Assert.assertEquals;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

import org.fhir.GoogleGuiceTest;
import org.fhir.dao.AccountDao;
import org.fhir.dao.AccountDaoImpl;
import org.fhir.dao.ContractDao;
import org.fhir.dao.ContractDaoImpl;
import org.fhir.dao.QuestionnaireDao;
import org.fhir.dao.QuestionnaireDaoImpl;
import org.fhir.pojo.Account;
import org.fhir.pojo.Contract;
import org.fhir.pojo.ContractHelper;
import org.fhir.pojo.Questionnaire;
import org.fhir.pojo.QuestionnaireHelper;
import org.fhir.service.AccountService;
import org.fhir.service.AccountServiceImpl;
import org.fhir.utils.FileUtils;
import org.fhir.utils.QueryBuilder;
import org.fhir.utils.QueryParser;
import org.junit.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Module;

/**
 * this class is hand written and will be served as a blueprint
 * for code generation
 * @author paul
 *
 */
public class TestAccount extends GoogleGuiceTest {
	@Inject
	AccountService service;

	@Inject
	AccountDao dao;
	
	@Inject
	ContractDao contractDao;
	
	@Inject
	QuestionnaireDao questionnaireDao;
	
	@Override
	protected Module getTestModule() {
		return new AbstractModule() {
			@Override
			protected void configure() {
				bind(AccountDao.class).to(AccountDaoImpl.class);
				bind(ContractDao.class).to(ContractDaoImpl.class);
				bind(QuestionnaireDao.class).to(QuestionnaireDaoImpl.class);
				bind(AccountService.class).to(AccountServiceImpl.class);
			}
		};
	}
	
	@Test
	public void testSelectAll() {
		System.out.println(service.selectAll());
	}
	
	@Test
	public void testFindByStatus() {
		String queryStr = "status=active";
		Map<String, String> params = QueryParser.parse(queryStr);
		System.out.println(queryStr + ":" + params);
		List<Account> accounts = dao.findByField(new QueryBuilder(params));
		System.out.println(service.selectAll());
	}
	
	@Test 
	public void testContract() throws Exception {
		String inputFile = "./test/examples-json/pcd-example-notThem.json";
  	String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
  	Object local = ContractHelper.fromJson(json);
  	Object result = contractDao.find(((Contract)local).getId());
  	if (null != result) {
  		assertEquals("Expect ", "pcd-example-notThem", ((Contract)result).getId());
  		contractDao.update( (Contract)result);
  	} else {
  		contractDao.create((Contract)local);
  	}
	}
	
	@Test
	public void testQuestionnair() throws Exception {
		String inputFile = "./test/examples-json/immunization-questionnaire.json";
		String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
  	Object local = QuestionnaireHelper.fromJson(json);
  	System.out.println("testing Questionnaire ");
  	Object result = questionnaireDao.find(((Questionnaire)local).getId());
  	if (null != result) {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  		questionnaireDao.update( (Questionnaire)result);
  	} else {
  		questionnaireDao.create((Questionnaire)local);
  	}
	}
}

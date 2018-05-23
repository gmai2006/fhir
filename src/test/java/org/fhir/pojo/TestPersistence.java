package org.fhir.pojo;

import static org.junit.Assert.assertEquals;

import java.nio.charset.Charset;
import java.util.List;

import org.fhir.GoogleGuiceTest;
import org.fhir.dao.AccountDao;
import org.fhir.dao.AccountDaoImpl;
import org.fhir.entity.AccountModel;
import org.fhir.service.AccountService;
import org.fhir.service.AccountServiceImpl;
import org.fhir.utils.FileUtils;
import org.junit.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Module;

public class TestPersistence extends GoogleGuiceTest {

	@Inject
	AccountService service;

	@Inject
	AccountDao dao;

	@Override
	protected Module getTestModule() {
		return new AbstractModule() {
			@Override
			protected void configure() {
				bind(AccountDao.class).to(AccountDaoImpl.class);
				bind(AccountService.class).to(AccountServiceImpl.class);
			}
		};
	}

	@Test
	public void testReadAccountFromJson() throws Exception {
		String inputFile = "/media/paul/workspace/fhir-data/examples-json/account-example.json";
		Account acct = null;
		String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
		Account account = AccountHelper.fromJson(json);
		assertEquals("Expect status", "active", account.getStatus());
		Coding coding = account.getType().getCoding().get(0);
		assertEquals("Expect code", "PBILLACCT", coding.getCode());
		Account local = service.find(account.getId());
		if (null != local) {
			
		} else {
			acct = service.create(account);
		}
		
		assertEquals("Expect code", "PBILLACCT", acct.getType().getCoding().get(0).getCode());
		
		List<Account> accts = service.selectAll();
		
		assertEquals("Expect status", "active", accts.get(0).getStatus());
		assertEquals("Expect code", "PBILLACCT", accts.get(0).getType().getCoding().get(0).getCode());
//		clean the test data
		service.delete(acct.getId());
	}

}

package org.fhir.entity;

import java.util.List;
import java.util.Map;

import org.fhir.GoogleGuiceTest;
import org.fhir.dao.AccountDao;
import org.fhir.dao.AccountDaoImpl;
import org.fhir.pojo.Account;
import org.fhir.service.AccountService;
import org.fhir.service.AccountServiceImpl;
import org.fhir.utils.QueryBuilder;
import org.fhir.utils.QueryParser;
import org.junit.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Module;

public class TestAccount extends GoogleGuiceTest {
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
}

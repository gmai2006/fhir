package org.fhir.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import org.fhir.dao.AccountDao;
import org.fhir.dao.AccountDaoImpl;
import org.fhir.service.AccountService;
import org.fhir.service.AccountServiceImpl;
import org.fhir.utils.FileUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class TestMockService {

	  @Rule
	  public MockitoRule mockitoRule = MockitoJUnit.rule();

	  @Mock
	  AccountDao dao;
	  
	  @Mock
	  AccountServiceImpl service;

	  @Before
	  public void before() {
	    service = new AccountServiceImpl(dao);
	  }

	  /* *
	   * SELECT a FROM oc_address  a WHERE address_id = 'param0' AND customer_id = 'param1'  
	   */
	  @Test
	  public void testgetAddressQuery() throws Exception {

	  	String inputFile = "/media/paul/workspace/fhir-data/examples-json/account-example.json";

			String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
			Account account = Account.fromJson(json);
			
	    List<Account> list = Arrays.asList(new Account[] {account});

	    when(service.selectAll()).thenReturn(list);

	    List<Account> result = service.selectAll();

	    assertEquals("Expect status", "active", result.get(0).getStatus());
	  }
}

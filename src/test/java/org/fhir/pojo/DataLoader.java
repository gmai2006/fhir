package org.fhir.pojo;

import static org.junit.Assert.assertEquals;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import org.fhir.dao.AccountDao;
import org.fhir.dao.AccountDaoImpl;
import org.fhir.entity.AccountModel;
import org.fhir.service.AccountService;
import org.fhir.service.AccountServiceImpl;
import org.fhir.utils.FileUtils;
import org.junit.After;
import org.junit.Before;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;

public class DataLoader {
  static Injector injector;
  static PersistService service;
  String inputFile;
  String json;
  
 	@Inject
	AccountDao dao;

  @Before
  public void setup() {
    final List<Module> modules = getModules();
    injector = Guice.createInjector(modules);
    service = injector.getInstance(PersistService.class);
    injector.injectMembers(this);
    service.start();
  }

  @After
  public void tearDownJpa() throws Exception {
    service.stop();
  }
  
  protected List<Module> getModules() {
  	return Arrays.asList(new AbstractModule() {
      @Override
      protected void configure() {
        install(new JpaPersistModule("fhirtest"));
        final Module testModule = getTestModule();
        if (null != testModule) {
            install(testModule);
        }
      }
    });
  }
  
  protected Module getTestModule() {
  	return new AbstractModule() {
			@Override
			protected void configure() {
				bind(AccountDao.class).to(AccountDaoImpl.class);
			}
		};
  }
  
  public void loadDataFromFiles() throws Exception {
		inputFile = "/media/paul/workspace/fhir-data/examples-json/account-example.json";
		json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
		Account account = AccountHelper.fromJson(json);
		Account acct = dao.create(account);
	}

}

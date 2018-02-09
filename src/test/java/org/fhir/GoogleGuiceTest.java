package org.fhir;


	import java.util.Arrays;
	import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
	import com.google.inject.Module;
	import com.google.inject.persist.PersistService;
	import com.google.inject.persist.jpa.JpaPersistModule;
	import com.google.inject.AbstractModule;
	/**
	 * Base class for test cases that need to use Guice injection.
	 */
	
	public abstract class GoogleGuiceTest {
    protected Injector injector;
    protected PersistService service;

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
    
    protected abstract Module getTestModule();
}

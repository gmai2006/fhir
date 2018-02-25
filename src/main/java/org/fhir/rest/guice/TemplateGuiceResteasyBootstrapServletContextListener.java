package org.fhir.rest.guice;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;

import org.fhir.pojo.Patient;
import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;

import com.google.inject.Module;


public class TemplateGuiceResteasyBootstrapServletContextListener extends GuiceResteasyBootstrapServletContextListener {
	@Override
  protected List<? extends Module> getModules(final ServletContext context) {
      final List<com.google.inject.Module> result = Arrays.asList(
      		new FhirModule());
      return result;
  }
}

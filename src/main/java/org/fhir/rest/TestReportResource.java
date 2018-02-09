/*
 * #%L
 * FHIR Implementation
 * %%
 * Copyright (C) 2018 DataScience 9 LLC
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
 
/**
 * This code is 100% AUTO generated. Please do not modify it DIRECTLY
 * If you need new features or function or changes please update the templates
 * then submit the template through our web interface.  
 */

package org.fhir.rest;

import static java.util.Objects.requireNonNull;

import java.util.List;

import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.QueryParam;
import javax.ws.rs.PUT;

import com.google.inject.Inject;

import org.fhir.pojo.TestReport;
import org.fhir.service.TestReportService;

@Path("/TestReport")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class TestReportResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final TestReportService service;

  @Inject
  public TestReportResource(final TestReportService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public TestReport create(TestReport obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public TestReport update( TestReport obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public TestReport find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<TestReport> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<TestReport> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
      return service.select(input);
  }

  /** TBD*/
  /**
  * Descr: An external identifier for the test report
  * expr: identifier
  * Xpath: f:TestReport/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public TestReport identifier(@QueryParam("identifier")String identifier) {
  	return new TestReport();
  }
  /**
  * Descr: The test report generation date
  * expr: issued
  * Xpath: f:TestReport/f:issued
  * Type: date
  * Code: issued
  */
  @GET
  @Path("issued")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public TestReport issued(@QueryParam("issued")String issued) {
  	return new TestReport();
  }
  /**
  * Descr: The reference to a participant in the test execution
  * expr: uri
  * Xpath: f:TestReport/f:participant/f:uri
  * Type: uri
  * Code: participant
  */
  @GET
  @Path("uri")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public TestReport participant(@QueryParam("participant")String participant) {
  	return new TestReport();
  }
  /**
  * Descr: The result disposition of the test execution
  * expr: result
  * Xpath: f:TestReport/f:result
  * Type: token
  * Code: result
  */
  @GET
  @Path("result")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public TestReport result(@QueryParam("result")String result) {
  	return new TestReport();
  }
  /**
  * Descr: The name of the testing organization
  * expr: tester
  * Xpath: f:TestReport/f:tester
  * Type: string
  * Code: tester
  */
  @GET
  @Path("tester")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public TestReport tester(@QueryParam("tester")String tester) {
  	return new TestReport();
  }
  /**
  * Descr: The test script executed to produce this report
  * expr: testScript
  * Xpath: f:TestReport/f:testScript
  * Type: reference
  * Code: testscript
  */
  @GET
  @Path("testScript")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public TestReport testscript() {
  	return new TestReport();
  }
}
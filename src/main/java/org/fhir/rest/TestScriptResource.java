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

import org.fhir.pojo.TestScript;
import org.fhir.service.TestScriptService;

@Path("/TestScript")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class TestScriptResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final TestScriptService service;

  @Inject
  public TestScriptResource(final TestScriptService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public TestScript create(TestScript obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public TestScript update( TestScript obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public TestScript find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<TestScript> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<TestScript> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The test script publication date
  * expr: date
  * Xpath: f:TestScript/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public TestScript date(@QueryParam("date")String date) {
  	return new TestScript();
  }
  /**
  * Descr: The description of the test script
  * expr: description
  * Xpath: f:TestScript/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public TestScript description(@QueryParam("description")String description) {
  	return new TestScript();
  }
  /**
  * Descr: External identifier for the test script
  * expr: identifier
  * Xpath: f:TestScript/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public TestScript identifier(@QueryParam("identifier")String identifier) {
  	return new TestScript();
  }
  /**
  * Descr: Intended jurisdiction for the test script
  * expr: jurisdiction
  * Xpath: f:TestScript/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public TestScript jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new TestScript();
  }
  /**
  * Descr: Computationally friendly name of the test script
  * expr: name
  * Xpath: f:TestScript/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public TestScript name(@QueryParam("name")String name) {
  	return new TestScript();
  }
  /**
  * Descr: Name of the publisher of the test script
  * expr: publisher
  * Xpath: f:TestScript/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public TestScript publisher(@QueryParam("publisher")String publisher) {
  	return new TestScript();
  }
  /**
  * Descr: The current status of the test script
  * expr: status
  * Xpath: f:TestScript/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public TestScript status(@QueryParam("status")String status) {
  	return new TestScript();
  }
  /**
  * Descr: TestScript required and validated capability
  * expr: description
  * Xpath: f:TestScript/f:metadata/f:capability/f:description
  * Type: string
  * Code: testscriptcapability
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public TestScript testscriptcapability(@QueryParam("testscriptcapability")String testscriptcapability) {
  	return new TestScript();
  }
  /**
  * Descr: The human-friendly name of the test script
  * expr: title
  * Xpath: f:TestScript/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public TestScript title(@QueryParam("title")String title) {
  	return new TestScript();
  }
  /**
  * Descr: The uri that identifies the test script
  * expr: url
  * Xpath: f:TestScript/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public TestScript url(@QueryParam("url")String url) {
  	return new TestScript();
  }
  /**
  * Descr: The business version of the test script
  * expr: version
  * Xpath: f:TestScript/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public TestScript version(@QueryParam("version")String version) {
  	return new TestScript();
  }
}
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

import org.fhir.pojo.ExpansionProfile;
import org.fhir.service.ExpansionProfileService;

@Path("/ExpansionProfile")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ExpansionProfileResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ExpansionProfileService service;

  @Inject
  public ExpansionProfileResource(final ExpansionProfileService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public ExpansionProfile create(ExpansionProfile obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public ExpansionProfile update( ExpansionProfile obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public ExpansionProfile find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<ExpansionProfile> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<ExpansionProfile> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The expansion profile publication date
  * expr: date
  * Xpath: f:ExpansionProfile/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExpansionProfile date(@QueryParam("date")String date) {
  	return new ExpansionProfile();
  }
  /**
  * Descr: The description of the expansion profile
  * expr: description
  * Xpath: f:ExpansionProfile/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExpansionProfile description(@QueryParam("description")String description) {
  	return new ExpansionProfile();
  }
  /**
  * Descr: External identifier for the expansion profile
  * expr: identifier
  * Xpath: f:ExpansionProfile/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExpansionProfile identifier(@QueryParam("identifier")String identifier) {
  	return new ExpansionProfile();
  }
  /**
  * Descr: Intended jurisdiction for the expansion profile
  * expr: jurisdiction
  * Xpath: f:ExpansionProfile/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExpansionProfile jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new ExpansionProfile();
  }
  /**
  * Descr: Computationally friendly name of the expansion profile
  * expr: name
  * Xpath: f:ExpansionProfile/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExpansionProfile name(@QueryParam("name")String name) {
  	return new ExpansionProfile();
  }
  /**
  * Descr: Name of the publisher of the expansion profile
  * expr: publisher
  * Xpath: f:ExpansionProfile/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExpansionProfile publisher(@QueryParam("publisher")String publisher) {
  	return new ExpansionProfile();
  }
  /**
  * Descr: The current status of the expansion profile
  * expr: status
  * Xpath: f:ExpansionProfile/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExpansionProfile status(@QueryParam("status")String status) {
  	return new ExpansionProfile();
  }
  /**
  * Descr: The uri that identifies the expansion profile
  * expr: url
  * Xpath: f:ExpansionProfile/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExpansionProfile url(@QueryParam("url")String url) {
  	return new ExpansionProfile();
  }
  /**
  * Descr: The business version of the expansion profile
  * expr: version
  * Xpath: f:ExpansionProfile/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExpansionProfile version(@QueryParam("version")String version) {
  	return new ExpansionProfile();
  }
}
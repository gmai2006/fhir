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

import org.fhir.pojo.CodeSystem;
import org.fhir.service.CodeSystemService;

@Path("/CodeSystem")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class CodeSystemResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CodeSystemService service;

  @Inject
  public CodeSystemResource(final CodeSystemService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public CodeSystem create(CodeSystem obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public CodeSystem update( CodeSystem obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public CodeSystem find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<CodeSystem> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<CodeSystem> findWithLimit(@PathParam("max") String max) {
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
  * Descr: A code defined in the code system
  * expr: code
  * Xpath: f:CodeSystem/f:concept/f:code
  * Type: token
  * Code: code
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CodeSystem code(@QueryParam("code")String code) {
  	return new CodeSystem();
  }
  /**
  * Descr: not-present | example | fragment | complete
  * expr: content
  * Xpath: f:CodeSystem/f:content
  * Type: token
  * Code: contentmode
  */
  @GET
  @Path("content")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CodeSystem contentmode(@QueryParam("contentmode")String contentmode) {
  	return new CodeSystem();
  }
  /**
  * Descr: The code system publication date
  * expr: date
  * Xpath: f:CodeSystem/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CodeSystem date(@QueryParam("date")String date) {
  	return new CodeSystem();
  }
  /**
  * Descr: The description of the code system
  * expr: description
  * Xpath: f:CodeSystem/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CodeSystem description(@QueryParam("description")String description) {
  	return new CodeSystem();
  }
  /**
  * Descr: External identifier for the code system
  * expr: identifier
  * Xpath: f:CodeSystem/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CodeSystem identifier(@QueryParam("identifier")String identifier) {
  	return new CodeSystem();
  }
  /**
  * Descr: Intended jurisdiction for the code system
  * expr: jurisdiction
  * Xpath: f:CodeSystem/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CodeSystem jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new CodeSystem();
  }
  /**
  * Descr: A language in which a designation is provided
  * expr: language
  * Xpath: f:CodeSystem/f:concept/f:designation/f:language
  * Type: token
  * Code: language
  */
  @GET
  @Path("language")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CodeSystem language(@QueryParam("language")String language) {
  	return new CodeSystem();
  }
  /**
  * Descr: Computationally friendly name of the code system
  * expr: name
  * Xpath: f:CodeSystem/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CodeSystem name(@QueryParam("name")String name) {
  	return new CodeSystem();
  }
  /**
  * Descr: Name of the publisher of the code system
  * expr: publisher
  * Xpath: f:CodeSystem/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CodeSystem publisher(@QueryParam("publisher")String publisher) {
  	return new CodeSystem();
  }
  /**
  * Descr: The current status of the code system
  * expr: status
  * Xpath: f:CodeSystem/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CodeSystem status(@QueryParam("status")String status) {
  	return new CodeSystem();
  }
  /**
  * Descr: The system for any codes defined by this code system (same as 'url')
  * expr: url
  * Xpath: f:CodeSystem/f:url
  * Type: uri
  * Code: system
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CodeSystem system(@QueryParam("system")String system) {
  	return new CodeSystem();
  }
  /**
  * Descr: The human-friendly name of the code system
  * expr: title
  * Xpath: f:CodeSystem/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CodeSystem title(@QueryParam("title")String title) {
  	return new CodeSystem();
  }
  /**
  * Descr: The uri that identifies the code system
  * expr: url
  * Xpath: f:CodeSystem/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CodeSystem url(@QueryParam("url")String url) {
  	return new CodeSystem();
  }
  /**
  * Descr: The business version of the code system
  * expr: version
  * Xpath: f:CodeSystem/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CodeSystem version(@QueryParam("version")String version) {
  	return new CodeSystem();
  }
}
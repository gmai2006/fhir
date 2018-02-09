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

import org.fhir.pojo.Questionnaire;
import org.fhir.service.QuestionnaireService;

@Path("/Questionnaire")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class QuestionnaireResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final QuestionnaireService service;

  @Inject
  public QuestionnaireResource(final QuestionnaireService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Questionnaire create(Questionnaire obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Questionnaire update( Questionnaire obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Questionnaire find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Questionnaire> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Questionnaire> findWithLimit(@PathParam("max") String max) {
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
  * Descr: A code that corresponds to one of its items in the questionnaire
  * expr: code
  * Xpath: f:Questionnaire/f:item/f:code
  * Type: token
  * Code: code
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Questionnaire code(@QueryParam("code")String code) {
  	return new Questionnaire();
  }
  /**
  * Descr: The questionnaire publication date
  * expr: date
  * Xpath: f:Questionnaire/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Questionnaire date(@QueryParam("date")String date) {
  	return new Questionnaire();
  }
  /**
  * Descr: The description of the questionnaire
  * expr: description
  * Xpath: f:Questionnaire/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Questionnaire description(@QueryParam("description")String description) {
  	return new Questionnaire();
  }
  /**
  * Descr: The time during which the questionnaire is intended to be in use
  * expr: effectivePeriod
  * Xpath: f:Questionnaire/f:effectivePeriod
  * Type: date
  * Code: effective
  */
  @GET
  @Path("effectivePeriod")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Questionnaire effective(@QueryParam("effective")String effective) {
  	return new Questionnaire();
  }
  /**
  * Descr: External identifier for the questionnaire
  * expr: identifier
  * Xpath: f:Questionnaire/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Questionnaire identifier(@QueryParam("identifier")String identifier) {
  	return new Questionnaire();
  }
  /**
  * Descr: Intended jurisdiction for the questionnaire
  * expr: jurisdiction
  * Xpath: f:Questionnaire/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Questionnaire jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new Questionnaire();
  }
  /**
  * Descr: Computationally friendly name of the questionnaire
  * expr: name
  * Xpath: f:Questionnaire/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Questionnaire name(@QueryParam("name")String name) {
  	return new Questionnaire();
  }
  /**
  * Descr: Name of the publisher of the questionnaire
  * expr: publisher
  * Xpath: f:Questionnaire/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Questionnaire publisher(@QueryParam("publisher")String publisher) {
  	return new Questionnaire();
  }
  /**
  * Descr: The current status of the questionnaire
  * expr: status
  * Xpath: f:Questionnaire/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Questionnaire status(@QueryParam("status")String status) {
  	return new Questionnaire();
  }
  /**
  * Descr: The human-friendly name of the questionnaire
  * expr: title
  * Xpath: f:Questionnaire/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Questionnaire title(@QueryParam("title")String title) {
  	return new Questionnaire();
  }
  /**
  * Descr: The uri that identifies the questionnaire
  * expr: url
  * Xpath: f:Questionnaire/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Questionnaire url(@QueryParam("url")String url) {
  	return new Questionnaire();
  }
  /**
  * Descr: The business version of the questionnaire
  * expr: version
  * Xpath: f:Questionnaire/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Questionnaire version(@QueryParam("version")String version) {
  	return new Questionnaire();
  }
}
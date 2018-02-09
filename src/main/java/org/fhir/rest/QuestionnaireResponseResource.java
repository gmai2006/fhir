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

import org.fhir.pojo.QuestionnaireResponse;
import org.fhir.service.QuestionnaireResponseService;

@Path("/QuestionnaireResponse")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class QuestionnaireResponseResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final QuestionnaireResponseService service;

  @Inject
  public QuestionnaireResponseResource(final QuestionnaireResponseService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public QuestionnaireResponse create(QuestionnaireResponse obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public QuestionnaireResponse update( QuestionnaireResponse obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public QuestionnaireResponse find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<QuestionnaireResponse> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<QuestionnaireResponse> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The author of the questionnaire response
  * expr: author
  * Xpath: f:QuestionnaireResponse/f:author
  * Type: reference
  * Code: author
  */
  @GET
  @Path("author")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public QuestionnaireResponse author() {
  	return new QuestionnaireResponse();
  }
  /**
  * Descr: When the questionnaire response was last changed
  * expr: authored
  * Xpath: f:QuestionnaireResponse/f:authored
  * Type: date
  * Code: authored
  */
  @GET
  @Path("authored")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public QuestionnaireResponse authored(@QueryParam("authored")String authored) {
  	return new QuestionnaireResponse();
  }
  /**
  * Descr: Plan/proposal/order fulfilled by this questionnaire response
  * expr: basedOn
  * Xpath: f:QuestionnaireResponse/f:basedOn
  * Type: reference
  * Code: basedon
  */
  @GET
  @Path("basedOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public QuestionnaireResponse basedon() {
  	return new QuestionnaireResponse();
  }
  /**
  * Descr: Encounter or episode associated with the questionnaire response
  * expr: context
  * Xpath: f:QuestionnaireResponse/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public QuestionnaireResponse context() {
  	return new QuestionnaireResponse();
  }
  /**
  * Descr: The unique identifier for the questionnaire response
  * expr: identifier
  * Xpath: f:QuestionnaireResponse/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public QuestionnaireResponse identifier(@QueryParam("identifier")String identifier) {
  	return new QuestionnaireResponse();
  }
  /**
  * Descr: Procedure or observation this questionnaire response was performed as a part of
  * expr: parent
  * Xpath: f:QuestionnaireResponse/f:parent
  * Type: reference
  * Code: parent
  */
  @GET
  @Path("parent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public QuestionnaireResponse parent() {
  	return new QuestionnaireResponse();
  }
  /**
  * Descr: The patient that is the subject of the questionnaire response
  * expr: subject
  * Xpath: f:QuestionnaireResponse/f:subject
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public QuestionnaireResponse patient() {
  	return new QuestionnaireResponse();
  }
  /**
  * Descr: The questionnaire the answers are provided for
  * expr: questionnaire
  * Xpath: f:QuestionnaireResponse/f:questionnaire
  * Type: reference
  * Code: questionnaire
  */
  @GET
  @Path("questionnaire")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public QuestionnaireResponse questionnaire() {
  	return new QuestionnaireResponse();
  }
  /**
  * Descr: The individual providing the information reflected in the questionnaire respose
  * expr: source
  * Xpath: f:QuestionnaireResponse/f:source
  * Type: reference
  * Code: source
  */
  @GET
  @Path("source")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public QuestionnaireResponse source() {
  	return new QuestionnaireResponse();
  }
  /**
  * Descr: The status of the questionnaire response
  * expr: status
  * Xpath: f:QuestionnaireResponse/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public QuestionnaireResponse status(@QueryParam("status")String status) {
  	return new QuestionnaireResponse();
  }
  /**
  * Descr: The subject of the questionnaire response
  * expr: subject
  * Xpath: f:QuestionnaireResponse/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public QuestionnaireResponse subject() {
  	return new QuestionnaireResponse();
  }
}
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

import org.fhir.pojo.ProcedureRequest;
import org.fhir.service.ProcedureRequestService;

@Path("/ProcedureRequest")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ProcedureRequestResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ProcedureRequestService service;

  @Inject
  public ProcedureRequestResource(final ProcedureRequestService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public ProcedureRequest create(ProcedureRequest obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public ProcedureRequest update( ProcedureRequest obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public ProcedureRequest find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<ProcedureRequest> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<ProcedureRequest> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Date request signed
  * expr: authoredOn
  * Xpath: f:ProcedureRequest/f:authoredOn
  * Type: date
  * Code: authored
  */
  @GET
  @Path("authoredOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcedureRequest authored(@QueryParam("authored")String authored) {
  	return new ProcedureRequest();
  }
  /**
  * Descr: What request fulfills
  * expr: basedOn
  * Xpath: f:ProcedureRequest/f:basedOn
  * Type: reference
  * Code: basedon
  */
  @GET
  @Path("basedOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcedureRequest basedon() {
  	return new ProcedureRequest();
  }
  /**
  * Descr: Where procedure is going to be done
  * expr: bodySite
  * Xpath: f:ProcedureRequest/f:bodySite
  * Type: token
  * Code: bodysite
  */
  @GET
  @Path("bodySite")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcedureRequest bodysite(@QueryParam("bodysite")String bodysite) {
  	return new ProcedureRequest();
  }
  /**
  * Descr: Encounter or Episode during which request was created
  * expr: context
  * Xpath: f:ProcedureRequest/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcedureRequest context() {
  	return new ProcedureRequest();
  }
  /**
  * Descr: Protocol or definition
  * expr: definition
  * Xpath: f:ProcedureRequest/f:definition
  * Type: reference
  * Code: definition
  */
  @GET
  @Path("definition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcedureRequest definition() {
  	return new ProcedureRequest();
  }
  /**
  * Descr: proposal | plan | order +
  * expr: intent
  * Xpath: f:ProcedureRequest/f:intent
  * Type: token
  * Code: intent
  */
  @GET
  @Path("intent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcedureRequest intent(@QueryParam("intent")String intent) {
  	return new ProcedureRequest();
  }
  /**
  * Descr: When procedure should occur
  * expr: occurrence
  * Xpath: f:ProcedureRequest/f:occurrenceDateTime | f:ProcedureRequest/f:occurrencePeriod | f:ProcedureRequest/f:occurrenceTiming
  * Type: date
  * Code: occurrence
  */
  @GET
  @Path("occurrence")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcedureRequest occurrence(@QueryParam("occurrence")String occurrence) {
  	return new ProcedureRequest();
  }
  /**
  * Descr: Requested perfomer
  * expr: performer
  * Xpath: f:ProcedureRequest/f:performer
  * Type: reference
  * Code: performer
  */
  @GET
  @Path("performer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcedureRequest performer() {
  	return new ProcedureRequest();
  }
  /**
  * Descr: Performer role
  * expr: performerType
  * Xpath: f:ProcedureRequest/f:performerType
  * Type: token
  * Code: performertype
  */
  @GET
  @Path("performerType")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcedureRequest performertype(@QueryParam("performertype")String performertype) {
  	return new ProcedureRequest();
  }
  /**
  * Descr: routine | urgent | asap | stat
  * expr: priority
  * Xpath: f:ProcedureRequest/f:priority
  * Type: token
  * Code: priority
  */
  @GET
  @Path("priority")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcedureRequest priority(@QueryParam("priority")String priority) {
  	return new ProcedureRequest();
  }
  /**
  * Descr: What request replaces
  * expr: replaces
  * Xpath: f:ProcedureRequest/f:replaces
  * Type: reference
  * Code: replaces
  */
  @GET
  @Path("replaces")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcedureRequest replaces() {
  	return new ProcedureRequest();
  }
  /**
  * Descr: Individual making the request
  * expr: agent
  * Xpath: f:ProcedureRequest/f:requester/f:agent
  * Type: reference
  * Code: requester
  */
  @GET
  @Path("agent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcedureRequest requester() {
  	return new ProcedureRequest();
  }
  /**
  * Descr: Composite Request ID
  * expr: requisition
  * Xpath: f:ProcedureRequest/f:requisition
  * Type: token
  * Code: requisition
  */
  @GET
  @Path("requisition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcedureRequest requisition(@QueryParam("requisition")String requisition) {
  	return new ProcedureRequest();
  }
  /**
  * Descr: Specimen to be tested
  * expr: specimen
  * Xpath: f:ProcedureRequest/f:specimen
  * Type: reference
  * Code: specimen
  */
  @GET
  @Path("specimen")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcedureRequest specimen() {
  	return new ProcedureRequest();
  }
  /**
  * Descr: draft | active | suspended | completed | entered-in-error | cancelled
  * expr: status
  * Xpath: f:ProcedureRequest/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcedureRequest status(@QueryParam("status")String status) {
  	return new ProcedureRequest();
  }
  /**
  * Descr: Search by subject
  * expr: subject
  * Xpath: f:ProcedureRequest/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcedureRequest subject() {
  	return new ProcedureRequest();
  }
}
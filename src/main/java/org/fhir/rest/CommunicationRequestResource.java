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

import org.fhir.pojo.CommunicationRequest;
import org.fhir.service.CommunicationRequestService;

@Path("/CommunicationRequest")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class CommunicationRequestResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CommunicationRequestService service;

  @Inject
  public CommunicationRequestResource(final CommunicationRequestService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public CommunicationRequest create(CommunicationRequest obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public CommunicationRequest update( CommunicationRequest obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public CommunicationRequest find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<CommunicationRequest> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<CommunicationRequest> findWithLimit(@PathParam("max") String max) {
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
  * Descr: When request transitioned to being actionable
  * expr: authoredOn
  * Xpath: f:CommunicationRequest/f:authoredOn
  * Type: date
  * Code: authored
  */
  @GET
  @Path("authoredOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CommunicationRequest authored(@QueryParam("authored")String authored) {
  	return new CommunicationRequest();
  }
  /**
  * Descr: Fulfills plan or proposal
  * expr: basedOn
  * Xpath: f:CommunicationRequest/f:basedOn
  * Type: reference
  * Code: basedon
  */
  @GET
  @Path("basedOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CommunicationRequest basedon() {
  	return new CommunicationRequest();
  }
  /**
  * Descr: Message category
  * expr: category
  * Xpath: f:CommunicationRequest/f:category
  * Type: token
  * Code: category
  */
  @GET
  @Path("category")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CommunicationRequest category(@QueryParam("category")String category) {
  	return new CommunicationRequest();
  }
  /**
  * Descr: Encounter or episode leading to message
  * expr: context
  * Xpath: f:CommunicationRequest/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CommunicationRequest context() {
  	return new CommunicationRequest();
  }
  /**
  * Descr: Encounter leading to message
  * expr: context
  * Xpath: f:CommunicationRequest/f:context
  * Type: reference
  * Code: encounter
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CommunicationRequest encounter() {
  	return new CommunicationRequest();
  }
  /**
  * Descr: Composite request this is part of
  * expr: groupIdentifier
  * Xpath: f:CommunicationRequest/f:groupIdentifier
  * Type: token
  * Code: groupidentifier
  */
  @GET
  @Path("groupIdentifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CommunicationRequest groupidentifier(@QueryParam("groupidentifier")String groupidentifier) {
  	return new CommunicationRequest();
  }
  /**
  * Descr: Unique identifier
  * expr: identifier
  * Xpath: f:CommunicationRequest/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CommunicationRequest identifier(@QueryParam("identifier")String identifier) {
  	return new CommunicationRequest();
  }
  /**
  * Descr: A channel of communication
  * expr: medium
  * Xpath: f:CommunicationRequest/f:medium
  * Type: token
  * Code: medium
  */
  @GET
  @Path("medium")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CommunicationRequest medium(@QueryParam("medium")String medium) {
  	return new CommunicationRequest();
  }
  /**
  * Descr: When scheduled
  * expr: as(DateTime)
  * Xpath: f:CommunicationRequest/f:occurrenceDateTime
  * Type: date
  * Code: occurrence
  */
  @GET
  @Path("as(DateTime)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CommunicationRequest occurrence(@QueryParam("occurrence")String occurrence) {
  	return new CommunicationRequest();
  }
  /**
  * Descr: Focus of message
  * expr: subject
  * Xpath: f:CommunicationRequest/f:subject
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CommunicationRequest patient() {
  	return new CommunicationRequest();
  }
  /**
  * Descr: Message urgency
  * expr: priority
  * Xpath: f:CommunicationRequest/f:priority
  * Type: token
  * Code: priority
  */
  @GET
  @Path("priority")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CommunicationRequest priority(@QueryParam("priority")String priority) {
  	return new CommunicationRequest();
  }
  /**
  * Descr: Message recipient
  * expr: recipient
  * Xpath: f:CommunicationRequest/f:recipient
  * Type: reference
  * Code: recipient
  */
  @GET
  @Path("recipient")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CommunicationRequest recipient() {
  	return new CommunicationRequest();
  }
  /**
  * Descr: Request(s) replaced by this request
  * expr: replaces
  * Xpath: f:CommunicationRequest/f:replaces
  * Type: reference
  * Code: replaces
  */
  @GET
  @Path("replaces")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CommunicationRequest replaces() {
  	return new CommunicationRequest();
  }
  /**
  * Descr: Individual making the request
  * expr: agent
  * Xpath: f:CommunicationRequest/f:requester/f:agent
  * Type: reference
  * Code: requester
  */
  @GET
  @Path("agent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CommunicationRequest requester() {
  	return new CommunicationRequest();
  }
  /**
  * Descr: Message sender
  * expr: sender
  * Xpath: f:CommunicationRequest/f:sender
  * Type: reference
  * Code: sender
  */
  @GET
  @Path("sender")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CommunicationRequest sender() {
  	return new CommunicationRequest();
  }
  /**
  * Descr: draft | active | suspended | cancelled | completed | entered-in-error | unknown
  * expr: status
  * Xpath: f:CommunicationRequest/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CommunicationRequest status(@QueryParam("status")String status) {
  	return new CommunicationRequest();
  }
  /**
  * Descr: Focus of message
  * expr: subject
  * Xpath: f:CommunicationRequest/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CommunicationRequest subject() {
  	return new CommunicationRequest();
  }
}
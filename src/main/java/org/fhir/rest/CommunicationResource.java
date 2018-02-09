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

import org.fhir.pojo.Communication;
import org.fhir.service.CommunicationService;

@Path("/Communication")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class CommunicationResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CommunicationService service;

  @Inject
  public CommunicationResource(final CommunicationService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Communication create(Communication obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Communication update( Communication obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Communication find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Communication> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Communication> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Request fulfilled by this communication
  * expr: basedOn
  * Xpath: f:Communication/f:basedOn
  * Type: reference
  * Code: basedon
  */
  @GET
  @Path("basedOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Communication basedon() {
  	return new Communication();
  }
  /**
  * Descr: Message category
  * expr: category
  * Xpath: f:Communication/f:category
  * Type: token
  * Code: category
  */
  @GET
  @Path("category")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Communication category(@QueryParam("category")String category) {
  	return new Communication();
  }
  /**
  * Descr: Encounter or episode leading to message
  * expr: context
  * Xpath: f:Communication/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Communication context() {
  	return new Communication();
  }
  /**
  * Descr: Instantiates protocol or definition
  * expr: definition
  * Xpath: f:Communication/f:definition
  * Type: reference
  * Code: definition
  */
  @GET
  @Path("definition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Communication definition() {
  	return new Communication();
  }
  /**
  * Descr: Encounter leading to message
  * expr: context
  * Xpath: f:Communication/f:context
  * Type: reference
  * Code: encounter
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Communication encounter() {
  	return new Communication();
  }
  /**
  * Descr: Unique identifier
  * expr: identifier
  * Xpath: f:Communication/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Communication identifier(@QueryParam("identifier")String identifier) {
  	return new Communication();
  }
  /**
  * Descr: A channel of communication
  * expr: medium
  * Xpath: f:Communication/f:medium
  * Type: token
  * Code: medium
  */
  @GET
  @Path("medium")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Communication medium(@QueryParam("medium")String medium) {
  	return new Communication();
  }
  /**
  * Descr: Part of this action
  * expr: partOf
  * Xpath: f:Communication/f:partOf
  * Type: reference
  * Code: partof
  */
  @GET
  @Path("partOf")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Communication partof() {
  	return new Communication();
  }
  /**
  * Descr: Focus of message
  * expr: subject
  * Xpath: f:Communication/f:subject
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Communication patient() {
  	return new Communication();
  }
  /**
  * Descr: When received
  * expr: received
  * Xpath: f:Communication/f:received
  * Type: date
  * Code: received
  */
  @GET
  @Path("received")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Communication received(@QueryParam("received")String received) {
  	return new Communication();
  }
  /**
  * Descr: Message recipient
  * expr: recipient
  * Xpath: f:Communication/f:recipient
  * Type: reference
  * Code: recipient
  */
  @GET
  @Path("recipient")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Communication recipient() {
  	return new Communication();
  }
  /**
  * Descr: Message sender
  * expr: sender
  * Xpath: f:Communication/f:sender
  * Type: reference
  * Code: sender
  */
  @GET
  @Path("sender")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Communication sender() {
  	return new Communication();
  }
  /**
  * Descr: When sent
  * expr: sent
  * Xpath: f:Communication/f:sent
  * Type: date
  * Code: sent
  */
  @GET
  @Path("sent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Communication sent(@QueryParam("sent")String sent) {
  	return new Communication();
  }
  /**
  * Descr: preparation | in-progress | suspended | aborted | completed | entered-in-error
  * expr: status
  * Xpath: f:Communication/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Communication status(@QueryParam("status")String status) {
  	return new Communication();
  }
  /**
  * Descr: Focus of message
  * expr: subject
  * Xpath: f:Communication/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Communication subject() {
  	return new Communication();
  }
}
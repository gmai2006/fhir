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

import org.fhir.pojo.RequestGroup;
import org.fhir.service.RequestGroupService;

@Path("/RequestGroup")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class RequestGroupResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final RequestGroupService service;

  @Inject
  public RequestGroupResource(final RequestGroupService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public RequestGroup create(RequestGroup obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public RequestGroup update( RequestGroup obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public RequestGroup find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<RequestGroup> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<RequestGroup> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The author of the request group
  * expr: author
  * Xpath: f:RequestGroup/f:author
  * Type: reference
  * Code: author
  */
  @GET
  @Path("author")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RequestGroup author() {
  	return new RequestGroup();
  }
  /**
  * Descr: The date the request group was authored
  * expr: authoredOn
  * Xpath: f:RequestGroup/f:authoredOn
  * Type: date
  * Code: authored
  */
  @GET
  @Path("authoredOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RequestGroup authored(@QueryParam("authored")String authored) {
  	return new RequestGroup();
  }
  /**
  * Descr: The context the request group applies to
  * expr: context
  * Xpath: f:RequestGroup/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RequestGroup context() {
  	return new RequestGroup();
  }
  /**
  * Descr: The definition from which the request group is realized
  * expr: definition
  * Xpath: f:RequestGroup/f:definition
  * Type: reference
  * Code: definition
  */
  @GET
  @Path("definition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RequestGroup definition() {
  	return new RequestGroup();
  }
  /**
  * Descr: The encounter the request group applies to
  * expr: context
  * Xpath: f:RequestGroup/f:context
  * Type: reference
  * Code: encounter
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RequestGroup encounter() {
  	return new RequestGroup();
  }
  /**
  * Descr: The group identifier for the request group
  * expr: groupIdentifier
  * Xpath: f:RequestGroup/f:groupIdentifier
  * Type: token
  * Code: groupidentifier
  */
  @GET
  @Path("groupIdentifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RequestGroup groupidentifier(@QueryParam("groupidentifier")String groupidentifier) {
  	return new RequestGroup();
  }
  /**
  * Descr: External identifiers for the request group
  * expr: identifier
  * Xpath: f:RequestGroup/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RequestGroup identifier(@QueryParam("identifier")String identifier) {
  	return new RequestGroup();
  }
  /**
  * Descr: The intent of the request group
  * expr: intent
  * Xpath: f:RequestGroup/f:intent
  * Type: token
  * Code: intent
  */
  @GET
  @Path("intent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RequestGroup intent(@QueryParam("intent")String intent) {
  	return new RequestGroup();
  }
  /**
  * Descr: The participant in the requests in the group
  * expr: participant
  * Xpath: f:RequestGroup/f:action/f:participant
  * Type: reference
  * Code: participant
  */
  @GET
  @Path("participant")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RequestGroup participant() {
  	return new RequestGroup();
  }
  /**
  * Descr: The identity of a patient to search for request groups
  * expr: subject
  * Xpath: f:RequestGroup/f:subject
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RequestGroup patient() {
  	return new RequestGroup();
  }
  /**
  * Descr: The priority of the request group
  * expr: priority
  * Xpath: f:RequestGroup/f:priority
  * Type: token
  * Code: priority
  */
  @GET
  @Path("priority")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RequestGroup priority(@QueryParam("priority")String priority) {
  	return new RequestGroup();
  }
  /**
  * Descr: The status of the request group
  * expr: status
  * Xpath: f:RequestGroup/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RequestGroup status(@QueryParam("status")String status) {
  	return new RequestGroup();
  }
  /**
  * Descr: The subject that the request group is about
  * expr: subject
  * Xpath: f:RequestGroup/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RequestGroup subject() {
  	return new RequestGroup();
  }
}
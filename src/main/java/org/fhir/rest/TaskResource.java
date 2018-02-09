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

import org.fhir.pojo.Task;
import org.fhir.service.TaskService;

@Path("/Task")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class TaskResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final TaskService service;

  @Inject
  public TaskResource(final TaskService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Task create(Task obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Task update( Task obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Task find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Task> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Task> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Search by creation date
  * expr: authoredOn
  * Xpath: f:Task/f:authoredOn
  * Type: date
  * Code: authoredon
  */
  @GET
  @Path("authoredOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task authoredon(@QueryParam("authoredon")String authoredon) {
  	return new Task();
  }
  /**
  * Descr: Search by requests this task is based on
  * expr: basedOn
  * Xpath: f:Task/f:basedOn
  * Type: reference
  * Code: basedon
  */
  @GET
  @Path("basedOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task basedon() {
  	return new Task();
  }
  /**
  * Descr: Search by business status
  * expr: businessStatus
  * Xpath: f:Task/f:businessStatus
  * Type: token
  * Code: businessstatus
  */
  @GET
  @Path("businessStatus")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task businessstatus(@QueryParam("businessstatus")String businessstatus) {
  	return new Task();
  }
  /**
  * Descr: Search by task code
  * expr: code
  * Xpath: f:Task/f:code
  * Type: token
  * Code: code
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task code(@QueryParam("code")String code) {
  	return new Task();
  }
  /**
  * Descr: Search by encounter or episode
  * expr: context
  * Xpath: f:Task/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task context() {
  	return new Task();
  }
  /**
  * Descr: Search by task focus
  * expr: focus
  * Xpath: f:Task/f:focus
  * Type: reference
  * Code: focus
  */
  @GET
  @Path("focus")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task focus() {
  	return new Task();
  }
  /**
  * Descr: Search by group identifier
  * expr: groupIdentifier
  * Xpath: f:Task/f:groupIdentifier
  * Type: token
  * Code: groupidentifier
  */
  @GET
  @Path("groupIdentifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task groupidentifier(@QueryParam("groupidentifier")String groupidentifier) {
  	return new Task();
  }
  /**
  * Descr: Search for a task instance by its business identifier
  * expr: identifier
  * Xpath: f:Task/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task identifier(@QueryParam("identifier")String identifier) {
  	return new Task();
  }
  /**
  * Descr: Search by task intent
  * expr: intent
  * Xpath: f:Task/f:intent
  * Type: token
  * Code: intent
  */
  @GET
  @Path("intent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task intent(@QueryParam("intent")String intent) {
  	return new Task();
  }
  /**
  * Descr: Search by last modification date
  * expr: lastModified
  * Xpath: f:Task/f:lastModified
  * Type: date
  * Code: modified
  */
  @GET
  @Path("lastModified")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task modified(@QueryParam("modified")String modified) {
  	return new Task();
  }
  /**
  * Descr: Search by responsible organization
  * expr: onBehalfOf
  * Xpath: f:Task/f:requester/f:onBehalfOf
  * Type: reference
  * Code: organization
  */
  @GET
  @Path("onBehalfOf")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task organization() {
  	return new Task();
  }
  /**
  * Descr: Search by task owner
  * expr: owner
  * Xpath: f:Task/f:owner
  * Type: reference
  * Code: owner
  */
  @GET
  @Path("owner")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task owner() {
  	return new Task();
  }
  /**
  * Descr: Search by task this task is part of
  * expr: partOf
  * Xpath: f:Task/f:partOf
  * Type: reference
  * Code: partof
  */
  @GET
  @Path("partOf")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task partof() {
  	return new Task();
  }
  /**
  * Descr: Search by patient
  * expr: for
  * Xpath: f:Task/f:for
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("for")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task patient() {
  	return new Task();
  }
  /**
  * Descr: Search by recommended type of performer (e.g., Requester, Performer, Scheduler).
  * expr: performerType
  * Xpath: f:Task/f:performerType
  * Type: token
  * Code: performer
  */
  @GET
  @Path("performerType")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task performer(@QueryParam("performer")String performer) {
  	return new Task();
  }
  /**
  * Descr: Search by period Task is/was underway
  * expr: executionPeriod
  * Xpath: f:Task/f:executionPeriod
  * Type: date
  * Code: period
  */
  @GET
  @Path("executionPeriod")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task period(@QueryParam("period")String period) {
  	return new Task();
  }
  /**
  * Descr: Search by task priority
  * expr: priority
  * Xpath: f:Task/f:priority
  * Type: token
  * Code: priority
  */
  @GET
  @Path("priority")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task priority(@QueryParam("priority")String priority) {
  	return new Task();
  }
  /**
  * Descr: Search by task requester
  * expr: agent
  * Xpath: f:Task/f:requester/f:agent
  * Type: reference
  * Code: requester
  */
  @GET
  @Path("agent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task requester() {
  	return new Task();
  }
  /**
  * Descr: Search by task status
  * expr: status
  * Xpath: f:Task/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task status(@QueryParam("status")String status) {
  	return new Task();
  }
  /**
  * Descr: Search by subject
  * expr: for
  * Xpath: f:Task/f:for
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("for")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Task subject() {
  	return new Task();
  }
}
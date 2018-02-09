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

import org.fhir.pojo.MessageDefinition;
import org.fhir.service.MessageDefinitionService;

@Path("/MessageDefinition")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class MessageDefinitionResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MessageDefinitionService service;

  @Inject
  public MessageDefinitionResource(final MessageDefinitionService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public MessageDefinition create(MessageDefinition obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public MessageDefinition update( MessageDefinition obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public MessageDefinition find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<MessageDefinition> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<MessageDefinition> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The behavior associated with the message
  * expr: category
  * Xpath: f:MessageDefinition/f:category
  * Type: token
  * Code: category
  */
  @GET
  @Path("category")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageDefinition category(@QueryParam("category")String category) {
  	return new MessageDefinition();
  }
  /**
  * Descr: The message definition publication date
  * expr: date
  * Xpath: f:MessageDefinition/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageDefinition date(@QueryParam("date")String date) {
  	return new MessageDefinition();
  }
  /**
  * Descr: The description of the message definition
  * expr: description
  * Xpath: f:MessageDefinition/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageDefinition description(@QueryParam("description")String description) {
  	return new MessageDefinition();
  }
  /**
  * Descr: The event that triggers the message
  * expr: event
  * Xpath: f:MessageDefinition/f:event
  * Type: token
  * Code: event
  */
  @GET
  @Path("event")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageDefinition event(@QueryParam("event")String event) {
  	return new MessageDefinition();
  }
  /**
  * Descr: A resource that is a permitted focus of the message
  * expr: code
  * Xpath: f:MessageDefinition/f:focus/f:code
  * Type: token
  * Code: focus
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageDefinition focus(@QueryParam("focus")String focus) {
  	return new MessageDefinition();
  }
  /**
  * Descr: External identifier for the message definition
  * expr: identifier
  * Xpath: f:MessageDefinition/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageDefinition identifier(@QueryParam("identifier")String identifier) {
  	return new MessageDefinition();
  }
  /**
  * Descr: Intended jurisdiction for the message definition
  * expr: jurisdiction
  * Xpath: f:MessageDefinition/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageDefinition jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new MessageDefinition();
  }
  /**
  * Descr: Computationally friendly name of the message definition
  * expr: name
  * Xpath: f:MessageDefinition/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageDefinition name(@QueryParam("name")String name) {
  	return new MessageDefinition();
  }
  /**
  * Descr: Name of the publisher of the message definition
  * expr: publisher
  * Xpath: f:MessageDefinition/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageDefinition publisher(@QueryParam("publisher")String publisher) {
  	return new MessageDefinition();
  }
  /**
  * Descr: The current status of the message definition
  * expr: status
  * Xpath: f:MessageDefinition/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageDefinition status(@QueryParam("status")String status) {
  	return new MessageDefinition();
  }
  /**
  * Descr: The human-friendly name of the message definition
  * expr: title
  * Xpath: f:MessageDefinition/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageDefinition title(@QueryParam("title")String title) {
  	return new MessageDefinition();
  }
  /**
  * Descr: The uri that identifies the message definition
  * expr: url
  * Xpath: f:MessageDefinition/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageDefinition url(@QueryParam("url")String url) {
  	return new MessageDefinition();
  }
  /**
  * Descr: The business version of the message definition
  * expr: version
  * Xpath: f:MessageDefinition/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageDefinition version(@QueryParam("version")String version) {
  	return new MessageDefinition();
  }
}
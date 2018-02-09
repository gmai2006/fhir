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

import org.fhir.pojo.MessageHeader;
import org.fhir.service.MessageHeaderService;

@Path("/MessageHeader")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class MessageHeaderResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MessageHeaderService service;

  @Inject
  public MessageHeaderResource(final MessageHeaderService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public MessageHeader create(MessageHeader obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public MessageHeader update( MessageHeader obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public MessageHeader find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<MessageHeader> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<MessageHeader> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The source of the decision
  * expr: author
  * Xpath: f:MessageHeader/f:author
  * Type: reference
  * Code: author
  */
  @GET
  @Path("author")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageHeader author() {
  	return new MessageHeader();
  }
  /**
  * Descr: ok | transient-error | fatal-error
  * expr: code
  * Xpath: f:MessageHeader/f:response/f:code
  * Type: token
  * Code: code
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageHeader code(@QueryParam("code")String code) {
  	return new MessageHeader();
  }
  /**
  * Descr: Name of system
  * expr: name
  * Xpath: f:MessageHeader/f:destination/f:name
  * Type: string
  * Code: destination
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageHeader destination(@QueryParam("destination")String destination) {
  	return new MessageHeader();
  }
  /**
  * Descr: Actual destination address or id
  * expr: endpoint
  * Xpath: f:MessageHeader/f:destination/f:endpoint
  * Type: uri
  * Code: destinationuri
  */
  @GET
  @Path("endpoint")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageHeader destinationuri(@QueryParam("destinationuri")String destinationuri) {
  	return new MessageHeader();
  }
  /**
  * Descr: The source of the data entry
  * expr: enterer
  * Xpath: f:MessageHeader/f:enterer
  * Type: reference
  * Code: enterer
  */
  @GET
  @Path("enterer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageHeader enterer() {
  	return new MessageHeader();
  }
  /**
  * Descr: Code for the event this message represents
  * expr: event
  * Xpath: f:MessageHeader/f:event
  * Type: token
  * Code: event
  */
  @GET
  @Path("event")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageHeader event(@QueryParam("event")String event) {
  	return new MessageHeader();
  }
  /**
  * Descr: The actual content of the message
  * expr: focus
  * Xpath: f:MessageHeader/f:focus
  * Type: reference
  * Code: focus
  */
  @GET
  @Path("focus")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageHeader focus() {
  	return new MessageHeader();
  }
  /**
  * Descr: Intended "real-world" recipient for the data
  * expr: receiver
  * Xpath: f:MessageHeader/f:receiver
  * Type: reference
  * Code: receiver
  */
  @GET
  @Path("receiver")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageHeader receiver() {
  	return new MessageHeader();
  }
  /**
  * Descr: Id of original message
  * expr: identifier
  * Xpath: f:MessageHeader/f:response/f:identifier
  * Type: token
  * Code: responseid
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageHeader responseid(@QueryParam("responseid")String responseid) {
  	return new MessageHeader();
  }
  /**
  * Descr: Final responsibility for event
  * expr: responsible
  * Xpath: f:MessageHeader/f:responsible
  * Type: reference
  * Code: responsible
  */
  @GET
  @Path("responsible")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageHeader responsible() {
  	return new MessageHeader();
  }
  /**
  * Descr: Real world sender of the message
  * expr: sender
  * Xpath: f:MessageHeader/f:sender
  * Type: reference
  * Code: sender
  */
  @GET
  @Path("sender")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageHeader sender() {
  	return new MessageHeader();
  }
  /**
  * Descr: Name of system
  * expr: name
  * Xpath: f:MessageHeader/f:source/f:name
  * Type: string
  * Code: source
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageHeader source(@QueryParam("source")String source) {
  	return new MessageHeader();
  }
  /**
  * Descr: Actual message source address or id
  * expr: endpoint
  * Xpath: f:MessageHeader/f:source/f:endpoint
  * Type: uri
  * Code: sourceuri
  */
  @GET
  @Path("endpoint")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageHeader sourceuri(@QueryParam("sourceuri")String sourceuri) {
  	return new MessageHeader();
  }
  /**
  * Descr: Particular delivery destination within the destination
  * expr: target
  * Xpath: f:MessageHeader/f:destination/f:target
  * Type: reference
  * Code: target
  */
  @GET
  @Path("target")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageHeader target() {
  	return new MessageHeader();
  }
  /**
  * Descr: Time that the message was sent
  * expr: timestamp
  * Xpath: f:MessageHeader/f:timestamp
  * Type: date
  * Code: timestamp
  */
  @GET
  @Path("timestamp")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MessageHeader timestamp(@QueryParam("timestamp")String timestamp) {
  	return new MessageHeader();
  }
}
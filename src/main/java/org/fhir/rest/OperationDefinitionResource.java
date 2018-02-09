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

import org.fhir.pojo.OperationDefinition;
import org.fhir.service.OperationDefinitionService;

@Path("/OperationDefinition")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class OperationDefinitionResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final OperationDefinitionService service;

  @Inject
  public OperationDefinitionResource(final OperationDefinitionService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public OperationDefinition create(OperationDefinition obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public OperationDefinition update( OperationDefinition obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public OperationDefinition find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<OperationDefinition> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<OperationDefinition> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Marks this as a profile of the base
  * expr: base
  * Xpath: f:OperationDefinition/f:base
  * Type: reference
  * Code: base
  */
  @GET
  @Path("base")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public OperationDefinition base() {
  	return new OperationDefinition();
  }
  /**
  * Descr: Name used to invoke the operation
  * expr: code
  * Xpath: f:OperationDefinition/f:code
  * Type: token
  * Code: code
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public OperationDefinition code(@QueryParam("code")String code) {
  	return new OperationDefinition();
  }
  /**
  * Descr: The operation definition publication date
  * expr: date
  * Xpath: f:OperationDefinition/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public OperationDefinition date(@QueryParam("date")String date) {
  	return new OperationDefinition();
  }
  /**
  * Descr: The description of the operation definition
  * expr: description
  * Xpath: f:OperationDefinition/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public OperationDefinition description(@QueryParam("description")String description) {
  	return new OperationDefinition();
  }
  /**
  * Descr: Invoke on an instance?
  * expr: instance
  * Xpath: f:OperationDefinition/f:instance
  * Type: token
  * Code: instance
  */
  @GET
  @Path("instance")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public OperationDefinition instance(@QueryParam("instance")String instance) {
  	return new OperationDefinition();
  }
  /**
  * Descr: Intended jurisdiction for the operation definition
  * expr: jurisdiction
  * Xpath: f:OperationDefinition/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public OperationDefinition jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new OperationDefinition();
  }
  /**
  * Descr: operation | query
  * expr: kind
  * Xpath: f:OperationDefinition/f:kind
  * Type: token
  * Code: kind
  */
  @GET
  @Path("kind")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public OperationDefinition kind(@QueryParam("kind")String kind) {
  	return new OperationDefinition();
  }
  /**
  * Descr: Computationally friendly name of the operation definition
  * expr: name
  * Xpath: f:OperationDefinition/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public OperationDefinition name(@QueryParam("name")String name) {
  	return new OperationDefinition();
  }
  /**
  * Descr: Profile on the type
  * expr: profile
  * Xpath: f:OperationDefinition/f:parameter/f:profile
  * Type: reference
  * Code: paramprofile
  */
  @GET
  @Path("profile")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public OperationDefinition paramprofile() {
  	return new OperationDefinition();
  }
  /**
  * Descr: Name of the publisher of the operation definition
  * expr: publisher
  * Xpath: f:OperationDefinition/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public OperationDefinition publisher(@QueryParam("publisher")String publisher) {
  	return new OperationDefinition();
  }
  /**
  * Descr: The current status of the operation definition
  * expr: status
  * Xpath: f:OperationDefinition/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public OperationDefinition status(@QueryParam("status")String status) {
  	return new OperationDefinition();
  }
  /**
  * Descr: Invoke at the system level?
  * expr: system
  * Xpath: f:OperationDefinition/f:system
  * Type: token
  * Code: system
  */
  @GET
  @Path("system")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public OperationDefinition system(@QueryParam("system")String system) {
  	return new OperationDefinition();
  }
  /**
  * Descr: Invole at the type level?
  * expr: type
  * Xpath: f:OperationDefinition/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public OperationDefinition type(@QueryParam("type")String type) {
  	return new OperationDefinition();
  }
  /**
  * Descr: The uri that identifies the operation definition
  * expr: url
  * Xpath: f:OperationDefinition/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public OperationDefinition url(@QueryParam("url")String url) {
  	return new OperationDefinition();
  }
  /**
  * Descr: The business version of the operation definition
  * expr: version
  * Xpath: f:OperationDefinition/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public OperationDefinition version(@QueryParam("version")String version) {
  	return new OperationDefinition();
  }
}
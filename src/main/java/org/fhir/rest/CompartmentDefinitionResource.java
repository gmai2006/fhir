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

import org.fhir.pojo.CompartmentDefinition;
import org.fhir.service.CompartmentDefinitionService;

@Path("/CompartmentDefinition")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class CompartmentDefinitionResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CompartmentDefinitionService service;

  @Inject
  public CompartmentDefinitionResource(final CompartmentDefinitionService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public CompartmentDefinition create(CompartmentDefinition obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public CompartmentDefinition update( CompartmentDefinition obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public CompartmentDefinition find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<CompartmentDefinition> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<CompartmentDefinition> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Patient | Encounter | RelatedPerson | Practitioner | Device
  * expr: code
  * Xpath: f:CompartmentDefinition/f:code
  * Type: token
  * Code: code
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CompartmentDefinition code(@QueryParam("code")String code) {
  	return new CompartmentDefinition();
  }
  /**
  * Descr: The compartment definition publication date
  * expr: date
  * Xpath: f:CompartmentDefinition/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CompartmentDefinition date(@QueryParam("date")String date) {
  	return new CompartmentDefinition();
  }
  /**
  * Descr: The description of the compartment definition
  * expr: description
  * Xpath: f:CompartmentDefinition/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CompartmentDefinition description(@QueryParam("description")String description) {
  	return new CompartmentDefinition();
  }
  /**
  * Descr: Intended jurisdiction for the compartment definition
  * expr: jurisdiction
  * Xpath: f:CompartmentDefinition/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CompartmentDefinition jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new CompartmentDefinition();
  }
  /**
  * Descr: Computationally friendly name of the compartment definition
  * expr: name
  * Xpath: f:CompartmentDefinition/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CompartmentDefinition name(@QueryParam("name")String name) {
  	return new CompartmentDefinition();
  }
  /**
  * Descr: Name of the publisher of the compartment definition
  * expr: publisher
  * Xpath: f:CompartmentDefinition/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CompartmentDefinition publisher(@QueryParam("publisher")String publisher) {
  	return new CompartmentDefinition();
  }
  /**
  * Descr: Name of resource type
  * expr: code
  * Xpath: f:CompartmentDefinition/f:resource/f:code
  * Type: token
  * Code: resource
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CompartmentDefinition resource(@QueryParam("resource")String resource) {
  	return new CompartmentDefinition();
  }
  /**
  * Descr: The current status of the compartment definition
  * expr: status
  * Xpath: f:CompartmentDefinition/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CompartmentDefinition status(@QueryParam("status")String status) {
  	return new CompartmentDefinition();
  }
  /**
  * Descr: The human-friendly name of the compartment definition
  * expr: title
  * Xpath: f:CompartmentDefinition/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CompartmentDefinition title(@QueryParam("title")String title) {
  	return new CompartmentDefinition();
  }
  /**
  * Descr: The uri that identifies the compartment definition
  * expr: url
  * Xpath: f:CompartmentDefinition/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CompartmentDefinition url(@QueryParam("url")String url) {
  	return new CompartmentDefinition();
  }
}
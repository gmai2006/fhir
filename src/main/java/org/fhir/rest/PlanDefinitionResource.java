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

import org.fhir.pojo.PlanDefinition;
import org.fhir.service.PlanDefinitionService;

@Path("/PlanDefinition")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class PlanDefinitionResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final PlanDefinitionService service;

  @Inject
  public PlanDefinitionResource(final PlanDefinitionService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public PlanDefinition create(PlanDefinition obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public PlanDefinition update( PlanDefinition obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public PlanDefinition find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<PlanDefinition> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<PlanDefinition> findWithLimit(@PathParam("max") String max) {
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
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:PlanDefinition/f:relatedArtifact[f:type/@value='composed-of']/f:resource
  * Type: reference
  * Code: composedof
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PlanDefinition composedof() {
  	return new PlanDefinition();
  }
  /**
  * Descr: The plan definition publication date
  * expr: date
  * Xpath: f:PlanDefinition/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PlanDefinition date(@QueryParam("date")String date) {
  	return new PlanDefinition();
  }
  /**
  * Descr: What resource is being referenced
  * expr: library
  * Xpath: f:PlanDefinition/f:relatedArtifact[f:type/@value='depends-on']/f:resource | f:PlanDefinition/f:library
  * Type: reference
  * Code: dependson
  */
  @GET
  @Path("library")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PlanDefinition dependson() {
  	return new PlanDefinition();
  }
  /**
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:PlanDefinition/f:relatedArtifact[f:type/@value='derived-from']/f:resource
  * Type: reference
  * Code: derivedfrom
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PlanDefinition derivedfrom() {
  	return new PlanDefinition();
  }
  /**
  * Descr: The description of the plan definition
  * expr: description
  * Xpath: f:PlanDefinition/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PlanDefinition description(@QueryParam("description")String description) {
  	return new PlanDefinition();
  }
  /**
  * Descr: The time during which the plan definition is intended to be in use
  * expr: effectivePeriod
  * Xpath: f:PlanDefinition/f:effectivePeriod
  * Type: date
  * Code: effective
  */
  @GET
  @Path("effectivePeriod")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PlanDefinition effective(@QueryParam("effective")String effective) {
  	return new PlanDefinition();
  }
  /**
  * Descr: External identifier for the plan definition
  * expr: identifier
  * Xpath: f:PlanDefinition/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PlanDefinition identifier(@QueryParam("identifier")String identifier) {
  	return new PlanDefinition();
  }
  /**
  * Descr: Intended jurisdiction for the plan definition
  * expr: jurisdiction
  * Xpath: f:PlanDefinition/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PlanDefinition jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new PlanDefinition();
  }
  /**
  * Descr: Computationally friendly name of the plan definition
  * expr: name
  * Xpath: f:PlanDefinition/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PlanDefinition name(@QueryParam("name")String name) {
  	return new PlanDefinition();
  }
  /**
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:PlanDefinition/f:relatedArtifact[f:type/@value='predecessor']/f:resource
  * Type: reference
  * Code: predecessor
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PlanDefinition predecessor() {
  	return new PlanDefinition();
  }
  /**
  * Descr: Name of the publisher of the plan definition
  * expr: publisher
  * Xpath: f:PlanDefinition/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PlanDefinition publisher(@QueryParam("publisher")String publisher) {
  	return new PlanDefinition();
  }
  /**
  * Descr: The current status of the plan definition
  * expr: status
  * Xpath: f:PlanDefinition/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PlanDefinition status(@QueryParam("status")String status) {
  	return new PlanDefinition();
  }
  /**
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:PlanDefinition/f:relatedArtifact[f:type/@value='successor']/f:resource
  * Type: reference
  * Code: successor
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PlanDefinition successor() {
  	return new PlanDefinition();
  }
  /**
  * Descr: The human-friendly name of the plan definition
  * expr: title
  * Xpath: f:PlanDefinition/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PlanDefinition title(@QueryParam("title")String title) {
  	return new PlanDefinition();
  }
  /**
  * Descr: Topics associated with the module
  * expr: topic
  * Xpath: f:PlanDefinition/f:topic
  * Type: token
  * Code: topic
  */
  @GET
  @Path("topic")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PlanDefinition topic(@QueryParam("topic")String topic) {
  	return new PlanDefinition();
  }
  /**
  * Descr: The uri that identifies the plan definition
  * expr: url
  * Xpath: f:PlanDefinition/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PlanDefinition url(@QueryParam("url")String url) {
  	return new PlanDefinition();
  }
  /**
  * Descr: The business version of the plan definition
  * expr: version
  * Xpath: f:PlanDefinition/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PlanDefinition version(@QueryParam("version")String version) {
  	return new PlanDefinition();
  }
}
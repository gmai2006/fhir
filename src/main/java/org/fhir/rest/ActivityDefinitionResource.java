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

import org.fhir.pojo.ActivityDefinition;
import org.fhir.service.ActivityDefinitionService;

@Path("/ActivityDefinition")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ActivityDefinitionResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ActivityDefinitionService service;

  @Inject
  public ActivityDefinitionResource(final ActivityDefinitionService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public ActivityDefinition create(ActivityDefinition obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public ActivityDefinition update( ActivityDefinition obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public ActivityDefinition find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<ActivityDefinition> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<ActivityDefinition> findWithLimit(@PathParam("max") String max) {
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
  * Xpath: f:ActivityDefinition/f:relatedArtifact[f:type/@value='composed-of']/f:resource
  * Type: reference
  * Code: composedof
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ActivityDefinition composedof() {
  	return new ActivityDefinition();
  }
  /**
  * Descr: The activity definition publication date
  * expr: date
  * Xpath: f:ActivityDefinition/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ActivityDefinition date(@QueryParam("date")String date) {
  	return new ActivityDefinition();
  }
  /**
  * Descr: What resource is being referenced
  * expr: library
  * Xpath: f:ActivityDefinition/f:relatedArtifact[f:type/@value='depends-on']/f:resource | f:ActivityDefinition/f:library
  * Type: reference
  * Code: dependson
  */
  @GET
  @Path("library")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ActivityDefinition dependson() {
  	return new ActivityDefinition();
  }
  /**
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:ActivityDefinition/f:relatedArtifact[f:type/@value='derived-from']/f:resource
  * Type: reference
  * Code: derivedfrom
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ActivityDefinition derivedfrom() {
  	return new ActivityDefinition();
  }
  /**
  * Descr: The description of the activity definition
  * expr: description
  * Xpath: f:ActivityDefinition/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ActivityDefinition description(@QueryParam("description")String description) {
  	return new ActivityDefinition();
  }
  /**
  * Descr: The time during which the activity definition is intended to be in use
  * expr: effectivePeriod
  * Xpath: f:ActivityDefinition/f:effectivePeriod
  * Type: date
  * Code: effective
  */
  @GET
  @Path("effectivePeriod")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ActivityDefinition effective(@QueryParam("effective")String effective) {
  	return new ActivityDefinition();
  }
  /**
  * Descr: External identifier for the activity definition
  * expr: identifier
  * Xpath: f:ActivityDefinition/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ActivityDefinition identifier(@QueryParam("identifier")String identifier) {
  	return new ActivityDefinition();
  }
  /**
  * Descr: Intended jurisdiction for the activity definition
  * expr: jurisdiction
  * Xpath: f:ActivityDefinition/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ActivityDefinition jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new ActivityDefinition();
  }
  /**
  * Descr: Computationally friendly name of the activity definition
  * expr: name
  * Xpath: f:ActivityDefinition/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ActivityDefinition name(@QueryParam("name")String name) {
  	return new ActivityDefinition();
  }
  /**
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:ActivityDefinition/f:relatedArtifact[f:type/@value='predecessor']/f:resource
  * Type: reference
  * Code: predecessor
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ActivityDefinition predecessor() {
  	return new ActivityDefinition();
  }
  /**
  * Descr: Name of the publisher of the activity definition
  * expr: publisher
  * Xpath: f:ActivityDefinition/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ActivityDefinition publisher(@QueryParam("publisher")String publisher) {
  	return new ActivityDefinition();
  }
  /**
  * Descr: The current status of the activity definition
  * expr: status
  * Xpath: f:ActivityDefinition/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ActivityDefinition status(@QueryParam("status")String status) {
  	return new ActivityDefinition();
  }
  /**
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:ActivityDefinition/f:relatedArtifact[f:type/@value='successor']/f:resource
  * Type: reference
  * Code: successor
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ActivityDefinition successor() {
  	return new ActivityDefinition();
  }
  /**
  * Descr: The human-friendly name of the activity definition
  * expr: title
  * Xpath: f:ActivityDefinition/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ActivityDefinition title(@QueryParam("title")String title) {
  	return new ActivityDefinition();
  }
  /**
  * Descr: Topics associated with the module
  * expr: topic
  * Xpath: f:ActivityDefinition/f:topic
  * Type: token
  * Code: topic
  */
  @GET
  @Path("topic")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ActivityDefinition topic(@QueryParam("topic")String topic) {
  	return new ActivityDefinition();
  }
  /**
  * Descr: The uri that identifies the activity definition
  * expr: url
  * Xpath: f:ActivityDefinition/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ActivityDefinition url(@QueryParam("url")String url) {
  	return new ActivityDefinition();
  }
  /**
  * Descr: The business version of the activity definition
  * expr: version
  * Xpath: f:ActivityDefinition/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ActivityDefinition version(@QueryParam("version")String version) {
  	return new ActivityDefinition();
  }
}
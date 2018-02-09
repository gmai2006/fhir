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

import org.fhir.pojo.ServiceDefinition;
import org.fhir.service.ServiceDefinitionService;

@Path("/ServiceDefinition")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ServiceDefinitionResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ServiceDefinitionService service;

  @Inject
  public ServiceDefinitionResource(final ServiceDefinitionService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public ServiceDefinition create(ServiceDefinition obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public ServiceDefinition update( ServiceDefinition obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public ServiceDefinition find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<ServiceDefinition> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<ServiceDefinition> findWithLimit(@PathParam("max") String max) {
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
  * Xpath: f:ServiceDefinition/f:relatedArtifact[f:type/@value='composed-of']/f:resource
  * Type: reference
  * Code: composedof
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ServiceDefinition composedof() {
  	return new ServiceDefinition();
  }
  /**
  * Descr: The service definition publication date
  * expr: date
  * Xpath: f:ServiceDefinition/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ServiceDefinition date(@QueryParam("date")String date) {
  	return new ServiceDefinition();
  }
  /**
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:ServiceDefinition/f:relatedArtifact[f:type/@value='depends-on']/f:resource
  * Type: reference
  * Code: dependson
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ServiceDefinition dependson() {
  	return new ServiceDefinition();
  }
  /**
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:ServiceDefinition/f:relatedArtifact[f:type/@value='derived-from']/f:resource
  * Type: reference
  * Code: derivedfrom
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ServiceDefinition derivedfrom() {
  	return new ServiceDefinition();
  }
  /**
  * Descr: The description of the service definition
  * expr: description
  * Xpath: f:ServiceDefinition/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ServiceDefinition description(@QueryParam("description")String description) {
  	return new ServiceDefinition();
  }
  /**
  * Descr: The time during which the service definition is intended to be in use
  * expr: effectivePeriod
  * Xpath: f:ServiceDefinition/f:effectivePeriod
  * Type: date
  * Code: effective
  */
  @GET
  @Path("effectivePeriod")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ServiceDefinition effective(@QueryParam("effective")String effective) {
  	return new ServiceDefinition();
  }
  /**
  * Descr: External identifier for the service definition
  * expr: identifier
  * Xpath: f:ServiceDefinition/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ServiceDefinition identifier(@QueryParam("identifier")String identifier) {
  	return new ServiceDefinition();
  }
  /**
  * Descr: Intended jurisdiction for the service definition
  * expr: jurisdiction
  * Xpath: f:ServiceDefinition/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ServiceDefinition jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new ServiceDefinition();
  }
  /**
  * Descr: Computationally friendly name of the service definition
  * expr: name
  * Xpath: f:ServiceDefinition/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ServiceDefinition name(@QueryParam("name")String name) {
  	return new ServiceDefinition();
  }
  /**
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:ServiceDefinition/f:relatedArtifact[f:type/@value='predecessor']/f:resource
  * Type: reference
  * Code: predecessor
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ServiceDefinition predecessor() {
  	return new ServiceDefinition();
  }
  /**
  * Descr: Name of the publisher of the service definition
  * expr: publisher
  * Xpath: f:ServiceDefinition/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ServiceDefinition publisher(@QueryParam("publisher")String publisher) {
  	return new ServiceDefinition();
  }
  /**
  * Descr: The current status of the service definition
  * expr: status
  * Xpath: f:ServiceDefinition/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ServiceDefinition status(@QueryParam("status")String status) {
  	return new ServiceDefinition();
  }
  /**
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:ServiceDefinition/f:relatedArtifact[f:type/@value='successor']/f:resource
  * Type: reference
  * Code: successor
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ServiceDefinition successor() {
  	return new ServiceDefinition();
  }
  /**
  * Descr: The human-friendly name of the service definition
  * expr: title
  * Xpath: f:ServiceDefinition/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ServiceDefinition title(@QueryParam("title")String title) {
  	return new ServiceDefinition();
  }
  /**
  * Descr: Topics associated with the module
  * expr: topic
  * Xpath: f:ServiceDefinition/f:topic
  * Type: token
  * Code: topic
  */
  @GET
  @Path("topic")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ServiceDefinition topic(@QueryParam("topic")String topic) {
  	return new ServiceDefinition();
  }
  /**
  * Descr: The uri that identifies the service definition
  * expr: url
  * Xpath: f:ServiceDefinition/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ServiceDefinition url(@QueryParam("url")String url) {
  	return new ServiceDefinition();
  }
  /**
  * Descr: The business version of the service definition
  * expr: version
  * Xpath: f:ServiceDefinition/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ServiceDefinition version(@QueryParam("version")String version) {
  	return new ServiceDefinition();
  }
}
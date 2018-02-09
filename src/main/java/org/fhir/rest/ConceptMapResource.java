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

import org.fhir.pojo.ConceptMap;
import org.fhir.service.ConceptMapService;

@Path("/ConceptMap")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ConceptMapResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ConceptMapService service;

  @Inject
  public ConceptMapResource(final ConceptMapService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public ConceptMap create(ConceptMap obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public ConceptMap update( ConceptMap obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public ConceptMap find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<ConceptMap> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<ConceptMap> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The concept map publication date
  * expr: date
  * Xpath: f:ConceptMap/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap date(@QueryParam("date")String date) {
  	return new ConceptMap();
  }
  /**
  * Descr: Reference to property mapping depends on
  * expr: property
  * Xpath: f:ConceptMap/f:group/f:element/f:target/f:dependsOn/f:property
  * Type: uri
  * Code: dependson
  */
  @GET
  @Path("property")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap dependson(@QueryParam("dependson")String dependson) {
  	return new ConceptMap();
  }
  /**
  * Descr: The description of the concept map
  * expr: description
  * Xpath: f:ConceptMap/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap description(@QueryParam("description")String description) {
  	return new ConceptMap();
  }
  /**
  * Descr: External identifier for the concept map
  * expr: identifier
  * Xpath: f:ConceptMap/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap identifier(@QueryParam("identifier")String identifier) {
  	return new ConceptMap();
  }
  /**
  * Descr: Intended jurisdiction for the concept map
  * expr: jurisdiction
  * Xpath: f:ConceptMap/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new ConceptMap();
  }
  /**
  * Descr: Computationally friendly name of the concept map
  * expr: name
  * Xpath: f:ConceptMap/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap name(@QueryParam("name")String name) {
  	return new ConceptMap();
  }
  /**
  * Descr: Canonical URL for other concept map
  * expr: url
  * Xpath: f:ConceptMap/f:group/f:unmapped/f:url
  * Type: uri
  * Code: other
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap other(@QueryParam("other")String other) {
  	return new ConceptMap();
  }
  /**
  * Descr: Reference to property mapping depends on
  * expr: property
  * Xpath: f:ConceptMap/f:group/f:element/f:target/f:product/f:property
  * Type: uri
  * Code: product
  */
  @GET
  @Path("property")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap product(@QueryParam("product")String product) {
  	return new ConceptMap();
  }
  /**
  * Descr: Name of the publisher of the concept map
  * expr: publisher
  * Xpath: f:ConceptMap/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap publisher(@QueryParam("publisher")String publisher) {
  	return new ConceptMap();
  }
  /**
  * Descr: Identifies the source of the concepts which are being mapped
  * expr: as(Reference)
  * Xpath: f:ConceptMap/f:sourceReference
  * Type: reference
  * Code: source
  */
  @GET
  @Path("as(Reference)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap source() {
  	return new ConceptMap();
  }
  /**
  * Descr: Identifies element being mapped
  * expr: code
  * Xpath: f:ConceptMap/f:group/f:element/f:code
  * Type: token
  * Code: sourcecode
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap sourcecode(@QueryParam("sourcecode")String sourcecode) {
  	return new ConceptMap();
  }
  /**
  * Descr: Code System (if value set crosses code systems)
  * expr: source
  * Xpath: f:ConceptMap/f:group/f:source
  * Type: uri
  * Code: sourcesystem
  */
  @GET
  @Path("source")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap sourcesystem(@QueryParam("sourcesystem")String sourcesystem) {
  	return new ConceptMap();
  }
  /**
  * Descr: Identifies the source of the concepts which are being mapped
  * expr: as(Uri)
  * Xpath: f:ConceptMap/f:sourceUri
  * Type: reference
  * Code: sourceuri
  */
  @GET
  @Path("as(Uri)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap sourceuri() {
  	return new ConceptMap();
  }
  /**
  * Descr: The current status of the concept map
  * expr: status
  * Xpath: f:ConceptMap/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap status(@QueryParam("status")String status) {
  	return new ConceptMap();
  }
  /**
  * Descr: Provides context to the mappings
  * expr: as(Reference)
  * Xpath: f:ConceptMap/f:targetReference
  * Type: reference
  * Code: target
  */
  @GET
  @Path("as(Reference)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap target() {
  	return new ConceptMap();
  }
  /**
  * Descr: Code that identifies the target element
  * expr: code
  * Xpath: f:ConceptMap/f:group/f:element/f:target/f:code
  * Type: token
  * Code: targetcode
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap targetcode(@QueryParam("targetcode")String targetcode) {
  	return new ConceptMap();
  }
  /**
  * Descr: System of the target (if necessary)
  * expr: target
  * Xpath: f:ConceptMap/f:group/f:target
  * Type: uri
  * Code: targetsystem
  */
  @GET
  @Path("target")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap targetsystem(@QueryParam("targetsystem")String targetsystem) {
  	return new ConceptMap();
  }
  /**
  * Descr: Provides context to the mappings
  * expr: as(Uri)
  * Xpath: f:ConceptMap/f:targetUri
  * Type: reference
  * Code: targeturi
  */
  @GET
  @Path("as(Uri)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap targeturi() {
  	return new ConceptMap();
  }
  /**
  * Descr: The human-friendly name of the concept map
  * expr: title
  * Xpath: f:ConceptMap/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap title(@QueryParam("title")String title) {
  	return new ConceptMap();
  }
  /**
  * Descr: The uri that identifies the concept map
  * expr: url
  * Xpath: f:ConceptMap/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap url(@QueryParam("url")String url) {
  	return new ConceptMap();
  }
  /**
  * Descr: The business version of the concept map
  * expr: version
  * Xpath: f:ConceptMap/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ConceptMap version(@QueryParam("version")String version) {
  	return new ConceptMap();
  }
}
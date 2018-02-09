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

import org.fhir.pojo.Library;
import org.fhir.service.LibraryService;

@Path("/Library")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class LibraryResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LibraryService service;

  @Inject
  public LibraryResource(final LibraryService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Library create(Library obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Library update( Library obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Library find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Library> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Library> findWithLimit(@PathParam("max") String max) {
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
  * Xpath: f:Library/f:relatedArtifact[f:type/@value='composed-of']/f:resource
  * Type: reference
  * Code: composedof
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Library composedof() {
  	return new Library();
  }
  /**
  * Descr: The library publication date
  * expr: date
  * Xpath: f:Library/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Library date(@QueryParam("date")String date) {
  	return new Library();
  }
  /**
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:Library/f:relatedArtifact[f:type/@value='depends-on']/f:resource
  * Type: reference
  * Code: dependson
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Library dependson() {
  	return new Library();
  }
  /**
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:Library/f:relatedArtifact[f:type/@value='derived-from']/f:resource
  * Type: reference
  * Code: derivedfrom
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Library derivedfrom() {
  	return new Library();
  }
  /**
  * Descr: The description of the library
  * expr: description
  * Xpath: f:Library/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Library description(@QueryParam("description")String description) {
  	return new Library();
  }
  /**
  * Descr: The time during which the library is intended to be in use
  * expr: effectivePeriod
  * Xpath: f:Library/f:effectivePeriod
  * Type: date
  * Code: effective
  */
  @GET
  @Path("effectivePeriod")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Library effective(@QueryParam("effective")String effective) {
  	return new Library();
  }
  /**
  * Descr: External identifier for the library
  * expr: identifier
  * Xpath: f:Library/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Library identifier(@QueryParam("identifier")String identifier) {
  	return new Library();
  }
  /**
  * Descr: Intended jurisdiction for the library
  * expr: jurisdiction
  * Xpath: f:Library/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Library jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new Library();
  }
  /**
  * Descr: Computationally friendly name of the library
  * expr: name
  * Xpath: f:Library/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Library name(@QueryParam("name")String name) {
  	return new Library();
  }
  /**
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:Library/f:relatedArtifact[f:type/@value='predecessor']/f:resource
  * Type: reference
  * Code: predecessor
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Library predecessor() {
  	return new Library();
  }
  /**
  * Descr: Name of the publisher of the library
  * expr: publisher
  * Xpath: f:Library/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Library publisher(@QueryParam("publisher")String publisher) {
  	return new Library();
  }
  /**
  * Descr: The current status of the library
  * expr: status
  * Xpath: f:Library/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Library status(@QueryParam("status")String status) {
  	return new Library();
  }
  /**
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:Library/f:relatedArtifact[f:type/@value='successor']/f:resource
  * Type: reference
  * Code: successor
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Library successor() {
  	return new Library();
  }
  /**
  * Descr: The human-friendly name of the library
  * expr: title
  * Xpath: f:Library/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Library title(@QueryParam("title")String title) {
  	return new Library();
  }
  /**
  * Descr: Topics associated with the module
  * expr: topic
  * Xpath: f:Library/f:topic
  * Type: token
  * Code: topic
  */
  @GET
  @Path("topic")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Library topic(@QueryParam("topic")String topic) {
  	return new Library();
  }
  /**
  * Descr: The uri that identifies the library
  * expr: url
  * Xpath: f:Library/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Library url(@QueryParam("url")String url) {
  	return new Library();
  }
  /**
  * Descr: The business version of the library
  * expr: version
  * Xpath: f:Library/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Library version(@QueryParam("version")String version) {
  	return new Library();
  }
}
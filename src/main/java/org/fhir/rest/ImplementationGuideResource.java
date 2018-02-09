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

import org.fhir.pojo.ImplementationGuide;
import org.fhir.service.ImplementationGuideService;

@Path("/ImplementationGuide")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ImplementationGuideResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ImplementationGuideService service;

  @Inject
  public ImplementationGuideResource(final ImplementationGuideService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public ImplementationGuide create(ImplementationGuide obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public ImplementationGuide update( ImplementationGuide obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public ImplementationGuide find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<ImplementationGuide> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<ImplementationGuide> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The implementation guide publication date
  * expr: date
  * Xpath: f:ImplementationGuide/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImplementationGuide date(@QueryParam("date")String date) {
  	return new ImplementationGuide();
  }
  /**
  * Descr: Where to find dependency
  * expr: uri
  * Xpath: f:ImplementationGuide/f:dependency/f:uri
  * Type: uri
  * Code: dependency
  */
  @GET
  @Path("uri")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImplementationGuide dependency(@QueryParam("dependency")String dependency) {
  	return new ImplementationGuide();
  }
  /**
  * Descr: The description of the implementation guide
  * expr: description
  * Xpath: f:ImplementationGuide/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImplementationGuide description(@QueryParam("description")String description) {
  	return new ImplementationGuide();
  }
  /**
  * Descr: For testing purposes, not real usage
  * expr: experimental
  * Xpath: f:ImplementationGuide/f:experimental
  * Type: token
  * Code: experimental
  */
  @GET
  @Path("experimental")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImplementationGuide experimental(@QueryParam("experimental")String experimental) {
  	return new ImplementationGuide();
  }
  /**
  * Descr: Intended jurisdiction for the implementation guide
  * expr: jurisdiction
  * Xpath: f:ImplementationGuide/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImplementationGuide jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new ImplementationGuide();
  }
  /**
  * Descr: Computationally friendly name of the implementation guide
  * expr: name
  * Xpath: f:ImplementationGuide/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImplementationGuide name(@QueryParam("name")String name) {
  	return new ImplementationGuide();
  }
  /**
  * Descr: Name of the publisher of the implementation guide
  * expr: publisher
  * Xpath: f:ImplementationGuide/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImplementationGuide publisher(@QueryParam("publisher")String publisher) {
  	return new ImplementationGuide();
  }
  /**
  * Descr: Location of the resource
  * expr: source
  * Xpath: f:ImplementationGuide/f:package/f:resource/f:sourceUri | f:ImplementationGuide/f:package/f:resource/f:sourceReference
  * Type: reference
  * Code: resource
  */
  @GET
  @Path("source")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImplementationGuide resource() {
  	return new ImplementationGuide();
  }
  /**
  * Descr: The current status of the implementation guide
  * expr: status
  * Xpath: f:ImplementationGuide/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImplementationGuide status(@QueryParam("status")String status) {
  	return new ImplementationGuide();
  }
  /**
  * Descr: The uri that identifies the implementation guide
  * expr: url
  * Xpath: f:ImplementationGuide/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImplementationGuide url(@QueryParam("url")String url) {
  	return new ImplementationGuide();
  }
  /**
  * Descr: The business version of the implementation guide
  * expr: version
  * Xpath: f:ImplementationGuide/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImplementationGuide version(@QueryParam("version")String version) {
  	return new ImplementationGuide();
  }
}
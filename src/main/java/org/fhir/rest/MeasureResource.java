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

import org.fhir.pojo.Measure;
import org.fhir.service.MeasureService;

@Path("/Measure")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class MeasureResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MeasureService service;

  @Inject
  public MeasureResource(final MeasureService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Measure create(Measure obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Measure update( Measure obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Measure find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Measure> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Measure> findWithLimit(@PathParam("max") String max) {
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
  * Xpath: f:Measure/f:relatedArtifact[f:type/@value='composed-of']/f:resource
  * Type: reference
  * Code: composedof
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Measure composedof() {
  	return new Measure();
  }
  /**
  * Descr: The measure publication date
  * expr: date
  * Xpath: f:Measure/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Measure date(@QueryParam("date")String date) {
  	return new Measure();
  }
  /**
  * Descr: What resource is being referenced
  * expr: library
  * Xpath: f:Measure/f:relatedArtifact[f:type/@value='depends-on']/f:resource | f:Measure/f:library
  * Type: reference
  * Code: dependson
  */
  @GET
  @Path("library")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Measure dependson() {
  	return new Measure();
  }
  /**
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:Measure/f:relatedArtifact[f:type/@value='derived-from']/f:resource
  * Type: reference
  * Code: derivedfrom
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Measure derivedfrom() {
  	return new Measure();
  }
  /**
  * Descr: The description of the measure
  * expr: description
  * Xpath: f:Measure/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Measure description(@QueryParam("description")String description) {
  	return new Measure();
  }
  /**
  * Descr: The time during which the measure is intended to be in use
  * expr: effectivePeriod
  * Xpath: f:Measure/f:effectivePeriod
  * Type: date
  * Code: effective
  */
  @GET
  @Path("effectivePeriod")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Measure effective(@QueryParam("effective")String effective) {
  	return new Measure();
  }
  /**
  * Descr: External identifier for the measure
  * expr: identifier
  * Xpath: f:Measure/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Measure identifier(@QueryParam("identifier")String identifier) {
  	return new Measure();
  }
  /**
  * Descr: Intended jurisdiction for the measure
  * expr: jurisdiction
  * Xpath: f:Measure/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Measure jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new Measure();
  }
  /**
  * Descr: Computationally friendly name of the measure
  * expr: name
  * Xpath: f:Measure/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Measure name(@QueryParam("name")String name) {
  	return new Measure();
  }
  /**
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:Measure/f:relatedArtifact[f:type/@value='predecessor']/f:resource
  * Type: reference
  * Code: predecessor
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Measure predecessor() {
  	return new Measure();
  }
  /**
  * Descr: Name of the publisher of the measure
  * expr: publisher
  * Xpath: f:Measure/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Measure publisher(@QueryParam("publisher")String publisher) {
  	return new Measure();
  }
  /**
  * Descr: The current status of the measure
  * expr: status
  * Xpath: f:Measure/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Measure status(@QueryParam("status")String status) {
  	return new Measure();
  }
  /**
  * Descr: What resource is being referenced
  * expr: resource
  * Xpath: f:Measure/f:relatedArtifact[f:type/@value='successor']/f:resource
  * Type: reference
  * Code: successor
  */
  @GET
  @Path("resource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Measure successor() {
  	return new Measure();
  }
  /**
  * Descr: The human-friendly name of the measure
  * expr: title
  * Xpath: f:Measure/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Measure title(@QueryParam("title")String title) {
  	return new Measure();
  }
  /**
  * Descr: Topics associated with the module
  * expr: topic
  * Xpath: f:Measure/f:topic
  * Type: token
  * Code: topic
  */
  @GET
  @Path("topic")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Measure topic(@QueryParam("topic")String topic) {
  	return new Measure();
  }
  /**
  * Descr: The uri that identifies the measure
  * expr: url
  * Xpath: f:Measure/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Measure url(@QueryParam("url")String url) {
  	return new Measure();
  }
  /**
  * Descr: The business version of the measure
  * expr: version
  * Xpath: f:Measure/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Measure version(@QueryParam("version")String version) {
  	return new Measure();
  }
}
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

import org.fhir.pojo.Media;
import org.fhir.service.MediaService;

@Path("/Media")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class MediaResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MediaService service;

  @Inject
  public MediaResource(final MediaService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Media create(Media obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Media update( Media obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Media find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Media> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Media> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Procedure that caused this media to be created
  * expr: basedOn
  * Xpath: f:Media/f:basedOn
  * Type: reference
  * Code: basedon
  */
  @GET
  @Path("basedOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Media basedon() {
  	return new Media();
  }
  /**
  * Descr: Encounter / Episode associated with media
  * expr: context
  * Xpath: f:Media/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Media context() {
  	return new Media();
  }
  /**
  * Descr: Date attachment was first created
  * expr: creation
  * Xpath: f:Media/f:content/f:creation
  * Type: date
  * Code: created
  */
  @GET
  @Path("creation")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Media created(@QueryParam("created")String created) {
  	return new Media();
  }
  /**
  * Descr: When Media was collected
  * expr: occurrence
  * Xpath: f:Media/f:occurrenceDateTime | f:Media/f:occurrencePeriod
  * Type: date
  * Code: date
  */
  @GET
  @Path("occurrence")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Media date(@QueryParam("date")String date) {
  	return new Media();
  }
  /**
  * Descr: Observing Device
  * expr: device
  * Xpath: f:Media/f:device
  * Type: reference
  * Code: device
  */
  @GET
  @Path("device")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Media device() {
  	return new Media();
  }
  /**
  * Descr: Identifier(s) for the image
  * expr: identifier
  * Xpath: f:Media/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Media identifier(@QueryParam("identifier")String identifier) {
  	return new Media();
  }
  /**
  * Descr: The person who generated the image
  * expr: operator
  * Xpath: f:Media/f:operator
  * Type: reference
  * Code: operator
  */
  @GET
  @Path("operator")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Media operator() {
  	return new Media();
  }
  /**
  * Descr: Who/What this Media is a record of
  * expr: subject
  * Xpath: f:Media/f:subject
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Media patient() {
  	return new Media();
  }
  /**
  * Descr: Body part in media
  * expr: bodySite
  * Xpath: f:Media/f:bodySite
  * Type: token
  * Code: site
  */
  @GET
  @Path("bodySite")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Media site(@QueryParam("site")String site) {
  	return new Media();
  }
  /**
  * Descr: Who/What this Media is a record of
  * expr: subject
  * Xpath: f:Media/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Media subject() {
  	return new Media();
  }
  /**
  * Descr: The type of acquisition equipment/process
  * expr: subtype
  * Xpath: f:Media/f:subtype
  * Type: token
  * Code: subtype
  */
  @GET
  @Path("subtype")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Media subtype(@QueryParam("subtype")String subtype) {
  	return new Media();
  }
  /**
  * Descr: photo | video | audio
  * expr: type
  * Xpath: f:Media/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Media type(@QueryParam("type")String type) {
  	return new Media();
  }
  /**
  * Descr: Imaging view, e.g. Lateral or Antero-posterior
  * expr: view
  * Xpath: f:Media/f:view
  * Type: token
  * Code: view
  */
  @GET
  @Path("view")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Media view(@QueryParam("view")String view) {
  	return new Media();
  }
}
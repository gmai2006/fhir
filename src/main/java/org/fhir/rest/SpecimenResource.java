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

import org.fhir.pojo.Specimen;
import org.fhir.service.SpecimenService;

@Path("/Specimen")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class SpecimenResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SpecimenService service;

  @Inject
  public SpecimenResource(final SpecimenService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Specimen create(Specimen obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Specimen update( Specimen obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Specimen find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Specimen> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Specimen> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The accession number associated with the specimen
  * expr: accessionIdentifier
  * Xpath: f:Specimen/f:accessionIdentifier
  * Type: token
  * Code: accession
  */
  @GET
  @Path("accessionIdentifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Specimen accession(@QueryParam("accession")String accession) {
  	return new Specimen();
  }
  /**
  * Descr: The code for the body site from where the specimen originated
  * expr: bodySite
  * Xpath: f:Specimen/f:collection/f:bodySite
  * Type: token
  * Code: bodysite
  */
  @GET
  @Path("bodySite")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Specimen bodysite(@QueryParam("bodysite")String bodysite) {
  	return new Specimen();
  }
  /**
  * Descr: The date the specimen was collected
  * expr: collected
  * Xpath: f:Specimen/f:collection/f:collectedDateTime | f:Specimen/f:collection/f:collectedPeriod
  * Type: date
  * Code: collected
  */
  @GET
  @Path("collected")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Specimen collected(@QueryParam("collected")String collected) {
  	return new Specimen();
  }
  /**
  * Descr: Who collected the specimen
  * expr: collector
  * Xpath: f:Specimen/f:collection/f:collector
  * Type: reference
  * Code: collector
  */
  @GET
  @Path("collector")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Specimen collector() {
  	return new Specimen();
  }
  /**
  * Descr: The kind of specimen container
  * expr: type
  * Xpath: f:Specimen/f:container/f:type
  * Type: token
  * Code: container
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Specimen container(@QueryParam("container")String container) {
  	return new Specimen();
  }
  /**
  * Descr: The unique identifier associated with the specimen container
  * expr: identifier
  * Xpath: f:Specimen/f:container/f:identifier
  * Type: token
  * Code: containerid
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Specimen containerid(@QueryParam("containerid")String containerid) {
  	return new Specimen();
  }
  /**
  * Descr: The unique identifier associated with the specimen
  * expr: identifier
  * Xpath: f:Specimen/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Specimen identifier(@QueryParam("identifier")String identifier) {
  	return new Specimen();
  }
  /**
  * Descr: The parent of the specimen
  * expr: parent
  * Xpath: f:Specimen/f:parent
  * Type: reference
  * Code: parent
  */
  @GET
  @Path("parent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Specimen parent() {
  	return new Specimen();
  }
  /**
  * Descr: The patient the specimen comes from
  * expr: subject
  * Xpath: f:Specimen/f:subject
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Specimen patient() {
  	return new Specimen();
  }
  /**
  * Descr: available | unavailable | unsatisfactory | entered-in-error
  * expr: status
  * Xpath: f:Specimen/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Specimen status(@QueryParam("status")String status) {
  	return new Specimen();
  }
  /**
  * Descr: The subject of the specimen
  * expr: subject
  * Xpath: f:Specimen/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Specimen subject() {
  	return new Specimen();
  }
  /**
  * Descr: The specimen type
  * expr: type
  * Xpath: f:Specimen/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Specimen type(@QueryParam("type")String type) {
  	return new Specimen();
  }
}
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

import org.fhir.pojo.Procedure;
import org.fhir.service.ProcedureService;

@Path("/Procedure")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ProcedureResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ProcedureService service;

  @Inject
  public ProcedureResource(final ProcedureService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Procedure create(Procedure obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Procedure update( Procedure obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Procedure find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Procedure> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Procedure> findWithLimit(@PathParam("max") String max) {
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
  * Descr: A request for this procedure
  * expr: basedOn
  * Xpath: f:Procedure/f:basedOn
  * Type: reference
  * Code: basedon
  */
  @GET
  @Path("basedOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Procedure basedon() {
  	return new Procedure();
  }
  /**
  * Descr: Classification of the procedure
  * expr: category
  * Xpath: f:Procedure/f:category
  * Type: token
  * Code: category
  */
  @GET
  @Path("category")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Procedure category(@QueryParam("category")String category) {
  	return new Procedure();
  }
  /**
  * Descr: Encounter or episode associated with the procedure
  * expr: context
  * Xpath: f:Procedure/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Procedure context() {
  	return new Procedure();
  }
  /**
  * Descr: Instantiates protocol or definition
  * expr: definition
  * Xpath: f:Procedure/f:definition
  * Type: reference
  * Code: definition
  */
  @GET
  @Path("definition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Procedure definition() {
  	return new Procedure();
  }
  /**
  * Descr: Where the procedure happened
  * expr: location
  * Xpath: f:Procedure/f:location
  * Type: reference
  * Code: location
  */
  @GET
  @Path("location")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Procedure location() {
  	return new Procedure();
  }
  /**
  * Descr: Part of referenced event
  * expr: partOf
  * Xpath: f:Procedure/f:partOf
  * Type: reference
  * Code: partof
  */
  @GET
  @Path("partOf")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Procedure partof() {
  	return new Procedure();
  }
  /**
  * Descr: The reference to the practitioner
  * expr: actor
  * Xpath: f:Procedure/f:performer/f:actor
  * Type: reference
  * Code: performer
  */
  @GET
  @Path("actor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Procedure performer() {
  	return new Procedure();
  }
  /**
  * Descr: preparation | in-progress | suspended | aborted | completed | entered-in-error | unknown
  * expr: status
  * Xpath: f:Procedure/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Procedure status(@QueryParam("status")String status) {
  	return new Procedure();
  }
  /**
  * Descr: Search by subject
  * expr: subject
  * Xpath: f:Procedure/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Procedure subject() {
  	return new Procedure();
  }
}
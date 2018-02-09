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

import org.fhir.pojo.Substance;
import org.fhir.service.SubstanceService;

@Path("/Substance")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class SubstanceResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SubstanceService service;

  @Inject
  public SubstanceResource(final SubstanceService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Substance create(Substance obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Substance update( Substance obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Substance find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Substance> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Substance> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The category of the substance
  * expr: category
  * Xpath: f:Substance/f:category
  * Type: token
  * Code: category
  */
  @GET
  @Path("category")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Substance category(@QueryParam("category")String category) {
  	return new Substance();
  }
  /**
  * Descr: The code of the substance or ingredient
  * expr: as(CodeableConcept)
  * Xpath: f:Substance/f:code | f:Substance/f:ingredient/f:substanceCodeableConcept
  * Type: token
  * Code: code
  */
  @GET
  @Path("as(CodeableConcept)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Substance code(@QueryParam("code")String code) {
  	return new Substance();
  }
  /**
  * Descr: Identifier of the package/container
  * expr: identifier
  * Xpath: f:Substance/f:instance/f:identifier
  * Type: token
  * Code: containeridentifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Substance containeridentifier(@QueryParam("containeridentifier")String containeridentifier) {
  	return new Substance();
  }
  /**
  * Descr: Expiry date of package or container of substance
  * expr: expiry
  * Xpath: f:Substance/f:instance/f:expiry
  * Type: date
  * Code: expiry
  */
  @GET
  @Path("expiry")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Substance expiry(@QueryParam("expiry")String expiry) {
  	return new Substance();
  }
  /**
  * Descr: Unique identifier for the substance
  * expr: identifier
  * Xpath: f:Substance/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Substance identifier(@QueryParam("identifier")String identifier) {
  	return new Substance();
  }
  /**
  * Descr: Amount of substance in the package
  * expr: quantity
  * Xpath: f:Substance/f:instance/f:quantity
  * Type: quantity
  * Code: quantity
  */
  @GET
  @Path("quantity")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Substance quantity(@QueryParam("quantity")String quantity) {
  	return new Substance();
  }
  /**
  * Descr: active | inactive | entered-in-error
  * expr: status
  * Xpath: f:Substance/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Substance status(@QueryParam("status")String status) {
  	return new Substance();
  }
  /**
  * Descr: A component of the substance
  * expr: as(Reference)
  * Xpath: f:Substance/f:ingredient/f:substanceReference
  * Type: reference
  * Code: substancereference
  */
  @GET
  @Path("as(Reference)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Substance substancereference() {
  	return new Substance();
  }
}
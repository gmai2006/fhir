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

import org.fhir.pojo.Claim;
import org.fhir.service.ClaimService;

@Path("/Claim")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ClaimResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ClaimService service;

  @Inject
  public ClaimResource(final ClaimService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Claim create(Claim obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Claim update( Claim obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Claim find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Claim> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Claim> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Member of the CareTeam
  * expr: provider
  * Xpath: f:Claim/f:careTeam/f:provider
  * Type: reference
  * Code: careteam
  */
  @GET
  @Path("provider")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Claim careteam() {
  	return new Claim();
  }
  /**
  * Descr: The creation date for the Claim
  * expr: created
  * Xpath: f:Claim/f:created
  * Type: date
  * Code: created
  */
  @GET
  @Path("created")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Claim created(@QueryParam("created")String created) {
  	return new Claim();
  }
  /**
  * Descr: Encounters associated with a billed line item
  * expr: encounter
  * Xpath: f:Claim/f:item/f:encounter
  * Type: reference
  * Code: encounter
  */
  @GET
  @Path("encounter")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Claim encounter() {
  	return new Claim();
  }
  /**
  * Descr: The party responsible for the entry of the Claim
  * expr: enterer
  * Xpath: f:Claim/f:enterer
  * Type: reference
  * Code: enterer
  */
  @GET
  @Path("enterer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Claim enterer() {
  	return new Claim();
  }
  /**
  * Descr: Facility responsible for the goods and services
  * expr: facility
  * Xpath: f:Claim/f:facility
  * Type: reference
  * Code: facility
  */
  @GET
  @Path("facility")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Claim facility() {
  	return new Claim();
  }
  /**
  * Descr: The primary identifier of the financial resource
  * expr: identifier
  * Xpath: f:Claim/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Claim identifier(@QueryParam("identifier")String identifier) {
  	return new Claim();
  }
  /**
  * Descr: The target payor/insurer for the Claim
  * expr: insurer
  * Xpath: f:Claim/f:insurer
  * Type: reference
  * Code: insurer
  */
  @GET
  @Path("insurer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Claim insurer() {
  	return new Claim();
  }
  /**
  * Descr: The reference to the providing organization
  * expr: organization
  * Xpath: f:Claim/f:organization
  * Type: reference
  * Code: organization
  */
  @GET
  @Path("organization")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Claim organization() {
  	return new Claim();
  }
  /**
  * Descr: Patient receiving the services
  * expr: patient
  * Xpath: f:Claim/f:patient
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("patient")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Claim patient() {
  	return new Claim();
  }
  /**
  * Descr: The party receiving any payment for the Claim
  * expr: party
  * Xpath: f:Claim/f:payee/f:party
  * Type: reference
  * Code: payee
  */
  @GET
  @Path("party")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Claim payee() {
  	return new Claim();
  }
  /**
  * Descr: Processing priority requested
  * expr: priority
  * Xpath: f:Claim/f:priority
  * Type: token
  * Code: priority
  */
  @GET
  @Path("priority")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Claim priority(@QueryParam("priority")String priority) {
  	return new Claim();
  }
  /**
  * Descr: Provider responsible for the Claim
  * expr: provider
  * Xpath: f:Claim/f:provider
  * Type: reference
  * Code: provider
  */
  @GET
  @Path("provider")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Claim provider() {
  	return new Claim();
  }
  /**
  * Descr: The kind of financial resource
  * expr: use
  * Xpath: f:Claim/f:use
  * Type: token
  * Code: use
  */
  @GET
  @Path("use")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Claim use(@QueryParam("use")String use) {
  	return new Claim();
  }
}
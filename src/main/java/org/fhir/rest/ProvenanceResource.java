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

import org.fhir.pojo.Provenance;
import org.fhir.service.ProvenanceService;

@Path("/Provenance")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ProvenanceResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ProvenanceService service;

  @Inject
  public ProvenanceResource(final ProvenanceService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Provenance create(Provenance obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Provenance update( Provenance obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Provenance find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Provenance> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Provenance> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Who participated
  * expr: who
  * Xpath: f:Provenance/f:agent/f:whoUri | f:Provenance/f:agent/f:whoReference
  * Type: reference
  * Code: agent
  */
  @GET
  @Path("who")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Provenance agent() {
  	return new Provenance();
  }
  /**
  * Descr: What the agents role was
  * expr: role
  * Xpath: f:Provenance/f:agent/f:role
  * Type: token
  * Code: agentrole
  */
  @GET
  @Path("role")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Provenance agentrole(@QueryParam("agentrole")String agentrole) {
  	return new Provenance();
  }
  /**
  * Descr: End time with inclusive boundary, if not ongoing
  * expr: end
  * Xpath: f:Provenance/f:period/f:end
  * Type: date
  * Code: end
  */
  @GET
  @Path("end")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Provenance end(@QueryParam("end")String end) {
  	return new Provenance();
  }
  /**
  * Descr: Identity of entity
  * expr: as(Identifier)
  * Xpath: f:Provenance/f:entity/f:whatIdentifier
  * Type: token
  * Code: entityid
  */
  @GET
  @Path("as(Identifier)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Provenance entityid(@QueryParam("entityid")String entityid) {
  	return new Provenance();
  }
  /**
  * Descr: Identity of entity
  * expr: as(Reference)
  * Xpath: f:Provenance/f:entity/f:whatReference
  * Type: reference
  * Code: entityref
  */
  @GET
  @Path("as(Reference)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Provenance entityref() {
  	return new Provenance();
  }
  /**
  * Descr: Where the activity occurred, if relevant
  * expr: location
  * Xpath: f:Provenance/f:location
  * Type: reference
  * Code: location
  */
  @GET
  @Path("location")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Provenance location() {
  	return new Provenance();
  }
  /**
  * Descr: Target Reference(s) (usually version specific)
  * expr: target
  * Xpath: f:Provenance/f:target
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("target")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Provenance patient() {
  	return new Provenance();
  }
  /**
  * Descr: When the activity was recorded / updated
  * expr: recorded
  * Xpath: f:Provenance/f:recorded
  * Type: date
  * Code: recorded
  */
  @GET
  @Path("recorded")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Provenance recorded(@QueryParam("recorded")String recorded) {
  	return new Provenance();
  }
  /**
  * Descr: Indication of the reason the entity signed the object(s)
  * expr: type
  * Xpath: f:Provenance/f:signature/f:type
  * Type: token
  * Code: signaturetype
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Provenance signaturetype(@QueryParam("signaturetype")String signaturetype) {
  	return new Provenance();
  }
  /**
  * Descr: Starting time with inclusive boundary
  * expr: start
  * Xpath: f:Provenance/f:period/f:start
  * Type: date
  * Code: start
  */
  @GET
  @Path("start")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Provenance start(@QueryParam("start")String start) {
  	return new Provenance();
  }
  /**
  * Descr: Target Reference(s) (usually version specific)
  * expr: target
  * Xpath: f:Provenance/f:target
  * Type: reference
  * Code: target
  */
  @GET
  @Path("target")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Provenance target() {
  	return new Provenance();
  }
}
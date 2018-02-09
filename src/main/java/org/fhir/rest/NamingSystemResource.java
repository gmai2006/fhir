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

import org.fhir.pojo.NamingSystem;
import org.fhir.service.NamingSystemService;

@Path("/NamingSystem")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class NamingSystemResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final NamingSystemService service;

  @Inject
  public NamingSystemResource(final NamingSystemService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public NamingSystem create(NamingSystem obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public NamingSystem update( NamingSystem obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public NamingSystem find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<NamingSystem> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<NamingSystem> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Name of an individual to contact
  * expr: name
  * Xpath: f:NamingSystem/f:contact/f:name
  * Type: string
  * Code: contact
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NamingSystem contact(@QueryParam("contact")String contact) {
  	return new NamingSystem();
  }
  /**
  * Descr: The naming system publication date
  * expr: date
  * Xpath: f:NamingSystem/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NamingSystem date(@QueryParam("date")String date) {
  	return new NamingSystem();
  }
  /**
  * Descr: The description of the naming system
  * expr: description
  * Xpath: f:NamingSystem/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NamingSystem description(@QueryParam("description")String description) {
  	return new NamingSystem();
  }
  /**
  * Descr: oid | uuid | uri | other
  * expr: type
  * Xpath: f:NamingSystem/f:uniqueId/f:type
  * Type: token
  * Code: idtype
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NamingSystem idtype(@QueryParam("idtype")String idtype) {
  	return new NamingSystem();
  }
  /**
  * Descr: Intended jurisdiction for the naming system
  * expr: jurisdiction
  * Xpath: f:NamingSystem/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NamingSystem jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new NamingSystem();
  }
  /**
  * Descr: codesystem | identifier | root
  * expr: kind
  * Xpath: f:NamingSystem/f:kind
  * Type: token
  * Code: kind
  */
  @GET
  @Path("kind")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NamingSystem kind(@QueryParam("kind")String kind) {
  	return new NamingSystem();
  }
  /**
  * Descr: Computationally friendly name of the naming system
  * expr: name
  * Xpath: f:NamingSystem/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NamingSystem name(@QueryParam("name")String name) {
  	return new NamingSystem();
  }
  /**
  * Descr: When is identifier valid?
  * expr: period
  * Xpath: f:NamingSystem/f:uniqueId/f:period
  * Type: date
  * Code: period
  */
  @GET
  @Path("period")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NamingSystem period(@QueryParam("period")String period) {
  	return new NamingSystem();
  }
  /**
  * Descr: Name of the publisher of the naming system
  * expr: publisher
  * Xpath: f:NamingSystem/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NamingSystem publisher(@QueryParam("publisher")String publisher) {
  	return new NamingSystem();
  }
  /**
  * Descr: Use this instead
  * expr: replacedBy
  * Xpath: f:NamingSystem/f:replacedBy
  * Type: reference
  * Code: replacedby
  */
  @GET
  @Path("replacedBy")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NamingSystem replacedby() {
  	return new NamingSystem();
  }
  /**
  * Descr: Who maintains system namespace?
  * expr: responsible
  * Xpath: f:NamingSystem/f:responsible
  * Type: string
  * Code: responsible
  */
  @GET
  @Path("responsible")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NamingSystem responsible(@QueryParam("responsible")String responsible) {
  	return new NamingSystem();
  }
  /**
  * Descr: The current status of the naming system
  * expr: status
  * Xpath: f:NamingSystem/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NamingSystem status(@QueryParam("status")String status) {
  	return new NamingSystem();
  }
  /**
  * Descr: Contact details for individual or organization
  * expr: telecom
  * Xpath: f:NamingSystem/f:contact/f:telecom
  * Type: token
  * Code: telecom
  */
  @GET
  @Path("telecom")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NamingSystem telecom(@QueryParam("telecom")String telecom) {
  	return new NamingSystem();
  }
  /**
  * Descr: e.g. driver,  provider,  patient, bank etc.
  * expr: type
  * Xpath: f:NamingSystem/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NamingSystem type(@QueryParam("type")String type) {
  	return new NamingSystem();
  }
  /**
  * Descr: The unique identifier
  * expr: value
  * Xpath: f:NamingSystem/f:uniqueId/f:value
  * Type: string
  * Code: value
  */
  @GET
  @Path("value")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NamingSystem value(@QueryParam("value")String value) {
  	return new NamingSystem();
  }
}
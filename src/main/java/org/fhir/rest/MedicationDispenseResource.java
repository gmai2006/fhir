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

import org.fhir.pojo.MedicationDispense;
import org.fhir.service.MedicationDispenseService;

@Path("/MedicationDispense")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class MedicationDispenseResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MedicationDispenseService service;

  @Inject
  public MedicationDispenseResource(final MedicationDispenseService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public MedicationDispense create(MedicationDispense obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public MedicationDispense update( MedicationDispense obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public MedicationDispense find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<MedicationDispense> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<MedicationDispense> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Returns dispenses with a specific context (episode or episode of care)
  * expr: context
  * Xpath: f:MedicationDispense/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationDispense context() {
  	return new MedicationDispense();
  }
  /**
  * Descr: Return dispenses that should be sent to a specific destination
  * expr: destination
  * Xpath: f:MedicationDispense/f:destination
  * Type: reference
  * Code: destination
  */
  @GET
  @Path("destination")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationDispense destination() {
  	return new MedicationDispense();
  }
  /**
  * Descr: Return dispenses performed by a specific individual
  * expr: actor
  * Xpath: f:MedicationDispense/f:performer/f:actor
  * Type: reference
  * Code: performer
  */
  @GET
  @Path("actor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationDispense performer() {
  	return new MedicationDispense();
  }
  /**
  * Descr: The identity of a receiver to list dispenses for
  * expr: receiver
  * Xpath: f:MedicationDispense/f:receiver
  * Type: reference
  * Code: receiver
  */
  @GET
  @Path("receiver")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationDispense receiver() {
  	return new MedicationDispense();
  }
  /**
  * Descr: Return dispenses with the specified responsible party
  * expr: responsibleParty
  * Xpath: f:MedicationDispense/f:substitution/f:responsibleParty
  * Type: reference
  * Code: responsibleparty
  */
  @GET
  @Path("responsibleParty")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationDispense responsibleparty() {
  	return new MedicationDispense();
  }
  /**
  * Descr: The identity of a patient to list dispenses  for
  * expr: subject
  * Xpath: f:MedicationDispense/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationDispense subject() {
  	return new MedicationDispense();
  }
  /**
  * Descr: Return dispenses of a specific type
  * expr: type
  * Xpath: f:MedicationDispense/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationDispense type(@QueryParam("type")String type) {
  	return new MedicationDispense();
  }
  /**
  * Descr: Returns dispenses handed over on this date
  * expr: whenHandedOver
  * Xpath: f:MedicationDispense/f:whenHandedOver
  * Type: date
  * Code: whenhandedover
  */
  @GET
  @Path("whenHandedOver")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationDispense whenhandedover(@QueryParam("whenhandedover")String whenhandedover) {
  	return new MedicationDispense();
  }
  /**
  * Descr: Returns dispenses prepared on this date
  * expr: whenPrepared
  * Xpath: f:MedicationDispense/f:whenPrepared
  * Type: date
  * Code: whenprepared
  */
  @GET
  @Path("whenPrepared")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationDispense whenprepared(@QueryParam("whenprepared")String whenprepared) {
  	return new MedicationDispense();
  }
}
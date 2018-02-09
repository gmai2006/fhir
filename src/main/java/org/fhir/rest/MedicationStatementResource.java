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

import org.fhir.pojo.MedicationStatement;
import org.fhir.service.MedicationStatementService;

@Path("/MedicationStatement")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class MedicationStatementResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MedicationStatementService service;

  @Inject
  public MedicationStatementResource(final MedicationStatementService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public MedicationStatement create(MedicationStatement obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public MedicationStatement update( MedicationStatement obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public MedicationStatement find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<MedicationStatement> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<MedicationStatement> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Returns statements of this category of medicationstatement
  * expr: category
  * Xpath: f:MedicationStatement/f:category
  * Type: token
  * Code: category
  */
  @GET
  @Path("category")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationStatement category(@QueryParam("category")String category) {
  	return new MedicationStatement();
  }
  /**
  * Descr: Returns statements for a specific context (episode or episode of Care).
  * expr: context
  * Xpath: f:MedicationStatement/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationStatement context() {
  	return new MedicationStatement();
  }
  /**
  * Descr: Date when patient was taking (or not taking) the medication
  * expr: effective
  * Xpath: f:MedicationStatement/f:effectiveDateTime | f:MedicationStatement/f:effectivePeriod
  * Type: date
  * Code: effective
  */
  @GET
  @Path("effective")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationStatement effective(@QueryParam("effective")String effective) {
  	return new MedicationStatement();
  }
  /**
  * Descr: Returns statements that are part of another event.
  * expr: partOf
  * Xpath: f:MedicationStatement/f:partOf
  * Type: reference
  * Code: partof
  */
  @GET
  @Path("partOf")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationStatement partof() {
  	return new MedicationStatement();
  }
  /**
  * Descr: Who or where the information in the statement came from
  * expr: informationSource
  * Xpath: f:MedicationStatement/f:informationSource
  * Type: reference
  * Code: source
  */
  @GET
  @Path("informationSource")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationStatement source() {
  	return new MedicationStatement();
  }
  /**
  * Descr: The identity of a patient, animal or group to list statements for
  * expr: subject
  * Xpath: f:MedicationStatement/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationStatement subject() {
  	return new MedicationStatement();
  }
}
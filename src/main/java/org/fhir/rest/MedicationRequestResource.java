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

import org.fhir.pojo.MedicationRequest;
import org.fhir.service.MedicationRequestService;

@Path("/MedicationRequest")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class MedicationRequestResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MedicationRequestService service;

  @Inject
  public MedicationRequestResource(final MedicationRequestService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public MedicationRequest create(MedicationRequest obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public MedicationRequest update( MedicationRequest obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public MedicationRequest find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<MedicationRequest> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<MedicationRequest> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Multiple Resources: 

  * [MedicationRequest](medicationrequest.html): Return prescriptions with this external identifier
  * [MedicationAdministration](medicationadministration.html): Return administrations with this external identifier
  * [MedicationStatement](medicationstatement.html): Return statements with this external identifier
  * [MedicationDispense](medicationdispense.html): Return dispenses with this external identifier

  * expr: identifier
  * Xpath: f:MedicationRequest/f:identifier | f:MedicationAdministration/f:identifier | f:MedicationStatement/f:identifier | f:MedicationDispense/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationRequest identifier(@QueryParam("identifier")String identifier) {
  	return new MedicationRequest();
  }
  /**
  * Descr: Multiple Resources: 

  * [MedicationRequest](medicationrequest.html): Return prescriptions of this medication reference
  * [MedicationAdministration](medicationadministration.html): Return administrations of this medication resource
  * [MedicationStatement](medicationstatement.html): Return statements of this medication reference
  * [MedicationDispense](medicationdispense.html): Return dispenses of this medicine resource

  * expr: as(Reference)
  * Xpath: f:MedicationRequest/f:medicationReference | f:MedicationAdministration/f:medicationReference | f:MedicationStatement/f:medicationReference | f:MedicationDispense/f:medicationReference
  * Type: reference
  * Code: medication
  */
  @GET
  @Path("as(Reference)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationRequest medication() {
  	return new MedicationRequest();
  }
  /**
  * Descr: Multiple Resources: 

  * [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient
  * [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for
  * [MedicationStatement](medicationstatement.html): Returns statements for a specific patient.
  * [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for

  * expr: subject
  * Xpath: f:MedicationRequest/f:subject | f:MedicationAdministration/f:subject | f:MedicationStatement/f:subject | f:MedicationDispense/f:subject
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationRequest patient() {
  	return new MedicationRequest();
  }
  /**
  * Descr: Multiple Resources: 

  * [MedicationRequest](medicationrequest.html): Status of the prescription
  * [MedicationAdministration](medicationadministration.html): MedicationAdministration event status (for example one of active/paused/completed/nullified)
  * [MedicationStatement](medicationstatement.html): Return statements that match the given status
  * [MedicationDispense](medicationdispense.html): Return dispenses with a specified dispense status

  * expr: status
  * Xpath: f:MedicationRequest/f:status | f:MedicationAdministration/f:status | f:MedicationStatement/f:status | f:MedicationDispense/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationRequest status(@QueryParam("status")String status) {
  	return new MedicationRequest();
  }
  /**
  * Descr: Return prescriptions written on this date
  * expr: authoredOn
  * Xpath: f:MedicationRequest/f:authoredOn
  * Type: date
  * Code: authoredon
  */
  @GET
  @Path("authoredOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationRequest authoredon(@QueryParam("authoredon")String authoredon) {
  	return new MedicationRequest();
  }
  /**
  * Descr: Returns prescriptions with different categories
  * expr: category
  * Xpath: f:MedicationRequest/f:category
  * Type: token
  * Code: category
  */
  @GET
  @Path("category")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationRequest category(@QueryParam("category")String category) {
  	return new MedicationRequest();
  }
  /**
  * Descr: Return prescriptions with this encounter or episode of care identifier
  * expr: context
  * Xpath: f:MedicationRequest/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationRequest context() {
  	return new MedicationRequest();
  }
  /**
  * Descr: Multiple Resources: 

  * [MedicationRequest](medicationrequest.html): Returns medication request to be administered on a specific date

  * expr: event
  * Xpath: f:MedicationRequest/f:dosageInstruction/f:timing/f:event
  * Type: date
  * Code: date
  */
  @GET
  @Path("event")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationRequest date(@QueryParam("date")String date) {
  	return new MedicationRequest();
  }
  /**
  * Descr: Returns prescriptions intended to be dispensed by this Organization
  * expr: performer
  * Xpath: f:MedicationRequest/f:dispenseRequest/f:performer
  * Type: reference
  * Code: intendeddispenser
  */
  @GET
  @Path("performer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationRequest intendeddispenser() {
  	return new MedicationRequest();
  }
  /**
  * Descr: Returns prescriptions with different intents
  * expr: intent
  * Xpath: f:MedicationRequest/f:intent
  * Type: token
  * Code: intent
  */
  @GET
  @Path("intent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationRequest intent(@QueryParam("intent")String intent) {
  	return new MedicationRequest();
  }
  /**
  * Descr: Returns prescriptions with different priorities
  * expr: priority
  * Xpath: f:MedicationRequest/f:priority
  * Type: token
  * Code: priority
  */
  @GET
  @Path("priority")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationRequest priority(@QueryParam("priority")String priority) {
  	return new MedicationRequest();
  }
  /**
  * Descr: Returns prescriptions prescribed by this prescriber
  * expr: agent
  * Xpath: f:MedicationRequest/f:requester/f:agent
  * Type: reference
  * Code: requester
  */
  @GET
  @Path("agent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationRequest requester() {
  	return new MedicationRequest();
  }
  /**
  * Descr: The identity of a patient to list orders  for
  * expr: subject
  * Xpath: f:MedicationRequest/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationRequest subject() {
  	return new MedicationRequest();
  }
}
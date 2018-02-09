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

import org.fhir.pojo.Encounter;
import org.fhir.service.EncounterService;

@Path("/Encounter")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class EncounterResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EncounterService service;

  @Inject
  public EncounterResource(final EncounterService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Encounter create(Encounter obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Encounter update( Encounter obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Encounter find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Encounter> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Encounter> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The appointment that scheduled this encounter
  * expr: appointment
  * Xpath: f:Encounter/f:appointment
  * Type: reference
  * Code: appointment
  */
  @GET
  @Path("appointment")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Encounter appointment() {
  	return new Encounter();
  }
  /**
  * Descr: inpatient | outpatient | ambulatory | emergency +
  * expr: class
  * Xpath: f:Encounter/f:class
  * Type: token
  * Code: FHIRclass
  */
  @GET
  @Path("class")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Encounter FHIRclass(@QueryParam("FHIRclass")String FHIRclass) {
  	return new Encounter();
  }
  /**
  * Descr: Reason the encounter takes place (resource)
  * expr: condition
  * Xpath: f:Encounter/f:diagnosis/f:condition
  * Type: reference
  * Code: diagnosis
  */
  @GET
  @Path("condition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Encounter diagnosis() {
  	return new Encounter();
  }
  /**
  * Descr: Episode(s) of care that this encounter should be recorded against
  * expr: episodeOfCare
  * Xpath: f:Encounter/f:episodeOfCare
  * Type: reference
  * Code: episodeofcare
  */
  @GET
  @Path("episodeOfCare")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Encounter episodeofcare() {
  	return new Encounter();
  }
  /**
  * Descr: The ReferralRequest that initiated this encounter
  * expr: incomingReferral
  * Xpath: f:Encounter/f:incomingReferral
  * Type: reference
  * Code: incomingreferral
  */
  @GET
  @Path("incomingReferral")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Encounter incomingreferral() {
  	return new Encounter();
  }
  /**
  * Descr: Length of encounter in days
  * expr: length
  * Xpath: f:Encounter/f:length
  * Type: number
  * Code: length
  */
  @GET
  @Path("length")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Encounter length(@QueryParam("length")String length) {
  	return new Encounter();
  }
  /**
  * Descr: Location the encounter takes place
  * expr: location
  * Xpath: f:Encounter/f:location/f:location
  * Type: reference
  * Code: location
  */
  @GET
  @Path("location")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Encounter location() {
  	return new Encounter();
  }
  /**
  * Descr: Time period during which the patient was present at the location
  * expr: period
  * Xpath: f:Encounter/f:location/f:period
  * Type: date
  * Code: locationperiod
  */
  @GET
  @Path("period")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Encounter locationperiod(@QueryParam("locationperiod")String locationperiod) {
  	return new Encounter();
  }
  /**
  * Descr: Another Encounter this encounter is part of
  * expr: partOf
  * Xpath: f:Encounter/f:partOf
  * Type: reference
  * Code: partof
  */
  @GET
  @Path("partOf")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Encounter partof() {
  	return new Encounter();
  }
  /**
  * Descr: Persons involved in the encounter other than the patient
  * expr: individual
  * Xpath: f:Encounter/f:participant/f:individual
  * Type: reference
  * Code: participant
  */
  @GET
  @Path("individual")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Encounter participant() {
  	return new Encounter();
  }
  /**
  * Descr: Role of participant in encounter
  * expr: type
  * Xpath: f:Encounter/f:participant/f:type
  * Type: token
  * Code: participanttype
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Encounter participanttype(@QueryParam("participanttype")String participanttype) {
  	return new Encounter();
  }
  /**
  * Descr: Persons involved in the encounter other than the patient
  * expr: individual
  * Xpath: f:Encounter/f:participant/f:individual
  * Type: reference
  * Code: practitioner
  */
  @GET
  @Path("individual")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Encounter practitioner() {
  	return new Encounter();
  }
  /**
  * Descr: Reason the encounter takes place (code)
  * expr: reason
  * Xpath: f:Encounter/f:reason
  * Type: token
  * Code: reason
  */
  @GET
  @Path("reason")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Encounter reason(@QueryParam("reason")String reason) {
  	return new Encounter();
  }
  /**
  * Descr: The custodian organization of this Encounter record
  * expr: serviceProvider
  * Xpath: f:Encounter/f:serviceProvider
  * Type: reference
  * Code: serviceprovider
  */
  @GET
  @Path("serviceProvider")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Encounter serviceprovider() {
  	return new Encounter();
  }
  /**
  * Descr: Wheelchair, translator, stretcher, etc.
  * expr: specialArrangement
  * Xpath: f:Encounter/f:hospitalization/f:specialArrangement
  * Type: token
  * Code: specialarrangement
  */
  @GET
  @Path("specialArrangement")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Encounter specialarrangement(@QueryParam("specialarrangement")String specialarrangement) {
  	return new Encounter();
  }
  /**
  * Descr: planned | arrived | triaged | in-progress | onleave | finished | cancelled +
  * expr: status
  * Xpath: f:Encounter/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Encounter status(@QueryParam("status")String status) {
  	return new Encounter();
  }
  /**
  * Descr: The patient ro group present at the encounter
  * expr: subject
  * Xpath: f:Encounter/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Encounter subject() {
  	return new Encounter();
  }
}
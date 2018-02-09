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

import org.fhir.pojo.Appointment;
import org.fhir.service.AppointmentService;

@Path("/Appointment")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class AppointmentResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AppointmentService service;

  @Inject
  public AppointmentResource(final AppointmentService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Appointment create(Appointment obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Appointment update( Appointment obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Appointment find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Appointment> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Appointment> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Any one of the individuals participating in the appointment
  * expr: actor
  * Xpath: f:Appointment/f:participant/f:actor
  * Type: reference
  * Code: actor
  */
  @GET
  @Path("actor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Appointment actor() {
  	return new Appointment();
  }
  /**
  * Descr: The style of appointment or patient that has been booked in the slot (not service type)
  * expr: appointmentType
  * Xpath: f:Appointment/f:appointmentType
  * Type: token
  * Code: appointmenttype
  */
  @GET
  @Path("appointmentType")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Appointment appointmenttype(@QueryParam("appointmenttype")String appointmenttype) {
  	return new Appointment();
  }
  /**
  * Descr: Appointment date/time.
  * expr: start
  * Xpath: f:Appointment/f:start
  * Type: date
  * Code: date
  */
  @GET
  @Path("start")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Appointment date(@QueryParam("date")String date) {
  	return new Appointment();
  }
  /**
  * Descr: An Identifier of the Appointment
  * expr: identifier
  * Xpath: f:Appointment/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Appointment identifier(@QueryParam("identifier")String identifier) {
  	return new Appointment();
  }
  /**
  * Descr: The ReferralRequest provided as information to allocate to the Encounter
  * expr: incomingReferral
  * Xpath: f:Appointment/f:incomingReferral
  * Type: reference
  * Code: incomingreferral
  */
  @GET
  @Path("incomingReferral")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Appointment incomingreferral() {
  	return new Appointment();
  }
  /**
  * Descr: This location is listed in the participants of the appointment
  * expr: actor
  * Xpath: f:Appointment/f:participant/f:actor
  * Type: reference
  * Code: location
  */
  @GET
  @Path("actor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Appointment location() {
  	return new Appointment();
  }
  /**
  * Descr: The Participation status of the subject, or other participant on the appointment. Can be used to locate participants that have not responded to meeting requests.
  * expr: status
  * Xpath: f:Appointment/f:participant/f:status
  * Type: token
  * Code: partstatus
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Appointment partstatus(@QueryParam("partstatus")String partstatus) {
  	return new Appointment();
  }
  /**
  * Descr: One of the individuals of the appointment is this patient
  * expr: actor
  * Xpath: f:Appointment/f:participant/f:actor
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("actor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Appointment patient() {
  	return new Appointment();
  }
  /**
  * Descr: One of the individuals of the appointment is this practitioner
  * expr: actor
  * Xpath: f:Appointment/f:participant/f:actor
  * Type: reference
  * Code: practitioner
  */
  @GET
  @Path("actor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Appointment practitioner() {
  	return new Appointment();
  }
  /**
  * Descr: The specific service that is to be performed during this appointment
  * expr: serviceType
  * Xpath: f:Appointment/f:serviceType
  * Type: token
  * Code: servicetype
  */
  @GET
  @Path("serviceType")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Appointment servicetype(@QueryParam("servicetype")String servicetype) {
  	return new Appointment();
  }
  /**
  * Descr: The overall status of the appointment
  * expr: status
  * Xpath: f:Appointment/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Appointment status(@QueryParam("status")String status) {
  	return new Appointment();
  }
}
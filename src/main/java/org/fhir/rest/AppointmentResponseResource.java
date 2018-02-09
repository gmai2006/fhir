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

import org.fhir.pojo.AppointmentResponse;
import org.fhir.service.AppointmentResponseService;

@Path("/AppointmentResponse")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class AppointmentResponseResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AppointmentResponseService service;

  @Inject
  public AppointmentResponseResource(final AppointmentResponseService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public AppointmentResponse create(AppointmentResponse obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public AppointmentResponse update( AppointmentResponse obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public AppointmentResponse find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<AppointmentResponse> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<AppointmentResponse> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The Person, Location/HealthcareService or Device that this appointment response replies for
  * expr: actor
  * Xpath: f:AppointmentResponse/f:actor
  * Type: reference
  * Code: actor
  */
  @GET
  @Path("actor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AppointmentResponse actor() {
  	return new AppointmentResponse();
  }
  /**
  * Descr: The appointment that the response is attached to
  * expr: appointment
  * Xpath: f:AppointmentResponse/f:appointment
  * Type: reference
  * Code: appointment
  */
  @GET
  @Path("appointment")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AppointmentResponse appointment() {
  	return new AppointmentResponse();
  }
  /**
  * Descr: An Identifier in this appointment response
  * expr: identifier
  * Xpath: f:AppointmentResponse/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AppointmentResponse identifier(@QueryParam("identifier")String identifier) {
  	return new AppointmentResponse();
  }
  /**
  * Descr: This Response is for this Location
  * expr: actor
  * Xpath: f:AppointmentResponse/f:actor
  * Type: reference
  * Code: location
  */
  @GET
  @Path("actor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AppointmentResponse location() {
  	return new AppointmentResponse();
  }
  /**
  * Descr: The participants acceptance status for this appointment
  * expr: participantStatus
  * Xpath: f:AppointmentResponse/f:participantStatus
  * Type: token
  * Code: partstatus
  */
  @GET
  @Path("participantStatus")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AppointmentResponse partstatus(@QueryParam("partstatus")String partstatus) {
  	return new AppointmentResponse();
  }
  /**
  * Descr: This Response is for this Patient
  * expr: actor
  * Xpath: f:AppointmentResponse/f:actor
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("actor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AppointmentResponse patient() {
  	return new AppointmentResponse();
  }
  /**
  * Descr: This Response is for this Practitioner
  * expr: actor
  * Xpath: f:AppointmentResponse/f:actor
  * Type: reference
  * Code: practitioner
  */
  @GET
  @Path("actor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AppointmentResponse practitioner() {
  	return new AppointmentResponse();
  }
}
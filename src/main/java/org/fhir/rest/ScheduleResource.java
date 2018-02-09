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

import org.fhir.pojo.Schedule;
import org.fhir.service.ScheduleService;

@Path("/Schedule")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ScheduleResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ScheduleService service;

  @Inject
  public ScheduleResource(final ScheduleService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Schedule create(Schedule obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Schedule update( Schedule obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Schedule find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Schedule> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Schedule> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Is the schedule in active use
  * expr: active
  * Xpath: f:Schedule/f:active
  * Type: token
  * Code: active
  */
  @GET
  @Path("active")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Schedule active(@QueryParam("active")String active) {
  	return new Schedule();
  }
  /**
  * Descr: The individual(HealthcareService, Practitioner, Location, ...) to find a Schedule for
  * expr: actor
  * Xpath: f:Schedule/f:actor
  * Type: reference
  * Code: actor
  */
  @GET
  @Path("actor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Schedule actor() {
  	return new Schedule();
  }
  /**
  * Descr: Search for Schedule resources that have a period that contains this date specified
  * expr: planningHorizon
  * Xpath: f:Schedule/f:planningHorizon
  * Type: date
  * Code: date
  */
  @GET
  @Path("planningHorizon")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Schedule date(@QueryParam("date")String date) {
  	return new Schedule();
  }
  /**
  * Descr: A Schedule Identifier
  * expr: identifier
  * Xpath: f:Schedule/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Schedule identifier(@QueryParam("identifier")String identifier) {
  	return new Schedule();
  }
  /**
  * Descr: The type of appointments that can be booked into associated slot(s)
  * expr: serviceType
  * Xpath: f:Schedule/f:serviceType
  * Type: token
  * Code: type
  */
  @GET
  @Path("serviceType")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Schedule type(@QueryParam("type")String type) {
  	return new Schedule();
  }
}
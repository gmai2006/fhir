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

import org.fhir.pojo.Slot;
import org.fhir.service.SlotService;

@Path("/Slot")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class SlotResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SlotService service;

  @Inject
  public SlotResource(final SlotService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Slot create(Slot obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Slot update( Slot obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Slot find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Slot> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Slot> findWithLimit(@PathParam("max") String max) {
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
  * Descr: A Slot Identifier
  * expr: identifier
  * Xpath: f:Slot/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Slot identifier(@QueryParam("identifier")String identifier) {
  	return new Slot();
  }
  /**
  * Descr: The Schedule Resource that we are seeking a slot within
  * expr: schedule
  * Xpath: f:Slot/f:schedule
  * Type: reference
  * Code: schedule
  */
  @GET
  @Path("schedule")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Slot schedule() {
  	return new Slot();
  }
  /**
  * Descr: The type of appointments that can be booked into the slot
  * expr: serviceType
  * Xpath: f:Slot/f:serviceType
  * Type: token
  * Code: slottype
  */
  @GET
  @Path("serviceType")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Slot slottype(@QueryParam("slottype")String slottype) {
  	return new Slot();
  }
  /**
  * Descr: Appointment date/time.
  * expr: start
  * Xpath: f:Slot/f:start
  * Type: date
  * Code: start
  */
  @GET
  @Path("start")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Slot start(@QueryParam("start")String start) {
  	return new Slot();
  }
  /**
  * Descr: The free/busy status of the appointment
  * expr: status
  * Xpath: f:Slot/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Slot status(@QueryParam("status")String status) {
  	return new Slot();
  }
}
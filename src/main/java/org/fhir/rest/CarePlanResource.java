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

import org.fhir.pojo.CarePlan;
import org.fhir.service.CarePlanService;

@Path("/CarePlan")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class CarePlanResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CarePlanService service;

  @Inject
  public CarePlanResource(final CarePlanService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public CarePlan create(CarePlan obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public CarePlan update( CarePlan obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public CarePlan find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<CarePlan> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<CarePlan> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Detail type of activity
  * expr: code
  * Xpath: f:CarePlan/f:activity/f:detail/f:code
  * Type: token
  * Code: activitycode
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CarePlan activitycode(@QueryParam("activitycode")String activitycode) {
  	return new CarePlan();
  }
  /**
  * Descr: Specified date occurs within period specified by CarePlan.activity.timingSchedule
  * expr: scheduled
  * Xpath: f:CarePlan/f:activity/f:detail/f:scheduledTiming | f:CarePlan/f:activity/f:detail/f:scheduledPeriod | f:CarePlan/f:activity/f:detail/f:scheduledString
  * Type: date
  * Code: activitydate
  */
  @GET
  @Path("scheduled")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CarePlan activitydate(@QueryParam("activitydate")String activitydate) {
  	return new CarePlan();
  }
  /**
  * Descr: Activity details defined in specific resource
  * expr: reference
  * Xpath: f:CarePlan/f:activity/f:reference
  * Type: reference
  * Code: activityreference
  */
  @GET
  @Path("reference")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CarePlan activityreference() {
  	return new CarePlan();
  }
  /**
  * Descr: Fulfills care plan
  * expr: basedOn
  * Xpath: f:CarePlan/f:basedOn
  * Type: reference
  * Code: basedon
  */
  @GET
  @Path("basedOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CarePlan basedon() {
  	return new CarePlan();
  }
  /**
  * Descr: Who's involved in plan?
  * expr: careTeam
  * Xpath: f:CarePlan/f:careTeam
  * Type: reference
  * Code: careteam
  */
  @GET
  @Path("careTeam")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CarePlan careteam() {
  	return new CarePlan();
  }
  /**
  * Descr: Type of plan
  * expr: category
  * Xpath: f:CarePlan/f:category
  * Type: token
  * Code: category
  */
  @GET
  @Path("category")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CarePlan category(@QueryParam("category")String category) {
  	return new CarePlan();
  }
  /**
  * Descr: Health issues this plan addresses
  * expr: addresses
  * Xpath: f:CarePlan/f:addresses
  * Type: reference
  * Code: condition
  */
  @GET
  @Path("addresses")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CarePlan condition() {
  	return new CarePlan();
  }
  /**
  * Descr: Created in context of
  * expr: context
  * Xpath: f:CarePlan/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CarePlan context() {
  	return new CarePlan();
  }
  /**
  * Descr: Protocol or definition
  * expr: definition
  * Xpath: f:CarePlan/f:definition
  * Type: reference
  * Code: definition
  */
  @GET
  @Path("definition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CarePlan definition() {
  	return new CarePlan();
  }
  /**
  * Descr: Created in context of
  * expr: context
  * Xpath: f:CarePlan/f:context
  * Type: reference
  * Code: encounter
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CarePlan encounter() {
  	return new CarePlan();
  }
  /**
  * Descr: Desired outcome of plan
  * expr: goal
  * Xpath: f:CarePlan/f:goal
  * Type: reference
  * Code: goal
  */
  @GET
  @Path("goal")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CarePlan goal() {
  	return new CarePlan();
  }
  /**
  * Descr: proposal | plan | order | option
  * expr: intent
  * Xpath: f:CarePlan/f:intent
  * Type: token
  * Code: intent
  */
  @GET
  @Path("intent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CarePlan intent(@QueryParam("intent")String intent) {
  	return new CarePlan();
  }
  /**
  * Descr: Part of referenced CarePlan
  * expr: partOf
  * Xpath: f:CarePlan/f:partOf
  * Type: reference
  * Code: partof
  */
  @GET
  @Path("partOf")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CarePlan partof() {
  	return new CarePlan();
  }
  /**
  * Descr: Matches if the practitioner is listed as a performer in any of the "simple" activities.  (For performers of the detailed activities, chain through the activitydetail search parameter.)
  * expr: performer
  * Xpath: f:CarePlan/f:activity/f:detail/f:performer
  * Type: reference
  * Code: performer
  */
  @GET
  @Path("performer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CarePlan performer() {
  	return new CarePlan();
  }
  /**
  * Descr: CarePlan replaced by this CarePlan
  * expr: replaces
  * Xpath: f:CarePlan/f:replaces
  * Type: reference
  * Code: replaces
  */
  @GET
  @Path("replaces")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CarePlan replaces() {
  	return new CarePlan();
  }
  /**
  * Descr: draft | active | suspended | completed | entered-in-error | cancelled | unknown
  * expr: status
  * Xpath: f:CarePlan/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CarePlan status(@QueryParam("status")String status) {
  	return new CarePlan();
  }
  /**
  * Descr: Who care plan is for
  * expr: subject
  * Xpath: f:CarePlan/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CarePlan subject() {
  	return new CarePlan();
  }
}
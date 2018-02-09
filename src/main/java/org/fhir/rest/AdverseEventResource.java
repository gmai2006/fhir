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

import org.fhir.pojo.AdverseEvent;
import org.fhir.service.AdverseEventService;

@Path("/AdverseEvent")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class AdverseEventResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AdverseEventService service;

  @Inject
  public AdverseEventResource(final AdverseEventService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public AdverseEvent create(AdverseEvent obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public AdverseEvent update( AdverseEvent obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public AdverseEvent find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<AdverseEvent> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<AdverseEvent> findWithLimit(@PathParam("max") String max) {
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
  * Descr: AE | PAE An adverse event is an event that caused harm to a patient,  an adverse reaction is a something that is a subject-specific event that is a result of an exposure to a medication, food, device or environmental substance, a potential adverse event is something that occurred and that could have caused harm to a patient but did not
  * expr: category
  * Xpath: f:AdverseEvent/f:category
  * Type: token
  * Code: category
  */
  @GET
  @Path("category")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AdverseEvent category(@QueryParam("category")String category) {
  	return new AdverseEvent();
  }
  /**
  * Descr: When the event occurred
  * expr: date
  * Xpath: f:AdverseEvent/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AdverseEvent date(@QueryParam("date")String date) {
  	return new AdverseEvent();
  }
  /**
  * Descr: Location where adverse event occurred
  * expr: location
  * Xpath: f:AdverseEvent/f:location
  * Type: reference
  * Code: location
  */
  @GET
  @Path("location")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AdverseEvent location() {
  	return new AdverseEvent();
  }
  /**
  * Descr: Adverse Reaction Events linked to exposure to substance
  * expr: reaction
  * Xpath: f:AdverseEvent/f:reaction
  * Type: reference
  * Code: reaction
  */
  @GET
  @Path("reaction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AdverseEvent reaction() {
  	return new AdverseEvent();
  }
  /**
  * Descr: Who recorded the adverse event
  * expr: recorder
  * Xpath: f:AdverseEvent/f:recorder
  * Type: reference
  * Code: recorder
  */
  @GET
  @Path("recorder")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AdverseEvent recorder() {
  	return new AdverseEvent();
  }
  /**
  * Descr: Mild | Moderate | Severe
  * expr: seriousness
  * Xpath: f:AdverseEvent/f:seriousness
  * Type: token
  * Code: seriousness
  */
  @GET
  @Path("seriousness")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AdverseEvent seriousness(@QueryParam("seriousness")String seriousness) {
  	return new AdverseEvent();
  }
  /**
  * Descr: AdverseEvent.study
  * expr: study
  * Xpath: f:AdverseEvent/f:study
  * Type: reference
  * Code: study
  */
  @GET
  @Path("study")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AdverseEvent study() {
  	return new AdverseEvent();
  }
  /**
  * Descr: Subject or group impacted by event
  * expr: subject
  * Xpath: f:AdverseEvent/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AdverseEvent subject() {
  	return new AdverseEvent();
  }
  /**
  * Descr: Refers to the specific entity that caused the adverse event
  * expr: instance
  * Xpath: f:AdverseEvent/f:suspectEntity/f:instance
  * Type: reference
  * Code: substance
  */
  @GET
  @Path("instance")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AdverseEvent substance() {
  	return new AdverseEvent();
  }
  /**
  * Descr: actual | potential
  * expr: type
  * Xpath: f:AdverseEvent/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AdverseEvent type(@QueryParam("type")String type) {
  	return new AdverseEvent();
  }
}
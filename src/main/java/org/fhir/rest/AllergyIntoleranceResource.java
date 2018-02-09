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

import org.fhir.pojo.AllergyIntolerance;
import org.fhir.service.AllergyIntoleranceService;

@Path("/AllergyIntolerance")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class AllergyIntoleranceResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AllergyIntoleranceService service;

  @Inject
  public AllergyIntoleranceResource(final AllergyIntoleranceService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public AllergyIntolerance create(AllergyIntolerance obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public AllergyIntolerance update( AllergyIntolerance obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public AllergyIntolerance find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<AllergyIntolerance> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<AllergyIntolerance> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Source of the information about the allergy
  * expr: asserter
  * Xpath: f:AllergyIntolerance/f:asserter
  * Type: reference
  * Code: asserter
  */
  @GET
  @Path("asserter")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AllergyIntolerance asserter() {
  	return new AllergyIntolerance();
  }
  /**
  * Descr: food | medication | environment | biologic
  * expr: category
  * Xpath: f:AllergyIntolerance/f:category
  * Type: token
  * Code: category
  */
  @GET
  @Path("category")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AllergyIntolerance category(@QueryParam("category")String category) {
  	return new AllergyIntolerance();
  }
  /**
  * Descr: active | inactive | resolved
  * expr: clinicalStatus
  * Xpath: f:AllergyIntolerance/f:clinicalStatus
  * Type: token
  * Code: clinicalstatus
  */
  @GET
  @Path("clinicalStatus")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AllergyIntolerance clinicalstatus(@QueryParam("clinicalstatus")String clinicalstatus) {
  	return new AllergyIntolerance();
  }
  /**
  * Descr: low | high | unable-to-assess
  * expr: criticality
  * Xpath: f:AllergyIntolerance/f:criticality
  * Type: token
  * Code: criticality
  */
  @GET
  @Path("criticality")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AllergyIntolerance criticality(@QueryParam("criticality")String criticality) {
  	return new AllergyIntolerance();
  }
  /**
  * Descr: Date(/time) of last known occurrence of a reaction
  * expr: lastOccurrence
  * Xpath: f:AllergyIntolerance/f:lastOccurrence
  * Type: date
  * Code: lastdate
  */
  @GET
  @Path("lastOccurrence")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AllergyIntolerance lastdate(@QueryParam("lastdate")String lastdate) {
  	return new AllergyIntolerance();
  }
  /**
  * Descr: Clinical symptoms/signs associated with the Event
  * expr: manifestation
  * Xpath: f:AllergyIntolerance/f:reaction/f:manifestation
  * Type: token
  * Code: manifestation
  */
  @GET
  @Path("manifestation")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AllergyIntolerance manifestation(@QueryParam("manifestation")String manifestation) {
  	return new AllergyIntolerance();
  }
  /**
  * Descr: Date(/time) when manifestations showed
  * expr: onset
  * Xpath: f:AllergyIntolerance/f:reaction/f:onset
  * Type: date
  * Code: onset
  */
  @GET
  @Path("onset")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AllergyIntolerance onset(@QueryParam("onset")String onset) {
  	return new AllergyIntolerance();
  }
  /**
  * Descr: Who recorded the sensitivity
  * expr: recorder
  * Xpath: f:AllergyIntolerance/f:recorder
  * Type: reference
  * Code: recorder
  */
  @GET
  @Path("recorder")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AllergyIntolerance recorder() {
  	return new AllergyIntolerance();
  }
  /**
  * Descr: How the subject was exposed to the substance
  * expr: exposureRoute
  * Xpath: f:AllergyIntolerance/f:reaction/f:exposureRoute
  * Type: token
  * Code: route
  */
  @GET
  @Path("exposureRoute")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AllergyIntolerance route(@QueryParam("route")String route) {
  	return new AllergyIntolerance();
  }
  /**
  * Descr: mild | moderate | severe (of event as a whole)
  * expr: severity
  * Xpath: f:AllergyIntolerance/f:reaction/f:severity
  * Type: token
  * Code: severity
  */
  @GET
  @Path("severity")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AllergyIntolerance severity(@QueryParam("severity")String severity) {
  	return new AllergyIntolerance();
  }
  /**
  * Descr: unconfirmed | confirmed | refuted | entered-in-error
  * expr: verificationStatus
  * Xpath: f:AllergyIntolerance/f:verificationStatus
  * Type: token
  * Code: verificationstatus
  */
  @GET
  @Path("verificationStatus")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AllergyIntolerance verificationstatus(@QueryParam("verificationstatus")String verificationstatus) {
  	return new AllergyIntolerance();
  }
}
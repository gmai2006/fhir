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

import org.fhir.pojo.ImmunizationRecommendation;
import org.fhir.service.ImmunizationRecommendationService;

@Path("/ImmunizationRecommendation")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ImmunizationRecommendationResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ImmunizationRecommendationService service;

  @Inject
  public ImmunizationRecommendationResource(final ImmunizationRecommendationService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public ImmunizationRecommendation create(ImmunizationRecommendation obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public ImmunizationRecommendation update( ImmunizationRecommendation obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public ImmunizationRecommendation find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<ImmunizationRecommendation> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<ImmunizationRecommendation> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Date recommendation created
  * expr: date
  * Xpath: f:ImmunizationRecommendation/f:recommendation/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImmunizationRecommendation date(@QueryParam("date")String date) {
  	return new ImmunizationRecommendation();
  }
  /**
  * Descr: Recommended dose number
  * expr: doseNumber
  * Xpath: f:ImmunizationRecommendation/f:recommendation/f:doseNumber
  * Type: number
  * Code: dosenumber
  */
  @GET
  @Path("doseNumber")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImmunizationRecommendation dosenumber(@QueryParam("dosenumber")String dosenumber) {
  	return new ImmunizationRecommendation();
  }
  /**
  * Descr: Dose number within sequence
  * expr: doseSequence
  * Xpath: f:ImmunizationRecommendation/f:recommendation/f:protocol/f:doseSequence
  * Type: number
  * Code: dosesequence
  */
  @GET
  @Path("doseSequence")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImmunizationRecommendation dosesequence(@QueryParam("dosesequence")String dosesequence) {
  	return new ImmunizationRecommendation();
  }
  /**
  * Descr: Business identifier
  * expr: identifier
  * Xpath: f:ImmunizationRecommendation/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImmunizationRecommendation identifier(@QueryParam("identifier")String identifier) {
  	return new ImmunizationRecommendation();
  }
  /**
  * Descr: Patient observations supporting recommendation
  * expr: supportingPatientInformation
  * Xpath: f:ImmunizationRecommendation/f:recommendation/f:supportingPatientInformation
  * Type: reference
  * Code: information
  */
  @GET
  @Path("supportingPatientInformation")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImmunizationRecommendation information() {
  	return new ImmunizationRecommendation();
  }
  /**
  * Descr: Who this profile is for
  * expr: patient
  * Xpath: f:ImmunizationRecommendation/f:patient
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("patient")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImmunizationRecommendation patient() {
  	return new ImmunizationRecommendation();
  }
  /**
  * Descr: Vaccine administration status
  * expr: forecastStatus
  * Xpath: f:ImmunizationRecommendation/f:recommendation/f:forecastStatus
  * Type: token
  * Code: status
  */
  @GET
  @Path("forecastStatus")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImmunizationRecommendation status(@QueryParam("status")String status) {
  	return new ImmunizationRecommendation();
  }
  /**
  * Descr: Past immunizations supporting recommendation
  * expr: supportingImmunization
  * Xpath: f:ImmunizationRecommendation/f:recommendation/f:supportingImmunization
  * Type: reference
  * Code: support
  */
  @GET
  @Path("supportingImmunization")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImmunizationRecommendation support() {
  	return new ImmunizationRecommendation();
  }
  /**
  * Descr: Disease to be immunized against
  * expr: targetDisease
  * Xpath: f:ImmunizationRecommendation/f:recommendation/f:targetDisease
  * Type: token
  * Code: targetdisease
  */
  @GET
  @Path("targetDisease")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImmunizationRecommendation targetdisease(@QueryParam("targetdisease")String targetdisease) {
  	return new ImmunizationRecommendation();
  }
  /**
  * Descr: Vaccine recommendation applies to
  * expr: vaccineCode
  * Xpath: f:ImmunizationRecommendation/f:recommendation/f:vaccineCode
  * Type: token
  * Code: vaccinetype
  */
  @GET
  @Path("vaccineCode")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImmunizationRecommendation vaccinetype(@QueryParam("vaccinetype")String vaccinetype) {
  	return new ImmunizationRecommendation();
  }
}
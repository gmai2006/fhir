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

import org.fhir.pojo.Immunization;
import org.fhir.service.ImmunizationService;

@Path("/Immunization")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ImmunizationResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ImmunizationService service;

  @Inject
  public ImmunizationResource(final ImmunizationService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Immunization create(Immunization obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Immunization update( Immunization obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Immunization find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Immunization> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Immunization> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Dose number within series
  * expr: doseSequence
  * Xpath: f:Immunization/f:vaccinationProtocol/f:doseSequence
  * Type: number
  * Code: dosesequence
  */
  @GET
  @Path("doseSequence")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Immunization dosesequence(@QueryParam("dosesequence")String dosesequence) {
  	return new Immunization();
  }
  /**
  * Descr: The service delivery location or facility in which the vaccine was / was to be administered
  * expr: location
  * Xpath: f:Immunization/f:location
  * Type: reference
  * Code: location
  */
  @GET
  @Path("location")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Immunization location() {
  	return new Immunization();
  }
  /**
  * Descr: Vaccine Lot Number
  * expr: lotNumber
  * Xpath: f:Immunization/f:lotNumber
  * Type: string
  * Code: lotnumber
  */
  @GET
  @Path("lotNumber")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Immunization lotnumber(@QueryParam("lotnumber")String lotnumber) {
  	return new Immunization();
  }
  /**
  * Descr: Vaccine Manufacturer
  * expr: manufacturer
  * Xpath: f:Immunization/f:manufacturer
  * Type: reference
  * Code: manufacturer
  */
  @GET
  @Path("manufacturer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Immunization manufacturer() {
  	return new Immunization();
  }
  /**
  * Descr: Administrations which were not given
  * expr: notGiven
  * Xpath: f:Immunization/f:notGiven
  * Type: token
  * Code: notgiven
  */
  @GET
  @Path("notGiven")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Immunization notgiven(@QueryParam("notgiven")String notgiven) {
  	return new Immunization();
  }
  /**
  * Descr: The practitioner who played a role in the vaccination
  * expr: actor
  * Xpath: f:Immunization/f:practitioner/f:actor
  * Type: reference
  * Code: practitioner
  */
  @GET
  @Path("actor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Immunization practitioner() {
  	return new Immunization();
  }
  /**
  * Descr: Additional information on reaction
  * expr: detail
  * Xpath: f:Immunization/f:reaction/f:detail
  * Type: reference
  * Code: reaction
  */
  @GET
  @Path("detail")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Immunization reaction() {
  	return new Immunization();
  }
  /**
  * Descr: When reaction started
  * expr: date
  * Xpath: f:Immunization/f:reaction/f:date
  * Type: date
  * Code: reactiondate
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Immunization reactiondate(@QueryParam("reactiondate")String reactiondate) {
  	return new Immunization();
  }
  /**
  * Descr: Why immunization occurred
  * expr: reason
  * Xpath: f:Immunization/f:explanation/f:reason
  * Type: token
  * Code: reason
  */
  @GET
  @Path("reason")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Immunization reason(@QueryParam("reason")String reason) {
  	return new Immunization();
  }
  /**
  * Descr: Explanation of reason vaccination was not administered
  * expr: reasonNotGiven
  * Xpath: f:Immunization/f:explanation/f:reasonNotGiven
  * Type: token
  * Code: reasonnotgiven
  */
  @GET
  @Path("reasonNotGiven")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Immunization reasonnotgiven(@QueryParam("reasonnotgiven")String reasonnotgiven) {
  	return new Immunization();
  }
  /**
  * Descr: Immunization event status
  * expr: status
  * Xpath: f:Immunization/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Immunization status(@QueryParam("status")String status) {
  	return new Immunization();
  }
  /**
  * Descr: Vaccine Product Administered
  * expr: vaccineCode
  * Xpath: f:Immunization/f:vaccineCode
  * Type: token
  * Code: vaccinecode
  */
  @GET
  @Path("vaccineCode")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Immunization vaccinecode(@QueryParam("vaccinecode")String vaccinecode) {
  	return new Immunization();
  }
}
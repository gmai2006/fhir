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

import org.fhir.pojo.MedicationAdministration;
import org.fhir.service.MedicationAdministrationService;

@Path("/MedicationAdministration")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class MedicationAdministrationResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MedicationAdministrationService service;

  @Inject
  public MedicationAdministrationResource(final MedicationAdministrationService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public MedicationAdministration create(MedicationAdministration obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public MedicationAdministration update( MedicationAdministration obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public MedicationAdministration find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<MedicationAdministration> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<MedicationAdministration> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Return administrations that share this encounter or episode of care
  * expr: context
  * Xpath: f:MedicationAdministration/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationAdministration context() {
  	return new MedicationAdministration();
  }
  /**
  * Descr: Return administrations with this administration device identity
  * expr: device
  * Xpath: f:MedicationAdministration/f:device
  * Type: reference
  * Code: device
  */
  @GET
  @Path("device")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationAdministration device() {
  	return new MedicationAdministration();
  }
  /**
  * Descr: Date administration happened (or did not happen)
  * expr: effective
  * Xpath: f:MedicationAdministration/f:effectiveDateTime | f:MedicationAdministration/f:effectivePeriod
  * Type: date
  * Code: effectivetime
  */
  @GET
  @Path("effective")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationAdministration effectivetime(@QueryParam("effectivetime")String effectivetime) {
  	return new MedicationAdministration();
  }
  /**
  * Descr: Administrations that were not made
  * expr: notGiven
  * Xpath: f:MedicationAdministration/f:notGiven
  * Type: token
  * Code: notgiven
  */
  @GET
  @Path("notGiven")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationAdministration notgiven(@QueryParam("notgiven")String notgiven) {
  	return new MedicationAdministration();
  }
  /**
  * Descr: The identify of the individual who administered the medication
  * expr: actor
  * Xpath: f:MedicationAdministration/f:performer/f:actor
  * Type: reference
  * Code: performer
  */
  @GET
  @Path("actor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationAdministration performer() {
  	return new MedicationAdministration();
  }
  /**
  * Descr: Multiple Resources: 

  * [MedicationAdministration](medicationadministration.html): The identity of a prescription to list administrations from
  * [MedicationDispense](medicationdispense.html): The identity of a prescription to list dispenses from

  * expr: authorizingPrescription
  * Xpath: f:MedicationAdministration/f:prescription | f:MedicationDispense/f:authorizingPrescription
  * Type: reference
  * Code: prescription
  */
  @GET
  @Path("authorizingPrescription")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationAdministration prescription() {
  	return new MedicationAdministration();
  }
  /**
  * Descr: Reasons for administering the medication
  * expr: reasonCode
  * Xpath: f:MedicationAdministration/f:reasonCode
  * Type: token
  * Code: reasongiven
  */
  @GET
  @Path("reasonCode")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationAdministration reasongiven(@QueryParam("reasongiven")String reasongiven) {
  	return new MedicationAdministration();
  }
  /**
  * Descr: Reasons for not administering the medication
  * expr: reasonNotGiven
  * Xpath: f:MedicationAdministration/f:reasonNotGiven
  * Type: token
  * Code: reasonnotgiven
  */
  @GET
  @Path("reasonNotGiven")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationAdministration reasonnotgiven(@QueryParam("reasonnotgiven")String reasonnotgiven) {
  	return new MedicationAdministration();
  }
  /**
  * Descr: The identify of the individual or group to list administrations for
  * expr: subject
  * Xpath: f:MedicationAdministration/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public MedicationAdministration subject() {
  	return new MedicationAdministration();
  }
}
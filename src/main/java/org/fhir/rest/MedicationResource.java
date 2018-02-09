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

import org.fhir.pojo.Medication;
import org.fhir.service.MedicationService;

@Path("/Medication")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class MedicationResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MedicationService service;

  @Inject
  public MedicationResource(final MedicationService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Medication create(Medication obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Medication update( Medication obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Medication find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Medication> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Medication> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Multiple Resources: 

  * [Medication](medication.html): Codes that identify this medication
  * [MedicationRequest](medicationrequest.html): Return prescriptions of this medication code
  * [MedicationAdministration](medicationadministration.html): Return administrations of this medication code
  * [MedicationStatement](medicationstatement.html): Return statements of this medication code
  * [MedicationDispense](medicationdispense.html): Return dispenses of this medicine code

  * expr: as(CodeableConcept)
  * Xpath: f:Medication/f:code | f:MedicationRequest/f:medicationCodeableConcept | f:MedicationAdministration/f:medicationCodeableConcept | f:MedicationStatement/f:medicationCodeableConcept | f:MedicationDispense/f:medicationCodeableConcept
  * Type: token
  * Code: code
  */
  @GET
  @Path("as(CodeableConcept)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Medication code(@QueryParam("code")String code) {
  	return new Medication();
  }
  /**
  * Descr: E.g. box, vial, blister-pack
  * expr: container
  * Xpath: f:Medication/f:package/f:container
  * Type: token
  * Code: container
  */
  @GET
  @Path("container")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Medication container(@QueryParam("container")String container) {
  	return new Medication();
  }
  /**
  * Descr: powder | tablets | capsule +
  * expr: form
  * Xpath: f:Medication/f:form
  * Type: token
  * Code: form
  */
  @GET
  @Path("form")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Medication form(@QueryParam("form")String form) {
  	return new Medication();
  }
  /**
  * Descr: The product contained
  * expr: as(Reference)
  * Xpath: f:Medication/f:ingredient/f:itemReference
  * Type: reference
  * Code: ingredient
  */
  @GET
  @Path("as(Reference)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Medication ingredient() {
  	return new Medication();
  }
  /**
  * Descr: The product contained
  * expr: as(CodeableConcept)
  * Xpath: f:Medication/f:ingredient/f:itemCodeableConcept
  * Type: token
  * Code: ingredientcode
  */
  @GET
  @Path("as(CodeableConcept)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Medication ingredientcode(@QueryParam("ingredientcode")String ingredientcode) {
  	return new Medication();
  }
  /**
  * Descr: Manufacturer of the item
  * expr: manufacturer
  * Xpath: f:Medication/f:manufacturer
  * Type: reference
  * Code: manufacturer
  */
  @GET
  @Path("manufacturer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Medication manufacturer() {
  	return new Medication();
  }
  /**
  * Descr: True if medication does not require a prescription
  * expr: isOverTheCounter
  * Xpath: f:Medication/f:isOverTheCounter
  * Type: token
  * Code: overthecounter
  */
  @GET
  @Path("isOverTheCounter")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Medication overthecounter(@QueryParam("overthecounter")String overthecounter) {
  	return new Medication();
  }
  /**
  * Descr: The item in the package
  * expr: as(Reference)
  * Xpath: f:Medication/f:package/f:content/f:itemReference
  * Type: reference
  * Code: packageitem
  */
  @GET
  @Path("as(Reference)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Medication packageitem() {
  	return new Medication();
  }
  /**
  * Descr: The item in the package
  * expr: as(CodeableConcept)
  * Xpath: f:Medication/f:package/f:content/f:itemCodeableConcept
  * Type: token
  * Code: packageitemcode
  */
  @GET
  @Path("as(CodeableConcept)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Medication packageitemcode(@QueryParam("packageitemcode")String packageitemcode) {
  	return new Medication();
  }
  /**
  * Descr: active | inactive | entered-in-error
  * expr: status
  * Xpath: f:Medication/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Medication status(@QueryParam("status")String status) {
  	return new Medication();
  }
}
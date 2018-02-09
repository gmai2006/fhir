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

import org.fhir.pojo.Patient;
import org.fhir.service.PatientService;

@Path("/Patient")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class PatientResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final PatientService service;

  @Inject
  public PatientResource(final PatientService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Patient create(Patient obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Patient update( Patient obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Patient find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Patient> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Patient> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Whether the patient record is active
  * expr: active
  * Xpath: f:Patient/f:active
  * Type: token
  * Code: active
  */
  @GET
  @Path("active")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Patient active(@QueryParam("active")String active) {
  	return new Patient();
  }
  /**
  * Descr: The breed for animal patients
  * expr: breed
  * Xpath: f:Patient/f:animal/f:breed
  * Type: token
  * Code: animalbreed
  */
  @GET
  @Path("breed")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Patient animalbreed(@QueryParam("animalbreed")String animalbreed) {
  	return new Patient();
  }
  /**
  * Descr: The species for animal patients
  * expr: species
  * Xpath: f:Patient/f:animal/f:species
  * Type: token
  * Code: animalspecies
  */
  @GET
  @Path("species")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Patient animalspecies(@QueryParam("animalspecies")String animalspecies) {
  	return new Patient();
  }
  /**
  * Descr: The date of death has been provided and satisfies this search value
  * expr: as(DateTime)
  * Xpath: f:Patient/f:deceasedDateTime
  * Type: date
  * Code: deathdate
  */
  @GET
  @Path("as(DateTime)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Patient deathdate(@QueryParam("deathdate")String deathdate) {
  	return new Patient();
  }
  /**
  * Descr: This patient has been marked as deceased, or as a death date entered
  * expr: exists()
  * Xpath: f:Patient/f:deceasedBoolean | f:Patient/f:deceasedDateTime
  * Type: token
  * Code: deceased
  */
  @GET
  @Path("exists()")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Patient deceased(@QueryParam("deceased")String deceased) {
  	return new Patient();
  }
  /**
  * Descr: Patient's nominated general practitioner, not the organization that manages the record
  * expr: generalPractitioner
  * Xpath: f:Patient/f:generalPractitioner
  * Type: reference
  * Code: generalpractitioner
  */
  @GET
  @Path("generalPractitioner")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Patient generalpractitioner() {
  	return new Patient();
  }
  /**
  * Descr: A patient identifier
  * expr: identifier
  * Xpath: f:Patient/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Patient identifier(@QueryParam("identifier")String identifier) {
  	return new Patient();
  }
  /**
  * Descr: Language code (irrespective of use value)
  * expr: language
  * Xpath: f:Patient/f:communication/f:language
  * Type: token
  * Code: language
  */
  @GET
  @Path("language")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Patient language(@QueryParam("language")String language) {
  	return new Patient();
  }
  /**
  * Descr: All patients linked to the given patient
  * expr: other
  * Xpath: f:Patient/f:link/f:other
  * Type: reference
  * Code: link
  */
  @GET
  @Path("other")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Patient link() {
  	return new Patient();
  }
  /**
  * Descr: A server defined search that may match any of the string fields in the HumanName, including family, give, prefix, suffix, suffix, and/or text
  * expr: name
  * Xpath: f:Patient/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Patient name(@QueryParam("name")String name) {
  	return new Patient();
  }
  /**
  * Descr: The organization at which this person is a patient
  * expr: managingOrganization
  * Xpath: f:Patient/f:managingOrganization
  * Type: reference
  * Code: organization
  */
  @GET
  @Path("managingOrganization")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Patient organization() {
  	return new Patient();
  }
}
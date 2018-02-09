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

import org.fhir.pojo.PractitionerRole;
import org.fhir.service.PractitionerRoleService;

@Path("/PractitionerRole")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class PractitionerRoleResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final PractitionerRoleService service;

  @Inject
  public PractitionerRoleResource(final PractitionerRoleService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public PractitionerRole create(PractitionerRole obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public PractitionerRole update( PractitionerRole obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public PractitionerRole find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<PractitionerRole> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<PractitionerRole> findWithLimit(@PathParam("max") String max) {
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

  * [PractitionerRole](practitionerrole.html): A value in an email contact
  * [RelatedPerson](relatedperson.html): A value in an email contact
  * [Practitioner](practitioner.html): A value in an email contact
  * [Person](person.html): A value in an email contact
  * [Patient](patient.html): A value in an email contact

  * expr: where(system='email')
  * Xpath: f:PractitionerRole/f:telecom[system/@value='email'] | f:RelatedPerson/f:telecom[system/@value='email'] | f:Practitioner/f:telecom[system/@value='email'] | f:Person/f:telecom[system/@value='email'] | f:Patient/f:telecom[system/@value='email']
  * Type: token
  * Code: email
  */
  @GET
  @Path("where(system='email')")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PractitionerRole email(@QueryParam("email")String email) {
  	return new PractitionerRole();
  }
  /**
  * Descr: Multiple Resources: 

  * [PractitionerRole](practitionerrole.html): A value in a phone contact
  * [RelatedPerson](relatedperson.html): A value in a phone contact
  * [Practitioner](practitioner.html): A value in a phone contact
  * [Person](person.html): A value in a phone contact
  * [Patient](patient.html): A value in a phone contact

  * expr: where(system='phone')
  * Xpath: f:PractitionerRole/f:telecom[system/@value='phone'] | f:RelatedPerson/f:telecom[system/@value='phone'] | f:Practitioner/f:telecom[system/@value='phone'] | f:Person/f:telecom[system/@value='phone'] | f:Patient/f:telecom[system/@value='phone']
  * Type: token
  * Code: phone
  */
  @GET
  @Path("where(system='phone')")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PractitionerRole phone(@QueryParam("phone")String phone) {
  	return new PractitionerRole();
  }
  /**
  * Descr: Multiple Resources: 

  * [PractitionerRole](practitionerrole.html): The value in any kind of contact
  * [RelatedPerson](relatedperson.html): The value in any kind of contact
  * [Practitioner](practitioner.html): The value in any kind of contact
  * [Person](person.html): The value in any kind of contact
  * [Patient](patient.html): The value in any kind of telecom details of the patient

  * expr: telecom
  * Xpath: f:PractitionerRole/f:telecom | f:RelatedPerson/f:telecom | f:Practitioner/f:telecom | f:Person/f:telecom | f:Patient/f:telecom
  * Type: token
  * Code: telecom
  */
  @GET
  @Path("telecom")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PractitionerRole telecom(@QueryParam("telecom")String telecom) {
  	return new PractitionerRole();
  }
  /**
  * Descr: Whether this practitioner's record is in active use
  * expr: active
  * Xpath: f:PractitionerRole/f:active
  * Type: token
  * Code: active
  */
  @GET
  @Path("active")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PractitionerRole active(@QueryParam("active")String active) {
  	return new PractitionerRole();
  }
  /**
  * Descr: The period during which the practitioner is authorized to perform in these role(s)
  * expr: period
  * Xpath: f:PractitionerRole/f:period
  * Type: date
  * Code: date
  */
  @GET
  @Path("period")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PractitionerRole date(@QueryParam("date")String date) {
  	return new PractitionerRole();
  }
  /**
  * Descr: Technical endpoints providing access to services operated for the practitioner with this role
  * expr: endpoint
  * Xpath: f:PractitionerRole/f:endpoint
  * Type: reference
  * Code: endpoint
  */
  @GET
  @Path("endpoint")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PractitionerRole endpoint() {
  	return new PractitionerRole();
  }
  /**
  * Descr: A practitioner's Identifier
  * expr: identifier
  * Xpath: f:PractitionerRole/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PractitionerRole identifier(@QueryParam("identifier")String identifier) {
  	return new PractitionerRole();
  }
  /**
  * Descr: One of the locations at which this practitioner provides care
  * expr: location
  * Xpath: f:PractitionerRole/f:location
  * Type: reference
  * Code: location
  */
  @GET
  @Path("location")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PractitionerRole location() {
  	return new PractitionerRole();
  }
  /**
  * Descr: The identity of the organization the practitioner represents / acts on behalf of
  * expr: organization
  * Xpath: f:PractitionerRole/f:organization
  * Type: reference
  * Code: organization
  */
  @GET
  @Path("organization")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PractitionerRole organization() {
  	return new PractitionerRole();
  }
  /**
  * Descr: Practitioner that is able to provide the defined services for the organation
  * expr: practitioner
  * Xpath: f:PractitionerRole/f:practitioner
  * Type: reference
  * Code: practitioner
  */
  @GET
  @Path("practitioner")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PractitionerRole practitioner() {
  	return new PractitionerRole();
  }
  /**
  * Descr: The practitioner can perform this role at for the organization
  * expr: code
  * Xpath: f:PractitionerRole/f:code
  * Type: token
  * Code: role
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PractitionerRole role(@QueryParam("role")String role) {
  	return new PractitionerRole();
  }
  /**
  * Descr: The list of healthcare services that this worker provides for this role's Organization/Location(s)
  * expr: healthcareService
  * Xpath: f:PractitionerRole/f:healthcareService
  * Type: reference
  * Code: service
  */
  @GET
  @Path("healthcareService")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PractitionerRole service() {
  	return new PractitionerRole();
  }
  /**
  * Descr: The practitioner has this specialty at an organization
  * expr: specialty
  * Xpath: f:PractitionerRole/f:specialty
  * Type: token
  * Code: specialty
  */
  @GET
  @Path("specialty")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PractitionerRole specialty(@QueryParam("specialty")String specialty) {
  	return new PractitionerRole();
  }
}
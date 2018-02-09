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

import org.fhir.pojo.ExplanationOfBenefit;
import org.fhir.service.ExplanationOfBenefitService;

@Path("/ExplanationOfBenefit")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ExplanationOfBenefitResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ExplanationOfBenefitService service;

  @Inject
  public ExplanationOfBenefitResource(final ExplanationOfBenefitService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public ExplanationOfBenefit create(ExplanationOfBenefit obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public ExplanationOfBenefit update( ExplanationOfBenefit obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public ExplanationOfBenefit find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<ExplanationOfBenefit> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<ExplanationOfBenefit> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Member of the CareTeam
  * expr: provider
  * Xpath: f:ExplanationOfBenefit/f:careTeam/f:provider
  * Type: reference
  * Code: careteam
  */
  @GET
  @Path("provider")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExplanationOfBenefit careteam() {
  	return new ExplanationOfBenefit();
  }
  /**
  * Descr: The reference to the claim
  * expr: claim
  * Xpath: f:ExplanationOfBenefit/f:claim
  * Type: reference
  * Code: claim
  */
  @GET
  @Path("claim")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExplanationOfBenefit claim() {
  	return new ExplanationOfBenefit();
  }
  /**
  * Descr: The plan under which the claim was adjudicated
  * expr: coverage
  * Xpath: f:ExplanationOfBenefit/f:insurance/f:coverage
  * Type: reference
  * Code: coverage
  */
  @GET
  @Path("coverage")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExplanationOfBenefit coverage() {
  	return new ExplanationOfBenefit();
  }
  /**
  * Descr: The creation date for the EOB
  * expr: created
  * Xpath: f:ExplanationOfBenefit/f:created
  * Type: date
  * Code: created
  */
  @GET
  @Path("created")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExplanationOfBenefit created(@QueryParam("created")String created) {
  	return new ExplanationOfBenefit();
  }
  /**
  * Descr: The contents of the disposition message
  * expr: disposition
  * Xpath: f:ExplanationOfBenefit/f:disposition
  * Type: string
  * Code: disposition
  */
  @GET
  @Path("disposition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExplanationOfBenefit disposition(@QueryParam("disposition")String disposition) {
  	return new ExplanationOfBenefit();
  }
  /**
  * Descr: Encounters associated with a billed line item
  * expr: encounter
  * Xpath: f:ExplanationOfBenefit/f:item/f:encounter
  * Type: reference
  * Code: encounter
  */
  @GET
  @Path("encounter")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExplanationOfBenefit encounter() {
  	return new ExplanationOfBenefit();
  }
  /**
  * Descr: The party responsible for the entry of the Claim
  * expr: enterer
  * Xpath: f:ExplanationOfBenefit/f:enterer
  * Type: reference
  * Code: enterer
  */
  @GET
  @Path("enterer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExplanationOfBenefit enterer() {
  	return new ExplanationOfBenefit();
  }
  /**
  * Descr: Facility responsible for the goods and services
  * expr: facility
  * Xpath: f:ExplanationOfBenefit/f:facility
  * Type: reference
  * Code: facility
  */
  @GET
  @Path("facility")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExplanationOfBenefit facility() {
  	return new ExplanationOfBenefit();
  }
  /**
  * Descr: The business identifier of the Explanation of Benefit
  * expr: identifier
  * Xpath: f:ExplanationOfBenefit/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExplanationOfBenefit identifier(@QueryParam("identifier")String identifier) {
  	return new ExplanationOfBenefit();
  }
  /**
  * Descr: The reference to the providing organization
  * expr: organization
  * Xpath: f:ExplanationOfBenefit/f:organization
  * Type: reference
  * Code: organization
  */
  @GET
  @Path("organization")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExplanationOfBenefit organization() {
  	return new ExplanationOfBenefit();
  }
  /**
  * Descr: The reference to the patient
  * expr: patient
  * Xpath: f:ExplanationOfBenefit/f:patient
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("patient")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExplanationOfBenefit patient() {
  	return new ExplanationOfBenefit();
  }
  /**
  * Descr: The party receiving any payment for the Claim
  * expr: party
  * Xpath: f:ExplanationOfBenefit/f:payee/f:party
  * Type: reference
  * Code: payee
  */
  @GET
  @Path("party")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExplanationOfBenefit payee() {
  	return new ExplanationOfBenefit();
  }
  /**
  * Descr: The reference to the provider
  * expr: provider
  * Xpath: f:ExplanationOfBenefit/f:provider
  * Type: reference
  * Code: provider
  */
  @GET
  @Path("provider")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ExplanationOfBenefit provider() {
  	return new ExplanationOfBenefit();
  }
}
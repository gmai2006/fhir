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

import org.fhir.pojo.ClinicalImpression;
import org.fhir.service.ClinicalImpressionService;

@Path("/ClinicalImpression")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ClinicalImpressionResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ClinicalImpressionService service;

  @Inject
  public ClinicalImpressionResource(final ClinicalImpressionService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public ClinicalImpression create(ClinicalImpression obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public ClinicalImpression update( ClinicalImpression obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public ClinicalImpression find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<ClinicalImpression> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<ClinicalImpression> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Action taken as part of assessment procedure
  * expr: action
  * Xpath: f:ClinicalImpression/f:action
  * Type: reference
  * Code: action
  */
  @GET
  @Path("action")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClinicalImpression action() {
  	return new ClinicalImpression();
  }
  /**
  * Descr: The clinician performing the assessment
  * expr: assessor
  * Xpath: f:ClinicalImpression/f:assessor
  * Type: reference
  * Code: assessor
  */
  @GET
  @Path("assessor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClinicalImpression assessor() {
  	return new ClinicalImpression();
  }
  /**
  * Descr: Encounter or Episode created from
  * expr: context
  * Xpath: f:ClinicalImpression/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClinicalImpression context() {
  	return new ClinicalImpression();
  }
  /**
  * Descr: What was found
  * expr: as(CodeableConcept)
  * Xpath: f:ClinicalImpression/f:finding/f:itemCodeableConcept
  * Type: token
  * Code: findingcode
  */
  @GET
  @Path("as(CodeableConcept)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClinicalImpression findingcode(@QueryParam("findingcode")String findingcode) {
  	return new ClinicalImpression();
  }
  /**
  * Descr: What was found
  * expr: as(Reference)
  * Xpath: f:ClinicalImpression/f:finding/f:itemReference
  * Type: reference
  * Code: findingref
  */
  @GET
  @Path("as(Reference)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClinicalImpression findingref() {
  	return new ClinicalImpression();
  }
  /**
  * Descr: Business identifier
  * expr: identifier
  * Xpath: f:ClinicalImpression/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClinicalImpression identifier(@QueryParam("identifier")String identifier) {
  	return new ClinicalImpression();
  }
  /**
  * Descr: Record of a specific investigation
  * expr: item
  * Xpath: f:ClinicalImpression/f:investigation/f:item
  * Type: reference
  * Code: investigation
  */
  @GET
  @Path("item")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClinicalImpression investigation() {
  	return new ClinicalImpression();
  }
  /**
  * Descr: Reference to last assessment
  * expr: previous
  * Xpath: f:ClinicalImpression/f:previous
  * Type: reference
  * Code: previous
  */
  @GET
  @Path("previous")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClinicalImpression previous() {
  	return new ClinicalImpression();
  }
  /**
  * Descr: Relevant impressions of patient state
  * expr: problem
  * Xpath: f:ClinicalImpression/f:problem
  * Type: reference
  * Code: problem
  */
  @GET
  @Path("problem")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClinicalImpression problem() {
  	return new ClinicalImpression();
  }
  /**
  * Descr: draft | completed | entered-in-error
  * expr: status
  * Xpath: f:ClinicalImpression/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClinicalImpression status(@QueryParam("status")String status) {
  	return new ClinicalImpression();
  }
  /**
  * Descr: Patient or group assessed
  * expr: subject
  * Xpath: f:ClinicalImpression/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClinicalImpression subject() {
  	return new ClinicalImpression();
  }
}
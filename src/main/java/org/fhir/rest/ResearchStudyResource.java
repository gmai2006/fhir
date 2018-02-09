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

import org.fhir.pojo.ResearchStudy;
import org.fhir.service.ResearchStudyService;

@Path("/ResearchStudy")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ResearchStudyResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ResearchStudyService service;

  @Inject
  public ResearchStudyResource(final ResearchStudyService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public ResearchStudy create(ResearchStudy obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public ResearchStudy update( ResearchStudy obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public ResearchStudy find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<ResearchStudy> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<ResearchStudy> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Classifications for the study
  * expr: category
  * Xpath: f:ResearchStudy/f:category
  * Type: token
  * Code: category
  */
  @GET
  @Path("category")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ResearchStudy category(@QueryParam("category")String category) {
  	return new ResearchStudy();
  }
  /**
  * Descr: When the study began and ended
  * expr: period
  * Xpath: f:ResearchStudy/f:period
  * Type: date
  * Code: date
  */
  @GET
  @Path("period")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ResearchStudy date(@QueryParam("date")String date) {
  	return new ResearchStudy();
  }
  /**
  * Descr: Drugs, devices, conditions, etc. under study
  * expr: focus
  * Xpath: f:ResearchStudy/f:focus
  * Type: token
  * Code: focus
  */
  @GET
  @Path("focus")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ResearchStudy focus(@QueryParam("focus")String focus) {
  	return new ResearchStudy();
  }
  /**
  * Descr: Business Identifier for study
  * expr: identifier
  * Xpath: f:ResearchStudy/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ResearchStudy identifier(@QueryParam("identifier")String identifier) {
  	return new ResearchStudy();
  }
  /**
  * Descr: Geographic region(s) for study
  * expr: jurisdiction
  * Xpath: f:ResearchStudy/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ResearchStudy jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new ResearchStudy();
  }
  /**
  * Descr: Used to search for the study
  * expr: keyword
  * Xpath: f:ResearchStudy/f:keyword
  * Type: token
  * Code: keyword
  */
  @GET
  @Path("keyword")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ResearchStudy keyword(@QueryParam("keyword")String keyword) {
  	return new ResearchStudy();
  }
  /**
  * Descr: Part of larger study
  * expr: partOf
  * Xpath: f:ResearchStudy/f:partOf
  * Type: reference
  * Code: partof
  */
  @GET
  @Path("partOf")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ResearchStudy partof() {
  	return new ResearchStudy();
  }
  /**
  * Descr: The individual responsible for the study
  * expr: principalInvestigator
  * Xpath: f:ResearchStudy/f:principalInvestigator
  * Type: reference
  * Code: principalinvestigator
  */
  @GET
  @Path("principalInvestigator")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ResearchStudy principalinvestigator() {
  	return new ResearchStudy();
  }
  /**
  * Descr: Steps followed in executing study
  * expr: protocol
  * Xpath: f:ResearchStudy/f:protocol
  * Type: reference
  * Code: protocol
  */
  @GET
  @Path("protocol")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ResearchStudy protocol() {
  	return new ResearchStudy();
  }
  /**
  * Descr: Location involved in study execution
  * expr: site
  * Xpath: f:ResearchStudy/f:site
  * Type: reference
  * Code: site
  */
  @GET
  @Path("site")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ResearchStudy site() {
  	return new ResearchStudy();
  }
  /**
  * Descr: Organization responsible for the study
  * expr: sponsor
  * Xpath: f:ResearchStudy/f:sponsor
  * Type: reference
  * Code: sponsor
  */
  @GET
  @Path("sponsor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ResearchStudy sponsor() {
  	return new ResearchStudy();
  }
  /**
  * Descr: draft | in-progress | suspended | stopped | completed | entered-in-error
  * expr: status
  * Xpath: f:ResearchStudy/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ResearchStudy status(@QueryParam("status")String status) {
  	return new ResearchStudy();
  }
  /**
  * Descr: Name for this study
  * expr: title
  * Xpath: f:ResearchStudy/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ResearchStudy title(@QueryParam("title")String title) {
  	return new ResearchStudy();
  }
}
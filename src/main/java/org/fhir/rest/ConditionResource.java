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

import org.fhir.pojo.Condition;
import org.fhir.service.ConditionService;

@Path("/Condition")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ConditionResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ConditionService service;

  @Inject
  public ConditionResource(final ConditionService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Condition create(Condition obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Condition update( Condition obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Condition find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Condition> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Condition> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Abatement as age or age range
  * expr: as(Age)
  * Xpath: f:Condition/f:abatementAge | f:Condition/f:abatementRange
  * Type: quantity
  * Code: abatementage
  */
  @GET
  @Path("as(Age)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition abatementage(@QueryParam("abatementage")String abatementage) {
  	return new Condition();
  }
  /**
  * Descr: Abatement boolean (boolean is true or non-boolean values are present)
  * expr: is(string)
  * Xpath: f:Condition/f:abatementDateTime | f:Condition/f:abatementAge | f:Condition/f:abatementBoolean | f:Condition/f:abatementPeriod | f:Condition/f:abatementRange | f:Condition/f:abatementString
  * Type: token
  * Code: abatementboolean
  */
  @GET
  @Path("is(string)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition abatementboolean(@QueryParam("abatementboolean")String abatementboolean) {
  	return new Condition();
  }
  /**
  * Descr: Date-related abatements (dateTime and period)
  * expr: as(Period)
  * Xpath: f:Condition/f:abatementDateTime | f:Condition/f:abatementPeriod
  * Type: date
  * Code: abatementdate
  */
  @GET
  @Path("as(Period)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition abatementdate(@QueryParam("abatementdate")String abatementdate) {
  	return new Condition();
  }
  /**
  * Descr: Abatement as a string
  * expr: as(string)
  * Xpath: f:Condition/f:abatementString
  * Type: string
  * Code: abatementstring
  */
  @GET
  @Path("as(string)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition abatementstring(@QueryParam("abatementstring")String abatementstring) {
  	return new Condition();
  }
  /**
  * Descr: Date record was believed accurate
  * expr: assertedDate
  * Xpath: f:Condition/f:assertedDate
  * Type: date
  * Code: asserteddate
  */
  @GET
  @Path("assertedDate")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition asserteddate(@QueryParam("asserteddate")String asserteddate) {
  	return new Condition();
  }
  /**
  * Descr: Person who asserts this condition
  * expr: asserter
  * Xpath: f:Condition/f:asserter
  * Type: reference
  * Code: asserter
  */
  @GET
  @Path("asserter")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition asserter() {
  	return new Condition();
  }
  /**
  * Descr: Anatomical location, if relevant
  * expr: bodySite
  * Xpath: f:Condition/f:bodySite
  * Type: token
  * Code: bodysite
  */
  @GET
  @Path("bodySite")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition bodysite(@QueryParam("bodysite")String bodysite) {
  	return new Condition();
  }
  /**
  * Descr: The category of the condition
  * expr: category
  * Xpath: f:Condition/f:category
  * Type: token
  * Code: category
  */
  @GET
  @Path("category")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition category(@QueryParam("category")String category) {
  	return new Condition();
  }
  /**
  * Descr: The clinical status of the condition
  * expr: clinicalStatus
  * Xpath: f:Condition/f:clinicalStatus
  * Type: token
  * Code: clinicalstatus
  */
  @GET
  @Path("clinicalStatus")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition clinicalstatus(@QueryParam("clinicalstatus")String clinicalstatus) {
  	return new Condition();
  }
  /**
  * Descr: Encounter or episode when condition first asserted
  * expr: context
  * Xpath: f:Condition/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition context() {
  	return new Condition();
  }
  /**
  * Descr: Encounter when condition first asserted
  * expr: context
  * Xpath: f:Condition/f:context
  * Type: reference
  * Code: encounter
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition encounter() {
  	return new Condition();
  }
  /**
  * Descr: Manifestation/symptom
  * expr: code
  * Xpath: f:Condition/f:evidence/f:code
  * Type: token
  * Code: evidence
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition evidence(@QueryParam("evidence")String evidence) {
  	return new Condition();
  }
  /**
  * Descr: Supporting information found elsewhere
  * expr: detail
  * Xpath: f:Condition/f:evidence/f:detail
  * Type: reference
  * Code: evidencedetail
  */
  @GET
  @Path("detail")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition evidencedetail() {
  	return new Condition();
  }
  /**
  * Descr: Onsets as age or age range
  * expr: as(Range)
  * Xpath: f:Condition/f:onsetAge | f:Condition/f:onsetRange
  * Type: quantity
  * Code: onsetage
  */
  @GET
  @Path("as(Range)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition onsetage(@QueryParam("onsetage")String onsetage) {
  	return new Condition();
  }
  /**
  * Descr: Date related onsets (dateTime and Period)
  * expr: as(Period)
  * Xpath: f:Condition/f:onsetDateTime | f:Condition/f:onsetPeriod
  * Type: date
  * Code: onsetdate
  */
  @GET
  @Path("as(Period)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition onsetdate(@QueryParam("onsetdate")String onsetdate) {
  	return new Condition();
  }
  /**
  * Descr: Onsets as a string
  * expr: as(string)
  * Xpath: f:Condition/f:onsetString
  * Type: string
  * Code: onsetinfo
  */
  @GET
  @Path("as(string)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition onsetinfo(@QueryParam("onsetinfo")String onsetinfo) {
  	return new Condition();
  }
  /**
  * Descr: The severity of the condition
  * expr: severity
  * Xpath: f:Condition/f:severity
  * Type: token
  * Code: severity
  */
  @GET
  @Path("severity")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition severity(@QueryParam("severity")String severity) {
  	return new Condition();
  }
  /**
  * Descr: Simple summary (disease specific)
  * expr: summary
  * Xpath: f:Condition/f:stage/f:summary
  * Type: token
  * Code: stage
  */
  @GET
  @Path("summary")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition stage(@QueryParam("stage")String stage) {
  	return new Condition();
  }
  /**
  * Descr: Who has the condition?
  * expr: subject
  * Xpath: f:Condition/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition subject() {
  	return new Condition();
  }
  /**
  * Descr: provisional | differential | confirmed | refuted | entered-in-error | unknown
  * expr: verificationStatus
  * Xpath: f:Condition/f:verificationStatus
  * Type: token
  * Code: verificationstatus
  */
  @GET
  @Path("verificationStatus")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Condition verificationstatus(@QueryParam("verificationstatus")String verificationstatus) {
  	return new Condition();
  }
}
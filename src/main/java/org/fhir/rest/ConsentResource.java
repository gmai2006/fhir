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

import org.fhir.pojo.Consent;
import org.fhir.service.ConsentService;

@Path("/Consent")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ConsentResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ConsentService service;

  @Inject
  public ConsentResource(final ConsentService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Consent create(Consent obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Consent update( Consent obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Consent find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Consent> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Consent> findWithLimit(@PathParam("max") String max) {
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

  * [Consent](consent.html): When this Consent was created or indexed
  * [SupplyRequest](supplyrequest.html): When the request was made
  * [RiskAssessment](riskassessment.html): When was assessment made?
  * [CareTeam](careteam.html): Time period team covers
  * [FamilyMemberHistory](familymemberhistory.html): When history was captured/updated
  * [Encounter](encounter.html): A date within the period the Encounter lasted
  * [AllergyIntolerance](allergyintolerance.html): Date record was believed accurate
  * [CarePlan](careplan.html): Time period plan covers
  * [EpisodeOfCare](episodeofcare.html): The provided date search value falls within the episode of care's period
  * [Procedure](procedure.html): Date/Period the procedure was performed
  * [List](list.html): When the list was prepared
  * [Immunization](immunization.html): Vaccination  (non)-Administration Date
  * [Flag](flag.html): Time period when flag is active
  * [Observation](observation.html): Obtained date/time. If the obtained element is a period, a date that falls in the period
  * [DiagnosticReport](diagnosticreport.html): The clinically relevant time of the report
  * [Composition](composition.html): Composition editing time
  * [DetectedIssue](detectedissue.html): When identified
  * [ClinicalImpression](clinicalimpression.html): When the assessment was documented

  * expr: date
  * Xpath: f:Consent/f:dateTime | f:SupplyRequest/f:authoredOn | f:RiskAssessment/f:occurrenceDateTime | f:CareTeam/f:period | f:FamilyMemberHistory/f:date | f:Encounter/f:period | f:AllergyIntolerance/f:assertedDate | f:CarePlan/f:period | f:EpisodeOfCare/f:period | f:Procedure/f:performedDateTime | f:Procedure/f:performedPeriod | f:List/f:date | f:Immunization/f:date | f:Flag/f:period | f:Observation/f:effectiveDateTime | f:Observation/f:effectivePeriod | f:DiagnosticReport/f:effectiveDateTime | f:DiagnosticReport/f:effectivePeriod | f:Composition/f:date | f:DetectedIssue/f:date | f:ClinicalImpression/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Consent date(@QueryParam("date")String date) {
  	return new Consent();
  }
  /**
  * Descr: Actions controlled by this consent
  * expr: action
  * Xpath: f:Consent/f:action | f:Consent/f:except/f:action
  * Type: token
  * Code: action
  */
  @GET
  @Path("action")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Consent action(@QueryParam("action")String action) {
  	return new Consent();
  }
  /**
  * Descr: Resource for the actor (or group, by role)
  * expr: reference
  * Xpath: f:Consent/f:actor/f:reference | f:Consent/f:except/f:actor/f:reference
  * Type: reference
  * Code: actor
  */
  @GET
  @Path("reference")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Consent actor() {
  	return new Consent();
  }
  /**
  * Descr: Classification of the consent statement - for indexing/retrieval
  * expr: category
  * Xpath: f:Consent/f:category
  * Type: token
  * Code: category
  */
  @GET
  @Path("category")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Consent category(@QueryParam("category")String category) {
  	return new Consent();
  }
  /**
  * Descr: Who is agreeing to the policy and exceptions
  * expr: consentingParty
  * Xpath: f:Consent/f:consentingParty
  * Type: reference
  * Code: consentor
  */
  @GET
  @Path("consentingParty")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Consent consentor() {
  	return new Consent();
  }
  /**
  * Descr: The actual data reference
  * expr: reference
  * Xpath: f:Consent/f:data/f:reference | f:Consent/f:except/f:data/f:reference
  * Type: reference
  * Code: data
  */
  @GET
  @Path("reference")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Consent data() {
  	return new Consent();
  }
  /**
  * Descr: Custodian of the consent
  * expr: organization
  * Xpath: f:Consent/f:organization
  * Type: reference
  * Code: organization
  */
  @GET
  @Path("organization")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Consent organization() {
  	return new Consent();
  }
  /**
  * Descr: Period that this consent applies
  * expr: period
  * Xpath: f:Consent/f:period
  * Type: date
  * Code: period
  */
  @GET
  @Path("period")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Consent period(@QueryParam("period")String period) {
  	return new Consent();
  }
  /**
  * Descr: Context of activities for which the agreement is made
  * expr: purpose
  * Xpath: f:Consent/f:purpose | f:Consent/f:except/f:purpose
  * Type: token
  * Code: purpose
  */
  @GET
  @Path("purpose")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Consent purpose(@QueryParam("purpose")String purpose) {
  	return new Consent();
  }
  /**
  * Descr: Security Labels that define affected resources
  * expr: securityLabel
  * Xpath: f:Consent/f:securityLabel | f:Consent/f:except/f:securityLabel
  * Type: token
  * Code: securitylabel
  */
  @GET
  @Path("securityLabel")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Consent securitylabel(@QueryParam("securitylabel")String securitylabel) {
  	return new Consent();
  }
  /**
  * Descr: Source from which this consent is taken
  * expr: source
  * Xpath: f:Consent/f:sourceAttachment | f:Consent/f:sourceIdentifier | f:Consent/f:sourceReference
  * Type: reference
  * Code: source
  */
  @GET
  @Path("source")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Consent source() {
  	return new Consent();
  }
  /**
  * Descr: draft | proposed | active | rejected | inactive | entered-in-error
  * expr: status
  * Xpath: f:Consent/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Consent status(@QueryParam("status")String status) {
  	return new Consent();
  }
}
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

import org.fhir.pojo.ReferralRequest;
import org.fhir.service.ReferralRequestService;

@Path("/ReferralRequest")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ReferralRequestResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ReferralRequestService service;

  @Inject
  public ReferralRequestResource(final ReferralRequestService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public ReferralRequest create(ReferralRequest obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public ReferralRequest update( ReferralRequest obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public ReferralRequest find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<ReferralRequest> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<ReferralRequest> findWithLimit(@PathParam("max") String max) {
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

  * [ReferralRequest](referralrequest.html): Who the referral is about
  * [DocumentManifest](documentmanifest.html): The subject of the set of documents
  * [Goal](goal.html): Who this goal is intended for
  * [Consent](consent.html): Who the consent applies to
  * [DocumentReference](documentreference.html): Who/what is the subject of the document
  * [ImagingManifest](imagingmanifest.html): Subject of the ImagingManifest (or a DICOM Key Object Selection which it represents)
  * [RiskAssessment](riskassessment.html): Who/what does assessment apply to?
  * [CareTeam](careteam.html): Who care team is for
  * [ImagingStudy](imagingstudy.html): Who the study is about
  * [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for
  * [Encounter](encounter.html): The patient ro group present at the encounter
  * [DeviceUseStatement](deviceusestatement.html): Search by subject - a patient
  * [DeviceRequest](devicerequest.html): Individual the service is ordered for
  * [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for
  * [CarePlan](careplan.html): Who care plan is for
  * [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care
  * [Procedure](procedure.html): Search by subject - a patient
  * [List](list.html): If all resources have the same subject
  * [Immunization](immunization.html): The patient for the vaccination record
  * [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for
  * [ProcedureRequest](procedurerequest.html): Search by subject - a patient
  * [Flag](flag.html): The identity of a subject to list flags for
  * [Observation](observation.html): The subject that the observation is about (if patient)
  * [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient
  * [NutritionOrder](nutritionorder.html): The identity of the person who requires the diet, formula or nutritional supplement
  * [Condition](condition.html): Who has the condition?
  * [Composition](composition.html): Who and/or what the composition is about
  * [DetectedIssue](detectedissue.html): Associated patient
  * [SupplyDelivery](supplydelivery.html): Patient for whom the item is supplied
  * [ClinicalImpression](clinicalimpression.html): Patient or group assessed

  * expr: subject
  * Xpath: f:ReferralRequest/f:subject | f:DocumentManifest/f:subject | f:Goal/f:subject | f:Consent/f:patient | f:DocumentReference/f:subject | f:ImagingManifest/f:patient | f:RiskAssessment/f:subject | f:CareTeam/f:subject | f:ImagingStudy/f:patient | f:FamilyMemberHistory/f:patient | f:Encounter/f:subject | f:DeviceUseStatement/f:subject | f:DeviceRequest/f:subject | f:AllergyIntolerance/f:patient | f:CarePlan/f:subject | f:EpisodeOfCare/f:patient | f:Procedure/f:subject | f:List/f:subject | f:Immunization/f:patient | f:VisionPrescription/f:patient | f:ProcedureRequest/f:subject | f:Flag/f:subject | f:Observation/f:subject | f:DiagnosticReport/f:subject | f:NutritionOrder/f:patient | f:Condition/f:subject | f:Composition/f:subject | f:DetectedIssue/f:patient | f:SupplyDelivery/f:patient | f:ClinicalImpression/f:subject
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest patient() {
  	return new ReferralRequest();
  }
  /**
  * Descr: Multiple Resources: 

  * [ReferralRequest](referralrequest.html): The type of the referral
  * [DocumentManifest](documentmanifest.html): Kind of document set
  * [DocumentReference](documentreference.html): Kind of document (LOINC if possible)
  * [Encounter](encounter.html): Specific type of encounter
  * [AllergyIntolerance](allergyintolerance.html): allergy | intolerance - Underlying mechanism (if known)
  * [EpisodeOfCare](episodeofcare.html): Type/class  - e.g. specialist referral, disease management
  * [Composition](composition.html): Kind of composition (LOINC if possible)

  * expr: type
  * Xpath: f:ReferralRequest/f:type | f:DocumentManifest/f:type | f:DocumentReference/f:type | f:Encounter/f:type | f:AllergyIntolerance/f:type | f:EpisodeOfCare/f:type | f:Composition/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest type(@QueryParam("type")String type) {
  	return new ReferralRequest();
  }
  /**
  * Descr: Creation or activation date
  * expr: authoredOn
  * Xpath: f:ReferralRequest/f:authoredOn
  * Type: date
  * Code: authoredon
  */
  @GET
  @Path("authoredOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest authoredon(@QueryParam("authoredon")String authoredon) {
  	return new ReferralRequest();
  }
  /**
  * Descr: Request being fulfilled
  * expr: basedOn
  * Xpath: f:ReferralRequest/f:basedOn
  * Type: reference
  * Code: basedon
  */
  @GET
  @Path("basedOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest basedon() {
  	return new ReferralRequest();
  }
  /**
  * Descr: Part of encounter or episode of care
  * expr: context
  * Xpath: f:ReferralRequest/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest context() {
  	return new ReferralRequest();
  }
  /**
  * Descr: Instantiates protocol or definition
  * expr: definition
  * Xpath: f:ReferralRequest/f:definition
  * Type: reference
  * Code: definition
  */
  @GET
  @Path("definition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest definition() {
  	return new ReferralRequest();
  }
  /**
  * Descr: Originating encounter
  * expr: context
  * Xpath: f:ReferralRequest/f:context
  * Type: reference
  * Code: encounter
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest encounter() {
  	return new ReferralRequest();
  }
  /**
  * Descr: Part of common request
  * expr: groupIdentifier
  * Xpath: f:ReferralRequest/f:groupIdentifier
  * Type: token
  * Code: groupidentifier
  */
  @GET
  @Path("groupIdentifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest groupidentifier(@QueryParam("groupidentifier")String groupidentifier) {
  	return new ReferralRequest();
  }
  /**
  * Descr: Business identifier
  * expr: identifier
  * Xpath: f:ReferralRequest/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest identifier(@QueryParam("identifier")String identifier) {
  	return new ReferralRequest();
  }
  /**
  * Descr: Proposal, plan or order
  * expr: intent
  * Xpath: f:ReferralRequest/f:intent
  * Type: token
  * Code: intent
  */
  @GET
  @Path("intent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest intent(@QueryParam("intent")String intent) {
  	return new ReferralRequest();
  }
  /**
  * Descr: When the service(s) requested in the referral should occur
  * expr: occurrence
  * Xpath: f:ReferralRequest/f:occurrenceDateTime | f:ReferralRequest/f:occurrencePeriod
  * Type: date
  * Code: occurrencedate
  */
  @GET
  @Path("occurrence")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest occurrencedate(@QueryParam("occurrencedate")String occurrencedate) {
  	return new ReferralRequest();
  }
  /**
  * Descr: The priority assigned to the referral
  * expr: priority
  * Xpath: f:ReferralRequest/f:priority
  * Type: token
  * Code: priority
  */
  @GET
  @Path("priority")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest priority(@QueryParam("priority")String priority) {
  	return new ReferralRequest();
  }
  /**
  * Descr: The person that the referral was sent to
  * expr: recipient
  * Xpath: f:ReferralRequest/f:recipient
  * Type: reference
  * Code: recipient
  */
  @GET
  @Path("recipient")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest recipient() {
  	return new ReferralRequest();
  }
  /**
  * Descr: Request(s) replaced by this request
  * expr: replaces
  * Xpath: f:ReferralRequest/f:replaces
  * Type: reference
  * Code: replaces
  */
  @GET
  @Path("replaces")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest replaces() {
  	return new ReferralRequest();
  }
  /**
  * Descr: Individual making the request
  * expr: agent
  * Xpath: f:ReferralRequest/f:requester/f:agent
  * Type: reference
  * Code: requester
  */
  @GET
  @Path("agent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest requester() {
  	return new ReferralRequest();
  }
  /**
  * Descr: Actions requested as part of the referral
  * expr: serviceRequested
  * Xpath: f:ReferralRequest/f:serviceRequested
  * Type: token
  * Code: service
  */
  @GET
  @Path("serviceRequested")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest service(@QueryParam("service")String service) {
  	return new ReferralRequest();
  }
  /**
  * Descr: The specialty that the referral is for
  * expr: specialty
  * Xpath: f:ReferralRequest/f:specialty
  * Type: token
  * Code: specialty
  */
  @GET
  @Path("specialty")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest specialty(@QueryParam("specialty")String specialty) {
  	return new ReferralRequest();
  }
  /**
  * Descr: The status of the referral
  * expr: status
  * Xpath: f:ReferralRequest/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest status(@QueryParam("status")String status) {
  	return new ReferralRequest();
  }
  /**
  * Descr: Patient referred to care or transfer
  * expr: subject
  * Xpath: f:ReferralRequest/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ReferralRequest subject() {
  	return new ReferralRequest();
  }
}
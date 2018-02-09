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

import org.fhir.pojo.DocumentManifest;
import org.fhir.service.DocumentManifestService;

@Path("/DocumentManifest")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class DocumentManifestResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final DocumentManifestService service;

  @Inject
  public DocumentManifestResource(final DocumentManifestService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public DocumentManifest create(DocumentManifest obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public DocumentManifest update( DocumentManifest obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public DocumentManifest find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<DocumentManifest> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<DocumentManifest> findWithLimit(@PathParam("max") String max) {
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

  * [DocumentManifest](documentmanifest.html): Unique Identifier for the set of documents
  * [Goal](goal.html): External Ids for this goal
  * [Consent](consent.html): Identifier for this record (external references)
  * [DocumentReference](documentreference.html): Master Version Specific Identifier
  * [SupplyRequest](supplyrequest.html): Unique identifier
  * [RiskAssessment](riskassessment.html): Unique identifier for the assessment
  * [CareTeam](careteam.html): External Ids for this team
  * [ImagingStudy](imagingstudy.html): Other identifiers for the Study
  * [FamilyMemberHistory](familymemberhistory.html): A search by a record identifier
  * [Encounter](encounter.html): Identifier(s) by which this encounter is known
  * [DeviceRequest](devicerequest.html): Business identifier for request/order
  * [AllergyIntolerance](allergyintolerance.html): External ids for this item
  * [CarePlan](careplan.html): External Ids for this plan
  * [EpisodeOfCare](episodeofcare.html): Business Identifier(s) relevant for this EpisodeOfCare
  * [Procedure](procedure.html): A unique identifier for a procedure
  * [List](list.html): Business identifier
  * [Immunization](immunization.html): Business identifier
  * [VisionPrescription](visionprescription.html): Return prescriptions with this external identifier
  * [ProcedureRequest](procedurerequest.html): Identifiers assigned to this order
  * [Observation](observation.html): The unique id for a particular observation
  * [DiagnosticReport](diagnosticreport.html): An identifier for the report
  * [NutritionOrder](nutritionorder.html): Return nutrition orders with this external identifier
  * [Condition](condition.html): A unique identifier of the condition record
  * [Composition](composition.html): Logical identifier of composition (version-independent)
  * [DetectedIssue](detectedissue.html): Unique id for the detected issue
  * [SupplyDelivery](supplydelivery.html): External identifier

  * expr: identifier
  * Xpath: f:DocumentManifest/f:masterIdentifier | f:DocumentManifest/f:identifier | f:Goal/f:identifier | f:Consent/f:identifier | f:DocumentReference/f:masterIdentifier | f:DocumentReference/f:identifier | f:SupplyRequest/f:identifier | f:RiskAssessment/f:identifier | f:CareTeam/f:identifier | f:ImagingStudy/f:identifier | f:FamilyMemberHistory/f:identifier | f:Encounter/f:identifier | f:DeviceRequest/f:identifier | f:AllergyIntolerance/f:identifier | f:CarePlan/f:identifier | f:EpisodeOfCare/f:identifier | f:Procedure/f:identifier | f:List/f:identifier | f:Immunization/f:identifier | f:VisionPrescription/f:identifier | f:ProcedureRequest/f:identifier | f:Observation/f:identifier | f:DiagnosticReport/f:identifier | f:NutritionOrder/f:identifier | f:Condition/f:identifier | f:Composition/f:identifier | f:DetectedIssue/f:identifier | f:SupplyDelivery/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentManifest identifier(@QueryParam("identifier")String identifier) {
  	return new DocumentManifest();
  }
  /**
  * Descr: Who and/or what authored the manifest
  * expr: author
  * Xpath: f:DocumentManifest/f:author
  * Type: reference
  * Code: author
  */
  @GET
  @Path("author")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentManifest author() {
  	return new DocumentManifest();
  }
  /**
  * Descr: Contents of this set of documents
  * expr: as(Reference)
  * Xpath: f:DocumentManifest/f:content/f:pReference
  * Type: reference
  * Code: contentref
  */
  @GET
  @Path("as(Reference)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentManifest contentref() {
  	return new DocumentManifest();
  }
  /**
  * Descr: When this document manifest created
  * expr: created
  * Xpath: f:DocumentManifest/f:created
  * Type: date
  * Code: created
  */
  @GET
  @Path("created")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentManifest created(@QueryParam("created")String created) {
  	return new DocumentManifest();
  }
  /**
  * Descr: Human-readable description (title)
  * expr: description
  * Xpath: f:DocumentManifest/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentManifest description(@QueryParam("description")String description) {
  	return new DocumentManifest();
  }
  /**
  * Descr: Intended to get notified about this set of documents
  * expr: recipient
  * Xpath: f:DocumentManifest/f:recipient
  * Type: reference
  * Code: recipient
  */
  @GET
  @Path("recipient")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentManifest recipient() {
  	return new DocumentManifest();
  }
  /**
  * Descr: Identifiers of things that are related
  * expr: identifier
  * Xpath: f:DocumentManifest/f:related/f:identifier
  * Type: token
  * Code: relatedid
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentManifest relatedid(@QueryParam("relatedid")String relatedid) {
  	return new DocumentManifest();
  }
  /**
  * Descr: Related Resource
  * expr: ref
  * Xpath: f:DocumentManifest/f:related/f:ref
  * Type: reference
  * Code: relatedref
  */
  @GET
  @Path("ref")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentManifest relatedref() {
  	return new DocumentManifest();
  }
  /**
  * Descr: The source system/application/software
  * expr: source
  * Xpath: f:DocumentManifest/f:source
  * Type: uri
  * Code: source
  */
  @GET
  @Path("source")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentManifest source(@QueryParam("source")String source) {
  	return new DocumentManifest();
  }
  /**
  * Descr: current | superseded | entered-in-error
  * expr: status
  * Xpath: f:DocumentManifest/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentManifest status(@QueryParam("status")String status) {
  	return new DocumentManifest();
  }
  /**
  * Descr: The subject of the set of documents
  * expr: subject
  * Xpath: f:DocumentManifest/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentManifest subject() {
  	return new DocumentManifest();
  }
}
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

import org.fhir.pojo.DocumentReference;
import org.fhir.service.DocumentReferenceService;

@Path("/DocumentReference")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class DocumentReferenceResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final DocumentReferenceService service;

  @Inject
  public DocumentReferenceResource(final DocumentReferenceService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public DocumentReference create(DocumentReference obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public DocumentReference update( DocumentReference obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public DocumentReference find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<DocumentReference> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<DocumentReference> findWithLimit(@PathParam("max") String max) {
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

  * [DocumentReference](documentreference.html): Context of the document  content
  * [RiskAssessment](riskassessment.html): Where was assessment performed?
  * [DeviceRequest](devicerequest.html): Encounter or Episode during which request was created
  * [Procedure](procedure.html): Search by encounter
  * [List](list.html): Context in which list created
  * [VisionPrescription](visionprescription.html): Return prescriptions with this encounter identifier
  * [ProcedureRequest](procedurerequest.html): An encounter in which this request is made
  * [Flag](flag.html): Alert relevant during encounter
  * [Observation](observation.html): Encounter related to the observation
  * [DiagnosticReport](diagnosticreport.html): The Encounter when the order was made
  * [NutritionOrder](nutritionorder.html): Return nutrition orders with this encounter identifier
  * [Composition](composition.html): Context of the Composition

  * expr: encounter
  * Xpath: f:DocumentReference/f:context/f:encounter | f:RiskAssessment/f:context | f:DeviceRequest/f:context | f:Procedure/f:context | f:List/f:encounter | f:VisionPrescription/f:encounter | f:ProcedureRequest/f:context | f:Flag/f:encounter | f:Observation/f:context | f:DiagnosticReport/f:context | f:NutritionOrder/f:encounter | f:Composition/f:encounter
  * Type: reference
  * Code: encounter
  */
  @GET
  @Path("encounter")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference encounter() {
  	return new DocumentReference();
  }
  /**
  * Descr: Who/what authenticated the document
  * expr: authenticator
  * Xpath: f:DocumentReference/f:authenticator
  * Type: reference
  * Code: authenticator
  */
  @GET
  @Path("authenticator")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference authenticator() {
  	return new DocumentReference();
  }
  /**
  * Descr: Who and/or what authored the document
  * expr: author
  * Xpath: f:DocumentReference/f:author
  * Type: reference
  * Code: author
  */
  @GET
  @Path("author")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference author() {
  	return new DocumentReference();
  }
  /**
  * Descr: Categorization of document
  * expr: class
  * Xpath: f:DocumentReference/f:class
  * Type: token
  * Code: FHIRclass
  */
  @GET
  @Path("class")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference FHIRclass(@QueryParam("FHIRclass")String FHIRclass) {
  	return new DocumentReference();
  }
  /**
  * Descr: Document creation time
  * expr: created
  * Xpath: f:DocumentReference/f:created
  * Type: date
  * Code: created
  */
  @GET
  @Path("created")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference created(@QueryParam("created")String created) {
  	return new DocumentReference();
  }
  /**
  * Descr: Organization which maintains the document
  * expr: custodian
  * Xpath: f:DocumentReference/f:custodian
  * Type: reference
  * Code: custodian
  */
  @GET
  @Path("custodian")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference custodian() {
  	return new DocumentReference();
  }
  /**
  * Descr: Human-readable description (title)
  * expr: description
  * Xpath: f:DocumentReference/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference description(@QueryParam("description")String description) {
  	return new DocumentReference();
  }
  /**
  * Descr: Main clinical acts documented
  * expr: event
  * Xpath: f:DocumentReference/f:context/f:event
  * Type: token
  * Code: event
  */
  @GET
  @Path("event")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference event(@QueryParam("event")String event) {
  	return new DocumentReference();
  }
  /**
  * Descr: Kind of facility where patient was seen
  * expr: facilityType
  * Xpath: f:DocumentReference/f:context/f:facilityType
  * Type: token
  * Code: facility
  */
  @GET
  @Path("facilityType")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference facility(@QueryParam("facility")String facility) {
  	return new DocumentReference();
  }
  /**
  * Descr: Format/content rules for the document
  * expr: format
  * Xpath: f:DocumentReference/f:content/f:format
  * Type: token
  * Code: format
  */
  @GET
  @Path("format")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference format(@QueryParam("format")String format) {
  	return new DocumentReference();
  }
  /**
  * Descr: When this document reference was created
  * expr: indexed
  * Xpath: f:DocumentReference/f:indexed
  * Type: date
  * Code: indexed
  */
  @GET
  @Path("indexed")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference indexed(@QueryParam("indexed")String indexed) {
  	return new DocumentReference();
  }
  /**
  * Descr: Human language of the content (BCP-47)
  * expr: language
  * Xpath: f:DocumentReference/f:content/f:attachment/f:language
  * Type: token
  * Code: language
  */
  @GET
  @Path("language")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference language(@QueryParam("language")String language) {
  	return new DocumentReference();
  }
  /**
  * Descr: Uri where the data can be found
  * expr: url
  * Xpath: f:DocumentReference/f:content/f:attachment/f:url
  * Type: uri
  * Code: location
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference location(@QueryParam("location")String location) {
  	return new DocumentReference();
  }
  /**
  * Descr: Time of service that is being documented
  * expr: period
  * Xpath: f:DocumentReference/f:context/f:period
  * Type: date
  * Code: period
  */
  @GET
  @Path("period")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference period(@QueryParam("period")String period) {
  	return new DocumentReference();
  }
  /**
  * Descr: Identifier of related objects or events
  * expr: identifier
  * Xpath: f:DocumentReference/f:context/f:related/f:identifier
  * Type: token
  * Code: relatedid
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference relatedid(@QueryParam("relatedid")String relatedid) {
  	return new DocumentReference();
  }
  /**
  * Descr: Related Resource
  * expr: ref
  * Xpath: f:DocumentReference/f:context/f:related/f:ref
  * Type: reference
  * Code: relatedref
  */
  @GET
  @Path("ref")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference relatedref() {
  	return new DocumentReference();
  }
  /**
  * Descr: Target of the relationship
  * expr: target
  * Xpath: f:DocumentReference/f:relatesTo/f:target
  * Type: reference
  * Code: relatesto
  */
  @GET
  @Path("target")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference relatesto() {
  	return new DocumentReference();
  }
  /**
  * Descr: replaces | transforms | signs | appends
  * expr: code
  * Xpath: f:DocumentReference/f:relatesTo/f:code
  * Type: token
  * Code: relation
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference relation(@QueryParam("relation")String relation) {
  	return new DocumentReference();
  }
  /**
  * Descr: Combination of relation and relatesTo
  * expr: relatesTo
  * Xpath: 
  * Type: composite
  * Code: relationship
  */
  @GET
  @Path("relatesTo")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference relationship(@QueryParam("relationship")String relationship) {
  	return new DocumentReference();
  }
  /**
  * Descr: Document security-tags
  * expr: securityLabel
  * Xpath: f:DocumentReference/f:securityLabel
  * Type: token
  * Code: securitylabel
  */
  @GET
  @Path("securityLabel")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference securitylabel(@QueryParam("securitylabel")String securitylabel) {
  	return new DocumentReference();
  }
  /**
  * Descr: Additional details about where the content was created (e.g. clinical specialty)
  * expr: practiceSetting
  * Xpath: f:DocumentReference/f:context/f:practiceSetting
  * Type: token
  * Code: setting
  */
  @GET
  @Path("practiceSetting")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference setting(@QueryParam("setting")String setting) {
  	return new DocumentReference();
  }
  /**
  * Descr: current | superseded | entered-in-error
  * expr: status
  * Xpath: f:DocumentReference/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference status(@QueryParam("status")String status) {
  	return new DocumentReference();
  }
  /**
  * Descr: Who/what is the subject of the document
  * expr: subject
  * Xpath: f:DocumentReference/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DocumentReference subject() {
  	return new DocumentReference();
  }
}
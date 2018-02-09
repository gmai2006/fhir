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

import org.fhir.pojo.FamilyMemberHistory;
import org.fhir.service.FamilyMemberHistoryService;

@Path("/FamilyMemberHistory")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class FamilyMemberHistoryResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final FamilyMemberHistoryService service;

  @Inject
  public FamilyMemberHistoryResource(final FamilyMemberHistoryService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public FamilyMemberHistory create(FamilyMemberHistory obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public FamilyMemberHistory update( FamilyMemberHistory obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public FamilyMemberHistory find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<FamilyMemberHistory> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<FamilyMemberHistory> findWithLimit(@PathParam("max") String max) {
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

  * [FamilyMemberHistory](familymemberhistory.html): A search by a condition code
  * [DeviceRequest](devicerequest.html): Code for what is being requested/ordered
  * [AllergyIntolerance](allergyintolerance.html): Code that identifies the allergy or intolerance
  * [Procedure](procedure.html): A code to identify a  procedure
  * [List](list.html): What the purpose of this list is
  * [ProcedureRequest](procedurerequest.html): What is being requested/ordered
  * [Observation](observation.html): The code of the observation type
  * [DiagnosticReport](diagnosticreport.html): The code for the report as a whole, as opposed to codes for the atomic results, which are the names on the observation resource referred to from the result
  * [Condition](condition.html): Code for the condition

  * expr: code
  * Xpath: f:FamilyMemberHistory/f:condition/f:code | f:DeviceRequest/f:codeCodeableConcept | f:AllergyIntolerance/f:code | f:AllergyIntolerance/f:reaction/f:substance | f:Procedure/f:code | f:List/f:code | f:ProcedureRequest/f:code | f:Observation/f:code | f:DiagnosticReport/f:code | f:Condition/f:code
  * Type: token
  * Code: code
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public FamilyMemberHistory code(@QueryParam("code")String code) {
  	return new FamilyMemberHistory();
  }
  /**
  * Descr: Instantiates protocol or definition
  * expr: definition
  * Xpath: f:FamilyMemberHistory/f:definition
  * Type: reference
  * Code: definition
  */
  @GET
  @Path("definition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public FamilyMemberHistory definition() {
  	return new FamilyMemberHistory();
  }
  /**
  * Descr: A search by a gender code of a family member
  * expr: gender
  * Xpath: f:FamilyMemberHistory/f:gender
  * Type: token
  * Code: gender
  */
  @GET
  @Path("gender")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public FamilyMemberHistory gender(@QueryParam("gender")String gender) {
  	return new FamilyMemberHistory();
  }
  /**
  * Descr: A search by a relationship type
  * expr: relationship
  * Xpath: f:FamilyMemberHistory/f:relationship
  * Type: token
  * Code: relationship
  */
  @GET
  @Path("relationship")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public FamilyMemberHistory relationship(@QueryParam("relationship")String relationship) {
  	return new FamilyMemberHistory();
  }
  /**
  * Descr: partial | completed | entered-in-error | health-unknown
  * expr: status
  * Xpath: f:FamilyMemberHistory/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public FamilyMemberHistory status(@QueryParam("status")String status) {
  	return new FamilyMemberHistory();
  }
}
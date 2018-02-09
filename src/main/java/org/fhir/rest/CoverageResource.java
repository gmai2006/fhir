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

import org.fhir.pojo.Coverage;
import org.fhir.service.CoverageService;

@Path("/Coverage")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class CoverageResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CoverageService service;

  @Inject
  public CoverageResource(final CoverageService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Coverage create(Coverage obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Coverage update( Coverage obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Coverage find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Coverage> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Coverage> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Covered party
  * expr: beneficiary
  * Xpath: f:Coverage/f:beneficiary
  * Type: reference
  * Code: beneficiary
  */
  @GET
  @Path("beneficiary")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Coverage beneficiary() {
  	return new Coverage();
  }
  /**
  * Descr: Class identifier
  * expr: class
  * Xpath: f:Coverage/f:grouping/f:class
  * Type: string
  * Code: FHIRclass
  */
  @GET
  @Path("class")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Coverage FHIRclass(@QueryParam("FHIRclass")String FHIRclass) {
  	return new Coverage();
  }
  /**
  * Descr: Dependent number
  * expr: dependent
  * Xpath: f:Coverage/f:dependent
  * Type: string
  * Code: dependent
  */
  @GET
  @Path("dependent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Coverage dependent(@QueryParam("dependent")String dependent) {
  	return new Coverage();
  }
  /**
  * Descr: Group identifier
  * expr: group
  * Xpath: f:Coverage/f:grouping/f:group
  * Type: string
  * Code: group
  */
  @GET
  @Path("group")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Coverage group(@QueryParam("group")String group) {
  	return new Coverage();
  }
  /**
  * Descr: The primary identifier of the insured and the coverage
  * expr: identifier
  * Xpath: f:Coverage/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Coverage identifier(@QueryParam("identifier")String identifier) {
  	return new Coverage();
  }
  /**
  * Descr: The identity of the insurer or party paying for services
  * expr: payor
  * Xpath: f:Coverage/f:payor
  * Type: reference
  * Code: payor
  */
  @GET
  @Path("payor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Coverage payor() {
  	return new Coverage();
  }
  /**
  * Descr: A plan or policy identifier
  * expr: plan
  * Xpath: f:Coverage/f:grouping/f:plan
  * Type: string
  * Code: plan
  */
  @GET
  @Path("plan")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Coverage plan(@QueryParam("plan")String plan) {
  	return new Coverage();
  }
  /**
  * Descr: Reference to the policyholder
  * expr: policyHolder
  * Xpath: f:Coverage/f:policyHolder
  * Type: reference
  * Code: policyholder
  */
  @GET
  @Path("policyHolder")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Coverage policyholder() {
  	return new Coverage();
  }
  /**
  * Descr: Sequence number
  * expr: sequence
  * Xpath: f:Coverage/f:sequence
  * Type: string
  * Code: sequence
  */
  @GET
  @Path("sequence")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Coverage sequence(@QueryParam("sequence")String sequence) {
  	return new Coverage();
  }
  /**
  * Descr: Sub-class identifier
  * expr: subClass
  * Xpath: f:Coverage/f:grouping/f:subClass
  * Type: string
  * Code: subclass
  */
  @GET
  @Path("subClass")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Coverage subclass(@QueryParam("subclass")String subclass) {
  	return new Coverage();
  }
  /**
  * Descr: Sub-group identifier
  * expr: subGroup
  * Xpath: f:Coverage/f:grouping/f:subGroup
  * Type: string
  * Code: subgroup
  */
  @GET
  @Path("subGroup")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Coverage subgroup(@QueryParam("subgroup")String subgroup) {
  	return new Coverage();
  }
  /**
  * Descr: Sub-plan identifier
  * expr: subPlan
  * Xpath: f:Coverage/f:grouping/f:subPlan
  * Type: string
  * Code: subplan
  */
  @GET
  @Path("subPlan")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Coverage subplan(@QueryParam("subplan")String subplan) {
  	return new Coverage();
  }
  /**
  * Descr: Reference to the subscriber
  * expr: subscriber
  * Xpath: f:Coverage/f:subscriber
  * Type: reference
  * Code: subscriber
  */
  @GET
  @Path("subscriber")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Coverage subscriber() {
  	return new Coverage();
  }
  /**
  * Descr: The kind of coverage (health plan, auto, Workers Compensation)
  * expr: type
  * Xpath: f:Coverage/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Coverage type(@QueryParam("type")String type) {
  	return new Coverage();
  }
}
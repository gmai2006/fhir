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

import org.fhir.pojo.RiskAssessment;
import org.fhir.service.RiskAssessmentService;

@Path("/RiskAssessment")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class RiskAssessmentResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final RiskAssessmentService service;

  @Inject
  public RiskAssessmentResource(final RiskAssessmentService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public RiskAssessment create(RiskAssessment obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public RiskAssessment update( RiskAssessment obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public RiskAssessment find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<RiskAssessment> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<RiskAssessment> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Condition assessed
  * expr: condition
  * Xpath: f:RiskAssessment/f:condition
  * Type: reference
  * Code: condition
  */
  @GET
  @Path("condition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RiskAssessment condition() {
  	return new RiskAssessment();
  }
  /**
  * Descr: Evaluation mechanism
  * expr: method
  * Xpath: f:RiskAssessment/f:method
  * Type: token
  * Code: method
  */
  @GET
  @Path("method")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RiskAssessment method(@QueryParam("method")String method) {
  	return new RiskAssessment();
  }
  /**
  * Descr: Who did assessment?
  * expr: performer
  * Xpath: f:RiskAssessment/f:performer
  * Type: reference
  * Code: performer
  */
  @GET
  @Path("performer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RiskAssessment performer() {
  	return new RiskAssessment();
  }
  /**
  * Descr: Likelihood of specified outcome
  * expr: probability
  * Xpath: f:RiskAssessment/f:prediction/f:probabilityDecimal | f:RiskAssessment/f:prediction/f:probabilityRange
  * Type: number
  * Code: probability
  */
  @GET
  @Path("probability")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RiskAssessment probability(@QueryParam("probability")String probability) {
  	return new RiskAssessment();
  }
  /**
  * Descr: Likelihood of specified outcome as a qualitative value
  * expr: qualitativeRisk
  * Xpath: f:RiskAssessment/f:prediction/f:qualitativeRisk
  * Type: token
  * Code: risk
  */
  @GET
  @Path("qualitativeRisk")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RiskAssessment risk(@QueryParam("risk")String risk) {
  	return new RiskAssessment();
  }
  /**
  * Descr: Who/what does assessment apply to?
  * expr: subject
  * Xpath: f:RiskAssessment/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RiskAssessment subject() {
  	return new RiskAssessment();
  }
}
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

import org.fhir.pojo.ClaimResponse;
import org.fhir.service.ClaimResponseService;

@Path("/ClaimResponse")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ClaimResponseResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ClaimResponseService service;

  @Inject
  public ClaimResponseResource(final ClaimResponseService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public ClaimResponse create(ClaimResponse obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public ClaimResponse update( ClaimResponse obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public ClaimResponse find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<ClaimResponse> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<ClaimResponse> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The creation date
  * expr: created
  * Xpath: f:ClaimResponse/f:created
  * Type: date
  * Code: created
  */
  @GET
  @Path("created")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClaimResponse created(@QueryParam("created")String created) {
  	return new ClaimResponse();
  }
  /**
  * Descr: The contents of the disposition message
  * expr: disposition
  * Xpath: f:ClaimResponse/f:disposition
  * Type: string
  * Code: disposition
  */
  @GET
  @Path("disposition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClaimResponse disposition(@QueryParam("disposition")String disposition) {
  	return new ClaimResponse();
  }
  /**
  * Descr: The identity of the claimresponse
  * expr: identifier
  * Xpath: f:ClaimResponse/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClaimResponse identifier(@QueryParam("identifier")String identifier) {
  	return new ClaimResponse();
  }
  /**
  * Descr: The organization who generated this resource
  * expr: insurer
  * Xpath: f:ClaimResponse/f:insurer
  * Type: reference
  * Code: insurer
  */
  @GET
  @Path("insurer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClaimResponse insurer() {
  	return new ClaimResponse();
  }
  /**
  * Descr: The processing outcome
  * expr: outcome
  * Xpath: f:ClaimResponse/f:outcome
  * Type: token
  * Code: outcome
  */
  @GET
  @Path("outcome")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClaimResponse outcome(@QueryParam("outcome")String outcome) {
  	return new ClaimResponse();
  }
  /**
  * Descr: The subject of care.
  * expr: patient
  * Xpath: f:ClaimResponse/f:patient
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("patient")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClaimResponse patient() {
  	return new ClaimResponse();
  }
  /**
  * Descr: The expected paymentDate
  * expr: date
  * Xpath: f:ClaimResponse/f:payment/f:date
  * Type: date
  * Code: paymentdate
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClaimResponse paymentdate(@QueryParam("paymentdate")String paymentdate) {
  	return new ClaimResponse();
  }
  /**
  * Descr: The claim reference
  * expr: request
  * Xpath: f:ClaimResponse/f:request
  * Type: reference
  * Code: request
  */
  @GET
  @Path("request")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClaimResponse request() {
  	return new ClaimResponse();
  }
  /**
  * Descr: The Provider of the claim
  * expr: requestProvider
  * Xpath: f:ClaimResponse/f:requestProvider
  * Type: reference
  * Code: requestprovider
  */
  @GET
  @Path("requestProvider")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ClaimResponse requestprovider() {
  	return new ClaimResponse();
  }
}
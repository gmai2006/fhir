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

import org.fhir.pojo.EligibilityResponse;
import org.fhir.service.EligibilityResponseService;

@Path("/EligibilityResponse")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class EligibilityResponseResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EligibilityResponseService service;

  @Inject
  public EligibilityResponseResource(final EligibilityResponseService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public EligibilityResponse create(EligibilityResponse obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public EligibilityResponse update( EligibilityResponse obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public EligibilityResponse find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<EligibilityResponse> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<EligibilityResponse> findWithLimit(@PathParam("max") String max) {
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
  * Xpath: f:EligibilityResponse/f:created
  * Type: date
  * Code: created
  */
  @GET
  @Path("created")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public EligibilityResponse created(@QueryParam("created")String created) {
  	return new EligibilityResponse();
  }
  /**
  * Descr: The contents of the disposition message
  * expr: disposition
  * Xpath: f:EligibilityResponse/f:disposition
  * Type: string
  * Code: disposition
  */
  @GET
  @Path("disposition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public EligibilityResponse disposition(@QueryParam("disposition")String disposition) {
  	return new EligibilityResponse();
  }
  /**
  * Descr: The business identifier
  * expr: identifier
  * Xpath: f:EligibilityResponse/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public EligibilityResponse identifier(@QueryParam("identifier")String identifier) {
  	return new EligibilityResponse();
  }
  /**
  * Descr: The organization which generated this resource
  * expr: insurer
  * Xpath: f:EligibilityResponse/f:insurer
  * Type: reference
  * Code: insurer
  */
  @GET
  @Path("insurer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public EligibilityResponse insurer() {
  	return new EligibilityResponse();
  }
  /**
  * Descr: The processing outcome
  * expr: outcome
  * Xpath: f:EligibilityResponse/f:outcome
  * Type: token
  * Code: outcome
  */
  @GET
  @Path("outcome")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public EligibilityResponse outcome(@QueryParam("outcome")String outcome) {
  	return new EligibilityResponse();
  }
  /**
  * Descr: The EligibilityRequest reference
  * expr: request
  * Xpath: f:EligibilityResponse/f:request
  * Type: reference
  * Code: request
  */
  @GET
  @Path("request")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public EligibilityResponse request() {
  	return new EligibilityResponse();
  }
  /**
  * Descr: The EligibilityRequest organization
  * expr: requestOrganization
  * Xpath: f:EligibilityResponse/f:requestOrganization
  * Type: reference
  * Code: requestorganization
  */
  @GET
  @Path("requestOrganization")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public EligibilityResponse requestorganization() {
  	return new EligibilityResponse();
  }
  /**
  * Descr: The EligibilityRequest provider
  * expr: requestProvider
  * Xpath: f:EligibilityResponse/f:requestProvider
  * Type: reference
  * Code: requestprovider
  */
  @GET
  @Path("requestProvider")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public EligibilityResponse requestprovider() {
  	return new EligibilityResponse();
  }
}
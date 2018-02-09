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

import org.fhir.pojo.ProcessResponse;
import org.fhir.service.ProcessResponseService;

@Path("/ProcessResponse")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ProcessResponseResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ProcessResponseService service;

  @Inject
  public ProcessResponseResource(final ProcessResponseService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public ProcessResponse create(ProcessResponse obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public ProcessResponse update( ProcessResponse obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public ProcessResponse find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<ProcessResponse> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<ProcessResponse> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The business identifier of the Explanation of Benefit
  * expr: identifier
  * Xpath: f:ProcessResponse/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcessResponse identifier(@QueryParam("identifier")String identifier) {
  	return new ProcessResponse();
  }
  /**
  * Descr: The organization who generated this resource
  * expr: organization
  * Xpath: f:ProcessResponse/f:organization
  * Type: reference
  * Code: organization
  */
  @GET
  @Path("organization")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcessResponse organization() {
  	return new ProcessResponse();
  }
  /**
  * Descr: The reference to the claim
  * expr: request
  * Xpath: f:ProcessResponse/f:request
  * Type: reference
  * Code: request
  */
  @GET
  @Path("request")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcessResponse request() {
  	return new ProcessResponse();
  }
  /**
  * Descr: The Organization who is responsible the request transaction
  * expr: requestOrganization
  * Xpath: f:ProcessResponse/f:requestOrganization
  * Type: reference
  * Code: requestorganization
  */
  @GET
  @Path("requestOrganization")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcessResponse requestorganization() {
  	return new ProcessResponse();
  }
  /**
  * Descr: The Provider who is responsible the request transaction
  * expr: requestProvider
  * Xpath: f:ProcessResponse/f:requestProvider
  * Type: reference
  * Code: requestprovider
  */
  @GET
  @Path("requestProvider")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ProcessResponse requestprovider() {
  	return new ProcessResponse();
  }
}
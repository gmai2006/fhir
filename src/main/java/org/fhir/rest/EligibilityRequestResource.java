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

import org.fhir.pojo.EligibilityRequest;
import org.fhir.service.EligibilityRequestService;

@Path("/EligibilityRequest")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class EligibilityRequestResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EligibilityRequestService service;

  @Inject
  public EligibilityRequestResource(final EligibilityRequestService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public EligibilityRequest create(EligibilityRequest obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public EligibilityRequest update( EligibilityRequest obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public EligibilityRequest find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<EligibilityRequest> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<EligibilityRequest> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The creation date for the EOB
  * expr: created
  * Xpath: f:EligibilityRequest/f:created
  * Type: date
  * Code: created
  */
  @GET
  @Path("created")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public EligibilityRequest created(@QueryParam("created")String created) {
  	return new EligibilityRequest();
  }
  /**
  * Descr: The party who is responsible for the request
  * expr: enterer
  * Xpath: f:EligibilityRequest/f:enterer
  * Type: reference
  * Code: enterer
  */
  @GET
  @Path("enterer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public EligibilityRequest enterer() {
  	return new EligibilityRequest();
  }
  /**
  * Descr: Facility responsible for the goods and services
  * expr: facility
  * Xpath: f:EligibilityRequest/f:facility
  * Type: reference
  * Code: facility
  */
  @GET
  @Path("facility")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public EligibilityRequest facility() {
  	return new EligibilityRequest();
  }
  /**
  * Descr: The business identifier of the Eligibility
  * expr: identifier
  * Xpath: f:EligibilityRequest/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public EligibilityRequest identifier(@QueryParam("identifier")String identifier) {
  	return new EligibilityRequest();
  }
  /**
  * Descr: The reference to the providing organization
  * expr: organization
  * Xpath: f:EligibilityRequest/f:organization
  * Type: reference
  * Code: organization
  */
  @GET
  @Path("organization")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public EligibilityRequest organization() {
  	return new EligibilityRequest();
  }
  /**
  * Descr: The reference to the patient
  * expr: patient
  * Xpath: f:EligibilityRequest/f:patient
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("patient")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public EligibilityRequest patient() {
  	return new EligibilityRequest();
  }
  /**
  * Descr: The reference to the provider
  * expr: provider
  * Xpath: f:EligibilityRequest/f:provider
  * Type: reference
  * Code: provider
  */
  @GET
  @Path("provider")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public EligibilityRequest provider() {
  	return new EligibilityRequest();
  }
}
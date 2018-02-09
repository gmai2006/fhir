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

import org.fhir.pojo.HealthcareService;
import org.fhir.service.HealthcareServiceService;

@Path("/HealthcareService")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class HealthcareServiceResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final HealthcareServiceService service;

  @Inject
  public HealthcareServiceResource(final HealthcareServiceService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public HealthcareService create(HealthcareService obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public HealthcareService update( HealthcareService obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public HealthcareService find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<HealthcareService> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<HealthcareService> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The Healthcare Service is currently marked as active
  * expr: active
  * Xpath: f:HealthcareService/f:active
  * Type: token
  * Code: active
  */
  @GET
  @Path("active")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public HealthcareService active(@QueryParam("active")String active) {
  	return new HealthcareService();
  }
  /**
  * Descr: Service Category of the Healthcare Service
  * expr: category
  * Xpath: f:HealthcareService/f:category
  * Type: token
  * Code: category
  */
  @GET
  @Path("category")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public HealthcareService category(@QueryParam("category")String category) {
  	return new HealthcareService();
  }
  /**
  * Descr: One of the HealthcareService's characteristics
  * expr: characteristic
  * Xpath: f:HealthcareService/f:characteristic
  * Type: token
  * Code: characteristic
  */
  @GET
  @Path("characteristic")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public HealthcareService characteristic(@QueryParam("characteristic")String characteristic) {
  	return new HealthcareService();
  }
  /**
  * Descr: Technical endpoints providing access to services operated for the location
  * expr: endpoint
  * Xpath: f:HealthcareService/f:endpoint
  * Type: reference
  * Code: endpoint
  */
  @GET
  @Path("endpoint")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public HealthcareService endpoint() {
  	return new HealthcareService();
  }
  /**
  * Descr: External identifiers for this item
  * expr: identifier
  * Xpath: f:HealthcareService/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public HealthcareService identifier(@QueryParam("identifier")String identifier) {
  	return new HealthcareService();
  }
  /**
  * Descr: The location of the Healthcare Service
  * expr: location
  * Xpath: f:HealthcareService/f:location
  * Type: reference
  * Code: location
  */
  @GET
  @Path("location")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public HealthcareService location() {
  	return new HealthcareService();
  }
  /**
  * Descr: A portion of the Healthcare service name
  * expr: name
  * Xpath: f:HealthcareService/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public HealthcareService name(@QueryParam("name")String name) {
  	return new HealthcareService();
  }
  /**
  * Descr: The organization that provides this Healthcare Service
  * expr: providedBy
  * Xpath: f:HealthcareService/f:providedBy
  * Type: reference
  * Code: organization
  */
  @GET
  @Path("providedBy")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public HealthcareService organization() {
  	return new HealthcareService();
  }
  /**
  * Descr: One of the Program Names serviced by this HealthcareService
  * expr: programName
  * Xpath: f:HealthcareService/f:programName
  * Type: string
  * Code: programname
  */
  @GET
  @Path("programName")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public HealthcareService programname(@QueryParam("programname")String programname) {
  	return new HealthcareService();
  }
  /**
  * Descr: The type of service provided by this healthcare service
  * expr: type
  * Xpath: f:HealthcareService/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public HealthcareService type(@QueryParam("type")String type) {
  	return new HealthcareService();
  }
}
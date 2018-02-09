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

import org.fhir.pojo.Group;
import org.fhir.service.GroupService;

@Path("/Group")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class GroupResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final GroupService service;

  @Inject
  public GroupResource(final GroupService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Group create(Group obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Group update( Group obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Group find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Group> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Group> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Descriptive or actual
  * expr: actual
  * Xpath: f:Group/f:actual
  * Type: token
  * Code: actual
  */
  @GET
  @Path("actual")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Group actual(@QueryParam("actual")String actual) {
  	return new Group();
  }
  /**
  * Descr: Kind of characteristic
  * expr: code
  * Xpath: f:Group/f:characteristic/f:code
  * Type: token
  * Code: characteristic
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Group characteristic(@QueryParam("characteristic")String characteristic) {
  	return new Group();
  }
  /**
  * Descr: A composite of both characteristic and value
  * expr: characteristic
  * Xpath: 
  * Type: composite
  * Code: characteristicvalue
  */
  @GET
  @Path("characteristic")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Group characteristicvalue(@QueryParam("characteristicvalue")String characteristicvalue) {
  	return new Group();
  }
  /**
  * Descr: The kind of resources contained
  * expr: code
  * Xpath: f:Group/f:code
  * Type: token
  * Code: code
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Group code(@QueryParam("code")String code) {
  	return new Group();
  }
  /**
  * Descr: Group includes or excludes
  * expr: exclude
  * Xpath: f:Group/f:characteristic/f:exclude
  * Type: token
  * Code: exclude
  */
  @GET
  @Path("exclude")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Group exclude(@QueryParam("exclude")String exclude) {
  	return new Group();
  }
  /**
  * Descr: Unique id
  * expr: identifier
  * Xpath: f:Group/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Group identifier(@QueryParam("identifier")String identifier) {
  	return new Group();
  }
  /**
  * Descr: Reference to the group member
  * expr: entity
  * Xpath: f:Group/f:member/f:entity
  * Type: reference
  * Code: member
  */
  @GET
  @Path("entity")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Group member() {
  	return new Group();
  }
  /**
  * Descr: The type of resources the group contains
  * expr: type
  * Xpath: f:Group/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Group type(@QueryParam("type")String type) {
  	return new Group();
  }
  /**
  * Descr: Value held by characteristic
  * expr: value
  * Xpath: f:Group/f:characteristic/f:valueCodeableConcept | f:Group/f:characteristic/f:valueBoolean | f:Group/f:characteristic/f:valueQuantity | f:Group/f:characteristic/f:valueRange
  * Type: token
  * Code: value
  */
  @GET
  @Path("value")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Group value(@QueryParam("value")String value) {
  	return new Group();
  }
}
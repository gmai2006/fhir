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

import org.fhir.pojo.GraphDefinition;
import org.fhir.service.GraphDefinitionService;

@Path("/GraphDefinition")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class GraphDefinitionResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final GraphDefinitionService service;

  @Inject
  public GraphDefinitionResource(final GraphDefinitionService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public GraphDefinition create(GraphDefinition obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public GraphDefinition update( GraphDefinition obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public GraphDefinition find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<GraphDefinition> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<GraphDefinition> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The graph definition publication date
  * expr: date
  * Xpath: f:GraphDefinition/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public GraphDefinition date(@QueryParam("date")String date) {
  	return new GraphDefinition();
  }
  /**
  * Descr: The description of the graph definition
  * expr: description
  * Xpath: f:GraphDefinition/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public GraphDefinition description(@QueryParam("description")String description) {
  	return new GraphDefinition();
  }
  /**
  * Descr: Intended jurisdiction for the graph definition
  * expr: jurisdiction
  * Xpath: f:GraphDefinition/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public GraphDefinition jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new GraphDefinition();
  }
  /**
  * Descr: Computationally friendly name of the graph definition
  * expr: name
  * Xpath: f:GraphDefinition/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public GraphDefinition name(@QueryParam("name")String name) {
  	return new GraphDefinition();
  }
  /**
  * Descr: Name of the publisher of the graph definition
  * expr: publisher
  * Xpath: f:GraphDefinition/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public GraphDefinition publisher(@QueryParam("publisher")String publisher) {
  	return new GraphDefinition();
  }
  /**
  * Descr: Type of resource at which the graph starts
  * expr: start
  * Xpath: f:GraphDefinition/f:start
  * Type: token
  * Code: start
  */
  @GET
  @Path("start")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public GraphDefinition start(@QueryParam("start")String start) {
  	return new GraphDefinition();
  }
  /**
  * Descr: The current status of the graph definition
  * expr: status
  * Xpath: f:GraphDefinition/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public GraphDefinition status(@QueryParam("status")String status) {
  	return new GraphDefinition();
  }
  /**
  * Descr: The uri that identifies the graph definition
  * expr: url
  * Xpath: f:GraphDefinition/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public GraphDefinition url(@QueryParam("url")String url) {
  	return new GraphDefinition();
  }
  /**
  * Descr: The business version of the graph definition
  * expr: version
  * Xpath: f:GraphDefinition/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public GraphDefinition version(@QueryParam("version")String version) {
  	return new GraphDefinition();
  }
}
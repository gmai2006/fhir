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

import org.fhir.pojo.StructureMap;
import org.fhir.service.StructureMapService;

@Path("/StructureMap")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class StructureMapResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final StructureMapService service;

  @Inject
  public StructureMapResource(final StructureMapService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public StructureMap create(StructureMap obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public StructureMap update( StructureMap obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public StructureMap find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<StructureMap> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<StructureMap> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The structure map publication date
  * expr: date
  * Xpath: f:StructureMap/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureMap date(@QueryParam("date")String date) {
  	return new StructureMap();
  }
  /**
  * Descr: The description of the structure map
  * expr: description
  * Xpath: f:StructureMap/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureMap description(@QueryParam("description")String description) {
  	return new StructureMap();
  }
  /**
  * Descr: External identifier for the structure map
  * expr: identifier
  * Xpath: f:StructureMap/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureMap identifier(@QueryParam("identifier")String identifier) {
  	return new StructureMap();
  }
  /**
  * Descr: Intended jurisdiction for the structure map
  * expr: jurisdiction
  * Xpath: f:StructureMap/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureMap jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new StructureMap();
  }
  /**
  * Descr: Computationally friendly name of the structure map
  * expr: name
  * Xpath: f:StructureMap/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureMap name(@QueryParam("name")String name) {
  	return new StructureMap();
  }
  /**
  * Descr: Name of the publisher of the structure map
  * expr: publisher
  * Xpath: f:StructureMap/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureMap publisher(@QueryParam("publisher")String publisher) {
  	return new StructureMap();
  }
  /**
  * Descr: The current status of the structure map
  * expr: status
  * Xpath: f:StructureMap/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureMap status(@QueryParam("status")String status) {
  	return new StructureMap();
  }
  /**
  * Descr: The human-friendly name of the structure map
  * expr: title
  * Xpath: f:StructureMap/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureMap title(@QueryParam("title")String title) {
  	return new StructureMap();
  }
  /**
  * Descr: The uri that identifies the structure map
  * expr: url
  * Xpath: f:StructureMap/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureMap url(@QueryParam("url")String url) {
  	return new StructureMap();
  }
  /**
  * Descr: The business version of the structure map
  * expr: version
  * Xpath: f:StructureMap/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureMap version(@QueryParam("version")String version) {
  	return new StructureMap();
  }
}
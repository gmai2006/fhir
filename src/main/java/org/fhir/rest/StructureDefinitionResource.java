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

import org.fhir.pojo.StructureDefinition;
import org.fhir.service.StructureDefinitionService;

@Path("/StructureDefinition")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class StructureDefinitionResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final StructureDefinitionService service;

  @Inject
  public StructureDefinitionResource(final StructureDefinitionService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public StructureDefinition create(StructureDefinition obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public StructureDefinition update( StructureDefinition obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public StructureDefinition find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<StructureDefinition> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<StructureDefinition> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Whether the structure is abstract
  * expr: abstract
  * Xpath: f:StructureDefinition/f:abstract
  * Type: token
  * Code: FHIRabstract
  */
  @GET
  @Path("abstract")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition FHIRabstract(@QueryParam("FHIRabstract")String FHIRabstract) {
  	return new StructureDefinition();
  }
  /**
  * Descr: Definition that this type is constrained/specialized from
  * expr: baseDefinition
  * Xpath: f:StructureDefinition/f:baseDefinition
  * Type: uri
  * Code: base
  */
  @GET
  @Path("baseDefinition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition base(@QueryParam("base")String base) {
  	return new StructureDefinition();
  }
  /**
  * Descr: Path that identifies the base element
  * expr: path
  * Xpath: f:StructureDefinition/f:snapshot/f:element/f:base/f:path | f:StructureDefinition/f:differential/f:element/f:base/f:path
  * Type: token
  * Code: basepath
  */
  @GET
  @Path("path")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition basepath(@QueryParam("basepath")String basepath) {
  	return new StructureDefinition();
  }
  /**
  * Descr: resource | datatype | extension
  * expr: contextType
  * Xpath: f:StructureDefinition/f:contextType
  * Type: token
  * Code: contexttype
  */
  @GET
  @Path("contextType")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition contexttype(@QueryParam("contexttype")String contexttype) {
  	return new StructureDefinition();
  }
  /**
  * Descr: The structure definition publication date
  * expr: date
  * Xpath: f:StructureDefinition/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition date(@QueryParam("date")String date) {
  	return new StructureDefinition();
  }
  /**
  * Descr: specialization | constraint - How relates to base definition
  * expr: derivation
  * Xpath: f:StructureDefinition/f:derivation
  * Type: token
  * Code: derivation
  */
  @GET
  @Path("derivation")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition derivation(@QueryParam("derivation")String derivation) {
  	return new StructureDefinition();
  }
  /**
  * Descr: The description of the structure definition
  * expr: description
  * Xpath: f:StructureDefinition/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition description(@QueryParam("description")String description) {
  	return new StructureDefinition();
  }
  /**
  * Descr: For testing purposes, not real usage
  * expr: experimental
  * Xpath: f:StructureDefinition/f:experimental
  * Type: token
  * Code: experimental
  */
  @GET
  @Path("experimental")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition experimental(@QueryParam("experimental")String experimental) {
  	return new StructureDefinition();
  }
  /**
  * Descr: Where the extension can be used in instances
  * expr: context
  * Xpath: f:StructureDefinition/f:context
  * Type: string
  * Code: extcontext
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition extcontext(@QueryParam("extcontext")String extcontext) {
  	return new StructureDefinition();
  }
  /**
  * Descr: External identifier for the structure definition
  * expr: identifier
  * Xpath: f:StructureDefinition/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition identifier(@QueryParam("identifier")String identifier) {
  	return new StructureDefinition();
  }
  /**
  * Descr: Intended jurisdiction for the structure definition
  * expr: jurisdiction
  * Xpath: f:StructureDefinition/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new StructureDefinition();
  }
  /**
  * Descr: A code for the profile
  * expr: keyword
  * Xpath: f:StructureDefinition/f:keyword
  * Type: token
  * Code: keyword
  */
  @GET
  @Path("keyword")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition keyword(@QueryParam("keyword")String keyword) {
  	return new StructureDefinition();
  }
  /**
  * Descr: primitive-type | complex-type | resource | logical
  * expr: kind
  * Xpath: f:StructureDefinition/f:kind
  * Type: token
  * Code: kind
  */
  @GET
  @Path("kind")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition kind(@QueryParam("kind")String kind) {
  	return new StructureDefinition();
  }
  /**
  * Descr: Computationally friendly name of the structure definition
  * expr: name
  * Xpath: f:StructureDefinition/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition name(@QueryParam("name")String name) {
  	return new StructureDefinition();
  }
  /**
  * Descr: A path that is constrained in the profile
  * expr: path
  * Xpath: f:StructureDefinition/f:snapshot/f:element/f:path | f:StructureDefinition/f:differential/f:element/f:path
  * Type: token
  * Code: path
  */
  @GET
  @Path("path")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition path(@QueryParam("path")String path) {
  	return new StructureDefinition();
  }
  /**
  * Descr: Name of the publisher of the structure definition
  * expr: publisher
  * Xpath: f:StructureDefinition/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition publisher(@QueryParam("publisher")String publisher) {
  	return new StructureDefinition();
  }
  /**
  * Descr: The current status of the structure definition
  * expr: status
  * Xpath: f:StructureDefinition/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition status(@QueryParam("status")String status) {
  	return new StructureDefinition();
  }
  /**
  * Descr: The human-friendly name of the structure definition
  * expr: title
  * Xpath: f:StructureDefinition/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition title(@QueryParam("title")String title) {
  	return new StructureDefinition();
  }
  /**
  * Descr: Type defined or constrained by this structure
  * expr: type
  * Xpath: f:StructureDefinition/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition type(@QueryParam("type")String type) {
  	return new StructureDefinition();
  }
  /**
  * Descr: The uri that identifies the structure definition
  * expr: url
  * Xpath: f:StructureDefinition/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition url(@QueryParam("url")String url) {
  	return new StructureDefinition();
  }
  /**
  * Descr: A vocabulary binding reference
  * expr: valueSet
  * Xpath: f:StructureDefinition/f:snapshot/f:element/f:binding/f:valueSetUri | f:StructureDefinition/f:snapshot/f:element/f:binding/f:valueSetReference
  * Type: reference
  * Code: valueset
  */
  @GET
  @Path("valueSet")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition valueset() {
  	return new StructureDefinition();
  }
  /**
  * Descr: The business version of the structure definition
  * expr: version
  * Xpath: f:StructureDefinition/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public StructureDefinition version(@QueryParam("version")String version) {
  	return new StructureDefinition();
  }
}
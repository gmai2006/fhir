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

import org.fhir.pojo.ValueSet;
import org.fhir.service.ValueSetService;

@Path("/ValueSet")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ValueSetResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ValueSetService service;

  @Inject
  public ValueSetResource(final ValueSetService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public ValueSet create(ValueSet obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public ValueSet update( ValueSet obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public ValueSet find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<ValueSet> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<ValueSet> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The value set publication date
  * expr: date
  * Xpath: f:ValueSet/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ValueSet date(@QueryParam("date")String date) {
  	return new ValueSet();
  }
  /**
  * Descr: The description of the value set
  * expr: description
  * Xpath: f:ValueSet/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ValueSet description(@QueryParam("description")String description) {
  	return new ValueSet();
  }
  /**
  * Descr: Uniquely identifies this expansion
  * expr: identifier
  * Xpath: f:ValueSet/f:expansion/f:identifier
  * Type: uri
  * Code: expansion
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ValueSet expansion(@QueryParam("expansion")String expansion) {
  	return new ValueSet();
  }
  /**
  * Descr: External identifier for the value set
  * expr: identifier
  * Xpath: f:ValueSet/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ValueSet identifier(@QueryParam("identifier")String identifier) {
  	return new ValueSet();
  }
  /**
  * Descr: Intended jurisdiction for the value set
  * expr: jurisdiction
  * Xpath: f:ValueSet/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ValueSet jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new ValueSet();
  }
  /**
  * Descr: Computationally friendly name of the value set
  * expr: name
  * Xpath: f:ValueSet/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ValueSet name(@QueryParam("name")String name) {
  	return new ValueSet();
  }
  /**
  * Descr: Name of the publisher of the value set
  * expr: publisher
  * Xpath: f:ValueSet/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ValueSet publisher(@QueryParam("publisher")String publisher) {
  	return new ValueSet();
  }
  /**
  * Descr: A code system included or excluded in the value set or an imported value set
  * expr: system
  * Xpath: f:ValueSet/f:compose/f:include/f:system
  * Type: uri
  * Code: reference
  */
  @GET
  @Path("system")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ValueSet reference(@QueryParam("reference")String reference) {
  	return new ValueSet();
  }
  /**
  * Descr: The current status of the value set
  * expr: status
  * Xpath: f:ValueSet/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ValueSet status(@QueryParam("status")String status) {
  	return new ValueSet();
  }
  /**
  * Descr: The human-friendly name of the value set
  * expr: title
  * Xpath: f:ValueSet/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ValueSet title(@QueryParam("title")String title) {
  	return new ValueSet();
  }
  /**
  * Descr: The uri that identifies the value set
  * expr: url
  * Xpath: f:ValueSet/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ValueSet url(@QueryParam("url")String url) {
  	return new ValueSet();
  }
  /**
  * Descr: The business version of the value set
  * expr: version
  * Xpath: f:ValueSet/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ValueSet version(@QueryParam("version")String version) {
  	return new ValueSet();
  }
}
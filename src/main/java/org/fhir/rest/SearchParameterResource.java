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

import org.fhir.pojo.SearchParameter;
import org.fhir.service.SearchParameterService;

@Path("/SearchParameter")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class SearchParameterResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SearchParameterService service;

  @Inject
  public SearchParameterResource(final SearchParameterService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public SearchParameter create(SearchParameter obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public SearchParameter update( SearchParameter obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public SearchParameter find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<SearchParameter> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<SearchParameter> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The resource type(s) this search parameter applies to
  * expr: base
  * Xpath: f:SearchParameter/f:base
  * Type: token
  * Code: base
  */
  @GET
  @Path("base")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public SearchParameter base(@QueryParam("base")String base) {
  	return new SearchParameter();
  }
  /**
  * Descr: Code used in URL
  * expr: code
  * Xpath: f:SearchParameter/f:code
  * Type: token
  * Code: code
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public SearchParameter code(@QueryParam("code")String code) {
  	return new SearchParameter();
  }
  /**
  * Descr: Defines how the part works
  * expr: definition
  * Xpath: f:SearchParameter/f:component/f:definition
  * Type: reference
  * Code: component
  */
  @GET
  @Path("definition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public SearchParameter component() {
  	return new SearchParameter();
  }
  /**
  * Descr: The search parameter publication date
  * expr: date
  * Xpath: f:SearchParameter/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public SearchParameter date(@QueryParam("date")String date) {
  	return new SearchParameter();
  }
  /**
  * Descr: Original Definition for the search parameter
  * expr: derivedFrom
  * Xpath: f:SearchParameter/f:derivedFrom
  * Type: uri
  * Code: derivedfrom
  */
  @GET
  @Path("derivedFrom")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public SearchParameter derivedfrom(@QueryParam("derivedfrom")String derivedfrom) {
  	return new SearchParameter();
  }
  /**
  * Descr: The description of the search parameter
  * expr: description
  * Xpath: f:SearchParameter/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public SearchParameter description(@QueryParam("description")String description) {
  	return new SearchParameter();
  }
  /**
  * Descr: Intended jurisdiction for the search parameter
  * expr: jurisdiction
  * Xpath: f:SearchParameter/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public SearchParameter jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new SearchParameter();
  }
  /**
  * Descr: Computationally friendly name of the search parameter
  * expr: name
  * Xpath: f:SearchParameter/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public SearchParameter name(@QueryParam("name")String name) {
  	return new SearchParameter();
  }
  /**
  * Descr: Name of the publisher of the search parameter
  * expr: publisher
  * Xpath: f:SearchParameter/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public SearchParameter publisher(@QueryParam("publisher")String publisher) {
  	return new SearchParameter();
  }
  /**
  * Descr: The current status of the search parameter
  * expr: status
  * Xpath: f:SearchParameter/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public SearchParameter status(@QueryParam("status")String status) {
  	return new SearchParameter();
  }
  /**
  * Descr: Types of resource (if a resource reference)
  * expr: target
  * Xpath: f:SearchParameter/f:target
  * Type: token
  * Code: target
  */
  @GET
  @Path("target")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public SearchParameter target(@QueryParam("target")String target) {
  	return new SearchParameter();
  }
  /**
  * Descr: number | date | string | token | reference | composite | quantity | uri
  * expr: type
  * Xpath: f:SearchParameter/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public SearchParameter type(@QueryParam("type")String type) {
  	return new SearchParameter();
  }
  /**
  * Descr: The uri that identifies the search parameter
  * expr: url
  * Xpath: f:SearchParameter/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public SearchParameter url(@QueryParam("url")String url) {
  	return new SearchParameter();
  }
  /**
  * Descr: The business version of the search parameter
  * expr: version
  * Xpath: f:SearchParameter/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public SearchParameter version(@QueryParam("version")String version) {
  	return new SearchParameter();
  }
}
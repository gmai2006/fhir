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

import org.fhir.pojo.FHIRList;
import org.fhir.service.FHIRListService;

@Path("/FHIRList")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class FHIRListResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final FHIRListService service;

  @Inject
  public FHIRListResource(final FHIRListService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public FHIRList create(FHIRList obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public FHIRList update( FHIRList obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public FHIRList find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<FHIRList> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<FHIRList> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Why list is empty
  * expr: emptyReason
  * Xpath: f:List/f:emptyReason
  * Type: token
  * Code: emptyreason
  */
  @GET
  @Path("emptyReason")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public FHIRList emptyreason(@QueryParam("emptyreason")String emptyreason) {
  	return new FHIRList();
  }
  /**
  * Descr: Actual entry
  * expr: item
  * Xpath: f:List/f:entry/f:item
  * Type: reference
  * Code: item
  */
  @GET
  @Path("item")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public FHIRList item() {
  	return new FHIRList();
  }
  /**
  * Descr: The annotation  - text content
  * expr: text
  * Xpath: f:List/f:note/f:text
  * Type: string
  * Code: notes
  */
  @GET
  @Path("text")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public FHIRList notes(@QueryParam("notes")String notes) {
  	return new FHIRList();
  }
  /**
  * Descr: Who and/or what defined the list contents (aka Author)
  * expr: source
  * Xpath: f:List/f:source
  * Type: reference
  * Code: source
  */
  @GET
  @Path("source")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public FHIRList source() {
  	return new FHIRList();
  }
  /**
  * Descr: current | retired | entered-in-error
  * expr: status
  * Xpath: f:List/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public FHIRList status(@QueryParam("status")String status) {
  	return new FHIRList();
  }
  /**
  * Descr: If all resources have the same subject
  * expr: subject
  * Xpath: f:List/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public FHIRList subject() {
  	return new FHIRList();
  }
  /**
  * Descr: Descriptive name for the list
  * expr: title
  * Xpath: f:List/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public FHIRList title(@QueryParam("title")String title) {
  	return new FHIRList();
  }
}
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

import org.fhir.pojo.Resource;
import org.fhir.service.ResourceService;

@Path("/Resource")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ResourceResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ResourceService service;

  @Inject
  public ResourceResource(final ResourceService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Resource create(Resource obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Resource update( Resource obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Resource find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Resource> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Resource> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Search on the entire content of the resource
  * expr: _content
  * Xpath: 
  * Type: string
  * Code: _content
  */
  @GET
  @Path("_content")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Resource _content(@QueryParam("_content")String _content) {
  	return new Resource();
  }
  /**
  * Descr: Logical id of this artifact
  * expr: id
  * Xpath: f:Resource/f:id
  * Type: token
  * Code: _id
  */
  @GET
  @Path("id")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Resource _id(@QueryParam("_id")String _id) {
  	return new Resource();
  }
  /**
  * Descr: When the resource version last changed
  * expr: lastUpdated
  * Xpath: f:Resource/f:meta/f:lastUpdated
  * Type: date
  * Code: _lastUpdated
  */
  @GET
  @Path("lastUpdated")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Resource _lastUpdated(@QueryParam("_lastUpdated")String _lastUpdated) {
  	return new Resource();
  }
  /**
  * Descr: Profiles this resource claims to conform to
  * expr: profile
  * Xpath: f:Resource/f:meta/f:profile
  * Type: uri
  * Code: _profile
  */
  @GET
  @Path("profile")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Resource _profile(@QueryParam("_profile")String _profile) {
  	return new Resource();
  }
  /**
  * Descr: A custom search profile that describes a specific defined query operation
  * expr: _query
  * Xpath: 
  * Type: token
  * Code: _query
  */
  @GET
  @Path("_query")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Resource _query(@QueryParam("_query")String _query) {
  	return new Resource();
  }
  /**
  * Descr: Security Labels applied to this resource
  * expr: security
  * Xpath: f:Resource/f:meta/f:security
  * Type: token
  * Code: _security
  */
  @GET
  @Path("security")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Resource _security(@QueryParam("_security")String _security) {
  	return new Resource();
  }
  /**
  * Descr: Tags applied to this resource
  * expr: tag
  * Xpath: f:Resource/f:meta/f:tag
  * Type: token
  * Code: _tag
  */
  @GET
  @Path("tag")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Resource _tag(@QueryParam("_tag")String _tag) {
  	return new Resource();
  }
}
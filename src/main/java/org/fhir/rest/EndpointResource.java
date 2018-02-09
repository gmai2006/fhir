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

import org.fhir.pojo.Endpoint;
import org.fhir.service.EndpointService;

@Path("/Endpoint")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class EndpointResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EndpointService service;

  @Inject
  public EndpointResource(final EndpointService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Endpoint create(Endpoint obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Endpoint update( Endpoint obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Endpoint find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Endpoint> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Endpoint> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Protocol/Profile/Standard to be used with this endpoint connection
  * expr: connectionType
  * Xpath: f:Endpoint/f:connectionType
  * Type: token
  * Code: connectiontype
  */
  @GET
  @Path("connectionType")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Endpoint connectiontype(@QueryParam("connectiontype")String connectiontype) {
  	return new Endpoint();
  }
  /**
  * Descr: Identifies this endpoint across multiple systems
  * expr: identifier
  * Xpath: f:Endpoint/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Endpoint identifier(@QueryParam("identifier")String identifier) {
  	return new Endpoint();
  }
  /**
  * Descr: A name that this endpoint can be identified by
  * expr: name
  * Xpath: f:Endpoint/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Endpoint name(@QueryParam("name")String name) {
  	return new Endpoint();
  }
  /**
  * Descr: The organization that is managing the endpoint
  * expr: managingOrganization
  * Xpath: f:Endpoint/f:managingOrganization
  * Type: reference
  * Code: organization
  */
  @GET
  @Path("managingOrganization")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Endpoint organization() {
  	return new Endpoint();
  }
  /**
  * Descr: The type of content that may be used at this endpoint (e.g. XDS Discharge summaries)
  * expr: payloadType
  * Xpath: f:Endpoint/f:payloadType
  * Type: token
  * Code: payloadtype
  */
  @GET
  @Path("payloadType")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Endpoint payloadtype(@QueryParam("payloadtype")String payloadtype) {
  	return new Endpoint();
  }
  /**
  * Descr: The current status of the Endpoint (usually expected to be active)
  * expr: status
  * Xpath: f:Endpoint/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Endpoint status(@QueryParam("status")String status) {
  	return new Endpoint();
  }
}
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

import org.fhir.pojo.DeviceRequest;
import org.fhir.service.DeviceRequestService;

@Path("/DeviceRequest")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class DeviceRequestResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final DeviceRequestService service;

  @Inject
  public DeviceRequestResource(final DeviceRequestService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public DeviceRequest create(DeviceRequest obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public DeviceRequest update( DeviceRequest obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public DeviceRequest find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<DeviceRequest> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<DeviceRequest> findWithLimit(@PathParam("max") String max) {
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
  * Descr: When the request transitioned to being actionable
  * expr: authoredOn
  * Xpath: f:DeviceRequest/f:authoredOn
  * Type: date
  * Code: authoredon
  */
  @GET
  @Path("authoredOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DeviceRequest authoredon(@QueryParam("authoredon")String authoredon) {
  	return new DeviceRequest();
  }
  /**
  * Descr: Plan/proposal/order fulfilled by this request
  * expr: basedOn
  * Xpath: f:DeviceRequest/f:basedOn
  * Type: reference
  * Code: basedon
  */
  @GET
  @Path("basedOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DeviceRequest basedon() {
  	return new DeviceRequest();
  }
  /**
  * Descr: Protocol or definition followed by this request
  * expr: definition
  * Xpath: f:DeviceRequest/f:definition
  * Type: reference
  * Code: definition
  */
  @GET
  @Path("definition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DeviceRequest definition() {
  	return new DeviceRequest();
  }
  /**
  * Descr: Reference to resource that is being requested/ordered
  * expr: as(Reference)
  * Xpath: f:DeviceRequest/f:codeReference
  * Type: reference
  * Code: device
  */
  @GET
  @Path("as(Reference)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DeviceRequest device() {
  	return new DeviceRequest();
  }
  /**
  * Descr: When service should occur
  * expr: as(Period)
  * Xpath: f:DeviceRequest/f:occurrenceDateTime | f:DeviceRequest/f:occurrencePeriod
  * Type: date
  * Code: eventdate
  */
  @GET
  @Path("as(Period)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DeviceRequest eventdate(@QueryParam("eventdate")String eventdate) {
  	return new DeviceRequest();
  }
  /**
  * Descr: Composite request this is part of
  * expr: groupIdentifier
  * Xpath: f:DeviceRequest/f:groupIdentifier
  * Type: token
  * Code: groupidentifier
  */
  @GET
  @Path("groupIdentifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DeviceRequest groupidentifier(@QueryParam("groupidentifier")String groupidentifier) {
  	return new DeviceRequest();
  }
  /**
  * Descr: proposal | plan | original-order |reflex-order
  * expr: intent
  * Xpath: f:DeviceRequest/f:intent
  * Type: token
  * Code: intent
  */
  @GET
  @Path("intent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DeviceRequest intent(@QueryParam("intent")String intent) {
  	return new DeviceRequest();
  }
  /**
  * Descr: Desired performer for service
  * expr: performer
  * Xpath: f:DeviceRequest/f:performer
  * Type: reference
  * Code: performer
  */
  @GET
  @Path("performer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DeviceRequest performer() {
  	return new DeviceRequest();
  }
  /**
  * Descr: Request takes the place of referenced completed or terminated requests
  * expr: priorRequest
  * Xpath: f:DeviceRequest/f:priorRequest
  * Type: reference
  * Code: priorrequest
  */
  @GET
  @Path("priorRequest")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DeviceRequest priorrequest() {
  	return new DeviceRequest();
  }
  /**
  * Descr: Who/what is requesting service 
  * expr: agent
  * Xpath: f:DeviceRequest/f:requester/f:agent
  * Type: reference
  * Code: requester
  */
  @GET
  @Path("agent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DeviceRequest requester() {
  	return new DeviceRequest();
  }
  /**
  * Descr: entered-in-error | draft | active |suspended | completed 
  * expr: status
  * Xpath: f:DeviceRequest/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DeviceRequest status(@QueryParam("status")String status) {
  	return new DeviceRequest();
  }
  /**
  * Descr: Individual the service is ordered for
  * expr: subject
  * Xpath: f:DeviceRequest/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DeviceRequest subject() {
  	return new DeviceRequest();
  }
}
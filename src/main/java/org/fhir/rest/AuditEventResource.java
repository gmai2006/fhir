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

import org.fhir.pojo.AuditEvent;
import org.fhir.service.AuditEventService;

@Path("/AuditEvent")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class AuditEventResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AuditEventService service;

  @Inject
  public AuditEventResource(final AuditEventService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public AuditEvent create(AuditEvent obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public AuditEvent update( AuditEvent obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public AuditEvent find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<AuditEvent> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<AuditEvent> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Type of action performed during the event
  * expr: action
  * Xpath: f:AuditEvent/f:action
  * Type: token
  * Code: action
  */
  @GET
  @Path("action")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent action(@QueryParam("action")String action) {
  	return new AuditEvent();
  }
  /**
  * Descr: Identifier for the network access point of the user device
  * expr: address
  * Xpath: f:AuditEvent/f:agent/f:network/f:address
  * Type: string
  * Code: address
  */
  @GET
  @Path("address")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent address(@QueryParam("address")String address) {
  	return new AuditEvent();
  }
  /**
  * Descr: Direct reference to resource
  * expr: reference
  * Xpath: f:AuditEvent/f:agent/f:reference
  * Type: reference
  * Code: agent
  */
  @GET
  @Path("reference")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent agent() {
  	return new AuditEvent();
  }
  /**
  * Descr: Human-meaningful name for the agent
  * expr: name
  * Xpath: f:AuditEvent/f:agent/f:name
  * Type: string
  * Code: agentname
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent agentname(@QueryParam("agentname")String agentname) {
  	return new AuditEvent();
  }
  /**
  * Descr: Agent role in the event
  * expr: role
  * Xpath: f:AuditEvent/f:agent/f:role
  * Type: token
  * Code: agentrole
  */
  @GET
  @Path("role")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent agentrole(@QueryParam("agentrole")String agentrole) {
  	return new AuditEvent();
  }
  /**
  * Descr: Alternative User id e.g. authentication
  * expr: altId
  * Xpath: f:AuditEvent/f:agent/f:altId
  * Type: token
  * Code: altid
  */
  @GET
  @Path("altId")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent altid(@QueryParam("altid")String altid) {
  	return new AuditEvent();
  }
  /**
  * Descr: Time when the event occurred on source
  * expr: recorded
  * Xpath: f:AuditEvent/f:recorded
  * Type: date
  * Code: date
  */
  @GET
  @Path("recorded")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent date(@QueryParam("date")String date) {
  	return new AuditEvent();
  }
  /**
  * Descr: Specific instance of resource
  * expr: reference
  * Xpath: f:AuditEvent/f:entity/f:reference
  * Type: reference
  * Code: entity
  */
  @GET
  @Path("reference")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent entity() {
  	return new AuditEvent();
  }
  /**
  * Descr: Specific instance of object
  * expr: identifier
  * Xpath: f:AuditEvent/f:entity/f:identifier
  * Type: token
  * Code: entityid
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent entityid(@QueryParam("entityid")String entityid) {
  	return new AuditEvent();
  }
  /**
  * Descr: Descriptor for entity
  * expr: name
  * Xpath: f:AuditEvent/f:entity/f:name
  * Type: string
  * Code: entityname
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent entityname(@QueryParam("entityname")String entityname) {
  	return new AuditEvent();
  }
  /**
  * Descr: What role the entity played
  * expr: role
  * Xpath: f:AuditEvent/f:entity/f:role
  * Type: token
  * Code: entityrole
  */
  @GET
  @Path("role")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent entityrole(@QueryParam("entityrole")String entityrole) {
  	return new AuditEvent();
  }
  /**
  * Descr: Type of entity involved
  * expr: type
  * Xpath: f:AuditEvent/f:entity/f:type
  * Type: token
  * Code: entitytype
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent entitytype(@QueryParam("entitytype")String entitytype) {
  	return new AuditEvent();
  }
  /**
  * Descr: Whether the event succeeded or failed
  * expr: outcome
  * Xpath: f:AuditEvent/f:outcome
  * Type: token
  * Code: outcome
  */
  @GET
  @Path("outcome")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent outcome(@QueryParam("outcome")String outcome) {
  	return new AuditEvent();
  }
  /**
  * Descr: Direct reference to resource
  * expr: reference
  * Xpath: f:AuditEvent/f:agent/f:reference | f:AuditEvent/f:entity/f:reference
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("reference")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent patient() {
  	return new AuditEvent();
  }
  /**
  * Descr: Policy that authorized event
  * expr: policy
  * Xpath: f:AuditEvent/f:agent/f:policy
  * Type: uri
  * Code: policy
  */
  @GET
  @Path("policy")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent policy(@QueryParam("policy")String policy) {
  	return new AuditEvent();
  }
  /**
  * Descr: Logical source location within the enterprise
  * expr: site
  * Xpath: f:AuditEvent/f:source/f:site
  * Type: token
  * Code: site
  */
  @GET
  @Path("site")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent site(@QueryParam("site")String site) {
  	return new AuditEvent();
  }
  /**
  * Descr: The identity of source detecting the event
  * expr: identifier
  * Xpath: f:AuditEvent/f:source/f:identifier
  * Type: token
  * Code: source
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent source(@QueryParam("source")String source) {
  	return new AuditEvent();
  }
  /**
  * Descr: More specific type/id for the event
  * expr: subtype
  * Xpath: f:AuditEvent/f:subtype
  * Type: token
  * Code: subtype
  */
  @GET
  @Path("subtype")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent subtype(@QueryParam("subtype")String subtype) {
  	return new AuditEvent();
  }
  /**
  * Descr: Type/identifier of event
  * expr: type
  * Xpath: f:AuditEvent/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent type(@QueryParam("type")String type) {
  	return new AuditEvent();
  }
  /**
  * Descr: Unique identifier for the user
  * expr: userId
  * Xpath: f:AuditEvent/f:agent/f:userId
  * Type: token
  * Code: user
  */
  @GET
  @Path("userId")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public AuditEvent user(@QueryParam("user")String user) {
  	return new AuditEvent();
  }
}
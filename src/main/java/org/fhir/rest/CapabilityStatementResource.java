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

import org.fhir.pojo.CapabilityStatement;
import org.fhir.service.CapabilityStatementService;

@Path("/CapabilityStatement")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class CapabilityStatementResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CapabilityStatementService service;

  @Inject
  public CapabilityStatementResource(final CapabilityStatementService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public CapabilityStatement create(CapabilityStatement obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public CapabilityStatement update( CapabilityStatement obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public CapabilityStatement find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<CapabilityStatement> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<CapabilityStatement> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The capability statement publication date
  * expr: date
  * Xpath: f:CapabilityStatement/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement date(@QueryParam("date")String date) {
  	return new CapabilityStatement();
  }
  /**
  * Descr: The description of the capability statement
  * expr: description
  * Xpath: f:CapabilityStatement/f:description
  * Type: string
  * Code: description
  */
  @GET
  @Path("description")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement description(@QueryParam("description")String description) {
  	return new CapabilityStatement();
  }
  /**
  * Descr: Event code in a capability statement
  * expr: code
  * Xpath: f:CapabilityStatement/f:messaging/f:event/f:code
  * Type: token
  * Code: event
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement event(@QueryParam("event")String event) {
  	return new CapabilityStatement();
  }
  /**
  * Descr: The version of FHIR
  * expr: version
  * Xpath: f:CapabilityStatement/f:version
  * Type: token
  * Code: fhirversion
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement fhirversion(@QueryParam("fhirversion")String fhirversion) {
  	return new CapabilityStatement();
  }
  /**
  * Descr: formats supported (xml | json | ttl | mime type)
  * expr: format
  * Xpath: f:CapabilityStatement/f:format
  * Type: token
  * Code: format
  */
  @GET
  @Path("format")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement format(@QueryParam("format")String format) {
  	return new CapabilityStatement();
  }
  /**
  * Descr: Implementation guides supported
  * expr: implementationGuide
  * Xpath: f:CapabilityStatement/f:implementationGuide
  * Type: uri
  * Code: guide
  */
  @GET
  @Path("implementationGuide")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement guide(@QueryParam("guide")String guide) {
  	return new CapabilityStatement();
  }
  /**
  * Descr: Intended jurisdiction for the capability statement
  * expr: jurisdiction
  * Xpath: f:CapabilityStatement/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new CapabilityStatement();
  }
  /**
  * Descr: Mode - restful (server/client) or messaging (sender/receiver)
  * expr: mode
  * Xpath: f:CapabilityStatement/f:rest/f:mode
  * Type: token
  * Code: mode
  */
  @GET
  @Path("mode")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement mode(@QueryParam("mode")String mode) {
  	return new CapabilityStatement();
  }
  /**
  * Descr: Computationally friendly name of the capability statement
  * expr: name
  * Xpath: f:CapabilityStatement/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement name(@QueryParam("name")String name) {
  	return new CapabilityStatement();
  }
  /**
  * Descr: Name of the publisher of the capability statement
  * expr: publisher
  * Xpath: f:CapabilityStatement/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement publisher(@QueryParam("publisher")String publisher) {
  	return new CapabilityStatement();
  }
  /**
  * Descr: Name of a resource mentioned in a capability statement
  * expr: type
  * Xpath: f:CapabilityStatement/f:rest/f:resource/f:type
  * Type: token
  * Code: resource
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement resource(@QueryParam("resource")String resource) {
  	return new CapabilityStatement();
  }
  /**
  * Descr: A profile id invoked in a capability statement
  * expr: profile
  * Xpath: f:CapabilityStatement/f:rest/f:resource/f:profile
  * Type: reference
  * Code: resourceprofile
  */
  @GET
  @Path("profile")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement resourceprofile() {
  	return new CapabilityStatement();
  }
  /**
  * Descr: OAuth | SMART-on-FHIR | NTLM | Basic | Kerberos | Certificates
  * expr: service
  * Xpath: f:CapabilityStatement/f:rest/f:security/f:service
  * Type: token
  * Code: securityservice
  */
  @GET
  @Path("service")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement securityservice(@QueryParam("securityservice")String securityservice) {
  	return new CapabilityStatement();
  }
  /**
  * Descr: Part of a the name of a software application
  * expr: name
  * Xpath: f:CapabilityStatement/f:software/f:name
  * Type: string
  * Code: software
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement software(@QueryParam("software")String software) {
  	return new CapabilityStatement();
  }
  /**
  * Descr: The current status of the capability statement
  * expr: status
  * Xpath: f:CapabilityStatement/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement status(@QueryParam("status")String status) {
  	return new CapabilityStatement();
  }
  /**
  * Descr: Profiles for use cases supported
  * expr: profile
  * Xpath: f:CapabilityStatement/f:profile
  * Type: reference
  * Code: supportedprofile
  */
  @GET
  @Path("profile")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement supportedprofile() {
  	return new CapabilityStatement();
  }
  /**
  * Descr: The human-friendly name of the capability statement
  * expr: title
  * Xpath: f:CapabilityStatement/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement title(@QueryParam("title")String title) {
  	return new CapabilityStatement();
  }
  /**
  * Descr: The uri that identifies the capability statement
  * expr: url
  * Xpath: f:CapabilityStatement/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement url(@QueryParam("url")String url) {
  	return new CapabilityStatement();
  }
  /**
  * Descr: The business version of the capability statement
  * expr: version
  * Xpath: f:CapabilityStatement/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public CapabilityStatement version(@QueryParam("version")String version) {
  	return new CapabilityStatement();
  }
}
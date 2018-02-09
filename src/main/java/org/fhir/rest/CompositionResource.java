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

import org.fhir.pojo.Composition;
import org.fhir.service.CompositionService;

@Path("/Composition")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class CompositionResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CompositionService service;

  @Inject
  public CompositionResource(final CompositionService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Composition create(Composition obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Composition update( Composition obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Composition find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Composition> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Composition> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Who attested the composition
  * expr: party
  * Xpath: f:Composition/f:attester/f:party
  * Type: reference
  * Code: attester
  */
  @GET
  @Path("party")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Composition attester() {
  	return new Composition();
  }
  /**
  * Descr: Who and/or what authored the composition
  * expr: author
  * Xpath: f:Composition/f:author
  * Type: reference
  * Code: author
  */
  @GET
  @Path("author")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Composition author() {
  	return new Composition();
  }
  /**
  * Descr: Categorization of Composition
  * expr: class
  * Xpath: f:Composition/f:class
  * Type: token
  * Code: FHIRclass
  */
  @GET
  @Path("class")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Composition FHIRclass(@QueryParam("FHIRclass")String FHIRclass) {
  	return new Composition();
  }
  /**
  * Descr: As defined by affinity domain
  * expr: confidentiality
  * Xpath: f:Composition/f:confidentiality
  * Type: token
  * Code: confidentiality
  */
  @GET
  @Path("confidentiality")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Composition confidentiality(@QueryParam("confidentiality")String confidentiality) {
  	return new Composition();
  }
  /**
  * Descr: Code(s) that apply to the event being documented
  * expr: code
  * Xpath: f:Composition/f:event/f:code
  * Type: token
  * Code: context
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Composition context(@QueryParam("context")String context) {
  	return new Composition();
  }
  /**
  * Descr: A reference to data that supports this section
  * expr: entry
  * Xpath: f:Composition/f:section/f:entry
  * Type: reference
  * Code: entry
  */
  @GET
  @Path("entry")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Composition entry() {
  	return new Composition();
  }
  /**
  * Descr: The period covered by the documentation
  * expr: period
  * Xpath: f:Composition/f:event/f:period
  * Type: date
  * Code: period
  */
  @GET
  @Path("period")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Composition period(@QueryParam("period")String period) {
  	return new Composition();
  }
  /**
  * Descr: Target of the relationship
  * expr: as(Identifier)
  * Xpath: f:Composition/f:relatesTo/f:targetIdentifier
  * Type: token
  * Code: relatedid
  */
  @GET
  @Path("as(Identifier)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Composition relatedid(@QueryParam("relatedid")String relatedid) {
  	return new Composition();
  }
  /**
  * Descr: Target of the relationship
  * expr: as(Reference)
  * Xpath: f:Composition/f:relatesTo/f:targetReference
  * Type: reference
  * Code: relatedref
  */
  @GET
  @Path("as(Reference)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Composition relatedref() {
  	return new Composition();
  }
  /**
  * Descr: Classification of section (recommended)
  * expr: code
  * Xpath: f:Composition/f:section/f:code
  * Type: token
  * Code: section
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Composition section(@QueryParam("section")String section) {
  	return new Composition();
  }
  /**
  * Descr: preliminary | final | amended | entered-in-error
  * expr: status
  * Xpath: f:Composition/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Composition status(@QueryParam("status")String status) {
  	return new Composition();
  }
  /**
  * Descr: Who and/or what the composition is about
  * expr: subject
  * Xpath: f:Composition/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Composition subject() {
  	return new Composition();
  }
  /**
  * Descr: Human Readable name/title
  * expr: title
  * Xpath: f:Composition/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Composition title(@QueryParam("title")String title) {
  	return new Composition();
  }
}
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

import org.fhir.pojo.DataElement;
import org.fhir.service.DataElementService;

@Path("/DataElement")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class DataElementResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final DataElementService service;

  @Inject
  public DataElementResource(final DataElementService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public DataElement create(DataElement obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public DataElement update( DataElement obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public DataElement find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<DataElement> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<DataElement> findWithLimit(@PathParam("max") String max) {
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
  * Descr: A code for the data element (server may choose to do subsumption)
  * expr: code
  * Xpath: f:DataElement/f:element/f:code
  * Type: token
  * Code: code
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DataElement code(@QueryParam("code")String code) {
  	return new DataElement();
  }
  /**
  * Descr: The data element publication date
  * expr: date
  * Xpath: f:DataElement/f:date
  * Type: date
  * Code: date
  */
  @GET
  @Path("date")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DataElement date(@QueryParam("date")String date) {
  	return new DataElement();
  }
  /**
  * Descr: Text search in the description of the data element.  This corresponds to the definition of the first DataElement.element.
  * expr: definition
  * Xpath: f:DataElement/f:element/f:definition
  * Type: string
  * Code: description
  */
  @GET
  @Path("definition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DataElement description(@QueryParam("description")String description) {
  	return new DataElement();
  }
  /**
  * Descr: External identifier for the data element
  * expr: identifier
  * Xpath: f:DataElement/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DataElement identifier(@QueryParam("identifier")String identifier) {
  	return new DataElement();
  }
  /**
  * Descr: Intended jurisdiction for the data element
  * expr: jurisdiction
  * Xpath: f:DataElement/f:jurisdiction
  * Type: token
  * Code: jurisdiction
  */
  @GET
  @Path("jurisdiction")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DataElement jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	return new DataElement();
  }
  /**
  * Descr: Computationally friendly name of the data element
  * expr: name
  * Xpath: f:DataElement/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DataElement name(@QueryParam("name")String name) {
  	return new DataElement();
  }
  /**
  * Descr: Name of the publisher of the data element
  * expr: publisher
  * Xpath: f:DataElement/f:publisher
  * Type: string
  * Code: publisher
  */
  @GET
  @Path("publisher")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DataElement publisher(@QueryParam("publisher")String publisher) {
  	return new DataElement();
  }
  /**
  * Descr: The current status of the data element
  * expr: status
  * Xpath: f:DataElement/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DataElement status(@QueryParam("status")String status) {
  	return new DataElement();
  }
  /**
  * Descr: The stringency of the data element definition
  * expr: stringency
  * Xpath: f:DataElement/f:stringency
  * Type: token
  * Code: stringency
  */
  @GET
  @Path("stringency")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DataElement stringency(@QueryParam("stringency")String stringency) {
  	return new DataElement();
  }
  /**
  * Descr: The human-friendly name of the data element
  * expr: title
  * Xpath: f:DataElement/f:title
  * Type: string
  * Code: title
  */
  @GET
  @Path("title")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DataElement title(@QueryParam("title")String title) {
  	return new DataElement();
  }
  /**
  * Descr: The uri that identifies the data element
  * expr: url
  * Xpath: f:DataElement/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DataElement url(@QueryParam("url")String url) {
  	return new DataElement();
  }
  /**
  * Descr: The business version of the data element
  * expr: version
  * Xpath: f:DataElement/f:version
  * Type: token
  * Code: version
  */
  @GET
  @Path("version")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DataElement version(@QueryParam("version")String version) {
  	return new DataElement();
  }
  /**
  * Descr: Matches on the 11179-objectClass extension value
  * expr: objectClass
  * Xpath: f:DataElement/f:element/f:mapping/f:extension[@url='http://hl7.org/fhir/StructureDefinition/11179-objectClass'] | f:DataElement/f:element/f:mapping/f:extension[@url='http://hl7.org/fhir/StructureDefinition/11179-objectClass']
  * Type: token
  * Code: objectClass
  */
  @GET
  @Path("objectClass")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DataElement objectClass(@QueryParam("objectClass")String objectClass) {
  	return new DataElement();
  }
  /**
  * Descr: Matches on the 11179-objectClassProperty extension value
  * expr: objectClassProperty
  * Xpath: f:DataElement/f:element/f:mapping/f:extension[@url='http://hl7.org/fhir/StructureDefinition/11179-objectClassProperty'] | f:DataElement/f:element/f:mapping/f:extension[@url='http://hl7.org/fhir/StructureDefinition/11179-objectClassProperty']
  * Type: token
  * Code: objectClassProperty
  */
  @GET
  @Path("objectClassProperty")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DataElement objectClassProperty(@QueryParam("objectClassProperty")String objectClassProperty) {
  	return new DataElement();
  }
}
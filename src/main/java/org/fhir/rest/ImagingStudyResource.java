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

import org.fhir.pojo.ImagingStudy;
import org.fhir.service.ImagingStudyService;

@Path("/ImagingStudy")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ImagingStudyResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ImagingStudyService service;

  @Inject
  public ImagingStudyResource(final ImagingStudyService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public ImagingStudy create(ImagingStudy obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public ImagingStudy update( ImagingStudy obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public ImagingStudy find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<ImagingStudy> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<ImagingStudy> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The accession identifier for the study
  * expr: accession
  * Xpath: f:ImagingStudy/f:accession
  * Type: token
  * Code: accession
  */
  @GET
  @Path("accession")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingStudy accession(@QueryParam("accession")String accession) {
  	return new ImagingStudy();
  }
  /**
  * Descr: The order for the image
  * expr: basedOn
  * Xpath: f:ImagingStudy/f:basedOn
  * Type: reference
  * Code: basedon
  */
  @GET
  @Path("basedOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingStudy basedon() {
  	return new ImagingStudy();
  }
  /**
  * Descr: The body site studied
  * expr: bodySite
  * Xpath: f:ImagingStudy/f:series/f:bodySite
  * Type: token
  * Code: bodysite
  */
  @GET
  @Path("bodySite")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingStudy bodysite(@QueryParam("bodysite")String bodysite) {
  	return new ImagingStudy();
  }
  /**
  * Descr: The context of the study
  * expr: context
  * Xpath: f:ImagingStudy/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingStudy context() {
  	return new ImagingStudy();
  }
  /**
  * Descr: The type of the instance
  * expr: sopClass
  * Xpath: f:ImagingStudy/f:series/f:instance/f:sopClass
  * Type: uri
  * Code: dicomclass
  */
  @GET
  @Path("sopClass")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingStudy dicomclass(@QueryParam("dicomclass")String dicomclass) {
  	return new ImagingStudy();
  }
  /**
  * Descr: The endpoint for te study or series
  * expr: endpoint
  * Xpath: f:ImagingStudy/f:endpoint | f:ImagingStudy/f:series/f:endpoint
  * Type: reference
  * Code: endpoint
  */
  @GET
  @Path("endpoint")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingStudy endpoint() {
  	return new ImagingStudy();
  }
  /**
  * Descr: The modality of the series
  * expr: modality
  * Xpath: f:ImagingStudy/f:series/f:modality
  * Type: token
  * Code: modality
  */
  @GET
  @Path("modality")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingStudy modality(@QueryParam("modality")String modality) {
  	return new ImagingStudy();
  }
  /**
  * Descr: The person who performed the study
  * expr: performer
  * Xpath: f:ImagingStudy/f:series/f:performer
  * Type: reference
  * Code: performer
  */
  @GET
  @Path("performer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingStudy performer() {
  	return new ImagingStudy();
  }
  /**
  * Descr: The reason for the study
  * expr: reason
  * Xpath: f:ImagingStudy/f:reason
  * Type: token
  * Code: reason
  */
  @GET
  @Path("reason")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingStudy reason(@QueryParam("reason")String reason) {
  	return new ImagingStudy();
  }
  /**
  * Descr: The identifier of the series of images
  * expr: uid
  * Xpath: f:ImagingStudy/f:series/f:uid
  * Type: uri
  * Code: series
  */
  @GET
  @Path("uid")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingStudy series(@QueryParam("series")String series) {
  	return new ImagingStudy();
  }
  /**
  * Descr: When the study was started
  * expr: started
  * Xpath: f:ImagingStudy/f:started
  * Type: date
  * Code: started
  */
  @GET
  @Path("started")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingStudy started(@QueryParam("started")String started) {
  	return new ImagingStudy();
  }
  /**
  * Descr: The study identifier for the image
  * expr: uid
  * Xpath: f:ImagingStudy/f:uid
  * Type: uri
  * Code: study
  */
  @GET
  @Path("uid")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingStudy study(@QueryParam("study")String study) {
  	return new ImagingStudy();
  }
  /**
  * Descr: The instance unique identifier
  * expr: uid
  * Xpath: f:ImagingStudy/f:series/f:instance/f:uid
  * Type: uri
  * Code: uid
  */
  @GET
  @Path("uid")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingStudy uid(@QueryParam("uid")String uid) {
  	return new ImagingStudy();
  }
}
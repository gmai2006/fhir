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

import org.fhir.pojo.ImagingManifest;
import org.fhir.service.ImagingManifestService;

@Path("/ImagingManifest")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ImagingManifestResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ImagingManifestService service;

  @Inject
  public ImagingManifestResource(final ImagingManifestService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public ImagingManifest create(ImagingManifest obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public ImagingManifest update( ImagingManifest obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public ImagingManifest find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<ImagingManifest> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<ImagingManifest> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Author of the ImagingManifest (or a DICOM Key Object Selection which it represents)
  * expr: author
  * Xpath: f:ImagingManifest/f:author
  * Type: reference
  * Code: author
  */
  @GET
  @Path("author")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingManifest author() {
  	return new ImagingManifest();
  }
  /**
  * Descr: Time of the ImagingManifest (or a DICOM Key Object Selection which it represents) authoring
  * expr: authoringTime
  * Xpath: f:ImagingManifest/f:authoringTime
  * Type: date
  * Code: authoringtime
  */
  @GET
  @Path("authoringTime")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingManifest authoringtime(@QueryParam("authoringtime")String authoringtime) {
  	return new ImagingManifest();
  }
  /**
  * Descr: The endpoint for the study or series
  * expr: endpoint
  * Xpath: f:ImagingManifest/f:study/f:endpoint | f:ImagingManifest/f:study/f:series/f:endpoint
  * Type: reference
  * Code: endpoint
  */
  @GET
  @Path("endpoint")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingManifest endpoint() {
  	return new ImagingManifest();
  }
  /**
  * Descr: UID of the ImagingManifest (or a DICOM Key Object Selection which it represents)
  * expr: identifier
  * Xpath: f:ImagingManifest/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingManifest identifier(@QueryParam("identifier")String identifier) {
  	return new ImagingManifest();
  }
  /**
  * Descr: ImagingStudy resource selected in the ImagingManifest (or a DICOM Key Object Selection which it represents)
  * expr: imagingStudy
  * Xpath: f:ImagingManifest/f:study/f:imagingStudy
  * Type: reference
  * Code: imagingstudy
  */
  @GET
  @Path("imagingStudy")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingManifest imagingstudy() {
  	return new ImagingManifest();
  }
  /**
  * Descr: Study selected in the ImagingManifest (or a DICOM Key Object Selection which it represents)
  * expr: uid
  * Xpath: f:ImagingManifest/f:study/f:uid
  * Type: uri
  * Code: selectedstudy
  */
  @GET
  @Path("uid")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ImagingManifest selectedstudy(@QueryParam("selectedstudy")String selectedstudy) {
  	return new ImagingManifest();
  }
}
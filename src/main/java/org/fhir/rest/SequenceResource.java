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

import org.fhir.pojo.Sequence;
import org.fhir.service.SequenceService;

@Path("/Sequence")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class SequenceResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SequenceService service;

  @Inject
  public SequenceResource(final SequenceService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Sequence create(Sequence obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Sequence update( Sequence obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Sequence find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Sequence> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Sequence> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Chromosome number of the reference sequence
  * expr: chromosome
  * Xpath: f:Sequence/f:referenceSeq/f:chromosome
  * Type: token
  * Code: chromosome
  */
  @GET
  @Path("chromosome")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Sequence chromosome(@QueryParam("chromosome")String chromosome) {
  	return new Sequence();
  }
  /**
  * Descr: Search parameter for region of the reference DNA sequence string. This will refer to part of a locus or part of a gene where search region will be represented in 1-based system. Since the coordinateSystem can either be 0-based or 1-based, this search query will include the result of both coordinateSystem that contains the equivalent segment of the gene or whole genome sequence. For example, a search for sequence can be represented as `coordinate=1$lt345$gt123`, this means it will search for the Sequence resource on chromosome 1 and with position >123 and <345, where in 1-based system resource, all strings within region 1:124-344 will be revealed, while in 0-based system resource, all strings within region 1:123-344 will be revealed. You may want to check detail about 0-based v.s. 1-based above.
  * expr: variant
  * Xpath: 
  * Type: composite
  * Code: coordinate
  */
  @GET
  @Path("variant")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Sequence coordinate(@QueryParam("coordinate")String coordinate) {
  	return new Sequence();
  }
  /**
  * Descr: End position (0-based exclusive, which menas the acid at this position will not be included, 1-based inclusive, which means the acid at this position will be included) of the reference sequence.
  * expr: windowEnd
  * Xpath: f:Sequence/f:referenceSeq/f:windowEnd
  * Type: number
  * Code: end
  */
  @GET
  @Path("windowEnd")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Sequence end(@QueryParam("end")String end) {
  	return new Sequence();
  }
  /**
  * Descr: The unique identity for a particular sequence
  * expr: identifier
  * Xpath: f:Sequence/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Sequence identifier(@QueryParam("identifier")String identifier) {
  	return new Sequence();
  }
  /**
  * Descr: The subject that the observation is about
  * expr: patient
  * Xpath: f:Sequence/f:patient
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("patient")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Sequence patient() {
  	return new Sequence();
  }
  /**
  * Descr: Start position (0-based inclusive, 1-based inclusive, that means the nucleic acid or amino acid at this position will be included) of the reference sequence.
  * expr: windowStart
  * Xpath: f:Sequence/f:referenceSeq/f:windowStart
  * Type: number
  * Code: start
  */
  @GET
  @Path("windowStart")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Sequence start(@QueryParam("start")String start) {
  	return new Sequence();
  }
  /**
  * Descr: Amino Acid Sequence/ DNA Sequence / RNA Sequence
  * expr: type
  * Xpath: f:Sequence/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Sequence type(@QueryParam("type")String type) {
  	return new Sequence();
  }
}
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
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Context;
import com.google.inject.Inject;

import org.fhir.pojo.ImagingStudy;
import org.fhir.service.ImagingStudyService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.utils.FhirConstant;

@Path("/ImagingStudy")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON})
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class ImagingStudyResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ImagingStudyService service;

  @Inject
  public ImagingStudyResource(final ImagingStudyService service) {
  	requireNonNull(service);
    this.service = service;
  }

  /**
   * Idempotent method - create or update
   * @param obj
   * @return
   */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public ImagingStudy createOrUpdate(ImagingStudy obj) {
		if (this.service.find(obj.getId()) != null) {
			return this.service.update(obj);
		}
		else return this.service.create(obj);
	}

	/**
	 * InIdempotent method
   * Update existing ImagingStudy
   * @param obj - instance of ImagingStudy
   * @return ImagingStudy
   */
	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public ImagingStudy update( ImagingStudy obj) {
		return this.service.update(obj);
	}

	/**
   * Delete existing ImagingStudy
   * @param obj - instance of ImagingStudy
   * @return ImagingStudy
   */
	@Consumes(MediaType.APPLICATION_JSON)
	@DELETE
	public void delete(@PathParam("id") String id) {
		this.service.delete(id);
	}

	/**
   * Get ImagingStudy by its ID
   * @param id - instance of ImagingStudy
   * @return ImagingStudy
   */
  @GET
  @Path("{id}")
  public Response find(@PathParam("id") String id) {
  	ImagingStudy result = this.service.find(id);
  	if (null == result) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }

  /**
   * Select all ImagingStudy with limit of returned records
   * @param max - number of records
   * @return a list ImagingStudy
   */
  @GET
  @Path("select/{max}")
  public Response findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
  	List<ImagingStudy> result = service.select(input);
  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }

  /**
   * Query ImagingStudy based on basic field names
   * @param UriInfo - UriInfo
   * @return list of ImagingStudy
   */
  @GET
  public Response findByField(@Context UriInfo info) {
  	MultivaluedMap<String, String> parameters = info.getQueryParameters();
  	if (null == parameters || parameters.isEmpty()) {
  		return Response.status(Response.Status.OK).entity(service.select(50)).build();
  	}
  	String str = QueryParser.convertMap2Str(parameters);
  	String first = parameters.keySet().iterator().next();

  	if (!FhirConstant.META_FIELDS.contains(first)
  			&& !FhirConstant.ACCOUNT_FIELDS.contains(first)) {
  		return Response.status(Response.Status.BAD_REQUEST).entity("Unknown query parameter [" + first + "]").build();
  	}

  	List<ImagingStudy> result = null;

  	if (FhirConstant.META_FIELDS.contains(first)) {
  		java.util.Map<String, String> params = QueryParser.parse(str);
  		result = this.service.findByMeta(new QueryBuilder(params));
  	}
  	else if (FhirConstant.IMAGINGSTUDY_FIELDS.contains(first)) {
  		java.util.Map<String, String> params = QueryParser.parse(str);
  		result = this.service.findByField(new QueryBuilder(params));
  	} 

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }

  /**
   * Query ImagingStudy by composite fields
   * Descr: The context of the study
   * Type: reference
  */
  @GET
  @Path("context")
  public Response context(@Context UriInfo info) {
  	MultivaluedMap<String, String> parameters = info.getQueryParameters();
  	if (null == parameters || parameters.isEmpty()) {
  		return Response.status(Response.Status.OK).entity(service.select(50)).build();
  	}
  	String str = QueryParser.convertMap2Str(parameters);
  	String first = parameters.keySet().iterator().next();

  	if (!FhirConstant.REFERENCE_FIELDS.contains(first)) {
  		return Response.status(Response.Status.BAD_REQUEST).entity("Unknown query parameter [" + first + "]").build();
  	} 

  	java.util.Map<String, String> params = QueryParser.parse(str);
  	List<ImagingStudy> result = this.service.findByContext(new QueryBuilder(params));

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }
  /**
   * Query ImagingStudy by composite fields
   * Descr: The order for the image
   * Type: reference
  */
  @GET
  @Path("basedon")
  public Response basedon(@Context UriInfo info) {
  	MultivaluedMap<String, String> parameters = info.getQueryParameters();
  	if (null == parameters || parameters.isEmpty()) {
  		return Response.status(Response.Status.OK).entity(service.select(50)).build();
  	}
  	String str = QueryParser.convertMap2Str(parameters);
  	String first = parameters.keySet().iterator().next();

  	if (!FhirConstant.REFERENCE_FIELDS.contains(first)) {
  		return Response.status(Response.Status.BAD_REQUEST).entity("Unknown query parameter [" + first + "]").build();
  	} 

  	java.util.Map<String, String> params = QueryParser.parse(str);
  	List<ImagingStudy> result = this.service.findByBasedOn(new QueryBuilder(params));

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }
  /**
   * Query ImagingStudy by composite fields
   * Descr: The reason for the study
   * Type: token
  */
  @GET
  @Path("reason")
  public Response reason(@Context UriInfo info) {
  	MultivaluedMap<String, String> parameters = info.getQueryParameters();
  	if (null == parameters || parameters.isEmpty()) {
  		return Response.status(Response.Status.OK).entity(service.select(50)).build();
  	}
  	String str = QueryParser.convertMap2Str(parameters);
  	String first = parameters.keySet().iterator().next();

  	if (!FhirConstant.CODEABLECONCEPT_FIELDS.contains(first)) {
  		return Response.status(Response.Status.BAD_REQUEST).entity("Unknown query parameter [" + first + "]").build();
  	} 

  	java.util.Map<String, String> params = QueryParser.parse(str);
  	List<ImagingStudy> result = this.service.findByReason(new QueryBuilder(params));

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }
}
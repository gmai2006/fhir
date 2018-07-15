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

import org.fhir.pojo.QuestionnaireResponse;
import org.fhir.service.QuestionnaireResponseService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.utils.FhirConstant;

@Path("/QuestionnaireResponse")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON})
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class QuestionnaireResponseResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final QuestionnaireResponseService service;

  @Inject
  public QuestionnaireResponseResource(final QuestionnaireResponseService service) {
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
	public QuestionnaireResponse createOrUpdate(QuestionnaireResponse obj) {
		if (this.service.find(obj.getId()) != null) {
			return this.service.update(obj);
		}
		else return this.service.create(obj);
	}

	/**
	 * InIdempotent method
   * Update existing QuestionnaireResponse
   * @param obj - instance of QuestionnaireResponse
   * @return QuestionnaireResponse
   */
	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public QuestionnaireResponse update( QuestionnaireResponse obj) {
		return this.service.update(obj);
	}

	/**
   * Delete existing QuestionnaireResponse
   * @param obj - instance of QuestionnaireResponse
   * @return QuestionnaireResponse
   */
	@Consumes(MediaType.APPLICATION_JSON)
	@DELETE
	public void delete(@PathParam("id") String id) {
		this.service.delete(id);
	}

	/**
   * Get QuestionnaireResponse by its ID
   * @param id - instance of QuestionnaireResponse
   * @return QuestionnaireResponse
   */
  @GET
  @Path("{id}")
  public Response find(@PathParam("id") String id) {
  	QuestionnaireResponse result = this.service.find(id);
  	if (null == result) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }

  /**
   * Select all QuestionnaireResponse with limit of returned records
   * @param max - number of records
   * @return a list QuestionnaireResponse
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
  	List<QuestionnaireResponse> result = service.select(input);
  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }

  /**
   * Query QuestionnaireResponse based on basic field names
   * @param UriInfo - UriInfo
   * @return list of QuestionnaireResponse
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

  	List<QuestionnaireResponse> result = null;

  	if (FhirConstant.META_FIELDS.contains(first)) {
  		java.util.Map<String, String> params = QueryParser.parse(str);
  		result = this.service.findByMeta(new QueryBuilder(params));
  	}
  	else if (FhirConstant.QUESTIONNAIRERESPONSE_FIELDS.contains(first)) {
  		java.util.Map<String, String> params = QueryParser.parse(str);
  		result = this.service.findByField(new QueryBuilder(params));
  	} 

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }

  /**
   * Query QuestionnaireResponse by composite fields
   * Descr: Plan/proposal/order fulfilled by this questionnaire response
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
  	List<QuestionnaireResponse> result = this.service.findByBasedOn(new QueryBuilder(params));

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }
  /**
   * Query QuestionnaireResponse by composite fields
   * Descr: Procedure or observation this questionnaire response was performed as a part of
   * Type: reference
  */
  @GET
  @Path("parent")
  public Response parent(@Context UriInfo info) {
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
  	List<QuestionnaireResponse> result = this.service.findByParent(new QueryBuilder(params));

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }
  /**
   * Query QuestionnaireResponse by composite fields
   * Descr: The questionnaire the answers are provided for
   * Type: reference
  */
  @GET
  @Path("questionnaire")
  public Response questionnaire(@Context UriInfo info) {
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
  	List<QuestionnaireResponse> result = this.service.findByQuestionnaire(new QueryBuilder(params));

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }
  /**
   * Query QuestionnaireResponse by composite fields
   * Descr: The patient that is the subject of the questionnaire response
   * Type: reference
  */
  @GET
  @Path("patient")
  public Response patient(@Context UriInfo info) {
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
  	List<QuestionnaireResponse> result = this.service.findBySubject(new QueryBuilder(params));

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }
  /**
   * Query QuestionnaireResponse by composite fields
   * Descr: Encounter or episode associated with the questionnaire response
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
  	List<QuestionnaireResponse> result = this.service.findByContext(new QueryBuilder(params));

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }
  /**
   * Query QuestionnaireResponse by composite fields
   * Descr: The individual providing the information reflected in the questionnaire respose
   * Type: reference
  */
  @GET
  @Path("source")
  public Response source(@Context UriInfo info) {
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
  	List<QuestionnaireResponse> result = this.service.findBySource(new QueryBuilder(params));

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }
}
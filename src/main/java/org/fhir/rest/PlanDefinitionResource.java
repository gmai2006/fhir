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

import org.fhir.pojo.PlanDefinition;
import org.fhir.service.PlanDefinitionService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.utils.FhirConstant;

@Path("/PlanDefinition")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON})
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class PlanDefinitionResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final PlanDefinitionService service;

  @Inject
  public PlanDefinitionResource(final PlanDefinitionService service) {
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
	public PlanDefinition createOrUpdate(PlanDefinition obj) {
		if (this.service.find(obj.getId()) != null) {
			return this.service.update(obj);
		}
		else return this.service.create(obj);
	}

	/**
	 * InIdempotent method
   * Update existing PlanDefinition
   * @param obj - instance of PlanDefinition
   * @return PlanDefinition
   */
	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public PlanDefinition update( PlanDefinition obj) {
		return this.service.update(obj);
	}

	/**
   * Delete existing PlanDefinition
   * @param obj - instance of PlanDefinition
   * @return PlanDefinition
   */
	@Consumes(MediaType.APPLICATION_JSON)
	@DELETE
	public void delete(@PathParam("id") String id) {
		this.service.delete(id);
	}

	/**
   * Get PlanDefinition by its ID
   * @param id - instance of PlanDefinition
   * @return PlanDefinition
   */
  @GET
  @Path("{id}")
  public Response find(@PathParam("id") String id) {
  	PlanDefinition result = this.service.find(id);
  	if (null == result) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }

  /**
   * Select all PlanDefinition with limit of returned records
   * @param max - number of records
   * @return a list PlanDefinition
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
  	List<PlanDefinition> result = service.select(input);
  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }

  /**
   * Query PlanDefinition based on basic field names
   * @param UriInfo - UriInfo
   * @return list of PlanDefinition
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

  	List<PlanDefinition> result = null;

  	if (FhirConstant.META_FIELDS.contains(first)) {
  		java.util.Map<String, String> params = QueryParser.parse(str);
  		result = this.service.findByMeta(new QueryBuilder(params));
  	}
  	else if (FhirConstant.PLANDEFINITION_FIELDS.contains(first)) {
  		java.util.Map<String, String> params = QueryParser.parse(str);
  		result = this.service.findByField(new QueryBuilder(params));
  	} 

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }

  /**
   * Query PlanDefinition by composite fields
   * Descr: Intended jurisdiction for the plan definition
   * Type: token
  */
  @GET
  @Path("jurisdiction")
  public Response jurisdiction(@Context UriInfo info) {
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
  	List<PlanDefinition> result = this.service.findByJurisdiction(new QueryBuilder(params));

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }
  /**
   * Query PlanDefinition by composite fields
   * Descr: Topics associated with the module
   * Type: token
  */
  @GET
  @Path("topic")
  public Response topic(@Context UriInfo info) {
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
  	List<PlanDefinition> result = this.service.findByTopic(new QueryBuilder(params));

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }
}
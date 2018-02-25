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

import org.fhir.pojo.MedicationStatement;
import org.fhir.service.MedicationStatementService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.utils.FhirConstant;

@Path("/MedicationStatement")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class MedicationStatementResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MedicationStatementService service;

  @Inject
  public MedicationStatementResource(final MedicationStatementService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public MedicationStatement create(MedicationStatement obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public MedicationStatement update( MedicationStatement obj) {
		return this.service.update(obj);
	}

  @GET
  @Path("{id}")
  public Response find(@PathParam("id") String id) {
  	MedicationStatement result = this.service.find(id);
  	if (null == result) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }

  @GET
  @Path("select/{max}")
  public Response findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
  	List<MedicationStatement> result = service.select(input);
  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }

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

  	List<MedicationStatement> result = null;

  	if (FhirConstant.META_FIELDS.contains(first)) {
  		java.util.Map<String, String> params = QueryParser.parse(str);
  		result = this.service.findByMeta(new QueryBuilder(params));
  	}
  	else if (FhirConstant.MEDICATIONSTATEMENT_FIELDS.contains(first)) {
  		java.util.Map<String, String> params = QueryParser.parse(str);
  		result = this.service.findByField(new QueryBuilder(params));
  	} 

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }

  /**
  * Descr: Returns statements that are part of another event.
  * Type: reference
  */
  @GET
  @Path("partof")
  public Response partof(@Context UriInfo info) {
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
  	List<MedicationStatement> result = this.service.findByPartOf(new QueryBuilder(params));

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }
  /**
  * Descr: Returns statements for a specific context (episode or episode of Care).
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
  	List<MedicationStatement> result = this.service.findByContext(new QueryBuilder(params));

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }
  /**
  * Descr: Who or where the information in the statement came from
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
  	List<MedicationStatement> result = this.service.findByInformationSource(new QueryBuilder(params));

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }
  /**
  * Descr: The identity of a patient, animal or group to list statements for
  * Type: reference
  */
  @GET
  @Path("subject")
  public Response subject(@Context UriInfo info) {
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
  	List<MedicationStatement> result = this.service.findBySubject(new QueryBuilder(params));

  	if (null == result || result.isEmpty()) {
  		return Response.status(Response.Status.NOT_FOUND).build();
  	}
  	return Response.status(Response.Status.OK).entity(result).build();
  }
}
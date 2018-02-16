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

import org.fhir.pojo.Condition;
import org.fhir.service.ConditionService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;

@Path("/Condition")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ConditionResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ConditionService service;

  @Inject
  public ConditionResource(final ConditionService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Condition create(Condition obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public Condition update( Condition obj) {
		return this.service.update(obj);
	}


  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Condition find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("")
  public List<Condition> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<Condition> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  @GET
  @Path("")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public List<Condition> findByField(@QueryParam("parameter")String parameter) {
  	java.util.Map<String, String> params = QueryParser.parse(parameter, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  /**
  * Descr: Person who asserts this condition
  * Type: reference
  */
  @GET
  @Path("asserter")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public List<Condition> asserter(@QueryParam("parameter")String parameter) {
  	java.util.Map<String, String> params = QueryParser.parse(parameter, VALID_FIELDS);
  	return this.service.findByAsserter(new QueryBuilder(params));
  }
  /**
  * Descr: Encounter or episode when condition first asserted
  * Type: reference
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public List<Condition> context(@QueryParam("parameter")String parameter) {
  	java.util.Map<String, String> params = QueryParser.parse(parameter, VALID_FIELDS);
  	return this.service.findByContext(new QueryBuilder(params));
  }
  /**
  * Descr: Manifestation/symptom
  * Type: token
  */
  @GET
  @Path("evidence/code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public List<Condition> evidence(@QueryParam("parameter")String parameter) {
  	java.util.Map<String, String> params = QueryParser.parse(parameter, VALID_FIELDS);
  	return this.service.findByEvidence(new QueryBuilder(params));
  }
  /**
  * Descr: Simple summary (disease specific)
  * Type: token
  */
  @GET
  @Path("stage/summary")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public List<Condition> stage(@QueryParam("parameter")String parameter) {
  	java.util.Map<String, String> params = QueryParser.parse(parameter, VALID_FIELDS);
  	return this.service.findByStage(new QueryBuilder(params));
  }
  /**
  * Descr: Who has the condition?
  * Type: reference
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public List<Condition> subject(@QueryParam("parameter")String parameter) {
  	java.util.Map<String, String> params = QueryParser.parse(parameter, VALID_FIELDS);
  	return this.service.findBySubject(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "abatementage|abatementboolean|abatementdate|abatementstring|asserteddate|asserter|bodysite|category|clinicalstatus|context|encounter|evidence|evidencedetail|onsetage|onsetdate|onsetinfo|severity|stage|subject|verificationstatus";
}
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
import org.fhir.pojo.OperationOutcome;

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

import org.fhir.pojo.CarePlan;
import org.fhir.service.CarePlanService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/CarePlan")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class CarePlanResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CarePlanService service;

  @Inject
  public CarePlanResource(final CarePlanService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public CarePlan create(CarePlan obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public CarePlan update( CarePlan obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public CarePlan find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public CarePlan findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<CarePlan> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<CarePlan> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<CarePlan> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<CarePlan> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<CarePlan> findByText(@QueryParam("_text") String _text) {
  	java.util.Map<String, String> params = QueryParser.parse(_text, VALID_FIELDS);
  	return this.service.findByText(new QueryBuilder(params));
  }

  @GET
  public OperationOutcome findByContent(@QueryParam("_content") String _content) {
  	OperationOutcome result = new OperationOutcome();
  	Narrative narrative = new Narrative();
  	narrative.setStatus("draft");
  	narrative.setDiv("<div>this function is not supported yet</div>");
  	result.setText(narrative);
  	return result;
  }

  @GET
  public OperationOutcome findByList(@QueryParam("_list") String _list) {
  	OperationOutcome result = new OperationOutcome();
  	Narrative narrative = new Narrative();
  	narrative.setStatus("draft");
  	narrative.setDiv("<div>this function is not supported yet</div>");
  	result.setText(narrative);
  	return result;
  }

  @GET
  public OperationOutcome findByQuery(@QueryParam("_query") String _query) {
  	OperationOutcome result = new OperationOutcome();
  	Narrative narrative = new Narrative();
  	narrative.setStatus("draft");
  	narrative.setDiv("<div>this function is not supported yet</div>");
  	result.setText(narrative);
  	return result;
  }

  @GET
  public List<CarePlan> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<CarePlan> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: Protocol or definition
  * Type: reference
  */
  @GET
  @Path("definition")
  public List<CarePlan> definition(@QueryParam("definition")String definition) {
  	java.util.Map<String, String> params = QueryParser.parse(definition, VALID_FIELDS);
  	return this.service.findByDefinition(new QueryBuilder(params));
  }
  /**
  * Descr: Fulfills care plan
  * Type: reference
  */
  @GET
  @Path("basedon")
  public List<CarePlan> basedon(@QueryParam("basedon")String basedon) {
  	java.util.Map<String, String> params = QueryParser.parse(basedon, VALID_FIELDS);
  	return this.service.findByBasedOn(new QueryBuilder(params));
  }
  /**
  * Descr: CarePlan replaced by this CarePlan
  * Type: reference
  */
  @GET
  @Path("replaces")
  public List<CarePlan> replaces(@QueryParam("replaces")String replaces) {
  	java.util.Map<String, String> params = QueryParser.parse(replaces, VALID_FIELDS);
  	return this.service.findByReplaces(new QueryBuilder(params));
  }
  /**
  * Descr: Part of referenced CarePlan
  * Type: reference
  */
  @GET
  @Path("partof")
  public List<CarePlan> partof(@QueryParam("partof")String partof) {
  	java.util.Map<String, String> params = QueryParser.parse(partof, VALID_FIELDS);
  	return this.service.findByPartOf(new QueryBuilder(params));
  }
  /**
  * Descr: Who care plan is for
  * Type: reference
  */
  @GET
  @Path("subject")
  public List<CarePlan> subject(@QueryParam("subject")String subject) {
  	java.util.Map<String, String> params = QueryParser.parse(subject, VALID_FIELDS);
  	return this.service.findBySubject(new QueryBuilder(params));
  }
  /**
  * Descr: Created in context of
  * Type: reference
  */
  @GET
  @Path("context")
  public List<CarePlan> context(@QueryParam("context")String context) {
  	java.util.Map<String, String> params = QueryParser.parse(context, VALID_FIELDS);
  	return this.service.findByContext(new QueryBuilder(params));
  }
  /**
  * Descr: Who's involved in plan?
  * Type: reference
  */
  @GET
  @Path("careteam")
  public List<CarePlan> careteam(@QueryParam("careteam")String careteam) {
  	java.util.Map<String, String> params = QueryParser.parse(careteam, VALID_FIELDS);
  	return this.service.findByCareTeam(new QueryBuilder(params));
  }
  /**
  * Descr: Health issues this plan addresses
  * Type: reference
  */
  @GET
  @Path("condition")
  public List<CarePlan> condition(@QueryParam("condition")String condition) {
  	java.util.Map<String, String> params = QueryParser.parse(condition, VALID_FIELDS);
  	return this.service.findByAddresses(new QueryBuilder(params));
  }
  /**
  * Descr: Desired outcome of plan
  * Type: reference
  */
  @GET
  @Path("goal")
  public List<CarePlan> goal(@QueryParam("goal")String goal) {
  	java.util.Map<String, String> params = QueryParser.parse(goal, VALID_FIELDS);
  	return this.service.findByGoal(new QueryBuilder(params));
  }
  /**
  * Descr: draft | active | suspended | completed | entered-in-error | cancelled | unknown
  * Type: token
  */
  @GET
  public List<CarePlan> status(@QueryParam("status")String status) {
  	java.util.Map<String, String> params = QueryParser.parse(status, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: proposal | plan | order | option
  * Type: token
  */
  @GET
  public List<CarePlan> intent(@QueryParam("intent")String intent) {
  	java.util.Map<String, String> params = QueryParser.parse(intent, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Type of plan
  * Type: token
  */
  @GET
  public List<CarePlan> category(@QueryParam("category")String category) {
  	java.util.Map<String, String> params = QueryParser.parse(category, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "activitycode|activitydate|activityreference|basedon|careteam|category|condition|context|definition|encounter|goal|intent|partof|performer|replaces|status|subject";
}
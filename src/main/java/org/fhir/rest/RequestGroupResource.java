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

import org.fhir.pojo.RequestGroup;
import org.fhir.service.RequestGroupService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/RequestGroup")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class RequestGroupResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final RequestGroupService service;

  @Inject
  public RequestGroupResource(final RequestGroupService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public RequestGroup create(RequestGroup obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public RequestGroup update( RequestGroup obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public RequestGroup find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public RequestGroup findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<RequestGroup> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<RequestGroup> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<RequestGroup> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<RequestGroup> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<RequestGroup> findByText(@QueryParam("_text") String _text) {
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
  public List<RequestGroup> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<RequestGroup> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: The definition from which the request group is realized
  * Type: reference
  */
  @GET
  @Path("definition")
  public List<RequestGroup> definition(@QueryParam("definition")String definition) {
  	java.util.Map<String, String> params = QueryParser.parse(definition, VALID_FIELDS);
  	return this.service.findByDefinition(new QueryBuilder(params));
  }
  /**
  * Descr: The identity of a patient to search for request groups
  * Type: reference
  */
  @GET
  @Path("patient")
  public List<RequestGroup> patient(@QueryParam("patient")String patient) {
  	java.util.Map<String, String> params = QueryParser.parse(patient, VALID_FIELDS);
  	return this.service.findBySubject(new QueryBuilder(params));
  }
  /**
  * Descr: The encounter the request group applies to
  * Type: reference
  */
  @GET
  @Path("encounter")
  public List<RequestGroup> encounter(@QueryParam("encounter")String encounter) {
  	java.util.Map<String, String> params = QueryParser.parse(encounter, VALID_FIELDS);
  	return this.service.findByContext(new QueryBuilder(params));
  }
  /**
  * Descr: The author of the request group
  * Type: reference
  */
  @GET
  @Path("author")
  public List<RequestGroup> author(@QueryParam("author")String author) {
  	java.util.Map<String, String> params = QueryParser.parse(author, VALID_FIELDS);
  	return this.service.findByAuthor(new QueryBuilder(params));
  }
  /**
  * Descr: External identifiers for the request group
  * Type: token
  */
  @GET
  public List<RequestGroup> identifier(@QueryParam("identifier")String identifier) {
  	java.util.Map<String, String> params = QueryParser.parse(identifier, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The group identifier for the request group
  * Type: token
  */
  @GET
  public List<RequestGroup> groupidentifier(@QueryParam("groupidentifier")String groupidentifier) {
  	java.util.Map<String, String> params = QueryParser.parse(groupidentifier, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The status of the request group
  * Type: token
  */
  @GET
  public List<RequestGroup> status(@QueryParam("status")String status) {
  	java.util.Map<String, String> params = QueryParser.parse(status, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The intent of the request group
  * Type: token
  */
  @GET
  public List<RequestGroup> intent(@QueryParam("intent")String intent) {
  	java.util.Map<String, String> params = QueryParser.parse(intent, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The priority of the request group
  * Type: token
  */
  @GET
  public List<RequestGroup> priority(@QueryParam("priority")String priority) {
  	java.util.Map<String, String> params = QueryParser.parse(priority, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The date the request group was authored
  * Type: date
  */
  @GET
  public List<RequestGroup> authored(@QueryParam("authored")String authored) {
  	java.util.Map<String, String> params = QueryParser.parse(authored, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "author|authored|context|definition|encounter|groupidentifier|identifier|intent|participant|patient|priority|status|subject";
}
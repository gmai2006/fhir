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

import org.fhir.pojo.Task;
import org.fhir.service.TaskService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/Task")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class TaskResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final TaskService service;

  @Inject
  public TaskResource(final TaskService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Task create(Task obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public Task update( Task obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public Task find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public Task findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<Task> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Task> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Task> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Task> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Task> findByText(@QueryParam("_text") String _text) {
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
  public List<Task> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<Task> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: Search by requests this task is based on
  * Type: reference
  */
  @GET
  @Path("basedon")
  public List<Task> basedon(@QueryParam("basedon")String basedon) {
  	java.util.Map<String, String> params = QueryParser.parse(basedon, VALID_FIELDS);
  	return this.service.findByBasedOn(new QueryBuilder(params));
  }
  /**
  * Descr: Search by task this task is part of
  * Type: reference
  */
  @GET
  @Path("partof")
  public List<Task> partof(@QueryParam("partof")String partof) {
  	java.util.Map<String, String> params = QueryParser.parse(partof, VALID_FIELDS);
  	return this.service.findByPartOf(new QueryBuilder(params));
  }
  /**
  * Descr: Search by task focus
  * Type: reference
  */
  @GET
  @Path("focus")
  public List<Task> focus(@QueryParam("focus")String focus) {
  	java.util.Map<String, String> params = QueryParser.parse(focus, VALID_FIELDS);
  	return this.service.findByFocus(new QueryBuilder(params));
  }
  /**
  * Descr: Search by encounter or episode
  * Type: reference
  */
  @GET
  @Path("context")
  public List<Task> context(@QueryParam("context")String context) {
  	java.util.Map<String, String> params = QueryParser.parse(context, VALID_FIELDS);
  	return this.service.findByContext(new QueryBuilder(params));
  }
  /**
  * Descr: Search by task owner
  * Type: reference
  */
  @GET
  @Path("owner")
  public List<Task> owner(@QueryParam("owner")String owner) {
  	java.util.Map<String, String> params = QueryParser.parse(owner, VALID_FIELDS);
  	return this.service.findByOwner(new QueryBuilder(params));
  }
  /**
  * Descr: Search for a task instance by its business identifier
  * Type: token
  */
  @GET
  public List<Task> identifier(@QueryParam("identifier")String identifier) {
  	java.util.Map<String, String> params = QueryParser.parse(identifier, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Search by group identifier
  * Type: token
  */
  @GET
  public List<Task> groupidentifier(@QueryParam("groupidentifier")String groupidentifier) {
  	java.util.Map<String, String> params = QueryParser.parse(groupidentifier, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Search by task status
  * Type: token
  */
  @GET
  public List<Task> status(@QueryParam("status")String status) {
  	java.util.Map<String, String> params = QueryParser.parse(status, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Search by business status
  * Type: token
  */
  @GET
  public List<Task> businessstatus(@QueryParam("businessstatus")String businessstatus) {
  	java.util.Map<String, String> params = QueryParser.parse(businessstatus, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Search by task intent
  * Type: token
  */
  @GET
  public List<Task> intent(@QueryParam("intent")String intent) {
  	java.util.Map<String, String> params = QueryParser.parse(intent, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Search by task priority
  * Type: token
  */
  @GET
  public List<Task> priority(@QueryParam("priority")String priority) {
  	java.util.Map<String, String> params = QueryParser.parse(priority, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Search by task code
  * Type: token
  */
  @GET
  public List<Task> code(@QueryParam("code")String code) {
  	java.util.Map<String, String> params = QueryParser.parse(code, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Search by period Task is/was underway
  * Type: date
  */
  @GET
  public List<Task> period(@QueryParam("period")String period) {
  	java.util.Map<String, String> params = QueryParser.parse(period, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Search by last modification date
  * Type: date
  */
  @GET
  public List<Task> modified(@QueryParam("modified")String modified) {
  	java.util.Map<String, String> params = QueryParser.parse(modified, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Search by recommended type of performer (e.g., Requester, Performer, Scheduler).
  * Type: token
  */
  @GET
  public List<Task> performer(@QueryParam("performer")String performer) {
  	java.util.Map<String, String> params = QueryParser.parse(performer, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "authoredon|basedon|businessstatus|code|context|focus|groupidentifier|identifier|intent|modified|organization|owner|partof|patient|performer|period|priority|requester|status|subject";
}
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

import org.fhir.pojo.OperationDefinition;
import org.fhir.service.OperationDefinitionService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/OperationDefinition")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class OperationDefinitionResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final OperationDefinitionService service;

  @Inject
  public OperationDefinitionResource(final OperationDefinitionService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public OperationDefinition create(OperationDefinition obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public OperationDefinition update( OperationDefinition obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public OperationDefinition find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public OperationDefinition findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<OperationDefinition> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<OperationDefinition> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<OperationDefinition> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<OperationDefinition> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<OperationDefinition> findByText(@QueryParam("_text") String _text) {
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
  public List<OperationDefinition> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<OperationDefinition> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: The uri that identifies the operation definition
  * Type: uri
  */
  @GET
  public List<OperationDefinition> url(@QueryParam("url")String url) {
  	java.util.Map<String, String> params = QueryParser.parse(url, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The business version of the operation definition
  * Type: token
  */
  @GET
  public List<OperationDefinition> version(@QueryParam("version")String version) {
  	java.util.Map<String, String> params = QueryParser.parse(version, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Computationally friendly name of the operation definition
  * Type: string
  */
  @GET
  public List<OperationDefinition> name(@QueryParam("name")String name) {
  	java.util.Map<String, String> params = QueryParser.parse(name, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The current status of the operation definition
  * Type: token
  */
  @GET
  public List<OperationDefinition> status(@QueryParam("status")String status) {
  	java.util.Map<String, String> params = QueryParser.parse(status, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: operation | query
  * Type: token
  */
  @GET
  public List<OperationDefinition> kind(@QueryParam("kind")String kind) {
  	java.util.Map<String, String> params = QueryParser.parse(kind, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The operation definition publication date
  * Type: date
  */
  @GET
  public List<OperationDefinition> date(@QueryParam("date")String date) {
  	java.util.Map<String, String> params = QueryParser.parse(date, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Name of the publisher of the operation definition
  * Type: string
  */
  @GET
  public List<OperationDefinition> publisher(@QueryParam("publisher")String publisher) {
  	java.util.Map<String, String> params = QueryParser.parse(publisher, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The description of the operation definition
  * Type: string
  */
  @GET
  public List<OperationDefinition> description(@QueryParam("description")String description) {
  	java.util.Map<String, String> params = QueryParser.parse(description, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Intended jurisdiction for the operation definition
  * Type: token
  */
  @GET
  public List<OperationDefinition> jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	java.util.Map<String, String> params = QueryParser.parse(jurisdiction, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Name used to invoke the operation
  * Type: token
  */
  @GET
  public List<OperationDefinition> code(@QueryParam("code")String code) {
  	java.util.Map<String, String> params = QueryParser.parse(code, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Invoke at the system level?
  * Type: token
  */
  @GET
  public List<OperationDefinition> system(@QueryParam("system")String system) {
  	java.util.Map<String, String> params = QueryParser.parse(system, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Invole at the type level?
  * Type: token
  */
  @GET
  public List<OperationDefinition> type(@QueryParam("type")String type) {
  	java.util.Map<String, String> params = QueryParser.parse(type, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Invoke on an instance?
  * Type: token
  */
  @GET
  public List<OperationDefinition> instance(@QueryParam("instance")String instance) {
  	java.util.Map<String, String> params = QueryParser.parse(instance, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "base|code|date|description|instance|jurisdiction|kind|name|paramprofile|publisher|status|system|type|url|version";
}
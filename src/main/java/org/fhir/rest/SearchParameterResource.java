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

import org.fhir.pojo.SearchParameter;
import org.fhir.service.SearchParameterService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/SearchParameter")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class SearchParameterResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SearchParameterService service;

  @Inject
  public SearchParameterResource(final SearchParameterService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public SearchParameter create(SearchParameter obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public SearchParameter update( SearchParameter obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public SearchParameter find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public SearchParameter findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<SearchParameter> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<SearchParameter> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<SearchParameter> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<SearchParameter> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<SearchParameter> findByText(@QueryParam("_text") String _text) {
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
  public List<SearchParameter> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<SearchParameter> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: The uri that identifies the search parameter
  * Type: uri
  */
  @GET
  public List<SearchParameter> url(@QueryParam("url")String url) {
  	java.util.Map<String, String> params = QueryParser.parse(url, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The business version of the search parameter
  * Type: token
  */
  @GET
  public List<SearchParameter> version(@QueryParam("version")String version) {
  	java.util.Map<String, String> params = QueryParser.parse(version, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Computationally friendly name of the search parameter
  * Type: string
  */
  @GET
  public List<SearchParameter> name(@QueryParam("name")String name) {
  	java.util.Map<String, String> params = QueryParser.parse(name, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The current status of the search parameter
  * Type: token
  */
  @GET
  public List<SearchParameter> status(@QueryParam("status")String status) {
  	java.util.Map<String, String> params = QueryParser.parse(status, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The search parameter publication date
  * Type: date
  */
  @GET
  public List<SearchParameter> date(@QueryParam("date")String date) {
  	java.util.Map<String, String> params = QueryParser.parse(date, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Name of the publisher of the search parameter
  * Type: string
  */
  @GET
  public List<SearchParameter> publisher(@QueryParam("publisher")String publisher) {
  	java.util.Map<String, String> params = QueryParser.parse(publisher, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Intended jurisdiction for the search parameter
  * Type: token
  */
  @GET
  public List<SearchParameter> jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	java.util.Map<String, String> params = QueryParser.parse(jurisdiction, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Code used in URL
  * Type: token
  */
  @GET
  public List<SearchParameter> code(@QueryParam("code")String code) {
  	java.util.Map<String, String> params = QueryParser.parse(code, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: number | date | string | token | reference | composite | quantity | uri
  * Type: token
  */
  @GET
  public List<SearchParameter> type(@QueryParam("type")String type) {
  	java.util.Map<String, String> params = QueryParser.parse(type, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Original Definition for the search parameter
  * Type: uri
  */
  @GET
  public List<SearchParameter> derivedfrom(@QueryParam("derivedfrom")String derivedfrom) {
  	java.util.Map<String, String> params = QueryParser.parse(derivedfrom, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The description of the search parameter
  * Type: string
  */
  @GET
  public List<SearchParameter> description(@QueryParam("description")String description) {
  	java.util.Map<String, String> params = QueryParser.parse(description, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Types of resource (if a resource reference)
  * Type: token
  */
  @GET
  public List<SearchParameter> target(@QueryParam("target")String target) {
  	java.util.Map<String, String> params = QueryParser.parse(target, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "base|code|component|date|derivedfrom|description|jurisdiction|name|publisher|status|target|type|url|version";
}
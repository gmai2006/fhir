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

import org.fhir.pojo.TestScript;
import org.fhir.service.TestScriptService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/TestScript")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class TestScriptResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final TestScriptService service;

  @Inject
  public TestScriptResource(final TestScriptService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public TestScript create(TestScript obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public TestScript update( TestScript obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public TestScript find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public TestScript findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<TestScript> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<TestScript> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<TestScript> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<TestScript> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<TestScript> findByText(@QueryParam("_text") String _text) {
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
  public List<TestScript> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<TestScript> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: The uri that identifies the test script
  * Type: uri
  */
  @GET
  public List<TestScript> url(@QueryParam("url")String url) {
  	java.util.Map<String, String> params = QueryParser.parse(url, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: External identifier for the test script
  * Type: token
  */
  @GET
  public List<TestScript> identifier(@QueryParam("identifier")String identifier) {
  	java.util.Map<String, String> params = QueryParser.parse(identifier, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The business version of the test script
  * Type: token
  */
  @GET
  public List<TestScript> version(@QueryParam("version")String version) {
  	java.util.Map<String, String> params = QueryParser.parse(version, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Computationally friendly name of the test script
  * Type: string
  */
  @GET
  public List<TestScript> name(@QueryParam("name")String name) {
  	java.util.Map<String, String> params = QueryParser.parse(name, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The human-friendly name of the test script
  * Type: string
  */
  @GET
  public List<TestScript> title(@QueryParam("title")String title) {
  	java.util.Map<String, String> params = QueryParser.parse(title, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The current status of the test script
  * Type: token
  */
  @GET
  public List<TestScript> status(@QueryParam("status")String status) {
  	java.util.Map<String, String> params = QueryParser.parse(status, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Name of the publisher of the test script
  * Type: string
  */
  @GET
  public List<TestScript> publisher(@QueryParam("publisher")String publisher) {
  	java.util.Map<String, String> params = QueryParser.parse(publisher, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The description of the test script
  * Type: string
  */
  @GET
  public List<TestScript> description(@QueryParam("description")String description) {
  	java.util.Map<String, String> params = QueryParser.parse(description, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Intended jurisdiction for the test script
  * Type: token
  */
  @GET
  public List<TestScript> jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	java.util.Map<String, String> params = QueryParser.parse(jurisdiction, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "date|description|identifier|jurisdiction|name|publisher|status|testscriptcapability|title|url|version";
}
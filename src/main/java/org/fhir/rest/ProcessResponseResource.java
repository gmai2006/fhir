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

import org.fhir.pojo.ProcessResponse;
import org.fhir.service.ProcessResponseService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/ProcessResponse")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ProcessResponseResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ProcessResponseService service;

  @Inject
  public ProcessResponseResource(final ProcessResponseService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public ProcessResponse create(ProcessResponse obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public ProcessResponse update( ProcessResponse obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public ProcessResponse find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public ProcessResponse findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<ProcessResponse> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ProcessResponse> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ProcessResponse> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ProcessResponse> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ProcessResponse> findByText(@QueryParam("_text") String _text) {
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
  public List<ProcessResponse> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<ProcessResponse> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: The organization who generated this resource
  * Type: reference
  */
  @GET
  @Path("organization")
  public List<ProcessResponse> organization(@QueryParam("organization")String organization) {
  	java.util.Map<String, String> params = QueryParser.parse(organization, VALID_FIELDS);
  	return this.service.findByOrganization(new QueryBuilder(params));
  }
  /**
  * Descr: The reference to the claim
  * Type: reference
  */
  @GET
  @Path("request")
  public List<ProcessResponse> request(@QueryParam("request")String request) {
  	java.util.Map<String, String> params = QueryParser.parse(request, VALID_FIELDS);
  	return this.service.findByRequest(new QueryBuilder(params));
  }
  /**
  * Descr: The Provider who is responsible the request transaction
  * Type: reference
  */
  @GET
  @Path("requestprovider")
  public List<ProcessResponse> requestprovider(@QueryParam("requestprovider")String requestprovider) {
  	java.util.Map<String, String> params = QueryParser.parse(requestprovider, VALID_FIELDS);
  	return this.service.findByRequestProvider(new QueryBuilder(params));
  }
  /**
  * Descr: The Organization who is responsible the request transaction
  * Type: reference
  */
  @GET
  @Path("requestorganization")
  public List<ProcessResponse> requestorganization(@QueryParam("requestorganization")String requestorganization) {
  	java.util.Map<String, String> params = QueryParser.parse(requestorganization, VALID_FIELDS);
  	return this.service.findByRequestOrganization(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "identifier|organization|request|requestorganization|requestprovider";
}
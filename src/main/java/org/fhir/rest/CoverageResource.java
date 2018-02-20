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

import org.fhir.pojo.Coverage;
import org.fhir.service.CoverageService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/Coverage")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class CoverageResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CoverageService service;

  @Inject
  public CoverageResource(final CoverageService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Coverage create(Coverage obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public Coverage update( Coverage obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public Coverage find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public Coverage findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<Coverage> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Coverage> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Coverage> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Coverage> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Coverage> findByText(@QueryParam("_text") String _text) {
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
  public List<Coverage> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<Coverage> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: Reference to the policyholder
  * Type: reference
  */
  @GET
  @Path("policyholder")
  public List<Coverage> policyholder(@QueryParam("policyholder")String policyholder) {
  	java.util.Map<String, String> params = QueryParser.parse(policyholder, VALID_FIELDS);
  	return this.service.findByPolicyHolder(new QueryBuilder(params));
  }
  /**
  * Descr: Reference to the subscriber
  * Type: reference
  */
  @GET
  @Path("subscriber")
  public List<Coverage> subscriber(@QueryParam("subscriber")String subscriber) {
  	java.util.Map<String, String> params = QueryParser.parse(subscriber, VALID_FIELDS);
  	return this.service.findBySubscriber(new QueryBuilder(params));
  }
  /**
  * Descr: The identity of the insurer or party paying for services
  * Type: reference
  */
  @GET
  @Path("payor")
  public List<Coverage> payor(@QueryParam("payor")String payor) {
  	java.util.Map<String, String> params = QueryParser.parse(payor, VALID_FIELDS);
  	return this.service.findByPayor(new QueryBuilder(params));
  }
  /**
  * Descr: The primary identifier of the insured and the coverage
  * Type: token
  */
  @GET
  public List<Coverage> identifier(@QueryParam("identifier")String identifier) {
  	java.util.Map<String, String> params = QueryParser.parse(identifier, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The kind of coverage (health plan, auto, Workers Compensation)
  * Type: token
  */
  @GET
  public List<Coverage> type(@QueryParam("type")String type) {
  	java.util.Map<String, String> params = QueryParser.parse(type, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Dependent number
  * Type: string
  */
  @GET
  public List<Coverage> dependent(@QueryParam("dependent")String dependent) {
  	java.util.Map<String, String> params = QueryParser.parse(dependent, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Sequence number
  * Type: string
  */
  @GET
  public List<Coverage> sequence(@QueryParam("sequence")String sequence) {
  	java.util.Map<String, String> params = QueryParser.parse(sequence, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "beneficiary|FHIRclass|dependent|group|identifier|payor|plan|policyholder|sequence|subclass|subgroup|subplan|subscriber|type";
}
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

import org.fhir.pojo.ReferralRequest;
import org.fhir.service.ReferralRequestService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/ReferralRequest")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ReferralRequestResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ReferralRequestService service;

  @Inject
  public ReferralRequestResource(final ReferralRequestService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public ReferralRequest create(ReferralRequest obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public ReferralRequest update( ReferralRequest obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public ReferralRequest find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public ReferralRequest findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<ReferralRequest> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ReferralRequest> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ReferralRequest> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ReferralRequest> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ReferralRequest> findByText(@QueryParam("_text") String _text) {
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
  public List<ReferralRequest> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<ReferralRequest> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: Instantiates protocol or definition
  * Type: reference
  */
  @GET
  @Path("definition")
  public List<ReferralRequest> definition(@QueryParam("definition")String definition) {
  	java.util.Map<String, String> params = QueryParser.parse(definition, VALID_FIELDS);
  	return this.service.findByDefinition(new QueryBuilder(params));
  }
  /**
  * Descr: Request being fulfilled
  * Type: reference
  */
  @GET
  @Path("basedon")
  public List<ReferralRequest> basedon(@QueryParam("basedon")String basedon) {
  	java.util.Map<String, String> params = QueryParser.parse(basedon, VALID_FIELDS);
  	return this.service.findByBasedOn(new QueryBuilder(params));
  }
  /**
  * Descr: Request(s) replaced by this request
  * Type: reference
  */
  @GET
  @Path("replaces")
  public List<ReferralRequest> replaces(@QueryParam("replaces")String replaces) {
  	java.util.Map<String, String> params = QueryParser.parse(replaces, VALID_FIELDS);
  	return this.service.findByReplaces(new QueryBuilder(params));
  }
  /**
  * Descr: Patient referred to care or transfer
  * Type: reference
  */
  @GET
  @Path("subject")
  public List<ReferralRequest> subject(@QueryParam("subject")String subject) {
  	java.util.Map<String, String> params = QueryParser.parse(subject, VALID_FIELDS);
  	return this.service.findBySubject(new QueryBuilder(params));
  }
  /**
  * Descr: Part of encounter or episode of care
  * Type: reference
  */
  @GET
  @Path("context")
  public List<ReferralRequest> context(@QueryParam("context")String context) {
  	java.util.Map<String, String> params = QueryParser.parse(context, VALID_FIELDS);
  	return this.service.findByContext(new QueryBuilder(params));
  }
  /**
  * Descr: The person that the referral was sent to
  * Type: reference
  */
  @GET
  @Path("recipient")
  public List<ReferralRequest> recipient(@QueryParam("recipient")String recipient) {
  	java.util.Map<String, String> params = QueryParser.parse(recipient, VALID_FIELDS);
  	return this.service.findByRecipient(new QueryBuilder(params));
  }
  /**
  * Descr: Business identifier
  * Type: token
  */
  @GET
  public List<ReferralRequest> identifier(@QueryParam("identifier")String identifier) {
  	java.util.Map<String, String> params = QueryParser.parse(identifier, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Part of common request
  * Type: token
  */
  @GET
  public List<ReferralRequest> groupidentifier(@QueryParam("groupidentifier")String groupidentifier) {
  	java.util.Map<String, String> params = QueryParser.parse(groupidentifier, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The status of the referral
  * Type: token
  */
  @GET
  public List<ReferralRequest> status(@QueryParam("status")String status) {
  	java.util.Map<String, String> params = QueryParser.parse(status, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Proposal, plan or order
  * Type: token
  */
  @GET
  public List<ReferralRequest> intent(@QueryParam("intent")String intent) {
  	java.util.Map<String, String> params = QueryParser.parse(intent, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The priority assigned to the referral
  * Type: token
  */
  @GET
  public List<ReferralRequest> priority(@QueryParam("priority")String priority) {
  	java.util.Map<String, String> params = QueryParser.parse(priority, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Actions requested as part of the referral
  * Type: token
  */
  @GET
  public List<ReferralRequest> service(@QueryParam("service")String service) {
  	java.util.Map<String, String> params = QueryParser.parse(service, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The specialty that the referral is for
  * Type: token
  */
  @GET
  public List<ReferralRequest> specialty(@QueryParam("specialty")String specialty) {
  	java.util.Map<String, String> params = QueryParser.parse(specialty, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "patient|type|authoredon|basedon|context|definition|encounter|groupidentifier|identifier|intent|occurrencedate|priority|recipient|replaces|requester|service|specialty|status|subject";
}
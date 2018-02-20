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

import org.fhir.pojo.PaymentNotice;
import org.fhir.service.PaymentNoticeService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/PaymentNotice")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class PaymentNoticeResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final PaymentNoticeService service;

  @Inject
  public PaymentNoticeResource(final PaymentNoticeService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public PaymentNotice create(PaymentNotice obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public PaymentNotice update( PaymentNotice obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public PaymentNotice find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public PaymentNotice findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<PaymentNotice> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<PaymentNotice> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<PaymentNotice> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<PaymentNotice> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<PaymentNotice> findByText(@QueryParam("_text") String _text) {
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
  public List<PaymentNotice> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<PaymentNotice> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: The Claim
  * Type: reference
  */
  @GET
  @Path("request")
  public List<PaymentNotice> request(@QueryParam("request")String request) {
  	java.util.Map<String, String> params = QueryParser.parse(request, VALID_FIELDS);
  	return this.service.findByRequest(new QueryBuilder(params));
  }
  /**
  * Descr: The ClaimResponse
  * Type: reference
  */
  @GET
  @Path("response")
  public List<PaymentNotice> response(@QueryParam("response")String response) {
  	java.util.Map<String, String> params = QueryParser.parse(response, VALID_FIELDS);
  	return this.service.findByResponse(new QueryBuilder(params));
  }
  /**
  * Descr: The reference to the provider
  * Type: reference
  */
  @GET
  @Path("provider")
  public List<PaymentNotice> provider(@QueryParam("provider")String provider) {
  	java.util.Map<String, String> params = QueryParser.parse(provider, VALID_FIELDS);
  	return this.service.findByProvider(new QueryBuilder(params));
  }
  /**
  * Descr: The organization who generated this resource
  * Type: reference
  */
  @GET
  @Path("organization")
  public List<PaymentNotice> organization(@QueryParam("organization")String organization) {
  	java.util.Map<String, String> params = QueryParser.parse(organization, VALID_FIELDS);
  	return this.service.findByOrganization(new QueryBuilder(params));
  }
  /**
  * Descr: The business identifier of the notice
  * Type: token
  */
  @GET
  public List<PaymentNotice> identifier(@QueryParam("identifier")String identifier) {
  	java.util.Map<String, String> params = QueryParser.parse(identifier, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The date of the payment action
  * Type: date
  */
  @GET
  public List<PaymentNotice> statusdate(@QueryParam("statusdate")String statusdate) {
  	java.util.Map<String, String> params = QueryParser.parse(statusdate, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The type of payment notice
  * Type: token
  */
  @GET
  public List<PaymentNotice> paymentstatus(@QueryParam("paymentstatus")String paymentstatus) {
  	java.util.Map<String, String> params = QueryParser.parse(paymentstatus, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "created|identifier|organization|paymentstatus|provider|request|response|statusdate";
}
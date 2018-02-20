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

import org.fhir.pojo.ChargeItem;
import org.fhir.service.ChargeItemService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/ChargeItem")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ChargeItemResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ChargeItemService service;

  @Inject
  public ChargeItemResource(final ChargeItemService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public ChargeItem create(ChargeItem obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public ChargeItem update( ChargeItem obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public ChargeItem find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public ChargeItem findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<ChargeItem> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ChargeItem> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ChargeItem> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ChargeItem> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ChargeItem> findByText(@QueryParam("_text") String _text) {
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
  public List<ChargeItem> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<ChargeItem> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: Individual service was done for/to
  * Type: reference
  */
  @GET
  @Path("patient")
  public List<ChargeItem> patient(@QueryParam("patient")String patient) {
  	java.util.Map<String, String> params = QueryParser.parse(patient, VALID_FIELDS);
  	return this.service.findBySubject(new QueryBuilder(params));
  }
  /**
  * Descr: Encounter / Episode associated with event
  * Type: reference
  */
  @GET
  @Path("context")
  public List<ChargeItem> context(@QueryParam("context")String context) {
  	java.util.Map<String, String> params = QueryParser.parse(context, VALID_FIELDS);
  	return this.service.findByContext(new QueryBuilder(params));
  }
  /**
  * Descr: Organization providing the charged sevice
  * Type: reference
  */
  @GET
  @Path("performingorganization")
  public List<ChargeItem> performingorganization(@QueryParam("performingorganization")String performingorganization) {
  	java.util.Map<String, String> params = QueryParser.parse(performingorganization, VALID_FIELDS);
  	return this.service.findByPerformingOrganization(new QueryBuilder(params));
  }
  /**
  * Descr: Organization requesting the charged service
  * Type: reference
  */
  @GET
  @Path("requestingorganization")
  public List<ChargeItem> requestingorganization(@QueryParam("requestingorganization")String requestingorganization) {
  	java.util.Map<String, String> params = QueryParser.parse(requestingorganization, VALID_FIELDS);
  	return this.service.findByRequestingOrganization(new QueryBuilder(params));
  }
  /**
  * Descr: Quantity of which the charge item has been serviced
  * Type: quantity
  */
  @GET
  @Path("quantity")
  public List<ChargeItem> quantity(@QueryParam("quantity")String quantity) {
  	java.util.Map<String, String> params = QueryParser.parse(quantity, VALID_FIELDS);
  	return this.service.findByQuantity(new QueryBuilder(params));
  }
  /**
  * Descr: Price overriding the associated rules
  * Type: quantity
  */
  @GET
  @Path("priceoverride")
  public List<ChargeItem> priceoverride(@QueryParam("priceoverride")String priceoverride) {
  	java.util.Map<String, String> params = QueryParser.parse(priceoverride, VALID_FIELDS);
  	return this.service.findByPriceOverride(new QueryBuilder(params));
  }
  /**
  * Descr: Individual who was entering
  * Type: reference
  */
  @GET
  @Path("enterer")
  public List<ChargeItem> enterer(@QueryParam("enterer")String enterer) {
  	java.util.Map<String, String> params = QueryParser.parse(enterer, VALID_FIELDS);
  	return this.service.findByEnterer(new QueryBuilder(params));
  }
  /**
  * Descr: Which rendered service is being charged?
  * Type: reference
  */
  @GET
  @Path("service")
  public List<ChargeItem> service(@QueryParam("service")String service) {
  	java.util.Map<String, String> params = QueryParser.parse(service, VALID_FIELDS);
  	return this.service.findByService(new QueryBuilder(params));
  }
  /**
  * Descr: Business Identifier for item
  * Type: token
  */
  @GET
  public List<ChargeItem> identifier(@QueryParam("identifier")String identifier) {
  	java.util.Map<String, String> params = QueryParser.parse(identifier, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: A code that identifies the charge, like a billing code
  * Type: token
  */
  @GET
  public List<ChargeItem> code(@QueryParam("code")String code) {
  	java.util.Map<String, String> params = QueryParser.parse(code, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Factor overriding the associated rules
  * Type: number
  */
  @GET
  public List<ChargeItem> factoroverride(@QueryParam("factoroverride")String factoroverride) {
  	java.util.Map<String, String> params = QueryParser.parse(factoroverride, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Date the charge item was entered
  * Type: date
  */
  @GET
  public List<ChargeItem> entereddate(@QueryParam("entereddate")String entereddate) {
  	java.util.Map<String, String> params = QueryParser.parse(entereddate, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "account|code|context|entereddate|enterer|factoroverride|identifier|occurrence|participantactor|participantrole|patient|performingorganization|priceoverride|quantity|requestingorganization|service|subject";
}
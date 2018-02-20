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

import org.fhir.pojo.Organization;
import org.fhir.service.OrganizationService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/Organization")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class OrganizationResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final OrganizationService service;

  @Inject
  public OrganizationResource(final OrganizationService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Organization create(Organization obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public Organization update( Organization obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public Organization find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public Organization findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<Organization> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Organization> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Organization> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Organization> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Organization> findByText(@QueryParam("_text") String _text) {
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
  public List<Organization> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<Organization> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: A (part of the) address of the organization
  * Type: string
  */
  @GET
  @Path("address")
  public List<Organization> address(@QueryParam("address")String address) {
  	java.util.Map<String, String> params = QueryParser.parse(address, VALID_FIELDS);
  	return this.service.findByAddress(new QueryBuilder(params));
  }
  /**
  * Descr: An organization of which this organization forms a part
  * Type: reference
  */
  @GET
  @Path("partof")
  public List<Organization> partof(@QueryParam("partof")String partof) {
  	java.util.Map<String, String> params = QueryParser.parse(partof, VALID_FIELDS);
  	return this.service.findByPartOf(new QueryBuilder(params));
  }
  /**
  * Descr: Technical endpoints providing access to services operated for the organization
  * Type: reference
  */
  @GET
  @Path("endpoint")
  public List<Organization> endpoint(@QueryParam("endpoint")String endpoint) {
  	java.util.Map<String, String> params = QueryParser.parse(endpoint, VALID_FIELDS);
  	return this.service.findByEndpoint(new QueryBuilder(params));
  }
  /**
  * Descr: Any identifier for the organization (not the accreditation issuer's identifier)
  * Type: token
  */
  @GET
  public List<Organization> identifier(@QueryParam("identifier")String identifier) {
  	java.util.Map<String, String> params = QueryParser.parse(identifier, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: A code for the type of organization
  * Type: token
  */
  @GET
  public List<Organization> type(@QueryParam("type")String type) {
  	java.util.Map<String, String> params = QueryParser.parse(type, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: A portion of the organization's name using some kind of phonetic matching algorithm
  * Type: string
  */
  @GET
  public List<Organization> phonetic(@QueryParam("phonetic")String phonetic) {
  	java.util.Map<String, String> params = QueryParser.parse(phonetic, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "active|address|addresscity|addresscountry|addresspostalcode|addressstate|addressuse|endpoint|identifier|name|partof|phonetic|type";
}
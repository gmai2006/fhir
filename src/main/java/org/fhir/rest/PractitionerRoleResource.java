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

import org.fhir.pojo.PractitionerRole;
import org.fhir.service.PractitionerRoleService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/PractitionerRole")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class PractitionerRoleResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final PractitionerRoleService service;

  @Inject
  public PractitionerRoleResource(final PractitionerRoleService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public PractitionerRole create(PractitionerRole obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public PractitionerRole update( PractitionerRole obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public PractitionerRole find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public PractitionerRole findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<PractitionerRole> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<PractitionerRole> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<PractitionerRole> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<PractitionerRole> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<PractitionerRole> findByText(@QueryParam("_text") String _text) {
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
  public List<PractitionerRole> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<PractitionerRole> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: Practitioner that is able to provide the defined services for the organation
  * Type: reference
  */
  @GET
  @Path("practitioner")
  public List<PractitionerRole> practitioner(@QueryParam("practitioner")String practitioner) {
  	java.util.Map<String, String> params = QueryParser.parse(practitioner, VALID_FIELDS);
  	return this.service.findByPractitioner(new QueryBuilder(params));
  }
  /**
  * Descr: The identity of the organization the practitioner represents / acts on behalf of
  * Type: reference
  */
  @GET
  @Path("organization")
  public List<PractitionerRole> organization(@QueryParam("organization")String organization) {
  	java.util.Map<String, String> params = QueryParser.parse(organization, VALID_FIELDS);
  	return this.service.findByOrganization(new QueryBuilder(params));
  }
  /**
  * Descr: One of the locations at which this practitioner provides care
  * Type: reference
  */
  @GET
  @Path("location")
  public List<PractitionerRole> location(@QueryParam("location")String location) {
  	java.util.Map<String, String> params = QueryParser.parse(location, VALID_FIELDS);
  	return this.service.findByLocation(new QueryBuilder(params));
  }
  /**
  * Descr: The list of healthcare services that this worker provides for this role's Organization/Location(s)
  * Type: reference
  */
  @GET
  @Path("service")
  public List<PractitionerRole> service(@QueryParam("service")String service) {
  	java.util.Map<String, String> params = QueryParser.parse(service, VALID_FIELDS);
  	return this.service.findByHealthcareService(new QueryBuilder(params));
  }
  /**
  * Descr: Technical endpoints providing access to services operated for the practitioner with this role
  * Type: reference
  */
  @GET
  @Path("endpoint")
  public List<PractitionerRole> endpoint(@QueryParam("endpoint")String endpoint) {
  	java.util.Map<String, String> params = QueryParser.parse(endpoint, VALID_FIELDS);
  	return this.service.findByEndpoint(new QueryBuilder(params));
  }
  /**
  * Descr: A practitioner's Identifier
  * Type: token
  */
  @GET
  public List<PractitionerRole> identifier(@QueryParam("identifier")String identifier) {
  	java.util.Map<String, String> params = QueryParser.parse(identifier, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The period during which the practitioner is authorized to perform in these role(s)
  * Type: date
  */
  @GET
  public List<PractitionerRole> date(@QueryParam("date")String date) {
  	java.util.Map<String, String> params = QueryParser.parse(date, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The practitioner can perform this role at for the organization
  * Type: token
  */
  @GET
  public List<PractitionerRole> role(@QueryParam("role")String role) {
  	java.util.Map<String, String> params = QueryParser.parse(role, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The practitioner has this specialty at an organization
  * Type: token
  */
  @GET
  public List<PractitionerRole> specialty(@QueryParam("specialty")String specialty) {
  	java.util.Map<String, String> params = QueryParser.parse(specialty, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "email|phone|telecom|active|date|endpoint|identifier|location|organization|practitioner|role|service|specialty";
}
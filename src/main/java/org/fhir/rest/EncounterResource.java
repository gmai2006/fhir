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

import org.fhir.pojo.Encounter;
import org.fhir.service.EncounterService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/Encounter")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class EncounterResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EncounterService service;

  @Inject
  public EncounterResource(final EncounterService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Encounter create(Encounter obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public Encounter update( Encounter obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public Encounter find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public Encounter findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<Encounter> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Encounter> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Encounter> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Encounter> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Encounter> findByText(@QueryParam("_text") String _text) {
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
  public List<Encounter> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<Encounter> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: The patient ro group present at the encounter
  * Type: reference
  */
  @GET
  @Path("subject")
  public List<Encounter> subject(@QueryParam("subject")String subject) {
  	java.util.Map<String, String> params = QueryParser.parse(subject, VALID_FIELDS);
  	return this.service.findBySubject(new QueryBuilder(params));
  }
  /**
  * Descr: Episode(s) of care that this encounter should be recorded against
  * Type: reference
  */
  @GET
  @Path("episodeofcare")
  public List<Encounter> episodeofcare(@QueryParam("episodeofcare")String episodeofcare) {
  	java.util.Map<String, String> params = QueryParser.parse(episodeofcare, VALID_FIELDS);
  	return this.service.findByEpisodeOfCare(new QueryBuilder(params));
  }
  /**
  * Descr: The ReferralRequest that initiated this encounter
  * Type: reference
  */
  @GET
  @Path("incomingreferral")
  public List<Encounter> incomingreferral(@QueryParam("incomingreferral")String incomingreferral) {
  	java.util.Map<String, String> params = QueryParser.parse(incomingreferral, VALID_FIELDS);
  	return this.service.findByIncomingReferral(new QueryBuilder(params));
  }
  /**
  * Descr: The custodian organization of this Encounter record
  * Type: reference
  */
  @GET
  @Path("serviceprovider")
  public List<Encounter> serviceprovider(@QueryParam("serviceprovider")String serviceprovider) {
  	java.util.Map<String, String> params = QueryParser.parse(serviceprovider, VALID_FIELDS);
  	return this.service.findByServiceProvider(new QueryBuilder(params));
  }
  /**
  * Descr: Another Encounter this encounter is part of
  * Type: reference
  */
  @GET
  @Path("partof")
  public List<Encounter> partof(@QueryParam("partof")String partof) {
  	java.util.Map<String, String> params = QueryParser.parse(partof, VALID_FIELDS);
  	return this.service.findByPartOf(new QueryBuilder(params));
  }
  /**
  * Descr: planned | arrived | triaged | in-progress | onleave | finished | cancelled +
  * Type: token
  */
  @GET
  public List<Encounter> status(@QueryParam("status")String status) {
  	java.util.Map<String, String> params = QueryParser.parse(status, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Length of encounter in days
  * Type: number
  */
  @GET
  public List<Encounter> length(@QueryParam("length")String length) {
  	java.util.Map<String, String> params = QueryParser.parse(length, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Reason the encounter takes place (code)
  * Type: token
  */
  @GET
  public List<Encounter> reason(@QueryParam("reason")String reason) {
  	java.util.Map<String, String> params = QueryParser.parse(reason, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "appointment|FHIRclass|diagnosis|episodeofcare|incomingreferral|length|location|locationperiod|partof|participant|participanttype|practitioner|reason|serviceprovider|specialarrangement|status|subject";
}
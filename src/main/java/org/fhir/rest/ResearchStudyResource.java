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

import org.fhir.pojo.ResearchStudy;
import org.fhir.service.ResearchStudyService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/ResearchStudy")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ResearchStudyResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ResearchStudyService service;

  @Inject
  public ResearchStudyResource(final ResearchStudyService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public ResearchStudy create(ResearchStudy obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public ResearchStudy update( ResearchStudy obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public ResearchStudy find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public ResearchStudy findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<ResearchStudy> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ResearchStudy> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ResearchStudy> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ResearchStudy> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ResearchStudy> findByText(@QueryParam("_text") String _text) {
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
  public List<ResearchStudy> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<ResearchStudy> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: Steps followed in executing study
  * Type: reference
  */
  @GET
  @Path("protocol")
  public List<ResearchStudy> protocol(@QueryParam("protocol")String protocol) {
  	java.util.Map<String, String> params = QueryParser.parse(protocol, VALID_FIELDS);
  	return this.service.findByProtocol(new QueryBuilder(params));
  }
  /**
  * Descr: Part of larger study
  * Type: reference
  */
  @GET
  @Path("partof")
  public List<ResearchStudy> partof(@QueryParam("partof")String partof) {
  	java.util.Map<String, String> params = QueryParser.parse(partof, VALID_FIELDS);
  	return this.service.findByPartOf(new QueryBuilder(params));
  }
  /**
  * Descr: Organization responsible for the study
  * Type: reference
  */
  @GET
  @Path("sponsor")
  public List<ResearchStudy> sponsor(@QueryParam("sponsor")String sponsor) {
  	java.util.Map<String, String> params = QueryParser.parse(sponsor, VALID_FIELDS);
  	return this.service.findBySponsor(new QueryBuilder(params));
  }
  /**
  * Descr: The individual responsible for the study
  * Type: reference
  */
  @GET
  @Path("principalinvestigator")
  public List<ResearchStudy> principalinvestigator(@QueryParam("principalinvestigator")String principalinvestigator) {
  	java.util.Map<String, String> params = QueryParser.parse(principalinvestigator, VALID_FIELDS);
  	return this.service.findByPrincipalInvestigator(new QueryBuilder(params));
  }
  /**
  * Descr: Location involved in study execution
  * Type: reference
  */
  @GET
  @Path("site")
  public List<ResearchStudy> site(@QueryParam("site")String site) {
  	java.util.Map<String, String> params = QueryParser.parse(site, VALID_FIELDS);
  	return this.service.findBySite(new QueryBuilder(params));
  }
  /**
  * Descr: Business Identifier for study
  * Type: token
  */
  @GET
  public List<ResearchStudy> identifier(@QueryParam("identifier")String identifier) {
  	java.util.Map<String, String> params = QueryParser.parse(identifier, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Name for this study
  * Type: string
  */
  @GET
  public List<ResearchStudy> title(@QueryParam("title")String title) {
  	java.util.Map<String, String> params = QueryParser.parse(title, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: draft | in-progress | suspended | stopped | completed | entered-in-error
  * Type: token
  */
  @GET
  public List<ResearchStudy> status(@QueryParam("status")String status) {
  	java.util.Map<String, String> params = QueryParser.parse(status, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Drugs, devices, conditions, etc. under study
  * Type: token
  */
  @GET
  public List<ResearchStudy> focus(@QueryParam("focus")String focus) {
  	java.util.Map<String, String> params = QueryParser.parse(focus, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Used to search for the study
  * Type: token
  */
  @GET
  public List<ResearchStudy> keyword(@QueryParam("keyword")String keyword) {
  	java.util.Map<String, String> params = QueryParser.parse(keyword, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Geographic region(s) for study
  * Type: token
  */
  @GET
  public List<ResearchStudy> jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	java.util.Map<String, String> params = QueryParser.parse(jurisdiction, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: When the study began and ended
  * Type: date
  */
  @GET
  public List<ResearchStudy> date(@QueryParam("date")String date) {
  	java.util.Map<String, String> params = QueryParser.parse(date, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "category|date|focus|identifier|jurisdiction|keyword|partof|principalinvestigator|protocol|site|sponsor|status|title";
}
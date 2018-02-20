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

import org.fhir.pojo.DiagnosticReport;
import org.fhir.service.DiagnosticReportService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/DiagnosticReport")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class DiagnosticReportResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final DiagnosticReportService service;

  @Inject
  public DiagnosticReportResource(final DiagnosticReportService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public DiagnosticReport create(DiagnosticReport obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public DiagnosticReport update( DiagnosticReport obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public DiagnosticReport find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public DiagnosticReport findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<DiagnosticReport> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<DiagnosticReport> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<DiagnosticReport> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<DiagnosticReport> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<DiagnosticReport> findByText(@QueryParam("_text") String _text) {
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
  public List<DiagnosticReport> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<DiagnosticReport> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: The subject of the report
  * Type: reference
  */
  @GET
  @Path("subject")
  public List<DiagnosticReport> subject(@QueryParam("subject")String subject) {
  	java.util.Map<String, String> params = QueryParser.parse(subject, VALID_FIELDS);
  	return this.service.findBySubject(new QueryBuilder(params));
  }
  /**
  * Descr: Healthcare event (Episode of Care or Encounter) related to the report
  * Type: reference
  */
  @GET
  @Path("context")
  public List<DiagnosticReport> context(@QueryParam("context")String context) {
  	java.util.Map<String, String> params = QueryParser.parse(context, VALID_FIELDS);
  	return this.service.findByContext(new QueryBuilder(params));
  }
  /**
  * Descr: The specimen details
  * Type: reference
  */
  @GET
  @Path("specimen")
  public List<DiagnosticReport> specimen(@QueryParam("specimen")String specimen) {
  	java.util.Map<String, String> params = QueryParser.parse(specimen, VALID_FIELDS);
  	return this.service.findBySpecimen(new QueryBuilder(params));
  }
  /**
  * Descr: Link to an atomic result (observation resource)
  * Type: reference
  */
  @GET
  @Path("result")
  public List<DiagnosticReport> result(@QueryParam("result")String result) {
  	java.util.Map<String, String> params = QueryParser.parse(result, VALID_FIELDS);
  	return this.service.findByResult(new QueryBuilder(params));
  }
  /**
  * Descr: The status of the report
  * Type: token
  */
  @GET
  public List<DiagnosticReport> status(@QueryParam("status")String status) {
  	java.util.Map<String, String> params = QueryParser.parse(status, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Which diagnostic discipline/department created the report
  * Type: token
  */
  @GET
  public List<DiagnosticReport> category(@QueryParam("category")String category) {
  	java.util.Map<String, String> params = QueryParser.parse(category, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: When the report was issued
  * Type: date
  */
  @GET
  public List<DiagnosticReport> issued(@QueryParam("issued")String issued) {
  	java.util.Map<String, String> params = QueryParser.parse(issued, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: A coded diagnosis on the report
  * Type: token
  */
  @GET
  public List<DiagnosticReport> diagnosis(@QueryParam("diagnosis")String diagnosis) {
  	java.util.Map<String, String> params = QueryParser.parse(diagnosis, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "basedon|category|context|diagnosis|image|issued|performer|result|specimen|status|subject";
}
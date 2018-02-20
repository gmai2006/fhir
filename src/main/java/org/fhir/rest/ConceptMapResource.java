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

import org.fhir.pojo.ConceptMap;
import org.fhir.service.ConceptMapService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/ConceptMap")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ConceptMapResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ConceptMapService service;

  @Inject
  public ConceptMapResource(final ConceptMapService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public ConceptMap create(ConceptMap obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public ConceptMap update( ConceptMap obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public ConceptMap find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public ConceptMap findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<ConceptMap> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ConceptMap> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ConceptMap> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ConceptMap> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<ConceptMap> findByText(@QueryParam("_text") String _text) {
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
  public List<ConceptMap> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<ConceptMap> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: Identifies the source of the concepts which are being mapped
  * Type: reference
  */
  @GET
  @Path("source")
  public List<ConceptMap> source(@QueryParam("source")String source) {
  	java.util.Map<String, String> params = QueryParser.parse(source, VALID_FIELDS);
  	return this.service.findBySourceReference(new QueryBuilder(params));
  }
  /**
  * Descr: Provides context to the mappings
  * Type: reference
  */
  @GET
  @Path("target")
  public List<ConceptMap> target(@QueryParam("target")String target) {
  	java.util.Map<String, String> params = QueryParser.parse(target, VALID_FIELDS);
  	return this.service.findByTargetReference(new QueryBuilder(params));
  }
  /**
  * Descr: The uri that identifies the concept map
  * Type: uri
  */
  @GET
  public List<ConceptMap> url(@QueryParam("url")String url) {
  	java.util.Map<String, String> params = QueryParser.parse(url, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: External identifier for the concept map
  * Type: token
  */
  @GET
  public List<ConceptMap> identifier(@QueryParam("identifier")String identifier) {
  	java.util.Map<String, String> params = QueryParser.parse(identifier, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The business version of the concept map
  * Type: token
  */
  @GET
  public List<ConceptMap> version(@QueryParam("version")String version) {
  	java.util.Map<String, String> params = QueryParser.parse(version, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Computationally friendly name of the concept map
  * Type: string
  */
  @GET
  public List<ConceptMap> name(@QueryParam("name")String name) {
  	java.util.Map<String, String> params = QueryParser.parse(name, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The human-friendly name of the concept map
  * Type: string
  */
  @GET
  public List<ConceptMap> title(@QueryParam("title")String title) {
  	java.util.Map<String, String> params = QueryParser.parse(title, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The current status of the concept map
  * Type: token
  */
  @GET
  public List<ConceptMap> status(@QueryParam("status")String status) {
  	java.util.Map<String, String> params = QueryParser.parse(status, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Name of the publisher of the concept map
  * Type: string
  */
  @GET
  public List<ConceptMap> publisher(@QueryParam("publisher")String publisher) {
  	java.util.Map<String, String> params = QueryParser.parse(publisher, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The description of the concept map
  * Type: string
  */
  @GET
  public List<ConceptMap> description(@QueryParam("description")String description) {
  	java.util.Map<String, String> params = QueryParser.parse(description, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Intended jurisdiction for the concept map
  * Type: token
  */
  @GET
  public List<ConceptMap> jurisdiction(@QueryParam("jurisdiction")String jurisdiction) {
  	java.util.Map<String, String> params = QueryParser.parse(jurisdiction, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Identifies the source of the concepts which are being mapped
  * Type: reference
  */
  @GET
  public List<ConceptMap> sourceuri(@QueryParam("sourceuri")String sourceuri) {
  	java.util.Map<String, String> params = QueryParser.parse(sourceuri, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Provides context to the mappings
  * Type: reference
  */
  @GET
  public List<ConceptMap> targeturi(@QueryParam("targeturi")String targeturi) {
  	java.util.Map<String, String> params = QueryParser.parse(targeturi, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "date|dependson|description|identifier|jurisdiction|name|other|product|publisher|source|sourcecode|sourcesystem|sourceuri|status|target|targetcode|targetsystem|targeturi|title|url|version";
}
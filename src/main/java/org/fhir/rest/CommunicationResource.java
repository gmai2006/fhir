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

import org.fhir.pojo.Communication;
import org.fhir.service.CommunicationService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/Communication")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class CommunicationResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CommunicationService service;

  @Inject
  public CommunicationResource(final CommunicationService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Communication create(Communication obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public Communication update( Communication obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public Communication find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public Communication findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<Communication> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Communication> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Communication> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Communication> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Communication> findByText(@QueryParam("_text") String _text) {
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
  public List<Communication> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<Communication> findWithLimit(@PathParam("max") String max) {
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
  public List<Communication> definition(@QueryParam("definition")String definition) {
  	java.util.Map<String, String> params = QueryParser.parse(definition, VALID_FIELDS);
  	return this.service.findByDefinition(new QueryBuilder(params));
  }
  /**
  * Descr: Part of this action
  * Type: reference
  */
  @GET
  @Path("partof")
  public List<Communication> partof(@QueryParam("partof")String partof) {
  	java.util.Map<String, String> params = QueryParser.parse(partof, VALID_FIELDS);
  	return this.service.findByPartOf(new QueryBuilder(params));
  }
  /**
  * Descr: Focus of message
  * Type: reference
  */
  @GET
  @Path("patient")
  public List<Communication> patient(@QueryParam("patient")String patient) {
  	java.util.Map<String, String> params = QueryParser.parse(patient, VALID_FIELDS);
  	return this.service.findBySubject(new QueryBuilder(params));
  }
  /**
  * Descr: Message recipient
  * Type: reference
  */
  @GET
  @Path("recipient")
  public List<Communication> recipient(@QueryParam("recipient")String recipient) {
  	java.util.Map<String, String> params = QueryParser.parse(recipient, VALID_FIELDS);
  	return this.service.findByRecipient(new QueryBuilder(params));
  }
  /**
  * Descr: Encounter leading to message
  * Type: reference
  */
  @GET
  @Path("encounter")
  public List<Communication> encounter(@QueryParam("encounter")String encounter) {
  	java.util.Map<String, String> params = QueryParser.parse(encounter, VALID_FIELDS);
  	return this.service.findByContext(new QueryBuilder(params));
  }
  /**
  * Descr: Message sender
  * Type: reference
  */
  @GET
  @Path("sender")
  public List<Communication> sender(@QueryParam("sender")String sender) {
  	java.util.Map<String, String> params = QueryParser.parse(sender, VALID_FIELDS);
  	return this.service.findBySender(new QueryBuilder(params));
  }
  /**
  * Descr: Unique identifier
  * Type: token
  */
  @GET
  public List<Communication> identifier(@QueryParam("identifier")String identifier) {
  	java.util.Map<String, String> params = QueryParser.parse(identifier, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: preparation | in-progress | suspended | aborted | completed | entered-in-error
  * Type: token
  */
  @GET
  public List<Communication> status(@QueryParam("status")String status) {
  	java.util.Map<String, String> params = QueryParser.parse(status, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Message category
  * Type: token
  */
  @GET
  public List<Communication> category(@QueryParam("category")String category) {
  	java.util.Map<String, String> params = QueryParser.parse(category, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: A channel of communication
  * Type: token
  */
  @GET
  public List<Communication> medium(@QueryParam("medium")String medium) {
  	java.util.Map<String, String> params = QueryParser.parse(medium, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: When sent
  * Type: date
  */
  @GET
  public List<Communication> sent(@QueryParam("sent")String sent) {
  	java.util.Map<String, String> params = QueryParser.parse(sent, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: When received
  * Type: date
  */
  @GET
  public List<Communication> received(@QueryParam("received")String received) {
  	java.util.Map<String, String> params = QueryParser.parse(received, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "basedon|category|context|definition|encounter|identifier|medium|partof|patient|received|recipient|sender|sent|status|subject";
}
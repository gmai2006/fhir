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

import org.fhir.pojo.MessageHeader;
import org.fhir.service.MessageHeaderService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/MessageHeader")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class MessageHeaderResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MessageHeaderService service;

  @Inject
  public MessageHeaderResource(final MessageHeaderService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public MessageHeader create(MessageHeader obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public MessageHeader update( MessageHeader obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public MessageHeader find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public MessageHeader findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<MessageHeader> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<MessageHeader> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<MessageHeader> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<MessageHeader> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<MessageHeader> findByText(@QueryParam("_text") String _text) {
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
  public List<MessageHeader> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<MessageHeader> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: Intended "real-world" recipient for the data
  * Type: reference
  */
  @GET
  @Path("receiver")
  public List<MessageHeader> receiver(@QueryParam("receiver")String receiver) {
  	java.util.Map<String, String> params = QueryParser.parse(receiver, VALID_FIELDS);
  	return this.service.findByReceiver(new QueryBuilder(params));
  }
  /**
  * Descr: Real world sender of the message
  * Type: reference
  */
  @GET
  @Path("sender")
  public List<MessageHeader> sender(@QueryParam("sender")String sender) {
  	java.util.Map<String, String> params = QueryParser.parse(sender, VALID_FIELDS);
  	return this.service.findBySender(new QueryBuilder(params));
  }
  /**
  * Descr: The source of the data entry
  * Type: reference
  */
  @GET
  @Path("enterer")
  public List<MessageHeader> enterer(@QueryParam("enterer")String enterer) {
  	java.util.Map<String, String> params = QueryParser.parse(enterer, VALID_FIELDS);
  	return this.service.findByEnterer(new QueryBuilder(params));
  }
  /**
  * Descr: Final responsibility for event
  * Type: reference
  */
  @GET
  @Path("responsible")
  public List<MessageHeader> responsible(@QueryParam("responsible")String responsible) {
  	java.util.Map<String, String> params = QueryParser.parse(responsible, VALID_FIELDS);
  	return this.service.findByResponsible(new QueryBuilder(params));
  }
  /**
  * Descr: The actual content of the message
  * Type: reference
  */
  @GET
  @Path("focus")
  public List<MessageHeader> focus(@QueryParam("focus")String focus) {
  	java.util.Map<String, String> params = QueryParser.parse(focus, VALID_FIELDS);
  	return this.service.findByFocus(new QueryBuilder(params));
  }
  /**
  * Descr: Code for the event this message represents
  * Type: token
  */
  @GET
  public List<MessageHeader> event(@QueryParam("event")String event) {
  	java.util.Map<String, String> params = QueryParser.parse(event, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: Time that the message was sent
  * Type: date
  */
  @GET
  public List<MessageHeader> timestamp(@QueryParam("timestamp")String timestamp) {
  	java.util.Map<String, String> params = QueryParser.parse(timestamp, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "author|code|destination|destinationuri|enterer|event|focus|receiver|responseid|responsible|sender|source|sourceuri|target|timestamp";
}
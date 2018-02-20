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

import org.fhir.pojo.Observation;
import org.fhir.service.ObservationService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Narrative;
import org.fhir.pojo.OperationOutcome;

@Path("/Observation")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ObservationResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ObservationService service;

  @Inject
  public ObservationResource(final ObservationService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Observation create(Observation obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public Observation update( Observation obj) {
		return this.service.update(obj);
	}


  @GET
  @Path("{id}")
  public Observation find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  public Observation findById(@QueryParam("_id") String id) {
  	return this.service.find(id);
  }

  @GET
  public List<Observation> findByLastUpdate(@QueryParam("_lastUpdated") String _lastUpdated) {
  	java.util.Map<String, String> params = QueryParser.parse(_lastUpdated, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Observation> findByTag(@QueryParam("_tag") String _tag) {
  	java.util.Map<String, String> params = QueryParser.parse(_tag, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Observation> findByProfile(@QueryParam("_profile") String _profile) {
  	java.util.Map<String, String> params = QueryParser.parse(_profile, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Observation> findBySecurity(@QueryParam("_security") String _security) {
  	java.util.Map<String, String> params = QueryParser.parse(_security, VALID_FIELDS);
  	return this.service.findByMeta(new QueryBuilder(params));
  }

  @GET
  public List<Observation> findByText(@QueryParam("_text") String _text) {
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
  public List<Observation> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<Observation> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  /**
  * Descr: The subject that the observation is about
  * Type: reference
  */
  @GET
  @Path("subject")
  public List<Observation> subject(@QueryParam("subject")String subject) {
  	java.util.Map<String, String> params = QueryParser.parse(subject, VALID_FIELDS);
  	return this.service.findBySubject(new QueryBuilder(params));
  }
  /**
  * Descr: Healthcare event  (Episode-of-care or Encounter) related to the observation
  * Type: reference
  */
  @GET
  @Path("context")
  public List<Observation> context(@QueryParam("context")String context) {
  	java.util.Map<String, String> params = QueryParser.parse(context, VALID_FIELDS);
  	return this.service.findByContext(new QueryBuilder(params));
  }
  /**
  * Descr: Who performed the observation
  * Type: reference
  */
  @GET
  @Path("performer")
  public List<Observation> performer(@QueryParam("performer")String performer) {
  	java.util.Map<String, String> params = QueryParser.parse(performer, VALID_FIELDS);
  	return this.service.findByPerformer(new QueryBuilder(params));
  }
  /**
  * Descr: The value of the observation, if the value is a Quantity, or a SampledData (just search on the bounds of the values in sampled data)
  * Type: quantity
  */
  @GET
  @Path("valuequantity")
  public List<Observation> valuequantity(@QueryParam("valuequantity")String valuequantity) {
  	java.util.Map<String, String> params = QueryParser.parse(valuequantity, VALID_FIELDS);
  	return this.service.findByValueQuantity(new QueryBuilder(params));
  }
  /**
  * Descr: Specimen used for this observation
  * Type: reference
  */
  @GET
  @Path("specimen")
  public List<Observation> specimen(@QueryParam("specimen")String specimen) {
  	java.util.Map<String, String> params = QueryParser.parse(specimen, VALID_FIELDS);
  	return this.service.findBySpecimen(new QueryBuilder(params));
  }
  /**
  * Descr: The Device that generated the observation data.
  * Type: reference
  */
  @GET
  @Path("device")
  public List<Observation> device(@QueryParam("device")String device) {
  	java.util.Map<String, String> params = QueryParser.parse(device, VALID_FIELDS);
  	return this.service.findByDevice(new QueryBuilder(params));
  }
  /**
  * Descr: Related Observations - search on related-type and related-target together
  * Type: composite
  */
  @GET
  @Path("related")
  public List<Observation> related(@QueryParam("related")String related) {
  	java.util.Map<String, String> params = QueryParser.parse(related, VALID_FIELDS);
  	return this.service.findByRelated(new QueryBuilder(params));
  }
  /**
  * Descr: The status of the observation
  * Type: token
  */
  @GET
  public List<Observation> status(@QueryParam("status")String status) {
  	java.util.Map<String, String> params = QueryParser.parse(status, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The classification of the type of observation
  * Type: token
  */
  @GET
  public List<Observation> category(@QueryParam("category")String category) {
  	java.util.Map<String, String> params = QueryParser.parse(category, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The value of the observation, if the value is a CodeableConcept
  * Type: token
  */
  @GET
  public List<Observation> valueconcept(@QueryParam("valueconcept")String valueconcept) {
  	java.util.Map<String, String> params = QueryParser.parse(valueconcept, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The value of the observation, if the value is a string, and also searches in CodeableConcept.text
  * Type: string
  */
  @GET
  public List<Observation> valuestring(@QueryParam("valuestring")String valuestring) {
  	java.util.Map<String, String> params = QueryParser.parse(valuestring, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The reason why the expected value in the element Observation.value[x] is missing.
  * Type: token
  */
  @GET
  public List<Observation> dataabsentreason(@QueryParam("dataabsentreason")String dataabsentreason) {
  	java.util.Map<String, String> params = QueryParser.parse(dataabsentreason, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }
  /**
  * Descr: The method used for the observation
  * Type: token
  */
  @GET
  public List<Observation> method(@QueryParam("method")String method) {
  	java.util.Map<String, String> params = QueryParser.parse(method, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "basedon|category|codevalueconcept|codevaluedate|codevaluequantity|codevaluestring|combocode|combocodevalueconcept|combocodevaluequantity|combodataabsentreason|combovalueconcept|combovaluequantity|componentcode|componentcodevalueconcept|componentcodevaluequantity|componentdataabsentreason|componentvalueconcept|componentvaluequantity|context|dataabsentreason|device|method|performer|related|relatedtarget|relatedtype|specimen|status|subject|valueconcept|valuedate|valuequantity|valuestring";
}
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
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Observation find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Observation> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Observation> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
      return service.select(input);
  }

  /** TBD*/
  /**
  * Descr: Reference to the test or procedure request.
  * expr: basedOn
  * Xpath: f:Observation/f:basedOn
  * Type: reference
  * Code: basedon
  */
  @GET
  @Path("basedOn")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation basedon() {
  	return new Observation();
  }
  /**
  * Descr: The classification of the type of observation
  * expr: category
  * Xpath: f:Observation/f:category
  * Type: token
  * Code: category
  */
  @GET
  @Path("category")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation category(@QueryParam("category")String category) {
  	return new Observation();
  }
  /**
  * Descr: Code and coded value parameter pair
  * expr: Observation
  * Xpath: 
  * Type: composite
  * Code: codevalueconcept
  */
  @GET
  @Path("Observation")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation codevalueconcept(@QueryParam("codevalueconcept")String codevalueconcept) {
  	return new Observation();
  }
  /**
  * Descr: Code and date/time value parameter pair
  * expr: Observation
  * Xpath: 
  * Type: composite
  * Code: codevaluedate
  */
  @GET
  @Path("Observation")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation codevaluedate(@QueryParam("codevaluedate")String codevaluedate) {
  	return new Observation();
  }
  /**
  * Descr: Code and quantity value parameter pair
  * expr: Observation
  * Xpath: 
  * Type: composite
  * Code: codevaluequantity
  */
  @GET
  @Path("Observation")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation codevaluequantity(@QueryParam("codevaluequantity")String codevaluequantity) {
  	return new Observation();
  }
  /**
  * Descr: Code and string value parameter pair
  * expr: Observation
  * Xpath: 
  * Type: composite
  * Code: codevaluestring
  */
  @GET
  @Path("Observation")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation codevaluestring(@QueryParam("codevaluestring")String codevaluestring) {
  	return new Observation();
  }
  /**
  * Descr: The code of the observation type or component type
  * expr: code
  * Xpath: f:Observation/f:code | f:Observation/f:component/f:code
  * Type: token
  * Code: combocode
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation combocode(@QueryParam("combocode")String combocode) {
  	return new Observation();
  }
  /**
  * Descr: Code and coded value parameter pair, including in components
  * expr: component
  * Xpath: 
  * Type: composite
  * Code: combocodevalueconcept
  */
  @GET
  @Path("component")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation combocodevalueconcept(@QueryParam("combocodevalueconcept")String combocodevalueconcept) {
  	return new Observation();
  }
  /**
  * Descr: Code and quantity value parameter pair, including in components
  * expr: component
  * Xpath: 
  * Type: composite
  * Code: combocodevaluequantity
  */
  @GET
  @Path("component")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation combocodevaluequantity(@QueryParam("combocodevaluequantity")String combocodevaluequantity) {
  	return new Observation();
  }
  /**
  * Descr: The reason why the expected value in the element Observation.value[x] or Observation.component.value[x] is missing.
  * expr: dataAbsentReason
  * Xpath: f:Observation/f:dataAbsentReason | f:Observation/f:component/f:dataAbsentReason
  * Type: token
  * Code: combodataabsentreason
  */
  @GET
  @Path("dataAbsentReason")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation combodataabsentreason(@QueryParam("combodataabsentreason")String combodataabsentreason) {
  	return new Observation();
  }
  /**
  * Descr: The value or component value of the observation, if the value is a CodeableConcept
  * expr: as(CodeableConcept)
  * Xpath: f:Observation/f:valueCodeableConcept | f:Observation/f:component/f:valueCodeableConcept
  * Type: token
  * Code: combovalueconcept
  */
  @GET
  @Path("as(CodeableConcept)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation combovalueconcept(@QueryParam("combovalueconcept")String combovalueconcept) {
  	return new Observation();
  }
  /**
  * Descr: The value or component value of the observation, if the value is a Quantity, or a SampledData (just search on the bounds of the values in sampled data)
  * expr: as(Quantity)
  * Xpath: f:Observation/f:valueQuantity | f:Observation/f:component/f:valueQuantity
  * Type: quantity
  * Code: combovaluequantity
  */
  @GET
  @Path("as(Quantity)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation combovaluequantity(@QueryParam("combovaluequantity")String combovaluequantity) {
  	return new Observation();
  }
  /**
  * Descr: The component code of the observation type
  * expr: code
  * Xpath: f:Observation/f:component/f:code
  * Type: token
  * Code: componentcode
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation componentcode(@QueryParam("componentcode")String componentcode) {
  	return new Observation();
  }
  /**
  * Descr: Component code and component coded value parameter pair
  * expr: component
  * Xpath: 
  * Type: composite
  * Code: componentcodevalueconcept
  */
  @GET
  @Path("component")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation componentcodevalueconcept(@QueryParam("componentcodevalueconcept")String componentcodevalueconcept) {
  	return new Observation();
  }
  /**
  * Descr: Component code and component quantity value parameter pair
  * expr: component
  * Xpath: 
  * Type: composite
  * Code: componentcodevaluequantity
  */
  @GET
  @Path("component")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation componentcodevaluequantity(@QueryParam("componentcodevaluequantity")String componentcodevaluequantity) {
  	return new Observation();
  }
  /**
  * Descr: The reason why the expected value in the element Observation.component.value[x] is missing.
  * expr: dataAbsentReason
  * Xpath: f:Observation/f:component/f:dataAbsentReason
  * Type: token
  * Code: componentdataabsentreason
  */
  @GET
  @Path("dataAbsentReason")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation componentdataabsentreason(@QueryParam("componentdataabsentreason")String componentdataabsentreason) {
  	return new Observation();
  }
  /**
  * Descr: The value of the component observation, if the value is a CodeableConcept
  * expr: as(CodeableConcept)
  * Xpath: f:Observation/f:component/f:valueCodeableConcept
  * Type: token
  * Code: componentvalueconcept
  */
  @GET
  @Path("as(CodeableConcept)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation componentvalueconcept(@QueryParam("componentvalueconcept")String componentvalueconcept) {
  	return new Observation();
  }
  /**
  * Descr: The value of the component observation, if the value is a Quantity, or a SampledData (just search on the bounds of the values in sampled data)
  * expr: as(Quantity)
  * Xpath: f:Observation/f:component/f:valueQuantity
  * Type: quantity
  * Code: componentvaluequantity
  */
  @GET
  @Path("as(Quantity)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation componentvaluequantity(@QueryParam("componentvaluequantity")String componentvaluequantity) {
  	return new Observation();
  }
  /**
  * Descr: Healthcare event  (Episode-of-care or Encounter) related to the observation
  * expr: context
  * Xpath: f:Observation/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation context() {
  	return new Observation();
  }
  /**
  * Descr: The reason why the expected value in the element Observation.value[x] is missing.
  * expr: dataAbsentReason
  * Xpath: f:Observation/f:dataAbsentReason
  * Type: token
  * Code: dataabsentreason
  */
  @GET
  @Path("dataAbsentReason")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation dataabsentreason(@QueryParam("dataabsentreason")String dataabsentreason) {
  	return new Observation();
  }
  /**
  * Descr: The Device that generated the observation data.
  * expr: device
  * Xpath: f:Observation/f:device
  * Type: reference
  * Code: device
  */
  @GET
  @Path("device")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation device() {
  	return new Observation();
  }
  /**
  * Descr: The method used for the observation
  * expr: method
  * Xpath: f:Observation/f:method
  * Type: token
  * Code: method
  */
  @GET
  @Path("method")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation method(@QueryParam("method")String method) {
  	return new Observation();
  }
  /**
  * Descr: Who performed the observation
  * expr: performer
  * Xpath: f:Observation/f:performer
  * Type: reference
  * Code: performer
  */
  @GET
  @Path("performer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation performer() {
  	return new Observation();
  }
  /**
  * Descr: Related Observations - search on related-type and related-target together
  * expr: related
  * Xpath: 
  * Type: composite
  * Code: related
  */
  @GET
  @Path("related")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation related(@QueryParam("related")String related) {
  	return new Observation();
  }
  /**
  * Descr: Resource that is related to this one
  * expr: target
  * Xpath: f:Observation/f:related/f:target
  * Type: reference
  * Code: relatedtarget
  */
  @GET
  @Path("target")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation relatedtarget() {
  	return new Observation();
  }
  /**
  * Descr: has-member | derived-from | sequel-to | replaces | qualified-by | interfered-by
  * expr: type
  * Xpath: f:Observation/f:related/f:type
  * Type: token
  * Code: relatedtype
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation relatedtype(@QueryParam("relatedtype")String relatedtype) {
  	return new Observation();
  }
  /**
  * Descr: Specimen used for this observation
  * expr: specimen
  * Xpath: f:Observation/f:specimen
  * Type: reference
  * Code: specimen
  */
  @GET
  @Path("specimen")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation specimen() {
  	return new Observation();
  }
  /**
  * Descr: The status of the observation
  * expr: status
  * Xpath: f:Observation/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation status(@QueryParam("status")String status) {
  	return new Observation();
  }
  /**
  * Descr: The subject that the observation is about
  * expr: subject
  * Xpath: f:Observation/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation subject() {
  	return new Observation();
  }
  /**
  * Descr: The value of the observation, if the value is a CodeableConcept
  * expr: as(CodeableConcept)
  * Xpath: f:Observation/f:valueCodeableConcept
  * Type: token
  * Code: valueconcept
  */
  @GET
  @Path("as(CodeableConcept)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation valueconcept(@QueryParam("valueconcept")String valueconcept) {
  	return new Observation();
  }
  /**
  * Descr: The value of the observation, if the value is a date or period of time
  * expr: as(Period)
  * Xpath: f:Observation/f:valueDateTime | f:Observation/f:valuePeriod
  * Type: date
  * Code: valuedate
  */
  @GET
  @Path("as(Period)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation valuedate(@QueryParam("valuedate")String valuedate) {
  	return new Observation();
  }
  /**
  * Descr: The value of the observation, if the value is a Quantity, or a SampledData (just search on the bounds of the values in sampled data)
  * expr: as(Quantity)
  * Xpath: f:Observation/f:valueQuantity
  * Type: quantity
  * Code: valuequantity
  */
  @GET
  @Path("as(Quantity)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation valuequantity(@QueryParam("valuequantity")String valuequantity) {
  	return new Observation();
  }
  /**
  * Descr: The value of the observation, if the value is a string, and also searches in CodeableConcept.text
  * expr: as(String)
  * Xpath: f:Observation/f:valueString
  * Type: string
  * Code: valuestring
  */
  @GET
  @Path("as(String)")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Observation valuestring(@QueryParam("valuestring")String valuestring) {
  	return new Observation();
  }
}
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

import org.fhir.pojo.ChargeItem;
import org.fhir.service.ChargeItemService;

@Path("/ChargeItem")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ChargeItemResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ChargeItemService service;

  @Inject
  public ChargeItemResource(final ChargeItemService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public ChargeItem create(ChargeItem obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public ChargeItem update( ChargeItem obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public ChargeItem find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<ChargeItem> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<ChargeItem> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Account to place this charge
  * expr: account
  * Xpath: f:ChargeItem/f:account
  * Type: reference
  * Code: account
  */
  @GET
  @Path("account")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ChargeItem account() {
  	return new ChargeItem();
  }
  /**
  * Descr: A code that identifies the charge, like a billing code
  * expr: code
  * Xpath: f:ChargeItem/f:code
  * Type: token
  * Code: code
  */
  @GET
  @Path("code")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ChargeItem code(@QueryParam("code")String code) {
  	return new ChargeItem();
  }
  /**
  * Descr: Encounter / Episode associated with event
  * expr: context
  * Xpath: f:ChargeItem/f:context
  * Type: reference
  * Code: context
  */
  @GET
  @Path("context")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ChargeItem context() {
  	return new ChargeItem();
  }
  /**
  * Descr: Date the charge item was entered
  * expr: enteredDate
  * Xpath: f:ChargeItem/f:enteredDate
  * Type: date
  * Code: entereddate
  */
  @GET
  @Path("enteredDate")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ChargeItem entereddate(@QueryParam("entereddate")String entereddate) {
  	return new ChargeItem();
  }
  /**
  * Descr: Individual who was entering
  * expr: enterer
  * Xpath: f:ChargeItem/f:enterer
  * Type: reference
  * Code: enterer
  */
  @GET
  @Path("enterer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ChargeItem enterer() {
  	return new ChargeItem();
  }
  /**
  * Descr: Factor overriding the associated rules
  * expr: factorOverride
  * Xpath: f:ChargeItem/f:factorOverride
  * Type: number
  * Code: factoroverride
  */
  @GET
  @Path("factorOverride")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ChargeItem factoroverride(@QueryParam("factoroverride")String factoroverride) {
  	return new ChargeItem();
  }
  /**
  * Descr: Business Identifier for item
  * expr: identifier
  * Xpath: f:ChargeItem/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ChargeItem identifier(@QueryParam("identifier")String identifier) {
  	return new ChargeItem();
  }
  /**
  * Descr: When the charged service was applied
  * expr: occurrence
  * Xpath: f:ChargeItem/f:occurrenceDateTime | f:ChargeItem/f:occurrencePeriod | f:ChargeItem/f:occurrenceTiming
  * Type: date
  * Code: occurrence
  */
  @GET
  @Path("occurrence")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ChargeItem occurrence(@QueryParam("occurrence")String occurrence) {
  	return new ChargeItem();
  }
  /**
  * Descr: Individual who was performing
  * expr: actor
  * Xpath: f:ChargeItem/f:participant/f:actor
  * Type: reference
  * Code: participantactor
  */
  @GET
  @Path("actor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ChargeItem participantactor() {
  	return new ChargeItem();
  }
  /**
  * Descr: What type of performance was done
  * expr: role
  * Xpath: f:ChargeItem/f:participant/f:role
  * Type: token
  * Code: participantrole
  */
  @GET
  @Path("role")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ChargeItem participantrole(@QueryParam("participantrole")String participantrole) {
  	return new ChargeItem();
  }
  /**
  * Descr: Individual service was done for/to
  * expr: subject
  * Xpath: f:ChargeItem/f:subject
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ChargeItem patient() {
  	return new ChargeItem();
  }
  /**
  * Descr: Organization providing the charged sevice
  * expr: performingOrganization
  * Xpath: f:ChargeItem/f:performingOrganization
  * Type: reference
  * Code: performingorganization
  */
  @GET
  @Path("performingOrganization")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ChargeItem performingorganization() {
  	return new ChargeItem();
  }
  /**
  * Descr: Price overriding the associated rules
  * expr: priceOverride
  * Xpath: f:ChargeItem/f:priceOverride
  * Type: quantity
  * Code: priceoverride
  */
  @GET
  @Path("priceOverride")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ChargeItem priceoverride(@QueryParam("priceoverride")String priceoverride) {
  	return new ChargeItem();
  }
  /**
  * Descr: Quantity of which the charge item has been serviced
  * expr: quantity
  * Xpath: f:ChargeItem/f:quantity
  * Type: quantity
  * Code: quantity
  */
  @GET
  @Path("quantity")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ChargeItem quantity(@QueryParam("quantity")String quantity) {
  	return new ChargeItem();
  }
  /**
  * Descr: Organization requesting the charged service
  * expr: requestingOrganization
  * Xpath: f:ChargeItem/f:requestingOrganization
  * Type: reference
  * Code: requestingorganization
  */
  @GET
  @Path("requestingOrganization")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ChargeItem requestingorganization() {
  	return new ChargeItem();
  }
  /**
  * Descr: Which rendered service is being charged?
  * expr: service
  * Xpath: f:ChargeItem/f:service
  * Type: reference
  * Code: service
  */
  @GET
  @Path("service")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ChargeItem service() {
  	return new ChargeItem();
  }
  /**
  * Descr: Individual service was done for/to
  * expr: subject
  * Xpath: f:ChargeItem/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public ChargeItem subject() {
  	return new ChargeItem();
  }
}
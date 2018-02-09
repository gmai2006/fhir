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

import org.fhir.pojo.Contract;
import org.fhir.service.ContractService;

@Path("/Contract")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class ContractResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ContractService service;

  @Inject
  public ContractResource(final ContractService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Contract create(Contract obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Contract update( Contract obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Contract find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Contract> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Contract> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Agent to the Contact
  * expr: actor
  * Xpath: f:Contract/f:agent/f:actor
  * Type: reference
  * Code: agent
  */
  @GET
  @Path("actor")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Contract agent() {
  	return new Contract();
  }
  /**
  * Descr: The authority of the contract
  * expr: authority
  * Xpath: f:Contract/f:authority
  * Type: reference
  * Code: authority
  */
  @GET
  @Path("authority")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Contract authority() {
  	return new Contract();
  }
  /**
  * Descr: The domain of the contract
  * expr: domain
  * Xpath: f:Contract/f:domain
  * Type: reference
  * Code: domain
  */
  @GET
  @Path("domain")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Contract domain() {
  	return new Contract();
  }
  /**
  * Descr: The identity of the contract
  * expr: identifier
  * Xpath: f:Contract/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Contract identifier(@QueryParam("identifier")String identifier) {
  	return new Contract();
  }
  /**
  * Descr: The date/time the contract was issued
  * expr: issued
  * Xpath: f:Contract/f:issued
  * Type: date
  * Code: issued
  */
  @GET
  @Path("issued")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Contract issued(@QueryParam("issued")String issued) {
  	return new Contract();
  }
  /**
  * Descr: The identity of the subject of the contract (if a patient)
  * expr: subject
  * Xpath: f:Contract/f:subject
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Contract patient() {
  	return new Contract();
  }
  /**
  * Descr: Contract Signatory Party
  * expr: party
  * Xpath: f:Contract/f:signer/f:party
  * Type: reference
  * Code: signer
  */
  @GET
  @Path("party")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Contract signer() {
  	return new Contract();
  }
  /**
  * Descr: The identity of the subject of the contract
  * expr: subject
  * Xpath: f:Contract/f:subject
  * Type: reference
  * Code: subject
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Contract subject() {
  	return new Contract();
  }
  /**
  * Descr: The identity of the topic of the contract terms
  * expr: topic
  * Xpath: f:Contract/f:term/f:topic
  * Type: reference
  * Code: termtopic
  */
  @GET
  @Path("topic")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Contract termtopic() {
  	return new Contract();
  }
}
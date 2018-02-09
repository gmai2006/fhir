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

import org.fhir.pojo.PaymentReconciliation;
import org.fhir.service.PaymentReconciliationService;

@Path("/PaymentReconciliation")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class PaymentReconciliationResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final PaymentReconciliationService service;

  @Inject
  public PaymentReconciliationResource(final PaymentReconciliationService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public PaymentReconciliation create(PaymentReconciliation obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public PaymentReconciliation update( PaymentReconciliation obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public PaymentReconciliation find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<PaymentReconciliation> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<PaymentReconciliation> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The creation date
  * expr: created
  * Xpath: f:PaymentReconciliation/f:created
  * Type: date
  * Code: created
  */
  @GET
  @Path("created")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PaymentReconciliation created(@QueryParam("created")String created) {
  	return new PaymentReconciliation();
  }
  /**
  * Descr: The contents of the disposition message
  * expr: disposition
  * Xpath: f:PaymentReconciliation/f:disposition
  * Type: string
  * Code: disposition
  */
  @GET
  @Path("disposition")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PaymentReconciliation disposition(@QueryParam("disposition")String disposition) {
  	return new PaymentReconciliation();
  }
  /**
  * Descr: The business identifier of the Explanation of Benefit
  * expr: identifier
  * Xpath: f:PaymentReconciliation/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PaymentReconciliation identifier(@QueryParam("identifier")String identifier) {
  	return new PaymentReconciliation();
  }
  /**
  * Descr: The organization who generated this resource
  * expr: organization
  * Xpath: f:PaymentReconciliation/f:organization
  * Type: reference
  * Code: organization
  */
  @GET
  @Path("organization")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PaymentReconciliation organization() {
  	return new PaymentReconciliation();
  }
  /**
  * Descr: The processing outcome
  * expr: outcome
  * Xpath: f:PaymentReconciliation/f:outcome
  * Type: token
  * Code: outcome
  */
  @GET
  @Path("outcome")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PaymentReconciliation outcome(@QueryParam("outcome")String outcome) {
  	return new PaymentReconciliation();
  }
  /**
  * Descr: The reference to the claim
  * expr: request
  * Xpath: f:PaymentReconciliation/f:request
  * Type: reference
  * Code: request
  */
  @GET
  @Path("request")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PaymentReconciliation request() {
  	return new PaymentReconciliation();
  }
  /**
  * Descr: The organization who generated this resource
  * expr: requestOrganization
  * Xpath: f:PaymentReconciliation/f:requestOrganization
  * Type: reference
  * Code: requestorganization
  */
  @GET
  @Path("requestOrganization")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PaymentReconciliation requestorganization() {
  	return new PaymentReconciliation();
  }
  /**
  * Descr: The reference to the provider who sumbitted the claim
  * expr: requestProvider
  * Xpath: f:PaymentReconciliation/f:requestProvider
  * Type: reference
  * Code: requestprovider
  */
  @GET
  @Path("requestProvider")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public PaymentReconciliation requestprovider() {
  	return new PaymentReconciliation();
  }
}
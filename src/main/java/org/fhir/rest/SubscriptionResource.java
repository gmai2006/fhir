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

import org.fhir.pojo.Subscription;
import org.fhir.service.SubscriptionService;

@Path("/Subscription")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class SubscriptionResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SubscriptionService service;

  @Inject
  public SubscriptionResource(final SubscriptionService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Subscription create(Subscription obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Subscription update( Subscription obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Subscription find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Subscription> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Subscription> findWithLimit(@PathParam("max") String max) {
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
  * Descr: A tag to be added to the resource matching the criteria
  * expr: tag
  * Xpath: f:Subscription/f:tag
  * Type: token
  * Code: addtag
  */
  @GET
  @Path("tag")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Subscription addtag(@QueryParam("addtag")String addtag) {
  	return new Subscription();
  }
  /**
  * Descr: Contact details for the subscription
  * expr: contact
  * Xpath: f:Subscription/f:contact
  * Type: token
  * Code: contact
  */
  @GET
  @Path("contact")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Subscription contact(@QueryParam("contact")String contact) {
  	return new Subscription();
  }
  /**
  * Descr: The search rules used to determine when to send a notification
  * expr: criteria
  * Xpath: f:Subscription/f:criteria
  * Type: string
  * Code: criteria
  */
  @GET
  @Path("criteria")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Subscription criteria(@QueryParam("criteria")String criteria) {
  	return new Subscription();
  }
  /**
  * Descr: The mime-type of the notification payload
  * expr: payload
  * Xpath: f:Subscription/f:channel/f:payload
  * Type: string
  * Code: payload
  */
  @GET
  @Path("payload")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Subscription payload(@QueryParam("payload")String payload) {
  	return new Subscription();
  }
  /**
  * Descr: The current state of the subscription
  * expr: status
  * Xpath: f:Subscription/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Subscription status(@QueryParam("status")String status) {
  	return new Subscription();
  }
  /**
  * Descr: The type of channel for the sent notifications
  * expr: type
  * Xpath: f:Subscription/f:channel/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Subscription type(@QueryParam("type")String type) {
  	return new Subscription();
  }
  /**
  * Descr: The uri that will receive the notifications
  * expr: endpoint
  * Xpath: f:Subscription/f:channel/f:endpoint
  * Type: uri
  * Code: url
  */
  @GET
  @Path("endpoint")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Subscription url(@QueryParam("url")String url) {
  	return new Subscription();
  }
}
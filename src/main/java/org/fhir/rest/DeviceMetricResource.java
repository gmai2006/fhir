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

import org.fhir.pojo.DeviceMetric;
import org.fhir.service.DeviceMetricService;

@Path("/DeviceMetric")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class DeviceMetricResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final DeviceMetricService service;

  @Inject
  public DeviceMetricResource(final DeviceMetricService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public DeviceMetric create(DeviceMetric obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public DeviceMetric update( DeviceMetric obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public DeviceMetric find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<DeviceMetric> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<DeviceMetric> findWithLimit(@PathParam("max") String max) {
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
  * Descr: The category of the metric
  * expr: category
  * Xpath: f:DeviceMetric/f:category
  * Type: token
  * Code: category
  */
  @GET
  @Path("category")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DeviceMetric category(@QueryParam("category")String category) {
  	return new DeviceMetric();
  }
  /**
  * Descr: The identifier of the metric
  * expr: identifier
  * Xpath: f:DeviceMetric/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DeviceMetric identifier(@QueryParam("identifier")String identifier) {
  	return new DeviceMetric();
  }
  /**
  * Descr: The parent DeviceMetric resource
  * expr: parent
  * Xpath: f:DeviceMetric/f:parent
  * Type: reference
  * Code: parent
  */
  @GET
  @Path("parent")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DeviceMetric parent() {
  	return new DeviceMetric();
  }
  /**
  * Descr: The device resource
  * expr: source
  * Xpath: f:DeviceMetric/f:source
  * Type: reference
  * Code: source
  */
  @GET
  @Path("source")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DeviceMetric source() {
  	return new DeviceMetric();
  }
  /**
  * Descr: The component type
  * expr: type
  * Xpath: f:DeviceMetric/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public DeviceMetric type(@QueryParam("type")String type) {
  	return new DeviceMetric();
  }
}
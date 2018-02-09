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

import org.fhir.pojo.Device;
import org.fhir.service.DeviceService;

@Path("/Device")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class DeviceResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final DeviceService service;

  @Inject
  public DeviceResource(final DeviceService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Device create(Device obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Device update( Device obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Device find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Device> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Device> findWithLimit(@PathParam("max") String max) {
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
  * Descr: A server defined search that may match any of the string fields in the Device.udi.name  or Device.type.coding.display or  Device.type.text
  * expr: display
  * Xpath: f:Device/f:udi/f:name | f:Device/f:type/f:text | f:Device/f:type/f:coding/f:display
  * Type: string
  * Code: devicename
  */
  @GET
  @Path("display")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Device devicename(@QueryParam("devicename")String devicename) {
  	return new Device();
  }
  /**
  * Descr: Instance id from manufacturer, owner, and others
  * expr: identifier
  * Xpath: f:Device/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Device identifier(@QueryParam("identifier")String identifier) {
  	return new Device();
  }
  /**
  * Descr: A location, where the resource is found
  * expr: location
  * Xpath: f:Device/f:location
  * Type: reference
  * Code: location
  */
  @GET
  @Path("location")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Device location() {
  	return new Device();
  }
  /**
  * Descr: The manufacturer of the device
  * expr: manufacturer
  * Xpath: f:Device/f:manufacturer
  * Type: string
  * Code: manufacturer
  */
  @GET
  @Path("manufacturer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Device manufacturer(@QueryParam("manufacturer")String manufacturer) {
  	return new Device();
  }
  /**
  * Descr: The model of the device
  * expr: model
  * Xpath: f:Device/f:model
  * Type: string
  * Code: model
  */
  @GET
  @Path("model")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Device model(@QueryParam("model")String model) {
  	return new Device();
  }
  /**
  * Descr: The organization responsible for the device
  * expr: owner
  * Xpath: f:Device/f:owner
  * Type: reference
  * Code: organization
  */
  @GET
  @Path("owner")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Device organization() {
  	return new Device();
  }
  /**
  * Descr: Patient information, if the resource is affixed to a person
  * expr: patient
  * Xpath: f:Device/f:patient
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("patient")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Device patient() {
  	return new Device();
  }
  /**
  * Descr: active | inactive | entered-in-error | unknown
  * expr: status
  * Xpath: f:Device/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Device status(@QueryParam("status")String status) {
  	return new Device();
  }
  /**
  * Descr: The type of the device
  * expr: type
  * Xpath: f:Device/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Device type(@QueryParam("type")String type) {
  	return new Device();
  }
  /**
  * Descr: UDI Barcode (RFID or other technology) string either in HRF format or AIDC format converted to base64 string.
  * expr: carrierAIDC
  * Xpath: f:Device/f:udi/f:carrierHRF | f:Device/f:udi/f:carrierAIDC
  * Type: string
  * Code: udicarrier
  */
  @GET
  @Path("carrierAIDC")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Device udicarrier(@QueryParam("udicarrier")String udicarrier) {
  	return new Device();
  }
  /**
  * Descr: The udi Device Identifier (DI)
  * expr: deviceIdentifier
  * Xpath: f:Device/f:udi/f:deviceIdentifier
  * Type: string
  * Code: udidi
  */
  @GET
  @Path("deviceIdentifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Device udidi(@QueryParam("udidi")String udidi) {
  	return new Device();
  }
  /**
  * Descr: Network address to contact device
  * expr: url
  * Xpath: f:Device/f:url
  * Type: uri
  * Code: url
  */
  @GET
  @Path("url")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Device url(@QueryParam("url")String url) {
  	return new Device();
  }
}
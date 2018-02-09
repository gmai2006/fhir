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

import org.fhir.pojo.Location;
import org.fhir.service.LocationService;

@Path("/Location")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class LocationResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LocationService service;

  @Inject
  public LocationResource(final LocationService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Location create(Location obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Location update( Location obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Location find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Location> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Location> findWithLimit(@PathParam("max") String max) {
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
  * Descr: A (part of the) address of the location
  * expr: address
  * Xpath: f:Location/f:address
  * Type: string
  * Code: address
  */
  @GET
  @Path("address")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Location address(@QueryParam("address")String address) {
  	return new Location();
  }
  /**
  * Descr: A city specified in an address
  * expr: city
  * Xpath: f:Location/f:address/f:city
  * Type: string
  * Code: addresscity
  */
  @GET
  @Path("city")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Location addresscity(@QueryParam("addresscity")String addresscity) {
  	return new Location();
  }
  /**
  * Descr: A country specified in an address
  * expr: country
  * Xpath: f:Location/f:address/f:country
  * Type: string
  * Code: addresscountry
  */
  @GET
  @Path("country")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Location addresscountry(@QueryParam("addresscountry")String addresscountry) {
  	return new Location();
  }
  /**
  * Descr: A postal code specified in an address
  * expr: postalCode
  * Xpath: f:Location/f:address/f:postalCode
  * Type: string
  * Code: addresspostalcode
  */
  @GET
  @Path("postalCode")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Location addresspostalcode(@QueryParam("addresspostalcode")String addresspostalcode) {
  	return new Location();
  }
  /**
  * Descr: A state specified in an address
  * expr: state
  * Xpath: f:Location/f:address/f:state
  * Type: string
  * Code: addressstate
  */
  @GET
  @Path("state")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Location addressstate(@QueryParam("addressstate")String addressstate) {
  	return new Location();
  }
  /**
  * Descr: A use code specified in an address
  * expr: use
  * Xpath: f:Location/f:address/f:use
  * Type: token
  * Code: addressuse
  */
  @GET
  @Path("use")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Location addressuse(@QueryParam("addressuse")String addressuse) {
  	return new Location();
  }
  /**
  * Descr: Technical endpoints providing access to services operated for the location
  * expr: endpoint
  * Xpath: f:Location/f:endpoint
  * Type: reference
  * Code: endpoint
  */
  @GET
  @Path("endpoint")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Location endpoint() {
  	return new Location();
  }
  /**
  * Descr: An identifier for the location
  * expr: identifier
  * Xpath: f:Location/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Location identifier(@QueryParam("identifier")String identifier) {
  	return new Location();
  }
  /**
  * Descr: A portion of the location's name or alias
  * expr: alias
  * Xpath: f:Location/f:name | f:Location/f:alias
  * Type: string
  * Code: name
  */
  @GET
  @Path("alias")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Location name(@QueryParam("name")String name) {
  	return new Location();
  }
  /**
  * Descr: The coordinates expressed as [latitude]:[longitude] (using the WGS84 datum, see notes) to find locations near to (servers may search using a square rather than a circle for efficiency)

  Requires the near-distance parameter to be provided also
  * expr: position
  * Xpath: f:Location/f:position
  * Type: token
  * Code: near
  */
  @GET
  @Path("position")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Location near(@QueryParam("near")String near) {
  	return new Location();
  }
  /**
  * Descr: A distance quantity to limit the near search to locations within a specific distance

  Requires the near parameter to also be included
  * expr: position
  * Xpath: f:Location/f:position
  * Type: quantity
  * Code: neardistance
  */
  @GET
  @Path("position")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Location neardistance(@QueryParam("neardistance")String neardistance) {
  	return new Location();
  }
  /**
  * Descr: Searches for locations (typically bed/room) that have an operational status (e.g. contaminated, housekeeping)
  * expr: operationalStatus
  * Xpath: f:Location/f:operationalStatus
  * Type: token
  * Code: operationalstatus
  */
  @GET
  @Path("operationalStatus")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Location operationalstatus(@QueryParam("operationalstatus")String operationalstatus) {
  	return new Location();
  }
  /**
  * Descr: Searches for locations that are managed by the provided organization
  * expr: managingOrganization
  * Xpath: f:Location/f:managingOrganization
  * Type: reference
  * Code: organization
  */
  @GET
  @Path("managingOrganization")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Location organization() {
  	return new Location();
  }
  /**
  * Descr: A location of which this location is a part
  * expr: partOf
  * Xpath: f:Location/f:partOf
  * Type: reference
  * Code: partof
  */
  @GET
  @Path("partOf")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Location partof() {
  	return new Location();
  }
  /**
  * Descr: Searches for locations with a specific kind of status
  * expr: status
  * Xpath: f:Location/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Location status(@QueryParam("status")String status) {
  	return new Location();
  }
  /**
  * Descr: A code for the type of location
  * expr: type
  * Xpath: f:Location/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Location type(@QueryParam("type")String type) {
  	return new Location();
  }
}
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

import org.fhir.pojo.Organization;
import org.fhir.service.OrganizationService;

@Path("/Organization")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class OrganizationResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final OrganizationService service;

  @Inject
  public OrganizationResource(final OrganizationService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Organization create(Organization obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Organization update( Organization obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Organization find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Organization> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Organization> findWithLimit(@PathParam("max") String max) {
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
  * Descr: A server defined search that may match any of the string fields in the Address, including line, city, state, country, postalCode, and/or text
  * expr: active
  * Xpath: f:Organization/f:active
  * Type: token
  * Code: active
  */
  @GET
  @Path("active")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Organization active(@QueryParam("active")String active) {
  	return new Organization();
  }
  /**
  * Descr: A (part of the) address of the organization
  * expr: address
  * Xpath: f:Organization/f:address
  * Type: string
  * Code: address
  */
  @GET
  @Path("address")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Organization address(@QueryParam("address")String address) {
  	return new Organization();
  }
  /**
  * Descr: A city specified in an address
  * expr: city
  * Xpath: f:Organization/f:address/f:city
  * Type: string
  * Code: addresscity
  */
  @GET
  @Path("city")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Organization addresscity(@QueryParam("addresscity")String addresscity) {
  	return new Organization();
  }
  /**
  * Descr: A country specified in an address
  * expr: country
  * Xpath: f:Organization/f:address/f:country
  * Type: string
  * Code: addresscountry
  */
  @GET
  @Path("country")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Organization addresscountry(@QueryParam("addresscountry")String addresscountry) {
  	return new Organization();
  }
  /**
  * Descr: A postal code specified in an address
  * expr: postalCode
  * Xpath: f:Organization/f:address/f:postalCode
  * Type: string
  * Code: addresspostalcode
  */
  @GET
  @Path("postalCode")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Organization addresspostalcode(@QueryParam("addresspostalcode")String addresspostalcode) {
  	return new Organization();
  }
  /**
  * Descr: A state specified in an address
  * expr: state
  * Xpath: f:Organization/f:address/f:state
  * Type: string
  * Code: addressstate
  */
  @GET
  @Path("state")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Organization addressstate(@QueryParam("addressstate")String addressstate) {
  	return new Organization();
  }
  /**
  * Descr: A use code specified in an address
  * expr: use
  * Xpath: f:Organization/f:address/f:use
  * Type: token
  * Code: addressuse
  */
  @GET
  @Path("use")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Organization addressuse(@QueryParam("addressuse")String addressuse) {
  	return new Organization();
  }
  /**
  * Descr: Technical endpoints providing access to services operated for the organization
  * expr: endpoint
  * Xpath: f:Organization/f:endpoint
  * Type: reference
  * Code: endpoint
  */
  @GET
  @Path("endpoint")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Organization endpoint() {
  	return new Organization();
  }
  /**
  * Descr: Any identifier for the organization (not the accreditation issuer's identifier)
  * expr: identifier
  * Xpath: f:Organization/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Organization identifier(@QueryParam("identifier")String identifier) {
  	return new Organization();
  }
  /**
  * Descr: A portion of the organization's name or alias
  * expr: alias
  * Xpath: f:Organization/f:name | f:Organization/f:alias
  * Type: string
  * Code: name
  */
  @GET
  @Path("alias")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Organization name(@QueryParam("name")String name) {
  	return new Organization();
  }
  /**
  * Descr: An organization of which this organization forms a part
  * expr: partOf
  * Xpath: f:Organization/f:partOf
  * Type: reference
  * Code: partof
  */
  @GET
  @Path("partOf")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Organization partof() {
  	return new Organization();
  }
  /**
  * Descr: A portion of the organization's name using some kind of phonetic matching algorithm
  * expr: name
  * Xpath: f:Organization/f:name
  * Type: string
  * Code: phonetic
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Organization phonetic(@QueryParam("phonetic")String phonetic) {
  	return new Organization();
  }
  /**
  * Descr: A code for the type of organization
  * expr: type
  * Xpath: f:Organization/f:type
  * Type: token
  * Code: type
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Organization type(@QueryParam("type")String type) {
  	return new Organization();
  }
}
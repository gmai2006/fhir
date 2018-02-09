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

import org.fhir.pojo.Person;
import org.fhir.service.PersonService;

@Path("/Person")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class PersonResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final PersonService service;

  @Inject
  public PersonResource(final PersonService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public Person create(Person obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public Person update( Person obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public Person find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<Person> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<Person> findWithLimit(@PathParam("max") String max) {
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
  * Descr: A person Identifier
  * expr: identifier
  * Xpath: f:Person/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Person identifier(@QueryParam("identifier")String identifier) {
  	return new Person();
  }
  /**
  * Descr: Any link has this Patient, Person, RelatedPerson or Practitioner reference
  * expr: target
  * Xpath: f:Person/f:link/f:target
  * Type: reference
  * Code: link
  */
  @GET
  @Path("target")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Person link() {
  	return new Person();
  }
  /**
  * Descr: A server defined search that may match any of the string fields in the HumanName, including family, give, prefix, suffix, suffix, and/or text
  * expr: name
  * Xpath: f:Person/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Person name(@QueryParam("name")String name) {
  	return new Person();
  }
  /**
  * Descr: The organization at which this person record is being managed
  * expr: managingOrganization
  * Xpath: f:Person/f:managingOrganization
  * Type: reference
  * Code: organization
  */
  @GET
  @Path("managingOrganization")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Person organization() {
  	return new Person();
  }
  /**
  * Descr: The Person links to this Patient
  * expr: target
  * Xpath: f:Person/f:link/f:target
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("target")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Person patient() {
  	return new Person();
  }
  /**
  * Descr: The Person links to this Practitioner
  * expr: target
  * Xpath: f:Person/f:link/f:target
  * Type: reference
  * Code: practitioner
  */
  @GET
  @Path("target")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Person practitioner() {
  	return new Person();
  }
  /**
  * Descr: The Person links to this RelatedPerson
  * expr: target
  * Xpath: f:Person/f:link/f:target
  * Type: reference
  * Code: relatedperson
  */
  @GET
  @Path("target")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public Person relatedperson() {
  	return new Person();
  }
}
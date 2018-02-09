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

import org.fhir.pojo.RelatedPerson;
import org.fhir.service.RelatedPersonService;

@Path("/RelatedPerson")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class RelatedPersonResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final RelatedPersonService service;

  @Inject
  public RelatedPersonResource(final RelatedPersonService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public RelatedPerson create(RelatedPerson obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public RelatedPerson update( RelatedPerson obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public RelatedPerson find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<RelatedPerson> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<RelatedPerson> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Multiple Resources: 

  * [RelatedPerson](relatedperson.html): A server defined search that may match any of the string fields in the Address, including line, city, state, country, postalCode, and/or text
  * [Practitioner](practitioner.html): A server defined search that may match any of the string fields in the Address, including line, city, state, country, postalCode, and/or text
  * [Person](person.html): A server defined search that may match any of the string fields in the Address, including line, city, state, country, postalCode, and/or text
  * [Patient](patient.html): A server defined search that may match any of the string fields in the Address, including line, city, state, country, postalCode, and/or text

  * expr: address
  * Xpath: f:RelatedPerson/f:address | f:Practitioner/f:address | f:Person/f:address | f:Patient/f:address
  * Type: string
  * Code: address
  */
  @GET
  @Path("address")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RelatedPerson address(@QueryParam("address")String address) {
  	return new RelatedPerson();
  }
  /**
  * Descr: Multiple Resources: 

  * [RelatedPerson](relatedperson.html): A city specified in an address
  * [Practitioner](practitioner.html): A city specified in an address
  * [Person](person.html): A city specified in an address
  * [Patient](patient.html): A city specified in an address

  * expr: city
  * Xpath: f:RelatedPerson/f:address/f:city | f:Practitioner/f:address/f:city | f:Person/f:address/f:city | f:Patient/f:address/f:city
  * Type: string
  * Code: addresscity
  */
  @GET
  @Path("city")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RelatedPerson addresscity(@QueryParam("addresscity")String addresscity) {
  	return new RelatedPerson();
  }
  /**
  * Descr: Multiple Resources: 

  * [RelatedPerson](relatedperson.html): A country specified in an address
  * [Practitioner](practitioner.html): A country specified in an address
  * [Person](person.html): A country specified in an address
  * [Patient](patient.html): A country specified in an address

  * expr: country
  * Xpath: f:RelatedPerson/f:address/f:country | f:Practitioner/f:address/f:country | f:Person/f:address/f:country | f:Patient/f:address/f:country
  * Type: string
  * Code: addresscountry
  */
  @GET
  @Path("country")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RelatedPerson addresscountry(@QueryParam("addresscountry")String addresscountry) {
  	return new RelatedPerson();
  }
  /**
  * Descr: Multiple Resources: 

  * [RelatedPerson](relatedperson.html): A postal code specified in an address
  * [Practitioner](practitioner.html): A postalCode specified in an address
  * [Person](person.html): A postal code specified in an address
  * [Patient](patient.html): A postalCode specified in an address

  * expr: postalCode
  * Xpath: f:RelatedPerson/f:address/f:postalCode | f:Practitioner/f:address/f:postalCode | f:Person/f:address/f:postalCode | f:Patient/f:address/f:postalCode
  * Type: string
  * Code: addresspostalcode
  */
  @GET
  @Path("postalCode")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RelatedPerson addresspostalcode(@QueryParam("addresspostalcode")String addresspostalcode) {
  	return new RelatedPerson();
  }
  /**
  * Descr: Multiple Resources: 

  * [RelatedPerson](relatedperson.html): A state specified in an address
  * [Practitioner](practitioner.html): A state specified in an address
  * [Person](person.html): A state specified in an address
  * [Patient](patient.html): A state specified in an address

  * expr: state
  * Xpath: f:RelatedPerson/f:address/f:state | f:Practitioner/f:address/f:state | f:Person/f:address/f:state | f:Patient/f:address/f:state
  * Type: string
  * Code: addressstate
  */
  @GET
  @Path("state")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RelatedPerson addressstate(@QueryParam("addressstate")String addressstate) {
  	return new RelatedPerson();
  }
  /**
  * Descr: Multiple Resources: 

  * [RelatedPerson](relatedperson.html): A use code specified in an address
  * [Practitioner](practitioner.html): A use code specified in an address
  * [Person](person.html): A use code specified in an address
  * [Patient](patient.html): A use code specified in an address

  * expr: use
  * Xpath: f:RelatedPerson/f:address/f:use | f:Practitioner/f:address/f:use | f:Person/f:address/f:use | f:Patient/f:address/f:use
  * Type: token
  * Code: addressuse
  */
  @GET
  @Path("use")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RelatedPerson addressuse(@QueryParam("addressuse")String addressuse) {
  	return new RelatedPerson();
  }
  /**
  * Descr: Multiple Resources: 

  * [RelatedPerson](relatedperson.html): The Related Person's date of birth
  * [Person](person.html): The person's date of birth
  * [Patient](patient.html): The patient's date of birth

  * expr: birthDate
  * Xpath: f:RelatedPerson/f:birthDate | f:Person/f:birthDate | f:Patient/f:birthDate
  * Type: date
  * Code: birthdate
  */
  @GET
  @Path("birthDate")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RelatedPerson birthdate(@QueryParam("birthdate")String birthdate) {
  	return new RelatedPerson();
  }
  /**
  * Descr: Multiple Resources: 

  * [RelatedPerson](relatedperson.html): Gender of the related person
  * [Practitioner](practitioner.html): Gender of the practitioner
  * [Person](person.html): The gender of the person
  * [Patient](patient.html): Gender of the patient

  * expr: gender
  * Xpath: f:RelatedPerson/f:gender | f:Practitioner/f:gender | f:Person/f:gender | f:Patient/f:gender
  * Type: token
  * Code: gender
  */
  @GET
  @Path("gender")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RelatedPerson gender(@QueryParam("gender")String gender) {
  	return new RelatedPerson();
  }
  /**
  * Descr: Multiple Resources: 

  * [RelatedPerson](relatedperson.html): A portion of name using some kind of phonetic matching algorithm
  * [Practitioner](practitioner.html): A portion of either family or given name using some kind of phonetic matching algorithm
  * [Person](person.html): A portion of name using some kind of phonetic matching algorithm
  * [Patient](patient.html): A portion of either family or given name using some kind of phonetic matching algorithm

  * expr: name
  * Xpath: f:RelatedPerson/f:name | f:Practitioner/f:name | f:Person/f:name | f:Patient/f:name
  * Type: string
  * Code: phonetic
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RelatedPerson phonetic(@QueryParam("phonetic")String phonetic) {
  	return new RelatedPerson();
  }
  /**
  * Descr: Indicates if the related person record is active
  * expr: active
  * Xpath: f:RelatedPerson/f:active
  * Type: token
  * Code: active
  */
  @GET
  @Path("active")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RelatedPerson active(@QueryParam("active")String active) {
  	return new RelatedPerson();
  }
  /**
  * Descr: An Identifier of the RelatedPerson
  * expr: identifier
  * Xpath: f:RelatedPerson/f:identifier
  * Type: token
  * Code: identifier
  */
  @GET
  @Path("identifier")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RelatedPerson identifier(@QueryParam("identifier")String identifier) {
  	return new RelatedPerson();
  }
  /**
  * Descr: A server defined search that may match any of the string fields in the HumanName, including family, give, prefix, suffix, suffix, and/or text
  * expr: name
  * Xpath: f:RelatedPerson/f:name
  * Type: string
  * Code: name
  */
  @GET
  @Path("name")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RelatedPerson name(@QueryParam("name")String name) {
  	return new RelatedPerson();
  }
  /**
  * Descr: The patient this related person is related to
  * expr: patient
  * Xpath: f:RelatedPerson/f:patient
  * Type: reference
  * Code: patient
  */
  @GET
  @Path("patient")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public RelatedPerson patient() {
  	return new RelatedPerson();
  }
}
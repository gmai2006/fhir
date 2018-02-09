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

import org.fhir.pojo.NutritionOrder;
import org.fhir.service.NutritionOrderService;

@Path("/NutritionOrder")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class NutritionOrderResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final NutritionOrderService service;

  @Inject
  public NutritionOrderResource(final NutritionOrderService service) {
  	requireNonNull(service);
    this.service = service;
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public NutritionOrder create(NutritionOrder obj) {
  	return this.service.create(obj);
  }

  @Consumes(MediaType.APPLICATION_JSON)
  @POST
  public NutritionOrder update( NutritionOrder obj) {
  	return this.service.update(obj);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public NutritionOrder find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("selectAll")
  public List<NutritionOrder> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("/select/{max}")
  public List<NutritionOrder> findWithLimit(@PathParam("max") String max) {
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
  * Descr: Type of module component to add to the feeding
  * expr: additiveType
  * Xpath: f:NutritionOrder/f:enteralFormula/f:additiveType
  * Type: token
  * Code: additive
  */
  @GET
  @Path("additiveType")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NutritionOrder additive(@QueryParam("additive")String additive) {
  	return new NutritionOrder();
  }
  /**
  * Descr: Return nutrition orders requested on this date
  * expr: dateTime
  * Xpath: f:NutritionOrder/f:dateTime
  * Type: date
  * Code: datetime
  */
  @GET
  @Path("dateTime")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NutritionOrder datetime(@QueryParam("datetime")String datetime) {
  	return new NutritionOrder();
  }
  /**
  * Descr: Type of enteral or infant formula
  * expr: baseFormulaType
  * Xpath: f:NutritionOrder/f:enteralFormula/f:baseFormulaType
  * Type: token
  * Code: formula
  */
  @GET
  @Path("baseFormulaType")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NutritionOrder formula(@QueryParam("formula")String formula) {
  	return new NutritionOrder();
  }
  /**
  * Descr: Type of diet that can be consumed orally (i.e., take via the mouth).
  * expr: type
  * Xpath: f:NutritionOrder/f:oralDiet/f:type
  * Type: token
  * Code: oraldiet
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NutritionOrder oraldiet(@QueryParam("oraldiet")String oraldiet) {
  	return new NutritionOrder();
  }
  /**
  * Descr: The identify of the provider who placed the nutrition order
  * expr: orderer
  * Xpath: f:NutritionOrder/f:orderer
  * Type: reference
  * Code: provider
  */
  @GET
  @Path("orderer")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NutritionOrder provider() {
  	return new NutritionOrder();
  }
  /**
  * Descr: Status of the nutrition order.
  * expr: status
  * Xpath: f:NutritionOrder/f:status
  * Type: token
  * Code: status
  */
  @GET
  @Path("status")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NutritionOrder status(@QueryParam("status")String status) {
  	return new NutritionOrder();
  }
  /**
  * Descr: Type of supplement product requested
  * expr: type
  * Xpath: f:NutritionOrder/f:supplement/f:type
  * Type: token
  * Code: supplement
  */
  @GET
  @Path("type")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public NutritionOrder supplement(@QueryParam("supplement")String supplement) {
  	return new NutritionOrder();
  }
}
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

import org.fhir.pojo.DeviceUseStatement;
import org.fhir.service.DeviceUseStatementService;
import org.fhir.utils.QueryParser;
import org.fhir.utils.QueryBuilder;

@Path("/DeviceUseStatement")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
/**
 * Auto generated RESTful class
 */
public class DeviceUseStatementResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final DeviceUseStatementService service;

  @Inject
  public DeviceUseStatementResource(final DeviceUseStatementService service) {
  	requireNonNull(service);
    this.service = service;
  }

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public DeviceUseStatement create(DeviceUseStatement obj) {
		return this.service.create(obj);
	}

	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public DeviceUseStatement update( DeviceUseStatement obj) {
		return this.service.update(obj);
	}


  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("{id}")
  public DeviceUseStatement find(@PathParam("id") String id) {
  	return this.service.find(id);
  }

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("")
  public List<DeviceUseStatement> findAll() {
  	return this.service.selectAll();
  }

  @GET
  @Path("select/{max}")
  public List<DeviceUseStatement> findWithLimit(@PathParam("max") String max) {
  	Integer input = null;
  	try {
  		input = Integer.valueOf(max);
  	} catch (Exception ex) {
  		throw new WebApplicationException(Response.Status.BAD_REQUEST);
  	}
    return service.select(input);
  }

  @GET
  @Path("")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public List<DeviceUseStatement> findByField(@QueryParam("parameter")String parameter) {
  	java.util.Map<String, String> params = QueryParser.parse(parameter, VALID_FIELDS);
  	return this.service.findByField(new QueryBuilder(params));
  }

  /**
  * Descr: Search by device
  * Type: reference
  */
  @GET
  @Path("device")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public List<DeviceUseStatement> device(@QueryParam("parameter")String parameter) {
  	java.util.Map<String, String> params = QueryParser.parse(parameter, VALID_FIELDS);
  	return this.service.findByDevice(new QueryBuilder(params));
  }
  /**
  * Descr: Search by subject
  * Type: reference
  */
  @GET
  @Path("subject")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
  public List<DeviceUseStatement> subject(@QueryParam("parameter")String parameter) {
  	java.util.Map<String, String> params = QueryParser.parse(parameter, VALID_FIELDS);
  	return this.service.findBySubject(new QueryBuilder(params));
  }

  private static final String VALID_FIELDS = "device|identifier|subject";
}
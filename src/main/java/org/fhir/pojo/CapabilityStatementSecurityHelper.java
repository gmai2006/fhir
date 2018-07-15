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
package org.fhir.pojo;
import org.fhir.entity.CapabilityStatementSecurityModel;
import com.google.gson.GsonBuilder;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class CapabilityStatementSecurityHelper {
	public static java.util.List<CapabilityStatementSecurity> fromArray2Array(java.util.List<CapabilityStatementSecurityModel> list) {
    return
    		list.stream()
    		.map(x -> new CapabilityStatementSecurity(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static CapabilityStatementSecurity fromArray2Object(java.util.List<CapabilityStatementSecurityModel> list) {
    return new CapabilityStatementSecurity(list.get(0));
  }

  public static java.util.List<CapabilityStatementSecurityModel> toModel(CapabilityStatementSecurity reference, String parentId) {
  	CapabilityStatementSecurityModel model = new CapabilityStatementSecurityModel(reference, parentId);
  	return java.util.Arrays.asList(new CapabilityStatementSecurityModel[] { model });
  }

  public static java.util.List<CapabilityStatementSecurityModel> toModelFromArray(java.util.List<CapabilityStatementSecurity> list, String parentId) {
    return (java.util.List<CapabilityStatementSecurityModel>)list.stream()
    	.map(x -> new CapabilityStatementSecurityModel(x, parentId))
      .collect(java.util.stream.Collectors.toList());
  }
  public static CapabilityStatementSecurity fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CapabilityStatementSecurity.class);
  }
}
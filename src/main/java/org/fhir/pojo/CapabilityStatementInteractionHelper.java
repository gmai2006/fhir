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
import org.fhir.entity.CapabilityStatementInteractionModel;
import com.google.gson.GsonBuilder;

public class CapabilityStatementInteractionHelper {
	public static java.util.List<CapabilityStatementInteraction> fromArray2Array(java.util.List<CapabilityStatementInteractionModel> list) {
    return
    		list.stream()
    		.map(x -> new CapabilityStatementInteraction(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static CapabilityStatementInteraction fromArray2Object(java.util.List<CapabilityStatementInteractionModel> list) {
    return new CapabilityStatementInteraction(list.get(0));
  }

  public static java.util.List<CapabilityStatementInteractionModel> toModel(CapabilityStatementInteraction reference, String parentId) {
  	CapabilityStatementInteractionModel model = new CapabilityStatementInteractionModel(reference, parentId);
  	return java.util.Arrays.asList(new CapabilityStatementInteractionModel[] { model });
  }

  public static java.util.List<CapabilityStatementInteractionModel> toModelFromArray(java.util.List<CapabilityStatementInteraction> list, String parentId) {
    return (java.util.List<CapabilityStatementInteractionModel>)list.stream()
    	.map(x -> new CapabilityStatementInteractionModel(x, parentId))
      .collect(java.util.stream.Collectors.toList());
  }
  public static CapabilityStatementInteraction fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CapabilityStatementInteraction.class);
  }
}
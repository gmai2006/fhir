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
import org.fhir.entity.DataRequirementModel;
import com.google.gson.GsonBuilder;

public class DataRequirementHelper {
	public static java.util.List<DataRequirement> fromArray2Array(java.util.List<DataRequirementModel> list) {
    return
    		list.stream()
    		.map(x -> new DataRequirement(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static DataRequirement fromArray2Object(java.util.List<DataRequirementModel> list) {
    return new DataRequirement(list.get(0));
  }

  public static java.util.List<DataRequirementModel> toModel(DataRequirement reference, String parentId) {
  	DataRequirementModel model = new DataRequirementModel(reference, parentId);
  	return java.util.Arrays.asList(new DataRequirementModel[] { model });
  }

  public static java.util.List<DataRequirementModel> toModelFromArray(java.util.List<DataRequirement> list, String parentId) {
    return (java.util.List<DataRequirementModel>)list.stream()
    	.map(x -> new DataRequirementModel(x, parentId))
      .collect(java.util.stream.Collectors.toList());
  }
  public static DataRequirement fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, DataRequirement.class);
  }
}
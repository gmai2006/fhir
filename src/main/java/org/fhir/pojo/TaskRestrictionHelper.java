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
import org.fhir.entity.TaskRestrictionModel;
import com.google.gson.GsonBuilder;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class TaskRestrictionHelper {
	public static java.util.List<TaskRestriction> fromArray2Array(java.util.List<TaskRestrictionModel> list) {
    return
    		list.stream()
    		.map(x -> new TaskRestriction(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static TaskRestriction fromArray2Object(java.util.List<TaskRestrictionModel> list) {
    return new TaskRestriction(list.get(0));
  }

  public static java.util.List<TaskRestrictionModel> toModel(TaskRestriction reference, String parentId) {
  	TaskRestrictionModel model = new TaskRestrictionModel(reference, parentId);
  	return java.util.Arrays.asList(new TaskRestrictionModel[] { model });
  }

  public static java.util.List<TaskRestrictionModel> toModelFromArray(java.util.List<TaskRestriction> list, String parentId) {
    return (java.util.List<TaskRestrictionModel>)list.stream()
    	.map(x -> new TaskRestrictionModel(x, parentId))
      .collect(java.util.stream.Collectors.toList());
  }
  public static TaskRestriction fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, TaskRestriction.class);
  }
}
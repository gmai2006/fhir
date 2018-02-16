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
import org.fhir.entity.SpecimenContainerModel;
import com.google.gson.GsonBuilder;

public class SpecimenContainerHelper {
	public static java.util.List<SpecimenContainer> fromArray2Array(java.util.List<SpecimenContainerModel> list) {
    return
    		list.stream()
    		.map(x -> new SpecimenContainer(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static SpecimenContainer fromArray2Object(java.util.List<SpecimenContainerModel> list) {
    return new SpecimenContainer(list.get(0));
  }

  public static java.util.List<SpecimenContainerModel> toModel(SpecimenContainer reference, String parentId) {
  	SpecimenContainerModel model = new SpecimenContainerModel(reference, parentId);
  	return java.util.Arrays.asList(new SpecimenContainerModel[] { model });
  }

  public static java.util.List<SpecimenContainerModel> toModelFromArray(java.util.List<SpecimenContainer> list, String parentId) {
    return (java.util.List<SpecimenContainerModel>)list.stream()
    	.map(x -> new SpecimenContainerModel(x, parentId))
      .collect(java.util.stream.Collectors.toList());
  }
  public static SpecimenContainer fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, SpecimenContainer.class);
  }
}
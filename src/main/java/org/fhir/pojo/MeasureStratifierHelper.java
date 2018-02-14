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
import org.fhir.entity.MeasureStratifierModel;
import com.google.gson.GsonBuilder;

public class MeasureStratifierHelper {
	public static java.util.List<MeasureStratifier> fromArray2Array(java.util.List<MeasureStratifierModel> list) {
    return
    		list.stream()
    		.map(x -> new MeasureStratifier(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static MeasureStratifier fromArray2Object(java.util.List<MeasureStratifierModel> list) {
    return new MeasureStratifier(list.get(0));
  }

  public static java.util.List<MeasureStratifierModel> toModel(MeasureStratifier reference, String parentId) {
  	MeasureStratifierModel model = new MeasureStratifierModel(reference, parentId);
  	return java.util.Arrays.asList(new MeasureStratifierModel[] { model });
  }

  public static java.util.List<MeasureStratifierModel> toModelFromArray(java.util.List<MeasureStratifier> list, String parentId) {
    return (java.util.List<MeasureStratifierModel>)list.stream()
    	.map(x -> new MeasureStratifierModel(x, parentId))
      .collect(java.util.stream.Collectors.toList());
  }
  public static MeasureStratifier fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, MeasureStratifier.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(MeasureStratifier o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<MeasureStratifier> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
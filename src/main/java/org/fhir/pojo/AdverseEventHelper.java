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
import org.fhir.entity.AdverseEventModel;
import com.google.gson.GsonBuilder;

public class AdverseEventHelper {
	public static java.util.List<AdverseEvent> fromArray2Array(java.util.List<AdverseEventModel> list) {
    return
    		list.stream()
    		.map(x -> new AdverseEvent(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static AdverseEvent fromArray2Object(java.util.List<AdverseEventModel> list) {
    return new AdverseEvent(list.get(0));
  }

  public static java.util.List<AdverseEventModel> toModel(AdverseEvent reference) {
  	AdverseEventModel model = new AdverseEventModel(reference);
  	return java.util.Arrays.asList(new AdverseEventModel[] { model });
  }

  public static java.util.List<AdverseEventModel> toModelFromArray(java.util.List<AdverseEvent> list) {
    return (java.util.List<AdverseEventModel>)list.stream()
    	.map(x -> new AdverseEventModel(x))
      .collect(java.util.stream.Collectors.toList());
  }
  public static AdverseEvent fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, AdverseEvent.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(AdverseEvent o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<AdverseEvent> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
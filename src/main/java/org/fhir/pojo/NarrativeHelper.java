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
import org.fhir.entity.NarrativeModel;
import com.google.gson.GsonBuilder;

public class NarrativeHelper {
	public static java.util.List<Narrative> fromArray2Array(java.util.List<NarrativeModel> list) {
    return
    		list.stream()
    		.map(x -> new Narrative(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static Narrative fromArray2Object(java.util.List<NarrativeModel> list) {
    return new Narrative(list.get(0));
  }

  public static java.util.List<NarrativeModel> toModel(Narrative reference, String parentId) {
  	NarrativeModel model = new NarrativeModel(reference, parentId);
  	return java.util.Arrays.asList(new NarrativeModel[] { model });
  }

  public static java.util.List<NarrativeModel> toModelFromArray(java.util.List<Narrative> list, String parentId) {
    return (java.util.List<NarrativeModel>)list.stream()
    	.map(x -> new NarrativeModel(x, parentId))
      .collect(java.util.stream.Collectors.toList());
  }
  public static Narrative fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Narrative.class);
  }
}
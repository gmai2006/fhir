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
import org.fhir.entity.FHIRListModel;
import com.google.gson.GsonBuilder;

public class FHIRListHelper {
	public static java.util.List<FHIRList> fromArray2Array(java.util.List<FHIRListModel> list) {
    return
    		list.stream()
    		.map(x -> new FHIRList(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static FHIRList fromArray2Object(java.util.List<FHIRListModel> list) {
    return new FHIRList(list.get(0));
  }

  public static java.util.List<FHIRListModel> toModel(FHIRList reference) {
  	FHIRListModel model = new FHIRListModel(reference);
  	return java.util.Arrays.asList(new FHIRListModel[] { model });
  }

  public static java.util.List<FHIRListModel> toModelFromArray(java.util.List<FHIRList> list) {
    return (java.util.List<FHIRListModel>)list.stream()
    	.map(x -> new FHIRListModel(x))
      .collect(java.util.stream.Collectors.toList());
  }
  public static FHIRList fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, FHIRList.class);
  }
}
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
import org.fhir.entity.ProcessResponseModel;
import com.google.gson.GsonBuilder;

public class ProcessResponseHelper {
	public static java.util.List<ProcessResponse> fromArray2Array(java.util.List<ProcessResponseModel> list) {
    return
    		list.stream()
    		.map(x -> new ProcessResponse(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static ProcessResponse fromArray2Object(java.util.List<ProcessResponseModel> list) {
    return new ProcessResponse(list.get(0));
  }

  public static java.util.List<ProcessResponseModel> toModel(ProcessResponse reference) {
  	ProcessResponseModel model = new ProcessResponseModel(reference);
  	return java.util.Arrays.asList(new ProcessResponseModel[] { model });
  }

  public static java.util.List<ProcessResponseModel> toModelFromArray(java.util.List<ProcessResponse> list) {
    return (java.util.List<ProcessResponseModel>)list.stream()
    	.map(x -> new ProcessResponseModel(x))
      .collect(java.util.stream.Collectors.toList());
  }
  public static ProcessResponse fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ProcessResponse.class);
  }
}
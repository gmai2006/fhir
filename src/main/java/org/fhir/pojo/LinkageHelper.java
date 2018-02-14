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
import org.fhir.entity.LinkageModel;
import com.google.gson.GsonBuilder;

public class LinkageHelper {
	public static java.util.List<Linkage> fromArray2Array(java.util.List<LinkageModel> list) {
    return
    		list.stream()
    		.map(x -> new Linkage(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static Linkage fromArray2Object(java.util.List<LinkageModel> list) {
    return new Linkage(list.get(0));
  }

  public static java.util.List<LinkageModel> toModel(Linkage reference) {
  	LinkageModel model = new LinkageModel(reference);
  	return java.util.Arrays.asList(new LinkageModel[] { model });
  }

  public static java.util.List<LinkageModel> toModelFromArray(java.util.List<Linkage> list) {
    return (java.util.List<LinkageModel>)list.stream()
    	.map(x -> new LinkageModel(x))
      .collect(java.util.stream.Collectors.toList());
  }
  public static Linkage fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Linkage.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Linkage o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Linkage> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
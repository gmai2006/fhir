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
import org.fhir.entity.ImagingManifestModel;
import com.google.gson.GsonBuilder;

public class ImagingManifestHelper {
	public static java.util.List<ImagingManifest> fromArray2Array(java.util.List<ImagingManifestModel> list) {
    return
    		list.stream()
    		.map(x -> new ImagingManifest(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static ImagingManifest fromArray2Object(java.util.List<ImagingManifestModel> list) {
    return new ImagingManifest(list.get(0));
  }

  public static java.util.List<ImagingManifestModel> toModel(ImagingManifest reference) {
  	ImagingManifestModel model = new ImagingManifestModel(reference);
  	return java.util.Arrays.asList(new ImagingManifestModel[] { model });
  }

  public static java.util.List<ImagingManifestModel> toModelFromArray(java.util.List<ImagingManifest> list) {
    return (java.util.List<ImagingManifestModel>)list.stream()
    	.map(x -> new ImagingManifestModel(x))
      .collect(java.util.stream.Collectors.toList());
  }
  public static ImagingManifest fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ImagingManifest.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ImagingManifest o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ImagingManifest> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
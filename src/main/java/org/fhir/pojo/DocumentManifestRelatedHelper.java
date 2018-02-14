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
import org.fhir.entity.DocumentManifestRelatedModel;
import com.google.gson.GsonBuilder;

public class DocumentManifestRelatedHelper {
	public static java.util.List<DocumentManifestRelated> fromArray2Array(java.util.List<DocumentManifestRelatedModel> list) {
    return
    		list.stream()
    		.map(x -> new DocumentManifestRelated(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static DocumentManifestRelated fromArray2Object(java.util.List<DocumentManifestRelatedModel> list) {
    return new DocumentManifestRelated(list.get(0));
  }

  public static java.util.List<DocumentManifestRelatedModel> toModel(DocumentManifestRelated reference, String parentId) {
  	DocumentManifestRelatedModel model = new DocumentManifestRelatedModel(reference, parentId);
  	return java.util.Arrays.asList(new DocumentManifestRelatedModel[] { model });
  }

  public static java.util.List<DocumentManifestRelatedModel> toModelFromArray(java.util.List<DocumentManifestRelated> list, String parentId) {
    return (java.util.List<DocumentManifestRelatedModel>)list.stream()
    	.map(x -> new DocumentManifestRelatedModel(x, parentId))
      .collect(java.util.stream.Collectors.toList());
  }
  public static DocumentManifestRelated fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, DocumentManifestRelated.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(DocumentManifestRelated o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<DocumentManifestRelated> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
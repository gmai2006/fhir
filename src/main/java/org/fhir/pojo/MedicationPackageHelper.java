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
import org.fhir.entity.MedicationPackageModel;
import com.google.gson.GsonBuilder;

public class MedicationPackageHelper {
	public static java.util.List<MedicationPackage> fromArray2Array(java.util.List<MedicationPackageModel> list) {
    return
    		list.stream()
    		.map(x -> new MedicationPackage(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static MedicationPackage fromArray2Object(java.util.List<MedicationPackageModel> list) {
    return new MedicationPackage(list.get(0));
  }

  public static java.util.List<MedicationPackageModel> toModel(MedicationPackage reference, String parentId) {
  	MedicationPackageModel model = new MedicationPackageModel(reference, parentId);
  	return java.util.Arrays.asList(new MedicationPackageModel[] { model });
  }

  public static java.util.List<MedicationPackageModel> toModelFromArray(java.util.List<MedicationPackage> list, String parentId) {
    return (java.util.List<MedicationPackageModel>)list.stream()
    	.map(x -> new MedicationPackageModel(x, parentId))
      .collect(java.util.stream.Collectors.toList());
  }
  public static MedicationPackage fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, MedicationPackage.class);
  }
}
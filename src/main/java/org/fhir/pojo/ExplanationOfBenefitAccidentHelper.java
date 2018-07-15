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
import org.fhir.entity.ExplanationOfBenefitAccidentModel;
import com.google.gson.GsonBuilder;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class ExplanationOfBenefitAccidentHelper {
	public static java.util.List<ExplanationOfBenefitAccident> fromArray2Array(java.util.List<ExplanationOfBenefitAccidentModel> list) {
    return
    		list.stream()
    		.map(x -> new ExplanationOfBenefitAccident(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static ExplanationOfBenefitAccident fromArray2Object(java.util.List<ExplanationOfBenefitAccidentModel> list) {
    return new ExplanationOfBenefitAccident(list.get(0));
  }

  public static java.util.List<ExplanationOfBenefitAccidentModel> toModel(ExplanationOfBenefitAccident reference, String parentId) {
  	ExplanationOfBenefitAccidentModel model = new ExplanationOfBenefitAccidentModel(reference, parentId);
  	return java.util.Arrays.asList(new ExplanationOfBenefitAccidentModel[] { model });
  }

  public static java.util.List<ExplanationOfBenefitAccidentModel> toModelFromArray(java.util.List<ExplanationOfBenefitAccident> list, String parentId) {
    return (java.util.List<ExplanationOfBenefitAccidentModel>)list.stream()
    	.map(x -> new ExplanationOfBenefitAccidentModel(x, parentId))
      .collect(java.util.stream.Collectors.toList());
  }
  public static ExplanationOfBenefitAccident fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ExplanationOfBenefitAccident.class);
  }
}
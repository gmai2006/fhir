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
import org.fhir.entity.ExplanationOfBenefitFinancialModel;
import com.google.gson.GsonBuilder;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class ExplanationOfBenefitFinancialHelper {
	public static java.util.List<ExplanationOfBenefitFinancial> fromArray2Array(java.util.List<ExplanationOfBenefitFinancialModel> list) {
    return
    		list.stream()
    		.map(x -> new ExplanationOfBenefitFinancial(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static ExplanationOfBenefitFinancial fromArray2Object(java.util.List<ExplanationOfBenefitFinancialModel> list) {
    return new ExplanationOfBenefitFinancial(list.get(0));
  }

  public static java.util.List<ExplanationOfBenefitFinancialModel> toModel(ExplanationOfBenefitFinancial reference, String parentId) {
  	ExplanationOfBenefitFinancialModel model = new ExplanationOfBenefitFinancialModel(reference, parentId);
  	return java.util.Arrays.asList(new ExplanationOfBenefitFinancialModel[] { model });
  }

  public static java.util.List<ExplanationOfBenefitFinancialModel> toModelFromArray(java.util.List<ExplanationOfBenefitFinancial> list, String parentId) {
    return (java.util.List<ExplanationOfBenefitFinancialModel>)list.stream()
    	.map(x -> new ExplanationOfBenefitFinancialModel(x, parentId))
      .collect(java.util.stream.Collectors.toList());
  }
  public static ExplanationOfBenefitFinancial fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ExplanationOfBenefitFinancial.class);
  }
}
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
import org.fhir.entity.ExplanationOfBenefitDiagnosisModel;
import com.google.gson.GsonBuilder;

public class ExplanationOfBenefitDiagnosisHelper {
	public static java.util.List<ExplanationOfBenefitDiagnosis> fromArray2Array(java.util.List<ExplanationOfBenefitDiagnosisModel> list) {
    return
    		list.stream()
    		.map(x -> new ExplanationOfBenefitDiagnosis(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static ExplanationOfBenefitDiagnosis fromArray2Object(java.util.List<ExplanationOfBenefitDiagnosisModel> list) {
    return new ExplanationOfBenefitDiagnosis(list.get(0));
  }

  public static java.util.List<ExplanationOfBenefitDiagnosisModel> toModel(ExplanationOfBenefitDiagnosis reference, String parentId) {
  	ExplanationOfBenefitDiagnosisModel model = new ExplanationOfBenefitDiagnosisModel(reference, parentId);
  	return java.util.Arrays.asList(new ExplanationOfBenefitDiagnosisModel[] { model });
  }

  public static java.util.List<ExplanationOfBenefitDiagnosisModel> toModelFromArray(java.util.List<ExplanationOfBenefitDiagnosis> list, String parentId) {
    return (java.util.List<ExplanationOfBenefitDiagnosisModel>)list.stream()
    	.map(x -> new ExplanationOfBenefitDiagnosisModel(x, parentId))
      .collect(java.util.stream.Collectors.toList());
  }
  public static ExplanationOfBenefitDiagnosis fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ExplanationOfBenefitDiagnosis.class);
  }
}
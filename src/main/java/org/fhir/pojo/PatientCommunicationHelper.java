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
import org.fhir.entity.PatientCommunicationModel;
import com.google.gson.GsonBuilder;

public class PatientCommunicationHelper {
	public static java.util.List<PatientCommunication> fromArray2Array(java.util.List<PatientCommunicationModel> list) {
    return
    		list.stream()
    		.map(x -> new PatientCommunication(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static PatientCommunication fromArray2Object(java.util.List<PatientCommunicationModel> list) {
    return new PatientCommunication(list.get(0));
  }

  public static java.util.List<PatientCommunicationModel> toModel(PatientCommunication reference, String parentId) {
  	PatientCommunicationModel model = new PatientCommunicationModel(reference, parentId);
  	return java.util.Arrays.asList(new PatientCommunicationModel[] { model });
  }

  public static java.util.List<PatientCommunicationModel> toModelFromArray(java.util.List<PatientCommunication> list, String parentId) {
    return (java.util.List<PatientCommunicationModel>)list.stream()
    	.map(x -> new PatientCommunicationModel(x, parentId))
      .collect(java.util.stream.Collectors.toList());
  }
  public static PatientCommunication fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, PatientCommunication.class);
  }
}
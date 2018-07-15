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
import org.fhir.entity.ProcedureModel;
import com.google.gson.GsonBuilder;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class ProcedureHelper {
	public static java.util.List<Procedure> fromArray2Array(java.util.List<ProcedureModel> list) {
    return
    		list.stream()
    		.map(x -> new Procedure(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static Procedure fromArray2Object(java.util.List<ProcedureModel> list) {
    return new Procedure(list.get(0));
  }

  public static java.util.List<ProcedureModel> toModel(Procedure reference) {
  	ProcedureModel model = new ProcedureModel(reference);
  	return java.util.Arrays.asList(new ProcedureModel[] { model });
  }

  public static java.util.List<ProcedureModel> toModelFromArray(java.util.List<Procedure> list) {
    return (java.util.List<ProcedureModel>)list.stream()
    	.map(x -> new ProcedureModel(x))
      .collect(java.util.stream.Collectors.toList());
  }
  public static Procedure fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Procedure.class);
  }
}
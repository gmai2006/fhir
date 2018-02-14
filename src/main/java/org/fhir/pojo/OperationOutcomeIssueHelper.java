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
import org.fhir.entity.OperationOutcomeIssueModel;
import com.google.gson.GsonBuilder;

public class OperationOutcomeIssueHelper {
	public static java.util.List<OperationOutcomeIssue> fromArray2Array(java.util.List<OperationOutcomeIssueModel> list) {
    return
    		list.stream()
    		.map(x -> new OperationOutcomeIssue(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static OperationOutcomeIssue fromArray2Object(java.util.List<OperationOutcomeIssueModel> list) {
    return new OperationOutcomeIssue(list.get(0));
  }

  public static java.util.List<OperationOutcomeIssueModel> toModel(OperationOutcomeIssue reference, String parentId) {
  	OperationOutcomeIssueModel model = new OperationOutcomeIssueModel(reference, parentId);
  	return java.util.Arrays.asList(new OperationOutcomeIssueModel[] { model });
  }

  public static java.util.List<OperationOutcomeIssueModel> toModelFromArray(java.util.List<OperationOutcomeIssue> list, String parentId) {
    return (java.util.List<OperationOutcomeIssueModel>)list.stream()
    	.map(x -> new OperationOutcomeIssueModel(x, parentId))
      .collect(java.util.stream.Collectors.toList());
  }
  public static OperationOutcomeIssue fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, OperationOutcomeIssue.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(OperationOutcomeIssue o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<OperationOutcomeIssue> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
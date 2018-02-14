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
import org.fhir.entity.TestReportModel;
import com.google.gson.GsonBuilder;

public class TestReportHelper {
	public static java.util.List<TestReport> fromArray2Array(java.util.List<TestReportModel> list) {
    return
    		list.stream()
    		.map(x -> new TestReport(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static TestReport fromArray2Object(java.util.List<TestReportModel> list) {
    return new TestReport(list.get(0));
  }

  public static java.util.List<TestReportModel> toModel(TestReport reference) {
  	TestReportModel model = new TestReportModel(reference);
  	return java.util.Arrays.asList(new TestReportModel[] { model });
  }

  public static java.util.List<TestReportModel> toModelFromArray(java.util.List<TestReport> list) {
    return (java.util.List<TestReportModel>)list.stream()
    	.map(x -> new TestReportModel(x))
      .collect(java.util.stream.Collectors.toList());
  }
  public static TestReport fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, TestReport.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(TestReport o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<TestReport> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
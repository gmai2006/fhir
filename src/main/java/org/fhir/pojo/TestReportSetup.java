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
import org.fhir.entity.TestReportSetupModel;
import com.google.gson.GsonBuilder;

/**
* "A summary of information based on the results of executing a TestScript."
*/
public class TestReportSetup  extends BackboneElement  {
  /**
  * Description: "Action would contain either an operation or an assertion."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<TestReportAction> action = new java.util.ArrayList<>();

  public TestReportSetup() {
  }

  public TestReportSetup(TestReportSetupModel o) {
    this.id = o.getId();
    if (null != o.getAction() && !o.getAction().isEmpty()) {
    	this.action = TestReportActionHelper.fromArray2Array(o.getAction());
    }
  }

  public void setAction( java.util.List<TestReportAction> value) {
    this.action = value;
  }
  public java.util.List<TestReportAction> getAction() {
    return this.action;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TestReportSetup]:" + "\n");
     if(this.action != null) builder.append("action" + "->" + this.action.toString() + "\n"); ;
    return builder.toString();
  }


}
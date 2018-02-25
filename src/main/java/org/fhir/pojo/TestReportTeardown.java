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
import org.fhir.entity.TestReportTeardownModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A summary of information based on the results of executing a TestScript."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TestReportTeardown  extends BackboneElement  {
  /**
  * Description: "The teardown action will only contain an operation."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<TestReportAction2> action;

  public TestReportTeardown() {
  }

  public TestReportTeardown(TestReportTeardownModel o) {
    this.id = o.getId();
    if (null != o.getAction() && !o.getAction().isEmpty()) {
    	this.action = TestReportAction2Helper.fromArray2Array(o.getAction());
    }
  }

  public void setAction( java.util.List<TestReportAction2> value) {
    this.action = value;
  }
  public java.util.List<TestReportAction2> getAction() {
    return this.action;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TestReportTeardown]:" + "\n");
     if(this.action != null) builder.append("action" + "->" + this.action.toString() + "\n"); ;
    return builder.toString();
  }


}
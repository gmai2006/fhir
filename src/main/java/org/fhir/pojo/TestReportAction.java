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
import org.fhir.entity.TestReportActionModel;
import com.google.gson.GsonBuilder;

/**
* "A summary of information based on the results of executing a TestScript."
*/
public class TestReportAction  extends BackboneElement  {
  /**
  * Description: "The operation performed."
  */
  protected TestReportOperation operation;

  /**
  * Description: "The results of the assertion performed on the previous operations."
  */
  protected TestReportAssert FHIRassert;

  public TestReportAction() {
  }

  public TestReportAction(TestReportActionModel o) {
    this.id = o.getId();
    if (null != o.getOperation() && !o.getOperation().isEmpty()) {
      this.operation = new TestReportOperation(o.getOperation().get(0));
    }
    if (null != o.getFHIRassert() && !o.getFHIRassert().isEmpty()) {
      this.FHIRassert = new TestReportAssert(o.getFHIRassert().get(0));
    }
  }

  public void setOperation( TestReportOperation value) {
    this.operation = value;
  }
  public TestReportOperation getOperation() {
    return this.operation;
  }
  public void setFHIRassert( TestReportAssert value) {
    this.FHIRassert = value;
  }
  public TestReportAssert getFHIRassert() {
    return this.FHIRassert;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TestReportAction]:" + "\n");
     if(this.operation != null) builder.append("operation" + "->" + this.operation.toString() + "\n"); 
     if(this.FHIRassert != null) builder.append("FHIRassert" + "->" + this.FHIRassert.toString() + "\n"); ;
    return builder.toString();
  }


}
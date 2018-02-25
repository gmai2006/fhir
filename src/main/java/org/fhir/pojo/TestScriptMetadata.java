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
import com.google.gson.GsonBuilder;
import com.fasterxml.jackson.annotation.JsonInclude;
/**
* "A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestScriptMetadata  extends BackboneElement  {
  /**
  * Description: "A link to the FHIR specification that this test is covering."
  */
  protected java.util.List<TestScriptLink> link;

  /**
  * Description: "Capabilities that must exist and are assumed to function correctly on the FHIR server being tested."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<TestScriptCapability> capability;

  public TestScriptMetadata() {}

  public void setLink( java.util.List<TestScriptLink> value) {
    this.link = value;
  }
  public java.util.List<TestScriptLink> getLink() {
    return this.link;
  }
  public void setCapability( java.util.List<TestScriptCapability> value) {
    this.capability = value;
  }
  public java.util.List<TestScriptCapability> getCapability() {
    return this.capability;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TestScriptMetadata]:" + "\n");
     if(this.link != null) builder.append("link" + "->" + this.link.toString() + "\n"); 
     if(this.capability != null) builder.append("capability" + "->" + this.capability.toString() + "\n"); ;
    return builder.toString();
  }

}
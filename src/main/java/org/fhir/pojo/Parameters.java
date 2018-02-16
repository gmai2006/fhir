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

/**
* "This special resource type is used to represent an operation request and response (operations.html). It has no other use, and there is no RESTful endpoint associated with it."
*/
public class Parameters  extends Resource  {
  /**
  * Description: "A parameter passed to or received from the operation."
  */
  protected java.util.List<ParametersParameter> parameter = new java.util.ArrayList<>();

  public Parameters() {}

  public void setParameter( java.util.List<ParametersParameter> value) {
    this.parameter = value;
  }
  public java.util.List<ParametersParameter> getParameter() {
    return this.parameter;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Parameters]:" + "\n");
     if(this.parameter != null) builder.append("parameter" + "->" + this.parameter.toString() + "\n"); ;
    return builder.toString();
  }

}
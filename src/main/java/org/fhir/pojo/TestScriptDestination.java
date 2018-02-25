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
public class TestScriptDestination  extends BackboneElement  {
  /**
  * Description: "Abstract name given to a destination server in this test script.  The name is provided as a number starting at 1."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float index;

  /**
  * Description: "Extensions for index"
  */
  protected transient Element _index;

  /**
  * Description: "The type of destination profile the test system supports."
  */
  @javax.validation.constraints.NotNull
  protected Coding profile;

  public TestScriptDestination() {}

  public void setIndex( Float value) {
    this.index = value;
  }
  public Float getIndex() {
    return this.index;
  }
  public void set_index( Element value) {
    this._index = value;
  }
  public Element get_index() {
    return this._index;
  }
  public void setProfile( Coding value) {
    this.profile = value;
  }
  public Coding getProfile() {
    return this.profile;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TestScriptDestination]:" + "\n");
     if(this.index != null) builder.append("index" + "->" + this.index.toString() + "\n"); 
     if(this._index != null) builder.append("_index" + "->" + this._index.toString() + "\n"); 
     if(this.profile != null) builder.append("profile" + "->" + this.profile.toString() + "\n"); ;
    return builder.toString();
  }

}
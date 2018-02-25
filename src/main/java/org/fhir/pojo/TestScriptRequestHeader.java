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
public class TestScriptRequestHeader  extends BackboneElement  {
  /**
  * Description: "The HTTP header field e.g. \"Accept\"."
  */
  protected String field;

  /**
  * Description: "Extensions for field"
  */
  protected transient Element _field;

  /**
  * Description: "The value of the header e.g. \"application/fhir+xml\"."
  */
  protected String value;

  /**
  * Description: "Extensions for value"
  */
  protected transient Element _value;

  public TestScriptRequestHeader() {}

  public void setField( String value) {
    this.field = value;
  }
  public String getField() {
    return this.field;
  }
  public void set_field( Element value) {
    this._field = value;
  }
  public Element get_field() {
    return this._field;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }
  public void set_value( Element value) {
    this._value = value;
  }
  public Element get_value() {
    return this._value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TestScriptRequestHeader]:" + "\n");
     if(this.field != null) builder.append("field" + "->" + this.field.toString() + "\n"); 
     if(this._field != null) builder.append("_field" + "->" + this._field.toString() + "\n"); 
     if(this.value != null) builder.append("value" + "->" + this.value.toString() + "\n"); 
     if(this._value != null) builder.append("_value" + "->" + this._value.toString() + "\n"); ;
    return builder.toString();
  }

}
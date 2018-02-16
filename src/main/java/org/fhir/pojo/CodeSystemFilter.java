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
import org.fhir.entity.CodeSystemFilterModel;
import com.google.gson.GsonBuilder;

/**
* "A code system resource specifies a set of codes drawn from one or more code systems."
*/
public class CodeSystemFilter  extends BackboneElement  {
  /**
  * Description: "The code that identifies this filter when it is used in the instance."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String code;

  /**
  * Description: "Extensions for code"
  */
  protected transient Element _code;

  /**
  * Description: "A description of how or why the filter is used."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "A list of operators that can be used with the filter."
  */
  protected java.util.List<String> operator = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for operator"
  */
  protected transient java.util.List<Element> _operator = new java.util.ArrayList<>();

  /**
  * Description: "A description of what the value for the filter should be."
  */
  protected String value;

  /**
  * Description: "Extensions for value"
  */
  protected transient Element _value;

  public CodeSystemFilter() {
  }

  public CodeSystemFilter(CodeSystemFilterModel o) {
    this.id = o.getId();
    if (null != o.getCode()) {
      this.code = o.getCode();
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (o.getOperator() != null) {
    	this.operator = org.fhir.utils.JsonUtils.json2Array(o.getOperator());
    }
    if (null != o.getValue()) {
      this.value = o.getValue();
    }
  }

  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void set_code( Element value) {
    this._code = value;
  }
  public Element get_code() {
    return this._code;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setOperator( java.util.List<String> value) {
    this.operator = value;
  }
  public java.util.List<String> getOperator() {
    return this.operator;
  }
  public void set_operator( java.util.List<Element> value) {
    this._operator = value;
  }
  public java.util.List<Element> get_operator() {
    return this._operator;
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
    builder.append("[CodeSystemFilter]:" + "\n");
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this._code != null) builder.append("_code" + "->" + this._code.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.operator != null) builder.append("operator" + "->" + this.operator.toString() + "\n"); 
     if(this._operator != null) builder.append("_operator" + "->" + this._operator.toString() + "\n"); 
     if(this.value != null) builder.append("value" + "->" + this.value.toString() + "\n"); 
     if(this._value != null) builder.append("_value" + "->" + this._value.toString() + "\n"); ;
    return builder.toString();
  }


}
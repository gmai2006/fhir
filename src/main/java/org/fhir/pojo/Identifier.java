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
* "A technical identifier - identifies some entity uniquely and unambiguously."
*/
public class Identifier  extends Element  {
  /**
  * Description: "The purpose of this identifier."
  */
  protected String use;

  /**
  * Description: "Extensions for use"
  */
  protected transient Element _use;

  /**
  * Description: "A coded type for the identifier that can be used to determine which identifier to use for a specific purpose."
  */
  protected CodeableConcept type;

  /**
  * Description: "Establishes the namespace for the value - that is, a URL that describes a set values that are unique."
  */
  protected String system;

  /**
  * Description: "Extensions for system"
  */
  protected transient Element _system;

  /**
  * Description: "The portion of the identifier typically relevant to the user and which is unique within the context of the system."
  */
  protected String value;

  /**
  * Description: "Extensions for value"
  */
  protected transient Element _value;

  /**
  * Description: "Time period during which identifier is/was valid for use."
  */
  protected Period period;

  /**
  * Description: "Organization that issued/manages the identifier."
  */
  protected Reference assigner;

  public Identifier() {}

  public void setUse( String value) {
    this.use = UseEnum.fromCode(value);
  }
  public String getUse() {
    return this.use;
  }
  public void set_use( Element value) {
    this._use = value;
  }
  public Element get_use() {
    return this._use;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setSystem( String value) {
    this.system = value;
  }
  public String getSystem() {
    return this.system;
  }
  public void set_system( Element value) {
    this._system = value;
  }
  public Element get_system() {
    return this._system;
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
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setAssigner( Reference value) {
    this.assigner = value;
  }
  public Reference getAssigner() {
    return this.assigner;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Identifier]:" + "\n");
     if(this.use != null) builder.append("use" + "->" + this.use.toString() + "\n"); 
     if(this._use != null) builder.append("_use" + "->" + this._use.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.system != null) builder.append("system" + "->" + this.system.toString() + "\n"); 
     if(this._system != null) builder.append("_system" + "->" + this._system.toString() + "\n"); 
     if(this.value != null) builder.append("value" + "->" + this.value.toString() + "\n"); 
     if(this._value != null) builder.append("_value" + "->" + this._value.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.assigner != null) builder.append("assigner" + "->" + this.assigner.toString() + "\n"); ;
    return builder.toString();
  }

  public enum UseEnum {
  	usual,
  	official,
  	temp,
  	secondary,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "usual" : { return usual.toString(); }
  			case "official" : { return official.toString(); }
  			case "temp" : { return temp.toString(); }
  			case "secondary" : { return secondary.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }
}
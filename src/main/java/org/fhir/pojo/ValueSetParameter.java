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
import org.fhir.entity.ValueSetParameterModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A value set specifies a set of codes drawn from one or more code systems."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ValueSetParameter  extends BackboneElement  {
  /**
  * Description: "The name of the parameter."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "The value of the parameter."
  */
  protected String valueString;

  /**
  * Description: "Extensions for valueString"
  */
  protected transient Element _valueString;

  /**
  * Description: "The value of the parameter."
  */
  protected Boolean valueBoolean;

  /**
  * Description: "Extensions for valueBoolean"
  */
  protected transient Element _valueBoolean;

  /**
  * Description: "The value of the parameter."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float valueInteger;

  /**
  * Description: "Extensions for valueInteger"
  */
  protected transient Element _valueInteger;

  /**
  * Description: "The value of the parameter."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float valueDecimal;

  /**
  * Description: "Extensions for valueDecimal"
  */
  protected transient Element _valueDecimal;

  /**
  * Description: "The value of the parameter."
  */
  protected String valueUri;

  /**
  * Description: "Extensions for valueUri"
  */
  protected transient Element _valueUri;

  /**
  * Description: "The value of the parameter."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String valueCode;

  /**
  * Description: "Extensions for valueCode"
  */
  protected transient Element _valueCode;

  public ValueSetParameter() {
  }

  public ValueSetParameter(ValueSetParameterModel o) {
    this.id = o.getId();
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getValueString()) {
      this.valueString = o.getValueString();
    }
    if (null != o.getValueBoolean()) {
      this.valueBoolean = o.getValueBoolean();
    }
    if (null != o.getValueInteger()) {
      this.valueInteger = o.getValueInteger();
    }
    if (null != o.getValueDecimal()) {
      this.valueDecimal = o.getValueDecimal();
    }
    if (null != o.getValueUri()) {
      this.valueUri = o.getValueUri();
    }
    if (null != o.getValueCode()) {
      this.valueCode = o.getValueCode();
    }
  }

  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void set_name( Element value) {
    this._name = value;
  }
  public Element get_name() {
    return this._name;
  }
  public void setValueString( String value) {
    this.valueString = value;
  }
  public String getValueString() {
    return this.valueString;
  }
  public void set_valueString( Element value) {
    this._valueString = value;
  }
  public Element get_valueString() {
    return this._valueString;
  }
  public void setValueBoolean( Boolean value) {
    this.valueBoolean = value;
  }
  public Boolean getValueBoolean() {
    return this.valueBoolean;
  }
  public void set_valueBoolean( Element value) {
    this._valueBoolean = value;
  }
  public Element get_valueBoolean() {
    return this._valueBoolean;
  }
  public void setValueInteger( Float value) {
    this.valueInteger = value;
  }
  public Float getValueInteger() {
    return this.valueInteger;
  }
  public void set_valueInteger( Element value) {
    this._valueInteger = value;
  }
  public Element get_valueInteger() {
    return this._valueInteger;
  }
  public void setValueDecimal( Float value) {
    this.valueDecimal = value;
  }
  public Float getValueDecimal() {
    return this.valueDecimal;
  }
  public void set_valueDecimal( Element value) {
    this._valueDecimal = value;
  }
  public Element get_valueDecimal() {
    return this._valueDecimal;
  }
  public void setValueUri( String value) {
    this.valueUri = value;
  }
  public String getValueUri() {
    return this.valueUri;
  }
  public void set_valueUri( Element value) {
    this._valueUri = value;
  }
  public Element get_valueUri() {
    return this._valueUri;
  }
  public void setValueCode( String value) {
    this.valueCode = value;
  }
  public String getValueCode() {
    return this.valueCode;
  }
  public void set_valueCode( Element value) {
    this._valueCode = value;
  }
  public Element get_valueCode() {
    return this._valueCode;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ValueSetParameter]:" + "\n");
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.valueString != null) builder.append("valueString" + "->" + this.valueString.toString() + "\n"); 
     if(this._valueString != null) builder.append("_valueString" + "->" + this._valueString.toString() + "\n"); 
     if(this.valueBoolean != null) builder.append("valueBoolean" + "->" + this.valueBoolean.toString() + "\n"); 
     if(this._valueBoolean != null) builder.append("_valueBoolean" + "->" + this._valueBoolean.toString() + "\n"); 
     if(this.valueInteger != null) builder.append("valueInteger" + "->" + this.valueInteger.toString() + "\n"); 
     if(this._valueInteger != null) builder.append("_valueInteger" + "->" + this._valueInteger.toString() + "\n"); 
     if(this.valueDecimal != null) builder.append("valueDecimal" + "->" + this.valueDecimal.toString() + "\n"); 
     if(this._valueDecimal != null) builder.append("_valueDecimal" + "->" + this._valueDecimal.toString() + "\n"); 
     if(this.valueUri != null) builder.append("valueUri" + "->" + this.valueUri.toString() + "\n"); 
     if(this._valueUri != null) builder.append("_valueUri" + "->" + this._valueUri.toString() + "\n"); 
     if(this.valueCode != null) builder.append("valueCode" + "->" + this.valueCode.toString() + "\n"); 
     if(this._valueCode != null) builder.append("_valueCode" + "->" + this._valueCode.toString() + "\n"); ;
    return builder.toString();
  }


}
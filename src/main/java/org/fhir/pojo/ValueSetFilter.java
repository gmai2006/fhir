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
import org.fhir.entity.ValueSetFilterModel;
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
public class ValueSetFilter  extends BackboneElement  {
  /**
  * Description: "A code that identifies a property defined in the code system."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String property;

  /**
  * Description: "Extensions for property"
  */
  protected transient Element _property;

  /**
  * Description: "The kind of operation to perform as a part of the filter criteria."
  */
  protected String op;

  /**
  * Description: "Extensions for op"
  */
  protected transient Element _op;

  /**
  * Description: "The match value may be either a code defined by the system, or a string value, which is a regex match on the literal string of the property value when the operation is 'regex', or one of the values (true and false), when the operation is 'exists'."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String value;

  /**
  * Description: "Extensions for value"
  */
  protected transient Element _value;

  public ValueSetFilter() {
  }

  public ValueSetFilter(ValueSetFilterModel o) {
    this.id = o.getId();
    if (null != o.getProperty()) {
      this.property = o.getProperty();
    }
    if (null != o.getOp()) {
      this.op = o.getOp();
    }
    if (null != o.getValue()) {
      this.value = o.getValue();
    }
  }

  public void setProperty( String value) {
    this.property = value;
  }
  public String getProperty() {
    return this.property;
  }
  public void set_property( Element value) {
    this._property = value;
  }
  public Element get_property() {
    return this._property;
  }
  public void setOp( String value) {
    this.op = OpEnum.fromCode(value);
  }
  public String getOp() {
    return this.op;
  }
  public void set_op( Element value) {
    this._op = value;
  }
  public Element get_op() {
    return this._op;
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
    builder.append("[ValueSetFilter]:" + "\n");
     if(this.property != null) builder.append("property" + "->" + this.property.toString() + "\n"); 
     if(this._property != null) builder.append("_property" + "->" + this._property.toString() + "\n"); 
     if(this.op != null) builder.append("op" + "->" + this.op.toString() + "\n"); 
     if(this._op != null) builder.append("_op" + "->" + this._op.toString() + "\n"); 
     if(this.value != null) builder.append("value" + "->" + this.value.toString() + "\n"); 
     if(this._value != null) builder.append("_value" + "->" + this._value.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum OpEnum {
  	EQ,
  	isa,
  	descendentof,
  	isnota,
  	regex,
  	in,
  	notin,
  	generalizes,
  	exists,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "=" : { return EQ.toString(); }
  			case "isa" : { return isa.toString(); }
  			case "descendentof" : { return descendentof.toString(); }
  			case "isnota" : { return isnota.toString(); }
  			case "regex" : { return regex.toString(); }
  			case "in" : { return in.toString(); }
  			case "notin" : { return notin.toString(); }
  			case "generalizes" : { return generalizes.toString(); }
  			case "exists" : { return exists.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}
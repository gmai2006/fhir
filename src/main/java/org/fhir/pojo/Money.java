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
* "An amount of economic utility in some recognized currency."
*/
public class Money  {
  /**
  * Description: "The value of the measured amount. The value includes an implicit precision in the presentation of the value."
   derived from Quantity
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float value;

  /**
  * Description: "Extensions for value"
   derived from Quantity
  */
  private transient Element _value;

  /**
  * Description: "How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is \"<\" , then the real value is < stated value."
   derived from Quantity
  */
  private String comparator;

  /**
  * Description: "Extensions for comparator"
   derived from Quantity
  */
  private transient Element _comparator;

  /**
  * Description: "A human-readable form of the unit."
   derived from Quantity
  */
  private String unit;

  /**
  * Description: "Extensions for unit"
   derived from Quantity
  */
  private transient Element _unit;

  /**
  * Description: "The identification of the system that provides the coded form of the unit."
   derived from Quantity
  */
  private String system;

  /**
  * Description: "Extensions for system"
   derived from Quantity
  */
  private transient Element _system;

  /**
  * Description: "A computer processable form of the unit in some unit representation system."
   derived from Quantity
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String code;

  /**
  * Description: "Extensions for code"
   derived from Quantity
  */
  private transient Element _code;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from Quantity
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from Quantity
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from Quantity
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public Money() {}

  public void setValue( Float value) {
    this.value = value;
  }
  public Float getValue() {
    return this.value;
  }
  public void set_value( Element value) {
    this._value = value;
  }
  public Element get_value() {
    return this._value;
  }
  public void setComparator( String value) {
    this.comparator = ComparatorEnum.fromCode(value);
  }
  public String getComparator() {
    return this.comparator;
  }
  public void set_comparator( Element value) {
    this._comparator = value;
  }
  public Element get_comparator() {
    return this._comparator;
  }
  public void setUnit( String value) {
    this.unit = value;
  }
  public String getUnit() {
    return this.unit;
  }
  public void set_unit( Element value) {
    this._unit = value;
  }
  public Element get_unit() {
    return this._unit;
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
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("value" + "[" + String.valueOf(this.value) + "]\n"); 
     builder.append("_value" + "[" + String.valueOf(this._value) + "]\n"); 
     builder.append("comparator" + "[" + String.valueOf(this.comparator) + "]\n"); 
     builder.append("_comparator" + "[" + String.valueOf(this._comparator) + "]\n"); 
     builder.append("unit" + "[" + String.valueOf(this.unit) + "]\n"); 
     builder.append("_unit" + "[" + String.valueOf(this._unit) + "]\n"); 
     builder.append("system" + "[" + String.valueOf(this.system) + "]\n"); 
     builder.append("_system" + "[" + String.valueOf(this._system) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("_code" + "[" + String.valueOf(this._code) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public static Money fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Money.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Money o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Money> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public enum ComparatorEnum {
  	LT,
  	LE,
  	GE,
  	GT,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "<" : { return LT.toString(); }
  			case "<=" : { return LE.toString(); }
  			case ">=" : { return GE.toString(); }
  			case ">" : { return GT.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }
}
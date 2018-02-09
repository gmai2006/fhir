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
import com.google.gson.GsonBuilder;

/**
* "A value set specifies a set of codes drawn from one or more code systems."
*/
public class ValueSetFilter  {
  /**
  * Description: "A code that identifies a property defined in the code system."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String property;

  /**
  * Description: "Extensions for property"
  */
  private transient Element _property;

  /**
  * Description: "The kind of operation to perform as a part of the filter criteria."
  */
  private String op;

  /**
  * Description: "Extensions for op"
  */
  private transient Element _op;

  /**
  * Description: "The match value may be either a code defined by the system, or a string value, which is a regex match on the literal string of the property value when the operation is 'regex', or one of the values (true and false), when the operation is 'exists'."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String value;

  /**
  * Description: "Extensions for value"
  */
  private transient Element _value;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public ValueSetFilter() {
  }

  public ValueSetFilter(ValueSetFilterModel o) {
    this.id = o.getId();
      if (null != o.getProperty()) {
        this.property = new String(o.getProperty());
      }

      if (null != o.getOp()) {
        this.op = new String(o.getOp());
      }

      if (null != o.getValue()) {
        this.value = new String(o.getValue());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
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
     builder.append("property" + "[" + String.valueOf(this.property) + "]\n"); 
     builder.append("_property" + "[" + String.valueOf(this._property) + "]\n"); 
     builder.append("op" + "[" + String.valueOf(this.op) + "]\n"); 
     builder.append("_op" + "[" + String.valueOf(this._op) + "]\n"); 
     builder.append("value" + "[" + String.valueOf(this.value) + "]\n"); 
     builder.append("_value" + "[" + String.valueOf(this._value) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

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

  public static java.util.List<ValueSetFilter> fromArray(java.util.List<ValueSetFilterModel> list) {
    return (java.util.List<ValueSetFilter>)list.stream()
      .map(model -> new ValueSetFilter(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ValueSetFilterModel> toModelArray(java.util.List<ValueSetFilter> list) {
    return (java.util.List<ValueSetFilterModel>)list.stream()
      .map(model -> new ValueSetFilterModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ValueSetFilter fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ValueSetFilter.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ValueSetFilter o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ValueSetFilter> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
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
import org.fhir.entity.GroupCharacteristicModel;
import com.google.gson.GsonBuilder;

/**
* "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization."
*/
public class GroupCharacteristic  {
  /**
  * Description: "A code that identifies the kind of trait being asserted."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept code;

  /**
  * Description: "The value of the trait that holds (or does not hold - see 'exclude') for members of the group."
  */
  private CodeableConcept valueCodeableConcept;

  /**
  * Description: "The value of the trait that holds (or does not hold - see 'exclude') for members of the group."
  */
  private Boolean valueBoolean;

  /**
  * Description: "Extensions for valueBoolean"
  */
  private transient Element _valueBoolean;

  /**
  * Description: "The value of the trait that holds (or does not hold - see 'exclude') for members of the group."
  */
  private Quantity valueQuantity;

  /**
  * Description: "The value of the trait that holds (or does not hold - see 'exclude') for members of the group."
  */
  private Range valueRange;

  /**
  * Description: "If true, indicates the characteristic is one that is NOT held by members of the group."
  */
  private Boolean exclude;

  /**
  * Description: "Extensions for exclude"
  */
  private transient Element _exclude;

  /**
  * Description: "The period over which the characteristic is tested; e.g. the patient had an operation during the month of June."
  */
  private Period period;

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

  public GroupCharacteristic() {
  }

  public GroupCharacteristic(GroupCharacteristicModel o) {
    this.id = o.getId();
      this.code = CodeableConcept.fromJson(o.getCode());
      this.valueCodeableConcept = CodeableConcept.fromJson(o.getValueCodeableConcept());
      if (null != o.getValueBoolean()) {
        this.valueBoolean = new Boolean(o.getValueBoolean());
      }

      this.valueQuantity = Quantity.fromJson(o.getValueQuantity());
      this.valueRange = Range.fromJson(o.getValueRange());
      if (null != o.getExclude()) {
        this.exclude = new Boolean(o.getExclude());
      }

      this.period = Period.fromJson(o.getPeriod());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setValueCodeableConcept( CodeableConcept value) {
    this.valueCodeableConcept = value;
  }
  public CodeableConcept getValueCodeableConcept() {
    return this.valueCodeableConcept;
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
  public void setValueQuantity( Quantity value) {
    this.valueQuantity = value;
  }
  public Quantity getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueRange( Range value) {
    this.valueRange = value;
  }
  public Range getValueRange() {
    return this.valueRange;
  }
  public void setExclude( Boolean value) {
    this.exclude = value;
  }
  public Boolean getExclude() {
    return this.exclude;
  }
  public void set_exclude( Element value) {
    this._exclude = value;
  }
  public Element get_exclude() {
    return this._exclude;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
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
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("valueCodeableConcept" + "[" + String.valueOf(this.valueCodeableConcept) + "]\n"); 
     builder.append("valueBoolean" + "[" + String.valueOf(this.valueBoolean) + "]\n"); 
     builder.append("_valueBoolean" + "[" + String.valueOf(this._valueBoolean) + "]\n"); 
     builder.append("valueQuantity" + "[" + String.valueOf(this.valueQuantity) + "]\n"); 
     builder.append("valueRange" + "[" + String.valueOf(this.valueRange) + "]\n"); 
     builder.append("exclude" + "[" + String.valueOf(this.exclude) + "]\n"); 
     builder.append("_exclude" + "[" + String.valueOf(this._exclude) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<GroupCharacteristic> fromArray(java.util.List<GroupCharacteristicModel> list) {
    return (java.util.List<GroupCharacteristic>)list.stream()
      .map(model -> new GroupCharacteristic(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<GroupCharacteristicModel> toModelArray(java.util.List<GroupCharacteristic> list) {
    return (java.util.List<GroupCharacteristicModel>)list.stream()
      .map(model -> new GroupCharacteristicModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static GroupCharacteristic fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, GroupCharacteristic.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(GroupCharacteristic o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<GroupCharacteristic> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
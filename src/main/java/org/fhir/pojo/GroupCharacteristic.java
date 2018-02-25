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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class GroupCharacteristic  extends BackboneElement  {
  /**
  * Description: "A code that identifies the kind of trait being asserted."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept code;

  /**
  * Description: "The value of the trait that holds (or does not hold - see 'exclude') for members of the group."
  */
  protected CodeableConcept valueCodeableConcept;

  /**
  * Description: "The value of the trait that holds (or does not hold - see 'exclude') for members of the group."
  */
  protected Boolean valueBoolean;

  /**
  * Description: "Extensions for valueBoolean"
  */
  protected transient Element _valueBoolean;

  /**
  * Description: "The value of the trait that holds (or does not hold - see 'exclude') for members of the group."
  */
  protected Quantity valueQuantity;

  /**
  * Description: "The value of the trait that holds (or does not hold - see 'exclude') for members of the group."
  */
  protected Range valueRange;

  /**
  * Description: "If true, indicates the characteristic is one that is NOT held by members of the group."
  */
  protected Boolean exclude;

  /**
  * Description: "Extensions for exclude"
  */
  protected transient Element _exclude;

  /**
  * Description: "The period over which the characteristic is tested; e.g. the patient had an operation during the month of June."
  */
  protected Period period;

  public GroupCharacteristic() {
  }

  public GroupCharacteristic(GroupCharacteristicModel o) {
    this.id = o.getId();
    if (null != o.getCode() && !o.getCode().isEmpty()) {
      this.code = new CodeableConcept(o.getCode().get(0));
    }
    if (null != o.getValueCodeableConcept() && !o.getValueCodeableConcept().isEmpty()) {
      this.valueCodeableConcept = new CodeableConcept(o.getValueCodeableConcept().get(0));
    }
    if (null != o.getValueBoolean()) {
      this.valueBoolean = o.getValueBoolean();
    }
    if (null != o.getValueQuantity() && !o.getValueQuantity().isEmpty()) {
      this.valueQuantity = new Quantity(o.getValueQuantity().get(0));
    }
    this.valueRange = RangeHelper.fromJson(o.getValueRange());
    if (null != o.getExclude()) {
      this.exclude = o.getExclude();
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[GroupCharacteristic]:" + "\n");
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.valueCodeableConcept != null) builder.append("valueCodeableConcept" + "->" + this.valueCodeableConcept.toString() + "\n"); 
     if(this.valueBoolean != null) builder.append("valueBoolean" + "->" + this.valueBoolean.toString() + "\n"); 
     if(this._valueBoolean != null) builder.append("_valueBoolean" + "->" + this._valueBoolean.toString() + "\n"); 
     if(this.valueQuantity != null) builder.append("valueQuantity" + "->" + this.valueQuantity.toString() + "\n"); 
     if(this.valueRange != null) builder.append("valueRange" + "->" + this.valueRange.toString() + "\n"); 
     if(this.exclude != null) builder.append("exclude" + "->" + this.exclude.toString() + "\n"); 
     if(this._exclude != null) builder.append("_exclude" + "->" + this._exclude.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); ;
    return builder.toString();
  }


}
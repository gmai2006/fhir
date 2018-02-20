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
package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization."
*/
@Entity
@Table(name="groupcharacteristic")
public class GroupCharacteristicModel  implements Serializable {
	private static final long serialVersionUID = 151910893731787283L;
  /**
  * Description: "A code that identifies the kind of trait being asserted."
  */
  @javax.persistence.Basic
  @Column(name="\"code_id\"")
  private String code_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="code_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> code;

  /**
  * Description: "The value of the trait that holds (or does not hold - see 'exclude') for members of the group."
  */
  @javax.persistence.Basic
  @Column(name="\"valuecodeableconcept_id\"")
  private String valuecodeableconcept_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuecodeableconcept_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> valueCodeableConcept;

  /**
  * Description: "The value of the trait that holds (or does not hold - see 'exclude') for members of the group."
  */
  @javax.persistence.Basic
  @Column(name="\"valueBoolean\"")
  private Boolean valueBoolean;

  /**
  * Description: "The value of the trait that holds (or does not hold - see 'exclude') for members of the group."
  */
  @javax.persistence.Basic
  @Column(name="\"valuequantity_id\"")
  private String valuequantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuequantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> valueQuantity;

  /**
  * Description: "The value of the trait that holds (or does not hold - see 'exclude') for members of the group."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueRange\"", length = 16777215)
  private String valueRange;

  /**
  * Description: "If true, indicates the characteristic is one that is NOT held by members of the group."
  */
  @javax.persistence.Basic
  @Column(name="\"exclude\"")
  private Boolean exclude;

  /**
  * Description: "The period over which the characteristic is tested; e.g. the patient had an operation during the month of June."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public GroupCharacteristicModel() {
  }

  public GroupCharacteristicModel(GroupCharacteristic o, String parentId) {
  	this.parent_id = parentId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getCode() ) {
    	this.code_id = "code" + this.parent_id;
    	this.code = CodeableConceptHelper.toModel(o.getCode(), this.code_id);
    }
    if (null != o.getValueCodeableConcept() ) {
    	this.valuecodeableconcept_id = "valuecodeableconcept" + this.parent_id;
    	this.valueCodeableConcept = CodeableConceptHelper.toModel(o.getValueCodeableConcept(), this.valuecodeableconcept_id);
    }
    this.valueBoolean = o.getValueBoolean();
    if (null != o.getValueQuantity() ) {
    	this.valuequantity_id = "valuequantity" + this.parent_id;
    	this.valueQuantity = QuantityHelper.toModel(o.getValueQuantity(), this.valuequantity_id);
    }
    if (null != o.getValueRange()) {
    	this.valueRange = JsonUtils.toJson(o.getValueRange());
    }
    this.exclude = o.getExclude();
    if (null != o.getPeriod()) {
    	this.period = JsonUtils.toJson(o.getPeriod());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodeableConceptModel> getCode() {
    return this.code;
  }
  public void setCode( java.util.List<CodeableConceptModel> value) {
    this.code = value;
  }
  public java.util.List<CodeableConceptModel> getValueCodeableConcept() {
    return this.valueCodeableConcept;
  }
  public void setValueCodeableConcept( java.util.List<CodeableConceptModel> value) {
    this.valueCodeableConcept = value;
  }
  public Boolean getValueBoolean() {
    return this.valueBoolean;
  }
  public void setValueBoolean( Boolean value) {
    this.valueBoolean = value;
  }
  public java.util.List<QuantityModel> getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueQuantity( java.util.List<QuantityModel> value) {
    this.valueQuantity = value;
  }
  public String getValueRange() {
    return this.valueRange;
  }
  public void setValueRange( String value) {
    this.valueRange = value;
  }
  public Boolean getExclude() {
    return this.exclude;
  }
  public void setExclude( Boolean value) {
    this.exclude = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[GroupCharacteristicModel]:" + "\n");
     builder.append("valueBoolean" + "->" + this.valueBoolean + "\n"); 
     builder.append("valueRange" + "->" + this.valueRange + "\n"); 
     builder.append("exclude" + "->" + this.exclude + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[GroupCharacteristicModel]:" + "\n");
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("valueCodeableConcept" + "->" + this.valueCodeableConcept + "\n"); 
     builder.append("valueBoolean" + "->" + this.valueBoolean + "\n"); 
     builder.append("valueQuantity" + "->" + this.valueQuantity + "\n"); 
     builder.append("valueRange" + "->" + this.valueRange + "\n"); 
     builder.append("exclude" + "->" + this.exclude + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}
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
* "Measurements and simple assertions made about a patient, device or other subject."
* generated on 07/14/2018
*/
@Entity
@Table(name="observationcomponent")
public class ObservationComponentModel  implements Serializable {
	private static final long serialVersionUID = 153159210167382832L;
  /**
  * Description: "Describes what was observed. Sometimes this is called the observation \"code\"."
  */
  @javax.persistence.Basic
  @Column(name="\"code_id\"")
  private String code_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="code_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> code;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  @javax.persistence.Basic
  @Column(name="\"valuequantity_id\"")
  private String valuequantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="valuequantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> valueQuantity;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  @javax.persistence.Basic
  @Column(name="\"valuecodeableconcept_id\"")
  private String valuecodeableconcept_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="valuecodeableconcept_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> valueCodeableConcept;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  @javax.persistence.Basic
  @Column(name="\"valueString\"")
  private String valueString;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueRange\"", length = 16777215)
  private String valueRange;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueRatio\"", length = 16777215)
  private String valueRatio;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueSampledData\"", length = 16777215)
  private String valueSampledData;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueAttachment\"", length = 16777215)
  private String valueAttachment;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"valueTime\"")
  private String valueTime;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"valueDateTime\"")
  private String valueDateTime;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valuePeriod\"", length = 16777215)
  private String valuePeriod;

  /**
  * Description: "Provides a reason why the expected value in the element Observation.value[x] is missing."
  */
  @javax.persistence.Basic
  @Column(name="\"dataabsentreason_id\"")
  private String dataabsentreason_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="dataabsentreason_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> dataAbsentReason;

  /**
  * Description: "The assessment made based on the result of the observation.  Intended as a simple compact code often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result. Otherwise known as abnormal flag."
  */
  @javax.persistence.Basic
  @Column(name="\"interpretation_id\"")
  private String interpretation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="interpretation_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> interpretation;

  /**
  * Description: "Guidance on how to interpret the value by comparison to a normal or recommended range."
  */
  @javax.persistence.Basic
  @Column(name="\"referencerange_id\"")
  private String referencerange_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="referencerange_id", insertable=false, updatable=false)
  private java.util.List<ObservationReferenceRangeModel> referenceRange;

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
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public ObservationComponentModel() {
  }

  public ObservationComponentModel(ObservationComponent o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getCode() ) {
    	this.code_id = "code" + this.id;
    	this.code = CodeableConceptHelper.toModel(o.getCode(), this.code_id);
    }
    if (null != o.getValueQuantity() ) {
    	this.valuequantity_id = "valuequantity" + this.id;
    	this.valueQuantity = QuantityHelper.toModel(o.getValueQuantity(), this.valuequantity_id);
    }
    if (null != o.getValueCodeableConcept() ) {
    	this.valuecodeableconcept_id = "valuecodeableconcept" + this.id;
    	this.valueCodeableConcept = CodeableConceptHelper.toModel(o.getValueCodeableConcept(), this.valuecodeableconcept_id);
    }
    this.valueString = o.getValueString();
    if (null != o.getValueRange()) {
    	this.valueRange = JsonUtils.toJson(o.getValueRange());
    }
    if (null != o.getValueRatio()) {
    	this.valueRatio = JsonUtils.toJson(o.getValueRatio());
    }
    if (null != o.getValueSampledData()) {
    	this.valueSampledData = JsonUtils.toJson(o.getValueSampledData());
    }
    if (null != o.getValueAttachment()) {
    	this.valueAttachment = JsonUtils.toJson(o.getValueAttachment());
    }
    this.valueTime = o.getValueTime();
    this.valueDateTime = o.getValueDateTime();
    if (null != o.getValuePeriod()) {
    	this.valuePeriod = JsonUtils.toJson(o.getValuePeriod());
    }
    if (null != o.getDataAbsentReason() ) {
    	this.dataabsentreason_id = "dataabsentreason" + this.id;
    	this.dataAbsentReason = CodeableConceptHelper.toModel(o.getDataAbsentReason(), this.dataabsentreason_id);
    }
    if (null != o.getInterpretation() ) {
    	this.interpretation_id = "interpretation" + this.id;
    	this.interpretation = CodeableConceptHelper.toModel(o.getInterpretation(), this.interpretation_id);
    }
    if (null != o.getReferenceRange() && !o.getReferenceRange().isEmpty()) {
    	this.referencerange_id = "referencerange" + this.id;
    	this.referenceRange = ObservationReferenceRangeHelper.toModelFromArray(o.getReferenceRange(), this.referencerange_id);
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
  public java.util.List<QuantityModel> getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueQuantity( java.util.List<QuantityModel> value) {
    this.valueQuantity = value;
  }
  public java.util.List<CodeableConceptModel> getValueCodeableConcept() {
    return this.valueCodeableConcept;
  }
  public void setValueCodeableConcept( java.util.List<CodeableConceptModel> value) {
    this.valueCodeableConcept = value;
  }
  public String getValueString() {
    return this.valueString;
  }
  public void setValueString( String value) {
    this.valueString = value;
  }
  public String getValueRange() {
    return this.valueRange;
  }
  public void setValueRange( String value) {
    this.valueRange = value;
  }
  public String getValueRatio() {
    return this.valueRatio;
  }
  public void setValueRatio( String value) {
    this.valueRatio = value;
  }
  public String getValueSampledData() {
    return this.valueSampledData;
  }
  public void setValueSampledData( String value) {
    this.valueSampledData = value;
  }
  public String getValueAttachment() {
    return this.valueAttachment;
  }
  public void setValueAttachment( String value) {
    this.valueAttachment = value;
  }
  public String getValueTime() {
    return this.valueTime;
  }
  public void setValueTime( String value) {
    this.valueTime = value;
  }
  public String getValueDateTime() {
    return this.valueDateTime;
  }
  public void setValueDateTime( String value) {
    this.valueDateTime = value;
  }
  public String getValuePeriod() {
    return this.valuePeriod;
  }
  public void setValuePeriod( String value) {
    this.valuePeriod = value;
  }
  public java.util.List<CodeableConceptModel> getDataAbsentReason() {
    return this.dataAbsentReason;
  }
  public void setDataAbsentReason( java.util.List<CodeableConceptModel> value) {
    this.dataAbsentReason = value;
  }
  public java.util.List<CodeableConceptModel> getInterpretation() {
    return this.interpretation;
  }
  public void setInterpretation( java.util.List<CodeableConceptModel> value) {
    this.interpretation = value;
  }
  public java.util.List<ObservationReferenceRangeModel> getReferenceRange() {
    return this.referenceRange;
  }
  public void setReferenceRange( java.util.List<ObservationReferenceRangeModel> value) {
    this.referenceRange = value;
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
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ObservationComponentModel]:" + "\n");
     builder.append("valueString" + "->" + this.valueString + "\n"); 
     builder.append("valueRange" + "->" + this.valueRange + "\n"); 
     builder.append("valueRatio" + "->" + this.valueRatio + "\n"); 
     builder.append("valueSampledData" + "->" + this.valueSampledData + "\n"); 
     builder.append("valueAttachment" + "->" + this.valueAttachment + "\n"); 
     builder.append("valueTime" + "->" + this.valueTime + "\n"); 
     builder.append("valueDateTime" + "->" + this.valueDateTime + "\n"); 
     builder.append("valuePeriod" + "->" + this.valuePeriod + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ObservationComponentModel]:" + "\n");
     builder.append("valueString" + "->" + this.valueString + "\n"); 
     builder.append("valueRange" + "->" + this.valueRange + "\n"); 
     builder.append("valueRatio" + "->" + this.valueRatio + "\n"); 
     builder.append("valueSampledData" + "->" + this.valueSampledData + "\n"); 
     builder.append("valueAttachment" + "->" + this.valueAttachment + "\n"); 
     builder.append("valueTime" + "->" + this.valueTime + "\n"); 
     builder.append("valueDateTime" + "->" + this.valueDateTime + "\n"); 
     builder.append("valuePeriod" + "->" + this.valuePeriod + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}
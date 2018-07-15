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
* "Significant health events and conditions for a person related to the patient relevant in the context of care for the patient."
* generated on 07/14/2018
*/
@Entity
@Table(name="familymemberhistorycondition")
public class FamilyMemberHistoryConditionModel  implements Serializable {
	private static final long serialVersionUID = 153159210203060017L;
  /**
  * Description: "The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system."
  */
  @javax.persistence.Basic
  @Column(name="\"code_id\"")
  private String code_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="code_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> code;

  /**
  * Description: "Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation."
  */
  @javax.persistence.Basic
  @Column(name="\"outcome_id\"")
  private String outcome_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="outcome_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> outcome;

  /**
  * Description: "Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"onsetAge\"", length = 16777215)
  private String onsetAge;

  /**
  * Description: "Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"onsetRange\"", length = 16777215)
  private String onsetRange;

  /**
  * Description: "Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"onsetPeriod\"", length = 16777215)
  private String onsetPeriod;

  /**
  * Description: "Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence."
  */
  @javax.persistence.Basic
  @Column(name="\"onsetString\"")
  private String onsetString;

  /**
  * Description: "An area where general notes can be placed about this specific condition."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

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

  public FamilyMemberHistoryConditionModel() {
  }

  public FamilyMemberHistoryConditionModel(FamilyMemberHistoryCondition o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getCode() ) {
    	this.code_id = "code" + this.id;
    	this.code = CodeableConceptHelper.toModel(o.getCode(), this.code_id);
    }
    if (null != o.getOutcome() ) {
    	this.outcome_id = "outcome" + this.id;
    	this.outcome = CodeableConceptHelper.toModel(o.getOutcome(), this.outcome_id);
    }
    if (null != o.getOnsetAge()) {
    	this.onsetAge = JsonUtils.toJson(o.getOnsetAge());
    }
    if (null != o.getOnsetRange()) {
    	this.onsetRange = JsonUtils.toJson(o.getOnsetRange());
    }
    if (null != o.getOnsetPeriod()) {
    	this.onsetPeriod = JsonUtils.toJson(o.getOnsetPeriod());
    }
    this.onsetString = o.getOnsetString();
    if (null != o.getNote()) {
    	this.note = JsonUtils.toJson(o.getNote());
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
  public java.util.List<CodeableConceptModel> getOutcome() {
    return this.outcome;
  }
  public void setOutcome( java.util.List<CodeableConceptModel> value) {
    this.outcome = value;
  }
  public String getOnsetAge() {
    return this.onsetAge;
  }
  public void setOnsetAge( String value) {
    this.onsetAge = value;
  }
  public String getOnsetRange() {
    return this.onsetRange;
  }
  public void setOnsetRange( String value) {
    this.onsetRange = value;
  }
  public String getOnsetPeriod() {
    return this.onsetPeriod;
  }
  public void setOnsetPeriod( String value) {
    this.onsetPeriod = value;
  }
  public String getOnsetString() {
    return this.onsetString;
  }
  public void setOnsetString( String value) {
    this.onsetString = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setNote( String value) {
    this.note = value;
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
    builder.append("[FamilyMemberHistoryConditionModel]:" + "\n");
     builder.append("onsetAge" + "->" + this.onsetAge + "\n"); 
     builder.append("onsetRange" + "->" + this.onsetRange + "\n"); 
     builder.append("onsetPeriod" + "->" + this.onsetPeriod + "\n"); 
     builder.append("onsetString" + "->" + this.onsetString + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[FamilyMemberHistoryConditionModel]:" + "\n");
     builder.append("onsetAge" + "->" + this.onsetAge + "\n"); 
     builder.append("onsetRange" + "->" + this.onsetRange + "\n"); 
     builder.append("onsetPeriod" + "->" + this.onsetPeriod + "\n"); 
     builder.append("onsetString" + "->" + this.onsetString + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}
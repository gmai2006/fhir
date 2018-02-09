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

/**
* "Significant health events and conditions for a person related to the patient relevant in the context of care for the patient."
*/
@Entity
@Table(name="familymemberhistorycondition")
public class FamilyMemberHistoryConditionModel  {
  /**
  * Description: "The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"outcome\"", length = 16777215)
  private String outcome;

  /**
  * Description: "Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence."
  * Actual type: Age
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"onsetAge\"", length = 16777215)
  private String onsetAge;

  /**
  * Description: "Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence."
  * Actual type: Range
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"onsetRange\"", length = 16777215)
  private String onsetRange;

  /**
  * Description: "Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence."
  * Actual type: Period
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
  * Actual type: Array of Annotation-> List<Annotation>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
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
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public FamilyMemberHistoryConditionModel() {
  }

  public FamilyMemberHistoryConditionModel(FamilyMemberHistoryCondition o) {
    this.id = o.getId();
      this.code = CodeableConcept.toJson(o.getCode());
      this.outcome = CodeableConcept.toJson(o.getOutcome());
      this.onsetAge = Age.toJson(o.getOnsetAge());
      this.onsetRange = Range.toJson(o.getOnsetRange());
      this.onsetPeriod = Period.toJson(o.getOnsetPeriod());
      this.onsetString = o.getOnsetString();

      this.note = Annotation.toJson(o.getNote());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setOutcome( String value) {
    this.outcome = value;
  }
  public String getOutcome() {
    return this.outcome;
  }
  public void setOnsetAge( String value) {
    this.onsetAge = value;
  }
  public String getOnsetAge() {
    return this.onsetAge;
  }
  public void setOnsetRange( String value) {
    this.onsetRange = value;
  }
  public String getOnsetRange() {
    return this.onsetRange;
  }
  public void setOnsetPeriod( String value) {
    this.onsetPeriod = value;
  }
  public String getOnsetPeriod() {
    return this.onsetPeriod;
  }
  public void setOnsetString( String value) {
    this.onsetString = value;
  }
  public String getOnsetString() {
    return this.onsetString;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("outcome" + "[" + String.valueOf(this.outcome) + "]\n"); 
     builder.append("onsetAge" + "[" + String.valueOf(this.onsetAge) + "]\n"); 
     builder.append("onsetRange" + "[" + String.valueOf(this.onsetRange) + "]\n"); 
     builder.append("onsetPeriod" + "[" + String.valueOf(this.onsetPeriod) + "]\n"); 
     builder.append("onsetString" + "[" + String.valueOf(this.onsetString) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
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
import org.fhir.entity.FamilyMemberHistoryConditionModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Significant health events and conditions for a person related to the patient relevant in the context of care for the patient."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FamilyMemberHistoryCondition  extends BackboneElement  {
  /**
  * Description: "The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept code;

  /**
  * Description: "Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation."
  */
  protected CodeableConcept outcome;

  /**
  * Description: "Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence."
  */
  protected Age onsetAge;

  /**
  * Description: "Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence."
  */
  protected Range onsetRange;

  /**
  * Description: "Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence."
  */
  protected Period onsetPeriod;

  /**
  * Description: "Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence."
  */
  protected String onsetString;

  /**
  * Description: "Extensions for onsetString"
  */
  protected transient Element _onsetString;

  /**
  * Description: "An area where general notes can be placed about this specific condition."
  */
  protected java.util.List<Annotation> note;

  public FamilyMemberHistoryCondition() {
  }

  public FamilyMemberHistoryCondition(FamilyMemberHistoryConditionModel o) {
    this.id = o.getId();
    if (null != o.getCode() && !o.getCode().isEmpty()) {
      this.code = new CodeableConcept(o.getCode().get(0));
    }
    if (null != o.getOutcome() && !o.getOutcome().isEmpty()) {
      this.outcome = new CodeableConcept(o.getOutcome().get(0));
    }
    this.onsetAge = AgeHelper.fromJson(o.getOnsetAge());
    this.onsetRange = RangeHelper.fromJson(o.getOnsetRange());
    this.onsetPeriod = PeriodHelper.fromJson(o.getOnsetPeriod());
    if (null != o.getOnsetString()) {
      this.onsetString = o.getOnsetString();
    }
    if (o.getNote() != null) {
    	this.note = org.fhir.utils.JsonUtils.json2Array(o.getNote());
    }
  }

  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setOutcome( CodeableConcept value) {
    this.outcome = value;
  }
  public CodeableConcept getOutcome() {
    return this.outcome;
  }
  public void setOnsetAge( Age value) {
    this.onsetAge = value;
  }
  public Age getOnsetAge() {
    return this.onsetAge;
  }
  public void setOnsetRange( Range value) {
    this.onsetRange = value;
  }
  public Range getOnsetRange() {
    return this.onsetRange;
  }
  public void setOnsetPeriod( Period value) {
    this.onsetPeriod = value;
  }
  public Period getOnsetPeriod() {
    return this.onsetPeriod;
  }
  public void setOnsetString( String value) {
    this.onsetString = value;
  }
  public String getOnsetString() {
    return this.onsetString;
  }
  public void set_onsetString( Element value) {
    this._onsetString = value;
  }
  public Element get_onsetString() {
    return this._onsetString;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[FamilyMemberHistoryCondition]:" + "\n");
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.outcome != null) builder.append("outcome" + "->" + this.outcome.toString() + "\n"); 
     if(this.onsetAge != null) builder.append("onsetAge" + "->" + this.onsetAge.toString() + "\n"); 
     if(this.onsetRange != null) builder.append("onsetRange" + "->" + this.onsetRange.toString() + "\n"); 
     if(this.onsetPeriod != null) builder.append("onsetPeriod" + "->" + this.onsetPeriod.toString() + "\n"); 
     if(this.onsetString != null) builder.append("onsetString" + "->" + this.onsetString.toString() + "\n"); 
     if(this._onsetString != null) builder.append("_onsetString" + "->" + this._onsetString.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); ;
    return builder.toString();
  }


}
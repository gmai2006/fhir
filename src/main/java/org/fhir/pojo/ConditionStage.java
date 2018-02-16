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
import org.fhir.entity.ConditionStageModel;
import com.google.gson.GsonBuilder;

/**
* "A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern."
*/
public class ConditionStage  extends BackboneElement  {
  /**
  * Description: "A simple summary of the stage such as \"Stage 3\". The determination of the stage is disease-specific."
  */
  protected CodeableConcept summary;

  /**
  * Description: "Reference to a formal record of the evidence on which the staging assessment is based."
  */
  protected java.util.List<Reference> assessment = new java.util.ArrayList<>();

  public ConditionStage() {
  }

  public ConditionStage(ConditionStageModel o) {
    this.id = o.getId();
    this.summary = CodeableConceptHelper.fromJson(o.getSummary());
    if (null != o.getAssessment() && !o.getAssessment().isEmpty()) {
    	this.assessment = ReferenceHelper.fromArray2Array(o.getAssessment());
    }
  }

  public void setSummary( CodeableConcept value) {
    this.summary = value;
  }
  public CodeableConcept getSummary() {
    return this.summary;
  }
  public void setAssessment( java.util.List<Reference> value) {
    this.assessment = value;
  }
  public java.util.List<Reference> getAssessment() {
    return this.assessment;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ConditionStage]:" + "\n");
     if(this.summary != null) builder.append("summary" + "->" + this.summary.toString() + "\n"); 
     if(this.assessment != null) builder.append("assessment" + "->" + this.assessment.toString() + "\n"); ;
    return builder.toString();
  }


}
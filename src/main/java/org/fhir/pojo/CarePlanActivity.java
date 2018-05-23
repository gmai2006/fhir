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
import org.fhir.entity.CarePlanActivityModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CarePlanActivity  extends BackboneElement  {
  /**
  * Description: "Identifies the outcome at the point when the status of the activity is assessed.  For example, the outcome of an education activity could be patient understands (or not)."
  */
  protected java.util.List<CodeableConcept> outcomeCodeableConcept;

  /**
  * Description: "Details of the outcome or action resulting from the activity.  The reference to an \"event\" resource, such as Procedure or Encounter or Observation, is the result/outcome of the activity itself.  The activity can be conveyed using CarePlan.activity.detail OR using the CarePlan.activity.reference (a reference to a “request” resource)."
  */
  protected java.util.List<Reference> outcomeReference;

  /**
  * Description: "Notes about the adherence/status/progress of the activity."
  */
  protected java.util.List<Annotation> progress;

  /**
  * Description: "The details of the proposed activity represented in a specific resource."
  */
  protected Reference reference;

  /**
  * Description: "A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc."
  */
  protected CarePlanDetail detail;

  public CarePlanActivity() {
  }

  public CarePlanActivity(CarePlanActivityModel o) {
    this.id = o.getId();
    if (null != o.getOutcomeCodeableConcept() && !o.getOutcomeCodeableConcept().isEmpty()) {
    	this.outcomeCodeableConcept = CodeableConceptHelper.fromArray2Array(o.getOutcomeCodeableConcept());
    }
    if (null != o.getOutcomeReference() && !o.getOutcomeReference().isEmpty()) {
    	this.outcomeReference = ReferenceHelper.fromArray2Array(o.getOutcomeReference());
    }
    if (o.getProgress() != null) {
    	this.progress = org.fhir.utils.JsonUtils.json2Array(o.getProgress());
    }
    if (null != o.getReference() && !o.getReference().isEmpty()) {
      this.reference = new Reference(o.getReference().get(0));
    }
    if (null != o.getDetail() && !o.getDetail().isEmpty()) {
      this.detail = new CarePlanDetail(o.getDetail().get(0));
    }
  }

  public void setOutcomeCodeableConcept( java.util.List<CodeableConcept> value) {
    this.outcomeCodeableConcept = value;
  }
  public java.util.List<CodeableConcept> getOutcomeCodeableConcept() {
    return this.outcomeCodeableConcept;
  }
  public void setOutcomeReference( java.util.List<Reference> value) {
    this.outcomeReference = value;
  }
  public java.util.List<Reference> getOutcomeReference() {
    return this.outcomeReference;
  }
  public void setProgress( java.util.List<Annotation> value) {
    this.progress = value;
  }
  public java.util.List<Annotation> getProgress() {
    return this.progress;
  }
  public void setReference( Reference value) {
    this.reference = value;
  }
  public Reference getReference() {
    return this.reference;
  }
  public void setDetail( CarePlanDetail value) {
    this.detail = value;
  }
  public CarePlanDetail getDetail() {
    return this.detail;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CarePlanActivity]:" + "\n");
     if(this.outcomeCodeableConcept != null) builder.append("outcomeCodeableConcept" + "->" + this.outcomeCodeableConcept.toString() + "\n"); 
     if(this.outcomeReference != null) builder.append("outcomeReference" + "->" + this.outcomeReference.toString() + "\n"); 
     if(this.progress != null) builder.append("progress" + "->" + this.progress.toString() + "\n"); 
     if(this.reference != null) builder.append("reference" + "->" + this.reference.toString() + "\n"); 
     if(this.detail != null) builder.append("detail" + "->" + this.detail.toString() + "\n"); ;
    return builder.toString();
  }


}
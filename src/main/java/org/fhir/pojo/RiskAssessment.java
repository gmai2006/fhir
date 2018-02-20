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
import org.fhir.entity.RiskAssessmentModel;
import com.google.gson.GsonBuilder;

/**
* "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome."
*/
public class RiskAssessment  extends DomainResource  {
  /**
  * Description: "This is a RiskAssessment resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Business identifier assigned to the risk assessment."
  */
  protected Identifier identifier;

  /**
  * Description: "A reference to the request that is fulfilled by this risk assessment."
  */
  protected Reference basedOn;

  /**
  * Description: "A reference to a resource that this risk assessment is part of, such as a Procedure."
  */
  protected Reference parent;

  /**
  * Description: "The status of the RiskAssessment, using the same statuses as an Observation."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "The algorithm, process or mechanism used to evaluate the risk."
  */
  protected CodeableConcept method;

  /**
  * Description: "The type of the risk assessment performed."
  */
  protected CodeableConcept code;

  /**
  * Description: "The patient or group the risk assessment applies to."
  */
  protected Reference subject;

  /**
  * Description: "The encounter where the assessment was performed."
  */
  protected Reference context;

  /**
  * Description: "The date (and possibly time) the risk assessment was performed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String occurrenceDateTime;

  /**
  * Description: "Extensions for occurrenceDateTime"
  */
  protected transient Element _occurrenceDateTime;

  /**
  * Description: "The date (and possibly time) the risk assessment was performed."
  */
  protected Period occurrencePeriod;

  /**
  * Description: "For assessments or prognosis specific to a particular condition, indicates the condition being assessed."
  */
  protected Reference condition;

  /**
  * Description: "The provider or software application that performed the assessment."
  */
  protected Reference performer;

  /**
  * Description: "The reason the risk assessment was performed."
  */
  protected CodeableConcept reasonCodeableConcept;

  /**
  * Description: "The reason the risk assessment was performed."
  */
  protected Reference reasonReference;

  /**
  * Description: "Indicates the source data considered as part of the assessment (FamilyHistory, Observations, Procedures, Conditions, etc.)."
  */
  protected java.util.List<Reference> basis = new java.util.ArrayList<>();

  /**
  * Description: "Describes the expected outcome for the subject."
  */
  protected java.util.List<RiskAssessmentPrediction> prediction = new java.util.ArrayList<>();

  /**
  * Description: "A description of the steps that might be taken to reduce the identified risk(s)."
  */
  protected String mitigation;

  /**
  * Description: "Extensions for mitigation"
  */
  protected transient Element _mitigation;

  /**
  * Description: "Additional comments about the risk assessment."
  */
  protected String comment;

  /**
  * Description: "Extensions for comment"
  */
  protected transient Element _comment;

  public RiskAssessment() {
  }

  public RiskAssessment(RiskAssessmentModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
      this.basedOn = new Reference(o.getBasedOn().get(0));
    }
    if (null != o.getParent() && !o.getParent().isEmpty()) {
      this.parent = new Reference(o.getParent().get(0));
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getMethod() && !o.getMethod().isEmpty()) {
      this.method = new CodeableConcept(o.getMethod().get(0));
    }
    if (null != o.getCode() && !o.getCode().isEmpty()) {
      this.code = new CodeableConcept(o.getCode().get(0));
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getContext() && !o.getContext().isEmpty()) {
      this.context = new Reference(o.getContext().get(0));
    }
    if (null != o.getOccurrenceDateTime()) {
      this.occurrenceDateTime = o.getOccurrenceDateTime();
    }
    this.occurrencePeriod = PeriodHelper.fromJson(o.getOccurrencePeriod());
    if (null != o.getCondition() && !o.getCondition().isEmpty()) {
      this.condition = new Reference(o.getCondition().get(0));
    }
    if (null != o.getPerformer() && !o.getPerformer().isEmpty()) {
      this.performer = new Reference(o.getPerformer().get(0));
    }
    if (null != o.getReasonCodeableConcept() && !o.getReasonCodeableConcept().isEmpty()) {
      this.reasonCodeableConcept = new CodeableConcept(o.getReasonCodeableConcept().get(0));
    }
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
      this.reasonReference = new Reference(o.getReasonReference().get(0));
    }
    if (null != o.getBasis() && !o.getBasis().isEmpty()) {
    	this.basis = ReferenceHelper.fromArray2Array(o.getBasis());
    }
    if (null != o.getPrediction() && !o.getPrediction().isEmpty()) {
    	this.prediction = RiskAssessmentPredictionHelper.fromArray2Array(o.getPrediction());
    }
    if (null != o.getMitigation()) {
      this.mitigation = o.getMitigation();
    }
    if (null != o.getComment()) {
      this.comment = o.getComment();
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setBasedOn( Reference value) {
    this.basedOn = value;
  }
  public Reference getBasedOn() {
    return this.basedOn;
  }
  public void setParent( Reference value) {
    this.parent = value;
  }
  public Reference getParent() {
    return this.parent;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void set_status( Element value) {
    this._status = value;
  }
  public Element get_status() {
    return this._status;
  }
  public void setMethod( CodeableConcept value) {
    this.method = value;
  }
  public CodeableConcept getMethod() {
    return this.method;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setContext( Reference value) {
    this.context = value;
  }
  public Reference getContext() {
    return this.context;
  }
  public void setOccurrenceDateTime( String value) {
    this.occurrenceDateTime = value;
  }
  public String getOccurrenceDateTime() {
    return this.occurrenceDateTime;
  }
  public void set_occurrenceDateTime( Element value) {
    this._occurrenceDateTime = value;
  }
  public Element get_occurrenceDateTime() {
    return this._occurrenceDateTime;
  }
  public void setOccurrencePeriod( Period value) {
    this.occurrencePeriod = value;
  }
  public Period getOccurrencePeriod() {
    return this.occurrencePeriod;
  }
  public void setCondition( Reference value) {
    this.condition = value;
  }
  public Reference getCondition() {
    return this.condition;
  }
  public void setPerformer( Reference value) {
    this.performer = value;
  }
  public Reference getPerformer() {
    return this.performer;
  }
  public void setReasonCodeableConcept( CodeableConcept value) {
    this.reasonCodeableConcept = value;
  }
  public CodeableConcept getReasonCodeableConcept() {
    return this.reasonCodeableConcept;
  }
  public void setReasonReference( Reference value) {
    this.reasonReference = value;
  }
  public Reference getReasonReference() {
    return this.reasonReference;
  }
  public void setBasis( java.util.List<Reference> value) {
    this.basis = value;
  }
  public java.util.List<Reference> getBasis() {
    return this.basis;
  }
  public void setPrediction( java.util.List<RiskAssessmentPrediction> value) {
    this.prediction = value;
  }
  public java.util.List<RiskAssessmentPrediction> getPrediction() {
    return this.prediction;
  }
  public void setMitigation( String value) {
    this.mitigation = value;
  }
  public String getMitigation() {
    return this.mitigation;
  }
  public void set_mitigation( Element value) {
    this._mitigation = value;
  }
  public Element get_mitigation() {
    return this._mitigation;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void set_comment( Element value) {
    this._comment = value;
  }
  public Element get_comment() {
    return this._comment;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[RiskAssessment]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.basedOn != null) builder.append("basedOn" + "->" + this.basedOn.toString() + "\n"); 
     if(this.parent != null) builder.append("parent" + "->" + this.parent.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.method != null) builder.append("method" + "->" + this.method.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.occurrenceDateTime != null) builder.append("occurrenceDateTime" + "->" + this.occurrenceDateTime.toString() + "\n"); 
     if(this._occurrenceDateTime != null) builder.append("_occurrenceDateTime" + "->" + this._occurrenceDateTime.toString() + "\n"); 
     if(this.occurrencePeriod != null) builder.append("occurrencePeriod" + "->" + this.occurrencePeriod.toString() + "\n"); 
     if(this.condition != null) builder.append("condition" + "->" + this.condition.toString() + "\n"); 
     if(this.performer != null) builder.append("performer" + "->" + this.performer.toString() + "\n"); 
     if(this.reasonCodeableConcept != null) builder.append("reasonCodeableConcept" + "->" + this.reasonCodeableConcept.toString() + "\n"); 
     if(this.reasonReference != null) builder.append("reasonReference" + "->" + this.reasonReference.toString() + "\n"); 
     if(this.basis != null) builder.append("basis" + "->" + this.basis.toString() + "\n"); 
     if(this.prediction != null) builder.append("prediction" + "->" + this.prediction.toString() + "\n"); 
     if(this.mitigation != null) builder.append("mitigation" + "->" + this.mitigation.toString() + "\n"); 
     if(this._mitigation != null) builder.append("_mitigation" + "->" + this._mitigation.toString() + "\n"); 
     if(this.comment != null) builder.append("comment" + "->" + this.comment.toString() + "\n"); 
     if(this._comment != null) builder.append("_comment" + "->" + this._comment.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	RiskAssessment,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "RiskAssessment" : { return RiskAssessment.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}
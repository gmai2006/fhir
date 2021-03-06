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
import org.fhir.entity.ExplanationOfBenefitDiagnosisModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ExplanationOfBenefitDiagnosis  extends BackboneElement  {
  /**
  * Description: "Sequence of diagnosis which serves to provide a link."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float sequence;

  /**
  * Description: "Extensions for sequence"
  */
  protected transient Element _sequence;

  /**
  * Description: "The diagnosis."
  */
  protected CodeableConcept diagnosisCodeableConcept;

  /**
  * Description: "The diagnosis."
  */
  protected Reference diagnosisReference;

  /**
  * Description: "The type of the Diagnosis, for example: admitting, primary, secondary, discharge."
  */
  protected java.util.List<CodeableConcept> type;

  /**
  * Description: "The package billing code, for example DRG, based on the assigned grouping code system."
  */
  protected CodeableConcept packageCode;

  public ExplanationOfBenefitDiagnosis() {
  }

  public ExplanationOfBenefitDiagnosis(ExplanationOfBenefitDiagnosisModel o) {
    this.id = o.getId();
    if (null != o.getSequence()) {
      this.sequence = o.getSequence();
    }
    if (null != o.getDiagnosisCodeableConcept() && !o.getDiagnosisCodeableConcept().isEmpty()) {
      this.diagnosisCodeableConcept = new CodeableConcept(o.getDiagnosisCodeableConcept().get(0));
    }
    if (null != o.getDiagnosisReference() && !o.getDiagnosisReference().isEmpty()) {
      this.diagnosisReference = new Reference(o.getDiagnosisReference().get(0));
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
    	this.type = CodeableConceptHelper.fromArray2Array(o.getType());
    }
    if (null != o.getPackageCode() && !o.getPackageCode().isEmpty()) {
      this.packageCode = new CodeableConcept(o.getPackageCode().get(0));
    }
  }

  public void setSequence( Float value) {
    this.sequence = value;
  }
  public Float getSequence() {
    return this.sequence;
  }
  public void set_sequence( Element value) {
    this._sequence = value;
  }
  public Element get_sequence() {
    return this._sequence;
  }
  public void setDiagnosisCodeableConcept( CodeableConcept value) {
    this.diagnosisCodeableConcept = value;
  }
  public CodeableConcept getDiagnosisCodeableConcept() {
    return this.diagnosisCodeableConcept;
  }
  public void setDiagnosisReference( Reference value) {
    this.diagnosisReference = value;
  }
  public Reference getDiagnosisReference() {
    return this.diagnosisReference;
  }
  public void setType( java.util.List<CodeableConcept> value) {
    this.type = value;
  }
  public java.util.List<CodeableConcept> getType() {
    return this.type;
  }
  public void setPackageCode( CodeableConcept value) {
    this.packageCode = value;
  }
  public CodeableConcept getPackageCode() {
    return this.packageCode;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ExplanationOfBenefitDiagnosis]:" + "\n");
     if(this.sequence != null) builder.append("sequence" + "->" + this.sequence.toString() + "\n"); 
     if(this._sequence != null) builder.append("_sequence" + "->" + this._sequence.toString() + "\n"); 
     if(this.diagnosisCodeableConcept != null) builder.append("diagnosisCodeableConcept" + "->" + this.diagnosisCodeableConcept.toString() + "\n"); 
     if(this.diagnosisReference != null) builder.append("diagnosisReference" + "->" + this.diagnosisReference.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.packageCode != null) builder.append("packageCode" + "->" + this.packageCode.toString() + "\n"); ;
    return builder.toString();
  }


}
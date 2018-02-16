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
import org.fhir.entity.VisionPrescriptionModel;
import com.google.gson.GsonBuilder;

/**
* "An authorization for the supply of glasses and/or contact lenses to a patient."
*/
public class VisionPrescription  extends DomainResource  {
  /**
  * Description: "This is a VisionPrescription resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Business identifier which may be used by other parties to reference or identify the prescription."
  */
  protected java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "The status of the resource instance."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "A link to a resource representing the person to whom the vision products will be supplied."
  */
  protected Reference patient;

  /**
  * Description: "A link to a resource that identifies the particular occurrence of contact between patient and health care provider."
  */
  protected Reference encounter;

  /**
  * Description: "The date (and perhaps time) when the prescription was written."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String dateWritten;

  /**
  * Description: "Extensions for dateWritten"
  */
  protected transient Element _dateWritten;

  /**
  * Description: "The healthcare professional responsible for authorizing the prescription."
  */
  protected Reference prescriber;

  /**
  * Description: "Can be the reason or the indication for writing the prescription."
  */
  protected CodeableConcept reasonCodeableConcept;

  /**
  * Description: "Can be the reason or the indication for writing the prescription."
  */
  protected Reference reasonReference;

  /**
  * Description: "Deals with details of the dispense part of the supply specification."
  */
  protected java.util.List<VisionPrescriptionDispense> dispense = new java.util.ArrayList<>();

  public VisionPrescription() {
  }

  public VisionPrescription(VisionPrescriptionModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
    }
    if (null != o.getEncounter() && !o.getEncounter().isEmpty()) {
      this.encounter = new Reference(o.getEncounter().get(0));
    }
    if (null != o.getDateWritten()) {
      this.dateWritten = o.getDateWritten();
    }
    if (null != o.getPrescriber() && !o.getPrescriber().isEmpty()) {
      this.prescriber = new Reference(o.getPrescriber().get(0));
    }
    this.reasonCodeableConcept = CodeableConceptHelper.fromJson(o.getReasonCodeableConcept());
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
      this.reasonReference = new Reference(o.getReasonReference().get(0));
    }
    if (null != o.getDispense() && !o.getDispense().isEmpty()) {
    	this.dispense = VisionPrescriptionDispenseHelper.fromArray2Array(o.getDispense());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
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
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
  }
  public void setEncounter( Reference value) {
    this.encounter = value;
  }
  public Reference getEncounter() {
    return this.encounter;
  }
  public void setDateWritten( String value) {
    this.dateWritten = value;
  }
  public String getDateWritten() {
    return this.dateWritten;
  }
  public void set_dateWritten( Element value) {
    this._dateWritten = value;
  }
  public Element get_dateWritten() {
    return this._dateWritten;
  }
  public void setPrescriber( Reference value) {
    this.prescriber = value;
  }
  public Reference getPrescriber() {
    return this.prescriber;
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
  public void setDispense( java.util.List<VisionPrescriptionDispense> value) {
    this.dispense = value;
  }
  public java.util.List<VisionPrescriptionDispense> getDispense() {
    return this.dispense;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[VisionPrescription]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.encounter != null) builder.append("encounter" + "->" + this.encounter.toString() + "\n"); 
     if(this.dateWritten != null) builder.append("dateWritten" + "->" + this.dateWritten.toString() + "\n"); 
     if(this._dateWritten != null) builder.append("_dateWritten" + "->" + this._dateWritten.toString() + "\n"); 
     if(this.prescriber != null) builder.append("prescriber" + "->" + this.prescriber.toString() + "\n"); 
     if(this.reasonCodeableConcept != null) builder.append("reasonCodeableConcept" + "->" + this.reasonCodeableConcept.toString() + "\n"); 
     if(this.reasonReference != null) builder.append("reasonReference" + "->" + this.reasonReference.toString() + "\n"); 
     if(this.dispense != null) builder.append("dispense" + "->" + this.dispense.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	VisionPrescription,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "VisionPrescription" : { return VisionPrescription.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}
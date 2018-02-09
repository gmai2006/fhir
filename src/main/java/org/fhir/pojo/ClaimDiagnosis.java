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
import org.fhir.entity.ClaimDiagnosisModel;
import com.google.gson.GsonBuilder;

/**
* "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
*/
public class ClaimDiagnosis  {
  /**
  * Description: "Sequence of diagnosis which serves to provide a link."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float sequence;

  /**
  * Description: "Extensions for sequence"
  */
  private transient Element _sequence;

  /**
  * Description: "The diagnosis."
  */
  private CodeableConcept diagnosisCodeableConcept;

  /**
  * Description: "The diagnosis."
  */
  private Reference diagnosisReference;

  /**
  * Description: "The type of the Diagnosis, for example: admitting, primary, secondary, discharge."
  */
  private java.util.List<CodeableConcept> type = new java.util.ArrayList<>();

  /**
  * Description: "The package billing code, for example DRG, based on the assigned grouping code system."
  */
  private CodeableConcept packageCode;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public ClaimDiagnosis() {
  }

  public ClaimDiagnosis(ClaimDiagnosisModel o) {
    this.id = o.getId();
      if (null != o.getSequence()) {
        this.sequence = new Float(o.getSequence());
      }

      this.diagnosisCodeableConcept = CodeableConcept.fromJson(o.getDiagnosisCodeableConcept());
      if (null != o.getDiagnosisReference()) {
        this.diagnosisReference = new Reference(o.getDiagnosisReference());
        this.diagnosisReference.setId(this.getId());
      }

      this.type = CodeableConcept.fromArray(o.getType());
      this.packageCode = CodeableConcept.fromJson(o.getPackageCode());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("sequence" + "[" + String.valueOf(this.sequence) + "]\n"); 
     builder.append("_sequence" + "[" + String.valueOf(this._sequence) + "]\n"); 
     builder.append("diagnosisCodeableConcept" + "[" + String.valueOf(this.diagnosisCodeableConcept) + "]\n"); 
     builder.append("diagnosisReference" + "[" + String.valueOf(this.diagnosisReference) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("packageCode" + "[" + String.valueOf(this.packageCode) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ClaimDiagnosis> fromArray(java.util.List<ClaimDiagnosisModel> list) {
    return (java.util.List<ClaimDiagnosis>)list.stream()
      .map(model -> new ClaimDiagnosis(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ClaimDiagnosisModel> toModelArray(java.util.List<ClaimDiagnosis> list) {
    return (java.util.List<ClaimDiagnosisModel>)list.stream()
      .map(model -> new ClaimDiagnosisModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ClaimDiagnosis fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ClaimDiagnosis.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ClaimDiagnosis o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ClaimDiagnosis> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
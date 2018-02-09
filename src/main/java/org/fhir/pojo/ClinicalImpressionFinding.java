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
import org.fhir.entity.ClinicalImpressionFindingModel;
import com.google.gson.GsonBuilder;

/**
* "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score."
*/
public class ClinicalImpressionFinding  {
  /**
  * Description: "Specific text, code or reference for finding or diagnosis, which may include ruled-out or resolved conditions."
  */
  private CodeableConcept itemCodeableConcept;

  /**
  * Description: "Specific text, code or reference for finding or diagnosis, which may include ruled-out or resolved conditions."
  */
  private Reference itemReference;

  /**
  * Description: "Which investigations support finding or diagnosis."
  */
  private String basis;

  /**
  * Description: "Extensions for basis"
  */
  private transient Element _basis;

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

  public ClinicalImpressionFinding() {
  }

  public ClinicalImpressionFinding(ClinicalImpressionFindingModel o) {
    this.id = o.getId();
      this.itemCodeableConcept = CodeableConcept.fromJson(o.getItemCodeableConcept());
      if (null != o.getItemReference()) {
        this.itemReference = new Reference(o.getItemReference());
        this.itemReference.setId(this.getId());
      }

      if (null != o.getBasis()) {
        this.basis = new String(o.getBasis());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setItemCodeableConcept( CodeableConcept value) {
    this.itemCodeableConcept = value;
  }
  public CodeableConcept getItemCodeableConcept() {
    return this.itemCodeableConcept;
  }
  public void setItemReference( Reference value) {
    this.itemReference = value;
  }
  public Reference getItemReference() {
    return this.itemReference;
  }
  public void setBasis( String value) {
    this.basis = value;
  }
  public String getBasis() {
    return this.basis;
  }
  public void set_basis( Element value) {
    this._basis = value;
  }
  public Element get_basis() {
    return this._basis;
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
     builder.append("itemCodeableConcept" + "[" + String.valueOf(this.itemCodeableConcept) + "]\n"); 
     builder.append("itemReference" + "[" + String.valueOf(this.itemReference) + "]\n"); 
     builder.append("basis" + "[" + String.valueOf(this.basis) + "]\n"); 
     builder.append("_basis" + "[" + String.valueOf(this._basis) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ClinicalImpressionFinding> fromArray(java.util.List<ClinicalImpressionFindingModel> list) {
    return (java.util.List<ClinicalImpressionFinding>)list.stream()
      .map(model -> new ClinicalImpressionFinding(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ClinicalImpressionFindingModel> toModelArray(java.util.List<ClinicalImpressionFinding> list) {
    return (java.util.List<ClinicalImpressionFindingModel>)list.stream()
      .map(model -> new ClinicalImpressionFindingModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ClinicalImpressionFinding fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ClinicalImpressionFinding.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ClinicalImpressionFinding o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ClinicalImpressionFinding> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
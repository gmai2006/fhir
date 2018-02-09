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
import org.fhir.entity.DocumentReferenceContextModel;
import com.google.gson.GsonBuilder;

/**
* "A reference to a document."
*/
public class DocumentReferenceContext  {
  /**
  * Description: "Describes the clinical encounter or type of care that the document content is associated with."
  */
  private Reference encounter;

  /**
  * Description: "This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \"History and Physical Report\" in which the procedure being documented is necessarily a \"History and Physical\" act."
  */
  private java.util.List<CodeableConcept> event = new java.util.ArrayList<>();

  /**
  * Description: "The time period over which the service that is described by the document was provided."
  */
  private Period period;

  /**
  * Description: "The kind of facility where the patient was seen."
  */
  private CodeableConcept facilityType;

  /**
  * Description: "This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty."
  */
  private CodeableConcept practiceSetting;

  /**
  * Description: "The Patient Information as known when the document was published. May be a reference to a version specific, or contained."
  */
  private Reference sourcePatientInfo;

  /**
  * Description: "Related identifiers or resources associated with the DocumentReference."
  */
  private java.util.List<DocumentReferenceRelated> related = new java.util.ArrayList<>();

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

  public DocumentReferenceContext() {
  }

  public DocumentReferenceContext(DocumentReferenceContextModel o) {
    this.id = o.getId();
      if (null != o.getEncounter()) {
        this.encounter = new Reference(o.getEncounter());
        this.encounter.setId(this.getId());
      }

      this.event = CodeableConcept.fromArray(o.getEvent());
      this.period = Period.fromJson(o.getPeriod());
      this.facilityType = CodeableConcept.fromJson(o.getFacilityType());
      this.practiceSetting = CodeableConcept.fromJson(o.getPracticeSetting());
      if (null != o.getSourcePatientInfo()) {
        this.sourcePatientInfo = new Reference(o.getSourcePatientInfo());
        this.sourcePatientInfo.setId(this.getId());
      }

      this.related = DocumentReferenceRelated.fromArray(o.getRelated());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setEncounter( Reference value) {
    this.encounter = value;
  }
  public Reference getEncounter() {
    return this.encounter;
  }
  public void setEvent( java.util.List<CodeableConcept> value) {
    this.event = value;
  }
  public java.util.List<CodeableConcept> getEvent() {
    return this.event;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setFacilityType( CodeableConcept value) {
    this.facilityType = value;
  }
  public CodeableConcept getFacilityType() {
    return this.facilityType;
  }
  public void setPracticeSetting( CodeableConcept value) {
    this.practiceSetting = value;
  }
  public CodeableConcept getPracticeSetting() {
    return this.practiceSetting;
  }
  public void setSourcePatientInfo( Reference value) {
    this.sourcePatientInfo = value;
  }
  public Reference getSourcePatientInfo() {
    return this.sourcePatientInfo;
  }
  public void setRelated( java.util.List<DocumentReferenceRelated> value) {
    this.related = value;
  }
  public java.util.List<DocumentReferenceRelated> getRelated() {
    return this.related;
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
     builder.append("encounter" + "[" + String.valueOf(this.encounter) + "]\n"); 
     builder.append("event" + "[" + String.valueOf(this.event) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("facilityType" + "[" + String.valueOf(this.facilityType) + "]\n"); 
     builder.append("practiceSetting" + "[" + String.valueOf(this.practiceSetting) + "]\n"); 
     builder.append("sourcePatientInfo" + "[" + String.valueOf(this.sourcePatientInfo) + "]\n"); 
     builder.append("related" + "[" + String.valueOf(this.related) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<DocumentReferenceContext> fromArray(java.util.List<DocumentReferenceContextModel> list) {
    return (java.util.List<DocumentReferenceContext>)list.stream()
      .map(model -> new DocumentReferenceContext(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<DocumentReferenceContextModel> toModelArray(java.util.List<DocumentReferenceContext> list) {
    return (java.util.List<DocumentReferenceContextModel>)list.stream()
      .map(model -> new DocumentReferenceContextModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static DocumentReferenceContext fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, DocumentReferenceContext.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(DocumentReferenceContext o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<DocumentReferenceContext> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
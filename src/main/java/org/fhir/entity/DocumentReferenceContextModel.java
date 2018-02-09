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
* "A reference to a document."
*/
@Entity
@Table(name="documentreferencecontext")
public class DocumentReferenceContextModel  {
  /**
  * Description: "Describes the clinical encounter or type of care that the document content is associated with."
  */
  @javax.persistence.Basic
  @Column(name="\"encounter_id\"")
  private String encounter_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`encounter_id`", insertable=false, updatable=false)
  private ReferenceModel encounter;

  /**
  * Description: "This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \"History and Physical Report\" in which the procedure being documented is necessarily a \"History and Physical\" act."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"event\"", length = 16777215)
  private String event;

  /**
  * Description: "The time period over which the service that is described by the document was provided."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "The kind of facility where the patient was seen."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"facilityType\"", length = 16777215)
  private String facilityType;

  /**
  * Description: "This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"practiceSetting\"", length = 16777215)
  private String practiceSetting;

  /**
  * Description: "The Patient Information as known when the document was published. May be a reference to a version specific, or contained."
  */
  @javax.persistence.Basic
  @Column(name="\"sourcepatientinfo_id\"")
  private String sourcepatientinfo_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`sourcepatientinfo_id`", insertable=false, updatable=false)
  private ReferenceModel sourcePatientInfo;

  /**
  * Description: "Related identifiers or resources associated with the DocumentReference."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<DocumentReferenceRelatedModel> related = new java.util.ArrayList<>();

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

  public DocumentReferenceContextModel() {
  }

  public DocumentReferenceContextModel(DocumentReferenceContext o) {
    this.id = o.getId();
      if (null != o.getEncounter()) {
      	this.encounter_id = "encounter" + this.getId();
        this.encounter = new ReferenceModel(o.getEncounter());
        this.encounter.setId(this.encounter_id);
        this.encounter.parent_id = this.encounter.getId();
      }

      this.event = CodeableConcept.toJson(o.getEvent());
      this.period = Period.toJson(o.getPeriod());
      this.facilityType = CodeableConcept.toJson(o.getFacilityType());
      this.practiceSetting = CodeableConcept.toJson(o.getPracticeSetting());
      if (null != o.getSourcePatientInfo()) {
      	this.sourcepatientinfo_id = "sourcePatientInfo" + this.getId();
        this.sourcePatientInfo = new ReferenceModel(o.getSourcePatientInfo());
        this.sourcePatientInfo.setId(this.sourcepatientinfo_id);
        this.sourcePatientInfo.parent_id = this.sourcePatientInfo.getId();
      }

      this.related = DocumentReferenceRelated.toModelArray(o.getRelated());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setEncounter( ReferenceModel value) {
    this.encounter = value;
  }
  public ReferenceModel getEncounter() {
    return this.encounter;
  }
  public void setEvent( String value) {
    this.event = value;
  }
  public String getEvent() {
    return this.event;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setFacilityType( String value) {
    this.facilityType = value;
  }
  public String getFacilityType() {
    return this.facilityType;
  }
  public void setPracticeSetting( String value) {
    this.practiceSetting = value;
  }
  public String getPracticeSetting() {
    return this.practiceSetting;
  }
  public void setSourcePatientInfo( ReferenceModel value) {
    this.sourcePatientInfo = value;
  }
  public ReferenceModel getSourcePatientInfo() {
    return this.sourcePatientInfo;
  }
  public void setRelated( java.util.List<DocumentReferenceRelatedModel> value) {
    this.related = value;
  }
  public java.util.List<DocumentReferenceRelatedModel> getRelated() {
    return this.related;
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
     builder.append("encounter" + "[" + String.valueOf(this.encounter) + "]\n"); 
     builder.append("event" + "[" + String.valueOf(this.event) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("facilityType" + "[" + String.valueOf(this.facilityType) + "]\n"); 
     builder.append("practiceSetting" + "[" + String.valueOf(this.practiceSetting) + "]\n"); 
     builder.append("sourcePatientInfo" + "[" + String.valueOf(this.sourcePatientInfo) + "]\n"); 
     builder.append("related" + "[" + String.valueOf(this.related) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
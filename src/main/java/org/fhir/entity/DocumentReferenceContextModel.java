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
import java.io.Serializable;
/**
* "A reference to a document."
*/
@Entity
@Table(name="documentreferencecontext")
public class DocumentReferenceContextModel  implements Serializable {
	private static final long serialVersionUID = 151857669716935127L;
  /**
  * Description: "Describes the clinical encounter or type of care that the document content is associated with."
  */
  @javax.persistence.Basic
  @Column(name="\"encounter_id\"")
  private String encounter_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="encounter_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> encounter;

  /**
  * Description: "This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \"History and Physical Report\" in which the procedure being documented is necessarily a \"History and Physical\" act."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"event\"", length = 16777215)
  private String event;

  /**
  * Description: "The time period over which the service that is described by the document was provided."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "The kind of facility where the patient was seen."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"facilityType\"", length = 16777215)
  private String facilityType;

  /**
  * Description: "This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="sourcepatientinfo_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> sourcePatientInfo;

  /**
  * Description: "Related identifiers or resources associated with the DocumentReference."
  */
  @javax.persistence.Basic
  @Column(name="\"related_id\"")
  private String related_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="related_id", insertable=false, updatable=false)
  private java.util.List<DocumentReferenceRelatedModel> related;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public DocumentReferenceContextModel() {
  }

  public DocumentReferenceContextModel(DocumentReferenceContext o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    if (null != o.getEncounter() ) {
    	this.encounter_id = "encounter" + this.parent_id;
    	this.encounter = ReferenceHelper.toModel(o.getEncounter(), this.encounter_id);
    }
    this.period = PeriodHelper.toJson(o.getPeriod());
    this.facilityType = CodeableConceptHelper.toJson(o.getFacilityType());
    this.practiceSetting = CodeableConceptHelper.toJson(o.getPracticeSetting());
    if (null != o.getSourcePatientInfo() ) {
    	this.sourcepatientinfo_id = "sourcepatientinfo" + this.parent_id;
    	this.sourcePatientInfo = ReferenceHelper.toModel(o.getSourcePatientInfo(), this.sourcepatientinfo_id);
    }
    if (null != o.getRelated() && !o.getRelated().isEmpty()) {
    	this.related_id = "related" + this.parent_id;
    	this.related = DocumentReferenceRelatedHelper.toModelFromArray(o.getRelated(), this.related_id);
    }
  }

  public java.util.List<ReferenceModel> getEncounter() {
    return this.encounter;
  }
  public void setEncounter( java.util.List<ReferenceModel> value) {
    this.encounter = value;
  }
  public String getEvent() {
    return this.event;
  }
  public void setEvent( String value) {
    this.event = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public String getFacilityType() {
    return this.facilityType;
  }
  public void setFacilityType( String value) {
    this.facilityType = value;
  }
  public String getPracticeSetting() {
    return this.practiceSetting;
  }
  public void setPracticeSetting( String value) {
    this.practiceSetting = value;
  }
  public java.util.List<ReferenceModel> getSourcePatientInfo() {
    return this.sourcePatientInfo;
  }
  public void setSourcePatientInfo( java.util.List<ReferenceModel> value) {
    this.sourcePatientInfo = value;
  }
  public java.util.List<DocumentReferenceRelatedModel> getRelated() {
    return this.related;
  }
  public void setRelated( java.util.List<DocumentReferenceRelatedModel> value) {
    this.related = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DocumentReferenceContextModel]:" + "\n");
     builder.append("event" + "->" + this.event + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("facilityType" + "->" + this.facilityType + "\n"); 
     builder.append("practiceSetting" + "->" + this.practiceSetting + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DocumentReferenceContextModel]:" + "\n");
     builder.append("encounter" + "->" + this.encounter + "\n"); 
     builder.append("event" + "->" + this.event + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("facilityType" + "->" + this.facilityType + "\n"); 
     builder.append("practiceSetting" + "->" + this.practiceSetting + "\n"); 
     builder.append("sourcePatientInfo" + "->" + this.sourcePatientInfo + "\n"); 
     builder.append("related" + "->" + this.related + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}
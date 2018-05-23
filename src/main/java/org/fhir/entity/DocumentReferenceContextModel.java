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
import org.fhir.utils.JsonUtils;
/**
* "A reference to a document."
*/
@Entity
@Table(name="documentreferencecontext")
public class DocumentReferenceContextModel  implements Serializable {
	private static final long serialVersionUID = 151967883228271893L;
  /**
  * Description: "Describes the clinical encounter or type of care that the document content is associated with."
  */
  @javax.persistence.Basic
  @Column(name="\"encounter_id\"")
  private String encounter_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="encounter_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> encounter;

  /**
  * Description: "This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \"History and Physical Report\" in which the procedure being documented is necessarily a \"History and Physical\" act."
  */
  @javax.persistence.Basic
  @Column(name="\"event_id\"")
  private String event_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="event_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> event;

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
  */
  @javax.persistence.Basic
  @Column(name="\"facilitytype_id\"")
  private String facilitytype_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="facilitytype_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> facilityType;

  /**
  * Description: "This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty."
  */
  @javax.persistence.Basic
  @Column(name="\"practicesetting_id\"")
  private String practicesetting_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="practicesetting_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> practiceSetting;

  /**
  * Description: "The Patient Information as known when the document was published. May be a reference to a version specific, or contained."
  */
  @javax.persistence.Basic
  @Column(name="\"sourcepatientinfo_id\"")
  private String sourcepatientinfo_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="sourcepatientinfo_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> sourcePatientInfo;

  /**
  * Description: "Related identifiers or resources associated with the DocumentReference."
  */
  @javax.persistence.Basic
  @Column(name="\"related_id\"")
  private String related_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="related_id", insertable=false, updatable=false)
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
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public DocumentReferenceContextModel() {
  }

  public DocumentReferenceContextModel(DocumentReferenceContext o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getEncounter() ) {
    	this.encounter_id = "encounter" + this.id;
    	this.encounter = ReferenceHelper.toModel(o.getEncounter(), this.encounter_id);
    }
    if (null != o.getEvent() && !o.getEvent().isEmpty()) {
    	this.event_id = "event" + this.id;
    	this.event = CodeableConceptHelper.toModelFromArray(o.getEvent(), this.event_id);
    }
    if (null != o.getPeriod()) {
    	this.period = JsonUtils.toJson(o.getPeriod());
    }
    if (null != o.getFacilityType() ) {
    	this.facilitytype_id = "facilitytype" + this.id;
    	this.facilityType = CodeableConceptHelper.toModel(o.getFacilityType(), this.facilitytype_id);
    }
    if (null != o.getPracticeSetting() ) {
    	this.practicesetting_id = "practicesetting" + this.id;
    	this.practiceSetting = CodeableConceptHelper.toModel(o.getPracticeSetting(), this.practicesetting_id);
    }
    if (null != o.getSourcePatientInfo() ) {
    	this.sourcepatientinfo_id = "sourcepatientinfo" + this.id;
    	this.sourcePatientInfo = ReferenceHelper.toModel(o.getSourcePatientInfo(), this.sourcepatientinfo_id);
    }
    if (null != o.getRelated() && !o.getRelated().isEmpty()) {
    	this.related_id = "related" + this.id;
    	this.related = DocumentReferenceRelatedHelper.toModelFromArray(o.getRelated(), this.related_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<ReferenceModel> getEncounter() {
    return this.encounter;
  }
  public void setEncounter( java.util.List<ReferenceModel> value) {
    this.encounter = value;
  }
  public java.util.List<CodeableConceptModel> getEvent() {
    return this.event;
  }
  public void setEvent( java.util.List<CodeableConceptModel> value) {
    this.event = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public java.util.List<CodeableConceptModel> getFacilityType() {
    return this.facilityType;
  }
  public void setFacilityType( java.util.List<CodeableConceptModel> value) {
    this.facilityType = value;
  }
  public java.util.List<CodeableConceptModel> getPracticeSetting() {
    return this.practiceSetting;
  }
  public void setPracticeSetting( java.util.List<CodeableConceptModel> value) {
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
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DocumentReferenceContextModel]:" + "\n");
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
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
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}
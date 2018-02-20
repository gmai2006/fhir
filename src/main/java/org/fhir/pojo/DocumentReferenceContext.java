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
public class DocumentReferenceContext  extends BackboneElement  {
  /**
  * Description: "Describes the clinical encounter or type of care that the document content is associated with."
  */
  protected Reference encounter;

  /**
  * Description: "This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \"History and Physical Report\" in which the procedure being documented is necessarily a \"History and Physical\" act."
  */
  protected java.util.List<CodeableConcept> event = new java.util.ArrayList<>();

  /**
  * Description: "The time period over which the service that is described by the document was provided."
  */
  protected Period period;

  /**
  * Description: "The kind of facility where the patient was seen."
  */
  protected CodeableConcept facilityType;

  /**
  * Description: "This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty."
  */
  protected CodeableConcept practiceSetting;

  /**
  * Description: "The Patient Information as known when the document was published. May be a reference to a version specific, or contained."
  */
  protected Reference sourcePatientInfo;

  /**
  * Description: "Related identifiers or resources associated with the DocumentReference."
  */
  protected java.util.List<DocumentReferenceRelated> related = new java.util.ArrayList<>();

  public DocumentReferenceContext() {
  }

  public DocumentReferenceContext(DocumentReferenceContextModel o) {
    this.id = o.getId();
    if (null != o.getEncounter() && !o.getEncounter().isEmpty()) {
      this.encounter = new Reference(o.getEncounter().get(0));
    }
    if (null != o.getEvent() && !o.getEvent().isEmpty()) {
    	this.event = CodeableConceptHelper.fromArray2Array(o.getEvent());
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
    if (null != o.getFacilityType() && !o.getFacilityType().isEmpty()) {
      this.facilityType = new CodeableConcept(o.getFacilityType().get(0));
    }
    if (null != o.getPracticeSetting() && !o.getPracticeSetting().isEmpty()) {
      this.practiceSetting = new CodeableConcept(o.getPracticeSetting().get(0));
    }
    if (null != o.getSourcePatientInfo() && !o.getSourcePatientInfo().isEmpty()) {
      this.sourcePatientInfo = new Reference(o.getSourcePatientInfo().get(0));
    }
    if (null != o.getRelated() && !o.getRelated().isEmpty()) {
    	this.related = DocumentReferenceRelatedHelper.fromArray2Array(o.getRelated());
    }
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DocumentReferenceContext]:" + "\n");
     if(this.encounter != null) builder.append("encounter" + "->" + this.encounter.toString() + "\n"); 
     if(this.event != null) builder.append("event" + "->" + this.event.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.facilityType != null) builder.append("facilityType" + "->" + this.facilityType.toString() + "\n"); 
     if(this.practiceSetting != null) builder.append("practiceSetting" + "->" + this.practiceSetting.toString() + "\n"); 
     if(this.sourcePatientInfo != null) builder.append("sourcePatientInfo" + "->" + this.sourcePatientInfo.toString() + "\n"); 
     if(this.related != null) builder.append("related" + "->" + this.related.toString() + "\n"); ;
    return builder.toString();
  }


}
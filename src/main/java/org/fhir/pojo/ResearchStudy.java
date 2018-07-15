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
import org.fhir.entity.ResearchStudyModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ResearchStudy  extends DomainResource  {
  /**
  * Description: "This is a ResearchStudy resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Identifiers assigned to this research study by the sponsor or other systems."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "A short, descriptive user-friendly label for the study."
  */
  protected String title;

  /**
  * Description: "Extensions for title"
  */
  protected transient Element _title;

  /**
  * Description: "The set of steps expected to be performed as part of the execution of the study."
  */
  protected java.util.List<Reference> protocol;

  /**
  * Description: "A larger research study of which this particular study is a component or step."
  */
  protected java.util.List<Reference> partOf;

  /**
  * Description: "The current state of the study."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc."
  */
  protected java.util.List<CodeableConcept> category;

  /**
  * Description: "The condition(s), medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about."
  */
  protected java.util.List<CodeableConcept> focus;

  /**
  * Description: "Contact details to assist a user in learning more about or engaging with the study."
  */
  protected java.util.List<ContactDetail> contact;

  /**
  * Description: "Citations, references and other related documents."
  */
  protected java.util.List<RelatedArtifact> relatedArtifact;

  /**
  * Description: "Key terms to aid in searching for or filtering the study."
  */
  protected java.util.List<CodeableConcept> keyword;

  /**
  * Description: "Indicates a country, state or other region where the study is taking place."
  */
  protected java.util.List<CodeableConcept> jurisdiction;

  /**
  * Description: "A full description of how the study is being conducted."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "Reference to a Group that defines the criteria for and quantity of subjects participating in the study.  E.g. \" 200 female Europeans between the ages of 20 and 45 with early onset diabetes\"."
  */
  protected java.util.List<Reference> enrollment;

  /**
  * Description: "Identifies the start date and the expected (or actual, depending on status) end date for the study."
  */
  protected Period period;

  /**
  * Description: "The organization responsible for the execution of the study."
  */
  protected Reference sponsor;

  /**
  * Description: "Indicates the individual who has primary oversite of the execution of the study."
  */
  protected Reference principalInvestigator;

  /**
  * Description: "Clinic, hospital or other healthcare location that is participating in the study."
  */
  protected java.util.List<Reference> site;

  /**
  * Description: "A description and/or code explaining the premature termination of the study."
  */
  protected CodeableConcept reasonStopped;

  /**
  * Description: "Comments made about the event by the performer, subject or other participants."
  */
  protected java.util.List<Annotation> note;

  /**
  * Description: "Describes an expected sequence of events for one of the participants of a study.  E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up."
  */
  protected java.util.List<ResearchStudyArm> arm;

  public ResearchStudy() {
  }

  public ResearchStudy(ResearchStudyModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
    if (null != o.getTitle()) {
      this.title = o.getTitle();
    }
    if (null != o.getProtocol() && !o.getProtocol().isEmpty()) {
    	this.protocol = ReferenceHelper.fromArray2Array(o.getProtocol());
    }
    if (null != o.getPartOf() && !o.getPartOf().isEmpty()) {
    	this.partOf = ReferenceHelper.fromArray2Array(o.getPartOf());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
    	this.category = CodeableConceptHelper.fromArray2Array(o.getCategory());
    }
    if (null != o.getFocus() && !o.getFocus().isEmpty()) {
    	this.focus = CodeableConceptHelper.fromArray2Array(o.getFocus());
    }
    if (null != o.getContact() && !o.getContact().isEmpty()) {
    	this.contact = ContactDetailHelper.fromArray2Array(o.getContact());
    }
    if (null != o.getRelatedArtifact() && !o.getRelatedArtifact().isEmpty()) {
    	this.relatedArtifact = RelatedArtifactHelper.fromArray2Array(o.getRelatedArtifact());
    }
    if (null != o.getKeyword() && !o.getKeyword().isEmpty()) {
    	this.keyword = CodeableConceptHelper.fromArray2Array(o.getKeyword());
    }
    if (null != o.getJurisdiction() && !o.getJurisdiction().isEmpty()) {
    	this.jurisdiction = CodeableConceptHelper.fromArray2Array(o.getJurisdiction());
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getEnrollment() && !o.getEnrollment().isEmpty()) {
    	this.enrollment = ReferenceHelper.fromArray2Array(o.getEnrollment());
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
    if (null != o.getSponsor() && !o.getSponsor().isEmpty()) {
      this.sponsor = new Reference(o.getSponsor().get(0));
    }
    if (null != o.getPrincipalInvestigator() && !o.getPrincipalInvestigator().isEmpty()) {
      this.principalInvestigator = new Reference(o.getPrincipalInvestigator().get(0));
    }
    if (null != o.getSite() && !o.getSite().isEmpty()) {
    	this.site = ReferenceHelper.fromArray2Array(o.getSite());
    }
    if (null != o.getReasonStopped() && !o.getReasonStopped().isEmpty()) {
      this.reasonStopped = new CodeableConcept(o.getReasonStopped().get(0));
    }
    if (o.getNote() != null) {
    	this.note = org.fhir.utils.JsonUtils.json2Array(o.getNote());
    }
    if (null != o.getArm() && !o.getArm().isEmpty()) {
    	this.arm = ResearchStudyArmHelper.fromArray2Array(o.getArm());
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
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void set_title( Element value) {
    this._title = value;
  }
  public Element get_title() {
    return this._title;
  }
  public void setProtocol( java.util.List<Reference> value) {
    this.protocol = value;
  }
  public java.util.List<Reference> getProtocol() {
    return this.protocol;
  }
  public void setPartOf( java.util.List<Reference> value) {
    this.partOf = value;
  }
  public java.util.List<Reference> getPartOf() {
    return this.partOf;
  }
  public void setStatus( String value) {
    this.status = StatusEnum.fromCode(value);
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
  public void setCategory( java.util.List<CodeableConcept> value) {
    this.category = value;
  }
  public java.util.List<CodeableConcept> getCategory() {
    return this.category;
  }
  public void setFocus( java.util.List<CodeableConcept> value) {
    this.focus = value;
  }
  public java.util.List<CodeableConcept> getFocus() {
    return this.focus;
  }
  public void setContact( java.util.List<ContactDetail> value) {
    this.contact = value;
  }
  public java.util.List<ContactDetail> getContact() {
    return this.contact;
  }
  public void setRelatedArtifact( java.util.List<RelatedArtifact> value) {
    this.relatedArtifact = value;
  }
  public java.util.List<RelatedArtifact> getRelatedArtifact() {
    return this.relatedArtifact;
  }
  public void setKeyword( java.util.List<CodeableConcept> value) {
    this.keyword = value;
  }
  public java.util.List<CodeableConcept> getKeyword() {
    return this.keyword;
  }
  public void setJurisdiction( java.util.List<CodeableConcept> value) {
    this.jurisdiction = value;
  }
  public java.util.List<CodeableConcept> getJurisdiction() {
    return this.jurisdiction;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setEnrollment( java.util.List<Reference> value) {
    this.enrollment = value;
  }
  public java.util.List<Reference> getEnrollment() {
    return this.enrollment;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setSponsor( Reference value) {
    this.sponsor = value;
  }
  public Reference getSponsor() {
    return this.sponsor;
  }
  public void setPrincipalInvestigator( Reference value) {
    this.principalInvestigator = value;
  }
  public Reference getPrincipalInvestigator() {
    return this.principalInvestigator;
  }
  public void setSite( java.util.List<Reference> value) {
    this.site = value;
  }
  public java.util.List<Reference> getSite() {
    return this.site;
  }
  public void setReasonStopped( CodeableConcept value) {
    this.reasonStopped = value;
  }
  public CodeableConcept getReasonStopped() {
    return this.reasonStopped;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setArm( java.util.List<ResearchStudyArm> value) {
    this.arm = value;
  }
  public java.util.List<ResearchStudyArm> getArm() {
    return this.arm;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ResearchStudy]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.title != null) builder.append("title" + "->" + this.title.toString() + "\n"); 
     if(this._title != null) builder.append("_title" + "->" + this._title.toString() + "\n"); 
     if(this.protocol != null) builder.append("protocol" + "->" + this.protocol.toString() + "\n"); 
     if(this.partOf != null) builder.append("partOf" + "->" + this.partOf.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.focus != null) builder.append("focus" + "->" + this.focus.toString() + "\n"); 
     if(this.contact != null) builder.append("contact" + "->" + this.contact.toString() + "\n"); 
     if(this.relatedArtifact != null) builder.append("relatedArtifact" + "->" + this.relatedArtifact.toString() + "\n"); 
     if(this.keyword != null) builder.append("keyword" + "->" + this.keyword.toString() + "\n"); 
     if(this.jurisdiction != null) builder.append("jurisdiction" + "->" + this.jurisdiction.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.enrollment != null) builder.append("enrollment" + "->" + this.enrollment.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.sponsor != null) builder.append("sponsor" + "->" + this.sponsor.toString() + "\n"); 
     if(this.principalInvestigator != null) builder.append("principalInvestigator" + "->" + this.principalInvestigator.toString() + "\n"); 
     if(this.site != null) builder.append("site" + "->" + this.site.toString() + "\n"); 
     if(this.reasonStopped != null) builder.append("reasonStopped" + "->" + this.reasonStopped.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.arm != null) builder.append("arm" + "->" + this.arm.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	ResearchStudy,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ResearchStudy" : { return ResearchStudy.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum StatusEnum {
  	draft,
  	inprogress,
  	suspended,
  	stopped,
  	completed,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "draft" : { return draft.toString(); }
  			case "inprogress" : { return inprogress.toString(); }
  			case "suspended" : { return suspended.toString(); }
  			case "stopped" : { return stopped.toString(); }
  			case "completed" : { return completed.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}
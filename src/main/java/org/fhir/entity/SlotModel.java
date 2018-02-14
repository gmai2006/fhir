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
* "A slot of time on a schedule that may be available for booking appointments."
*/
@Entity
@Table(name="slot")
public class SlotModel  implements Serializable {
	private static final long serialVersionUID = 151857669688224072L;
  /**
  * Description: "This is a Slot resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "External Ids for this item."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "A broad categorisation of the service that is to be performed during this appointment."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"serviceCategory\"", length = 16777215)
  private String serviceCategory;

  /**
  * Description: "The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"serviceType\"", length = 16777215)
  private String serviceType;

  /**
  * Description: "The specialty of a practitioner that would be required to perform the service requested in this appointment."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"specialty\"", length = 16777215)
  private String specialty;

  /**
  * Description: "The style of appointment or patient that may be booked in the slot (not service type)."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"appointmentType\"", length = 16777215)
  private String appointmentType;

  /**
  * Description: "The schedule resource that this slot defines an interval of status information."
  */
  @javax.persistence.Basic
  @Column(name="\"schedule_id\"")
  private String schedule_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="schedule_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> schedule;

  /**
  * Description: "busy | free | busy-unavailable | busy-tentative | entered-in-error."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Date/Time that the slot is to begin."
  */
  @javax.persistence.Basic
  @Column(name="\"start\"")
  private String start;

  /**
  * Description: "Date/Time that the slot is to conclude."
  */
  @javax.persistence.Basic
  @Column(name="\"end\"")
  private String end;

  /**
  * Description: "This slot has already been overbooked, appointments are unlikely to be accepted for this time."
  */
  @javax.persistence.Basic
  @Column(name="\"overbooked\"")
  private Boolean overbooked;

  /**
  * Description: "Comments on the slot to describe any extended information. Such as custom constraints on the slot."
  */
  @javax.persistence.Basic
  @Column(name="\"comment\"")
  private String comment;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"meta_id\"")
  private String meta_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"implicitRules\"")
  private String implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"language\"")
  private String language;

  public SlotModel() {
  }

  public SlotModel(Slot o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.serviceCategory = CodeableConceptHelper.toJson(o.getServiceCategory());
    this.appointmentType = CodeableConceptHelper.toJson(o.getAppointmentType());
    if (null != o.getSchedule() ) {
    	this.schedule_id = "schedule" + this.id;
    	this.schedule = ReferenceHelper.toModel(o.getSchedule(), this.schedule_id);
    }
    this.status = o.getStatus();
    this.start = o.getStart();
    this.end = o.getEnd();
    this.overbooked = o.getOverbooked();
    this.comment = o.getComment();
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getMeta() ) {
    	this.meta_id = "meta" + this.id;
    	this.meta = MetaHelper.toModel(o.getMeta(), this.meta_id);
    }
    this.implicitRules = o.getImplicitRules();
    this.language = o.getLanguage();
  }

  public String getResourceType() {
    return this.resourceType;
  }
  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getServiceCategory() {
    return this.serviceCategory;
  }
  public void setServiceCategory( String value) {
    this.serviceCategory = value;
  }
  public String getServiceType() {
    return this.serviceType;
  }
  public void setServiceType( String value) {
    this.serviceType = value;
  }
  public String getSpecialty() {
    return this.specialty;
  }
  public void setSpecialty( String value) {
    this.specialty = value;
  }
  public String getAppointmentType() {
    return this.appointmentType;
  }
  public void setAppointmentType( String value) {
    this.appointmentType = value;
  }
  public java.util.List<ReferenceModel> getSchedule() {
    return this.schedule;
  }
  public void setSchedule( java.util.List<ReferenceModel> value) {
    this.schedule = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStart() {
    return this.start;
  }
  public void setStart( String value) {
    this.start = value;
  }
  public String getEnd() {
    return this.end;
  }
  public void setEnd( String value) {
    this.end = value;
  }
  public Boolean getOverbooked() {
    return this.overbooked;
  }
  public void setOverbooked( Boolean value) {
    this.overbooked = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public java.util.List<NarrativeModel> getText() {
    return this.text;
  }
  public void setText( java.util.List<NarrativeModel> value) {
    this.text = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
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
  public java.util.List<MetaModel> getMeta() {
    return this.meta;
  }
  public void setMeta( java.util.List<MetaModel> value) {
    this.meta = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage( String value) {
    this.language = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SlotModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("serviceCategory" + "->" + this.serviceCategory + "\n"); 
     builder.append("serviceType" + "->" + this.serviceType + "\n"); 
     builder.append("specialty" + "->" + this.specialty + "\n"); 
     builder.append("appointmentType" + "->" + this.appointmentType + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("start" + "->" + this.start + "\n"); 
     builder.append("end" + "->" + this.end + "\n"); 
     builder.append("overbooked" + "->" + this.overbooked + "\n"); 
     builder.append("comment" + "->" + this.comment + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SlotModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("serviceCategory" + "->" + this.serviceCategory + "\n"); 
     builder.append("serviceType" + "->" + this.serviceType + "\n"); 
     builder.append("specialty" + "->" + this.specialty + "\n"); 
     builder.append("appointmentType" + "->" + this.appointmentType + "\n"); 
     builder.append("schedule" + "->" + this.schedule + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("start" + "->" + this.start + "\n"); 
     builder.append("end" + "->" + this.end + "\n"); 
     builder.append("overbooked" + "->" + this.overbooked + "\n"); 
     builder.append("comment" + "->" + this.comment + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("meta" + "->" + this.meta + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}
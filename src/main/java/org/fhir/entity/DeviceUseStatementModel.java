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
* "A record of a device being used by a patient where the record is the result of a report from the patient or another clinician."
*/
@Entity
@Table(name="deviceusestatement")
public class DeviceUseStatementModel  {
  /**
  * Description: "This is a DeviceUseStatement resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "An external identifier for this statement such as an IRI."
  * Actual type: Array of Identifier-> List<Identifier>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "A code representing the patient or other source's judgment about the state of the device used that this statement is about.  Generally this will be active or completed."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "The patient who used the device."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`subject_id`", insertable=false, updatable=false)
  private ReferenceModel subject;

  /**
  * Description: "The time period over which the device was used."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"whenUsed\"", length = 16777215)
  private String whenUsed;

  /**
  * Description: "How often the device was used."
  * Actual type: Timing
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"timingTiming\"", length = 16777215)
  private String timingTiming;

  /**
  * Description: "How often the device was used."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"timingPeriod\"", length = 16777215)
  private String timingPeriod;

  /**
  * Description: "How often the device was used."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"timingDateTime\"")
  private String timingDateTime;

  /**
  * Description: "The time at which the statement was made/recorded."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"recordedOn\"")
  private String recordedOn;

  /**
  * Description: "Who reported the device was being used by the patient."
  */
  @javax.persistence.Basic
  @Column(name="\"source_id\"")
  private String source_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`source_id`", insertable=false, updatable=false)
  private ReferenceModel source;

  /**
  * Description: "The details of the device used."
  */
  @javax.persistence.Basic
  @Column(name="\"device_id\"")
  private String device_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`device_id`", insertable=false, updatable=false)
  private ReferenceModel device;

  /**
  * Description: "Reason or justification for the use of the device."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"indication\"", length = 16777215)
  private String indication;

  /**
  * Description: "Indicates the site on the subject's body where the device was used ( i.e. the target site)."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"bodySite\"", length = 16777215)
  private String bodySite;

  /**
  * Description: "Details about the device statement that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement."
  * Actual type: Array of Annotation-> List<Annotation>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`text_id`", insertable=false, updatable=false)
  private NarrativeModel text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: Array of ResourceList-> List<ResourceList>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

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


  public DeviceUseStatementModel() {
  }

  public DeviceUseStatementModel(DeviceUseStatement o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.status = o.getStatus();

      if (null != o.getSubject()) {
      	this.subject_id = "subject" + this.getId();
        this.subject = new ReferenceModel(o.getSubject());
        this.subject.setId(this.subject_id);
        this.subject.parent_id = this.subject.getId();
      }

      this.whenUsed = Period.toJson(o.getWhenUsed());
      this.timingTiming = Timing.toJson(o.getTimingTiming());
      this.timingPeriod = Period.toJson(o.getTimingPeriod());
      this.timingDateTime = o.getTimingDateTime();

      this.recordedOn = o.getRecordedOn();

      if (null != o.getSource()) {
      	this.source_id = "source" + this.getId();
        this.source = new ReferenceModel(o.getSource());
        this.source.setId(this.source_id);
        this.source.parent_id = this.source.getId();
      }

      if (null != o.getDevice()) {
      	this.device_id = "device" + this.getId();
        this.device = new ReferenceModel(o.getDevice());
        this.device.setId(this.device_id);
        this.device.parent_id = this.device.getId();
      }

      this.indication = CodeableConcept.toJson(o.getIndication());
      this.bodySite = CodeableConcept.toJson(o.getBodySite());
      this.note = Annotation.toJson(o.getNote());
      if (null != o.getText()) {
      	this.text_id = "text" + this.getId();
        this.text = new NarrativeModel(o.getText());
        this.text.setId(this.text_id);
        this.text.parent_id = this.text.getId();
      }

      this.contained = ResourceList.toJson(o.getContained());
      this.extension = Extension.toJson(o.getExtension());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

  }

  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setSubject( ReferenceModel value) {
    this.subject = value;
  }
  public ReferenceModel getSubject() {
    return this.subject;
  }
  public void setWhenUsed( String value) {
    this.whenUsed = value;
  }
  public String getWhenUsed() {
    return this.whenUsed;
  }
  public void setTimingTiming( String value) {
    this.timingTiming = value;
  }
  public String getTimingTiming() {
    return this.timingTiming;
  }
  public void setTimingPeriod( String value) {
    this.timingPeriod = value;
  }
  public String getTimingPeriod() {
    return this.timingPeriod;
  }
  public void setTimingDateTime( String value) {
    this.timingDateTime = value;
  }
  public String getTimingDateTime() {
    return this.timingDateTime;
  }
  public void setRecordedOn( String value) {
    this.recordedOn = value;
  }
  public String getRecordedOn() {
    return this.recordedOn;
  }
  public void setSource( ReferenceModel value) {
    this.source = value;
  }
  public ReferenceModel getSource() {
    return this.source;
  }
  public void setDevice( ReferenceModel value) {
    this.device = value;
  }
  public ReferenceModel getDevice() {
    return this.device;
  }
  public void setIndication( String value) {
    this.indication = value;
  }
  public String getIndication() {
    return this.indication;
  }
  public void setBodySite( String value) {
    this.bodySite = value;
  }
  public String getBodySite() {
    return this.bodySite;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setText( NarrativeModel value) {
    this.text = value;
  }
  public NarrativeModel getText() {
    return this.text;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
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
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("whenUsed" + "[" + String.valueOf(this.whenUsed) + "]\n"); 
     builder.append("timingTiming" + "[" + String.valueOf(this.timingTiming) + "]\n"); 
     builder.append("timingPeriod" + "[" + String.valueOf(this.timingPeriod) + "]\n"); 
     builder.append("timingDateTime" + "[" + String.valueOf(this.timingDateTime) + "]\n"); 
     builder.append("recordedOn" + "[" + String.valueOf(this.recordedOn) + "]\n"); 
     builder.append("source" + "[" + String.valueOf(this.source) + "]\n"); 
     builder.append("device" + "[" + String.valueOf(this.device) + "]\n"); 
     builder.append("indication" + "[" + String.valueOf(this.indication) + "]\n"); 
     builder.append("bodySite" + "[" + String.valueOf(this.bodySite) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}
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
* "A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference."
*/
@Entity
@Table(name="media")
public class MediaModel  {
  /**
  * Description: "This is a Media resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers."
  * Actual type: Array of Identifier-> List<Identifier>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "A procedure that is fulfilled in whole or in part by the creation of this media."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "Whether the media is a photo (still image), an audio recording, or a video recording."
  */
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "Details of the type of the media - usually, how it was acquired (what type of device). If images sourced from a DICOM system, are wrapped in a Media resource, then this is the modality."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"subtype\"", length = 16777215)
  private String subtype;

  /**
  * Description: "The name of the imaging view e.g. Lateral or Antero-posterior (AP)."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"view\"", length = 16777215)
  private String view;

  /**
  * Description: "Who/What this Media is a record of."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`subject_id`", insertable=false, updatable=false)
  private ReferenceModel subject;

  /**
  * Description: "The encounter or episode of care that establishes the context for this media."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`context_id`", insertable=false, updatable=false)
  private ReferenceModel context;

  /**
  * Description: "The date and time(s) at which the media was collected."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"occurrenceDateTime\"")
  private String occurrenceDateTime;

  /**
  * Description: "The date and time(s) at which the media was collected."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"occurrencePeriod\"", length = 16777215)
  private String occurrencePeriod;

  /**
  * Description: "The person who administered the collection of the image."
  */
  @javax.persistence.Basic
  @Column(name="\"operator_id\"")
  private String operator_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`operator_id`", insertable=false, updatable=false)
  private ReferenceModel operator;

  /**
  * Description: "Describes why the event occurred in coded or textual form."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reasonCode\"", length = 16777215)
  private String reasonCode;

  /**
  * Description: "Indicates the site on the subject's body where the media was collected (i.e. the target site)."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"bodySite\"", length = 16777215)
  private String bodySite;

  /**
  * Description: "The device used to collect the media."
  */
  @javax.persistence.Basic
  @Column(name="\"device_id\"")
  private String device_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`device_id`", insertable=false, updatable=false)
  private ReferenceModel device;

  /**
  * Description: "Height of the image in pixels (photo/video)."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"height\"")
  private Float height;

  /**
  * Description: "Width of the image in pixels (photo/video)."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"width\"")
  private Float width;

  /**
  * Description: "The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"frames\"")
  private Float frames;

  /**
  * Description: "The duration of the recording in seconds - for audio and video."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  @javax.persistence.Basic
  @Column(name="\"duration\"")
  private Float duration;

  /**
  * Description: "The actual content of the media - inline or by direct reference to the media source file."
  * Actual type: Attachment
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"content\"", length = 16777215)
  private String content;

  /**
  * Description: "Comments made about the media by the performer, subject or other participants."
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


  public MediaModel() {
  }

  public MediaModel(Media o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.basedOn = Reference.toModelArray(o.getBasedOn());

      this.type = o.getType();

      this.subtype = CodeableConcept.toJson(o.getSubtype());
      this.view = CodeableConcept.toJson(o.getView());
      if (null != o.getSubject()) {
      	this.subject_id = "subject" + this.getId();
        this.subject = new ReferenceModel(o.getSubject());
        this.subject.setId(this.subject_id);
        this.subject.parent_id = this.subject.getId();
      }

      if (null != o.getContext()) {
      	this.context_id = "context" + this.getId();
        this.context = new ReferenceModel(o.getContext());
        this.context.setId(this.context_id);
        this.context.parent_id = this.context.getId();
      }

      this.occurrenceDateTime = o.getOccurrenceDateTime();

      this.occurrencePeriod = Period.toJson(o.getOccurrencePeriod());
      if (null != o.getOperator()) {
      	this.operator_id = "operator" + this.getId();
        this.operator = new ReferenceModel(o.getOperator());
        this.operator.setId(this.operator_id);
        this.operator.parent_id = this.operator.getId();
      }

      this.reasonCode = CodeableConcept.toJson(o.getReasonCode());
      this.bodySite = CodeableConcept.toJson(o.getBodySite());
      if (null != o.getDevice()) {
      	this.device_id = "device" + this.getId();
        this.device = new ReferenceModel(o.getDevice());
        this.device.setId(this.device_id);
        this.device.parent_id = this.device.getId();
      }

      this.height = o.getHeight();

      this.width = o.getWidth();

      this.frames = o.getFrames();

      this.duration = o.getDuration();

      this.content = Attachment.toJson(o.getContent());
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
  public void setBasedOn( java.util.List<ReferenceModel> value) {
    this.basedOn = value;
  }
  public java.util.List<ReferenceModel> getBasedOn() {
    return this.basedOn;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setSubtype( String value) {
    this.subtype = value;
  }
  public String getSubtype() {
    return this.subtype;
  }
  public void setView( String value) {
    this.view = value;
  }
  public String getView() {
    return this.view;
  }
  public void setSubject( ReferenceModel value) {
    this.subject = value;
  }
  public ReferenceModel getSubject() {
    return this.subject;
  }
  public void setContext( ReferenceModel value) {
    this.context = value;
  }
  public ReferenceModel getContext() {
    return this.context;
  }
  public void setOccurrenceDateTime( String value) {
    this.occurrenceDateTime = value;
  }
  public String getOccurrenceDateTime() {
    return this.occurrenceDateTime;
  }
  public void setOccurrencePeriod( String value) {
    this.occurrencePeriod = value;
  }
  public String getOccurrencePeriod() {
    return this.occurrencePeriod;
  }
  public void setOperator( ReferenceModel value) {
    this.operator = value;
  }
  public ReferenceModel getOperator() {
    return this.operator;
  }
  public void setReasonCode( String value) {
    this.reasonCode = value;
  }
  public String getReasonCode() {
    return this.reasonCode;
  }
  public void setBodySite( String value) {
    this.bodySite = value;
  }
  public String getBodySite() {
    return this.bodySite;
  }
  public void setDevice( ReferenceModel value) {
    this.device = value;
  }
  public ReferenceModel getDevice() {
    return this.device;
  }
  public void setHeight( Float value) {
    this.height = value;
  }
  public Float getHeight() {
    return this.height;
  }
  public void setWidth( Float value) {
    this.width = value;
  }
  public Float getWidth() {
    return this.width;
  }
  public void setFrames( Float value) {
    this.frames = value;
  }
  public Float getFrames() {
    return this.frames;
  }
  public void setDuration( Float value) {
    this.duration = value;
  }
  public Float getDuration() {
    return this.duration;
  }
  public void setContent( String value) {
    this.content = value;
  }
  public String getContent() {
    return this.content;
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
     builder.append("basedOn" + "[" + String.valueOf(this.basedOn) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("subtype" + "[" + String.valueOf(this.subtype) + "]\n"); 
     builder.append("view" + "[" + String.valueOf(this.view) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("occurrenceDateTime" + "[" + String.valueOf(this.occurrenceDateTime) + "]\n"); 
     builder.append("occurrencePeriod" + "[" + String.valueOf(this.occurrencePeriod) + "]\n"); 
     builder.append("operator" + "[" + String.valueOf(this.operator) + "]\n"); 
     builder.append("reasonCode" + "[" + String.valueOf(this.reasonCode) + "]\n"); 
     builder.append("bodySite" + "[" + String.valueOf(this.bodySite) + "]\n"); 
     builder.append("device" + "[" + String.valueOf(this.device) + "]\n"); 
     builder.append("height" + "[" + String.valueOf(this.height) + "]\n"); 
     builder.append("width" + "[" + String.valueOf(this.width) + "]\n"); 
     builder.append("frames" + "[" + String.valueOf(this.frames) + "]\n"); 
     builder.append("duration" + "[" + String.valueOf(this.duration) + "]\n"); 
     builder.append("content" + "[" + String.valueOf(this.content) + "]\n"); 
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
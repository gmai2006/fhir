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
import org.fhir.entity.MediaModel;
import com.google.gson.GsonBuilder;

/**
* "A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference."
*/
public class Media  {
  /**
  * Description: "This is a Media resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "A procedure that is fulfilled in whole or in part by the creation of this media."
  */
  private java.util.List<Reference> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "Whether the media is a photo (still image), an audio recording, or a video recording."
  */
  private String type;

  /**
  * Description: "Extensions for type"
  */
  private transient Element _type;

  /**
  * Description: "Details of the type of the media - usually, how it was acquired (what type of device). If images sourced from a DICOM system, are wrapped in a Media resource, then this is the modality."
  */
  private CodeableConcept subtype;

  /**
  * Description: "The name of the imaging view e.g. Lateral or Antero-posterior (AP)."
  */
  private CodeableConcept view;

  /**
  * Description: "Who/What this Media is a record of."
  */
  private Reference subject;

  /**
  * Description: "The encounter or episode of care that establishes the context for this media."
  */
  private Reference context;

  /**
  * Description: "The date and time(s) at which the media was collected."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String occurrenceDateTime;

  /**
  * Description: "Extensions for occurrenceDateTime"
  */
  private transient Element _occurrenceDateTime;

  /**
  * Description: "The date and time(s) at which the media was collected."
  */
  private Period occurrencePeriod;

  /**
  * Description: "The person who administered the collection of the image."
  */
  private Reference operator;

  /**
  * Description: "Describes why the event occurred in coded or textual form."
  */
  private java.util.List<CodeableConcept> reasonCode = new java.util.ArrayList<>();

  /**
  * Description: "Indicates the site on the subject's body where the media was collected (i.e. the target site)."
  */
  private CodeableConcept bodySite;

  /**
  * Description: "The device used to collect the media."
  */
  private Reference device;

  /**
  * Description: "Height of the image in pixels (photo/video)."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float height;

  /**
  * Description: "Extensions for height"
  */
  private transient Element _height;

  /**
  * Description: "Width of the image in pixels (photo/video)."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float width;

  /**
  * Description: "Extensions for width"
  */
  private transient Element _width;

  /**
  * Description: "The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float frames;

  /**
  * Description: "Extensions for frames"
  */
  private transient Element _frames;

  /**
  * Description: "The duration of the recording in seconds - for audio and video."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  private Float duration;

  /**
  * Description: "Extensions for duration"
  */
  private transient Element _duration;

  /**
  * Description: "The actual content of the media - inline or by direct reference to the media source file."
  */
  @javax.validation.constraints.NotNull
  private Attachment content;

  /**
  * Description: "Comments made about the media by the performer, subject or other participants."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  private Narrative text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  */
  private java.util.List<ResourceList> contained = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _language;

  public Media() {
  }

  public Media(MediaModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      this.basedOn = Reference.fromArray(o.getBasedOn());

      if (null != o.getType()) {
        this.type = new String(o.getType());
      }

      this.subtype = CodeableConcept.fromJson(o.getSubtype());
      this.view = CodeableConcept.fromJson(o.getView());
      if (null != o.getSubject()) {
        this.subject = new Reference(o.getSubject());
        this.subject.setId(this.getId());
      }

      if (null != o.getContext()) {
        this.context = new Reference(o.getContext());
        this.context.setId(this.getId());
      }

      if (null != o.getOccurrenceDateTime()) {
        this.occurrenceDateTime = new String(o.getOccurrenceDateTime());
      }

      this.occurrencePeriod = Period.fromJson(o.getOccurrencePeriod());
      if (null != o.getOperator()) {
        this.operator = new Reference(o.getOperator());
        this.operator.setId(this.getId());
      }

      this.reasonCode = CodeableConcept.fromArray(o.getReasonCode());
      this.bodySite = CodeableConcept.fromJson(o.getBodySite());
      if (null != o.getDevice()) {
        this.device = new Reference(o.getDevice());
        this.device.setId(this.getId());
      }

      if (null != o.getHeight()) {
        this.height = new Float(o.getHeight());
      }

      if (null != o.getWidth()) {
        this.width = new Float(o.getWidth());
      }

      if (null != o.getFrames()) {
        this.frames = new Float(o.getFrames());
      }

      if (null != o.getDuration()) {
        this.duration = new Float(o.getDuration());
      }

      this.content = Attachment.fromJson(o.getContent());
      this.note = Annotation.fromArray(o.getNote());
      if (null != o.getText()) {
        this.text = new Narrative(o.getText());
        this.text.setId(this.getId());
      }

      this.contained = ResourceList.fromArray(o.getContained());
      this.extension = Extension.fromArray(o.getExtension());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      if (null != o.getMeta()) {
        this.meta = new Meta(o.getMeta());
        this.meta.setId(this.getId());
      }

      if (null != o.getImplicitRules()) {
        this.implicitRules = new String(o.getImplicitRules());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
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
  public void setBasedOn( java.util.List<Reference> value) {
    this.basedOn = value;
  }
  public java.util.List<Reference> getBasedOn() {
    return this.basedOn;
  }
  public void setType( String value) {
    this.type = TypeEnum.fromCode(value);
  }
  public String getType() {
    return this.type;
  }
  public void set_type( Element value) {
    this._type = value;
  }
  public Element get_type() {
    return this._type;
  }
  public void setSubtype( CodeableConcept value) {
    this.subtype = value;
  }
  public CodeableConcept getSubtype() {
    return this.subtype;
  }
  public void setView( CodeableConcept value) {
    this.view = value;
  }
  public CodeableConcept getView() {
    return this.view;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setContext( Reference value) {
    this.context = value;
  }
  public Reference getContext() {
    return this.context;
  }
  public void setOccurrenceDateTime( String value) {
    this.occurrenceDateTime = value;
  }
  public String getOccurrenceDateTime() {
    return this.occurrenceDateTime;
  }
  public void set_occurrenceDateTime( Element value) {
    this._occurrenceDateTime = value;
  }
  public Element get_occurrenceDateTime() {
    return this._occurrenceDateTime;
  }
  public void setOccurrencePeriod( Period value) {
    this.occurrencePeriod = value;
  }
  public Period getOccurrencePeriod() {
    return this.occurrencePeriod;
  }
  public void setOperator( Reference value) {
    this.operator = value;
  }
  public Reference getOperator() {
    return this.operator;
  }
  public void setReasonCode( java.util.List<CodeableConcept> value) {
    this.reasonCode = value;
  }
  public java.util.List<CodeableConcept> getReasonCode() {
    return this.reasonCode;
  }
  public void setBodySite( CodeableConcept value) {
    this.bodySite = value;
  }
  public CodeableConcept getBodySite() {
    return this.bodySite;
  }
  public void setDevice( Reference value) {
    this.device = value;
  }
  public Reference getDevice() {
    return this.device;
  }
  public void setHeight( Float value) {
    this.height = value;
  }
  public Float getHeight() {
    return this.height;
  }
  public void set_height( Element value) {
    this._height = value;
  }
  public Element get_height() {
    return this._height;
  }
  public void setWidth( Float value) {
    this.width = value;
  }
  public Float getWidth() {
    return this.width;
  }
  public void set_width( Element value) {
    this._width = value;
  }
  public Element get_width() {
    return this._width;
  }
  public void setFrames( Float value) {
    this.frames = value;
  }
  public Float getFrames() {
    return this.frames;
  }
  public void set_frames( Element value) {
    this._frames = value;
  }
  public Element get_frames() {
    return this._frames;
  }
  public void setDuration( Float value) {
    this.duration = value;
  }
  public Float getDuration() {
    return this.duration;
  }
  public void set_duration( Element value) {
    this._duration = value;
  }
  public Element get_duration() {
    return this._duration;
  }
  public void setContent( Attachment value) {
    this.content = value;
  }
  public Attachment getContent() {
    return this.content;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setText( Narrative value) {
    this.text = value;
  }
  public Narrative getText() {
    return this.text;
  }
  public void setContained( java.util.List<ResourceList> value) {
    this.contained = value;
  }
  public java.util.List<ResourceList> getContained() {
    return this.contained;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
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
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("basedOn" + "[" + String.valueOf(this.basedOn) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("_type" + "[" + String.valueOf(this._type) + "]\n"); 
     builder.append("subtype" + "[" + String.valueOf(this.subtype) + "]\n"); 
     builder.append("view" + "[" + String.valueOf(this.view) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("occurrenceDateTime" + "[" + String.valueOf(this.occurrenceDateTime) + "]\n"); 
     builder.append("_occurrenceDateTime" + "[" + String.valueOf(this._occurrenceDateTime) + "]\n"); 
     builder.append("occurrencePeriod" + "[" + String.valueOf(this.occurrencePeriod) + "]\n"); 
     builder.append("operator" + "[" + String.valueOf(this.operator) + "]\n"); 
     builder.append("reasonCode" + "[" + String.valueOf(this.reasonCode) + "]\n"); 
     builder.append("bodySite" + "[" + String.valueOf(this.bodySite) + "]\n"); 
     builder.append("device" + "[" + String.valueOf(this.device) + "]\n"); 
     builder.append("height" + "[" + String.valueOf(this.height) + "]\n"); 
     builder.append("_height" + "[" + String.valueOf(this._height) + "]\n"); 
     builder.append("width" + "[" + String.valueOf(this.width) + "]\n"); 
     builder.append("_width" + "[" + String.valueOf(this._width) + "]\n"); 
     builder.append("frames" + "[" + String.valueOf(this.frames) + "]\n"); 
     builder.append("_frames" + "[" + String.valueOf(this._frames) + "]\n"); 
     builder.append("duration" + "[" + String.valueOf(this.duration) + "]\n"); 
     builder.append("_duration" + "[" + String.valueOf(this._duration) + "]\n"); 
     builder.append("content" + "[" + String.valueOf(this.content) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Media,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Media" : { return Media.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum TypeEnum {
  	photo,
  	video,
  	audio,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "photo" : { return photo.toString(); }
  			case "video" : { return video.toString(); }
  			case "audio" : { return audio.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<Media> fromArray(java.util.List<MediaModel> list) {
    return (java.util.List<Media>)list.stream()
      .map(model -> new Media(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<MediaModel> toModelArray(java.util.List<Media> list) {
    return (java.util.List<MediaModel>)list.stream()
      .map(model -> new MediaModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Media fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Media.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Media o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Media> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
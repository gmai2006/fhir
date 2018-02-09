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
import org.fhir.entity.CompositionModel;
import com.google.gson.GsonBuilder;

/**
* "A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained."
*/
public class Composition  {
  /**
  * Description: "This is a Composition resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Logical identifier for the composition, assigned when created. This identifier stays constant as the composition is changed over time."
  */
  private Identifier identifier;

  /**
  * Description: "The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept type;

  /**
  * Description: "A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type."
  */
  private CodeableConcept FHIRclass;

  /**
  * Description: "Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure)."
  */
  @javax.validation.constraints.NotNull
  private Reference subject;

  /**
  * Description: "Describes the clinical encounter or type of care this documentation is associated with."
  */
  private Reference encounter;

  /**
  * Description: "The composition editing time, when the composition was last logically changed by the author."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String date;

  /**
  * Description: "Extensions for date"
  */
  private transient Element _date;

  /**
  * Description: "Identifies who is responsible for the information in the composition, not necessarily who typed it in."
  */
  @javax.validation.constraints.NotNull
  private java.util.List<Reference> author = new java.util.ArrayList<>();

  /**
  * Description: "Official human-readable label for the composition."
  */
  private String title;

  /**
  * Description: "Extensions for title"
  */
  private transient Element _title;

  /**
  * Description: "The code specifying the level of confidentiality of the Composition."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String confidentiality;

  /**
  * Description: "Extensions for confidentiality"
  */
  private transient Element _confidentiality;

  /**
  * Description: "A participant who has attested to the accuracy of the composition/document."
  */
  private java.util.List<CompositionAttester> attester = new java.util.ArrayList<>();

  /**
  * Description: "Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information."
  */
  private Reference custodian;

  /**
  * Description: "Relationships that this composition has with other compositions or documents that already exist."
  */
  private java.util.List<CompositionRelatesTo> relatesTo = new java.util.ArrayList<>();

  /**
  * Description: "The clinical service, such as a colonoscopy or an appendectomy, being documented."
  */
  private java.util.List<CompositionEvent> event = new java.util.ArrayList<>();

  /**
  * Description: "The root of the sections that make up the composition."
  */
  private java.util.List<CompositionSection> section = new java.util.ArrayList<>();

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

  public Composition() {
  }

  public Composition(CompositionModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromJson(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.type = CodeableConcept.fromJson(o.getType());
      this.FHIRclass = CodeableConcept.fromJson(o.getFHIRclass());
      if (null != o.getSubject()) {
        this.subject = new Reference(o.getSubject());
        this.subject.setId(this.getId());
      }

      if (null != o.getEncounter()) {
        this.encounter = new Reference(o.getEncounter());
        this.encounter.setId(this.getId());
      }

      if (null != o.getDate()) {
        this.date = new String(o.getDate());
      }

      this.author = Reference.fromArray(o.getAuthor());

      if (null != o.getTitle()) {
        this.title = new String(o.getTitle());
      }

      if (null != o.getConfidentiality()) {
        this.confidentiality = new String(o.getConfidentiality());
      }

      this.attester = CompositionAttester.fromArray(o.getAttester());

      if (null != o.getCustodian()) {
        this.custodian = new Reference(o.getCustodian());
        this.custodian.setId(this.getId());
      }

      this.relatesTo = CompositionRelatesTo.fromArray(o.getRelatesTo());

      this.event = CompositionEvent.fromArray(o.getEvent());

      this.section = CompositionSection.fromArray(o.getSection());

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
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
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
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setFHIRclass( CodeableConcept value) {
    this.FHIRclass = value;
  }
  public CodeableConcept getFHIRclass() {
    return this.FHIRclass;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setEncounter( Reference value) {
    this.encounter = value;
  }
  public Reference getEncounter() {
    return this.encounter;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public String getDate() {
    return this.date;
  }
  public void set_date( Element value) {
    this._date = value;
  }
  public Element get_date() {
    return this._date;
  }
  public void setAuthor( java.util.List<Reference> value) {
    this.author = value;
  }
  public java.util.List<Reference> getAuthor() {
    return this.author;
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
  public void setConfidentiality( String value) {
    this.confidentiality = value;
  }
  public String getConfidentiality() {
    return this.confidentiality;
  }
  public void set_confidentiality( Element value) {
    this._confidentiality = value;
  }
  public Element get_confidentiality() {
    return this._confidentiality;
  }
  public void setAttester( java.util.List<CompositionAttester> value) {
    this.attester = value;
  }
  public java.util.List<CompositionAttester> getAttester() {
    return this.attester;
  }
  public void setCustodian( Reference value) {
    this.custodian = value;
  }
  public Reference getCustodian() {
    return this.custodian;
  }
  public void setRelatesTo( java.util.List<CompositionRelatesTo> value) {
    this.relatesTo = value;
  }
  public java.util.List<CompositionRelatesTo> getRelatesTo() {
    return this.relatesTo;
  }
  public void setEvent( java.util.List<CompositionEvent> value) {
    this.event = value;
  }
  public java.util.List<CompositionEvent> getEvent() {
    return this.event;
  }
  public void setSection( java.util.List<CompositionSection> value) {
    this.section = value;
  }
  public java.util.List<CompositionSection> getSection() {
    return this.section;
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
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("FHIRclass" + "[" + String.valueOf(this.FHIRclass) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("encounter" + "[" + String.valueOf(this.encounter) + "]\n"); 
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("_date" + "[" + String.valueOf(this._date) + "]\n"); 
     builder.append("author" + "[" + String.valueOf(this.author) + "]\n"); 
     builder.append("title" + "[" + String.valueOf(this.title) + "]\n"); 
     builder.append("_title" + "[" + String.valueOf(this._title) + "]\n"); 
     builder.append("confidentiality" + "[" + String.valueOf(this.confidentiality) + "]\n"); 
     builder.append("_confidentiality" + "[" + String.valueOf(this._confidentiality) + "]\n"); 
     builder.append("attester" + "[" + String.valueOf(this.attester) + "]\n"); 
     builder.append("custodian" + "[" + String.valueOf(this.custodian) + "]\n"); 
     builder.append("relatesTo" + "[" + String.valueOf(this.relatesTo) + "]\n"); 
     builder.append("event" + "[" + String.valueOf(this.event) + "]\n"); 
     builder.append("section" + "[" + String.valueOf(this.section) + "]\n"); 
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
  	Composition,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Composition" : { return Composition.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	preliminary,
  	FHIRfinal,
  	amended,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "preliminary" : { return preliminary.toString(); }
  			case "final" : { return FHIRfinal.toString(); }
  			case "amended" : { return amended.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<Composition> fromArray(java.util.List<CompositionModel> list) {
    return (java.util.List<Composition>)list.stream()
      .map(model -> new Composition(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CompositionModel> toModelArray(java.util.List<Composition> list) {
    return (java.util.List<CompositionModel>)list.stream()
      .map(model -> new CompositionModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Composition fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Composition.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Composition o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Composition> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
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
* "A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained."
*/
@Entity
@Table(name="composition")
public class CompositionModel  implements Serializable {
	private static final long serialVersionUID = 151857669703483998L;
  /**
  * Description: "This is a Composition resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Logical identifier for the composition, assigned when created. This identifier stays constant as the composition is changed over time."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"FHIRclass\"", length = 16777215)
  private String FHIRclass;

  /**
  * Description: "Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure)."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "Describes the clinical encounter or type of care this documentation is associated with."
  */
  @javax.persistence.Basic
  @Column(name="\"encounter_id\"")
  private String encounter_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="encounter_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> encounter;

  /**
  * Description: "The composition editing time, when the composition was last logically changed by the author."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "Identifies who is responsible for the information in the composition, not necessarily who typed it in."
  */
  @javax.persistence.Basic
  @Column(name="\"author_id\"")
  private String author_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="author_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> author;

  /**
  * Description: "Official human-readable label for the composition."
  */
  @javax.persistence.Basic
  @Column(name="\"title\"")
  private String title;

  /**
  * Description: "The code specifying the level of confidentiality of the Composition."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"confidentiality\"")
  private String confidentiality;

  /**
  * Description: "A participant who has attested to the accuracy of the composition/document."
  */
  @javax.persistence.Basic
  @Column(name="\"attester_id\"")
  private String attester_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="attester_id", insertable=false, updatable=false)
  private java.util.List<CompositionAttesterModel> attester;

  /**
  * Description: "Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information."
  */
  @javax.persistence.Basic
  @Column(name="\"custodian_id\"")
  private String custodian_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="custodian_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> custodian;

  /**
  * Description: "Relationships that this composition has with other compositions or documents that already exist."
  */
  @javax.persistence.Basic
  @Column(name="\"relatesto_id\"")
  private String relatesto_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="relatesto_id", insertable=false, updatable=false)
  private java.util.List<CompositionRelatesToModel> relatesTo;

  /**
  * Description: "The clinical service, such as a colonoscopy or an appendectomy, being documented."
  */
  @javax.persistence.Basic
  @Column(name="\"event_id\"")
  private String event_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="event_id", insertable=false, updatable=false)
  private java.util.List<CompositionEventModel> event;

  /**
  * Description: "The root of the sections that make up the composition."
  */
  @javax.persistence.Basic
  @Column(name="\"section_id\"")
  private String section_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="section_id", insertable=false, updatable=false)
  private java.util.List<CompositionSectionModel> section;

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

  public CompositionModel() {
  }

  public CompositionModel(Composition o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.identifier = IdentifierHelper.toJson(o.getIdentifier());
    this.status = o.getStatus();
    this.type = CodeableConceptHelper.toJson(o.getType());
    this.FHIRclass = CodeableConceptHelper.toJson(o.getFHIRclass());
    if (null != o.getSubject() ) {
    	this.subject_id = "subject" + this.id;
    	this.subject = ReferenceHelper.toModel(o.getSubject(), this.subject_id);
    }
    if (null != o.getEncounter() ) {
    	this.encounter_id = "encounter" + this.id;
    	this.encounter = ReferenceHelper.toModel(o.getEncounter(), this.encounter_id);
    }
    this.date = o.getDate();
    if (null != o.getAuthor() && !o.getAuthor().isEmpty()) {
    	this.author_id = "author" + this.id;
    	this.author = ReferenceHelper.toModelFromArray(o.getAuthor(), this.author_id);
    }
    this.title = o.getTitle();
    this.confidentiality = o.getConfidentiality();
    if (null != o.getAttester() && !o.getAttester().isEmpty()) {
    	this.attester_id = "attester" + this.id;
    	this.attester = CompositionAttesterHelper.toModelFromArray(o.getAttester(), this.attester_id);
    }
    if (null != o.getCustodian() ) {
    	this.custodian_id = "custodian" + this.id;
    	this.custodian = ReferenceHelper.toModel(o.getCustodian(), this.custodian_id);
    }
    if (null != o.getRelatesTo() && !o.getRelatesTo().isEmpty()) {
    	this.relatesto_id = "relatesto" + this.id;
    	this.relatesTo = CompositionRelatesToHelper.toModelFromArray(o.getRelatesTo(), this.relatesto_id);
    }
    if (null != o.getEvent() && !o.getEvent().isEmpty()) {
    	this.event_id = "event" + this.id;
    	this.event = CompositionEventHelper.toModelFromArray(o.getEvent(), this.event_id);
    }
    if (null != o.getSection() && !o.getSection().isEmpty()) {
    	this.section_id = "section" + this.id;
    	this.section = CompositionSectionHelper.toModelFromArray(o.getSection(), this.section_id);
    }
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
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getFHIRclass() {
    return this.FHIRclass;
  }
  public void setFHIRclass( String value) {
    this.FHIRclass = value;
  }
  public java.util.List<ReferenceModel> getSubject() {
    return this.subject;
  }
  public void setSubject( java.util.List<ReferenceModel> value) {
    this.subject = value;
  }
  public java.util.List<ReferenceModel> getEncounter() {
    return this.encounter;
  }
  public void setEncounter( java.util.List<ReferenceModel> value) {
    this.encounter = value;
  }
  public String getDate() {
    return this.date;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public java.util.List<ReferenceModel> getAuthor() {
    return this.author;
  }
  public void setAuthor( java.util.List<ReferenceModel> value) {
    this.author = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getConfidentiality() {
    return this.confidentiality;
  }
  public void setConfidentiality( String value) {
    this.confidentiality = value;
  }
  public java.util.List<CompositionAttesterModel> getAttester() {
    return this.attester;
  }
  public void setAttester( java.util.List<CompositionAttesterModel> value) {
    this.attester = value;
  }
  public java.util.List<ReferenceModel> getCustodian() {
    return this.custodian;
  }
  public void setCustodian( java.util.List<ReferenceModel> value) {
    this.custodian = value;
  }
  public java.util.List<CompositionRelatesToModel> getRelatesTo() {
    return this.relatesTo;
  }
  public void setRelatesTo( java.util.List<CompositionRelatesToModel> value) {
    this.relatesTo = value;
  }
  public java.util.List<CompositionEventModel> getEvent() {
    return this.event;
  }
  public void setEvent( java.util.List<CompositionEventModel> value) {
    this.event = value;
  }
  public java.util.List<CompositionSectionModel> getSection() {
    return this.section;
  }
  public void setSection( java.util.List<CompositionSectionModel> value) {
    this.section = value;
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
    builder.append("[CompositionModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("FHIRclass" + "->" + this.FHIRclass + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("title" + "->" + this.title + "\n"); 
     builder.append("confidentiality" + "->" + this.confidentiality + "\n"); 
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
    builder.append("[CompositionModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("FHIRclass" + "->" + this.FHIRclass + "\n"); 
     builder.append("subject" + "->" + this.subject + "\n"); 
     builder.append("encounter" + "->" + this.encounter + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("author" + "->" + this.author + "\n"); 
     builder.append("title" + "->" + this.title + "\n"); 
     builder.append("confidentiality" + "->" + this.confidentiality + "\n"); 
     builder.append("attester" + "->" + this.attester + "\n"); 
     builder.append("custodian" + "->" + this.custodian + "\n"); 
     builder.append("relatesTo" + "->" + this.relatesTo + "\n"); 
     builder.append("event" + "->" + this.event + "\n"); 
     builder.append("section" + "->" + this.section + "\n"); 
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
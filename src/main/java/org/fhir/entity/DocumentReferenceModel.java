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
@Table(name="documentreference")
public class DocumentReferenceModel  implements Serializable {
	private static final long serialVersionUID = 151910893757987973L;
  /**
  * Description: "This is a DocumentReference resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"masterIdentifier\"", length = 16777215)
  private String masterIdentifier;

  /**
  * Description: "Other identifiers associated with the document, including version independent identifiers."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The status of this document reference."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "The status of the underlying document."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"docStatus\"")
  private String docStatus;

  /**
  * Description: "Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> type;

  /**
  * Description: "A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type."
  */
  @javax.persistence.Basic
  @Column(name="\"fhirclass_id\"")
  private String fhirclass_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="fhirclass_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> FHIRclass;

  /**
  * Description: "Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure)."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "When the document was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"created\"")
  private String created;

  /**
  * Description: "When the document reference was created."
  */
  @javax.persistence.Basic
  @Column(name="\"indexed\"")
  private String indexed;

  /**
  * Description: "Identifies who is responsible for adding the information to the document."
  */
  @javax.persistence.Basic
  @Column(name="\"author_id\"")
  private String author_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="author_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> author;

  /**
  * Description: "Which person or organization authenticates that this document is valid."
  */
  @javax.persistence.Basic
  @Column(name="\"authenticator_id\"")
  private String authenticator_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="authenticator_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> authenticator;

  /**
  * Description: "Identifies the organization or group who is responsible for ongoing maintenance of and access to the document."
  */
  @javax.persistence.Basic
  @Column(name="\"custodian_id\"")
  private String custodian_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="custodian_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> custodian;

  /**
  * Description: "Relationships that this document has with other document references that already exist."
  */
  @javax.persistence.Basic
  @Column(name="\"relatesto_id\"")
  private String relatesto_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="relatesto_id", insertable=false, updatable=false)
  private java.util.List<DocumentReferenceRelatesToModel> relatesTo;

  /**
  * Description: "Human-readable description of the source document. This is sometimes known as the \"title\"."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the \"reference\" to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to."
  */
  @javax.persistence.Basic
  @Column(name="\"securitylabel_id\"")
  private String securitylabel_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="securitylabel_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> securityLabel;

  /**
  * Description: "The document and format referenced. There may be multiple content element repetitions, each with a different format."
  */
  @javax.persistence.Basic
  @Column(name="\"content_id\"")
  private String content_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="content_id", insertable=false, updatable=false)
  private java.util.List<DocumentReferenceContentModel> content;

  /**
  * Description: "The clinical context in which the document was prepared."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="context_id", insertable=false, updatable=false)
  private java.util.List<DocumentReferenceContextModel> context;

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

  public DocumentReferenceModel() {
  }

  public DocumentReferenceModel(DocumentReference o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getMasterIdentifier()) {
    	this.masterIdentifier = JsonUtils.toJson(o.getMasterIdentifier());
    }
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.status = o.getStatus();
    this.docStatus = o.getDocStatus();
    if (null != o.getType() ) {
    	this.type_id = "type" + this.id;
    	this.type = CodeableConceptHelper.toModel(o.getType(), this.type_id);
    }
    if (null != o.getFHIRclass() ) {
    	this.fhirclass_id = "fhirclass" + this.id;
    	this.FHIRclass = CodeableConceptHelper.toModel(o.getFHIRclass(), this.fhirclass_id);
    }
    if (null != o.getSubject() ) {
    	this.subject_id = "subject" + this.id;
    	this.subject = ReferenceHelper.toModel(o.getSubject(), this.subject_id);
    }
    this.created = o.getCreated();
    this.indexed = o.getIndexed();
    if (null != o.getAuthor() && !o.getAuthor().isEmpty()) {
    	this.author_id = "author" + this.id;
    	this.author = ReferenceHelper.toModelFromArray(o.getAuthor(), this.author_id);
    }
    if (null != o.getAuthenticator() ) {
    	this.authenticator_id = "authenticator" + this.id;
    	this.authenticator = ReferenceHelper.toModel(o.getAuthenticator(), this.authenticator_id);
    }
    if (null != o.getCustodian() ) {
    	this.custodian_id = "custodian" + this.id;
    	this.custodian = ReferenceHelper.toModel(o.getCustodian(), this.custodian_id);
    }
    if (null != o.getRelatesTo() && !o.getRelatesTo().isEmpty()) {
    	this.relatesto_id = "relatesto" + this.id;
    	this.relatesTo = DocumentReferenceRelatesToHelper.toModelFromArray(o.getRelatesTo(), this.relatesto_id);
    }
    this.description = o.getDescription();
    if (null != o.getSecurityLabel() && !o.getSecurityLabel().isEmpty()) {
    	this.securitylabel_id = "securitylabel" + this.id;
    	this.securityLabel = CodeableConceptHelper.toModelFromArray(o.getSecurityLabel(), this.securitylabel_id);
    }
    if (null != o.getContent() && !o.getContent().isEmpty()) {
    	this.content_id = "content" + this.id;
    	this.content = DocumentReferenceContentHelper.toModelFromArray(o.getContent(), this.content_id);
    }
    if (null != o.getContext() ) {
    	this.context_id = "context" + this.id;
    	this.context = DocumentReferenceContextHelper.toModel(o.getContext(), this.context_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getContained()) {
    	this.contained = JsonUtils.toJson(o.getContained());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
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
  public String getMasterIdentifier() {
    return this.masterIdentifier;
  }
  public void setMasterIdentifier( String value) {
    this.masterIdentifier = value;
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
  public String getDocStatus() {
    return this.docStatus;
  }
  public void setDocStatus( String value) {
    this.docStatus = value;
  }
  public java.util.List<CodeableConceptModel> getType() {
    return this.type;
  }
  public void setType( java.util.List<CodeableConceptModel> value) {
    this.type = value;
  }
  public java.util.List<CodeableConceptModel> getFHIRclass() {
    return this.FHIRclass;
  }
  public void setFHIRclass( java.util.List<CodeableConceptModel> value) {
    this.FHIRclass = value;
  }
  public java.util.List<ReferenceModel> getSubject() {
    return this.subject;
  }
  public void setSubject( java.util.List<ReferenceModel> value) {
    this.subject = value;
  }
  public String getCreated() {
    return this.created;
  }
  public void setCreated( String value) {
    this.created = value;
  }
  public String getIndexed() {
    return this.indexed;
  }
  public void setIndexed( String value) {
    this.indexed = value;
  }
  public java.util.List<ReferenceModel> getAuthor() {
    return this.author;
  }
  public void setAuthor( java.util.List<ReferenceModel> value) {
    this.author = value;
  }
  public java.util.List<ReferenceModel> getAuthenticator() {
    return this.authenticator;
  }
  public void setAuthenticator( java.util.List<ReferenceModel> value) {
    this.authenticator = value;
  }
  public java.util.List<ReferenceModel> getCustodian() {
    return this.custodian;
  }
  public void setCustodian( java.util.List<ReferenceModel> value) {
    this.custodian = value;
  }
  public java.util.List<DocumentReferenceRelatesToModel> getRelatesTo() {
    return this.relatesTo;
  }
  public void setRelatesTo( java.util.List<DocumentReferenceRelatesToModel> value) {
    this.relatesTo = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public java.util.List<CodeableConceptModel> getSecurityLabel() {
    return this.securityLabel;
  }
  public void setSecurityLabel( java.util.List<CodeableConceptModel> value) {
    this.securityLabel = value;
  }
  public java.util.List<DocumentReferenceContentModel> getContent() {
    return this.content;
  }
  public void setContent( java.util.List<DocumentReferenceContentModel> value) {
    this.content = value;
  }
  public java.util.List<DocumentReferenceContextModel> getContext() {
    return this.context;
  }
  public void setContext( java.util.List<DocumentReferenceContextModel> value) {
    this.context = value;
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
    builder.append("[DocumentReferenceModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("masterIdentifier" + "->" + this.masterIdentifier + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("docStatus" + "->" + this.docStatus + "\n"); 
     builder.append("created" + "->" + this.created + "\n"); 
     builder.append("indexed" + "->" + this.indexed + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
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
    builder.append("[DocumentReferenceModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("masterIdentifier" + "->" + this.masterIdentifier + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("docStatus" + "->" + this.docStatus + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("FHIRclass" + "->" + this.FHIRclass + "\n"); 
     builder.append("subject" + "->" + this.subject + "\n"); 
     builder.append("created" + "->" + this.created + "\n"); 
     builder.append("indexed" + "->" + this.indexed + "\n"); 
     builder.append("author" + "->" + this.author + "\n"); 
     builder.append("authenticator" + "->" + this.authenticator + "\n"); 
     builder.append("custodian" + "->" + this.custodian + "\n"); 
     builder.append("relatesTo" + "->" + this.relatesTo + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("securityLabel" + "->" + this.securityLabel + "\n"); 
     builder.append("content" + "->" + this.content + "\n"); 
     builder.append("context" + "->" + this.context + "\n"); 
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
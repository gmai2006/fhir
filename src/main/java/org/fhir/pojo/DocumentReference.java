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
import org.fhir.entity.DocumentReferenceModel;
import com.google.gson.GsonBuilder;

/**
* "A reference to a document."
*/
public class DocumentReference  {
  /**
  * Description: "This is a DocumentReference resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document."
  */
  private Identifier masterIdentifier;

  /**
  * Description: "Other identifiers associated with the document, including version independent identifiers."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "The status of this document reference."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "The status of the underlying document."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String docStatus;

  /**
  * Description: "Extensions for docStatus"
  */
  private transient Element _docStatus;

  /**
  * Description: "Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept type;

  /**
  * Description: "A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type."
  */
  private CodeableConcept FHIRclass;

  /**
  * Description: "Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure)."
  */
  private Reference subject;

  /**
  * Description: "When the document was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String created;

  /**
  * Description: "Extensions for created"
  */
  private transient Element _created;

  /**
  * Description: "When the document reference was created."
  */
  private String indexed;

  /**
  * Description: "Extensions for indexed"
  */
  private transient Element _indexed;

  /**
  * Description: "Identifies who is responsible for adding the information to the document."
  */
  private java.util.List<Reference> author = new java.util.ArrayList<>();

  /**
  * Description: "Which person or organization authenticates that this document is valid."
  */
  private Reference authenticator;

  /**
  * Description: "Identifies the organization or group who is responsible for ongoing maintenance of and access to the document."
  */
  private Reference custodian;

  /**
  * Description: "Relationships that this document has with other document references that already exist."
  */
  private java.util.List<DocumentReferenceRelatesTo> relatesTo = new java.util.ArrayList<>();

  /**
  * Description: "Human-readable description of the source document. This is sometimes known as the \"title\"."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the \"reference\" to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to."
  */
  private java.util.List<CodeableConcept> securityLabel = new java.util.ArrayList<>();

  /**
  * Description: "The document and format referenced. There may be multiple content element repetitions, each with a different format."
  */
  @javax.validation.constraints.NotNull
  private java.util.List<DocumentReferenceContent> content = new java.util.ArrayList<>();

  /**
  * Description: "The clinical context in which the document was prepared."
  */
  private DocumentReferenceContext context;

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

  public DocumentReference() {
  }

  public DocumentReference(DocumentReferenceModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.masterIdentifier = Identifier.fromJson(o.getMasterIdentifier());
      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getDocStatus()) {
        this.docStatus = new String(o.getDocStatus());
      }

      this.type = CodeableConcept.fromJson(o.getType());
      this.FHIRclass = CodeableConcept.fromJson(o.getFHIRclass());
      if (null != o.getSubject()) {
        this.subject = new Reference(o.getSubject());
        this.subject.setId(this.getId());
      }

      if (null != o.getCreated()) {
        this.created = new String(o.getCreated());
      }

      if (null != o.getIndexed()) {
        this.indexed = new String(o.getIndexed());
      }

      this.author = Reference.fromArray(o.getAuthor());

      if (null != o.getAuthenticator()) {
        this.authenticator = new Reference(o.getAuthenticator());
        this.authenticator.setId(this.getId());
      }

      if (null != o.getCustodian()) {
        this.custodian = new Reference(o.getCustodian());
        this.custodian.setId(this.getId());
      }

      this.relatesTo = DocumentReferenceRelatesTo.fromArray(o.getRelatesTo());

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      this.securityLabel = CodeableConcept.fromArray(o.getSecurityLabel());
      this.content = DocumentReferenceContent.fromArray(o.getContent());

      if (null != o.getContext()) {
        this.context = new DocumentReferenceContext(o.getContext());
        this.context.setId(this.getId());
      }

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
  public void setMasterIdentifier( Identifier value) {
    this.masterIdentifier = value;
  }
  public Identifier getMasterIdentifier() {
    return this.masterIdentifier;
  }
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
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
  public void setDocStatus( String value) {
    this.docStatus = value;
  }
  public String getDocStatus() {
    return this.docStatus;
  }
  public void set_docStatus( Element value) {
    this._docStatus = value;
  }
  public Element get_docStatus() {
    return this._docStatus;
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
  public void setCreated( String value) {
    this.created = value;
  }
  public String getCreated() {
    return this.created;
  }
  public void set_created( Element value) {
    this._created = value;
  }
  public Element get_created() {
    return this._created;
  }
  public void setIndexed( String value) {
    this.indexed = value;
  }
  public String getIndexed() {
    return this.indexed;
  }
  public void set_indexed( Element value) {
    this._indexed = value;
  }
  public Element get_indexed() {
    return this._indexed;
  }
  public void setAuthor( java.util.List<Reference> value) {
    this.author = value;
  }
  public java.util.List<Reference> getAuthor() {
    return this.author;
  }
  public void setAuthenticator( Reference value) {
    this.authenticator = value;
  }
  public Reference getAuthenticator() {
    return this.authenticator;
  }
  public void setCustodian( Reference value) {
    this.custodian = value;
  }
  public Reference getCustodian() {
    return this.custodian;
  }
  public void setRelatesTo( java.util.List<DocumentReferenceRelatesTo> value) {
    this.relatesTo = value;
  }
  public java.util.List<DocumentReferenceRelatesTo> getRelatesTo() {
    return this.relatesTo;
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
  public void setSecurityLabel( java.util.List<CodeableConcept> value) {
    this.securityLabel = value;
  }
  public java.util.List<CodeableConcept> getSecurityLabel() {
    return this.securityLabel;
  }
  public void setContent( java.util.List<DocumentReferenceContent> value) {
    this.content = value;
  }
  public java.util.List<DocumentReferenceContent> getContent() {
    return this.content;
  }
  public void setContext( DocumentReferenceContext value) {
    this.context = value;
  }
  public DocumentReferenceContext getContext() {
    return this.context;
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
     builder.append("masterIdentifier" + "[" + String.valueOf(this.masterIdentifier) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("docStatus" + "[" + String.valueOf(this.docStatus) + "]\n"); 
     builder.append("_docStatus" + "[" + String.valueOf(this._docStatus) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("FHIRclass" + "[" + String.valueOf(this.FHIRclass) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("created" + "[" + String.valueOf(this.created) + "]\n"); 
     builder.append("_created" + "[" + String.valueOf(this._created) + "]\n"); 
     builder.append("indexed" + "[" + String.valueOf(this.indexed) + "]\n"); 
     builder.append("_indexed" + "[" + String.valueOf(this._indexed) + "]\n"); 
     builder.append("author" + "[" + String.valueOf(this.author) + "]\n"); 
     builder.append("authenticator" + "[" + String.valueOf(this.authenticator) + "]\n"); 
     builder.append("custodian" + "[" + String.valueOf(this.custodian) + "]\n"); 
     builder.append("relatesTo" + "[" + String.valueOf(this.relatesTo) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("securityLabel" + "[" + String.valueOf(this.securityLabel) + "]\n"); 
     builder.append("content" + "[" + String.valueOf(this.content) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
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
  	DocumentReference,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "DocumentReference" : { return DocumentReference.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	current,
  	superseded,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "current" : { return current.toString(); }
  			case "superseded" : { return superseded.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<DocumentReference> fromArray(java.util.List<DocumentReferenceModel> list) {
    return (java.util.List<DocumentReference>)list.stream()
      .map(model -> new DocumentReference(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<DocumentReferenceModel> toModelArray(java.util.List<DocumentReference> list) {
    return (java.util.List<DocumentReferenceModel>)list.stream()
      .map(model -> new DocumentReferenceModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static DocumentReference fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, DocumentReference.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(DocumentReference o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<DocumentReference> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
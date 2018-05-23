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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A reference to a document."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DocumentReference  extends DomainResource  {
  /**
  * Description: "This is a DocumentReference resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document."
  */
  protected Identifier masterIdentifier;

  /**
  * Description: "Other identifiers associated with the document, including version independent identifiers."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "The status of this document reference."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "The status of the underlying document."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String docStatus;

  /**
  * Description: "Extensions for docStatus"
  */
  protected transient Element _docStatus;

  /**
  * Description: "Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept type;

  /**
  * Description: "A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type."
  */
  protected CodeableConcept FHIRclass;

  /**
  * Description: "Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure)."
  */
  protected Reference subject;

  /**
  * Description: "When the document was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String created;

  /**
  * Description: "Extensions for created"
  */
  protected transient Element _created;

  /**
  * Description: "When the document reference was created."
  */
  protected String indexed;

  /**
  * Description: "Extensions for indexed"
  */
  protected transient Element _indexed;

  /**
  * Description: "Identifies who is responsible for adding the information to the document."
  */
  protected java.util.List<Reference> author;

  /**
  * Description: "Which person or organization authenticates that this document is valid."
  */
  protected Reference authenticator;

  /**
  * Description: "Identifies the organization or group who is responsible for ongoing maintenance of and access to the document."
  */
  protected Reference custodian;

  /**
  * Description: "Relationships that this document has with other document references that already exist."
  */
  protected java.util.List<DocumentReferenceRelatesTo> relatesTo;

  /**
  * Description: "Human-readable description of the source document. This is sometimes known as the \"title\"."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the \"reference\" to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to."
  */
  protected java.util.List<CodeableConcept> securityLabel;

  /**
  * Description: "The document and format referenced. There may be multiple content element repetitions, each with a different format."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<DocumentReferenceContent> content;

  /**
  * Description: "The clinical context in which the document was prepared."
  */
  protected DocumentReferenceContext context;

  public DocumentReference() {
  }

  public DocumentReference(DocumentReferenceModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.masterIdentifier = IdentifierHelper.fromJson(o.getMasterIdentifier());
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getDocStatus()) {
      this.docStatus = o.getDocStatus();
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getFHIRclass() && !o.getFHIRclass().isEmpty()) {
      this.FHIRclass = new CodeableConcept(o.getFHIRclass().get(0));
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getCreated()) {
      this.created = o.getCreated();
    }
    if (null != o.getIndexed()) {
      this.indexed = o.getIndexed();
    }
    if (null != o.getAuthor() && !o.getAuthor().isEmpty()) {
    	this.author = ReferenceHelper.fromArray2Array(o.getAuthor());
    }
    if (null != o.getAuthenticator() && !o.getAuthenticator().isEmpty()) {
      this.authenticator = new Reference(o.getAuthenticator().get(0));
    }
    if (null != o.getCustodian() && !o.getCustodian().isEmpty()) {
      this.custodian = new Reference(o.getCustodian().get(0));
    }
    if (null != o.getRelatesTo() && !o.getRelatesTo().isEmpty()) {
    	this.relatesTo = DocumentReferenceRelatesToHelper.fromArray2Array(o.getRelatesTo());
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getSecurityLabel() && !o.getSecurityLabel().isEmpty()) {
    	this.securityLabel = CodeableConceptHelper.fromArray2Array(o.getSecurityLabel());
    }
    if (null != o.getContent() && !o.getContent().isEmpty()) {
    	this.content = DocumentReferenceContentHelper.fromArray2Array(o.getContent());
    }
    if (null != o.getContext() && !o.getContext().isEmpty()) {
      this.context = new DocumentReferenceContext(o.getContext().get(0));
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DocumentReference]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.masterIdentifier != null) builder.append("masterIdentifier" + "->" + this.masterIdentifier.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.docStatus != null) builder.append("docStatus" + "->" + this.docStatus.toString() + "\n"); 
     if(this._docStatus != null) builder.append("_docStatus" + "->" + this._docStatus.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.FHIRclass != null) builder.append("FHIRclass" + "->" + this.FHIRclass.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.created != null) builder.append("created" + "->" + this.created.toString() + "\n"); 
     if(this._created != null) builder.append("_created" + "->" + this._created.toString() + "\n"); 
     if(this.indexed != null) builder.append("indexed" + "->" + this.indexed.toString() + "\n"); 
     if(this._indexed != null) builder.append("_indexed" + "->" + this._indexed.toString() + "\n"); 
     if(this.author != null) builder.append("author" + "->" + this.author.toString() + "\n"); 
     if(this.authenticator != null) builder.append("authenticator" + "->" + this.authenticator.toString() + "\n"); 
     if(this.custodian != null) builder.append("custodian" + "->" + this.custodian.toString() + "\n"); 
     if(this.relatesTo != null) builder.append("relatesTo" + "->" + this.relatesTo.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.securityLabel != null) builder.append("securityLabel" + "->" + this.securityLabel.toString() + "\n"); 
     if(this.content != null) builder.append("content" + "->" + this.content.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); ;
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

}
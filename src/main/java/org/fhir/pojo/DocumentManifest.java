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
import org.fhir.entity.DocumentManifestModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A collection of documents compiled for a purpose together with metadata that applies to the collection."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DocumentManifest  extends DomainResource  {
  /**
  * Description: "This is a DocumentManifest resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts."
  */
  protected Identifier masterIdentifier;

  /**
  * Description: "Other identifiers associated with the document manifest, including version independent  identifiers."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "The status of this document manifest."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Specifies the kind of this set of documents (e.g. Patient Summary, Discharge Summary, Prescription, etc.). The type of a set of documents may be the same as one of the documents in it - especially if there is only one - but it may be wider."
  */
  protected CodeableConcept type;

  /**
  * Description: "Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case)."
  */
  protected Reference subject;

  /**
  * Description: "When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.)."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String created;

  /**
  * Description: "Extensions for created"
  */
  protected transient Element _created;

  /**
  * Description: "Identifies who is responsible for creating the manifest, and adding  documents to it."
  */
  protected java.util.List<Reference> author;

  /**
  * Description: "A patient, practitioner, or organization for which this set of documents is intended."
  */
  protected java.util.List<Reference> recipient;

  /**
  * Description: "Identifies the source system, application, or software that produced the document manifest."
  */
  protected String source;

  /**
  * Description: "Extensions for source"
  */
  protected transient Element _source;

  /**
  * Description: "Human-readable description of the source document. This is sometimes known as the \"title\"."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "The list of Documents included in the manifest."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<DocumentManifestContent> content;

  /**
  * Description: "Related identifiers or resources associated with the DocumentManifest."
  */
  protected java.util.List<DocumentManifestRelated> related;

  public DocumentManifest() {
  }

  public DocumentManifest(DocumentManifestModel o) {
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
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getCreated()) {
      this.created = o.getCreated();
    }
    if (null != o.getAuthor() && !o.getAuthor().isEmpty()) {
    	this.author = ReferenceHelper.fromArray2Array(o.getAuthor());
    }
    if (null != o.getRecipient() && !o.getRecipient().isEmpty()) {
    	this.recipient = ReferenceHelper.fromArray2Array(o.getRecipient());
    }
    if (null != o.getSource()) {
      this.source = o.getSource();
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getContent() && !o.getContent().isEmpty()) {
    	this.content = DocumentManifestContentHelper.fromArray2Array(o.getContent());
    }
    if (null != o.getRelated() && !o.getRelated().isEmpty()) {
    	this.related = DocumentManifestRelatedHelper.fromArray2Array(o.getRelated());
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
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
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
  public void setAuthor( java.util.List<Reference> value) {
    this.author = value;
  }
  public java.util.List<Reference> getAuthor() {
    return this.author;
  }
  public void setRecipient( java.util.List<Reference> value) {
    this.recipient = value;
  }
  public java.util.List<Reference> getRecipient() {
    return this.recipient;
  }
  public void setSource( String value) {
    this.source = value;
  }
  public String getSource() {
    return this.source;
  }
  public void set_source( Element value) {
    this._source = value;
  }
  public Element get_source() {
    return this._source;
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
  public void setContent( java.util.List<DocumentManifestContent> value) {
    this.content = value;
  }
  public java.util.List<DocumentManifestContent> getContent() {
    return this.content;
  }
  public void setRelated( java.util.List<DocumentManifestRelated> value) {
    this.related = value;
  }
  public java.util.List<DocumentManifestRelated> getRelated() {
    return this.related;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DocumentManifest]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.masterIdentifier != null) builder.append("masterIdentifier" + "->" + this.masterIdentifier.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.created != null) builder.append("created" + "->" + this.created.toString() + "\n"); 
     if(this._created != null) builder.append("_created" + "->" + this._created.toString() + "\n"); 
     if(this.author != null) builder.append("author" + "->" + this.author.toString() + "\n"); 
     if(this.recipient != null) builder.append("recipient" + "->" + this.recipient.toString() + "\n"); 
     if(this.source != null) builder.append("source" + "->" + this.source.toString() + "\n"); 
     if(this._source != null) builder.append("_source" + "->" + this._source.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.content != null) builder.append("content" + "->" + this.content.toString() + "\n"); 
     if(this.related != null) builder.append("related" + "->" + this.related.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	DocumentManifest,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "DocumentManifest" : { return DocumentManifest.toString(); }
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
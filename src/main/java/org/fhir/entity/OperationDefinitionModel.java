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
* "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction)."
* generated on 07/14/2018
*/
@Entity
@Table(name="operationdefinition")
public class OperationDefinitionModel  implements Serializable {
	private static final long serialVersionUID = 153159210211151576L;
  /**
  * Description: "This is a OperationDefinition resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this operation definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this operation definition is (or will be) published. The URL SHOULD include the major version of the operation definition. For more information see [Technical and Business Versions](resource.html#versions)."
  */
  @javax.persistence.Basic
  @Column(name="\"url\"")
  private String url;

  /**
  * Description: "The identifier that is used to identify this version of the operation definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the operation definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence."
  */
  @javax.persistence.Basic
  @Column(name="\"version\"")
  private String version;

  /**
  * Description: "A natural language name identifying the operation definition. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "The status of this operation definition. Enables tracking the life-cycle of the content."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Whether this is an operation or a named query."
  */
  @javax.persistence.Basic
  @Column(name="\"kind\"")
  private String kind;

  /**
  * Description: "A boolean value to indicate that this operation definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  @javax.persistence.Basic
  @Column(name="\"experimental\"")
  private Boolean experimental;

  /**
  * Description: "The date  (and optionally time) when the operation definition was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the operation definition changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "The name of the individual or organization that published the operation definition."
  */
  @javax.persistence.Basic
  @Column(name="\"publisher\"")
  private String publisher;

  /**
  * Description: "Contact details to assist a user in finding and communicating with the publisher."
  */
  @javax.persistence.Basic
  @Column(name="\"contact_id\"")
  private String contact_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="contact_id", insertable=false, updatable=false)
  private java.util.List<ContactDetailModel> contact;

  /**
  * Description: "A free text natural language description of the operation definition from a consumer's perspective."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate operation definition instances."
  */
  @javax.persistence.Basic
  @Column(name="\"usecontext_id\"")
  private String usecontext_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="usecontext_id", insertable=false, updatable=false)
  private java.util.List<UsageContextModel> useContext;

  /**
  * Description: "A legal or geographic region in which the operation definition is intended to be used."
  */
  @javax.persistence.Basic
  @Column(name="\"jurisdiction_id\"")
  private String jurisdiction_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="jurisdiction_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> jurisdiction;

  /**
  * Description: "Explaination of why this operation definition is needed and why it has been designed as it has."
  */
  @javax.persistence.Basic
  @Column(name="\"purpose\"")
  private String purpose;

  /**
  * Description: "Operations that are idempotent (see [HTTP specification definition of idempotent](http://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html)) may be invoked by performing an HTTP GET operation instead of a POST."
  */
  @javax.persistence.Basic
  @Column(name="\"idempotent\"")
  private Boolean idempotent;

  /**
  * Description: "The name used to invoke the operation."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"code\"")
  private String code;

  /**
  * Description: "Additional information about how to use this operation or named query."
  */
  @javax.persistence.Basic
  @Column(name="\"comment\"")
  private String comment;

  /**
  * Description: "Indicates that this operation definition is a constraining profile on the base."
  */
  @javax.persistence.Basic
  @Column(name="\"base_id\"")
  private String base_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="base_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> base;

  /**
  * Description: "The types on which this operation can be executed."
  */
  @javax.persistence.Basic
  @Column(name="\"resource\"")
  private String resource;

  /**
  * Description: "Indicates whether this operation or named query can be invoked at the system level (e.g. without needing to choose a resource type for the context)."
  */
  @javax.persistence.Basic
  @Column(name="\"system\"")
  private Boolean system;

  /**
  * Description: "Indicates whether this operation or named query can be invoked at the resource type level for any given resource type level (e.g. without needing to choose a specific resource id for the context)."
  */
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private Boolean type;

  /**
  * Description: "Indicates whether this operation can be invoked on a particular instance of one of the given types."
  */
  @javax.persistence.Basic
  @Column(name="\"instance\"")
  private Boolean instance;

  /**
  * Description: "The parameters for the operation/query."
  */
  @javax.persistence.Basic
  @Column(name="\"parameter_id\"")
  private String parameter_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="parameter_id", insertable=false, updatable=false)
  private java.util.List<OperationDefinitionParameterModel> parameter;

  /**
  * Description: "Defines an appropriate combination of parameters to use when invoking this operation, to help code generators when generating overloaded parameter sets for this operation."
  */
  @javax.persistence.Basic
  @Column(name="\"overload_id\"")
  private String overload_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="overload_id", insertable=false, updatable=false)
  private java.util.List<OperationDefinitionOverloadModel> overload;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
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
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
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

  public OperationDefinitionModel() {
  }

  public OperationDefinitionModel(OperationDefinition o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.url = o.getUrl();
    this.version = o.getVersion();
    this.name = o.getName();
    this.status = o.getStatus();
    this.kind = o.getKind();
    this.experimental = o.getExperimental();
    this.date = o.getDate();
    this.publisher = o.getPublisher();
    if (null != o.getContact() && !o.getContact().isEmpty()) {
    	this.contact_id = "contact" + this.id;
    	this.contact = ContactDetailHelper.toModelFromArray(o.getContact(), this.contact_id);
    }
    this.description = o.getDescription();
    if (null != o.getUseContext() && !o.getUseContext().isEmpty()) {
    	this.usecontext_id = "usecontext" + this.id;
    	this.useContext = UsageContextHelper.toModelFromArray(o.getUseContext(), this.usecontext_id);
    }
    if (null != o.getJurisdiction() && !o.getJurisdiction().isEmpty()) {
    	this.jurisdiction_id = "jurisdiction" + this.id;
    	this.jurisdiction = CodeableConceptHelper.toModelFromArray(o.getJurisdiction(), this.jurisdiction_id);
    }
    this.purpose = o.getPurpose();
    this.idempotent = o.getIdempotent();
    this.code = o.getCode();
    this.comment = o.getComment();
    if (null != o.getBase() ) {
    	this.base_id = "base" + this.id;
    	this.base = ReferenceHelper.toModel(o.getBase(), this.base_id);
    }
    this.resource = org.fhir.utils.JsonUtils.toJson(o.getResource());
    this.system = o.getSystem();
    this.type = o.getType();
    this.instance = o.getInstance();
    if (null != o.getParameter() && !o.getParameter().isEmpty()) {
    	this.parameter_id = "parameter" + this.id;
    	this.parameter = OperationDefinitionParameterHelper.toModelFromArray(o.getParameter(), this.parameter_id);
    }
    if (null != o.getOverload() && !o.getOverload().isEmpty()) {
    	this.overload_id = "overload" + this.id;
    	this.overload = OperationDefinitionOverloadHelper.toModelFromArray(o.getOverload(), this.overload_id);
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
  public String getUrl() {
    return this.url;
  }
  public void setUrl( String value) {
    this.url = value;
  }
  public String getVersion() {
    return this.version;
  }
  public void setVersion( String value) {
    this.version = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getKind() {
    return this.kind;
  }
  public void setKind( String value) {
    this.kind = value;
  }
  public Boolean getExperimental() {
    return this.experimental;
  }
  public void setExperimental( Boolean value) {
    this.experimental = value;
  }
  public String getDate() {
    return this.date;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public String getPublisher() {
    return this.publisher;
  }
  public void setPublisher( String value) {
    this.publisher = value;
  }
  public java.util.List<ContactDetailModel> getContact() {
    return this.contact;
  }
  public void setContact( java.util.List<ContactDetailModel> value) {
    this.contact = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public java.util.List<UsageContextModel> getUseContext() {
    return this.useContext;
  }
  public void setUseContext( java.util.List<UsageContextModel> value) {
    this.useContext = value;
  }
  public java.util.List<CodeableConceptModel> getJurisdiction() {
    return this.jurisdiction;
  }
  public void setJurisdiction( java.util.List<CodeableConceptModel> value) {
    this.jurisdiction = value;
  }
  public String getPurpose() {
    return this.purpose;
  }
  public void setPurpose( String value) {
    this.purpose = value;
  }
  public Boolean getIdempotent() {
    return this.idempotent;
  }
  public void setIdempotent( Boolean value) {
    this.idempotent = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public java.util.List<ReferenceModel> getBase() {
    return this.base;
  }
  public void setBase( java.util.List<ReferenceModel> value) {
    this.base = value;
  }
  public String getResource() {
    return this.resource;
  }
  public void setResource( String value) {
    this.resource = value;
  }
  public Boolean getSystem() {
    return this.system;
  }
  public void setSystem( Boolean value) {
    this.system = value;
  }
  public Boolean getType() {
    return this.type;
  }
  public void setType( Boolean value) {
    this.type = value;
  }
  public Boolean getInstance() {
    return this.instance;
  }
  public void setInstance( Boolean value) {
    this.instance = value;
  }
  public java.util.List<OperationDefinitionParameterModel> getParameter() {
    return this.parameter;
  }
  public void setParameter( java.util.List<OperationDefinitionParameterModel> value) {
    this.parameter = value;
  }
  public java.util.List<OperationDefinitionOverloadModel> getOverload() {
    return this.overload;
  }
  public void setOverload( java.util.List<OperationDefinitionOverloadModel> value) {
    this.overload = value;
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
    builder.append("[OperationDefinitionModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("url" + "->" + this.url + "\n"); 
     builder.append("version" + "->" + this.version + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("kind" + "->" + this.kind + "\n"); 
     builder.append("experimental" + "->" + this.experimental + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("publisher" + "->" + this.publisher + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("purpose" + "->" + this.purpose + "\n"); 
     builder.append("idempotent" + "->" + this.idempotent + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("comment" + "->" + this.comment + "\n"); 
     builder.append("resource" + "->" + this.resource + "\n"); 
     builder.append("system" + "->" + this.system + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("instance" + "->" + this.instance + "\n"); 
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
    builder.append("[OperationDefinitionModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("url" + "->" + this.url + "\n"); 
     builder.append("version" + "->" + this.version + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("kind" + "->" + this.kind + "\n"); 
     builder.append("experimental" + "->" + this.experimental + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("publisher" + "->" + this.publisher + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("purpose" + "->" + this.purpose + "\n"); 
     builder.append("idempotent" + "->" + this.idempotent + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("comment" + "->" + this.comment + "\n"); 
     builder.append("resource" + "->" + this.resource + "\n"); 
     builder.append("system" + "->" + this.system + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("instance" + "->" + this.instance + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}
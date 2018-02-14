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
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
*/
@Entity
@Table(name="capabilitystatement")
public class CapabilityStatementModel  implements Serializable {
	private static final long serialVersionUID = 151857669686052692L;
  /**
  * Description: "This is a CapabilityStatement resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this capability statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this capability statement is (or will be) published. The URL SHOULD include the major version of the capability statement. For more information see [Technical and Business Versions](resource.html#versions)."
  */
  @javax.persistence.Basic
  @Column(name="\"url\"")
  private String url;

  /**
  * Description: "The identifier that is used to identify this version of the capability statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the capability statement author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence."
  */
  @javax.persistence.Basic
  @Column(name="\"version\"")
  private String version;

  /**
  * Description: "A natural language name identifying the capability statement. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "A short, descriptive, user-friendly title for the capability statement."
  */
  @javax.persistence.Basic
  @Column(name="\"title\"")
  private String title;

  /**
  * Description: "The status of this capability statement. Enables tracking the life-cycle of the content."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "A boolean value to indicate that this capability statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  @javax.persistence.Basic
  @Column(name="\"experimental\"")
  private Boolean experimental;

  /**
  * Description: "The date  (and optionally time) when the capability statement was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the capability statement changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "The name of the individual or organization that published the capability statement."
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
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="contact_id", insertable=false, updatable=false)
  private java.util.List<ContactDetailModel> contact;

  /**
  * Description: "A free text natural language description of the capability statement from a consumer's perspective. Typically, this is used when the capability statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate capability statement instances."
  */
  @javax.persistence.Basic
  @Column(name="\"usecontext_id\"")
  private String usecontext_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="usecontext_id", insertable=false, updatable=false)
  private java.util.List<UsageContextModel> useContext;

  /**
  * Description: "A legal or geographic region in which the capability statement is intended to be used."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"jurisdiction\"", length = 16777215)
  private String jurisdiction;

  /**
  * Description: "Explaination of why this capability statement is needed and why it has been designed as it has."
  */
  @javax.persistence.Basic
  @Column(name="\"purpose\"")
  private String purpose;

  /**
  * Description: "A copyright statement relating to the capability statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the capability statement."
  */
  @javax.persistence.Basic
  @Column(name="\"copyright\"")
  private String copyright;

  /**
  * Description: "The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind not instance of software) or a class of implementation (e.g. a desired purchase)."
  */
  @javax.persistence.Basic
  @Column(name="\"kind\"")
  private String kind;

  /**
  * Description: "Reference to a canonical URL of another CapabilityStatement that this software implements or uses. This capability statement is a published API description that corresponds to a business service. The rest of the capability statement does not need to repeat the details of the referenced resource, but can do so."
  */
  @javax.persistence.Basic
  @Column(name="\"instantiates\"")
  private String instantiates;

  /**
  * Description: "Software that is covered by this capability statement.  It is used when the capability statement describes the capabilities of a particular software version, independent of an installation."
  */
  @javax.persistence.Basic
  @Column(name="\"software_id\"")
  private String software_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="software_id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementSoftwareModel> software;

  /**
  * Description: "Identifies a specific implementation instance that is described by the capability statement - i.e. a particular installation, rather than the capabilities of a software program."
  */
  @javax.persistence.Basic
  @Column(name="\"implementation_id\"")
  private String implementation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="implementation_id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementImplementationModel> implementation;

  /**
  * Description: "The version of the FHIR specification on which this capability statement is based."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Basic
  @Column(name="\"fhirVersion\"")
  private String fhirVersion;

  /**
  * Description: "A code that indicates whether the application accepts unknown elements or extensions when reading resources."
  */
  @javax.persistence.Basic
  @Column(name="\"acceptUnknown\"")
  private String acceptUnknown;

  /**
  * Description: "A list of the formats supported by this implementation using their content types."
  */
  @javax.persistence.Basic
  @Column(name="\"format\"")
  private String format;

  /**
  * Description: "A list of the patch formats supported by this implementation using their content types."
  */
  @javax.persistence.Basic
  @Column(name="\"patchFormat\"")
  private String patchFormat;

  /**
  * Description: "A list of implementation guides that the server does (or should) support in their entirety."
  */
  @javax.persistence.Basic
  @Column(name="\"implementationGuide\"")
  private String implementationGuide;

  /**
  * Description: "A list of profiles that represent different use cases supported by the system. For a server, \"supported by the system\" means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles](profiling.html#profile-uses)."
  */
  @javax.persistence.Basic
  @Column(name="\"profile_id\"")
  private String profile_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="profile_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> profile;

  /**
  * Description: "A definition of the restful capabilities of the solution, if any."
  */
  @javax.persistence.Basic
  @Column(name="\"rest_id\"")
  private String rest_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="rest_id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementRestModel> rest;

  /**
  * Description: "A description of the messaging capabilities of the solution."
  */
  @javax.persistence.Basic
  @Column(name="\"messaging_id\"")
  private String messaging_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="messaging_id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementMessagingModel> messaging;

  /**
  * Description: "A document definition."
  */
  @javax.persistence.Basic
  @Column(name="\"document_id\"")
  private String document_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="document_id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementDocumentModel> document;

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

  public CapabilityStatementModel() {
  }

  public CapabilityStatementModel(CapabilityStatement o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.url = o.getUrl();
    this.version = o.getVersion();
    this.name = o.getName();
    this.title = o.getTitle();
    this.status = o.getStatus();
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
    this.purpose = o.getPurpose();
    this.copyright = o.getCopyright();
    this.kind = o.getKind();
    this.instantiates = org.fhir.utils.JsonUtils.write2String(o.getInstantiates());
    if (null != o.getSoftware() ) {
    	this.software_id = "software" + this.id;
    	this.software = CapabilityStatementSoftwareHelper.toModel(o.getSoftware(), this.software_id);
    }
    if (null != o.getImplementation() ) {
    	this.implementation_id = "implementation" + this.id;
    	this.implementation = CapabilityStatementImplementationHelper.toModel(o.getImplementation(), this.implementation_id);
    }
    this.fhirVersion = o.getFhirVersion();
    this.acceptUnknown = o.getAcceptUnknown();
    this.format = org.fhir.utils.JsonUtils.write2String(o.getFormat());
    this.patchFormat = org.fhir.utils.JsonUtils.write2String(o.getPatchFormat());
    this.implementationGuide = org.fhir.utils.JsonUtils.write2String(o.getImplementationGuide());
    if (null != o.getProfile() && !o.getProfile().isEmpty()) {
    	this.profile_id = "profile" + this.id;
    	this.profile = ReferenceHelper.toModelFromArray(o.getProfile(), this.profile_id);
    }
    if (null != o.getRest() && !o.getRest().isEmpty()) {
    	this.rest_id = "rest" + this.id;
    	this.rest = CapabilityStatementRestHelper.toModelFromArray(o.getRest(), this.rest_id);
    }
    if (null != o.getMessaging() && !o.getMessaging().isEmpty()) {
    	this.messaging_id = "messaging" + this.id;
    	this.messaging = CapabilityStatementMessagingHelper.toModelFromArray(o.getMessaging(), this.messaging_id);
    }
    if (null != o.getDocument() && !o.getDocument().isEmpty()) {
    	this.document_id = "document" + this.id;
    	this.document = CapabilityStatementDocumentHelper.toModelFromArray(o.getDocument(), this.document_id);
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
  public String getTitle() {
    return this.title;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
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
  public String getJurisdiction() {
    return this.jurisdiction;
  }
  public void setJurisdiction( String value) {
    this.jurisdiction = value;
  }
  public String getPurpose() {
    return this.purpose;
  }
  public void setPurpose( String value) {
    this.purpose = value;
  }
  public String getCopyright() {
    return this.copyright;
  }
  public void setCopyright( String value) {
    this.copyright = value;
  }
  public String getKind() {
    return this.kind;
  }
  public void setKind( String value) {
    this.kind = value;
  }
  public String getInstantiates() {
    return this.instantiates;
  }
  public void setInstantiates( String value) {
    this.instantiates = value;
  }
  public java.util.List<CapabilityStatementSoftwareModel> getSoftware() {
    return this.software;
  }
  public void setSoftware( java.util.List<CapabilityStatementSoftwareModel> value) {
    this.software = value;
  }
  public java.util.List<CapabilityStatementImplementationModel> getImplementation() {
    return this.implementation;
  }
  public void setImplementation( java.util.List<CapabilityStatementImplementationModel> value) {
    this.implementation = value;
  }
  public String getFhirVersion() {
    return this.fhirVersion;
  }
  public void setFhirVersion( String value) {
    this.fhirVersion = value;
  }
  public String getAcceptUnknown() {
    return this.acceptUnknown;
  }
  public void setAcceptUnknown( String value) {
    this.acceptUnknown = value;
  }
  public String getFormat() {
    return this.format;
  }
  public void setFormat( String value) {
    this.format = value;
  }
  public String getPatchFormat() {
    return this.patchFormat;
  }
  public void setPatchFormat( String value) {
    this.patchFormat = value;
  }
  public String getImplementationGuide() {
    return this.implementationGuide;
  }
  public void setImplementationGuide( String value) {
    this.implementationGuide = value;
  }
  public java.util.List<ReferenceModel> getProfile() {
    return this.profile;
  }
  public void setProfile( java.util.List<ReferenceModel> value) {
    this.profile = value;
  }
  public java.util.List<CapabilityStatementRestModel> getRest() {
    return this.rest;
  }
  public void setRest( java.util.List<CapabilityStatementRestModel> value) {
    this.rest = value;
  }
  public java.util.List<CapabilityStatementMessagingModel> getMessaging() {
    return this.messaging;
  }
  public void setMessaging( java.util.List<CapabilityStatementMessagingModel> value) {
    this.messaging = value;
  }
  public java.util.List<CapabilityStatementDocumentModel> getDocument() {
    return this.document;
  }
  public void setDocument( java.util.List<CapabilityStatementDocumentModel> value) {
    this.document = value;
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
    builder.append("[CapabilityStatementModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("url" + "->" + this.url + "\n"); 
     builder.append("version" + "->" + this.version + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("title" + "->" + this.title + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("experimental" + "->" + this.experimental + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("publisher" + "->" + this.publisher + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("jurisdiction" + "->" + this.jurisdiction + "\n"); 
     builder.append("purpose" + "->" + this.purpose + "\n"); 
     builder.append("copyright" + "->" + this.copyright + "\n"); 
     builder.append("kind" + "->" + this.kind + "\n"); 
     builder.append("instantiates" + "->" + this.instantiates + "\n"); 
     builder.append("fhirVersion" + "->" + this.fhirVersion + "\n"); 
     builder.append("acceptUnknown" + "->" + this.acceptUnknown + "\n"); 
     builder.append("format" + "->" + this.format + "\n"); 
     builder.append("patchFormat" + "->" + this.patchFormat + "\n"); 
     builder.append("implementationGuide" + "->" + this.implementationGuide + "\n"); 
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
    builder.append("[CapabilityStatementModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("url" + "->" + this.url + "\n"); 
     builder.append("version" + "->" + this.version + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("title" + "->" + this.title + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("experimental" + "->" + this.experimental + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("publisher" + "->" + this.publisher + "\n"); 
     builder.append("contact" + "->" + this.contact + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("useContext" + "->" + this.useContext + "\n"); 
     builder.append("jurisdiction" + "->" + this.jurisdiction + "\n"); 
     builder.append("purpose" + "->" + this.purpose + "\n"); 
     builder.append("copyright" + "->" + this.copyright + "\n"); 
     builder.append("kind" + "->" + this.kind + "\n"); 
     builder.append("instantiates" + "->" + this.instantiates + "\n"); 
     builder.append("software" + "->" + this.software + "\n"); 
     builder.append("implementation" + "->" + this.implementation + "\n"); 
     builder.append("fhirVersion" + "->" + this.fhirVersion + "\n"); 
     builder.append("acceptUnknown" + "->" + this.acceptUnknown + "\n"); 
     builder.append("format" + "->" + this.format + "\n"); 
     builder.append("patchFormat" + "->" + this.patchFormat + "\n"); 
     builder.append("implementationGuide" + "->" + this.implementationGuide + "\n"); 
     builder.append("profile" + "->" + this.profile + "\n"); 
     builder.append("rest" + "->" + this.rest + "\n"); 
     builder.append("messaging" + "->" + this.messaging + "\n"); 
     builder.append("document" + "->" + this.document + "\n"); 
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
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
import org.fhir.entity.CapabilityStatementModel;
import com.google.gson.GsonBuilder;

/**
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
*/
public class CapabilityStatement  {
  /**
  * Description: "This is a CapabilityStatement resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this capability statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this capability statement is (or will be) published. The URL SHOULD include the major version of the capability statement. For more information see [Technical and Business Versions](resource.html#versions)."
  */
  private String url;

  /**
  * Description: "Extensions for url"
  */
  private transient Element _url;

  /**
  * Description: "The identifier that is used to identify this version of the capability statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the capability statement author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence."
  */
  private String version;

  /**
  * Description: "Extensions for version"
  */
  private transient Element _version;

  /**
  * Description: "A natural language name identifying the capability statement. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "A short, descriptive, user-friendly title for the capability statement."
  */
  private String title;

  /**
  * Description: "Extensions for title"
  */
  private transient Element _title;

  /**
  * Description: "The status of this capability statement. Enables tracking the life-cycle of the content."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "A boolean value to indicate that this capability statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  private Boolean experimental;

  /**
  * Description: "Extensions for experimental"
  */
  private transient Element _experimental;

  /**
  * Description: "The date  (and optionally time) when the capability statement was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the capability statement changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String date;

  /**
  * Description: "Extensions for date"
  */
  private transient Element _date;

  /**
  * Description: "The name of the individual or organization that published the capability statement."
  */
  private String publisher;

  /**
  * Description: "Extensions for publisher"
  */
  private transient Element _publisher;

  /**
  * Description: "Contact details to assist a user in finding and communicating with the publisher."
  */
  private java.util.List<ContactDetail> contact = new java.util.ArrayList<>();

  /**
  * Description: "A free text natural language description of the capability statement from a consumer's perspective. Typically, this is used when the capability statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate capability statement instances."
  */
  private java.util.List<UsageContext> useContext = new java.util.ArrayList<>();

  /**
  * Description: "A legal or geographic region in which the capability statement is intended to be used."
  */
  private java.util.List<CodeableConcept> jurisdiction = new java.util.ArrayList<>();

  /**
  * Description: "Explaination of why this capability statement is needed and why it has been designed as it has."
  */
  private String purpose;

  /**
  * Description: "Extensions for purpose"
  */
  private transient Element _purpose;

  /**
  * Description: "A copyright statement relating to the capability statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the capability statement."
  */
  private String copyright;

  /**
  * Description: "Extensions for copyright"
  */
  private transient Element _copyright;

  /**
  * Description: "The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind not instance of software) or a class of implementation (e.g. a desired purchase)."
  */
  private String kind;

  /**
  * Description: "Extensions for kind"
  */
  private transient Element _kind;

  /**
  * Description: "Reference to a canonical URL of another CapabilityStatement that this software implements or uses. This capability statement is a published API description that corresponds to a business service. The rest of the capability statement does not need to repeat the details of the referenced resource, but can do so."
  */
  private java.util.List<String> instantiates = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for instantiates"
  */
  private transient java.util.List<Element> _instantiates = new java.util.ArrayList<>();

  /**
  * Description: "Software that is covered by this capability statement.  It is used when the capability statement describes the capabilities of a particular software version, independent of an installation."
  */
  private CapabilityStatementSoftware software;

  /**
  * Description: "Identifies a specific implementation instance that is described by the capability statement - i.e. a particular installation, rather than the capabilities of a software program."
  */
  private CapabilityStatementImplementation implementation;

  /**
  * Description: "The version of the FHIR specification on which this capability statement is based."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String fhirVersion;

  /**
  * Description: "Extensions for fhirVersion"
  */
  private transient Element _fhirVersion;

  /**
  * Description: "A code that indicates whether the application accepts unknown elements or extensions when reading resources."
  */
  private String acceptUnknown;

  /**
  * Description: "Extensions for acceptUnknown"
  */
  private transient Element _acceptUnknown;

  /**
  * Description: "A list of the formats supported by this implementation using their content types."
  */
  private java.util.List<String> format = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for format"
  */
  private transient java.util.List<Element> _format = new java.util.ArrayList<>();

  /**
  * Description: "A list of the patch formats supported by this implementation using their content types."
  */
  private java.util.List<String> patchFormat = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for patchFormat"
  */
  private transient java.util.List<Element> _patchFormat = new java.util.ArrayList<>();

  /**
  * Description: "A list of implementation guides that the server does (or should) support in their entirety."
  */
  private java.util.List<String> implementationGuide = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for implementationGuide"
  */
  private transient java.util.List<Element> _implementationGuide = new java.util.ArrayList<>();

  /**
  * Description: "A list of profiles that represent different use cases supported by the system. For a server, \"supported by the system\" means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles](profiling.html#profile-uses)."
  */
  private java.util.List<Reference> profile = new java.util.ArrayList<>();

  /**
  * Description: "A definition of the restful capabilities of the solution, if any."
  */
  private java.util.List<CapabilityStatementRest> rest = new java.util.ArrayList<>();

  /**
  * Description: "A description of the messaging capabilities of the solution."
  */
  private java.util.List<CapabilityStatementMessaging> messaging = new java.util.ArrayList<>();

  /**
  * Description: "A document definition."
  */
  private java.util.List<CapabilityStatementDocument> document = new java.util.ArrayList<>();

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

  public CapabilityStatement() {
  }

  public CapabilityStatement(CapabilityStatementModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      if (null != o.getUrl()) {
        this.url = new String(o.getUrl());
      }

      if (null != o.getVersion()) {
        this.version = new String(o.getVersion());
      }

      if (null != o.getName()) {
        this.name = new String(o.getName());
      }

      if (null != o.getTitle()) {
        this.title = new String(o.getTitle());
      }

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getExperimental()) {
        this.experimental = new Boolean(o.getExperimental());
      }

      if (null != o.getDate()) {
        this.date = new String(o.getDate());
      }

      if (null != o.getPublisher()) {
        this.publisher = new String(o.getPublisher());
      }

      this.contact = ContactDetail.fromArray(o.getContact());

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      this.useContext = UsageContext.fromArray(o.getUseContext());

      this.jurisdiction = CodeableConcept.fromArray(o.getJurisdiction());
      if (null != o.getPurpose()) {
        this.purpose = new String(o.getPurpose());
      }

      if (null != o.getCopyright()) {
        this.copyright = new String(o.getCopyright());
      }

      if (null != o.getKind()) {
        this.kind = new String(o.getKind());
      }

      this.instantiates = org.fhir.utils.JsonUtils.json2Array(o.getInstantiates());

      if (null != o.getSoftware()) {
        this.software = new CapabilityStatementSoftware(o.getSoftware());
        this.software.setId(this.getId());
      }

      if (null != o.getImplementation()) {
        this.implementation = new CapabilityStatementImplementation(o.getImplementation());
        this.implementation.setId(this.getId());
      }

      if (null != o.getFhirVersion()) {
        this.fhirVersion = new String(o.getFhirVersion());
      }

      if (null != o.getAcceptUnknown()) {
        this.acceptUnknown = new String(o.getAcceptUnknown());
      }

      this.format = org.fhir.utils.JsonUtils.json2Array(o.getFormat());

      this.patchFormat = org.fhir.utils.JsonUtils.json2Array(o.getPatchFormat());

      this.implementationGuide = org.fhir.utils.JsonUtils.json2Array(o.getImplementationGuide());

      this.profile = Reference.fromArray(o.getProfile());

      this.rest = CapabilityStatementRest.fromArray(o.getRest());

      this.messaging = CapabilityStatementMessaging.fromArray(o.getMessaging());

      this.document = CapabilityStatementDocument.fromArray(o.getDocument());

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
  public void setUrl( String value) {
    this.url = value;
  }
  public String getUrl() {
    return this.url;
  }
  public void set_url( Element value) {
    this._url = value;
  }
  public Element get_url() {
    return this._url;
  }
  public void setVersion( String value) {
    this.version = value;
  }
  public String getVersion() {
    return this.version;
  }
  public void set_version( Element value) {
    this._version = value;
  }
  public Element get_version() {
    return this._version;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void set_name( Element value) {
    this._name = value;
  }
  public Element get_name() {
    return this._name;
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
  public void setExperimental( Boolean value) {
    this.experimental = value;
  }
  public Boolean getExperimental() {
    return this.experimental;
  }
  public void set_experimental( Element value) {
    this._experimental = value;
  }
  public Element get_experimental() {
    return this._experimental;
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
  public void setPublisher( String value) {
    this.publisher = value;
  }
  public String getPublisher() {
    return this.publisher;
  }
  public void set_publisher( Element value) {
    this._publisher = value;
  }
  public Element get_publisher() {
    return this._publisher;
  }
  public void setContact( java.util.List<ContactDetail> value) {
    this.contact = value;
  }
  public java.util.List<ContactDetail> getContact() {
    return this.contact;
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
  public void setUseContext( java.util.List<UsageContext> value) {
    this.useContext = value;
  }
  public java.util.List<UsageContext> getUseContext() {
    return this.useContext;
  }
  public void setJurisdiction( java.util.List<CodeableConcept> value) {
    this.jurisdiction = value;
  }
  public java.util.List<CodeableConcept> getJurisdiction() {
    return this.jurisdiction;
  }
  public void setPurpose( String value) {
    this.purpose = value;
  }
  public String getPurpose() {
    return this.purpose;
  }
  public void set_purpose( Element value) {
    this._purpose = value;
  }
  public Element get_purpose() {
    return this._purpose;
  }
  public void setCopyright( String value) {
    this.copyright = value;
  }
  public String getCopyright() {
    return this.copyright;
  }
  public void set_copyright( Element value) {
    this._copyright = value;
  }
  public Element get_copyright() {
    return this._copyright;
  }
  public void setKind( String value) {
    this.kind = KindEnum.fromCode(value);
  }
  public String getKind() {
    return this.kind;
  }
  public void set_kind( Element value) {
    this._kind = value;
  }
  public Element get_kind() {
    return this._kind;
  }
  public void setInstantiates( java.util.List<String> value) {
    this.instantiates = value;
  }
  public java.util.List<String> getInstantiates() {
    return this.instantiates;
  }
  public void set_instantiates( java.util.List<Element> value) {
    this._instantiates = value;
  }
  public java.util.List<Element> get_instantiates() {
    return this._instantiates;
  }
  public void setSoftware( CapabilityStatementSoftware value) {
    this.software = value;
  }
  public CapabilityStatementSoftware getSoftware() {
    return this.software;
  }
  public void setImplementation( CapabilityStatementImplementation value) {
    this.implementation = value;
  }
  public CapabilityStatementImplementation getImplementation() {
    return this.implementation;
  }
  public void setFhirVersion( String value) {
    this.fhirVersion = value;
  }
  public String getFhirVersion() {
    return this.fhirVersion;
  }
  public void set_fhirVersion( Element value) {
    this._fhirVersion = value;
  }
  public Element get_fhirVersion() {
    return this._fhirVersion;
  }
  public void setAcceptUnknown( String value) {
    this.acceptUnknown = AcceptUnknownEnum.fromCode(value);
  }
  public String getAcceptUnknown() {
    return this.acceptUnknown;
  }
  public void set_acceptUnknown( Element value) {
    this._acceptUnknown = value;
  }
  public Element get_acceptUnknown() {
    return this._acceptUnknown;
  }
  public void setFormat( java.util.List<String> value) {
    this.format = value;
  }
  public java.util.List<String> getFormat() {
    return this.format;
  }
  public void set_format( java.util.List<Element> value) {
    this._format = value;
  }
  public java.util.List<Element> get_format() {
    return this._format;
  }
  public void setPatchFormat( java.util.List<String> value) {
    this.patchFormat = value;
  }
  public java.util.List<String> getPatchFormat() {
    return this.patchFormat;
  }
  public void set_patchFormat( java.util.List<Element> value) {
    this._patchFormat = value;
  }
  public java.util.List<Element> get_patchFormat() {
    return this._patchFormat;
  }
  public void setImplementationGuide( java.util.List<String> value) {
    this.implementationGuide = value;
  }
  public java.util.List<String> getImplementationGuide() {
    return this.implementationGuide;
  }
  public void set_implementationGuide( java.util.List<Element> value) {
    this._implementationGuide = value;
  }
  public java.util.List<Element> get_implementationGuide() {
    return this._implementationGuide;
  }
  public void setProfile( java.util.List<Reference> value) {
    this.profile = value;
  }
  public java.util.List<Reference> getProfile() {
    return this.profile;
  }
  public void setRest( java.util.List<CapabilityStatementRest> value) {
    this.rest = value;
  }
  public java.util.List<CapabilityStatementRest> getRest() {
    return this.rest;
  }
  public void setMessaging( java.util.List<CapabilityStatementMessaging> value) {
    this.messaging = value;
  }
  public java.util.List<CapabilityStatementMessaging> getMessaging() {
    return this.messaging;
  }
  public void setDocument( java.util.List<CapabilityStatementDocument> value) {
    this.document = value;
  }
  public java.util.List<CapabilityStatementDocument> getDocument() {
    return this.document;
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
     builder.append("url" + "[" + String.valueOf(this.url) + "]\n"); 
     builder.append("_url" + "[" + String.valueOf(this._url) + "]\n"); 
     builder.append("version" + "[" + String.valueOf(this.version) + "]\n"); 
     builder.append("_version" + "[" + String.valueOf(this._version) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("title" + "[" + String.valueOf(this.title) + "]\n"); 
     builder.append("_title" + "[" + String.valueOf(this._title) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("experimental" + "[" + String.valueOf(this.experimental) + "]\n"); 
     builder.append("_experimental" + "[" + String.valueOf(this._experimental) + "]\n"); 
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("_date" + "[" + String.valueOf(this._date) + "]\n"); 
     builder.append("publisher" + "[" + String.valueOf(this.publisher) + "]\n"); 
     builder.append("_publisher" + "[" + String.valueOf(this._publisher) + "]\n"); 
     builder.append("contact" + "[" + String.valueOf(this.contact) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("useContext" + "[" + String.valueOf(this.useContext) + "]\n"); 
     builder.append("jurisdiction" + "[" + String.valueOf(this.jurisdiction) + "]\n"); 
     builder.append("purpose" + "[" + String.valueOf(this.purpose) + "]\n"); 
     builder.append("_purpose" + "[" + String.valueOf(this._purpose) + "]\n"); 
     builder.append("copyright" + "[" + String.valueOf(this.copyright) + "]\n"); 
     builder.append("_copyright" + "[" + String.valueOf(this._copyright) + "]\n"); 
     builder.append("kind" + "[" + String.valueOf(this.kind) + "]\n"); 
     builder.append("_kind" + "[" + String.valueOf(this._kind) + "]\n"); 
     builder.append("instantiates" + "[" + String.valueOf(this.instantiates) + "]\n"); 
     builder.append("_instantiates" + "[" + String.valueOf(this._instantiates) + "]\n"); 
     builder.append("software" + "[" + String.valueOf(this.software) + "]\n"); 
     builder.append("implementation" + "[" + String.valueOf(this.implementation) + "]\n"); 
     builder.append("fhirVersion" + "[" + String.valueOf(this.fhirVersion) + "]\n"); 
     builder.append("_fhirVersion" + "[" + String.valueOf(this._fhirVersion) + "]\n"); 
     builder.append("acceptUnknown" + "[" + String.valueOf(this.acceptUnknown) + "]\n"); 
     builder.append("_acceptUnknown" + "[" + String.valueOf(this._acceptUnknown) + "]\n"); 
     builder.append("format" + "[" + String.valueOf(this.format) + "]\n"); 
     builder.append("_format" + "[" + String.valueOf(this._format) + "]\n"); 
     builder.append("patchFormat" + "[" + String.valueOf(this.patchFormat) + "]\n"); 
     builder.append("_patchFormat" + "[" + String.valueOf(this._patchFormat) + "]\n"); 
     builder.append("implementationGuide" + "[" + String.valueOf(this.implementationGuide) + "]\n"); 
     builder.append("_implementationGuide" + "[" + String.valueOf(this._implementationGuide) + "]\n"); 
     builder.append("profile" + "[" + String.valueOf(this.profile) + "]\n"); 
     builder.append("rest" + "[" + String.valueOf(this.rest) + "]\n"); 
     builder.append("messaging" + "[" + String.valueOf(this.messaging) + "]\n"); 
     builder.append("document" + "[" + String.valueOf(this.document) + "]\n"); 
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
  	CapabilityStatement,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "CapabilityStatement" : { return CapabilityStatement.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	draft,
  	active,
  	retired,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "draft" : { return draft.toString(); }
  			case "active" : { return active.toString(); }
  			case "retired" : { return retired.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum KindEnum {
  	instance,
  	capability,
  	requirements,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "instance" : { return instance.toString(); }
  			case "capability" : { return capability.toString(); }
  			case "requirements" : { return requirements.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum AcceptUnknownEnum {
  	no,
  	extensions,
  	elements,
  	both,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "no" : { return no.toString(); }
  			case "extensions" : { return extensions.toString(); }
  			case "elements" : { return elements.toString(); }
  			case "both" : { return both.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<CapabilityStatement> fromArray(java.util.List<CapabilityStatementModel> list) {
    return (java.util.List<CapabilityStatement>)list.stream()
      .map(model -> new CapabilityStatement(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CapabilityStatementModel> toModelArray(java.util.List<CapabilityStatement> list) {
    return (java.util.List<CapabilityStatementModel>)list.stream()
      .map(model -> new CapabilityStatementModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static CapabilityStatement fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CapabilityStatement.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(CapabilityStatement o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<CapabilityStatement> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
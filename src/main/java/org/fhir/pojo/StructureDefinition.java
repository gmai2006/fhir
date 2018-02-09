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
import org.fhir.entity.StructureDefinitionModel;
import com.google.gson.GsonBuilder;

/**
* "A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types."
*/
public class StructureDefinition  {
  /**
  * Description: "This is a StructureDefinition resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this structure definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this structure definition is (or will be) published. The URL SHOULD include the major version of the structure definition. For more information see [Technical and Business Versions](resource.html#versions)."
  */
  private String url;

  /**
  * Description: "Extensions for url"
  */
  private transient Element _url;

  /**
  * Description: "A formal identifier that is used to identify this structure definition when it is represented in other formats, or referenced in a specification, model, design or an instance."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "The identifier that is used to identify this version of the structure definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the structure definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence."
  */
  private String version;

  /**
  * Description: "Extensions for version"
  */
  private transient Element _version;

  /**
  * Description: "A natural language name identifying the structure definition. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "A short, descriptive, user-friendly title for the structure definition."
  */
  private String title;

  /**
  * Description: "Extensions for title"
  */
  private transient Element _title;

  /**
  * Description: "The status of this structure definition. Enables tracking the life-cycle of the content."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "A boolean value to indicate that this structure definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  private Boolean experimental;

  /**
  * Description: "Extensions for experimental"
  */
  private transient Element _experimental;

  /**
  * Description: "The date  (and optionally time) when the structure definition was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the structure definition changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String date;

  /**
  * Description: "Extensions for date"
  */
  private transient Element _date;

  /**
  * Description: "The name of the individual or organization that published the structure definition."
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
  * Description: "A free text natural language description of the structure definition from a consumer's perspective."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate structure definition instances."
  */
  private java.util.List<UsageContext> useContext = new java.util.ArrayList<>();

  /**
  * Description: "A legal or geographic region in which the structure definition is intended to be used."
  */
  private java.util.List<CodeableConcept> jurisdiction = new java.util.ArrayList<>();

  /**
  * Description: "Explaination of why this structure definition is needed and why it has been designed as it has."
  */
  private String purpose;

  /**
  * Description: "Extensions for purpose"
  */
  private transient Element _purpose;

  /**
  * Description: "A copyright statement relating to the structure definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the structure definition."
  */
  private String copyright;

  /**
  * Description: "Extensions for copyright"
  */
  private transient Element _copyright;

  /**
  * Description: "A set of key words or terms from external terminologies that may be used to assist with indexing and searching of templates."
  */
  private java.util.List<Coding> keyword = new java.util.ArrayList<>();

  /**
  * Description: "The version of the FHIR specification on which this StructureDefinition is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 3.0.1 for this version."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String fhirVersion;

  /**
  * Description: "Extensions for fhirVersion"
  */
  private transient Element _fhirVersion;

  /**
  * Description: "An external specification that the content is mapped to."
  */
  private java.util.List<StructureDefinitionMapping> mapping = new java.util.ArrayList<>();

  /**
  * Description: "Defines the kind of structure that this definition is describing."
  */
  private String kind;

  /**
  * Description: "Extensions for kind"
  */
  private transient Element _kind;

  /**
  * Description: "Whether structure this definition describes is abstract or not  - that is, whether the structure is not intended to be instantiated. For Resources and Data types, abstract types will never be exchanged  between systems."
  */
  private Boolean FHIRabstract;

  /**
  * Description: "Extensions for abstract"
  */
  private transient Element _abstract;

  /**
  * Description: "If this is an extension, Identifies the context within FHIR resources where the extension can be used."
  */
  private String contextType;

  /**
  * Description: "Extensions for contextType"
  */
  private transient Element _contextType;

  /**
  * Description: "Identifies the types of resource or data type elements to which the extension can be applied."
  */
  private java.util.List<String> context = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for context"
  */
  private transient java.util.List<Element> _context = new java.util.ArrayList<>();

  /**
  * Description: "A set of rules as Fluent Invariants about when the extension can be used (e.g. co-occurrence variants for the extension)."
  */
  private java.util.List<String> contextInvariant = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for contextInvariant"
  */
  private transient java.util.List<Element> _contextInvariant = new java.util.ArrayList<>();

  /**
  * Description: "The type this structure describes. If the derivation kind is 'specialization' then this is the master definition for a type, and there is always one of these (a data type, an extension, a resource, including abstract ones). Otherwise the structure definition is a constraint on the stated type (and in this case, the type cannot be an abstract type)."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String type;

  /**
  * Description: "Extensions for type"
  */
  private transient Element _type;

  /**
  * Description: "An absolute URI that is the base structure from which this type is derived, either by specialization or constraint."
  */
  private String baseDefinition;

  /**
  * Description: "Extensions for baseDefinition"
  */
  private transient Element _baseDefinition;

  /**
  * Description: "How the type relates to the baseDefinition."
  */
  private String derivation;

  /**
  * Description: "Extensions for derivation"
  */
  private transient Element _derivation;

  /**
  * Description: "A snapshot view is expressed in a stand alone form that can be used and interpreted without considering the base StructureDefinition."
  */
  private StructureDefinitionSnapshot snapshot;

  /**
  * Description: "A differential view is expressed relative to the base StructureDefinition - a statement of differences that it applies."
  */
  private StructureDefinitionDifferential differential;

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

  public StructureDefinition() {
  }

  public StructureDefinition(StructureDefinitionModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      if (null != o.getUrl()) {
        this.url = new String(o.getUrl());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
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

      this.keyword = Coding.fromArray(o.getKeyword());
      if (null != o.getFhirVersion()) {
        this.fhirVersion = new String(o.getFhirVersion());
      }

      this.mapping = StructureDefinitionMapping.fromArray(o.getMapping());
      if (null != o.getKind()) {
        this.kind = new String(o.getKind());
      }

      if (null != o.getFHIRabstract()) {
        this.FHIRabstract = new Boolean(o.getFHIRabstract());
      }

      if (null != o.getContextType()) {
        this.contextType = new String(o.getContextType());
      }

      this.context = org.fhir.utils.JsonUtils.json2Array(o.getContext());

      this.contextInvariant = org.fhir.utils.JsonUtils.json2Array(o.getContextInvariant());

      if (null != o.getType()) {
        this.type = new String(o.getType());
      }

      if (null != o.getBaseDefinition()) {
        this.baseDefinition = new String(o.getBaseDefinition());
      }

      if (null != o.getDerivation()) {
        this.derivation = new String(o.getDerivation());
      }

      this.snapshot = StructureDefinitionSnapshot.fromJson(o.getSnapshot());
      this.differential = StructureDefinitionDifferential.fromJson(o.getDifferential());
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
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
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
  public void setKeyword( java.util.List<Coding> value) {
    this.keyword = value;
  }
  public java.util.List<Coding> getKeyword() {
    return this.keyword;
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
  public void setMapping( java.util.List<StructureDefinitionMapping> value) {
    this.mapping = value;
  }
  public java.util.List<StructureDefinitionMapping> getMapping() {
    return this.mapping;
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
  public void setFHIRabstract( Boolean value) {
    this.FHIRabstract = value;
  }
  public Boolean getFHIRabstract() {
    return this.FHIRabstract;
  }
  public void set_abstract( Element value) {
    this._abstract = value;
  }
  public Element get_abstract() {
    return this._abstract;
  }
  public void setContextType( String value) {
    this.contextType = ContextTypeEnum.fromCode(value);
  }
  public String getContextType() {
    return this.contextType;
  }
  public void set_contextType( Element value) {
    this._contextType = value;
  }
  public Element get_contextType() {
    return this._contextType;
  }
  public void setContext( java.util.List<String> value) {
    this.context = value;
  }
  public java.util.List<String> getContext() {
    return this.context;
  }
  public void set_context( java.util.List<Element> value) {
    this._context = value;
  }
  public java.util.List<Element> get_context() {
    return this._context;
  }
  public void setContextInvariant( java.util.List<String> value) {
    this.contextInvariant = value;
  }
  public java.util.List<String> getContextInvariant() {
    return this.contextInvariant;
  }
  public void set_contextInvariant( java.util.List<Element> value) {
    this._contextInvariant = value;
  }
  public java.util.List<Element> get_contextInvariant() {
    return this._contextInvariant;
  }
  public void setType( String value) {
    this.type = value;
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
  public void setBaseDefinition( String value) {
    this.baseDefinition = value;
  }
  public String getBaseDefinition() {
    return this.baseDefinition;
  }
  public void set_baseDefinition( Element value) {
    this._baseDefinition = value;
  }
  public Element get_baseDefinition() {
    return this._baseDefinition;
  }
  public void setDerivation( String value) {
    this.derivation = DerivationEnum.fromCode(value);
  }
  public String getDerivation() {
    return this.derivation;
  }
  public void set_derivation( Element value) {
    this._derivation = value;
  }
  public Element get_derivation() {
    return this._derivation;
  }
  public void setSnapshot( StructureDefinitionSnapshot value) {
    this.snapshot = value;
  }
  public StructureDefinitionSnapshot getSnapshot() {
    return this.snapshot;
  }
  public void setDifferential( StructureDefinitionDifferential value) {
    this.differential = value;
  }
  public StructureDefinitionDifferential getDifferential() {
    return this.differential;
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
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
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
     builder.append("keyword" + "[" + String.valueOf(this.keyword) + "]\n"); 
     builder.append("fhirVersion" + "[" + String.valueOf(this.fhirVersion) + "]\n"); 
     builder.append("_fhirVersion" + "[" + String.valueOf(this._fhirVersion) + "]\n"); 
     builder.append("mapping" + "[" + String.valueOf(this.mapping) + "]\n"); 
     builder.append("kind" + "[" + String.valueOf(this.kind) + "]\n"); 
     builder.append("_kind" + "[" + String.valueOf(this._kind) + "]\n"); 
     builder.append("FHIRabstract" + "[" + String.valueOf(this.FHIRabstract) + "]\n"); 
     builder.append("_abstract" + "[" + String.valueOf(this._abstract) + "]\n"); 
     builder.append("contextType" + "[" + String.valueOf(this.contextType) + "]\n"); 
     builder.append("_contextType" + "[" + String.valueOf(this._contextType) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("_context" + "[" + String.valueOf(this._context) + "]\n"); 
     builder.append("contextInvariant" + "[" + String.valueOf(this.contextInvariant) + "]\n"); 
     builder.append("_contextInvariant" + "[" + String.valueOf(this._contextInvariant) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("_type" + "[" + String.valueOf(this._type) + "]\n"); 
     builder.append("baseDefinition" + "[" + String.valueOf(this.baseDefinition) + "]\n"); 
     builder.append("_baseDefinition" + "[" + String.valueOf(this._baseDefinition) + "]\n"); 
     builder.append("derivation" + "[" + String.valueOf(this.derivation) + "]\n"); 
     builder.append("_derivation" + "[" + String.valueOf(this._derivation) + "]\n"); 
     builder.append("snapshot" + "[" + String.valueOf(this.snapshot) + "]\n"); 
     builder.append("differential" + "[" + String.valueOf(this.differential) + "]\n"); 
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
  	StructureDefinition,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "StructureDefinition" : { return StructureDefinition.toString(); }
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
  	primitivetype,
  	complextype,
  	resource,
  	logical,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "primitivetype" : { return primitivetype.toString(); }
  			case "complextype" : { return complextype.toString(); }
  			case "resource" : { return resource.toString(); }
  			case "logical" : { return logical.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum ContextTypeEnum {
  	resource,
  	datatype,
  	extension,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "resource" : { return resource.toString(); }
  			case "datatype" : { return datatype.toString(); }
  			case "extension" : { return extension.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum DerivationEnum {
  	specialization,
  	constraint,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "specialization" : { return specialization.toString(); }
  			case "constraint" : { return constraint.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<StructureDefinition> fromArray(java.util.List<StructureDefinitionModel> list) {
    return (java.util.List<StructureDefinition>)list.stream()
      .map(model -> new StructureDefinition(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<StructureDefinitionModel> toModelArray(java.util.List<StructureDefinition> list) {
    return (java.util.List<StructureDefinitionModel>)list.stream()
      .map(model -> new StructureDefinitionModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static StructureDefinition fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, StructureDefinition.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(StructureDefinition o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<StructureDefinition> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
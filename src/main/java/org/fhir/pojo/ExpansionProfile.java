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
import org.fhir.entity.ExpansionProfileModel;
import com.google.gson.GsonBuilder;

/**
* "Resource to define constraints on the Expansion of a FHIR ValueSet."
*/
public class ExpansionProfile  {
  /**
  * Description: "This is a ExpansionProfile resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this expansion profile when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this expansion profile is (or will be) published. The URL SHOULD include the major version of the expansion profile. For more information see [Technical and Business Versions](resource.html#versions)."
  */
  private String url;

  /**
  * Description: "Extensions for url"
  */
  private transient Element _url;

  /**
  * Description: "A formal identifier that is used to identify this expansion profile when it is represented in other formats, or referenced in a specification, model, design or an instance."
  */
  private Identifier identifier;

  /**
  * Description: "The identifier that is used to identify this version of the expansion profile when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the expansion profile author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence."
  */
  private String version;

  /**
  * Description: "Extensions for version"
  */
  private transient Element _version;

  /**
  * Description: "A natural language name identifying the expansion profile. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "The status of this expansion profile. Enables tracking the life-cycle of the content."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "A boolean value to indicate that this expansion profile is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  private Boolean experimental;

  /**
  * Description: "Extensions for experimental"
  */
  private transient Element _experimental;

  /**
  * Description: "The date  (and optionally time) when the expansion profile was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the expansion profile changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String date;

  /**
  * Description: "Extensions for date"
  */
  private transient Element _date;

  /**
  * Description: "The name of the individual or organization that published the expansion profile."
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
  * Description: "A free text natural language description of the expansion profile from a consumer's perspective."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate expansion profile instances."
  */
  private java.util.List<UsageContext> useContext = new java.util.ArrayList<>();

  /**
  * Description: "A legal or geographic region in which the expansion profile is intended to be used."
  */
  private java.util.List<CodeableConcept> jurisdiction = new java.util.ArrayList<>();

  /**
  * Description: "Fix use of a particular code system to a particular version."
  */
  private java.util.List<ExpansionProfileFixedVersion> fixedVersion = new java.util.ArrayList<>();

  /**
  * Description: "Code system, or a particular version of a code system to be excluded from value set expansions."
  */
  private ExpansionProfileExcludedSystem excludedSystem;

  /**
  * Description: "Controls whether concept designations are to be included or excluded in value set expansions."
  */
  private Boolean includeDesignations;

  /**
  * Description: "Extensions for includeDesignations"
  */
  private transient Element _includeDesignations;

  /**
  * Description: "A set of criteria that provide the constraints imposed on the value set expansion by including or excluding designations."
  */
  private ExpansionProfileDesignation designation;

  /**
  * Description: "Controls whether the value set definition is included or excluded in value set expansions."
  */
  private Boolean includeDefinition;

  /**
  * Description: "Extensions for includeDefinition"
  */
  private transient Element _includeDefinition;

  /**
  * Description: "Controls whether inactive concepts are included or excluded in value set expansions."
  */
  private Boolean activeOnly;

  /**
  * Description: "Extensions for activeOnly"
  */
  private transient Element _activeOnly;

  /**
  * Description: "Controls whether or not the value set expansion nests codes or not (i.e. ValueSet.expansion.contains.contains)."
  */
  private Boolean excludeNested;

  /**
  * Description: "Extensions for excludeNested"
  */
  private transient Element _excludeNested;

  /**
  * Description: "Controls whether or not the value set expansion includes codes which cannot be displayed in user interfaces."
  */
  private Boolean excludeNotForUI;

  /**
  * Description: "Extensions for excludeNotForUI"
  */
  private transient Element _excludeNotForUI;

  /**
  * Description: "Controls whether or not the value set expansion includes post coordinated codes."
  */
  private Boolean excludePostCoordinated;

  /**
  * Description: "Extensions for excludePostCoordinated"
  */
  private transient Element _excludePostCoordinated;

  /**
  * Description: "Specifies the language to be used for description in the expansions i.e. the language to be used for ValueSet.expansion.contains.display."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String displayLanguage;

  /**
  * Description: "Extensions for displayLanguage"
  */
  private transient Element _displayLanguage;

  /**
  * Description: "If the value set being expanded is incomplete (because it is too big to expand), return a limited expansion (a subset) with an indicator that expansion is incomplete, using the extension [http://hl7.org/fhir/StructureDefinition/valueset-toocostly](extension-valueset-toocostly.html)."
  */
  private Boolean limitedExpansion;

  /**
  * Description: "Extensions for limitedExpansion"
  */
  private transient Element _limitedExpansion;

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

  public ExpansionProfile() {
  }

  public ExpansionProfile(ExpansionProfileModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      if (null != o.getUrl()) {
        this.url = new String(o.getUrl());
      }

      this.identifier = Identifier.fromJson(o.getIdentifier());
      if (null != o.getVersion()) {
        this.version = new String(o.getVersion());
      }

      if (null != o.getName()) {
        this.name = new String(o.getName());
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
      this.fixedVersion = ExpansionProfileFixedVersion.fromArray(o.getFixedVersion());

      if (null != o.getExcludedSystem()) {
        this.excludedSystem = new ExpansionProfileExcludedSystem(o.getExcludedSystem());
        this.excludedSystem.setId(this.getId());
      }

      if (null != o.getIncludeDesignations()) {
        this.includeDesignations = new Boolean(o.getIncludeDesignations());
      }

      if (null != o.getDesignation()) {
        this.designation = new ExpansionProfileDesignation(o.getDesignation());
        this.designation.setId(this.getId());
      }

      if (null != o.getIncludeDefinition()) {
        this.includeDefinition = new Boolean(o.getIncludeDefinition());
      }

      if (null != o.getActiveOnly()) {
        this.activeOnly = new Boolean(o.getActiveOnly());
      }

      if (null != o.getExcludeNested()) {
        this.excludeNested = new Boolean(o.getExcludeNested());
      }

      if (null != o.getExcludeNotForUI()) {
        this.excludeNotForUI = new Boolean(o.getExcludeNotForUI());
      }

      if (null != o.getExcludePostCoordinated()) {
        this.excludePostCoordinated = new Boolean(o.getExcludePostCoordinated());
      }

      if (null != o.getDisplayLanguage()) {
        this.displayLanguage = new String(o.getDisplayLanguage());
      }

      if (null != o.getLimitedExpansion()) {
        this.limitedExpansion = new Boolean(o.getLimitedExpansion());
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
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
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
  public void setFixedVersion( java.util.List<ExpansionProfileFixedVersion> value) {
    this.fixedVersion = value;
  }
  public java.util.List<ExpansionProfileFixedVersion> getFixedVersion() {
    return this.fixedVersion;
  }
  public void setExcludedSystem( ExpansionProfileExcludedSystem value) {
    this.excludedSystem = value;
  }
  public ExpansionProfileExcludedSystem getExcludedSystem() {
    return this.excludedSystem;
  }
  public void setIncludeDesignations( Boolean value) {
    this.includeDesignations = value;
  }
  public Boolean getIncludeDesignations() {
    return this.includeDesignations;
  }
  public void set_includeDesignations( Element value) {
    this._includeDesignations = value;
  }
  public Element get_includeDesignations() {
    return this._includeDesignations;
  }
  public void setDesignation( ExpansionProfileDesignation value) {
    this.designation = value;
  }
  public ExpansionProfileDesignation getDesignation() {
    return this.designation;
  }
  public void setIncludeDefinition( Boolean value) {
    this.includeDefinition = value;
  }
  public Boolean getIncludeDefinition() {
    return this.includeDefinition;
  }
  public void set_includeDefinition( Element value) {
    this._includeDefinition = value;
  }
  public Element get_includeDefinition() {
    return this._includeDefinition;
  }
  public void setActiveOnly( Boolean value) {
    this.activeOnly = value;
  }
  public Boolean getActiveOnly() {
    return this.activeOnly;
  }
  public void set_activeOnly( Element value) {
    this._activeOnly = value;
  }
  public Element get_activeOnly() {
    return this._activeOnly;
  }
  public void setExcludeNested( Boolean value) {
    this.excludeNested = value;
  }
  public Boolean getExcludeNested() {
    return this.excludeNested;
  }
  public void set_excludeNested( Element value) {
    this._excludeNested = value;
  }
  public Element get_excludeNested() {
    return this._excludeNested;
  }
  public void setExcludeNotForUI( Boolean value) {
    this.excludeNotForUI = value;
  }
  public Boolean getExcludeNotForUI() {
    return this.excludeNotForUI;
  }
  public void set_excludeNotForUI( Element value) {
    this._excludeNotForUI = value;
  }
  public Element get_excludeNotForUI() {
    return this._excludeNotForUI;
  }
  public void setExcludePostCoordinated( Boolean value) {
    this.excludePostCoordinated = value;
  }
  public Boolean getExcludePostCoordinated() {
    return this.excludePostCoordinated;
  }
  public void set_excludePostCoordinated( Element value) {
    this._excludePostCoordinated = value;
  }
  public Element get_excludePostCoordinated() {
    return this._excludePostCoordinated;
  }
  public void setDisplayLanguage( String value) {
    this.displayLanguage = value;
  }
  public String getDisplayLanguage() {
    return this.displayLanguage;
  }
  public void set_displayLanguage( Element value) {
    this._displayLanguage = value;
  }
  public Element get_displayLanguage() {
    return this._displayLanguage;
  }
  public void setLimitedExpansion( Boolean value) {
    this.limitedExpansion = value;
  }
  public Boolean getLimitedExpansion() {
    return this.limitedExpansion;
  }
  public void set_limitedExpansion( Element value) {
    this._limitedExpansion = value;
  }
  public Element get_limitedExpansion() {
    return this._limitedExpansion;
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
     builder.append("fixedVersion" + "[" + String.valueOf(this.fixedVersion) + "]\n"); 
     builder.append("excludedSystem" + "[" + String.valueOf(this.excludedSystem) + "]\n"); 
     builder.append("includeDesignations" + "[" + String.valueOf(this.includeDesignations) + "]\n"); 
     builder.append("_includeDesignations" + "[" + String.valueOf(this._includeDesignations) + "]\n"); 
     builder.append("designation" + "[" + String.valueOf(this.designation) + "]\n"); 
     builder.append("includeDefinition" + "[" + String.valueOf(this.includeDefinition) + "]\n"); 
     builder.append("_includeDefinition" + "[" + String.valueOf(this._includeDefinition) + "]\n"); 
     builder.append("activeOnly" + "[" + String.valueOf(this.activeOnly) + "]\n"); 
     builder.append("_activeOnly" + "[" + String.valueOf(this._activeOnly) + "]\n"); 
     builder.append("excludeNested" + "[" + String.valueOf(this.excludeNested) + "]\n"); 
     builder.append("_excludeNested" + "[" + String.valueOf(this._excludeNested) + "]\n"); 
     builder.append("excludeNotForUI" + "[" + String.valueOf(this.excludeNotForUI) + "]\n"); 
     builder.append("_excludeNotForUI" + "[" + String.valueOf(this._excludeNotForUI) + "]\n"); 
     builder.append("excludePostCoordinated" + "[" + String.valueOf(this.excludePostCoordinated) + "]\n"); 
     builder.append("_excludePostCoordinated" + "[" + String.valueOf(this._excludePostCoordinated) + "]\n"); 
     builder.append("displayLanguage" + "[" + String.valueOf(this.displayLanguage) + "]\n"); 
     builder.append("_displayLanguage" + "[" + String.valueOf(this._displayLanguage) + "]\n"); 
     builder.append("limitedExpansion" + "[" + String.valueOf(this.limitedExpansion) + "]\n"); 
     builder.append("_limitedExpansion" + "[" + String.valueOf(this._limitedExpansion) + "]\n"); 
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
  	ExpansionProfile,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ExpansionProfile" : { return ExpansionProfile.toString(); }
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

  public static java.util.List<ExpansionProfile> fromArray(java.util.List<ExpansionProfileModel> list) {
    return (java.util.List<ExpansionProfile>)list.stream()
      .map(model -> new ExpansionProfile(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ExpansionProfileModel> toModelArray(java.util.List<ExpansionProfile> list) {
    return (java.util.List<ExpansionProfileModel>)list.stream()
      .map(model -> new ExpansionProfileModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ExpansionProfile fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ExpansionProfile.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ExpansionProfile o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ExpansionProfile> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
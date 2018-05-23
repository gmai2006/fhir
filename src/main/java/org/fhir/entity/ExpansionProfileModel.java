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
* "Resource to define constraints on the Expansion of a FHIR ValueSet."
*/
@Entity
@Table(name="expansionprofile")
public class ExpansionProfileModel  implements Serializable {
	private static final long serialVersionUID = 151967883224131759L;
  /**
  * Description: "This is a ExpansionProfile resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this expansion profile when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this expansion profile is (or will be) published. The URL SHOULD include the major version of the expansion profile. For more information see [Technical and Business Versions](resource.html#versions)."
  */
  @javax.persistence.Basic
  @Column(name="\"url\"")
  private String url;

  /**
  * Description: "A formal identifier that is used to identify this expansion profile when it is represented in other formats, or referenced in a specification, model, design or an instance."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The identifier that is used to identify this version of the expansion profile when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the expansion profile author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence."
  */
  @javax.persistence.Basic
  @Column(name="\"version\"")
  private String version;

  /**
  * Description: "A natural language name identifying the expansion profile. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "The status of this expansion profile. Enables tracking the life-cycle of the content."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "A boolean value to indicate that this expansion profile is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  @javax.persistence.Basic
  @Column(name="\"experimental\"")
  private Boolean experimental;

  /**
  * Description: "The date  (and optionally time) when the expansion profile was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the expansion profile changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "The name of the individual or organization that published the expansion profile."
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
  * Description: "A free text natural language description of the expansion profile from a consumer's perspective."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate expansion profile instances."
  */
  @javax.persistence.Basic
  @Column(name="\"usecontext_id\"")
  private String usecontext_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="usecontext_id", insertable=false, updatable=false)
  private java.util.List<UsageContextModel> useContext;

  /**
  * Description: "A legal or geographic region in which the expansion profile is intended to be used."
  */
  @javax.persistence.Basic
  @Column(name="\"jurisdiction_id\"")
  private String jurisdiction_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="jurisdiction_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> jurisdiction;

  /**
  * Description: "Fix use of a particular code system to a particular version."
  */
  @javax.persistence.Basic
  @Column(name="\"fixedversion_id\"")
  private String fixedversion_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="fixedversion_id", insertable=false, updatable=false)
  private java.util.List<ExpansionProfileFixedVersionModel> fixedVersion;

  /**
  * Description: "Code system, or a particular version of a code system to be excluded from value set expansions."
  */
  @javax.persistence.Basic
  @Column(name="\"excludedsystem_id\"")
  private String excludedsystem_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="excludedsystem_id", insertable=false, updatable=false)
  private java.util.List<ExpansionProfileExcludedSystemModel> excludedSystem;

  /**
  * Description: "Controls whether concept designations are to be included or excluded in value set expansions."
  */
  @javax.persistence.Basic
  @Column(name="\"includeDesignations\"")
  private Boolean includeDesignations;

  /**
  * Description: "A set of criteria that provide the constraints imposed on the value set expansion by including or excluding designations."
  */
  @javax.persistence.Basic
  @Column(name="\"designation_id\"")
  private String designation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="designation_id", insertable=false, updatable=false)
  private java.util.List<ExpansionProfileDesignationModel> designation;

  /**
  * Description: "Controls whether the value set definition is included or excluded in value set expansions."
  */
  @javax.persistence.Basic
  @Column(name="\"includeDefinition\"")
  private Boolean includeDefinition;

  /**
  * Description: "Controls whether inactive concepts are included or excluded in value set expansions."
  */
  @javax.persistence.Basic
  @Column(name="\"activeOnly\"")
  private Boolean activeOnly;

  /**
  * Description: "Controls whether or not the value set expansion nests codes or not (i.e. ValueSet.expansion.contains.contains)."
  */
  @javax.persistence.Basic
  @Column(name="\"excludeNested\"")
  private Boolean excludeNested;

  /**
  * Description: "Controls whether or not the value set expansion includes codes which cannot be displayed in user interfaces."
  */
  @javax.persistence.Basic
  @Column(name="\"excludeNotForUI\"")
  private Boolean excludeNotForUI;

  /**
  * Description: "Controls whether or not the value set expansion includes post coordinated codes."
  */
  @javax.persistence.Basic
  @Column(name="\"excludePostCoordinated\"")
  private Boolean excludePostCoordinated;

  /**
  * Description: "Specifies the language to be used for description in the expansions i.e. the language to be used for ValueSet.expansion.contains.display."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"displayLanguage\"")
  private String displayLanguage;

  /**
  * Description: "If the value set being expanded is incomplete (because it is too big to expand), return a limited expansion (a subset) with an indicator that expansion is incomplete, using the extension [http://hl7.org/fhir/StructureDefinition/valueset-toocostly](extension-valueset-toocostly.html)."
  */
  @javax.persistence.Basic
  @Column(name="\"limitedExpansion\"")
  private Boolean limitedExpansion;

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

  public ExpansionProfileModel() {
  }

  public ExpansionProfileModel(ExpansionProfile o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.url = o.getUrl();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.version = o.getVersion();
    this.name = o.getName();
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
    if (null != o.getJurisdiction() && !o.getJurisdiction().isEmpty()) {
    	this.jurisdiction_id = "jurisdiction" + this.id;
    	this.jurisdiction = CodeableConceptHelper.toModelFromArray(o.getJurisdiction(), this.jurisdiction_id);
    }
    if (null != o.getFixedVersion() && !o.getFixedVersion().isEmpty()) {
    	this.fixedversion_id = "fixedversion" + this.id;
    	this.fixedVersion = ExpansionProfileFixedVersionHelper.toModelFromArray(o.getFixedVersion(), this.fixedversion_id);
    }
    if (null != o.getExcludedSystem() ) {
    	this.excludedsystem_id = "excludedsystem" + this.id;
    	this.excludedSystem = ExpansionProfileExcludedSystemHelper.toModel(o.getExcludedSystem(), this.excludedsystem_id);
    }
    this.includeDesignations = o.getIncludeDesignations();
    if (null != o.getDesignation() ) {
    	this.designation_id = "designation" + this.id;
    	this.designation = ExpansionProfileDesignationHelper.toModel(o.getDesignation(), this.designation_id);
    }
    this.includeDefinition = o.getIncludeDefinition();
    this.activeOnly = o.getActiveOnly();
    this.excludeNested = o.getExcludeNested();
    this.excludeNotForUI = o.getExcludeNotForUI();
    this.excludePostCoordinated = o.getExcludePostCoordinated();
    this.displayLanguage = o.getDisplayLanguage();
    this.limitedExpansion = o.getLimitedExpansion();
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
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
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
  public java.util.List<ExpansionProfileFixedVersionModel> getFixedVersion() {
    return this.fixedVersion;
  }
  public void setFixedVersion( java.util.List<ExpansionProfileFixedVersionModel> value) {
    this.fixedVersion = value;
  }
  public java.util.List<ExpansionProfileExcludedSystemModel> getExcludedSystem() {
    return this.excludedSystem;
  }
  public void setExcludedSystem( java.util.List<ExpansionProfileExcludedSystemModel> value) {
    this.excludedSystem = value;
  }
  public Boolean getIncludeDesignations() {
    return this.includeDesignations;
  }
  public void setIncludeDesignations( Boolean value) {
    this.includeDesignations = value;
  }
  public java.util.List<ExpansionProfileDesignationModel> getDesignation() {
    return this.designation;
  }
  public void setDesignation( java.util.List<ExpansionProfileDesignationModel> value) {
    this.designation = value;
  }
  public Boolean getIncludeDefinition() {
    return this.includeDefinition;
  }
  public void setIncludeDefinition( Boolean value) {
    this.includeDefinition = value;
  }
  public Boolean getActiveOnly() {
    return this.activeOnly;
  }
  public void setActiveOnly( Boolean value) {
    this.activeOnly = value;
  }
  public Boolean getExcludeNested() {
    return this.excludeNested;
  }
  public void setExcludeNested( Boolean value) {
    this.excludeNested = value;
  }
  public Boolean getExcludeNotForUI() {
    return this.excludeNotForUI;
  }
  public void setExcludeNotForUI( Boolean value) {
    this.excludeNotForUI = value;
  }
  public Boolean getExcludePostCoordinated() {
    return this.excludePostCoordinated;
  }
  public void setExcludePostCoordinated( Boolean value) {
    this.excludePostCoordinated = value;
  }
  public String getDisplayLanguage() {
    return this.displayLanguage;
  }
  public void setDisplayLanguage( String value) {
    this.displayLanguage = value;
  }
  public Boolean getLimitedExpansion() {
    return this.limitedExpansion;
  }
  public void setLimitedExpansion( Boolean value) {
    this.limitedExpansion = value;
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
    builder.append("[ExpansionProfileModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("url" + "->" + this.url + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("version" + "->" + this.version + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("experimental" + "->" + this.experimental + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("publisher" + "->" + this.publisher + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("includeDesignations" + "->" + this.includeDesignations + "\n"); 
     builder.append("includeDefinition" + "->" + this.includeDefinition + "\n"); 
     builder.append("activeOnly" + "->" + this.activeOnly + "\n"); 
     builder.append("excludeNested" + "->" + this.excludeNested + "\n"); 
     builder.append("excludeNotForUI" + "->" + this.excludeNotForUI + "\n"); 
     builder.append("excludePostCoordinated" + "->" + this.excludePostCoordinated + "\n"); 
     builder.append("displayLanguage" + "->" + this.displayLanguage + "\n"); 
     builder.append("limitedExpansion" + "->" + this.limitedExpansion + "\n"); 
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
    builder.append("[ExpansionProfileModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("url" + "->" + this.url + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("version" + "->" + this.version + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("experimental" + "->" + this.experimental + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("publisher" + "->" + this.publisher + "\n"); 
     builder.append("contact" + "->" + this.contact + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("useContext" + "->" + this.useContext + "\n"); 
     builder.append("jurisdiction" + "->" + this.jurisdiction + "\n"); 
     builder.append("fixedVersion" + "->" + this.fixedVersion + "\n"); 
     builder.append("excludedSystem" + "->" + this.excludedSystem + "\n"); 
     builder.append("includeDesignations" + "->" + this.includeDesignations + "\n"); 
     builder.append("designation" + "->" + this.designation + "\n"); 
     builder.append("includeDefinition" + "->" + this.includeDefinition + "\n"); 
     builder.append("activeOnly" + "->" + this.activeOnly + "\n"); 
     builder.append("excludeNested" + "->" + this.excludeNested + "\n"); 
     builder.append("excludeNotForUI" + "->" + this.excludeNotForUI + "\n"); 
     builder.append("excludePostCoordinated" + "->" + this.excludePostCoordinated + "\n"); 
     builder.append("displayLanguage" + "->" + this.displayLanguage + "\n"); 
     builder.append("limitedExpansion" + "->" + this.limitedExpansion + "\n"); 
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
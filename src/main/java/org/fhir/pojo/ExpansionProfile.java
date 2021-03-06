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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Resource to define constraints on the Expansion of a FHIR ValueSet."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ExpansionProfile  extends DomainResource  {
  /**
  * Description: "This is a ExpansionProfile resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this expansion profile when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this expansion profile is (or will be) published. The URL SHOULD include the major version of the expansion profile. For more information see [Technical and Business Versions](resource.html#versions)."
  */
  protected String url;

  /**
  * Description: "Extensions for url"
  */
  protected transient Element _url;

  /**
  * Description: "A formal identifier that is used to identify this expansion profile when it is represented in other formats, or referenced in a specification, model, design or an instance."
  */
  protected Identifier identifier;

  /**
  * Description: "The identifier that is used to identify this version of the expansion profile when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the expansion profile author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence."
  */
  protected String version;

  /**
  * Description: "Extensions for version"
  */
  protected transient Element _version;

  /**
  * Description: "A natural language name identifying the expansion profile. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "The status of this expansion profile. Enables tracking the life-cycle of the content."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "A boolean value to indicate that this expansion profile is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  protected Boolean experimental;

  /**
  * Description: "Extensions for experimental"
  */
  protected transient Element _experimental;

  /**
  * Description: "The date  (and optionally time) when the expansion profile was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the expansion profile changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "The name of the individual or organization that published the expansion profile."
  */
  protected String publisher;

  /**
  * Description: "Extensions for publisher"
  */
  protected transient Element _publisher;

  /**
  * Description: "Contact details to assist a user in finding and communicating with the publisher."
  */
  protected java.util.List<ContactDetail> contact;

  /**
  * Description: "A free text natural language description of the expansion profile from a consumer's perspective."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate expansion profile instances."
  */
  protected java.util.List<UsageContext> useContext;

  /**
  * Description: "A legal or geographic region in which the expansion profile is intended to be used."
  */
  protected java.util.List<CodeableConcept> jurisdiction;

  /**
  * Description: "Fix use of a particular code system to a particular version."
  */
  protected java.util.List<ExpansionProfileFixedVersion> fixedVersion;

  /**
  * Description: "Code system, or a particular version of a code system to be excluded from value set expansions."
  */
  protected ExpansionProfileExcludedSystem excludedSystem;

  /**
  * Description: "Controls whether concept designations are to be included or excluded in value set expansions."
  */
  protected Boolean includeDesignations;

  /**
  * Description: "Extensions for includeDesignations"
  */
  protected transient Element _includeDesignations;

  /**
  * Description: "A set of criteria that provide the constraints imposed on the value set expansion by including or excluding designations."
  */
  protected ExpansionProfileDesignation designation;

  /**
  * Description: "Controls whether the value set definition is included or excluded in value set expansions."
  */
  protected Boolean includeDefinition;

  /**
  * Description: "Extensions for includeDefinition"
  */
  protected transient Element _includeDefinition;

  /**
  * Description: "Controls whether inactive concepts are included or excluded in value set expansions."
  */
  protected Boolean activeOnly;

  /**
  * Description: "Extensions for activeOnly"
  */
  protected transient Element _activeOnly;

  /**
  * Description: "Controls whether or not the value set expansion nests codes or not (i.e. ValueSet.expansion.contains.contains)."
  */
  protected Boolean excludeNested;

  /**
  * Description: "Extensions for excludeNested"
  */
  protected transient Element _excludeNested;

  /**
  * Description: "Controls whether or not the value set expansion includes codes which cannot be displayed in user interfaces."
  */
  protected Boolean excludeNotForUI;

  /**
  * Description: "Extensions for excludeNotForUI"
  */
  protected transient Element _excludeNotForUI;

  /**
  * Description: "Controls whether or not the value set expansion includes post coordinated codes."
  */
  protected Boolean excludePostCoordinated;

  /**
  * Description: "Extensions for excludePostCoordinated"
  */
  protected transient Element _excludePostCoordinated;

  /**
  * Description: "Specifies the language to be used for description in the expansions i.e. the language to be used for ValueSet.expansion.contains.display."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String displayLanguage;

  /**
  * Description: "Extensions for displayLanguage"
  */
  protected transient Element _displayLanguage;

  /**
  * Description: "If the value set being expanded is incomplete (because it is too big to expand), return a limited expansion (a subset) with an indicator that expansion is incomplete, using the extension [http://hl7.org/fhir/StructureDefinition/valueset-toocostly](extension-valueset-toocostly.html)."
  */
  protected Boolean limitedExpansion;

  /**
  * Description: "Extensions for limitedExpansion"
  */
  protected transient Element _limitedExpansion;

  public ExpansionProfile() {
  }

  public ExpansionProfile(ExpansionProfileModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getUrl()) {
      this.url = o.getUrl();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getVersion()) {
      this.version = o.getVersion();
    }
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getExperimental()) {
      this.experimental = o.getExperimental();
    }
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getPublisher()) {
      this.publisher = o.getPublisher();
    }
    if (null != o.getContact() && !o.getContact().isEmpty()) {
    	this.contact = ContactDetailHelper.fromArray2Array(o.getContact());
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getUseContext() && !o.getUseContext().isEmpty()) {
    	this.useContext = UsageContextHelper.fromArray2Array(o.getUseContext());
    }
    if (null != o.getJurisdiction() && !o.getJurisdiction().isEmpty()) {
    	this.jurisdiction = CodeableConceptHelper.fromArray2Array(o.getJurisdiction());
    }
    if (null != o.getFixedVersion() && !o.getFixedVersion().isEmpty()) {
    	this.fixedVersion = ExpansionProfileFixedVersionHelper.fromArray2Array(o.getFixedVersion());
    }
    if (null != o.getExcludedSystem() && !o.getExcludedSystem().isEmpty()) {
      this.excludedSystem = new ExpansionProfileExcludedSystem(o.getExcludedSystem().get(0));
    }
    if (null != o.getIncludeDesignations()) {
      this.includeDesignations = o.getIncludeDesignations();
    }
    if (null != o.getDesignation() && !o.getDesignation().isEmpty()) {
      this.designation = new ExpansionProfileDesignation(o.getDesignation().get(0));
    }
    if (null != o.getIncludeDefinition()) {
      this.includeDefinition = o.getIncludeDefinition();
    }
    if (null != o.getActiveOnly()) {
      this.activeOnly = o.getActiveOnly();
    }
    if (null != o.getExcludeNested()) {
      this.excludeNested = o.getExcludeNested();
    }
    if (null != o.getExcludeNotForUI()) {
      this.excludeNotForUI = o.getExcludeNotForUI();
    }
    if (null != o.getExcludePostCoordinated()) {
      this.excludePostCoordinated = o.getExcludePostCoordinated();
    }
    if (null != o.getDisplayLanguage()) {
      this.displayLanguage = o.getDisplayLanguage();
    }
    if (null != o.getLimitedExpansion()) {
      this.limitedExpansion = o.getLimitedExpansion();
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ExpansionProfile]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.url != null) builder.append("url" + "->" + this.url.toString() + "\n"); 
     if(this._url != null) builder.append("_url" + "->" + this._url.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.version != null) builder.append("version" + "->" + this.version.toString() + "\n"); 
     if(this._version != null) builder.append("_version" + "->" + this._version.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.experimental != null) builder.append("experimental" + "->" + this.experimental.toString() + "\n"); 
     if(this._experimental != null) builder.append("_experimental" + "->" + this._experimental.toString() + "\n"); 
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.publisher != null) builder.append("publisher" + "->" + this.publisher.toString() + "\n"); 
     if(this._publisher != null) builder.append("_publisher" + "->" + this._publisher.toString() + "\n"); 
     if(this.contact != null) builder.append("contact" + "->" + this.contact.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.useContext != null) builder.append("useContext" + "->" + this.useContext.toString() + "\n"); 
     if(this.jurisdiction != null) builder.append("jurisdiction" + "->" + this.jurisdiction.toString() + "\n"); 
     if(this.fixedVersion != null) builder.append("fixedVersion" + "->" + this.fixedVersion.toString() + "\n"); 
     if(this.excludedSystem != null) builder.append("excludedSystem" + "->" + this.excludedSystem.toString() + "\n"); 
     if(this.includeDesignations != null) builder.append("includeDesignations" + "->" + this.includeDesignations.toString() + "\n"); 
     if(this._includeDesignations != null) builder.append("_includeDesignations" + "->" + this._includeDesignations.toString() + "\n"); 
     if(this.designation != null) builder.append("designation" + "->" + this.designation.toString() + "\n"); 
     if(this.includeDefinition != null) builder.append("includeDefinition" + "->" + this.includeDefinition.toString() + "\n"); 
     if(this._includeDefinition != null) builder.append("_includeDefinition" + "->" + this._includeDefinition.toString() + "\n"); 
     if(this.activeOnly != null) builder.append("activeOnly" + "->" + this.activeOnly.toString() + "\n"); 
     if(this._activeOnly != null) builder.append("_activeOnly" + "->" + this._activeOnly.toString() + "\n"); 
     if(this.excludeNested != null) builder.append("excludeNested" + "->" + this.excludeNested.toString() + "\n"); 
     if(this._excludeNested != null) builder.append("_excludeNested" + "->" + this._excludeNested.toString() + "\n"); 
     if(this.excludeNotForUI != null) builder.append("excludeNotForUI" + "->" + this.excludeNotForUI.toString() + "\n"); 
     if(this._excludeNotForUI != null) builder.append("_excludeNotForUI" + "->" + this._excludeNotForUI.toString() + "\n"); 
     if(this.excludePostCoordinated != null) builder.append("excludePostCoordinated" + "->" + this.excludePostCoordinated.toString() + "\n"); 
     if(this._excludePostCoordinated != null) builder.append("_excludePostCoordinated" + "->" + this._excludePostCoordinated.toString() + "\n"); 
     if(this.displayLanguage != null) builder.append("displayLanguage" + "->" + this.displayLanguage.toString() + "\n"); 
     if(this._displayLanguage != null) builder.append("_displayLanguage" + "->" + this._displayLanguage.toString() + "\n"); 
     if(this.limitedExpansion != null) builder.append("limitedExpansion" + "->" + this.limitedExpansion.toString() + "\n"); 
     if(this._limitedExpansion != null) builder.append("_limitedExpansion" + "->" + this._limitedExpansion.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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

}
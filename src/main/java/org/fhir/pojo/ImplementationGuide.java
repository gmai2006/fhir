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
import org.fhir.entity.ImplementationGuideModel;
import com.google.gson.GsonBuilder;

/**
* "A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts."
*/
public class ImplementationGuide  extends DomainResource  {
  /**
  * Description: "This is a ImplementationGuide resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this implementation guide when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this implementation guide is (or will be) published. The URL SHOULD include the major version of the implementation guide. For more information see [Technical and Business Versions](resource.html#versions)."
  */
  protected String url;

  /**
  * Description: "Extensions for url"
  */
  protected transient Element _url;

  /**
  * Description: "The identifier that is used to identify this version of the implementation guide when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the implementation guide author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence."
  */
  protected String version;

  /**
  * Description: "Extensions for version"
  */
  protected transient Element _version;

  /**
  * Description: "A natural language name identifying the implementation guide. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "The status of this implementation guide. Enables tracking the life-cycle of the content."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "A boolean value to indicate that this implementation guide is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  protected Boolean experimental;

  /**
  * Description: "Extensions for experimental"
  */
  protected transient Element _experimental;

  /**
  * Description: "The date  (and optionally time) when the implementation guide was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "The name of the individual or organization that published the implementation guide."
  */
  protected String publisher;

  /**
  * Description: "Extensions for publisher"
  */
  protected transient Element _publisher;

  /**
  * Description: "Contact details to assist a user in finding and communicating with the publisher."
  */
  protected java.util.List<ContactDetail> contact = new java.util.ArrayList<>();

  /**
  * Description: "A free text natural language description of the implementation guide from a consumer's perspective."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate implementation guide instances."
  */
  protected java.util.List<UsageContext> useContext = new java.util.ArrayList<>();

  /**
  * Description: "A legal or geographic region in which the implementation guide is intended to be used."
  */
  protected java.util.List<CodeableConcept> jurisdiction = new java.util.ArrayList<>();

  /**
  * Description: "A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the implementation guide."
  */
  protected String copyright;

  /**
  * Description: "Extensions for copyright"
  */
  protected transient Element _copyright;

  /**
  * Description: "The version of the FHIR specification on which this ImplementationGuide is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 3.0.1 for this version."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String fhirVersion;

  /**
  * Description: "Extensions for fhirVersion"
  */
  protected transient Element _fhirVersion;

  /**
  * Description: "Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides."
  */
  protected java.util.List<ImplementationGuideDependency> dependency = new java.util.ArrayList<>();

  /**
  * Description: "A logical group of resources. Logical groups can be used when building pages."
  */
  protected java.util.List<ImplementationGuidePackage> FHIRpackage = new java.util.ArrayList<>();

  /**
  * Description: "A set of profiles that all resources covered by this implementation guide must conform to."
  */
  protected java.util.List<ImplementationGuideGlobal> global = new java.util.ArrayList<>();

  /**
  * Description: "A binary file that is included in the  implementation guide when it is published."
  */
  protected java.util.List<String> binary = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for binary"
  */
  protected transient java.util.List<Element> _binary = new java.util.ArrayList<>();

  /**
  * Description: "A page / section in the implementation guide. The root page is the implementation guide home page."
  */
  protected ImplementationGuidePage page;

  public ImplementationGuide() {
  }

  public ImplementationGuide(ImplementationGuideModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getUrl()) {
      this.url = o.getUrl();
    }
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
    if (null != o.getCopyright()) {
      this.copyright = o.getCopyright();
    }
    if (null != o.getFhirVersion()) {
      this.fhirVersion = o.getFhirVersion();
    }
    if (null != o.getDependency() && !o.getDependency().isEmpty()) {
    	this.dependency = ImplementationGuideDependencyHelper.fromArray2Array(o.getDependency());
    }
    if (null != o.getFHIRpackage() && !o.getFHIRpackage().isEmpty()) {
    	this.FHIRpackage = ImplementationGuidePackageHelper.fromArray2Array(o.getFHIRpackage());
    }
    if (null != o.getGlobal() && !o.getGlobal().isEmpty()) {
    	this.global = ImplementationGuideGlobalHelper.fromArray2Array(o.getGlobal());
    }
    if (o.getBinary() != null) {
    	this.binary = org.fhir.utils.JsonUtils.json2Array(o.getBinary());
    }
    this.page = ImplementationGuidePageHelper.fromJson(o.getPage());
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
  public void setDependency( java.util.List<ImplementationGuideDependency> value) {
    this.dependency = value;
  }
  public java.util.List<ImplementationGuideDependency> getDependency() {
    return this.dependency;
  }
  public void setFHIRpackage( java.util.List<ImplementationGuidePackage> value) {
    this.FHIRpackage = value;
  }
  public java.util.List<ImplementationGuidePackage> getFHIRpackage() {
    return this.FHIRpackage;
  }
  public void setGlobal( java.util.List<ImplementationGuideGlobal> value) {
    this.global = value;
  }
  public java.util.List<ImplementationGuideGlobal> getGlobal() {
    return this.global;
  }
  public void setBinary( java.util.List<String> value) {
    this.binary = value;
  }
  public java.util.List<String> getBinary() {
    return this.binary;
  }
  public void set_binary( java.util.List<Element> value) {
    this._binary = value;
  }
  public java.util.List<Element> get_binary() {
    return this._binary;
  }
  public void setPage( ImplementationGuidePage value) {
    this.page = value;
  }
  public ImplementationGuidePage getPage() {
    return this.page;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImplementationGuide]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.url != null) builder.append("url" + "->" + this.url.toString() + "\n"); 
     if(this._url != null) builder.append("_url" + "->" + this._url.toString() + "\n"); 
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
     if(this.copyright != null) builder.append("copyright" + "->" + this.copyright.toString() + "\n"); 
     if(this._copyright != null) builder.append("_copyright" + "->" + this._copyright.toString() + "\n"); 
     if(this.fhirVersion != null) builder.append("fhirVersion" + "->" + this.fhirVersion.toString() + "\n"); 
     if(this._fhirVersion != null) builder.append("_fhirVersion" + "->" + this._fhirVersion.toString() + "\n"); 
     if(this.dependency != null) builder.append("dependency" + "->" + this.dependency.toString() + "\n"); 
     if(this.FHIRpackage != null) builder.append("FHIRpackage" + "->" + this.FHIRpackage.toString() + "\n"); 
     if(this.global != null) builder.append("global" + "->" + this.global.toString() + "\n"); 
     if(this.binary != null) builder.append("binary" + "->" + this.binary.toString() + "\n"); 
     if(this._binary != null) builder.append("_binary" + "->" + this._binary.toString() + "\n"); 
     if(this.page != null) builder.append("page" + "->" + this.page.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	ImplementationGuide,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ImplementationGuide" : { return ImplementationGuide.toString(); }
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

}
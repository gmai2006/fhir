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
import org.fhir.entity.CodeSystemModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A code system resource specifies a set of codes drawn from one or more code systems."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CodeSystem  extends DomainResource  {
  /**
  * Description: "This is a CodeSystem resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this code system when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this code system is (or will be) published. The URL SHOULD include the major version of the code system. For more information see [Technical and Business Versions](resource.html#versions). This is used in [Coding]{datatypes.html#Coding}.system."
  */
  protected String url;

  /**
  * Description: "Extensions for url"
  */
  protected transient Element _url;

  /**
  * Description: "A formal identifier that is used to identify this code system when it is represented in other formats, or referenced in a specification, model, design or an instance."
  */
  protected Identifier identifier;

  /**
  * Description: "The identifier that is used to identify this version of the code system when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the code system author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. This is used in [Coding]{datatypes.html#Coding}.version."
  */
  protected String version;

  /**
  * Description: "Extensions for version"
  */
  protected transient Element _version;

  /**
  * Description: "A natural language name identifying the code system. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "A short, descriptive, user-friendly title for the code system."
  */
  protected String title;

  /**
  * Description: "Extensions for title"
  */
  protected transient Element _title;

  /**
  * Description: "The status of this code system. Enables tracking the life-cycle of the content."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "A boolean value to indicate that this code system is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  protected Boolean experimental;

  /**
  * Description: "Extensions for experimental"
  */
  protected transient Element _experimental;

  /**
  * Description: "The date  (and optionally time) when the code system was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the code system changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "The name of the individual or organization that published the code system."
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
  * Description: "A free text natural language description of the code system from a consumer's perspective."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate code system instances."
  */
  protected java.util.List<UsageContext> useContext;

  /**
  * Description: "A legal or geographic region in which the code system is intended to be used."
  */
  protected java.util.List<CodeableConcept> jurisdiction;

  /**
  * Description: "Explaination of why this code system is needed and why it has been designed as it has."
  */
  protected String purpose;

  /**
  * Description: "Extensions for purpose"
  */
  protected transient Element _purpose;

  /**
  * Description: "A copyright statement relating to the code system and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the code system."
  */
  protected String copyright;

  /**
  * Description: "Extensions for copyright"
  */
  protected transient Element _copyright;

  /**
  * Description: "If code comparison is case sensitive when codes within this system are compared to each other."
  */
  protected Boolean caseSensitive;

  /**
  * Description: "Extensions for caseSensitive"
  */
  protected transient Element _caseSensitive;

  /**
  * Description: "Canonical URL of value set that contains the entire code system."
  */
  protected String valueSet;

  /**
  * Description: "Extensions for valueSet"
  */
  protected transient Element _valueSet;

  /**
  * Description: "The meaning of the hierarchy of concepts."
  */
  protected String hierarchyMeaning;

  /**
  * Description: "Extensions for hierarchyMeaning"
  */
  protected transient Element _hierarchyMeaning;

  /**
  * Description: "True If code system defines a post-composition grammar."
  */
  protected Boolean compositional;

  /**
  * Description: "Extensions for compositional"
  */
  protected transient Element _compositional;

  /**
  * Description: "This flag is used to signify that the code system has not (or does not) maintain the definitions, and a version must be specified when referencing this code system."
  */
  protected Boolean versionNeeded;

  /**
  * Description: "Extensions for versionNeeded"
  */
  protected transient Element _versionNeeded;

  /**
  * Description: "How much of the content of the code system - the concepts and codes it defines - are represented in this resource."
  */
  protected String content;

  /**
  * Description: "Extensions for content"
  */
  protected transient Element _content;

  /**
  * Description: "The total number of concepts defined by the code system. Where the code system has a compositional grammar, the count refers to the number of base (primitive) concepts."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  protected Float count;

  /**
  * Description: "Extensions for count"
  */
  protected transient Element _count;

  /**
  * Description: "A filter that can be used in a value set compose statement when selecting concepts using a filter."
  */
  protected java.util.List<CodeSystemFilter> filter;

  /**
  * Description: "A property defines an additional slot through which additional information can be provided about a concept."
  */
  protected java.util.List<CodeSystemProperty> property;

  /**
  * Description: "Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are."
  */
  protected java.util.List<CodeSystemConcept> concept;

  public CodeSystem() {
  }

  public CodeSystem(CodeSystemModel o) {
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
    if (null != o.getTitle()) {
      this.title = o.getTitle();
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
    if (null != o.getPurpose()) {
      this.purpose = o.getPurpose();
    }
    if (null != o.getCopyright()) {
      this.copyright = o.getCopyright();
    }
    if (null != o.getCaseSensitive()) {
      this.caseSensitive = o.getCaseSensitive();
    }
    if (null != o.getValueSet()) {
      this.valueSet = o.getValueSet();
    }
    if (null != o.getHierarchyMeaning()) {
      this.hierarchyMeaning = o.getHierarchyMeaning();
    }
    if (null != o.getCompositional()) {
      this.compositional = o.getCompositional();
    }
    if (null != o.getVersionNeeded()) {
      this.versionNeeded = o.getVersionNeeded();
    }
    if (null != o.getContent()) {
      this.content = o.getContent();
    }
    if (null != o.getCount()) {
      this.count = o.getCount();
    }
    if (null != o.getFilter() && !o.getFilter().isEmpty()) {
    	this.filter = CodeSystemFilterHelper.fromArray2Array(o.getFilter());
    }
    if (null != o.getProperty() && !o.getProperty().isEmpty()) {
    	this.property = CodeSystemPropertyHelper.fromArray2Array(o.getProperty());
    }
    if (null != o.getConcept() && !o.getConcept().isEmpty()) {
    	this.concept = CodeSystemConceptHelper.fromArray2Array(o.getConcept());
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
  public void setCaseSensitive( Boolean value) {
    this.caseSensitive = value;
  }
  public Boolean getCaseSensitive() {
    return this.caseSensitive;
  }
  public void set_caseSensitive( Element value) {
    this._caseSensitive = value;
  }
  public Element get_caseSensitive() {
    return this._caseSensitive;
  }
  public void setValueSet( String value) {
    this.valueSet = value;
  }
  public String getValueSet() {
    return this.valueSet;
  }
  public void set_valueSet( Element value) {
    this._valueSet = value;
  }
  public Element get_valueSet() {
    return this._valueSet;
  }
  public void setHierarchyMeaning( String value) {
    this.hierarchyMeaning = HierarchyMeaningEnum.fromCode(value);
  }
  public String getHierarchyMeaning() {
    return this.hierarchyMeaning;
  }
  public void set_hierarchyMeaning( Element value) {
    this._hierarchyMeaning = value;
  }
  public Element get_hierarchyMeaning() {
    return this._hierarchyMeaning;
  }
  public void setCompositional( Boolean value) {
    this.compositional = value;
  }
  public Boolean getCompositional() {
    return this.compositional;
  }
  public void set_compositional( Element value) {
    this._compositional = value;
  }
  public Element get_compositional() {
    return this._compositional;
  }
  public void setVersionNeeded( Boolean value) {
    this.versionNeeded = value;
  }
  public Boolean getVersionNeeded() {
    return this.versionNeeded;
  }
  public void set_versionNeeded( Element value) {
    this._versionNeeded = value;
  }
  public Element get_versionNeeded() {
    return this._versionNeeded;
  }
  public void setContent( String value) {
    this.content = ContentEnum.fromCode(value);
  }
  public String getContent() {
    return this.content;
  }
  public void set_content( Element value) {
    this._content = value;
  }
  public Element get_content() {
    return this._content;
  }
  public void setCount( Float value) {
    this.count = value;
  }
  public Float getCount() {
    return this.count;
  }
  public void set_count( Element value) {
    this._count = value;
  }
  public Element get_count() {
    return this._count;
  }
  public void setFilter( java.util.List<CodeSystemFilter> value) {
    this.filter = value;
  }
  public java.util.List<CodeSystemFilter> getFilter() {
    return this.filter;
  }
  public void setProperty( java.util.List<CodeSystemProperty> value) {
    this.property = value;
  }
  public java.util.List<CodeSystemProperty> getProperty() {
    return this.property;
  }
  public void setConcept( java.util.List<CodeSystemConcept> value) {
    this.concept = value;
  }
  public java.util.List<CodeSystemConcept> getConcept() {
    return this.concept;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CodeSystem]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.url != null) builder.append("url" + "->" + this.url.toString() + "\n"); 
     if(this._url != null) builder.append("_url" + "->" + this._url.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.version != null) builder.append("version" + "->" + this.version.toString() + "\n"); 
     if(this._version != null) builder.append("_version" + "->" + this._version.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.title != null) builder.append("title" + "->" + this.title.toString() + "\n"); 
     if(this._title != null) builder.append("_title" + "->" + this._title.toString() + "\n"); 
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
     if(this.purpose != null) builder.append("purpose" + "->" + this.purpose.toString() + "\n"); 
     if(this._purpose != null) builder.append("_purpose" + "->" + this._purpose.toString() + "\n"); 
     if(this.copyright != null) builder.append("copyright" + "->" + this.copyright.toString() + "\n"); 
     if(this._copyright != null) builder.append("_copyright" + "->" + this._copyright.toString() + "\n"); 
     if(this.caseSensitive != null) builder.append("caseSensitive" + "->" + this.caseSensitive.toString() + "\n"); 
     if(this._caseSensitive != null) builder.append("_caseSensitive" + "->" + this._caseSensitive.toString() + "\n"); 
     if(this.valueSet != null) builder.append("valueSet" + "->" + this.valueSet.toString() + "\n"); 
     if(this._valueSet != null) builder.append("_valueSet" + "->" + this._valueSet.toString() + "\n"); 
     if(this.hierarchyMeaning != null) builder.append("hierarchyMeaning" + "->" + this.hierarchyMeaning.toString() + "\n"); 
     if(this._hierarchyMeaning != null) builder.append("_hierarchyMeaning" + "->" + this._hierarchyMeaning.toString() + "\n"); 
     if(this.compositional != null) builder.append("compositional" + "->" + this.compositional.toString() + "\n"); 
     if(this._compositional != null) builder.append("_compositional" + "->" + this._compositional.toString() + "\n"); 
     if(this.versionNeeded != null) builder.append("versionNeeded" + "->" + this.versionNeeded.toString() + "\n"); 
     if(this._versionNeeded != null) builder.append("_versionNeeded" + "->" + this._versionNeeded.toString() + "\n"); 
     if(this.content != null) builder.append("content" + "->" + this.content.toString() + "\n"); 
     if(this._content != null) builder.append("_content" + "->" + this._content.toString() + "\n"); 
     if(this.count != null) builder.append("count" + "->" + this.count.toString() + "\n"); 
     if(this._count != null) builder.append("_count" + "->" + this._count.toString() + "\n"); 
     if(this.filter != null) builder.append("filter" + "->" + this.filter.toString() + "\n"); 
     if(this.property != null) builder.append("property" + "->" + this.property.toString() + "\n"); 
     if(this.concept != null) builder.append("concept" + "->" + this.concept.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	CodeSystem,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "CodeSystem" : { return CodeSystem.toString(); }
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

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum HierarchyMeaningEnum {
  	groupedby,
  	isa,
  	partof,
  	classifiedwith,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "groupedby" : { return groupedby.toString(); }
  			case "isa" : { return isa.toString(); }
  			case "partof" : { return partof.toString(); }
  			case "classifiedwith" : { return classifiedwith.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ContentEnum {
  	notpresent,
  	example,
  	fragment,
  	complete,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "notpresent" : { return notpresent.toString(); }
  			case "example" : { return example.toString(); }
  			case "fragment" : { return fragment.toString(); }
  			case "complete" : { return complete.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}
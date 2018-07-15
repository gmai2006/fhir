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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class StructureDefinition  extends DomainResource  {
  /**
  * Description: "This is a StructureDefinition resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this structure definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this structure definition is (or will be) published. The URL SHOULD include the major version of the structure definition. For more information see [Technical and Business Versions](resource.html#versions)."
  */
  protected String url;

  /**
  * Description: "Extensions for url"
  */
  protected transient Element _url;

  /**
  * Description: "A formal identifier that is used to identify this structure definition when it is represented in other formats, or referenced in a specification, model, design or an instance."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "The identifier that is used to identify this version of the structure definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the structure definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence."
  */
  protected String version;

  /**
  * Description: "Extensions for version"
  */
  protected transient Element _version;

  /**
  * Description: "A natural language name identifying the structure definition. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "A short, descriptive, user-friendly title for the structure definition."
  */
  protected String title;

  /**
  * Description: "Extensions for title"
  */
  protected transient Element _title;

  /**
  * Description: "The status of this structure definition. Enables tracking the life-cycle of the content."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "A boolean value to indicate that this structure definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  protected Boolean experimental;

  /**
  * Description: "Extensions for experimental"
  */
  protected transient Element _experimental;

  /**
  * Description: "The date  (and optionally time) when the structure definition was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the structure definition changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "The name of the individual or organization that published the structure definition."
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
  * Description: "A free text natural language description of the structure definition from a consumer's perspective."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate structure definition instances."
  */
  protected java.util.List<UsageContext> useContext;

  /**
  * Description: "A legal or geographic region in which the structure definition is intended to be used."
  */
  protected java.util.List<CodeableConcept> jurisdiction;

  /**
  * Description: "Explaination of why this structure definition is needed and why it has been designed as it has."
  */
  protected String purpose;

  /**
  * Description: "Extensions for purpose"
  */
  protected transient Element _purpose;

  /**
  * Description: "A copyright statement relating to the structure definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the structure definition."
  */
  protected String copyright;

  /**
  * Description: "Extensions for copyright"
  */
  protected transient Element _copyright;

  /**
  * Description: "A set of key words or terms from external terminologies that may be used to assist with indexing and searching of templates."
  */
  protected java.util.List<Coding> keyword;

  /**
  * Description: "The version of the FHIR specification on which this StructureDefinition is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 3.0.1 for this version."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String fhirVersion;

  /**
  * Description: "Extensions for fhirVersion"
  */
  protected transient Element _fhirVersion;

  /**
  * Description: "An external specification that the content is mapped to."
  */
  protected java.util.List<StructureDefinitionMapping> mapping;

  /**
  * Description: "Defines the kind of structure that this definition is describing."
  */
  protected String kind;

  /**
  * Description: "Extensions for kind"
  */
  protected transient Element _kind;

  /**
  * Description: "Whether structure this definition describes is abstract or not  - that is, whether the structure is not intended to be instantiated. For Resources and Data types, abstract types will never be exchanged  between systems."
  */
  protected Boolean FHIRabstract;

  /**
  * Description: "Extensions for abstract"
  */
  protected transient Element _abstract;

  /**
  * Description: "If this is an extension, Identifies the context within FHIR resources where the extension can be used."
  */
  protected String contextType;

  /**
  * Description: "Extensions for contextType"
  */
  protected transient Element _contextType;

  /**
  * Description: "Identifies the types of resource or data type elements to which the extension can be applied."
  */
  protected java.util.List<String> context;

  /**
  * Description: "Extensions for context"
  */
  protected transient java.util.List<Element> _context;

  /**
  * Description: "A set of rules as Fluent Invariants about when the extension can be used (e.g. co-occurrence variants for the extension)."
  */
  protected java.util.List<String> contextInvariant;

  /**
  * Description: "Extensions for contextInvariant"
  */
  protected transient java.util.List<Element> _contextInvariant;

  /**
  * Description: "The type this structure describes. If the derivation kind is 'specialization' then this is the master definition for a type, and there is always one of these (a data type, an extension, a resource, including abstract ones). Otherwise the structure definition is a constraint on the stated type (and in this case, the type cannot be an abstract type)."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  /**
  * Description: "An absolute URI that is the base structure from which this type is derived, either by specialization or constraint."
  */
  protected String baseDefinition;

  /**
  * Description: "Extensions for baseDefinition"
  */
  protected transient Element _baseDefinition;

  /**
  * Description: "How the type relates to the baseDefinition."
  */
  protected String derivation;

  /**
  * Description: "Extensions for derivation"
  */
  protected transient Element _derivation;

  /**
  * Description: "A snapshot view is expressed in a stand alone form that can be used and interpreted without considering the base StructureDefinition."
  */
  protected StructureDefinitionSnapshot snapshot;

  /**
  * Description: "A differential view is expressed relative to the base StructureDefinition - a statement of differences that it applies."
  */
  protected StructureDefinitionDifferential differential;

  public StructureDefinition() {
  }

  public StructureDefinition(StructureDefinitionModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getUrl()) {
      this.url = o.getUrl();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
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
    if (null != o.getKeyword() && !o.getKeyword().isEmpty()) {
    	this.keyword = CodingHelper.fromArray2Array(o.getKeyword());
    }
    if (null != o.getFhirVersion()) {
      this.fhirVersion = o.getFhirVersion();
    }
    if (o.getMapping() != null) {
    	this.mapping = org.fhir.utils.JsonUtils.json2Array(o.getMapping());
    }
    if (null != o.getKind()) {
      this.kind = o.getKind();
    }
    if (null != o.getFHIRabstract()) {
      this.FHIRabstract = o.getFHIRabstract();
    }
    if (null != o.getContextType()) {
      this.contextType = o.getContextType();
    }
    if (o.getContext() != null) {
    	this.context = org.fhir.utils.JsonUtils.json2Array(o.getContext());
    }
    if (o.getContextInvariant() != null) {
    	this.contextInvariant = org.fhir.utils.JsonUtils.json2Array(o.getContextInvariant());
    }
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (null != o.getBaseDefinition()) {
      this.baseDefinition = o.getBaseDefinition();
    }
    if (null != o.getDerivation()) {
      this.derivation = o.getDerivation();
    }
    this.snapshot = StructureDefinitionSnapshotHelper.fromJson(o.getSnapshot());
    this.differential = StructureDefinitionDifferentialHelper.fromJson(o.getDifferential());
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[StructureDefinition]:" + "\n");
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
     if(this.keyword != null) builder.append("keyword" + "->" + this.keyword.toString() + "\n"); 
     if(this.fhirVersion != null) builder.append("fhirVersion" + "->" + this.fhirVersion.toString() + "\n"); 
     if(this._fhirVersion != null) builder.append("_fhirVersion" + "->" + this._fhirVersion.toString() + "\n"); 
     if(this.mapping != null) builder.append("mapping" + "->" + this.mapping.toString() + "\n"); 
     if(this.kind != null) builder.append("kind" + "->" + this.kind.toString() + "\n"); 
     if(this._kind != null) builder.append("_kind" + "->" + this._kind.toString() + "\n"); 
     if(this.FHIRabstract != null) builder.append("FHIRabstract" + "->" + this.FHIRabstract.toString() + "\n"); 
     if(this._abstract != null) builder.append("_abstract" + "->" + this._abstract.toString() + "\n"); 
     if(this.contextType != null) builder.append("contextType" + "->" + this.contextType.toString() + "\n"); 
     if(this._contextType != null) builder.append("_contextType" + "->" + this._contextType.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this._context != null) builder.append("_context" + "->" + this._context.toString() + "\n"); 
     if(this.contextInvariant != null) builder.append("contextInvariant" + "->" + this.contextInvariant.toString() + "\n"); 
     if(this._contextInvariant != null) builder.append("_contextInvariant" + "->" + this._contextInvariant.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.baseDefinition != null) builder.append("baseDefinition" + "->" + this.baseDefinition.toString() + "\n"); 
     if(this._baseDefinition != null) builder.append("_baseDefinition" + "->" + this._baseDefinition.toString() + "\n"); 
     if(this.derivation != null) builder.append("derivation" + "->" + this.derivation.toString() + "\n"); 
     if(this._derivation != null) builder.append("_derivation" + "->" + this._derivation.toString() + "\n"); 
     if(this.snapshot != null) builder.append("snapshot" + "->" + this.snapshot.toString() + "\n"); 
     if(this.differential != null) builder.append("differential" + "->" + this.differential.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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

}
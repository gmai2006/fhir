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

/**
* "A code system resource specifies a set of codes drawn from one or more code systems."
*/
@Entity
@Table(name="codesystem")
public class CodeSystemModel  {
  /**
  * Description: "This is a CodeSystem resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this code system when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this code system is (or will be) published. The URL SHOULD include the major version of the code system. For more information see [Technical and Business Versions](resource.html#versions). This is used in [Coding]{datatypes.html#Coding}.system."
  */
  @javax.persistence.Basic
  @Column(name="\"url\"")
  private String url;

  /**
  * Description: "A formal identifier that is used to identify this code system when it is represented in other formats, or referenced in a specification, model, design or an instance."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The identifier that is used to identify this version of the code system when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the code system author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. This is used in [Coding]{datatypes.html#Coding}.version."
  */
  @javax.persistence.Basic
  @Column(name="\"version\"")
  private String version;

  /**
  * Description: "A natural language name identifying the code system. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "A short, descriptive, user-friendly title for the code system."
  */
  @javax.persistence.Basic
  @Column(name="\"title\"")
  private String title;

  /**
  * Description: "The status of this code system. Enables tracking the life-cycle of the content."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "A boolean value to indicate that this code system is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  @javax.persistence.Basic
  @Column(name="\"experimental\"")
  private Boolean experimental;

  /**
  * Description: "The date  (and optionally time) when the code system was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the code system changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "The name of the individual or organization that published the code system."
  */
  @javax.persistence.Basic
  @Column(name="\"publisher\"")
  private String publisher;

  /**
  * Description: "Contact details to assist a user in finding and communicating with the publisher."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ContactDetailModel> contact = new java.util.ArrayList<>();

  /**
  * Description: "A free text natural language description of the code system from a consumer's perspective."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate code system instances."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<UsageContextModel> useContext = new java.util.ArrayList<>();

  /**
  * Description: "A legal or geographic region in which the code system is intended to be used."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"jurisdiction\"", length = 16777215)
  private String jurisdiction;

  /**
  * Description: "Explaination of why this code system is needed and why it has been designed as it has."
  */
  @javax.persistence.Basic
  @Column(name="\"purpose\"")
  private String purpose;

  /**
  * Description: "A copyright statement relating to the code system and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the code system."
  */
  @javax.persistence.Basic
  @Column(name="\"copyright\"")
  private String copyright;

  /**
  * Description: "If code comparison is case sensitive when codes within this system are compared to each other."
  */
  @javax.persistence.Basic
  @Column(name="\"caseSensitive\"")
  private Boolean caseSensitive;

  /**
  * Description: "Canonical URL of value set that contains the entire code system."
  */
  @javax.persistence.Basic
  @Column(name="\"valueSet\"")
  private String valueSet;

  /**
  * Description: "The meaning of the hierarchy of concepts."
  */
  @javax.persistence.Basic
  @Column(name="\"hierarchyMeaning\"")
  private String hierarchyMeaning;

  /**
  * Description: "True If code system defines a post-composition grammar."
  */
  @javax.persistence.Basic
  @Column(name="\"compositional\"")
  private Boolean compositional;

  /**
  * Description: "This flag is used to signify that the code system has not (or does not) maintain the definitions, and a version must be specified when referencing this code system."
  */
  @javax.persistence.Basic
  @Column(name="\"versionNeeded\"")
  private Boolean versionNeeded;

  /**
  * Description: "How much of the content of the code system - the concepts and codes it defines - are represented in this resource."
  */
  @javax.persistence.Basic
  @Column(name="\"content\"")
  private String content;

  /**
  * Description: "The total number of concepts defined by the code system. Where the code system has a compositional grammar, the count refers to the number of base (primitive) concepts."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  @javax.persistence.Basic
  @Column(name="\"count\"")
  private Float count;

  /**
  * Description: "A filter that can be used in a value set compose statement when selecting concepts using a filter."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<CodeSystemFilterModel> filter = new java.util.ArrayList<>();

  /**
  * Description: "A property defines an additional slot through which additional information can be provided about a concept."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<CodeSystemPropertyModel> property = new java.util.ArrayList<>();

  /**
  * Description: "Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<CodeSystemConceptModel> concept = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`text_id`", insertable=false, updatable=false)
  private NarrativeModel text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: Array of ResourceList-> List<ResourceList>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

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


  public CodeSystemModel() {
  }

  public CodeSystemModel(CodeSystem o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.url = o.getUrl();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.version = o.getVersion();

      this.name = o.getName();

      this.title = o.getTitle();

      this.status = o.getStatus();

      this.experimental = o.getExperimental();

      this.date = o.getDate();

      this.publisher = o.getPublisher();

      this.contact = ContactDetail.toModelArray(o.getContact());

      this.description = o.getDescription();

      this.useContext = UsageContext.toModelArray(o.getUseContext());

      this.jurisdiction = CodeableConcept.toJson(o.getJurisdiction());
      this.purpose = o.getPurpose();

      this.copyright = o.getCopyright();

      this.caseSensitive = o.getCaseSensitive();

      this.valueSet = o.getValueSet();

      this.hierarchyMeaning = o.getHierarchyMeaning();

      this.compositional = o.getCompositional();

      this.versionNeeded = o.getVersionNeeded();

      this.content = o.getContent();

      this.count = o.getCount();

      this.filter = CodeSystemFilter.toModelArray(o.getFilter());

      this.property = CodeSystemProperty.toModelArray(o.getProperty());

      this.concept = CodeSystemConcept.toModelArray(o.getConcept());

      if (null != o.getText()) {
      	this.text_id = "text" + this.getId();
        this.text = new NarrativeModel(o.getText());
        this.text.setId(this.text_id);
        this.text.parent_id = this.text.getId();
      }

      this.contained = ResourceList.toJson(o.getContained());
      this.extension = Extension.toJson(o.getExtension());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

  }

  public void setResourceType( String value) {
    this.resourceType = value;
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
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setVersion( String value) {
    this.version = value;
  }
  public String getVersion() {
    return this.version;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setExperimental( Boolean value) {
    this.experimental = value;
  }
  public Boolean getExperimental() {
    return this.experimental;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public String getDate() {
    return this.date;
  }
  public void setPublisher( String value) {
    this.publisher = value;
  }
  public String getPublisher() {
    return this.publisher;
  }
  public void setContact( java.util.List<ContactDetailModel> value) {
    this.contact = value;
  }
  public java.util.List<ContactDetailModel> getContact() {
    return this.contact;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setUseContext( java.util.List<UsageContextModel> value) {
    this.useContext = value;
  }
  public java.util.List<UsageContextModel> getUseContext() {
    return this.useContext;
  }
  public void setJurisdiction( String value) {
    this.jurisdiction = value;
  }
  public String getJurisdiction() {
    return this.jurisdiction;
  }
  public void setPurpose( String value) {
    this.purpose = value;
  }
  public String getPurpose() {
    return this.purpose;
  }
  public void setCopyright( String value) {
    this.copyright = value;
  }
  public String getCopyright() {
    return this.copyright;
  }
  public void setCaseSensitive( Boolean value) {
    this.caseSensitive = value;
  }
  public Boolean getCaseSensitive() {
    return this.caseSensitive;
  }
  public void setValueSet( String value) {
    this.valueSet = value;
  }
  public String getValueSet() {
    return this.valueSet;
  }
  public void setHierarchyMeaning( String value) {
    this.hierarchyMeaning = value;
  }
  public String getHierarchyMeaning() {
    return this.hierarchyMeaning;
  }
  public void setCompositional( Boolean value) {
    this.compositional = value;
  }
  public Boolean getCompositional() {
    return this.compositional;
  }
  public void setVersionNeeded( Boolean value) {
    this.versionNeeded = value;
  }
  public Boolean getVersionNeeded() {
    return this.versionNeeded;
  }
  public void setContent( String value) {
    this.content = value;
  }
  public String getContent() {
    return this.content;
  }
  public void setCount( Float value) {
    this.count = value;
  }
  public Float getCount() {
    return this.count;
  }
  public void setFilter( java.util.List<CodeSystemFilterModel> value) {
    this.filter = value;
  }
  public java.util.List<CodeSystemFilterModel> getFilter() {
    return this.filter;
  }
  public void setProperty( java.util.List<CodeSystemPropertyModel> value) {
    this.property = value;
  }
  public java.util.List<CodeSystemPropertyModel> getProperty() {
    return this.property;
  }
  public void setConcept( java.util.List<CodeSystemConceptModel> value) {
    this.concept = value;
  }
  public java.util.List<CodeSystemConceptModel> getConcept() {
    return this.concept;
  }
  public void setText( NarrativeModel value) {
    this.text = value;
  }
  public NarrativeModel getText() {
    return this.text;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("url" + "[" + String.valueOf(this.url) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("version" + "[" + String.valueOf(this.version) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("title" + "[" + String.valueOf(this.title) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("experimental" + "[" + String.valueOf(this.experimental) + "]\n"); 
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("publisher" + "[" + String.valueOf(this.publisher) + "]\n"); 
     builder.append("contact" + "[" + String.valueOf(this.contact) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("useContext" + "[" + String.valueOf(this.useContext) + "]\n"); 
     builder.append("jurisdiction" + "[" + String.valueOf(this.jurisdiction) + "]\n"); 
     builder.append("purpose" + "[" + String.valueOf(this.purpose) + "]\n"); 
     builder.append("copyright" + "[" + String.valueOf(this.copyright) + "]\n"); 
     builder.append("caseSensitive" + "[" + String.valueOf(this.caseSensitive) + "]\n"); 
     builder.append("valueSet" + "[" + String.valueOf(this.valueSet) + "]\n"); 
     builder.append("hierarchyMeaning" + "[" + String.valueOf(this.hierarchyMeaning) + "]\n"); 
     builder.append("compositional" + "[" + String.valueOf(this.compositional) + "]\n"); 
     builder.append("versionNeeded" + "[" + String.valueOf(this.versionNeeded) + "]\n"); 
     builder.append("content" + "[" + String.valueOf(this.content) + "]\n"); 
     builder.append("count" + "[" + String.valueOf(this.count) + "]\n"); 
     builder.append("filter" + "[" + String.valueOf(this.filter) + "]\n"); 
     builder.append("property" + "[" + String.valueOf(this.property) + "]\n"); 
     builder.append("concept" + "[" + String.valueOf(this.concept) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}
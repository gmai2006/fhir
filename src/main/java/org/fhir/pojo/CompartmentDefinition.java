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
import org.fhir.entity.CompartmentDefinitionModel;
import com.google.gson.GsonBuilder;

/**
* "A compartment definition that defines how resources are accessed on a server."
*/
public class CompartmentDefinition  {
  /**
  * Description: "This is a CompartmentDefinition resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this compartment definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this compartment definition is (or will be) published. The URL SHOULD include the major version of the compartment definition. For more information see [Technical and Business Versions](resource.html#versions)."
  */
  private String url;

  /**
  * Description: "Extensions for url"
  */
  private transient Element _url;

  /**
  * Description: "A natural language name identifying the compartment definition. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "A short, descriptive, user-friendly title for the compartment definition."
  */
  private String title;

  /**
  * Description: "Extensions for title"
  */
  private transient Element _title;

  /**
  * Description: "The status of this compartment definition. Enables tracking the life-cycle of the content."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "A boolean value to indicate that this compartment definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  private Boolean experimental;

  /**
  * Description: "Extensions for experimental"
  */
  private transient Element _experimental;

  /**
  * Description: "The date  (and optionally time) when the compartment definition was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the compartment definition changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String date;

  /**
  * Description: "Extensions for date"
  */
  private transient Element _date;

  /**
  * Description: "The name of the individual or organization that published the compartment definition."
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
  * Description: "A free text natural language description of the compartment definition from a consumer's perspective."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "Explaination of why this compartment definition is needed and why it has been designed as it has."
  */
  private String purpose;

  /**
  * Description: "Extensions for purpose"
  */
  private transient Element _purpose;

  /**
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate compartment definition instances."
  */
  private java.util.List<UsageContext> useContext = new java.util.ArrayList<>();

  /**
  * Description: "A legal or geographic region in which the compartment definition is intended to be used."
  */
  private java.util.List<CodeableConcept> jurisdiction = new java.util.ArrayList<>();

  /**
  * Description: "Which compartment this definition describes."
  */
  private String code;

  /**
  * Description: "Extensions for code"
  */
  private transient Element _code;

  /**
  * Description: "Whether the search syntax is supported,."
  */
  private Boolean search;

  /**
  * Description: "Extensions for search"
  */
  private transient Element _search;

  /**
  * Description: "Information about how a resource is related to the compartment."
  */
  private java.util.List<CompartmentDefinitionResource> resource = new java.util.ArrayList<>();

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

  public CompartmentDefinition() {
  }

  public CompartmentDefinition(CompartmentDefinitionModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      if (null != o.getUrl()) {
        this.url = new String(o.getUrl());
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

      if (null != o.getPurpose()) {
        this.purpose = new String(o.getPurpose());
      }

      this.useContext = UsageContext.fromArray(o.getUseContext());

      this.jurisdiction = CodeableConcept.fromArray(o.getJurisdiction());
      if (null != o.getCode()) {
        this.code = new String(o.getCode());
      }

      if (null != o.getSearch()) {
        this.search = new Boolean(o.getSearch());
      }

      this.resource = CompartmentDefinitionResource.fromArray(o.getResource());

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
  public void setCode( String value) {
    this.code = CodeEnum.fromCode(value);
  }
  public String getCode() {
    return this.code;
  }
  public void set_code( Element value) {
    this._code = value;
  }
  public Element get_code() {
    return this._code;
  }
  public void setSearch( Boolean value) {
    this.search = value;
  }
  public Boolean getSearch() {
    return this.search;
  }
  public void set_search( Element value) {
    this._search = value;
  }
  public Element get_search() {
    return this._search;
  }
  public void setResource( java.util.List<CompartmentDefinitionResource> value) {
    this.resource = value;
  }
  public java.util.List<CompartmentDefinitionResource> getResource() {
    return this.resource;
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
     builder.append("purpose" + "[" + String.valueOf(this.purpose) + "]\n"); 
     builder.append("_purpose" + "[" + String.valueOf(this._purpose) + "]\n"); 
     builder.append("useContext" + "[" + String.valueOf(this.useContext) + "]\n"); 
     builder.append("jurisdiction" + "[" + String.valueOf(this.jurisdiction) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("_code" + "[" + String.valueOf(this._code) + "]\n"); 
     builder.append("search" + "[" + String.valueOf(this.search) + "]\n"); 
     builder.append("_search" + "[" + String.valueOf(this._search) + "]\n"); 
     builder.append("resource" + "[" + String.valueOf(this.resource) + "]\n"); 
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
  	CompartmentDefinition,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "CompartmentDefinition" : { return CompartmentDefinition.toString(); }
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

  public enum CodeEnum {
  	Patient,
  	Encounter,
  	RelatedPerson,
  	Practitioner,
  	Device,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Patient" : { return Patient.toString(); }
  			case "Encounter" : { return Encounter.toString(); }
  			case "RelatedPerson" : { return RelatedPerson.toString(); }
  			case "Practitioner" : { return Practitioner.toString(); }
  			case "Device" : { return Device.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<CompartmentDefinition> fromArray(java.util.List<CompartmentDefinitionModel> list) {
    return (java.util.List<CompartmentDefinition>)list.stream()
      .map(model -> new CompartmentDefinition(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CompartmentDefinitionModel> toModelArray(java.util.List<CompartmentDefinition> list) {
    return (java.util.List<CompartmentDefinitionModel>)list.stream()
      .map(model -> new CompartmentDefinitionModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static CompartmentDefinition fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CompartmentDefinition.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(CompartmentDefinition o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<CompartmentDefinition> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
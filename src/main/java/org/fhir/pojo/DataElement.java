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
import org.fhir.entity.DataElementModel;
import com.google.gson.GsonBuilder;

/**
* "The formal description of a single piece of information that can be gathered and reported."
*/
public class DataElement  {
  /**
  * Description: "This is a DataElement resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this data element when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this data element is (or will be) published. The URL SHOULD include the major version of the data element. For more information see [Technical and Business Versions](resource.html#versions)."
  */
  private String url;

  /**
  * Description: "Extensions for url"
  */
  private transient Element _url;

  /**
  * Description: "A formal identifier that is used to identify this data element when it is represented in other formats, or referenced in a specification, model, design or an instance."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "The identifier that is used to identify this version of the data element when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the data element author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence."
  */
  private String version;

  /**
  * Description: "Extensions for version"
  */
  private transient Element _version;

  /**
  * Description: "The status of this data element. Enables tracking the life-cycle of the content."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "A boolean value to indicate that this data element is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  private Boolean experimental;

  /**
  * Description: "Extensions for experimental"
  */
  private transient Element _experimental;

  /**
  * Description: "The date  (and optionally time) when the data element was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the data element changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String date;

  /**
  * Description: "Extensions for date"
  */
  private transient Element _date;

  /**
  * Description: "The name of the individual or organization that published the data element."
  */
  private String publisher;

  /**
  * Description: "Extensions for publisher"
  */
  private transient Element _publisher;

  /**
  * Description: "A natural language name identifying the data element. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "A short, descriptive, user-friendly title for the data element."
  */
  private String title;

  /**
  * Description: "Extensions for title"
  */
  private transient Element _title;

  /**
  * Description: "Contact details to assist a user in finding and communicating with the publisher."
  */
  private java.util.List<ContactDetail> contact = new java.util.ArrayList<>();

  /**
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate data element instances."
  */
  private java.util.List<UsageContext> useContext = new java.util.ArrayList<>();

  /**
  * Description: "A legal or geographic region in which the data element is intended to be used."
  */
  private java.util.List<CodeableConcept> jurisdiction = new java.util.ArrayList<>();

  /**
  * Description: "A copyright statement relating to the data element and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the data element."
  */
  private String copyright;

  /**
  * Description: "Extensions for copyright"
  */
  private transient Element _copyright;

  /**
  * Description: "Identifies how precise the data element is in its definition."
  */
  private String stringency;

  /**
  * Description: "Extensions for stringency"
  */
  private transient Element _stringency;

  /**
  * Description: "Identifies a specification (other than a terminology) that the elements which make up the DataElement have some correspondence with."
  */
  private java.util.List<DataElementMapping> mapping = new java.util.ArrayList<>();

  /**
  * Description: "Defines the structure, type, allowed values and other constraining characteristics of the data element."
  */
  @javax.validation.constraints.NotNull
  private java.util.List<ElementDefinition> element = new java.util.ArrayList<>();

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

  public DataElement() {
  }

  public DataElement(DataElementModel o) {
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

      if (null != o.getName()) {
        this.name = new String(o.getName());
      }

      if (null != o.getTitle()) {
        this.title = new String(o.getTitle());
      }

      this.contact = ContactDetail.fromArray(o.getContact());

      this.useContext = UsageContext.fromArray(o.getUseContext());

      this.jurisdiction = CodeableConcept.fromArray(o.getJurisdiction());
      if (null != o.getCopyright()) {
        this.copyright = new String(o.getCopyright());
      }

      if (null != o.getStringency()) {
        this.stringency = new String(o.getStringency());
      }

      this.mapping = DataElementMapping.fromArray(o.getMapping());

      this.element = ElementDefinition.fromArray(o.getElement());
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
  public void setContact( java.util.List<ContactDetail> value) {
    this.contact = value;
  }
  public java.util.List<ContactDetail> getContact() {
    return this.contact;
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
  public void setStringency( String value) {
    this.stringency = StringencyEnum.fromCode(value);
  }
  public String getStringency() {
    return this.stringency;
  }
  public void set_stringency( Element value) {
    this._stringency = value;
  }
  public Element get_stringency() {
    return this._stringency;
  }
  public void setMapping( java.util.List<DataElementMapping> value) {
    this.mapping = value;
  }
  public java.util.List<DataElementMapping> getMapping() {
    return this.mapping;
  }
  public void setElement( java.util.List<ElementDefinition> value) {
    this.element = value;
  }
  public java.util.List<ElementDefinition> getElement() {
    return this.element;
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
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("experimental" + "[" + String.valueOf(this.experimental) + "]\n"); 
     builder.append("_experimental" + "[" + String.valueOf(this._experimental) + "]\n"); 
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("_date" + "[" + String.valueOf(this._date) + "]\n"); 
     builder.append("publisher" + "[" + String.valueOf(this.publisher) + "]\n"); 
     builder.append("_publisher" + "[" + String.valueOf(this._publisher) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("title" + "[" + String.valueOf(this.title) + "]\n"); 
     builder.append("_title" + "[" + String.valueOf(this._title) + "]\n"); 
     builder.append("contact" + "[" + String.valueOf(this.contact) + "]\n"); 
     builder.append("useContext" + "[" + String.valueOf(this.useContext) + "]\n"); 
     builder.append("jurisdiction" + "[" + String.valueOf(this.jurisdiction) + "]\n"); 
     builder.append("copyright" + "[" + String.valueOf(this.copyright) + "]\n"); 
     builder.append("_copyright" + "[" + String.valueOf(this._copyright) + "]\n"); 
     builder.append("stringency" + "[" + String.valueOf(this.stringency) + "]\n"); 
     builder.append("_stringency" + "[" + String.valueOf(this._stringency) + "]\n"); 
     builder.append("mapping" + "[" + String.valueOf(this.mapping) + "]\n"); 
     builder.append("element" + "[" + String.valueOf(this.element) + "]\n"); 
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
  	DataElement,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "DataElement" : { return DataElement.toString(); }
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

  public enum StringencyEnum {
  	comparable,
  	fullyspecified,
  	equivalent,
  	convertable,
  	scaleable,
  	flexible,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "comparable" : { return comparable.toString(); }
  			case "fullyspecified" : { return fullyspecified.toString(); }
  			case "equivalent" : { return equivalent.toString(); }
  			case "convertable" : { return convertable.toString(); }
  			case "scaleable" : { return scaleable.toString(); }
  			case "flexible" : { return flexible.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<DataElement> fromArray(java.util.List<DataElementModel> list) {
    return (java.util.List<DataElement>)list.stream()
      .map(model -> new DataElement(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<DataElementModel> toModelArray(java.util.List<DataElement> list) {
    return (java.util.List<DataElementModel>)list.stream()
      .map(model -> new DataElementModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static DataElement fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, DataElement.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(DataElement o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<DataElement> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
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
* "A search parameter that defines a named search item that can be used to search/filter on a resource."
* generated on 07/14/2018
*/
@Entity
@Table(name="searchparameter")
public class SearchParameterModel  implements Serializable {
	private static final long serialVersionUID = 153159210218770032L;
  /**
  * Description: "This is a SearchParameter resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this search parameter when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this search parameter is (or will be) published. The URL SHOULD include the major version of the search parameter. For more information see [Technical and Business Versions](resource.html#versions)."
  */
  @javax.persistence.Basic
  @Column(name="\"url\"")
  private String url;

  /**
  * Description: "The identifier that is used to identify this version of the search parameter when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the search parameter author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence."
  */
  @javax.persistence.Basic
  @Column(name="\"version\"")
  private String version;

  /**
  * Description: "A natural language name identifying the search parameter. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "The status of this search parameter. Enables tracking the life-cycle of the content."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "A boolean value to indicate that this search parameter is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  @javax.persistence.Basic
  @Column(name="\"experimental\"")
  private Boolean experimental;

  /**
  * Description: "The date  (and optionally time) when the search parameter was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the search parameter changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "The name of the individual or organization that published the search parameter."
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
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate search parameter instances."
  */
  @javax.persistence.Basic
  @Column(name="\"usecontext_id\"")
  private String usecontext_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="usecontext_id", insertable=false, updatable=false)
  private java.util.List<UsageContextModel> useContext;

  /**
  * Description: "A legal or geographic region in which the search parameter is intended to be used."
  */
  @javax.persistence.Basic
  @Column(name="\"jurisdiction_id\"")
  private String jurisdiction_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="jurisdiction_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> jurisdiction;

  /**
  * Description: "Explaination of why this search parameter is needed and why it has been designed as it has."
  */
  @javax.persistence.Basic
  @Column(name="\"purpose\"")
  private String purpose;

  /**
  * Description: "The code used in the URL or the parameter name in a parameters resource for this search parameter."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"code\"")
  private String code;

  /**
  * Description: "The base resource type(s) that this search parameter can be used against."
  */
  @javax.persistence.Basic
  @Column(name="\"base\"")
  private String base;

  /**
  * Description: "The type of value a search parameter refers to, and how the content is interpreted."
  */
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "Where this search parameter is originally defined. If a derivedFrom is provided, then the details in the search parameter must be consistent with the definition from which it is defined. I.e. the parameter should have the same meaning, and (usually) the functionality should be a proper subset of the underlying search parameter."
  */
  @javax.persistence.Basic
  @Column(name="\"derivedFrom\"")
  private String derivedFrom;

  /**
  * Description: "A free text natural language description of the search parameter from a consumer's perspective. and how it used."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "A FHIRPath expression that returns a set of elements for the search parameter."
  */
  @javax.persistence.Basic
  @Column(name="\"expression\"")
  private String expression;

  /**
  * Description: "An XPath expression that returns a set of elements for the search parameter."
  */
  @javax.persistence.Basic
  @Column(name="\"xpath\"")
  private String xpath;

  /**
  * Description: "How the search parameter relates to the set of elements returned by evaluating the xpath query."
  */
  @javax.persistence.Basic
  @Column(name="\"xpathUsage\"")
  private String xpathUsage;

  /**
  * Description: "Types of resource (if a resource is referenced)."
  */
  @javax.persistence.Basic
  @Column(name="\"target\"")
  private String target;

  /**
  * Description: "Comparators supported for the search parameter."
  */
  @javax.persistence.Basic
  @Column(name="\"comparator\"")
  private String comparator;

  /**
  * Description: "A modifier supported for the search parameter."
  */
  @javax.persistence.Basic
  @Column(name="\"modifier\"")
  private String modifier;

  /**
  * Description: "Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference, and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from SearchParameter.code for a parameter on the target resource type."
  */
  @javax.persistence.Basic
  @Column(name="\"chain\"")
  private String chain;

  /**
  * Description: "Used to define the parts of a composite search parameter."
  */
  @javax.persistence.Basic
  @Column(name="\"component_id\"")
  private String component_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="component_id", insertable=false, updatable=false)
  private java.util.List<SearchParameterComponentModel> component;

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

  public SearchParameterModel() {
  }

  public SearchParameterModel(SearchParameter o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.url = o.getUrl();
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
    if (null != o.getUseContext() && !o.getUseContext().isEmpty()) {
    	this.usecontext_id = "usecontext" + this.id;
    	this.useContext = UsageContextHelper.toModelFromArray(o.getUseContext(), this.usecontext_id);
    }
    if (null != o.getJurisdiction() && !o.getJurisdiction().isEmpty()) {
    	this.jurisdiction_id = "jurisdiction" + this.id;
    	this.jurisdiction = CodeableConceptHelper.toModelFromArray(o.getJurisdiction(), this.jurisdiction_id);
    }
    this.purpose = o.getPurpose();
    this.code = o.getCode();
    this.base = org.fhir.utils.JsonUtils.toJson(o.getBase());
    this.type = o.getType();
    this.derivedFrom = o.getDerivedFrom();
    this.description = o.getDescription();
    this.expression = o.getExpression();
    this.xpath = o.getXpath();
    this.xpathUsage = o.getXpathUsage();
    this.target = org.fhir.utils.JsonUtils.toJson(o.getTarget());
    this.comparator = org.fhir.utils.JsonUtils.toJson(o.getComparator());
    this.modifier = org.fhir.utils.JsonUtils.toJson(o.getModifier());
    this.chain = org.fhir.utils.JsonUtils.toJson(o.getChain());
    if (null != o.getComponent() && !o.getComponent().isEmpty()) {
    	this.component_id = "component" + this.id;
    	this.component = SearchParameterComponentHelper.toModelFromArray(o.getComponent(), this.component_id);
    }
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
  public String getPurpose() {
    return this.purpose;
  }
  public void setPurpose( String value) {
    this.purpose = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getBase() {
    return this.base;
  }
  public void setBase( String value) {
    this.base = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getDerivedFrom() {
    return this.derivedFrom;
  }
  public void setDerivedFrom( String value) {
    this.derivedFrom = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getExpression() {
    return this.expression;
  }
  public void setExpression( String value) {
    this.expression = value;
  }
  public String getXpath() {
    return this.xpath;
  }
  public void setXpath( String value) {
    this.xpath = value;
  }
  public String getXpathUsage() {
    return this.xpathUsage;
  }
  public void setXpathUsage( String value) {
    this.xpathUsage = value;
  }
  public String getTarget() {
    return this.target;
  }
  public void setTarget( String value) {
    this.target = value;
  }
  public String getComparator() {
    return this.comparator;
  }
  public void setComparator( String value) {
    this.comparator = value;
  }
  public String getModifier() {
    return this.modifier;
  }
  public void setModifier( String value) {
    this.modifier = value;
  }
  public String getChain() {
    return this.chain;
  }
  public void setChain( String value) {
    this.chain = value;
  }
  public java.util.List<SearchParameterComponentModel> getComponent() {
    return this.component;
  }
  public void setComponent( java.util.List<SearchParameterComponentModel> value) {
    this.component = value;
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
    builder.append("[SearchParameterModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("url" + "->" + this.url + "\n"); 
     builder.append("version" + "->" + this.version + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("experimental" + "->" + this.experimental + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("publisher" + "->" + this.publisher + "\n"); 
     builder.append("purpose" + "->" + this.purpose + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("base" + "->" + this.base + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("derivedFrom" + "->" + this.derivedFrom + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("expression" + "->" + this.expression + "\n"); 
     builder.append("xpath" + "->" + this.xpath + "\n"); 
     builder.append("xpathUsage" + "->" + this.xpathUsage + "\n"); 
     builder.append("target" + "->" + this.target + "\n"); 
     builder.append("comparator" + "->" + this.comparator + "\n"); 
     builder.append("modifier" + "->" + this.modifier + "\n"); 
     builder.append("chain" + "->" + this.chain + "\n"); 
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
    builder.append("[SearchParameterModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("url" + "->" + this.url + "\n"); 
     builder.append("version" + "->" + this.version + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("experimental" + "->" + this.experimental + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("publisher" + "->" + this.publisher + "\n"); 
     builder.append("purpose" + "->" + this.purpose + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("base" + "->" + this.base + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("derivedFrom" + "->" + this.derivedFrom + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("expression" + "->" + this.expression + "\n"); 
     builder.append("xpath" + "->" + this.xpath + "\n"); 
     builder.append("xpathUsage" + "->" + this.xpathUsage + "\n"); 
     builder.append("target" + "->" + this.target + "\n"); 
     builder.append("comparator" + "->" + this.comparator + "\n"); 
     builder.append("modifier" + "->" + this.modifier + "\n"); 
     builder.append("chain" + "->" + this.chain + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}
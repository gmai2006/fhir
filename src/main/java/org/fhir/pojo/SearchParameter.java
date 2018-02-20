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
import org.fhir.entity.SearchParameterModel;
import com.google.gson.GsonBuilder;

/**
* "A search parameter that defines a named search item that can be used to search/filter on a resource."
*/
public class SearchParameter  extends DomainResource  {
  /**
  * Description: "This is a SearchParameter resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this search parameter when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this search parameter is (or will be) published. The URL SHOULD include the major version of the search parameter. For more information see [Technical and Business Versions](resource.html#versions)."
  */
  protected String url;

  /**
  * Description: "Extensions for url"
  */
  protected transient Element _url;

  /**
  * Description: "The identifier that is used to identify this version of the search parameter when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the search parameter author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence."
  */
  protected String version;

  /**
  * Description: "Extensions for version"
  */
  protected transient Element _version;

  /**
  * Description: "A natural language name identifying the search parameter. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "The status of this search parameter. Enables tracking the life-cycle of the content."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "A boolean value to indicate that this search parameter is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  protected Boolean experimental;

  /**
  * Description: "Extensions for experimental"
  */
  protected transient Element _experimental;

  /**
  * Description: "The date  (and optionally time) when the search parameter was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the search parameter changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "The name of the individual or organization that published the search parameter."
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
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate search parameter instances."
  */
  protected java.util.List<UsageContext> useContext = new java.util.ArrayList<>();

  /**
  * Description: "A legal or geographic region in which the search parameter is intended to be used."
  */
  protected java.util.List<CodeableConcept> jurisdiction = new java.util.ArrayList<>();

  /**
  * Description: "Explaination of why this search parameter is needed and why it has been designed as it has."
  */
  protected String purpose;

  /**
  * Description: "Extensions for purpose"
  */
  protected transient Element _purpose;

  /**
  * Description: "The code used in the URL or the parameter name in a parameters resource for this search parameter."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String code;

  /**
  * Description: "Extensions for code"
  */
  protected transient Element _code;

  /**
  * Description: "The base resource type(s) that this search parameter can be used against."
  */
  protected java.util.List<String> base = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for base"
  */
  protected transient java.util.List<Element> _base = new java.util.ArrayList<>();

  /**
  * Description: "The type of value a search parameter refers to, and how the content is interpreted."
  */
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  /**
  * Description: "Where this search parameter is originally defined. If a derivedFrom is provided, then the details in the search parameter must be consistent with the definition from which it is defined. I.e. the parameter should have the same meaning, and (usually) the functionality should be a proper subset of the underlying search parameter."
  */
  protected String derivedFrom;

  /**
  * Description: "Extensions for derivedFrom"
  */
  protected transient Element _derivedFrom;

  /**
  * Description: "A free text natural language description of the search parameter from a consumer's perspective. and how it used."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "A FHIRPath expression that returns a set of elements for the search parameter."
  */
  protected String expression;

  /**
  * Description: "Extensions for expression"
  */
  protected transient Element _expression;

  /**
  * Description: "An XPath expression that returns a set of elements for the search parameter."
  */
  protected String xpath;

  /**
  * Description: "Extensions for xpath"
  */
  protected transient Element _xpath;

  /**
  * Description: "How the search parameter relates to the set of elements returned by evaluating the xpath query."
  */
  protected String xpathUsage;

  /**
  * Description: "Extensions for xpathUsage"
  */
  protected transient Element _xpathUsage;

  /**
  * Description: "Types of resource (if a resource is referenced)."
  */
  protected java.util.List<String> target = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for target"
  */
  protected transient java.util.List<Element> _target = new java.util.ArrayList<>();

  /**
  * Description: "Comparators supported for the search parameter."
  */
  protected java.util.List<String> comparator = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for comparator"
  */
  protected transient java.util.List<Element> _comparator = new java.util.ArrayList<>();

  /**
  * Description: "A modifier supported for the search parameter."
  */
  protected java.util.List<String> modifier = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for modifier"
  */
  protected transient java.util.List<Element> _modifier = new java.util.ArrayList<>();

  /**
  * Description: "Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference, and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from SearchParameter.code for a parameter on the target resource type."
  */
  protected java.util.List<String> chain = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for chain"
  */
  protected transient java.util.List<Element> _chain = new java.util.ArrayList<>();

  /**
  * Description: "Used to define the parts of a composite search parameter."
  */
  protected java.util.List<SearchParameterComponent> component = new java.util.ArrayList<>();

  public SearchParameter() {
  }

  public SearchParameter(SearchParameterModel o) {
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
    if (null != o.getUseContext() && !o.getUseContext().isEmpty()) {
    	this.useContext = UsageContextHelper.fromArray2Array(o.getUseContext());
    }
    if (null != o.getJurisdiction() && !o.getJurisdiction().isEmpty()) {
    	this.jurisdiction = CodeableConceptHelper.fromArray2Array(o.getJurisdiction());
    }
    if (null != o.getPurpose()) {
      this.purpose = o.getPurpose();
    }
    if (null != o.getCode()) {
      this.code = o.getCode();
    }
    if (o.getBase() != null) {
    	this.base = org.fhir.utils.JsonUtils.json2Array(o.getBase());
    }
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (null != o.getDerivedFrom()) {
      this.derivedFrom = o.getDerivedFrom();
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getExpression()) {
      this.expression = o.getExpression();
    }
    if (null != o.getXpath()) {
      this.xpath = o.getXpath();
    }
    if (null != o.getXpathUsage()) {
      this.xpathUsage = o.getXpathUsage();
    }
    if (o.getTarget() != null) {
    	this.target = org.fhir.utils.JsonUtils.json2Array(o.getTarget());
    }
    if (o.getComparator() != null) {
    	this.comparator = org.fhir.utils.JsonUtils.json2Array(o.getComparator());
    }
    if (o.getModifier() != null) {
    	this.modifier = org.fhir.utils.JsonUtils.json2Array(o.getModifier());
    }
    if (o.getChain() != null) {
    	this.chain = org.fhir.utils.JsonUtils.json2Array(o.getChain());
    }
    if (null != o.getComponent() && !o.getComponent().isEmpty()) {
    	this.component = SearchParameterComponentHelper.fromArray2Array(o.getComponent());
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
  public void setCode( String value) {
    this.code = value;
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
  public void setBase( java.util.List<String> value) {
    this.base = value;
  }
  public java.util.List<String> getBase() {
    return this.base;
  }
  public void set_base( java.util.List<Element> value) {
    this._base = value;
  }
  public java.util.List<Element> get_base() {
    return this._base;
  }
  public void setType( String value) {
    this.type = TypeEnum.fromCode(value);
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
  public void setDerivedFrom( String value) {
    this.derivedFrom = value;
  }
  public String getDerivedFrom() {
    return this.derivedFrom;
  }
  public void set_derivedFrom( Element value) {
    this._derivedFrom = value;
  }
  public Element get_derivedFrom() {
    return this._derivedFrom;
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
  public void setExpression( String value) {
    this.expression = value;
  }
  public String getExpression() {
    return this.expression;
  }
  public void set_expression( Element value) {
    this._expression = value;
  }
  public Element get_expression() {
    return this._expression;
  }
  public void setXpath( String value) {
    this.xpath = value;
  }
  public String getXpath() {
    return this.xpath;
  }
  public void set_xpath( Element value) {
    this._xpath = value;
  }
  public Element get_xpath() {
    return this._xpath;
  }
  public void setXpathUsage( String value) {
    this.xpathUsage = XpathUsageEnum.fromCode(value);
  }
  public String getXpathUsage() {
    return this.xpathUsage;
  }
  public void set_xpathUsage( Element value) {
    this._xpathUsage = value;
  }
  public Element get_xpathUsage() {
    return this._xpathUsage;
  }
  public void setTarget( java.util.List<String> value) {
    this.target = value;
  }
  public java.util.List<String> getTarget() {
    return this.target;
  }
  public void set_target( java.util.List<Element> value) {
    this._target = value;
  }
  public java.util.List<Element> get_target() {
    return this._target;
  }
  public void setComparator( java.util.List<String> value) {
    this.comparator = ComparatorEnum.fromCode(value);
  }
  public java.util.List<String> getComparator() {
    return this.comparator;
  }
  public void set_comparator( java.util.List<Element> value) {
    this._comparator = value;
  }
  public java.util.List<Element> get_comparator() {
    return this._comparator;
  }
  public void setModifier( java.util.List<String> value) {
    this.modifier = ModifierEnum.fromCode(value);
  }
  public java.util.List<String> getModifier() {
    return this.modifier;
  }
  public void set_modifier( java.util.List<Element> value) {
    this._modifier = value;
  }
  public java.util.List<Element> get_modifier() {
    return this._modifier;
  }
  public void setChain( java.util.List<String> value) {
    this.chain = value;
  }
  public java.util.List<String> getChain() {
    return this.chain;
  }
  public void set_chain( java.util.List<Element> value) {
    this._chain = value;
  }
  public java.util.List<Element> get_chain() {
    return this._chain;
  }
  public void setComponent( java.util.List<SearchParameterComponent> value) {
    this.component = value;
  }
  public java.util.List<SearchParameterComponent> getComponent() {
    return this.component;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SearchParameter]:" + "\n");
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
     if(this.useContext != null) builder.append("useContext" + "->" + this.useContext.toString() + "\n"); 
     if(this.jurisdiction != null) builder.append("jurisdiction" + "->" + this.jurisdiction.toString() + "\n"); 
     if(this.purpose != null) builder.append("purpose" + "->" + this.purpose.toString() + "\n"); 
     if(this._purpose != null) builder.append("_purpose" + "->" + this._purpose.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this._code != null) builder.append("_code" + "->" + this._code.toString() + "\n"); 
     if(this.base != null) builder.append("base" + "->" + this.base.toString() + "\n"); 
     if(this._base != null) builder.append("_base" + "->" + this._base.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.derivedFrom != null) builder.append("derivedFrom" + "->" + this.derivedFrom.toString() + "\n"); 
     if(this._derivedFrom != null) builder.append("_derivedFrom" + "->" + this._derivedFrom.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.expression != null) builder.append("expression" + "->" + this.expression.toString() + "\n"); 
     if(this._expression != null) builder.append("_expression" + "->" + this._expression.toString() + "\n"); 
     if(this.xpath != null) builder.append("xpath" + "->" + this.xpath.toString() + "\n"); 
     if(this._xpath != null) builder.append("_xpath" + "->" + this._xpath.toString() + "\n"); 
     if(this.xpathUsage != null) builder.append("xpathUsage" + "->" + this.xpathUsage.toString() + "\n"); 
     if(this._xpathUsage != null) builder.append("_xpathUsage" + "->" + this._xpathUsage.toString() + "\n"); 
     if(this.target != null) builder.append("target" + "->" + this.target.toString() + "\n"); 
     if(this._target != null) builder.append("_target" + "->" + this._target.toString() + "\n"); 
     if(this.comparator != null) builder.append("comparator" + "->" + this.comparator.toString() + "\n"); 
     if(this._comparator != null) builder.append("_comparator" + "->" + this._comparator.toString() + "\n"); 
     if(this.modifier != null) builder.append("modifier" + "->" + this.modifier.toString() + "\n"); 
     if(this._modifier != null) builder.append("_modifier" + "->" + this._modifier.toString() + "\n"); 
     if(this.chain != null) builder.append("chain" + "->" + this.chain.toString() + "\n"); 
     if(this._chain != null) builder.append("_chain" + "->" + this._chain.toString() + "\n"); 
     if(this.component != null) builder.append("component" + "->" + this.component.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	SearchParameter,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "SearchParameter" : { return SearchParameter.toString(); }
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

  public enum TypeEnum {
  	number,
  	date,
  	string,
  	token,
  	reference,
  	composite,
  	quantity,
  	uri,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "number" : { return number.toString(); }
  			case "date" : { return date.toString(); }
  			case "string" : { return string.toString(); }
  			case "token" : { return token.toString(); }
  			case "reference" : { return reference.toString(); }
  			case "composite" : { return composite.toString(); }
  			case "quantity" : { return quantity.toString(); }
  			case "uri" : { return uri.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum XpathUsageEnum {
  	normal,
  	phonetic,
  	nearby,
  	distance,
  	other,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "normal" : { return normal.toString(); }
  			case "phonetic" : { return phonetic.toString(); }
  			case "nearby" : { return nearby.toString(); }
  			case "distance" : { return distance.toString(); }
  			case "other" : { return other.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum ComparatorEnum {
  	eq,
  	ne,
  	gt,
  	lt,
  	ge,
  	le,
  	sa,
  	eb,
  	ap,
  	UNKNOWN;
  	public static java.util.List<String> fromCode(java.util.List<String> strVal) {
  	  		java.util.List<String> result = new java.util.ArrayList<>();
  	  		for (String s : strVal) {
  	  			switch (s) {
  		  			case "eq" : { result.add(eq.toString()); }
  		  			case "ne" : { result.add(ne.toString()); }
  		  			case "gt" : { result.add(gt.toString()); }
  		  			case "lt" : { result.add(lt.toString()); }
  		  			case "ge" : { result.add(ge.toString()); }
  		  			case "le" : { result.add(le.toString()); }
  		  			case "sa" : { result.add(sa.toString()); }
  		  			case "eb" : { result.add(eb.toString()); }
  		  			case "ap" : { result.add(ap.toString()); }
  		  			default:
  		  				result.add(UNKNOWN.toString());
  	  			}
  	  		}
  	  		return result;
  	  	}
  }

  public enum ModifierEnum {
  	missing,
  	exact,
  	contains,
  	not,
  	text,
  	in,
  	notin,
  	below,
  	above,
  	type,
  	UNKNOWN;
  	public static java.util.List<String> fromCode(java.util.List<String> strVal) {
  	  		java.util.List<String> result = new java.util.ArrayList<>();
  	  		for (String s : strVal) {
  	  			switch (s) {
  		  			case "missing" : { result.add(missing.toString()); }
  		  			case "exact" : { result.add(exact.toString()); }
  		  			case "contains" : { result.add(contains.toString()); }
  		  			case "not" : { result.add(not.toString()); }
  		  			case "text" : { result.add(text.toString()); }
  		  			case "in" : { result.add(in.toString()); }
  		  			case "notin" : { result.add(notin.toString()); }
  		  			case "below" : { result.add(below.toString()); }
  		  			case "above" : { result.add(above.toString()); }
  		  			case "type" : { result.add(type.toString()); }
  		  			default:
  		  				result.add(UNKNOWN.toString());
  	  			}
  	  		}
  	  		return result;
  	  	}
  }

}
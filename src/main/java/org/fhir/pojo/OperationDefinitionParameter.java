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
import com.google.gson.GsonBuilder;

/**
* "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction)."
*/
public class OperationDefinitionParameter  {
  /**
  * Description: "The name of used to identify the parameter."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "Whether this is an input or an output parameter."
  */
  private String use;

  /**
  * Description: "Extensions for use"
  */
  private transient Element _use;

  /**
  * Description: "The minimum number of times this parameter SHALL appear in the request or response."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float min;

  /**
  * Description: "Extensions for min"
  */
  private transient Element _min;

  /**
  * Description: "The maximum number of times this element is permitted to appear in the request or response."
  */
  private String max;

  /**
  * Description: "Extensions for max"
  */
  private transient Element _max;

  /**
  * Description: "Describes the meaning or use of this parameter."
  */
  private String documentation;

  /**
  * Description: "Extensions for documentation"
  */
  private transient Element _documentation;

  /**
  * Description: "The type for this parameter."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String type;

  /**
  * Description: "Extensions for type"
  */
  private transient Element _type;

  /**
  * Description: "How the parameter is understood as a search parameter. This is only used if the parameter type is 'string'."
  */
  private String searchType;

  /**
  * Description: "Extensions for searchType"
  */
  private transient Element _searchType;

  /**
  * Description: "A profile the specifies the rules that this parameter must conform to."
  */
  private Reference profile;

  /**
  * Description: "Binds to a value set if this parameter is coded (code, Coding, CodeableConcept)."
  */
  private OperationDefinitionBinding binding;

  /**
  * Description: "The parts of a nested Parameter."
  */
  private java.util.List<OperationDefinitionParameter> part = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public OperationDefinitionParameter() {}

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
  public void setUse( String value) {
    this.use = UseEnum.fromCode(value);
  }
  public String getUse() {
    return this.use;
  }
  public void set_use( Element value) {
    this._use = value;
  }
  public Element get_use() {
    return this._use;
  }
  public void setMin( Float value) {
    this.min = value;
  }
  public Float getMin() {
    return this.min;
  }
  public void set_min( Element value) {
    this._min = value;
  }
  public Element get_min() {
    return this._min;
  }
  public void setMax( String value) {
    this.max = value;
  }
  public String getMax() {
    return this.max;
  }
  public void set_max( Element value) {
    this._max = value;
  }
  public Element get_max() {
    return this._max;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void set_documentation( Element value) {
    this._documentation = value;
  }
  public Element get_documentation() {
    return this._documentation;
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
  public void setSearchType( String value) {
    this.searchType = SearchTypeEnum.fromCode(value);
  }
  public String getSearchType() {
    return this.searchType;
  }
  public void set_searchType( Element value) {
    this._searchType = value;
  }
  public Element get_searchType() {
    return this._searchType;
  }
  public void setProfile( Reference value) {
    this.profile = value;
  }
  public Reference getProfile() {
    return this.profile;
  }
  public void setBinding( OperationDefinitionBinding value) {
    this.binding = value;
  }
  public OperationDefinitionBinding getBinding() {
    return this.binding;
  }
  public void setPart( java.util.List<OperationDefinitionParameter> value) {
    this.part = value;
  }
  public java.util.List<OperationDefinitionParameter> getPart() {
    return this.part;
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
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("use" + "[" + String.valueOf(this.use) + "]\n"); 
     builder.append("_use" + "[" + String.valueOf(this._use) + "]\n"); 
     builder.append("min" + "[" + String.valueOf(this.min) + "]\n"); 
     builder.append("_min" + "[" + String.valueOf(this._min) + "]\n"); 
     builder.append("max" + "[" + String.valueOf(this.max) + "]\n"); 
     builder.append("_max" + "[" + String.valueOf(this._max) + "]\n"); 
     builder.append("documentation" + "[" + String.valueOf(this.documentation) + "]\n"); 
     builder.append("_documentation" + "[" + String.valueOf(this._documentation) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("_type" + "[" + String.valueOf(this._type) + "]\n"); 
     builder.append("searchType" + "[" + String.valueOf(this.searchType) + "]\n"); 
     builder.append("_searchType" + "[" + String.valueOf(this._searchType) + "]\n"); 
     builder.append("profile" + "[" + String.valueOf(this.profile) + "]\n"); 
     builder.append("binding" + "[" + String.valueOf(this.binding) + "]\n"); 
     builder.append("part" + "[" + String.valueOf(this.part) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public static OperationDefinitionParameter fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, OperationDefinitionParameter.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(OperationDefinitionParameter o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<OperationDefinitionParameter> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public enum UseEnum {
  	in,
  	out,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "in" : { return in.toString(); }
  			case "out" : { return out.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }public enum SearchTypeEnum {
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
}
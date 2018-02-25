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
import org.fhir.entity.OperationDefinitionParameterModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction)."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OperationDefinitionParameter  extends BackboneElement  {
  /**
  * Description: "The name of used to identify the parameter."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "Whether this is an input or an output parameter."
  */
  protected String use;

  /**
  * Description: "Extensions for use"
  */
  protected transient Element _use;

  /**
  * Description: "The minimum number of times this parameter SHALL appear in the request or response."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float min;

  /**
  * Description: "Extensions for min"
  */
  protected transient Element _min;

  /**
  * Description: "The maximum number of times this element is permitted to appear in the request or response."
  */
  protected String max;

  /**
  * Description: "Extensions for max"
  */
  protected transient Element _max;

  /**
  * Description: "Describes the meaning or use of this parameter."
  */
  protected String documentation;

  /**
  * Description: "Extensions for documentation"
  */
  protected transient Element _documentation;

  /**
  * Description: "The type for this parameter."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  /**
  * Description: "How the parameter is understood as a search parameter. This is only used if the parameter type is 'string'."
  */
  protected String searchType;

  /**
  * Description: "Extensions for searchType"
  */
  protected transient Element _searchType;

  /**
  * Description: "A profile the specifies the rules that this parameter must conform to."
  */
  protected Reference profile;

  /**
  * Description: "Binds to a value set if this parameter is coded (code, Coding, CodeableConcept)."
  */
  protected OperationDefinitionBinding binding;

  /**
  * Description: "The parts of a nested Parameter."
  */
  protected java.util.List<OperationDefinitionParameter> part;

  public OperationDefinitionParameter() {
  }

  public OperationDefinitionParameter(OperationDefinitionParameterModel o) {
    this.id = o.getId();
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getUse()) {
      this.use = o.getUse();
    }
    if (null != o.getMin()) {
      this.min = o.getMin();
    }
    if (null != o.getMax()) {
      this.max = o.getMax();
    }
    if (null != o.getDocumentation()) {
      this.documentation = o.getDocumentation();
    }
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (null != o.getSearchType()) {
      this.searchType = o.getSearchType();
    }
    if (null != o.getProfile() && !o.getProfile().isEmpty()) {
      this.profile = new Reference(o.getProfile().get(0));
    }
    if (null != o.getBinding() && !o.getBinding().isEmpty()) {
      this.binding = new OperationDefinitionBinding(o.getBinding().get(0));
    }
    if (null != o.getPart() && !o.getPart().isEmpty()) {
    	this.part = OperationDefinitionParameterHelper.fromArray2Array(o.getPart());
    }
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[OperationDefinitionParameter]:" + "\n");
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.use != null) builder.append("use" + "->" + this.use.toString() + "\n"); 
     if(this._use != null) builder.append("_use" + "->" + this._use.toString() + "\n"); 
     if(this.min != null) builder.append("min" + "->" + this.min.toString() + "\n"); 
     if(this._min != null) builder.append("_min" + "->" + this._min.toString() + "\n"); 
     if(this.max != null) builder.append("max" + "->" + this.max.toString() + "\n"); 
     if(this._max != null) builder.append("_max" + "->" + this._max.toString() + "\n"); 
     if(this.documentation != null) builder.append("documentation" + "->" + this.documentation.toString() + "\n"); 
     if(this._documentation != null) builder.append("_documentation" + "->" + this._documentation.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.searchType != null) builder.append("searchType" + "->" + this.searchType.toString() + "\n"); 
     if(this._searchType != null) builder.append("_searchType" + "->" + this._searchType.toString() + "\n"); 
     if(this.profile != null) builder.append("profile" + "->" + this.profile.toString() + "\n"); 
     if(this.binding != null) builder.append("binding" + "->" + this.binding.toString() + "\n"); 
     if(this.part != null) builder.append("part" + "->" + this.part.toString() + "\n"); ;
    return builder.toString();
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
  }

  public enum SearchTypeEnum {
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
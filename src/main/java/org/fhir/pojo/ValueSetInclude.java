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
import org.fhir.entity.ValueSetIncludeModel;
import com.google.gson.GsonBuilder;

/**
* "A value set specifies a set of codes drawn from one or more code systems."
*/
public class ValueSetInclude  extends BackboneElement  {
  /**
  * Description: "An absolute URI which is the code system from which the selected codes come from."
  */
  protected String system;

  /**
  * Description: "Extensions for system"
  */
  protected transient Element _system;

  /**
  * Description: "The version of the code system that the codes are selected from."
  */
  protected String version;

  /**
  * Description: "Extensions for version"
  */
  protected transient Element _version;

  /**
  * Description: "Specifies a concept to be included or excluded."
  */
  protected java.util.List<ValueSetConcept> concept = new java.util.ArrayList<>();

  /**
  * Description: "Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true."
  */
  protected java.util.List<ValueSetFilter> filter = new java.util.ArrayList<>();

  /**
  * Description: "Selects concepts found in this value set. This is an absolute URI that is a reference to ValueSet.url."
  */
  protected java.util.List<String> valueSet = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for valueSet"
  */
  protected transient java.util.List<Element> _valueSet = new java.util.ArrayList<>();

  public ValueSetInclude() {
  }

  public ValueSetInclude(ValueSetIncludeModel o) {
    this.id = o.getId();
    if (null != o.getSystem()) {
      this.system = o.getSystem();
    }
    if (null != o.getVersion()) {
      this.version = o.getVersion();
    }
    if (null != o.getConcept() && !o.getConcept().isEmpty()) {
    	this.concept = ValueSetConceptHelper.fromArray2Array(o.getConcept());
    }
    if (null != o.getFilter() && !o.getFilter().isEmpty()) {
    	this.filter = ValueSetFilterHelper.fromArray2Array(o.getFilter());
    }
    if (o.getValueSet() != null) {
    	this.valueSet = org.fhir.utils.JsonUtils.json2Array(o.getValueSet());
    }
  }

  public void setSystem( String value) {
    this.system = value;
  }
  public String getSystem() {
    return this.system;
  }
  public void set_system( Element value) {
    this._system = value;
  }
  public Element get_system() {
    return this._system;
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
  public void setConcept( java.util.List<ValueSetConcept> value) {
    this.concept = value;
  }
  public java.util.List<ValueSetConcept> getConcept() {
    return this.concept;
  }
  public void setFilter( java.util.List<ValueSetFilter> value) {
    this.filter = value;
  }
  public java.util.List<ValueSetFilter> getFilter() {
    return this.filter;
  }
  public void setValueSet( java.util.List<String> value) {
    this.valueSet = value;
  }
  public java.util.List<String> getValueSet() {
    return this.valueSet;
  }
  public void set_valueSet( java.util.List<Element> value) {
    this._valueSet = value;
  }
  public java.util.List<Element> get_valueSet() {
    return this._valueSet;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ValueSetInclude]:" + "\n");
     if(this.system != null) builder.append("system" + "->" + this.system.toString() + "\n"); 
     if(this._system != null) builder.append("_system" + "->" + this._system.toString() + "\n"); 
     if(this.version != null) builder.append("version" + "->" + this.version.toString() + "\n"); 
     if(this._version != null) builder.append("_version" + "->" + this._version.toString() + "\n"); 
     if(this.concept != null) builder.append("concept" + "->" + this.concept.toString() + "\n"); 
     if(this.filter != null) builder.append("filter" + "->" + this.filter.toString() + "\n"); 
     if(this.valueSet != null) builder.append("valueSet" + "->" + this.valueSet.toString() + "\n"); 
     if(this._valueSet != null) builder.append("_valueSet" + "->" + this._valueSet.toString() + "\n"); ;
    return builder.toString();
  }


}
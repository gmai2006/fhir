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
import org.fhir.entity.DataRequirementModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DataRequirement  extends Element  {
  /**
  * Description: "The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  /**
  * Description: "The profile of the required data, specified as the uri of the profile definition."
  */
  protected java.util.List<String> profile;

  /**
  * Description: "Extensions for profile"
  */
  protected transient java.util.List<Element> _profile;

  /**
  * Description: "Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. Note that the value for this element can be a path to allow references to nested elements. In that case, all the elements along the path must be supported."
  */
  protected java.util.List<String> mustSupport;

  /**
  * Description: "Extensions for mustSupport"
  */
  protected transient java.util.List<Element> _mustSupport;

  /**
  * Description: "Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data."
  */
  protected java.util.List<DataRequirementCodeFilter> codeFilter;

  /**
  * Description: "Date filters specify additional constraints on the data in terms of the applicable date range for specific elements."
  */
  protected java.util.List<DataRequirementDateFilter> dateFilter;

  public DataRequirement() {
  }

  public DataRequirement(DataRequirementModel o) {
    this.id = o.getId();
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (o.getProfile() != null) {
    	this.profile = org.fhir.utils.JsonUtils.json2Array(o.getProfile());
    }
    if (o.getMustSupport() != null) {
    	this.mustSupport = org.fhir.utils.JsonUtils.json2Array(o.getMustSupport());
    }
    if (null != o.getCodeFilter() && !o.getCodeFilter().isEmpty()) {
    	this.codeFilter = DataRequirementCodeFilterHelper.fromArray2Array(o.getCodeFilter());
    }
    if (null != o.getDateFilter() && !o.getDateFilter().isEmpty()) {
    	this.dateFilter = DataRequirementDateFilterHelper.fromArray2Array(o.getDateFilter());
    }
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
  public void setProfile( java.util.List<String> value) {
    this.profile = value;
  }
  public java.util.List<String> getProfile() {
    return this.profile;
  }
  public void set_profile( java.util.List<Element> value) {
    this._profile = value;
  }
  public java.util.List<Element> get_profile() {
    return this._profile;
  }
  public void setMustSupport( java.util.List<String> value) {
    this.mustSupport = value;
  }
  public java.util.List<String> getMustSupport() {
    return this.mustSupport;
  }
  public void set_mustSupport( java.util.List<Element> value) {
    this._mustSupport = value;
  }
  public java.util.List<Element> get_mustSupport() {
    return this._mustSupport;
  }
  public void setCodeFilter( java.util.List<DataRequirementCodeFilter> value) {
    this.codeFilter = value;
  }
  public java.util.List<DataRequirementCodeFilter> getCodeFilter() {
    return this.codeFilter;
  }
  public void setDateFilter( java.util.List<DataRequirementDateFilter> value) {
    this.dateFilter = value;
  }
  public java.util.List<DataRequirementDateFilter> getDateFilter() {
    return this.dateFilter;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DataRequirement]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.profile != null) builder.append("profile" + "->" + this.profile.toString() + "\n"); 
     if(this._profile != null) builder.append("_profile" + "->" + this._profile.toString() + "\n"); 
     if(this.mustSupport != null) builder.append("mustSupport" + "->" + this.mustSupport.toString() + "\n"); 
     if(this._mustSupport != null) builder.append("_mustSupport" + "->" + this._mustSupport.toString() + "\n"); 
     if(this.codeFilter != null) builder.append("codeFilter" + "->" + this.codeFilter.toString() + "\n"); 
     if(this.dateFilter != null) builder.append("dateFilter" + "->" + this.dateFilter.toString() + "\n"); ;
    return builder.toString();
  }


}
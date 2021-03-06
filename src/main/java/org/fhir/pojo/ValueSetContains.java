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
import org.fhir.entity.ValueSetContainsModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A value set specifies a set of codes drawn from one or more code systems."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ValueSetContains  extends BackboneElement  {
  /**
  * Description: "An absolute URI which is the code system in which the code for this item in the expansion is defined."
  */
  protected String system;

  /**
  * Description: "Extensions for system"
  */
  protected transient Element _system;

  /**
  * Description: "If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value."
  */
  protected Boolean FHIRabstract;

  /**
  * Description: "Extensions for abstract"
  */
  protected transient Element _abstract;

  /**
  * Description: "If the concept is inactive in the code system that defines it. Inactive codes are those that are no longer to be used, but are maintained by the code system for understanding legacy data."
  */
  protected Boolean inactive;

  /**
  * Description: "Extensions for inactive"
  */
  protected transient Element _inactive;

  /**
  * Description: "The version of this code system that defined this code and/or display. This should only be used with code systems that do not enforce concept permanence."
  */
  protected String version;

  /**
  * Description: "Extensions for version"
  */
  protected transient Element _version;

  /**
  * Description: "The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String code;

  /**
  * Description: "Extensions for code"
  */
  protected transient Element _code;

  /**
  * Description: "The recommended display for this item in the expansion."
  */
  protected String display;

  /**
  * Description: "Extensions for display"
  */
  protected transient Element _display;

  /**
  * Description: "Additional representations for this item - other languages, aliases, specialized purposes, used for particular purposes, etc. These are relevant when the conditions of the expansion do not fix to a single correct representation."
  */
  protected java.util.List<ValueSetDesignation> designation;

  /**
  * Description: "Other codes and entries contained under this entry in the hierarchy."
  */
  protected java.util.List<ValueSetContains> contains;

  public ValueSetContains() {
  }

  public ValueSetContains(ValueSetContainsModel o) {
    this.id = o.getId();
    if (null != o.getSystem()) {
      this.system = o.getSystem();
    }
    if (null != o.getFHIRabstract()) {
      this.FHIRabstract = o.getFHIRabstract();
    }
    if (null != o.getInactive()) {
      this.inactive = o.getInactive();
    }
    if (null != o.getVersion()) {
      this.version = o.getVersion();
    }
    if (null != o.getCode()) {
      this.code = o.getCode();
    }
    if (null != o.getDisplay()) {
      this.display = o.getDisplay();
    }
    if (null != o.getDesignation() && !o.getDesignation().isEmpty()) {
    	this.designation = ValueSetDesignationHelper.fromArray2Array(o.getDesignation());
    }
    if (null != o.getContains() && !o.getContains().isEmpty()) {
    	this.contains = ValueSetContainsHelper.fromArray2Array(o.getContains());
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
  public void setInactive( Boolean value) {
    this.inactive = value;
  }
  public Boolean getInactive() {
    return this.inactive;
  }
  public void set_inactive( Element value) {
    this._inactive = value;
  }
  public Element get_inactive() {
    return this._inactive;
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
  public void setDisplay( String value) {
    this.display = value;
  }
  public String getDisplay() {
    return this.display;
  }
  public void set_display( Element value) {
    this._display = value;
  }
  public Element get_display() {
    return this._display;
  }
  public void setDesignation( java.util.List<ValueSetDesignation> value) {
    this.designation = value;
  }
  public java.util.List<ValueSetDesignation> getDesignation() {
    return this.designation;
  }
  public void setContains( java.util.List<ValueSetContains> value) {
    this.contains = value;
  }
  public java.util.List<ValueSetContains> getContains() {
    return this.contains;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ValueSetContains]:" + "\n");
     if(this.system != null) builder.append("system" + "->" + this.system.toString() + "\n"); 
     if(this._system != null) builder.append("_system" + "->" + this._system.toString() + "\n"); 
     if(this.FHIRabstract != null) builder.append("FHIRabstract" + "->" + this.FHIRabstract.toString() + "\n"); 
     if(this._abstract != null) builder.append("_abstract" + "->" + this._abstract.toString() + "\n"); 
     if(this.inactive != null) builder.append("inactive" + "->" + this.inactive.toString() + "\n"); 
     if(this._inactive != null) builder.append("_inactive" + "->" + this._inactive.toString() + "\n"); 
     if(this.version != null) builder.append("version" + "->" + this.version.toString() + "\n"); 
     if(this._version != null) builder.append("_version" + "->" + this._version.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this._code != null) builder.append("_code" + "->" + this._code.toString() + "\n"); 
     if(this.display != null) builder.append("display" + "->" + this.display.toString() + "\n"); 
     if(this._display != null) builder.append("_display" + "->" + this._display.toString() + "\n"); 
     if(this.designation != null) builder.append("designation" + "->" + this.designation.toString() + "\n"); 
     if(this.contains != null) builder.append("contains" + "->" + this.contains.toString() + "\n"); ;
    return builder.toString();
  }


}
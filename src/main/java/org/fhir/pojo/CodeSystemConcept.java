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
import org.fhir.entity.CodeSystemConceptModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A code system resource specifies a set of codes drawn from one or more code systems."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CodeSystemConcept  extends BackboneElement  {
  /**
  * Description: "A code - a text symbol - that uniquely identifies the concept within the code system."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String code;

  /**
  * Description: "Extensions for code"
  */
  protected transient Element _code;

  /**
  * Description: "A human readable string that is the recommended default way to present this concept to a user."
  */
  protected String display;

  /**
  * Description: "Extensions for display"
  */
  protected transient Element _display;

  /**
  * Description: "The formal definition of the concept. The code system resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept."
  */
  protected String definition;

  /**
  * Description: "Extensions for definition"
  */
  protected transient Element _definition;

  /**
  * Description: "Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc."
  */
  protected java.util.List<CodeSystemDesignation> designation;

  /**
  * Description: "A property value for this concept."
  */
  protected java.util.List<CodeSystemProperty1> property;

  /**
  * Description: "Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) - see hierarchyMeaning."
  */
  protected java.util.List<CodeSystemConcept> concept;

  public CodeSystemConcept() {
  }

  public CodeSystemConcept(CodeSystemConceptModel o) {
    this.id = o.getId();
    if (null != o.getCode()) {
      this.code = o.getCode();
    }
    if (null != o.getDisplay()) {
      this.display = o.getDisplay();
    }
    if (null != o.getDefinition()) {
      this.definition = o.getDefinition();
    }
    if (null != o.getDesignation() && !o.getDesignation().isEmpty()) {
    	this.designation = CodeSystemDesignationHelper.fromArray2Array(o.getDesignation());
    }
    if (null != o.getProperty() && !o.getProperty().isEmpty()) {
    	this.property = CodeSystemProperty1Helper.fromArray2Array(o.getProperty());
    }
    if (null != o.getConcept() && !o.getConcept().isEmpty()) {
    	this.concept = CodeSystemConceptHelper.fromArray2Array(o.getConcept());
    }
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
  public void setDefinition( String value) {
    this.definition = value;
  }
  public String getDefinition() {
    return this.definition;
  }
  public void set_definition( Element value) {
    this._definition = value;
  }
  public Element get_definition() {
    return this._definition;
  }
  public void setDesignation( java.util.List<CodeSystemDesignation> value) {
    this.designation = value;
  }
  public java.util.List<CodeSystemDesignation> getDesignation() {
    return this.designation;
  }
  public void setProperty( java.util.List<CodeSystemProperty1> value) {
    this.property = value;
  }
  public java.util.List<CodeSystemProperty1> getProperty() {
    return this.property;
  }
  public void setConcept( java.util.List<CodeSystemConcept> value) {
    this.concept = value;
  }
  public java.util.List<CodeSystemConcept> getConcept() {
    return this.concept;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CodeSystemConcept]:" + "\n");
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this._code != null) builder.append("_code" + "->" + this._code.toString() + "\n"); 
     if(this.display != null) builder.append("display" + "->" + this.display.toString() + "\n"); 
     if(this._display != null) builder.append("_display" + "->" + this._display.toString() + "\n"); 
     if(this.definition != null) builder.append("definition" + "->" + this.definition.toString() + "\n"); 
     if(this._definition != null) builder.append("_definition" + "->" + this._definition.toString() + "\n"); 
     if(this.designation != null) builder.append("designation" + "->" + this.designation.toString() + "\n"); 
     if(this.property != null) builder.append("property" + "->" + this.property.toString() + "\n"); 
     if(this.concept != null) builder.append("concept" + "->" + this.concept.toString() + "\n"); ;
    return builder.toString();
  }


}
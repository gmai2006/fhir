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
* "Captures constraints on each element within the resource, profile, or extension."
*/
public class ElementDefinitionConstraint  {
  /**
  * Description: "Allows identification of which elements have their cardinalities impacted by the constraint.  Will not be referenced for constraints that do not affect cardinality."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String key;

  /**
  * Description: "Extensions for key"
  */
  private transient Element _key;

  /**
  * Description: "Description of why this constraint is necessary or appropriate."
  */
  private String requirements;

  /**
  * Description: "Extensions for requirements"
  */
  private transient Element _requirements;

  /**
  * Description: "Identifies the impact constraint violation has on the conformance of the instance."
  */
  private String severity;

  /**
  * Description: "Extensions for severity"
  */
  private transient Element _severity;

  /**
  * Description: "Text that can be used to describe the constraint in messages identifying that the constraint has been violated."
  */
  private String human;

  /**
  * Description: "Extensions for human"
  */
  private transient Element _human;

  /**
  * Description: "A [FHIRPath](http://hl7.org/fluentpath) expression of constraint that can be executed to see if this constraint is met."
  */
  private String expression;

  /**
  * Description: "Extensions for expression"
  */
  private transient Element _expression;

  /**
  * Description: "An XPath expression of constraint that can be executed to see if this constraint is met."
  */
  private String xpath;

  /**
  * Description: "Extensions for xpath"
  */
  private transient Element _xpath;

  /**
  * Description: "A reference to the original source of the constraint, for traceability purposes."
  */
  private String source;

  /**
  * Description: "Extensions for source"
  */
  private transient Element _source;

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
  @javax.validation.constraints.NotNull
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

  public ElementDefinitionConstraint() {}

  public void setKey( String value) {
    this.key = value;
  }
  public String getKey() {
    return this.key;
  }
  public void set_key( Element value) {
    this._key = value;
  }
  public Element get_key() {
    return this._key;
  }
  public void setRequirements( String value) {
    this.requirements = value;
  }
  public String getRequirements() {
    return this.requirements;
  }
  public void set_requirements( Element value) {
    this._requirements = value;
  }
  public Element get_requirements() {
    return this._requirements;
  }
  public void setSeverity( String value) {
    this.severity = SeverityEnum.fromCode(value);
  }
  public String getSeverity() {
    return this.severity;
  }
  public void set_severity( Element value) {
    this._severity = value;
  }
  public Element get_severity() {
    return this._severity;
  }
  public void setHuman( String value) {
    this.human = value;
  }
  public String getHuman() {
    return this.human;
  }
  public void set_human( Element value) {
    this._human = value;
  }
  public Element get_human() {
    return this._human;
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
  public void setSource( String value) {
    this.source = value;
  }
  public String getSource() {
    return this.source;
  }
  public void set_source( Element value) {
    this._source = value;
  }
  public Element get_source() {
    return this._source;
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
    builder.append("[ElementDefinitionConstraint]:" + "\n");
     if(this.key != null) builder.append("key" + "->" + this.key.toString() + "\n"); 
     if(this._key != null) builder.append("_key" + "->" + this._key.toString() + "\n"); 
     if(this.requirements != null) builder.append("requirements" + "->" + this.requirements.toString() + "\n"); 
     if(this._requirements != null) builder.append("_requirements" + "->" + this._requirements.toString() + "\n"); 
     if(this.severity != null) builder.append("severity" + "->" + this.severity.toString() + "\n"); 
     if(this._severity != null) builder.append("_severity" + "->" + this._severity.toString() + "\n"); 
     if(this.human != null) builder.append("human" + "->" + this.human.toString() + "\n"); 
     if(this._human != null) builder.append("_human" + "->" + this._human.toString() + "\n"); 
     if(this.expression != null) builder.append("expression" + "->" + this.expression.toString() + "\n"); 
     if(this._expression != null) builder.append("_expression" + "->" + this._expression.toString() + "\n"); 
     if(this.xpath != null) builder.append("xpath" + "->" + this.xpath.toString() + "\n"); 
     if(this._xpath != null) builder.append("_xpath" + "->" + this._xpath.toString() + "\n"); 
     if(this.source != null) builder.append("source" + "->" + this.source.toString() + "\n"); 
     if(this._source != null) builder.append("_source" + "->" + this._source.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }

  public enum SeverityEnum {
  	error,
  	warning,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "error" : { return error.toString(); }
  			case "warning" : { return warning.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }
}
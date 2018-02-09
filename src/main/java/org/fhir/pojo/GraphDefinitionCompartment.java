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
import org.fhir.entity.GraphDefinitionCompartmentModel;
import com.google.gson.GsonBuilder;

/**
* "A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set."
*/
public class GraphDefinitionCompartment  {
  /**
  * Description: "Identifies the compartment."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String code;

  /**
  * Description: "Extensions for code"
  */
  private transient Element _code;

  /**
  * Description: "identical | matching | different | no-rule | custom."
  */
  private String rule;

  /**
  * Description: "Extensions for rule"
  */
  private transient Element _rule;

  /**
  * Description: "Custom rule, as a FHIRPath expression."
  */
  private String expression;

  /**
  * Description: "Extensions for expression"
  */
  private transient Element _expression;

  /**
  * Description: "Documentation for FHIRPath expression."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

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

  public GraphDefinitionCompartment() {
  }

  public GraphDefinitionCompartment(GraphDefinitionCompartmentModel o) {
    this.id = o.getId();
      if (null != o.getCode()) {
        this.code = new String(o.getCode());
      }

      if (null != o.getRule()) {
        this.rule = new String(o.getRule());
      }

      if (null != o.getExpression()) {
        this.expression = new String(o.getExpression());
      }

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
  public void setRule( String value) {
    this.rule = RuleEnum.fromCode(value);
  }
  public String getRule() {
    return this.rule;
  }
  public void set_rule( Element value) {
    this._rule = value;
  }
  public Element get_rule() {
    return this._rule;
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
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("_code" + "[" + String.valueOf(this._code) + "]\n"); 
     builder.append("rule" + "[" + String.valueOf(this.rule) + "]\n"); 
     builder.append("_rule" + "[" + String.valueOf(this._rule) + "]\n"); 
     builder.append("expression" + "[" + String.valueOf(this.expression) + "]\n"); 
     builder.append("_expression" + "[" + String.valueOf(this._expression) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum RuleEnum {
  	identical,
  	matching,
  	different,
  	custom,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "identical" : { return identical.toString(); }
  			case "matching" : { return matching.toString(); }
  			case "different" : { return different.toString(); }
  			case "custom" : { return custom.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<GraphDefinitionCompartment> fromArray(java.util.List<GraphDefinitionCompartmentModel> list) {
    return (java.util.List<GraphDefinitionCompartment>)list.stream()
      .map(model -> new GraphDefinitionCompartment(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<GraphDefinitionCompartmentModel> toModelArray(java.util.List<GraphDefinitionCompartment> list) {
    return (java.util.List<GraphDefinitionCompartmentModel>)list.stream()
      .map(model -> new GraphDefinitionCompartmentModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static GraphDefinitionCompartment fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, GraphDefinitionCompartment.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(GraphDefinitionCompartment o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<GraphDefinitionCompartment> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
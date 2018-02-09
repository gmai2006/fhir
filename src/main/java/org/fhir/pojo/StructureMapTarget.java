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
* "A Map of relationships between 2 structures that can be used to transform data."
*/
public class StructureMapTarget  {
  /**
  * Description: "Type or variable this rule applies to."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String context;

  /**
  * Description: "Extensions for context"
  */
  private transient Element _context;

  /**
  * Description: "How to interpret the context."
  */
  private String contextType;

  /**
  * Description: "Extensions for contextType"
  */
  private transient Element _contextType;

  /**
  * Description: "Field to create in the context."
  */
  private String element;

  /**
  * Description: "Extensions for element"
  */
  private transient Element _element;

  /**
  * Description: "Named context for field, if desired, and a field is specified."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String variable;

  /**
  * Description: "Extensions for variable"
  */
  private transient Element _variable;

  /**
  * Description: "If field is a list, how to manage the list."
  */
  private java.util.List<String> listMode = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for listMode"
  */
  private transient java.util.List<Element> _listMode = new java.util.ArrayList<>();

  /**
  * Description: "Internal rule reference for shared list items."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String listRuleId;

  /**
  * Description: "Extensions for listRuleId"
  */
  private transient Element _listRuleId;

  /**
  * Description: "How the data is copied / created."
  */
  private String transform;

  /**
  * Description: "Extensions for transform"
  */
  private transient Element _transform;

  /**
  * Description: "Parameters to the transform."
  */
  private java.util.List<StructureMapParameter> parameter = new java.util.ArrayList<>();

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

  public StructureMapTarget() {}

  public void setContext( String value) {
    this.context = value;
  }
  public String getContext() {
    return this.context;
  }
  public void set_context( Element value) {
    this._context = value;
  }
  public Element get_context() {
    return this._context;
  }
  public void setContextType( String value) {
    this.contextType = ContextTypeEnum.fromCode(value);
  }
  public String getContextType() {
    return this.contextType;
  }
  public void set_contextType( Element value) {
    this._contextType = value;
  }
  public Element get_contextType() {
    return this._contextType;
  }
  public void setElement( String value) {
    this.element = value;
  }
  public String getElement() {
    return this.element;
  }
  public void set_element( Element value) {
    this._element = value;
  }
  public Element get_element() {
    return this._element;
  }
  public void setVariable( String value) {
    this.variable = value;
  }
  public String getVariable() {
    return this.variable;
  }
  public void set_variable( Element value) {
    this._variable = value;
  }
  public Element get_variable() {
    return this._variable;
  }
  public void setListMode( java.util.List<String> value) {
    this.listMode = ListModeEnum.fromCode(value);
  }
  public java.util.List<String> getListMode() {
    return this.listMode;
  }
  public void set_listMode( java.util.List<Element> value) {
    this._listMode = value;
  }
  public java.util.List<Element> get_listMode() {
    return this._listMode;
  }
  public void setListRuleId( String value) {
    this.listRuleId = value;
  }
  public String getListRuleId() {
    return this.listRuleId;
  }
  public void set_listRuleId( Element value) {
    this._listRuleId = value;
  }
  public Element get_listRuleId() {
    return this._listRuleId;
  }
  public void setTransform( String value) {
    this.transform = TransformEnum.fromCode(value);
  }
  public String getTransform() {
    return this.transform;
  }
  public void set_transform( Element value) {
    this._transform = value;
  }
  public Element get_transform() {
    return this._transform;
  }
  public void setParameter( java.util.List<StructureMapParameter> value) {
    this.parameter = value;
  }
  public java.util.List<StructureMapParameter> getParameter() {
    return this.parameter;
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
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("_context" + "[" + String.valueOf(this._context) + "]\n"); 
     builder.append("contextType" + "[" + String.valueOf(this.contextType) + "]\n"); 
     builder.append("_contextType" + "[" + String.valueOf(this._contextType) + "]\n"); 
     builder.append("element" + "[" + String.valueOf(this.element) + "]\n"); 
     builder.append("_element" + "[" + String.valueOf(this._element) + "]\n"); 
     builder.append("variable" + "[" + String.valueOf(this.variable) + "]\n"); 
     builder.append("_variable" + "[" + String.valueOf(this._variable) + "]\n"); 
     builder.append("listMode" + "[" + String.valueOf(this.listMode) + "]\n"); 
     builder.append("_listMode" + "[" + String.valueOf(this._listMode) + "]\n"); 
     builder.append("listRuleId" + "[" + String.valueOf(this.listRuleId) + "]\n"); 
     builder.append("_listRuleId" + "[" + String.valueOf(this._listRuleId) + "]\n"); 
     builder.append("transform" + "[" + String.valueOf(this.transform) + "]\n"); 
     builder.append("_transform" + "[" + String.valueOf(this._transform) + "]\n"); 
     builder.append("parameter" + "[" + String.valueOf(this.parameter) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public static StructureMapTarget fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, StructureMapTarget.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(StructureMapTarget o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<StructureMapTarget> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public enum ContextTypeEnum {
  	type,
  	variable,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "type" : { return type.toString(); }
  			case "variable" : { return variable.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }public enum ListModeEnum {
  	first,
  	share,
  	last,
  	collate,
  	UNKNOWN;
  	public static java.util.List<String> fromCode(java.util.List<String> strVal) {
  	  		java.util.List<String> result = new java.util.ArrayList<>();
  	  		for (String s : strVal) {
  	  			switch (s) {
  		  			case "first" : { result.add(first.toString()); }
  		  			case "share" : { result.add(share.toString()); }
  		  			case "last" : { result.add(last.toString()); }
  		  			case "collate" : { result.add(collate.toString()); }
  		  			default:
  		  				result.add(UNKNOWN.toString());
  	  			}
  	  		}
  	  		return result;
  	  	}
  }public enum TransformEnum {
  	create,
  	copy,
  	truncate,
  	escape,
  	cast,
  	append,
  	translate,
  	reference,
  	dateOp,
  	uuid,
  	pointer,
  	evaluate,
  	cc,
  	c,
  	qty,
  	id,
  	cp,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "create" : { return create.toString(); }
  			case "copy" : { return copy.toString(); }
  			case "truncate" : { return truncate.toString(); }
  			case "escape" : { return escape.toString(); }
  			case "cast" : { return cast.toString(); }
  			case "append" : { return append.toString(); }
  			case "translate" : { return translate.toString(); }
  			case "reference" : { return reference.toString(); }
  			case "dateOp" : { return dateOp.toString(); }
  			case "uuid" : { return uuid.toString(); }
  			case "pointer" : { return pointer.toString(); }
  			case "evaluate" : { return evaluate.toString(); }
  			case "cc" : { return cc.toString(); }
  			case "c" : { return c.toString(); }
  			case "qty" : { return qty.toString(); }
  			case "id" : { return id.toString(); }
  			case "cp" : { return cp.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }
}
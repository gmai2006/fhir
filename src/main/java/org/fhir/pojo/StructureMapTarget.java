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
import org.fhir.entity.StructureMapTargetModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A Map of relationships between 2 structures that can be used to transform data."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class StructureMapTarget  extends BackboneElement  {
  /**
  * Description: "Type or variable this rule applies to."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String context;

  /**
  * Description: "Extensions for context"
  */
  protected transient Element _context;

  /**
  * Description: "How to interpret the context."
  */
  protected String contextType;

  /**
  * Description: "Extensions for contextType"
  */
  protected transient Element _contextType;

  /**
  * Description: "Field to create in the context."
  */
  protected String element;

  /**
  * Description: "Extensions for element"
  */
  protected transient Element _element;

  /**
  * Description: "Named context for field, if desired, and a field is specified."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String variable;

  /**
  * Description: "Extensions for variable"
  */
  protected transient Element _variable;

  /**
  * Description: "If field is a list, how to manage the list."
  */
  protected java.util.List<String> listMode;

  /**
  * Description: "Extensions for listMode"
  */
  protected transient java.util.List<Element> _listMode;

  /**
  * Description: "Internal rule reference for shared list items."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String listRuleId;

  /**
  * Description: "Extensions for listRuleId"
  */
  protected transient Element _listRuleId;

  /**
  * Description: "How the data is copied / created."
  */
  protected String transform;

  /**
  * Description: "Extensions for transform"
  */
  protected transient Element _transform;

  /**
  * Description: "Parameters to the transform."
  */
  protected java.util.List<StructureMapParameter> parameter;

  public StructureMapTarget() {
  }

  public StructureMapTarget(StructureMapTargetModel o) {
    this.id = o.getId();
    if (null != o.getContext()) {
      this.context = o.getContext();
    }
    if (null != o.getContextType()) {
      this.contextType = o.getContextType();
    }
    if (null != o.getElement()) {
      this.element = o.getElement();
    }
    if (null != o.getVariable()) {
      this.variable = o.getVariable();
    }
    if (o.getListMode() != null) {
    	this.listMode = org.fhir.utils.JsonUtils.json2Array(o.getListMode());
    }
    if (null != o.getListRuleId()) {
      this.listRuleId = o.getListRuleId();
    }
    if (null != o.getTransform()) {
      this.transform = o.getTransform();
    }
    if (null != o.getParameter() && !o.getParameter().isEmpty()) {
    	this.parameter = StructureMapParameterHelper.fromArray2Array(o.getParameter());
    }
  }

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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[StructureMapTarget]:" + "\n");
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this._context != null) builder.append("_context" + "->" + this._context.toString() + "\n"); 
     if(this.contextType != null) builder.append("contextType" + "->" + this.contextType.toString() + "\n"); 
     if(this._contextType != null) builder.append("_contextType" + "->" + this._contextType.toString() + "\n"); 
     if(this.element != null) builder.append("element" + "->" + this.element.toString() + "\n"); 
     if(this._element != null) builder.append("_element" + "->" + this._element.toString() + "\n"); 
     if(this.variable != null) builder.append("variable" + "->" + this.variable.toString() + "\n"); 
     if(this._variable != null) builder.append("_variable" + "->" + this._variable.toString() + "\n"); 
     if(this.listMode != null) builder.append("listMode" + "->" + this.listMode.toString() + "\n"); 
     if(this._listMode != null) builder.append("_listMode" + "->" + this._listMode.toString() + "\n"); 
     if(this.listRuleId != null) builder.append("listRuleId" + "->" + this.listRuleId.toString() + "\n"); 
     if(this._listRuleId != null) builder.append("_listRuleId" + "->" + this._listRuleId.toString() + "\n"); 
     if(this.transform != null) builder.append("transform" + "->" + this.transform.toString() + "\n"); 
     if(this._transform != null) builder.append("_transform" + "->" + this._transform.toString() + "\n"); 
     if(this.parameter != null) builder.append("parameter" + "->" + this.parameter.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ListModeEnum {
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
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum TransformEnum {
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
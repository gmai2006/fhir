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
import org.fhir.entity.StructureMapGroupModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A Map of relationships between 2 structures that can be used to transform data."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class StructureMapGroup  extends BackboneElement  {
  /**
  * Description: "A unique name for the group for the convenience of human readers."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "Another group that this group adds rules to."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String FHIRextends;

  /**
  * Description: "Extensions for extends"
  */
  protected transient Element _extends;

  /**
  * Description: "If this is the default rule set to apply for thie source type, or this combination of types."
  */
  protected String typeMode;

  /**
  * Description: "Extensions for typeMode"
  */
  protected transient Element _typeMode;

  /**
  * Description: "Additional supporting documentation that explains the purpose of the group and the types of mappings within it."
  */
  protected String documentation;

  /**
  * Description: "Extensions for documentation"
  */
  protected transient Element _documentation;

  /**
  * Description: "A name assigned to an instance of data. The instance must be provided when the mapping is invoked."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<StructureMapInput> input;

  /**
  * Description: "Transform Rule from source to target."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<StructureMapRule> rule;

  public StructureMapGroup() {
  }

  public StructureMapGroup(StructureMapGroupModel o) {
    this.id = o.getId();
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getFHIRextends()) {
      this.FHIRextends = o.getFHIRextends();
    }
    if (null != o.getTypeMode()) {
      this.typeMode = o.getTypeMode();
    }
    if (null != o.getDocumentation()) {
      this.documentation = o.getDocumentation();
    }
    if (null != o.getInput() && !o.getInput().isEmpty()) {
    	this.input = StructureMapInputHelper.fromArray2Array(o.getInput());
    }
    if (null != o.getRule() && !o.getRule().isEmpty()) {
    	this.rule = StructureMapRuleHelper.fromArray2Array(o.getRule());
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
  public void setFHIRextends( String value) {
    this.FHIRextends = value;
  }
  public String getFHIRextends() {
    return this.FHIRextends;
  }
  public void set_extends( Element value) {
    this._extends = value;
  }
  public Element get_extends() {
    return this._extends;
  }
  public void setTypeMode( String value) {
    this.typeMode = TypeModeEnum.fromCode(value);
  }
  public String getTypeMode() {
    return this.typeMode;
  }
  public void set_typeMode( Element value) {
    this._typeMode = value;
  }
  public Element get_typeMode() {
    return this._typeMode;
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
  public void setInput( java.util.List<StructureMapInput> value) {
    this.input = value;
  }
  public java.util.List<StructureMapInput> getInput() {
    return this.input;
  }
  public void setRule( java.util.List<StructureMapRule> value) {
    this.rule = value;
  }
  public java.util.List<StructureMapRule> getRule() {
    return this.rule;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[StructureMapGroup]:" + "\n");
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.FHIRextends != null) builder.append("FHIRextends" + "->" + this.FHIRextends.toString() + "\n"); 
     if(this._extends != null) builder.append("_extends" + "->" + this._extends.toString() + "\n"); 
     if(this.typeMode != null) builder.append("typeMode" + "->" + this.typeMode.toString() + "\n"); 
     if(this._typeMode != null) builder.append("_typeMode" + "->" + this._typeMode.toString() + "\n"); 
     if(this.documentation != null) builder.append("documentation" + "->" + this.documentation.toString() + "\n"); 
     if(this._documentation != null) builder.append("_documentation" + "->" + this._documentation.toString() + "\n"); 
     if(this.input != null) builder.append("input" + "->" + this.input.toString() + "\n"); 
     if(this.rule != null) builder.append("rule" + "->" + this.rule.toString() + "\n"); ;
    return builder.toString();
  }

  public enum TypeModeEnum {
  	none,
  	types,
  	typeandtypes,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "none" : { return none.toString(); }
  			case "types" : { return types.toString(); }
  			case "typeandtypes" : { return typeandtypes.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}
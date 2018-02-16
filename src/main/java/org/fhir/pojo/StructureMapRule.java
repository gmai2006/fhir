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
import org.fhir.entity.StructureMapRuleModel;
import com.google.gson.GsonBuilder;

/**
* "A Map of relationships between 2 structures that can be used to transform data."
*/
public class StructureMapRule  extends BackboneElement  {
  /**
  * Description: "Name of the rule for internal references."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "Source inputs to the mapping."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<StructureMapSource> source = new java.util.ArrayList<>();

  /**
  * Description: "Content to create because of this mapping rule."
  */
  protected java.util.List<StructureMapTarget> target = new java.util.ArrayList<>();

  /**
  * Description: "Rules contained in this rule."
  */
  protected java.util.List<StructureMapRule> rule = new java.util.ArrayList<>();

  /**
  * Description: "Which other rules to apply in the context of this rule."
  */
  protected java.util.List<StructureMapDependent> dependent = new java.util.ArrayList<>();

  /**
  * Description: "Documentation for this instance of data."
  */
  protected String documentation;

  /**
  * Description: "Extensions for documentation"
  */
  protected transient Element _documentation;

  public StructureMapRule() {
  }

  public StructureMapRule(StructureMapRuleModel o) {
    this.id = o.getId();
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getSource() && !o.getSource().isEmpty()) {
    	this.source = StructureMapSourceHelper.fromArray2Array(o.getSource());
    }
    if (null != o.getTarget() && !o.getTarget().isEmpty()) {
    	this.target = StructureMapTargetHelper.fromArray2Array(o.getTarget());
    }
    if (null != o.getRule() && !o.getRule().isEmpty()) {
    	this.rule = StructureMapRuleHelper.fromArray2Array(o.getRule());
    }
    if (null != o.getDependent() && !o.getDependent().isEmpty()) {
    	this.dependent = StructureMapDependentHelper.fromArray2Array(o.getDependent());
    }
    if (null != o.getDocumentation()) {
      this.documentation = o.getDocumentation();
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
  public void setSource( java.util.List<StructureMapSource> value) {
    this.source = value;
  }
  public java.util.List<StructureMapSource> getSource() {
    return this.source;
  }
  public void setTarget( java.util.List<StructureMapTarget> value) {
    this.target = value;
  }
  public java.util.List<StructureMapTarget> getTarget() {
    return this.target;
  }
  public void setRule( java.util.List<StructureMapRule> value) {
    this.rule = value;
  }
  public java.util.List<StructureMapRule> getRule() {
    return this.rule;
  }
  public void setDependent( java.util.List<StructureMapDependent> value) {
    this.dependent = value;
  }
  public java.util.List<StructureMapDependent> getDependent() {
    return this.dependent;
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[StructureMapRule]:" + "\n");
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.source != null) builder.append("source" + "->" + this.source.toString() + "\n"); 
     if(this.target != null) builder.append("target" + "->" + this.target.toString() + "\n"); 
     if(this.rule != null) builder.append("rule" + "->" + this.rule.toString() + "\n"); 
     if(this.dependent != null) builder.append("dependent" + "->" + this.dependent.toString() + "\n"); 
     if(this.documentation != null) builder.append("documentation" + "->" + this.documentation.toString() + "\n"); 
     if(this._documentation != null) builder.append("_documentation" + "->" + this._documentation.toString() + "\n"); ;
    return builder.toString();
  }


}
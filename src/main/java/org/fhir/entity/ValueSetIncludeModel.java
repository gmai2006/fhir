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
package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "A value set specifies a set of codes drawn from one or more code systems."
*/
@Entity
@Table(name="valuesetinclude")
public class ValueSetIncludeModel  implements Serializable {
	private static final long serialVersionUID = 151910893737043804L;
  /**
  * Description: "An absolute URI which is the code system from which the selected codes come from."
  */
  @javax.persistence.Basic
  @Column(name="\"system\"")
  private String system;

  /**
  * Description: "The version of the code system that the codes are selected from."
  */
  @javax.persistence.Basic
  @Column(name="\"version\"")
  private String version;

  /**
  * Description: "Specifies a concept to be included or excluded."
  */
  @javax.persistence.Basic
  @Column(name="\"concept_id\"")
  private String concept_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="concept_id", insertable=false, updatable=false)
  private java.util.List<ValueSetConceptModel> concept;

  /**
  * Description: "Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true."
  */
  @javax.persistence.Basic
  @Column(name="\"filter_id\"")
  private String filter_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="filter_id", insertable=false, updatable=false)
  private java.util.List<ValueSetFilterModel> filter;

  /**
  * Description: "Selects concepts found in this value set. This is an absolute URI that is a reference to ValueSet.url."
  */
  @javax.persistence.Basic
  @Column(name="\"valueSet\"")
  private String valueSet;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public ValueSetIncludeModel() {
  }

  public ValueSetIncludeModel(ValueSetInclude o, String parentId) {
  	this.parent_id = parentId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.system = o.getSystem();
    this.version = o.getVersion();
    if (null != o.getConcept() && !o.getConcept().isEmpty()) {
    	this.concept_id = "concept" + this.parent_id;
    	this.concept = ValueSetConceptHelper.toModelFromArray(o.getConcept(), this.concept_id);
    }
    if (null != o.getFilter() && !o.getFilter().isEmpty()) {
    	this.filter_id = "filter" + this.parent_id;
    	this.filter = ValueSetFilterHelper.toModelFromArray(o.getFilter(), this.filter_id);
    }
    this.valueSet = org.fhir.utils.JsonUtils.toJson(o.getValueSet());
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getSystem() {
    return this.system;
  }
  public void setSystem( String value) {
    this.system = value;
  }
  public String getVersion() {
    return this.version;
  }
  public void setVersion( String value) {
    this.version = value;
  }
  public java.util.List<ValueSetConceptModel> getConcept() {
    return this.concept;
  }
  public void setConcept( java.util.List<ValueSetConceptModel> value) {
    this.concept = value;
  }
  public java.util.List<ValueSetFilterModel> getFilter() {
    return this.filter;
  }
  public void setFilter( java.util.List<ValueSetFilterModel> value) {
    this.filter = value;
  }
  public String getValueSet() {
    return this.valueSet;
  }
  public void setValueSet( String value) {
    this.valueSet = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ValueSetIncludeModel]:" + "\n");
     builder.append("system" + "->" + this.system + "\n"); 
     builder.append("version" + "->" + this.version + "\n"); 
     builder.append("valueSet" + "->" + this.valueSet + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ValueSetIncludeModel]:" + "\n");
     builder.append("system" + "->" + this.system + "\n"); 
     builder.append("version" + "->" + this.version + "\n"); 
     builder.append("concept" + "->" + this.concept + "\n"); 
     builder.append("filter" + "->" + this.filter + "\n"); 
     builder.append("valueSet" + "->" + this.valueSet + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}
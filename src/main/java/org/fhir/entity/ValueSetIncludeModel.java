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

/**
* "A value set specifies a set of codes drawn from one or more code systems."
*/
@Entity
@Table(name="valuesetinclude")
public class ValueSetIncludeModel  {
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
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ValueSetConceptModel> concept = new java.util.ArrayList<>();

  /**
  * Description: "Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ValueSetFilterModel> filter = new java.util.ArrayList<>();

  /**
  * Description: "Selects concepts found in this value set. This is an absolute URI that is a reference to ValueSet.url."
  * Actual type: Array of string-> List<string>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueSet\"", length = 16777215)
  private String valueSet;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
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
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public ValueSetIncludeModel() {
  }

  public ValueSetIncludeModel(ValueSetInclude o) {
    this.id = o.getId();
      this.system = o.getSystem();

      this.version = o.getVersion();

      this.concept = ValueSetConcept.toModelArray(o.getConcept());

      this.filter = ValueSetFilter.toModelArray(o.getFilter());

      this.valueSet = org.fhir.utils.JsonUtils.write2String(o.getValueSet());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setSystem( String value) {
    this.system = value;
  }
  public String getSystem() {
    return this.system;
  }
  public void setVersion( String value) {
    this.version = value;
  }
  public String getVersion() {
    return this.version;
  }
  public void setConcept( java.util.List<ValueSetConceptModel> value) {
    this.concept = value;
  }
  public java.util.List<ValueSetConceptModel> getConcept() {
    return this.concept;
  }
  public void setFilter( java.util.List<ValueSetFilterModel> value) {
    this.filter = value;
  }
  public java.util.List<ValueSetFilterModel> getFilter() {
    return this.filter;
  }
  public void setValueSet( String value) {
    this.valueSet = value;
  }
  public String getValueSet() {
    return this.valueSet;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("system" + "[" + String.valueOf(this.system) + "]\n"); 
     builder.append("version" + "[" + String.valueOf(this.version) + "]\n"); 
     builder.append("concept" + "[" + String.valueOf(this.concept) + "]\n"); 
     builder.append("filter" + "[" + String.valueOf(this.filter) + "]\n"); 
     builder.append("valueSet" + "[" + String.valueOf(this.valueSet) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
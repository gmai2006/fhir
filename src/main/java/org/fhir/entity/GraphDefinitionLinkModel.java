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
* "A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set."
*/
@Entity
@Table(name="graphdefinitionlink")
public class GraphDefinitionLinkModel  {
  /**
  * Description: "Path in the resource that contains the link."
  */
  @javax.persistence.Basic
  @Column(name="\"path\"")
  private String path;

  /**
  * Description: "Which slice (if profiled)."
  */
  @javax.persistence.Basic
  @Column(name="\"sliceName\"")
  private String sliceName;

  /**
  * Description: "Minimum occurrences for this link."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"min\"")
  private Float min;

  /**
  * Description: "Maximum occurrences for this link."
  */
  @javax.persistence.Basic
  @Column(name="\"max\"")
  private String max;

  /**
  * Description: "Information about why this link is of interest in this graph definition."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "Potential target for the link."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<GraphDefinitionTargetModel> target = new java.util.ArrayList<>();

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

  public GraphDefinitionLinkModel() {
  }

  public GraphDefinitionLinkModel(GraphDefinitionLink o) {
    this.id = o.getId();
      this.path = o.getPath();

      this.sliceName = o.getSliceName();

      this.min = o.getMin();

      this.max = o.getMax();

      this.description = o.getDescription();

      this.target = GraphDefinitionTarget.toModelArray(o.getTarget());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setPath( String value) {
    this.path = value;
  }
  public String getPath() {
    return this.path;
  }
  public void setSliceName( String value) {
    this.sliceName = value;
  }
  public String getSliceName() {
    return this.sliceName;
  }
  public void setMin( Float value) {
    this.min = value;
  }
  public Float getMin() {
    return this.min;
  }
  public void setMax( String value) {
    this.max = value;
  }
  public String getMax() {
    return this.max;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setTarget( java.util.List<GraphDefinitionTargetModel> value) {
    this.target = value;
  }
  public java.util.List<GraphDefinitionTargetModel> getTarget() {
    return this.target;
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
     builder.append("path" + "[" + String.valueOf(this.path) + "]\n"); 
     builder.append("sliceName" + "[" + String.valueOf(this.sliceName) + "]\n"); 
     builder.append("min" + "[" + String.valueOf(this.min) + "]\n"); 
     builder.append("max" + "[" + String.valueOf(this.max) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("target" + "[" + String.valueOf(this.target) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
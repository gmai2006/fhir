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
import org.fhir.entity.GraphDefinitionLinkModel;
import com.google.gson.GsonBuilder;

/**
* "A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set."
*/
public class GraphDefinitionLink  {
  /**
  * Description: "Path in the resource that contains the link."
  */
  private String path;

  /**
  * Description: "Extensions for path"
  */
  private transient Element _path;

  /**
  * Description: "Which slice (if profiled)."
  */
  private String sliceName;

  /**
  * Description: "Extensions for sliceName"
  */
  private transient Element _sliceName;

  /**
  * Description: "Minimum occurrences for this link."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float min;

  /**
  * Description: "Extensions for min"
  */
  private transient Element _min;

  /**
  * Description: "Maximum occurrences for this link."
  */
  private String max;

  /**
  * Description: "Extensions for max"
  */
  private transient Element _max;

  /**
  * Description: "Information about why this link is of interest in this graph definition."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "Potential target for the link."
  */
  @javax.validation.constraints.NotNull
  private java.util.List<GraphDefinitionTarget> target = new java.util.ArrayList<>();

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

  public GraphDefinitionLink() {
  }

  public GraphDefinitionLink(GraphDefinitionLinkModel o) {
    this.id = o.getId();
      if (null != o.getPath()) {
        this.path = new String(o.getPath());
      }

      if (null != o.getSliceName()) {
        this.sliceName = new String(o.getSliceName());
      }

      if (null != o.getMin()) {
        this.min = new Float(o.getMin());
      }

      if (null != o.getMax()) {
        this.max = new String(o.getMax());
      }

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      this.target = GraphDefinitionTarget.fromArray(o.getTarget());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setPath( String value) {
    this.path = value;
  }
  public String getPath() {
    return this.path;
  }
  public void set_path( Element value) {
    this._path = value;
  }
  public Element get_path() {
    return this._path;
  }
  public void setSliceName( String value) {
    this.sliceName = value;
  }
  public String getSliceName() {
    return this.sliceName;
  }
  public void set_sliceName( Element value) {
    this._sliceName = value;
  }
  public Element get_sliceName() {
    return this._sliceName;
  }
  public void setMin( Float value) {
    this.min = value;
  }
  public Float getMin() {
    return this.min;
  }
  public void set_min( Element value) {
    this._min = value;
  }
  public Element get_min() {
    return this._min;
  }
  public void setMax( String value) {
    this.max = value;
  }
  public String getMax() {
    return this.max;
  }
  public void set_max( Element value) {
    this._max = value;
  }
  public Element get_max() {
    return this._max;
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
  public void setTarget( java.util.List<GraphDefinitionTarget> value) {
    this.target = value;
  }
  public java.util.List<GraphDefinitionTarget> getTarget() {
    return this.target;
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
     builder.append("path" + "[" + String.valueOf(this.path) + "]\n"); 
     builder.append("_path" + "[" + String.valueOf(this._path) + "]\n"); 
     builder.append("sliceName" + "[" + String.valueOf(this.sliceName) + "]\n"); 
     builder.append("_sliceName" + "[" + String.valueOf(this._sliceName) + "]\n"); 
     builder.append("min" + "[" + String.valueOf(this.min) + "]\n"); 
     builder.append("_min" + "[" + String.valueOf(this._min) + "]\n"); 
     builder.append("max" + "[" + String.valueOf(this.max) + "]\n"); 
     builder.append("_max" + "[" + String.valueOf(this._max) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("target" + "[" + String.valueOf(this.target) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<GraphDefinitionLink> fromArray(java.util.List<GraphDefinitionLinkModel> list) {
    return (java.util.List<GraphDefinitionLink>)list.stream()
      .map(model -> new GraphDefinitionLink(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<GraphDefinitionLinkModel> toModelArray(java.util.List<GraphDefinitionLink> list) {
    return (java.util.List<GraphDefinitionLinkModel>)list.stream()
      .map(model -> new GraphDefinitionLinkModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static GraphDefinitionLink fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, GraphDefinitionLink.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(GraphDefinitionLink o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<GraphDefinitionLink> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
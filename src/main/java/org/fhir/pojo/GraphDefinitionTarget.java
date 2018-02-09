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
import org.fhir.entity.GraphDefinitionTargetModel;
import com.google.gson.GsonBuilder;

/**
* "A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set."
*/
public class GraphDefinitionTarget  {
  /**
  * Description: "Type of resource this link refers to."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String type;

  /**
  * Description: "Extensions for type"
  */
  private transient Element _type;

  /**
  * Description: "Profile for the target resource."
  */
  private String profile;

  /**
  * Description: "Extensions for profile"
  */
  private transient Element _profile;

  /**
  * Description: "Compartment Consistency Rules."
  */
  private java.util.List<GraphDefinitionCompartment> compartment = new java.util.ArrayList<>();

  /**
  * Description: "Additional links from target resource."
  */
  private java.util.List<GraphDefinitionLink> link = new java.util.ArrayList<>();

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

  public GraphDefinitionTarget() {
  }

  public GraphDefinitionTarget(GraphDefinitionTargetModel o) {
    this.id = o.getId();
      if (null != o.getType()) {
        this.type = new String(o.getType());
      }

      if (null != o.getProfile()) {
        this.profile = new String(o.getProfile());
      }

      this.compartment = GraphDefinitionCompartment.fromArray(o.getCompartment());

      this.link = GraphDefinitionLink.fromArray(o.getLink());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void set_type( Element value) {
    this._type = value;
  }
  public Element get_type() {
    return this._type;
  }
  public void setProfile( String value) {
    this.profile = value;
  }
  public String getProfile() {
    return this.profile;
  }
  public void set_profile( Element value) {
    this._profile = value;
  }
  public Element get_profile() {
    return this._profile;
  }
  public void setCompartment( java.util.List<GraphDefinitionCompartment> value) {
    this.compartment = value;
  }
  public java.util.List<GraphDefinitionCompartment> getCompartment() {
    return this.compartment;
  }
  public void setLink( java.util.List<GraphDefinitionLink> value) {
    this.link = value;
  }
  public java.util.List<GraphDefinitionLink> getLink() {
    return this.link;
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
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("_type" + "[" + String.valueOf(this._type) + "]\n"); 
     builder.append("profile" + "[" + String.valueOf(this.profile) + "]\n"); 
     builder.append("_profile" + "[" + String.valueOf(this._profile) + "]\n"); 
     builder.append("compartment" + "[" + String.valueOf(this.compartment) + "]\n"); 
     builder.append("link" + "[" + String.valueOf(this.link) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<GraphDefinitionTarget> fromArray(java.util.List<GraphDefinitionTargetModel> list) {
    return (java.util.List<GraphDefinitionTarget>)list.stream()
      .map(model -> new GraphDefinitionTarget(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<GraphDefinitionTargetModel> toModelArray(java.util.List<GraphDefinitionTarget> list) {
    return (java.util.List<GraphDefinitionTargetModel>)list.stream()
      .map(model -> new GraphDefinitionTargetModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static GraphDefinitionTarget fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, GraphDefinitionTarget.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(GraphDefinitionTarget o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<GraphDefinitionTarget> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
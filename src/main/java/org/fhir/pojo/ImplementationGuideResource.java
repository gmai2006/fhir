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
import org.fhir.entity.ImplementationGuideResourceModel;
import com.google.gson.GsonBuilder;

/**
* "A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts."
*/
public class ImplementationGuideResource  {
  /**
  * Description: "Whether a resource is included in the guide as part of the rules defined by the guide, or just as an example of a resource that conforms to the rules and/or help implementers understand the intent of the guide."
  */
  private Boolean example;

  /**
  * Description: "Extensions for example"
  */
  private transient Element _example;

  /**
  * Description: "A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name)."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "A description of the reason that a resource has been included in the implementation guide."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "A short code that may be used to identify the resource throughout the implementation guide."
  */
  private String acronym;

  /**
  * Description: "Extensions for acronym"
  */
  private transient Element _acronym;

  /**
  * Description: "Where this resource is found."
  */
  private String sourceUri;

  /**
  * Description: "Extensions for sourceUri"
  */
  private transient Element _sourceUri;

  /**
  * Description: "Where this resource is found."
  */
  private Reference sourceReference;

  /**
  * Description: "Another resource that this resource is an example for. This is mostly used for resources that are included as examples of StructureDefinitions."
  */
  private Reference exampleFor;

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

  public ImplementationGuideResource() {
  }

  public ImplementationGuideResource(ImplementationGuideResourceModel o) {
    this.id = o.getId();
      if (null != o.getExample()) {
        this.example = new Boolean(o.getExample());
      }

      if (null != o.getName()) {
        this.name = new String(o.getName());
      }

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      if (null != o.getAcronym()) {
        this.acronym = new String(o.getAcronym());
      }

      if (null != o.getSourceUri()) {
        this.sourceUri = new String(o.getSourceUri());
      }

      if (null != o.getSourceReference()) {
        this.sourceReference = new Reference(o.getSourceReference());
        this.sourceReference.setId(this.getId());
      }

      if (null != o.getExampleFor()) {
        this.exampleFor = new Reference(o.getExampleFor());
        this.exampleFor.setId(this.getId());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setExample( Boolean value) {
    this.example = value;
  }
  public Boolean getExample() {
    return this.example;
  }
  public void set_example( Element value) {
    this._example = value;
  }
  public Element get_example() {
    return this._example;
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
  public void setAcronym( String value) {
    this.acronym = value;
  }
  public String getAcronym() {
    return this.acronym;
  }
  public void set_acronym( Element value) {
    this._acronym = value;
  }
  public Element get_acronym() {
    return this._acronym;
  }
  public void setSourceUri( String value) {
    this.sourceUri = value;
  }
  public String getSourceUri() {
    return this.sourceUri;
  }
  public void set_sourceUri( Element value) {
    this._sourceUri = value;
  }
  public Element get_sourceUri() {
    return this._sourceUri;
  }
  public void setSourceReference( Reference value) {
    this.sourceReference = value;
  }
  public Reference getSourceReference() {
    return this.sourceReference;
  }
  public void setExampleFor( Reference value) {
    this.exampleFor = value;
  }
  public Reference getExampleFor() {
    return this.exampleFor;
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
     builder.append("example" + "[" + String.valueOf(this.example) + "]\n"); 
     builder.append("_example" + "[" + String.valueOf(this._example) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("acronym" + "[" + String.valueOf(this.acronym) + "]\n"); 
     builder.append("_acronym" + "[" + String.valueOf(this._acronym) + "]\n"); 
     builder.append("sourceUri" + "[" + String.valueOf(this.sourceUri) + "]\n"); 
     builder.append("_sourceUri" + "[" + String.valueOf(this._sourceUri) + "]\n"); 
     builder.append("sourceReference" + "[" + String.valueOf(this.sourceReference) + "]\n"); 
     builder.append("exampleFor" + "[" + String.valueOf(this.exampleFor) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ImplementationGuideResource> fromArray(java.util.List<ImplementationGuideResourceModel> list) {
    return (java.util.List<ImplementationGuideResource>)list.stream()
      .map(model -> new ImplementationGuideResource(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ImplementationGuideResourceModel> toModelArray(java.util.List<ImplementationGuideResource> list) {
    return (java.util.List<ImplementationGuideResourceModel>)list.stream()
      .map(model -> new ImplementationGuideResourceModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ImplementationGuideResource fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ImplementationGuideResource.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ImplementationGuideResource o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ImplementationGuideResource> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
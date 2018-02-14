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
  @javax.validation.constraints.NotNull
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
      this.example = o.getExample();
    }
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getAcronym()) {
      this.acronym = o.getAcronym();
    }
    if (null != o.getSourceUri()) {
      this.sourceUri = o.getSourceUri();
    }
    if (null != o.getSourceReference() && !o.getSourceReference().isEmpty()) {
      this.sourceReference = new Reference(o.getSourceReference().get(0));
    }
    if (null != o.getExampleFor() && !o.getExampleFor().isEmpty()) {
      this.exampleFor = new Reference(o.getExampleFor().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
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
    builder.append("[ImplementationGuideResource]:" + "\n");
     if(this.example != null) builder.append("example" + "->" + this.example.toString() + "\n"); 
     if(this._example != null) builder.append("_example" + "->" + this._example.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.acronym != null) builder.append("acronym" + "->" + this.acronym.toString() + "\n"); 
     if(this._acronym != null) builder.append("_acronym" + "->" + this._acronym.toString() + "\n"); 
     if(this.sourceUri != null) builder.append("sourceUri" + "->" + this.sourceUri.toString() + "\n"); 
     if(this._sourceUri != null) builder.append("_sourceUri" + "->" + this._sourceUri.toString() + "\n"); 
     if(this.sourceReference != null) builder.append("sourceReference" + "->" + this.sourceReference.toString() + "\n"); 
     if(this.exampleFor != null) builder.append("exampleFor" + "->" + this.exampleFor.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}
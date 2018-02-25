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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ImplementationGuideResource  extends BackboneElement  {
  /**
  * Description: "Whether a resource is included in the guide as part of the rules defined by the guide, or just as an example of a resource that conforms to the rules and/or help implementers understand the intent of the guide."
  */
  protected Boolean example;

  /**
  * Description: "Extensions for example"
  */
  protected transient Element _example;

  /**
  * Description: "A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name)."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "A description of the reason that a resource has been included in the implementation guide."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "A short code that may be used to identify the resource throughout the implementation guide."
  */
  protected String acronym;

  /**
  * Description: "Extensions for acronym"
  */
  protected transient Element _acronym;

  /**
  * Description: "Where this resource is found."
  */
  protected String sourceUri;

  /**
  * Description: "Extensions for sourceUri"
  */
  protected transient Element _sourceUri;

  /**
  * Description: "Where this resource is found."
  */
  protected Reference sourceReference;

  /**
  * Description: "Another resource that this resource is an example for. This is mostly used for resources that are included as examples of StructureDefinitions."
  */
  protected Reference exampleFor;

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
     if(this.exampleFor != null) builder.append("exampleFor" + "->" + this.exampleFor.toString() + "\n"); ;
    return builder.toString();
  }


}
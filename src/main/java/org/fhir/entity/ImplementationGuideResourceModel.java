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
* "A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts."
*/
@Entity
@Table(name="implementationguideresource")
public class ImplementationGuideResourceModel  implements Serializable {
	private static final long serialVersionUID = 151873631183128393L;
  /**
  * Description: "Whether a resource is included in the guide as part of the rules defined by the guide, or just as an example of a resource that conforms to the rules and/or help implementers understand the intent of the guide."
  */
  @javax.persistence.Basic
  @Column(name="\"example\"")
  private Boolean example;

  /**
  * Description: "A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name)."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "A description of the reason that a resource has been included in the implementation guide."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "A short code that may be used to identify the resource throughout the implementation guide."
  */
  @javax.persistence.Basic
  @Column(name="\"acronym\"")
  private String acronym;

  /**
  * Description: "Where this resource is found."
  */
  @javax.persistence.Basic
  @Column(name="\"sourceUri\"")
  private String sourceUri;

  /**
  * Description: "Where this resource is found."
  */
  @javax.persistence.Basic
  @Column(name="\"sourcereference_id\"")
  private String sourcereference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="sourcereference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> sourceReference;

  /**
  * Description: "Another resource that this resource is an example for. This is mostly used for resources that are included as examples of StructureDefinitions."
  */
  @javax.persistence.Basic
  @Column(name="\"examplefor_id\"")
  private String examplefor_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="examplefor_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> exampleFor;

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

  public ImplementationGuideResourceModel() {
  }

  public ImplementationGuideResourceModel(ImplementationGuideResource o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.example = o.getExample();
    this.name = o.getName();
    this.description = o.getDescription();
    this.acronym = o.getAcronym();
    this.sourceUri = o.getSourceUri();
    if (null != o.getSourceReference() ) {
    	this.sourcereference_id = "sourcereference" + this.parent_id;
    	this.sourceReference = ReferenceHelper.toModel(o.getSourceReference(), this.sourcereference_id);
    }
    if (null != o.getExampleFor() ) {
    	this.examplefor_id = "examplefor" + this.parent_id;
    	this.exampleFor = ReferenceHelper.toModel(o.getExampleFor(), this.examplefor_id);
    }
  }

  public Boolean getExample() {
    return this.example;
  }
  public void setExample( Boolean value) {
    this.example = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getAcronym() {
    return this.acronym;
  }
  public void setAcronym( String value) {
    this.acronym = value;
  }
  public String getSourceUri() {
    return this.sourceUri;
  }
  public void setSourceUri( String value) {
    this.sourceUri = value;
  }
  public java.util.List<ReferenceModel> getSourceReference() {
    return this.sourceReference;
  }
  public void setSourceReference( java.util.List<ReferenceModel> value) {
    this.sourceReference = value;
  }
  public java.util.List<ReferenceModel> getExampleFor() {
    return this.exampleFor;
  }
  public void setExampleFor( java.util.List<ReferenceModel> value) {
    this.exampleFor = value;
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
    builder.append("[ImplementationGuideResourceModel]:" + "\n");
     builder.append("example" + "->" + this.example + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("acronym" + "->" + this.acronym + "\n"); 
     builder.append("sourceUri" + "->" + this.sourceUri + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImplementationGuideResourceModel]:" + "\n");
     builder.append("example" + "->" + this.example + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("acronym" + "->" + this.acronym + "\n"); 
     builder.append("sourceUri" + "->" + this.sourceUri + "\n"); 
     builder.append("sourceReference" + "->" + this.sourceReference + "\n"); 
     builder.append("exampleFor" + "->" + this.exampleFor + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}
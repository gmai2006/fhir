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
* "A homogeneous material with a definite composition."
* generated on 07/14/2018
*/
@Entity
@Table(name="substance")
public class SubstanceModel  implements Serializable {
	private static final long serialVersionUID = 153159210194772978L;
  /**
  * Description: "This is a Substance resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Unique identifier for the substance."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "A code to indicate if the substance is actively used."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes."
  */
  @javax.persistence.Basic
  @Column(name="\"category_id\"")
  private String category_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="category_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> category;

  /**
  * Description: "A code (or set of codes) that identify this substance."
  */
  @javax.persistence.Basic
  @Column(name="\"code_id\"")
  private String code_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="code_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> code;

  /**
  * Description: "A description of the substance - its appearance, handling requirements, and other usage notes."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance."
  */
  @javax.persistence.Basic
  @Column(name="\"instance_id\"")
  private String instance_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="instance_id", insertable=false, updatable=false)
  private java.util.List<SubstanceInstanceModel> instance;

  /**
  * Description: "A substance can be composed of other substances."
  */
  @javax.persistence.Basic
  @Column(name="\"ingredient_id\"")
  private String ingredient_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="ingredient_id", insertable=false, updatable=false)
  private java.util.List<SubstanceIngredientModel> ingredient;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"meta_id\"")
  private String meta_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"implicitRules\"")
  private String implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"language\"")
  private String language;

  public SubstanceModel() {
  }

  public SubstanceModel(Substance o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.status = o.getStatus();
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
    	this.category_id = "category" + this.id;
    	this.category = CodeableConceptHelper.toModelFromArray(o.getCategory(), this.category_id);
    }
    if (null != o.getCode() ) {
    	this.code_id = "code" + this.id;
    	this.code = CodeableConceptHelper.toModel(o.getCode(), this.code_id);
    }
    this.description = o.getDescription();
    if (null != o.getInstance() && !o.getInstance().isEmpty()) {
    	this.instance_id = "instance" + this.id;
    	this.instance = SubstanceInstanceHelper.toModelFromArray(o.getInstance(), this.instance_id);
    }
    if (null != o.getIngredient() && !o.getIngredient().isEmpty()) {
    	this.ingredient_id = "ingredient" + this.id;
    	this.ingredient = SubstanceIngredientHelper.toModelFromArray(o.getIngredient(), this.ingredient_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getContained()) {
    	this.contained = JsonUtils.toJson(o.getContained());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getMeta() ) {
    	this.meta_id = "meta" + this.id;
    	this.meta = MetaHelper.toModel(o.getMeta(), this.meta_id);
    }
    this.implicitRules = o.getImplicitRules();
    this.language = o.getLanguage();
  }

  public String getResourceType() {
    return this.resourceType;
  }
  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public java.util.List<CodeableConceptModel> getCategory() {
    return this.category;
  }
  public void setCategory( java.util.List<CodeableConceptModel> value) {
    this.category = value;
  }
  public java.util.List<CodeableConceptModel> getCode() {
    return this.code;
  }
  public void setCode( java.util.List<CodeableConceptModel> value) {
    this.code = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public java.util.List<SubstanceInstanceModel> getInstance() {
    return this.instance;
  }
  public void setInstance( java.util.List<SubstanceInstanceModel> value) {
    this.instance = value;
  }
  public java.util.List<SubstanceIngredientModel> getIngredient() {
    return this.ingredient;
  }
  public void setIngredient( java.util.List<SubstanceIngredientModel> value) {
    this.ingredient = value;
  }
  public java.util.List<NarrativeModel> getText() {
    return this.text;
  }
  public void setText( java.util.List<NarrativeModel> value) {
    this.text = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
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
  public java.util.List<MetaModel> getMeta() {
    return this.meta;
  }
  public void setMeta( java.util.List<MetaModel> value) {
    this.meta = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage( String value) {
    this.language = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SubstanceModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SubstanceModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}
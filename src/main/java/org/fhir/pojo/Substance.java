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
import org.fhir.entity.SubstanceModel;
import com.google.gson.GsonBuilder;

/**
* "A homogeneous material with a definite composition."
*/
public class Substance  extends DomainResource  {
  /**
  * Description: "This is a Substance resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Unique identifier for the substance."
  */
  protected java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "A code to indicate if the substance is actively used."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes."
  */
  protected java.util.List<CodeableConcept> category = new java.util.ArrayList<>();

  /**
  * Description: "A code (or set of codes) that identify this substance."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept code;

  /**
  * Description: "A description of the substance - its appearance, handling requirements, and other usage notes."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance."
  */
  protected java.util.List<SubstanceInstance> instance = new java.util.ArrayList<>();

  /**
  * Description: "A substance can be composed of other substances."
  */
  protected java.util.List<SubstanceIngredient> ingredient = new java.util.ArrayList<>();

  public Substance() {
  }

  public Substance(SubstanceModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
    	this.category = CodeableConceptHelper.fromArray2Array(o.getCategory());
    }
    if (null != o.getCode() && !o.getCode().isEmpty()) {
      this.code = new CodeableConcept(o.getCode().get(0));
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getInstance() && !o.getInstance().isEmpty()) {
    	this.instance = SubstanceInstanceHelper.fromArray2Array(o.getInstance());
    }
    if (null != o.getIngredient() && !o.getIngredient().isEmpty()) {
    	this.ingredient = SubstanceIngredientHelper.fromArray2Array(o.getIngredient());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
  }
  public void setStatus( String value) {
    this.status = StatusEnum.fromCode(value);
  }
  public String getStatus() {
    return this.status;
  }
  public void set_status( Element value) {
    this._status = value;
  }
  public Element get_status() {
    return this._status;
  }
  public void setCategory( java.util.List<CodeableConcept> value) {
    this.category = value;
  }
  public java.util.List<CodeableConcept> getCategory() {
    return this.category;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
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
  public void setInstance( java.util.List<SubstanceInstance> value) {
    this.instance = value;
  }
  public java.util.List<SubstanceInstance> getInstance() {
    return this.instance;
  }
  public void setIngredient( java.util.List<SubstanceIngredient> value) {
    this.ingredient = value;
  }
  public java.util.List<SubstanceIngredient> getIngredient() {
    return this.ingredient;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Substance]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.instance != null) builder.append("instance" + "->" + this.instance.toString() + "\n"); 
     if(this.ingredient != null) builder.append("ingredient" + "->" + this.ingredient.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Substance,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Substance" : { return Substance.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	active,
  	inactive,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "active" : { return active.toString(); }
  			case "inactive" : { return inactive.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}
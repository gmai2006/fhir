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
* "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
*/
@Entity
@Table(name="patientanimal")
public class PatientAnimalModel  implements Serializable {
	private static final long serialVersionUID = 151967883177477152L;
  /**
  * Description: "Identifies the high level taxonomic categorization of the kind of animal."
  */
  @javax.persistence.Basic
  @Column(name="\"species_id\"")
  private String species_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="species_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> species;

  /**
  * Description: "Identifies the detailed categorization of the kind of animal."
  */
  @javax.persistence.Basic
  @Column(name="\"breed_id\"")
  private String breed_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="breed_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> breed;

  /**
  * Description: "Indicates the current state of the animal's reproductive organs."
  */
  @javax.persistence.Basic
  @Column(name="\"genderstatus_id\"")
  private String genderstatus_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="genderstatus_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> genderStatus;

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
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public PatientAnimalModel() {
  }

  public PatientAnimalModel(PatientAnimal o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getSpecies() ) {
    	this.species_id = "species" + this.id;
    	this.species = CodeableConceptHelper.toModel(o.getSpecies(), this.species_id);
    }
    if (null != o.getBreed() ) {
    	this.breed_id = "breed" + this.id;
    	this.breed = CodeableConceptHelper.toModel(o.getBreed(), this.breed_id);
    }
    if (null != o.getGenderStatus() ) {
    	this.genderstatus_id = "genderstatus" + this.id;
    	this.genderStatus = CodeableConceptHelper.toModel(o.getGenderStatus(), this.genderstatus_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodeableConceptModel> getSpecies() {
    return this.species;
  }
  public void setSpecies( java.util.List<CodeableConceptModel> value) {
    this.species = value;
  }
  public java.util.List<CodeableConceptModel> getBreed() {
    return this.breed;
  }
  public void setBreed( java.util.List<CodeableConceptModel> value) {
    this.breed = value;
  }
  public java.util.List<CodeableConceptModel> getGenderStatus() {
    return this.genderStatus;
  }
  public void setGenderStatus( java.util.List<CodeableConceptModel> value) {
    this.genderStatus = value;
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
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PatientAnimalModel]:" + "\n");
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PatientAnimalModel]:" + "\n");
     builder.append("species" + "->" + this.species + "\n"); 
     builder.append("breed" + "->" + this.breed + "\n"); 
     builder.append("genderStatus" + "->" + this.genderStatus + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}
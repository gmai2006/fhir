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
import org.fhir.entity.PatientAnimalModel;
import com.google.gson.GsonBuilder;

/**
* "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
*/
public class PatientAnimal  extends BackboneElement  {
  /**
  * Description: "Identifies the high level taxonomic categorization of the kind of animal."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept species;

  /**
  * Description: "Identifies the detailed categorization of the kind of animal."
  */
  protected CodeableConcept breed;

  /**
  * Description: "Indicates the current state of the animal's reproductive organs."
  */
  protected CodeableConcept genderStatus;

  public PatientAnimal() {
  }

  public PatientAnimal(PatientAnimalModel o) {
    this.id = o.getId();
    if (null != o.getSpecies() && !o.getSpecies().isEmpty()) {
      this.species = new CodeableConcept(o.getSpecies().get(0));
    }
    if (null != o.getBreed() && !o.getBreed().isEmpty()) {
      this.breed = new CodeableConcept(o.getBreed().get(0));
    }
    if (null != o.getGenderStatus() && !o.getGenderStatus().isEmpty()) {
      this.genderStatus = new CodeableConcept(o.getGenderStatus().get(0));
    }
  }

  public void setSpecies( CodeableConcept value) {
    this.species = value;
  }
  public CodeableConcept getSpecies() {
    return this.species;
  }
  public void setBreed( CodeableConcept value) {
    this.breed = value;
  }
  public CodeableConcept getBreed() {
    return this.breed;
  }
  public void setGenderStatus( CodeableConcept value) {
    this.genderStatus = value;
  }
  public CodeableConcept getGenderStatus() {
    return this.genderStatus;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PatientAnimal]:" + "\n");
     if(this.species != null) builder.append("species" + "->" + this.species.toString() + "\n"); 
     if(this.breed != null) builder.append("breed" + "->" + this.breed.toString() + "\n"); 
     if(this.genderStatus != null) builder.append("genderStatus" + "->" + this.genderStatus.toString() + "\n"); ;
    return builder.toString();
  }


}
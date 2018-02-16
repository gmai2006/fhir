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
import org.fhir.entity.MeasureGroupModel;
import com.google.gson.GsonBuilder;

/**
* "The Measure resource provides the definition of a quality measure."
*/
public class MeasureGroup  extends BackboneElement  {
  /**
  * Description: "A unique identifier for the group. This identifier will used to report data for the group in the measure report."
  */
  @javax.validation.constraints.NotNull
  protected Identifier identifier;

  /**
  * Description: "Optional name or short description of this group."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "The human readable description of this population group."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "A population criteria for the measure."
  */
  protected java.util.List<MeasurePopulation> population = new java.util.ArrayList<>();

  /**
  * Description: "The stratifier criteria for the measure report, specified as either the name of a valid CQL expression defined within a referenced library, or a valid FHIR Resource Path."
  */
  protected java.util.List<MeasureStratifier> stratifier = new java.util.ArrayList<>();

  public MeasureGroup() {
  }

  public MeasureGroup(MeasureGroupModel o) {
    this.id = o.getId();
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getPopulation() && !o.getPopulation().isEmpty()) {
    	this.population = MeasurePopulationHelper.fromArray2Array(o.getPopulation());
    }
    if (null != o.getStratifier() && !o.getStratifier().isEmpty()) {
    	this.stratifier = MeasureStratifierHelper.fromArray2Array(o.getStratifier());
    }
  }

  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
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
  public void setPopulation( java.util.List<MeasurePopulation> value) {
    this.population = value;
  }
  public java.util.List<MeasurePopulation> getPopulation() {
    return this.population;
  }
  public void setStratifier( java.util.List<MeasureStratifier> value) {
    this.stratifier = value;
  }
  public java.util.List<MeasureStratifier> getStratifier() {
    return this.stratifier;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MeasureGroup]:" + "\n");
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.population != null) builder.append("population" + "->" + this.population.toString() + "\n"); 
     if(this.stratifier != null) builder.append("stratifier" + "->" + this.stratifier.toString() + "\n"); ;
    return builder.toString();
  }


}
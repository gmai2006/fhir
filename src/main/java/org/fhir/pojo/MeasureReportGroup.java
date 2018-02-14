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
import org.fhir.entity.MeasureReportGroupModel;
import com.google.gson.GsonBuilder;

/**
* "The MeasureReport resource contains the results of evaluating a measure."
*/
public class MeasureReportGroup  {
  /**
  * Description: "The identifier of the population group as defined in the measure definition."
  */
  @javax.validation.constraints.NotNull
  private Identifier identifier;

  /**
  * Description: "The populations that make up the population group, one for each type of population appropriate for the measure."
  */
  private java.util.List<MeasureReportPopulation> population = new java.util.ArrayList<>();

  /**
  * Description: "The measure score for this population group, calculated as appropriate for the measure type and scoring method, and based on the contents of the populations defined in the group."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float measureScore;

  /**
  * Description: "Extensions for measureScore"
  */
  private transient Element _measureScore;

  /**
  * Description: "When a measure includes multiple stratifiers, there will be a stratifier group for each stratifier defined by the measure."
  */
  private java.util.List<MeasureReportStratifier> stratifier = new java.util.ArrayList<>();

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

  public MeasureReportGroup() {
  }

  public MeasureReportGroup(MeasureReportGroupModel o) {
    this.id = o.getId();
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getPopulation() && !o.getPopulation().isEmpty()) {
    	this.population = MeasureReportPopulationHelper.fromArray2Array(o.getPopulation());
    }
    if (null != o.getMeasureScore()) {
      this.measureScore = o.getMeasureScore();
    }
    if (null != o.getStratifier() && !o.getStratifier().isEmpty()) {
    	this.stratifier = MeasureReportStratifierHelper.fromArray2Array(o.getStratifier());
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setPopulation( java.util.List<MeasureReportPopulation> value) {
    this.population = value;
  }
  public java.util.List<MeasureReportPopulation> getPopulation() {
    return this.population;
  }
  public void setMeasureScore( Float value) {
    this.measureScore = value;
  }
  public Float getMeasureScore() {
    return this.measureScore;
  }
  public void set_measureScore( Element value) {
    this._measureScore = value;
  }
  public Element get_measureScore() {
    return this._measureScore;
  }
  public void setStratifier( java.util.List<MeasureReportStratifier> value) {
    this.stratifier = value;
  }
  public java.util.List<MeasureReportStratifier> getStratifier() {
    return this.stratifier;
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
    builder.append("[MeasureReportGroup]:" + "\n");
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.population != null) builder.append("population" + "->" + this.population.toString() + "\n"); 
     if(this.measureScore != null) builder.append("measureScore" + "->" + this.measureScore.toString() + "\n"); 
     if(this._measureScore != null) builder.append("_measureScore" + "->" + this._measureScore.toString() + "\n"); 
     if(this.stratifier != null) builder.append("stratifier" + "->" + this.stratifier.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}
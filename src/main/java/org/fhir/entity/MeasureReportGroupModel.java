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
/**
* "The MeasureReport resource contains the results of evaluating a measure."
*/
@Entity
@Table(name="measurereportgroup")
public class MeasureReportGroupModel  implements Serializable {
	private static final long serialVersionUID = 151857669686775527L;
  /**
  * Description: "The identifier of the population group as defined in the measure definition."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The populations that make up the population group, one for each type of population appropriate for the measure."
  */
  @javax.persistence.Basic
  @Column(name="\"population_id\"")
  private String population_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="population_id", insertable=false, updatable=false)
  private java.util.List<MeasureReportPopulationModel> population;

  /**
  * Description: "The measure score for this population group, calculated as appropriate for the measure type and scoring method, and based on the contents of the populations defined in the group."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"measureScore\"")
  private Float measureScore;

  /**
  * Description: "When a measure includes multiple stratifiers, there will be a stratifier group for each stratifier defined by the measure."
  */
  @javax.persistence.Basic
  @Column(name="\"stratifier_id\"")
  private String stratifier_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="stratifier_id", insertable=false, updatable=false)
  private java.util.List<MeasureReportStratifierModel> stratifier;

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

  public MeasureReportGroupModel() {
  }

  public MeasureReportGroupModel(MeasureReportGroup o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.identifier = IdentifierHelper.toJson(o.getIdentifier());
    if (null != o.getPopulation() && !o.getPopulation().isEmpty()) {
    	this.population_id = "population" + this.parent_id;
    	this.population = MeasureReportPopulationHelper.toModelFromArray(o.getPopulation(), this.population_id);
    }
    this.measureScore = o.getMeasureScore();
    if (null != o.getStratifier() && !o.getStratifier().isEmpty()) {
    	this.stratifier_id = "stratifier" + this.parent_id;
    	this.stratifier = MeasureReportStratifierHelper.toModelFromArray(o.getStratifier(), this.stratifier_id);
    }
  }

  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public java.util.List<MeasureReportPopulationModel> getPopulation() {
    return this.population;
  }
  public void setPopulation( java.util.List<MeasureReportPopulationModel> value) {
    this.population = value;
  }
  public Float getMeasureScore() {
    return this.measureScore;
  }
  public void setMeasureScore( Float value) {
    this.measureScore = value;
  }
  public java.util.List<MeasureReportStratifierModel> getStratifier() {
    return this.stratifier;
  }
  public void setStratifier( java.util.List<MeasureReportStratifierModel> value) {
    this.stratifier = value;
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
    builder.append("[MeasureReportGroupModel]:" + "\n");
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("measureScore" + "->" + this.measureScore + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MeasureReportGroupModel]:" + "\n");
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("population" + "->" + this.population + "\n"); 
     builder.append("measureScore" + "->" + this.measureScore + "\n"); 
     builder.append("stratifier" + "->" + this.stratifier + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}
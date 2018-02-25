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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "The MeasureReport resource contains the results of evaluating a measure."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MeasureReportGroup  extends BackboneElement  {
  /**
  * Description: "The identifier of the population group as defined in the measure definition."
  */
  @javax.validation.constraints.NotNull
  protected Identifier identifier;

  /**
  * Description: "The populations that make up the population group, one for each type of population appropriate for the measure."
  */
  protected java.util.List<MeasureReportPopulation> population;

  /**
  * Description: "The measure score for this population group, calculated as appropriate for the measure type and scoring method, and based on the contents of the populations defined in the group."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float measureScore;

  /**
  * Description: "Extensions for measureScore"
  */
  protected transient Element _measureScore;

  /**
  * Description: "When a measure includes multiple stratifiers, there will be a stratifier group for each stratifier defined by the measure."
  */
  protected java.util.List<MeasureReportStratifier> stratifier;

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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MeasureReportGroup]:" + "\n");
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.population != null) builder.append("population" + "->" + this.population.toString() + "\n"); 
     if(this.measureScore != null) builder.append("measureScore" + "->" + this.measureScore.toString() + "\n"); 
     if(this._measureScore != null) builder.append("_measureScore" + "->" + this._measureScore.toString() + "\n"); 
     if(this.stratifier != null) builder.append("stratifier" + "->" + this.stratifier.toString() + "\n"); ;
    return builder.toString();
  }


}
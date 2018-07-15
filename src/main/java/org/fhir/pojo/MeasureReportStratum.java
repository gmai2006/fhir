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
import org.fhir.entity.MeasureReportStratumModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "The MeasureReport resource contains the results of evaluating a measure."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MeasureReportStratum  extends BackboneElement  {
  /**
  * Description: "The value for this stratum, expressed as a string. When defining stratifiers on complex values, the value must be rendered such that the value for each stratum within the stratifier is unique."
  */
  protected String value;

  /**
  * Description: "Extensions for value"
  */
  protected transient Element _value;

  /**
  * Description: "The populations that make up the stratum, one for each type of population appropriate to the measure."
  */
  protected java.util.List<MeasureReportPopulation1> population;

  /**
  * Description: "The measure score for this stratum, calculated as appropriate for the measure type and scoring method, and based on only the members of this stratum."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float measureScore;

  /**
  * Description: "Extensions for measureScore"
  */
  protected transient Element _measureScore;

  public MeasureReportStratum() {
  }

  public MeasureReportStratum(MeasureReportStratumModel o) {
    this.id = o.getId();
    if (null != o.getValue()) {
      this.value = o.getValue();
    }
    if (null != o.getPopulation() && !o.getPopulation().isEmpty()) {
    	this.population = MeasureReportPopulation1Helper.fromArray2Array(o.getPopulation());
    }
    if (null != o.getMeasureScore()) {
      this.measureScore = o.getMeasureScore();
    }
  }

  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }
  public void set_value( Element value) {
    this._value = value;
  }
  public Element get_value() {
    return this._value;
  }
  public void setPopulation( java.util.List<MeasureReportPopulation1> value) {
    this.population = value;
  }
  public java.util.List<MeasureReportPopulation1> getPopulation() {
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MeasureReportStratum]:" + "\n");
     if(this.value != null) builder.append("value" + "->" + this.value.toString() + "\n"); 
     if(this._value != null) builder.append("_value" + "->" + this._value.toString() + "\n"); 
     if(this.population != null) builder.append("population" + "->" + this.population.toString() + "\n"); 
     if(this.measureScore != null) builder.append("measureScore" + "->" + this.measureScore.toString() + "\n"); 
     if(this._measureScore != null) builder.append("_measureScore" + "->" + this._measureScore.toString() + "\n"); ;
    return builder.toString();
  }


}
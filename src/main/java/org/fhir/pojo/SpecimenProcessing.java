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
import org.fhir.entity.SpecimenProcessingModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A sample to be used for analysis."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SpecimenProcessing  extends BackboneElement  {
  /**
  * Description: "Textual description of procedure."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "A coded value specifying the procedure used to process the specimen."
  */
  protected CodeableConcept procedure;

  /**
  * Description: "Material used in the processing step."
  */
  protected java.util.List<Reference> additive;

  /**
  * Description: "A record of the time or period when the specimen processing occurred.  For example the time of sample fixation or the period of time the sample was in formalin."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String timeDateTime;

  /**
  * Description: "Extensions for timeDateTime"
  */
  protected transient Element _timeDateTime;

  /**
  * Description: "A record of the time or period when the specimen processing occurred.  For example the time of sample fixation or the period of time the sample was in formalin."
  */
  protected Period timePeriod;

  public SpecimenProcessing() {
  }

  public SpecimenProcessing(SpecimenProcessingModel o) {
    this.id = o.getId();
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getProcedure() && !o.getProcedure().isEmpty()) {
      this.procedure = new CodeableConcept(o.getProcedure().get(0));
    }
    if (null != o.getAdditive() && !o.getAdditive().isEmpty()) {
    	this.additive = ReferenceHelper.fromArray2Array(o.getAdditive());
    }
    if (null != o.getTimeDateTime()) {
      this.timeDateTime = o.getTimeDateTime();
    }
    this.timePeriod = PeriodHelper.fromJson(o.getTimePeriod());
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
  public void setProcedure( CodeableConcept value) {
    this.procedure = value;
  }
  public CodeableConcept getProcedure() {
    return this.procedure;
  }
  public void setAdditive( java.util.List<Reference> value) {
    this.additive = value;
  }
  public java.util.List<Reference> getAdditive() {
    return this.additive;
  }
  public void setTimeDateTime( String value) {
    this.timeDateTime = value;
  }
  public String getTimeDateTime() {
    return this.timeDateTime;
  }
  public void set_timeDateTime( Element value) {
    this._timeDateTime = value;
  }
  public Element get_timeDateTime() {
    return this._timeDateTime;
  }
  public void setTimePeriod( Period value) {
    this.timePeriod = value;
  }
  public Period getTimePeriod() {
    return this.timePeriod;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SpecimenProcessing]:" + "\n");
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.procedure != null) builder.append("procedure" + "->" + this.procedure.toString() + "\n"); 
     if(this.additive != null) builder.append("additive" + "->" + this.additive.toString() + "\n"); 
     if(this.timeDateTime != null) builder.append("timeDateTime" + "->" + this.timeDateTime.toString() + "\n"); 
     if(this._timeDateTime != null) builder.append("_timeDateTime" + "->" + this._timeDateTime.toString() + "\n"); 
     if(this.timePeriod != null) builder.append("timePeriod" + "->" + this.timePeriod.toString() + "\n"); ;
    return builder.toString();
  }


}
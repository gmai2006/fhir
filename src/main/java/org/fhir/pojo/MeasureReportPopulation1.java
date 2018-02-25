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
import org.fhir.entity.MeasureReportPopulation1Model;
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
public class MeasureReportPopulation1  extends BackboneElement  {
  /**
  * Description: "The identifier of the population being reported, as defined by the population element of the measure."
  */
  protected Identifier identifier;

  /**
  * Description: "The type of the population."
  */
  protected CodeableConcept code;

  /**
  * Description: "The number of members of the population in this stratum."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float count;

  /**
  * Description: "Extensions for count"
  */
  protected transient Element _count;

  /**
  * Description: "This element refers to a List of patient level MeasureReport resources, one for each patient in this population in this stratum."
  */
  protected Reference patients;

  public MeasureReportPopulation1() {
  }

  public MeasureReportPopulation1(MeasureReportPopulation1Model o) {
    this.id = o.getId();
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getCode() && !o.getCode().isEmpty()) {
      this.code = new CodeableConcept(o.getCode().get(0));
    }
    if (null != o.getCount()) {
      this.count = o.getCount();
    }
    if (null != o.getPatients() && !o.getPatients().isEmpty()) {
      this.patients = new Reference(o.getPatients().get(0));
    }
  }

  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setCount( Float value) {
    this.count = value;
  }
  public Float getCount() {
    return this.count;
  }
  public void set_count( Element value) {
    this._count = value;
  }
  public Element get_count() {
    return this._count;
  }
  public void setPatients( Reference value) {
    this.patients = value;
  }
  public Reference getPatients() {
    return this.patients;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MeasureReportPopulation1]:" + "\n");
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.count != null) builder.append("count" + "->" + this.count.toString() + "\n"); 
     if(this._count != null) builder.append("_count" + "->" + this._count.toString() + "\n"); 
     if(this.patients != null) builder.append("patients" + "->" + this.patients.toString() + "\n"); ;
    return builder.toString();
  }


}
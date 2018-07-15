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
import org.fhir.entity.ImmunizationVaccinationProtocolModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ImmunizationVaccinationProtocol  extends BackboneElement  {
  /**
  * Description: "Nominal position in a series."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float doseSequence;

  /**
  * Description: "Extensions for doseSequence"
  */
  protected transient Element _doseSequence;

  /**
  * Description: "Contains the description about the protocol under which the vaccine was administered."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "Indicates the authority who published the protocol.  E.g. ACIP."
  */
  protected Reference authority;

  /**
  * Description: "One possible path to achieve presumed immunity against a disease - within the context of an authority."
  */
  protected String series;

  /**
  * Description: "Extensions for series"
  */
  protected transient Element _series;

  /**
  * Description: "The recommended number of doses to achieve immunity."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float seriesDoses;

  /**
  * Description: "Extensions for seriesDoses"
  */
  protected transient Element _seriesDoses;

  /**
  * Description: "The targeted disease."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<CodeableConcept> targetDisease;

  /**
  * Description: "Indicates if the immunization event should \"count\" against  the protocol."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept doseStatus;

  /**
  * Description: "Provides an explanation as to why an immunization event should or should not count against the protocol."
  */
  protected CodeableConcept doseStatusReason;

  public ImmunizationVaccinationProtocol() {
  }

  public ImmunizationVaccinationProtocol(ImmunizationVaccinationProtocolModel o) {
    this.id = o.getId();
    if (null != o.getDoseSequence()) {
      this.doseSequence = o.getDoseSequence();
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getAuthority() && !o.getAuthority().isEmpty()) {
      this.authority = new Reference(o.getAuthority().get(0));
    }
    if (null != o.getSeries()) {
      this.series = o.getSeries();
    }
    if (null != o.getSeriesDoses()) {
      this.seriesDoses = o.getSeriesDoses();
    }
    if (null != o.getTargetDisease() && !o.getTargetDisease().isEmpty()) {
    	this.targetDisease = CodeableConceptHelper.fromArray2Array(o.getTargetDisease());
    }
    if (null != o.getDoseStatus() && !o.getDoseStatus().isEmpty()) {
      this.doseStatus = new CodeableConcept(o.getDoseStatus().get(0));
    }
    if (null != o.getDoseStatusReason() && !o.getDoseStatusReason().isEmpty()) {
      this.doseStatusReason = new CodeableConcept(o.getDoseStatusReason().get(0));
    }
  }

  public void setDoseSequence( Float value) {
    this.doseSequence = value;
  }
  public Float getDoseSequence() {
    return this.doseSequence;
  }
  public void set_doseSequence( Element value) {
    this._doseSequence = value;
  }
  public Element get_doseSequence() {
    return this._doseSequence;
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
  public void setAuthority( Reference value) {
    this.authority = value;
  }
  public Reference getAuthority() {
    return this.authority;
  }
  public void setSeries( String value) {
    this.series = value;
  }
  public String getSeries() {
    return this.series;
  }
  public void set_series( Element value) {
    this._series = value;
  }
  public Element get_series() {
    return this._series;
  }
  public void setSeriesDoses( Float value) {
    this.seriesDoses = value;
  }
  public Float getSeriesDoses() {
    return this.seriesDoses;
  }
  public void set_seriesDoses( Element value) {
    this._seriesDoses = value;
  }
  public Element get_seriesDoses() {
    return this._seriesDoses;
  }
  public void setTargetDisease( java.util.List<CodeableConcept> value) {
    this.targetDisease = value;
  }
  public java.util.List<CodeableConcept> getTargetDisease() {
    return this.targetDisease;
  }
  public void setDoseStatus( CodeableConcept value) {
    this.doseStatus = value;
  }
  public CodeableConcept getDoseStatus() {
    return this.doseStatus;
  }
  public void setDoseStatusReason( CodeableConcept value) {
    this.doseStatusReason = value;
  }
  public CodeableConcept getDoseStatusReason() {
    return this.doseStatusReason;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImmunizationVaccinationProtocol]:" + "\n");
     if(this.doseSequence != null) builder.append("doseSequence" + "->" + this.doseSequence.toString() + "\n"); 
     if(this._doseSequence != null) builder.append("_doseSequence" + "->" + this._doseSequence.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.authority != null) builder.append("authority" + "->" + this.authority.toString() + "\n"); 
     if(this.series != null) builder.append("series" + "->" + this.series.toString() + "\n"); 
     if(this._series != null) builder.append("_series" + "->" + this._series.toString() + "\n"); 
     if(this.seriesDoses != null) builder.append("seriesDoses" + "->" + this.seriesDoses.toString() + "\n"); 
     if(this._seriesDoses != null) builder.append("_seriesDoses" + "->" + this._seriesDoses.toString() + "\n"); 
     if(this.targetDisease != null) builder.append("targetDisease" + "->" + this.targetDisease.toString() + "\n"); 
     if(this.doseStatus != null) builder.append("doseStatus" + "->" + this.doseStatus.toString() + "\n"); 
     if(this.doseStatusReason != null) builder.append("doseStatusReason" + "->" + this.doseStatusReason.toString() + "\n"); ;
    return builder.toString();
  }


}
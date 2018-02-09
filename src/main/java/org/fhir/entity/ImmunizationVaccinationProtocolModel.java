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

/**
* "Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed."
*/
@Entity
@Table(name="immunizationvaccinationprotocol")
public class ImmunizationVaccinationProtocolModel  {
  /**
  * Description: "Nominal position in a series."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"doseSequence\"")
  private Float doseSequence;

  /**
  * Description: "Contains the description about the protocol under which the vaccine was administered."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "Indicates the authority who published the protocol.  E.g. ACIP."
  */
  @javax.persistence.Basic
  @Column(name="\"authority_id\"")
  private String authority_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`authority_id`", insertable=false, updatable=false)
  private ReferenceModel authority;

  /**
  * Description: "One possible path to achieve presumed immunity against a disease - within the context of an authority."
  */
  @javax.persistence.Basic
  @Column(name="\"series\"")
  private String series;

  /**
  * Description: "The recommended number of doses to achieve immunity."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"seriesDoses\"")
  private Float seriesDoses;

  /**
  * Description: "The targeted disease."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"targetDisease\"", length = 16777215)
  private String targetDisease;

  /**
  * Description: "Indicates if the immunization event should \"count\" against  the protocol."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"doseStatus\"", length = 16777215)
  private String doseStatus;

  /**
  * Description: "Provides an explanation as to why an immunization event should or should not count against the protocol."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"doseStatusReason\"", length = 16777215)
  private String doseStatusReason;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
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
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public ImmunizationVaccinationProtocolModel() {
  }

  public ImmunizationVaccinationProtocolModel(ImmunizationVaccinationProtocol o) {
    this.id = o.getId();
      this.doseSequence = o.getDoseSequence();

      this.description = o.getDescription();

      if (null != o.getAuthority()) {
      	this.authority_id = "authority" + this.getId();
        this.authority = new ReferenceModel(o.getAuthority());
        this.authority.setId(this.authority_id);
        this.authority.parent_id = this.authority.getId();
      }

      this.series = o.getSeries();

      this.seriesDoses = o.getSeriesDoses();

      this.targetDisease = CodeableConcept.toJson(o.getTargetDisease());
      this.doseStatus = CodeableConcept.toJson(o.getDoseStatus());
      this.doseStatusReason = CodeableConcept.toJson(o.getDoseStatusReason());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setDoseSequence( Float value) {
    this.doseSequence = value;
  }
  public Float getDoseSequence() {
    return this.doseSequence;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setAuthority( ReferenceModel value) {
    this.authority = value;
  }
  public ReferenceModel getAuthority() {
    return this.authority;
  }
  public void setSeries( String value) {
    this.series = value;
  }
  public String getSeries() {
    return this.series;
  }
  public void setSeriesDoses( Float value) {
    this.seriesDoses = value;
  }
  public Float getSeriesDoses() {
    return this.seriesDoses;
  }
  public void setTargetDisease( String value) {
    this.targetDisease = value;
  }
  public String getTargetDisease() {
    return this.targetDisease;
  }
  public void setDoseStatus( String value) {
    this.doseStatus = value;
  }
  public String getDoseStatus() {
    return this.doseStatus;
  }
  public void setDoseStatusReason( String value) {
    this.doseStatusReason = value;
  }
  public String getDoseStatusReason() {
    return this.doseStatusReason;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("doseSequence" + "[" + String.valueOf(this.doseSequence) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("authority" + "[" + String.valueOf(this.authority) + "]\n"); 
     builder.append("series" + "[" + String.valueOf(this.series) + "]\n"); 
     builder.append("seriesDoses" + "[" + String.valueOf(this.seriesDoses) + "]\n"); 
     builder.append("targetDisease" + "[" + String.valueOf(this.targetDisease) + "]\n"); 
     builder.append("doseStatus" + "[" + String.valueOf(this.doseStatus) + "]\n"); 
     builder.append("doseStatusReason" + "[" + String.valueOf(this.doseStatusReason) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
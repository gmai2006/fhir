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
import org.fhir.utils.JsonUtils;
/**
* "Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed."
*/
@Entity
@Table(name="immunizationvaccinationprotocol")
public class ImmunizationVaccinationProtocolModel  implements Serializable {
	private static final long serialVersionUID = 151910893690756654L;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="authority_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> authority;

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
  */
  @javax.persistence.Basic
  @Column(name="\"targetdisease_id\"")
  private String targetdisease_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="targetdisease_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> targetDisease;

  /**
  * Description: "Indicates if the immunization event should \"count\" against  the protocol."
  */
  @javax.persistence.Basic
  @Column(name="\"dosestatus_id\"")
  private String dosestatus_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="dosestatus_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> doseStatus;

  /**
  * Description: "Provides an explanation as to why an immunization event should or should not count against the protocol."
  */
  @javax.persistence.Basic
  @Column(name="\"dosestatusreason_id\"")
  private String dosestatusreason_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="dosestatusreason_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> doseStatusReason;

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

  public ImmunizationVaccinationProtocolModel() {
  }

  public ImmunizationVaccinationProtocolModel(ImmunizationVaccinationProtocol o, String parentId) {
  	this.parent_id = parentId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.doseSequence = o.getDoseSequence();
    this.description = o.getDescription();
    if (null != o.getAuthority() ) {
    	this.authority_id = "authority" + this.parent_id;
    	this.authority = ReferenceHelper.toModel(o.getAuthority(), this.authority_id);
    }
    this.series = o.getSeries();
    this.seriesDoses = o.getSeriesDoses();
    if (null != o.getTargetDisease() && !o.getTargetDisease().isEmpty()) {
    	this.targetdisease_id = "targetdisease" + this.parent_id;
    	this.targetDisease = CodeableConceptHelper.toModelFromArray(o.getTargetDisease(), this.targetdisease_id);
    }
    if (null != o.getDoseStatus() ) {
    	this.dosestatus_id = "dosestatus" + this.parent_id;
    	this.doseStatus = CodeableConceptHelper.toModel(o.getDoseStatus(), this.dosestatus_id);
    }
    if (null != o.getDoseStatusReason() ) {
    	this.dosestatusreason_id = "dosestatusreason" + this.parent_id;
    	this.doseStatusReason = CodeableConceptHelper.toModel(o.getDoseStatusReason(), this.dosestatusreason_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public Float getDoseSequence() {
    return this.doseSequence;
  }
  public void setDoseSequence( Float value) {
    this.doseSequence = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public java.util.List<ReferenceModel> getAuthority() {
    return this.authority;
  }
  public void setAuthority( java.util.List<ReferenceModel> value) {
    this.authority = value;
  }
  public String getSeries() {
    return this.series;
  }
  public void setSeries( String value) {
    this.series = value;
  }
  public Float getSeriesDoses() {
    return this.seriesDoses;
  }
  public void setSeriesDoses( Float value) {
    this.seriesDoses = value;
  }
  public java.util.List<CodeableConceptModel> getTargetDisease() {
    return this.targetDisease;
  }
  public void setTargetDisease( java.util.List<CodeableConceptModel> value) {
    this.targetDisease = value;
  }
  public java.util.List<CodeableConceptModel> getDoseStatus() {
    return this.doseStatus;
  }
  public void setDoseStatus( java.util.List<CodeableConceptModel> value) {
    this.doseStatus = value;
  }
  public java.util.List<CodeableConceptModel> getDoseStatusReason() {
    return this.doseStatusReason;
  }
  public void setDoseStatusReason( java.util.List<CodeableConceptModel> value) {
    this.doseStatusReason = value;
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
    builder.append("[ImmunizationVaccinationProtocolModel]:" + "\n");
     builder.append("doseSequence" + "->" + this.doseSequence + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("series" + "->" + this.series + "\n"); 
     builder.append("seriesDoses" + "->" + this.seriesDoses + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImmunizationVaccinationProtocolModel]:" + "\n");
     builder.append("doseSequence" + "->" + this.doseSequence + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("authority" + "->" + this.authority + "\n"); 
     builder.append("series" + "->" + this.series + "\n"); 
     builder.append("seriesDoses" + "->" + this.seriesDoses + "\n"); 
     builder.append("targetDisease" + "->" + this.targetDisease + "\n"); 
     builder.append("doseStatus" + "->" + this.doseStatus + "\n"); 
     builder.append("doseStatusReason" + "->" + this.doseStatusReason + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}
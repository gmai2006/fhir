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
* "Indicates how the medication is/was taken or should be taken by the patient."
*/
@Entity
@Table(name="dosage")
public class DosageModel  implements Serializable {
	private static final long serialVersionUID = 151857669717374320L;
  /**
  * Description: "Indicates the order in which the dosage instructions should be applied or interpreted."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"sequence\"")
  private Float sequence;

  /**
  * Description: "Free text dosage instructions e.g. SIG."
  */
  @javax.persistence.Basic
  @Column(name="\"text\"")
  private String text;

  /**
  * Description: "Supplemental instruction - e.g. \"with meals\"."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"additionalInstruction\"", length = 16777215)
  private String additionalInstruction;

  /**
  * Description: "Instructions in terms that are understood by the patient or consumer."
  */
  @javax.persistence.Basic
  @Column(name="\"patientInstruction\"")
  private String patientInstruction;

  /**
  * Description: "When medication should be administered."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"timing\"", length = 16777215)
  private String timing;

  /**
  * Description: "Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept)."
  */
  @javax.persistence.Basic
  @Column(name="\"asNeededBoolean\"")
  private Boolean asNeededBoolean;

  /**
  * Description: "Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept)."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"asNeededCodeableConcept\"", length = 16777215)
  private String asNeededCodeableConcept;

  /**
  * Description: "Body site to administer to."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"site\"", length = 16777215)
  private String site;

  /**
  * Description: "How drug should enter body."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"route\"", length = 16777215)
  private String route;

  /**
  * Description: "Technique for administering medication."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"method\"", length = 16777215)
  private String method;

  /**
  * Description: "Amount of medication per dose."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"doseRange\"", length = 16777215)
  private String doseRange;

  /**
  * Description: "Amount of medication per dose."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"doseSimpleQuantity\"", length = 16777215)
  private String doseSimpleQuantity;

  /**
  * Description: "Upper limit on medication per unit of time."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"maxDosePerPeriod\"", length = 16777215)
  private String maxDosePerPeriod;

  /**
  * Description: "Upper limit on medication per administration."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"maxDosePerAdministration\"", length = 16777215)
  private String maxDosePerAdministration;

  /**
  * Description: "Upper limit on medication per lifetime of the patient."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"maxDosePerLifetime\"", length = 16777215)
  private String maxDosePerLifetime;

  /**
  * Description: "Amount of medication per unit of time."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"rateRatio\"", length = 16777215)
  private String rateRatio;

  /**
  * Description: "Amount of medication per unit of time."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"rateRange\"", length = 16777215)
  private String rateRange;

  /**
  * Description: "Amount of medication per unit of time."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"rateSimpleQuantity\"", length = 16777215)
  private String rateSimpleQuantity;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
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

  public DosageModel() {
  }

  public DosageModel(Dosage o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.sequence = o.getSequence();
    this.text = o.getText();
    this.patientInstruction = o.getPatientInstruction();
    this.timing = TimingHelper.toJson(o.getTiming());
    this.asNeededBoolean = o.getAsNeededBoolean();
    this.asNeededCodeableConcept = CodeableConceptHelper.toJson(o.getAsNeededCodeableConcept());
    this.site = CodeableConceptHelper.toJson(o.getSite());
    this.route = CodeableConceptHelper.toJson(o.getRoute());
    this.method = CodeableConceptHelper.toJson(o.getMethod());
    this.doseRange = RangeHelper.toJson(o.getDoseRange());
    this.doseSimpleQuantity = QuantityHelper.toJson(o.getDoseSimpleQuantity());
    this.maxDosePerPeriod = RatioHelper.toJson(o.getMaxDosePerPeriod());
    this.maxDosePerAdministration = QuantityHelper.toJson(o.getMaxDosePerAdministration());
    this.maxDosePerLifetime = QuantityHelper.toJson(o.getMaxDosePerLifetime());
    this.rateRatio = RatioHelper.toJson(o.getRateRatio());
    this.rateRange = RangeHelper.toJson(o.getRateRange());
    this.rateSimpleQuantity = QuantityHelper.toJson(o.getRateSimpleQuantity());
  }

  public Float getSequence() {
    return this.sequence;
  }
  public void setSequence( Float value) {
    this.sequence = value;
  }
  public String getText() {
    return this.text;
  }
  public void setText( String value) {
    this.text = value;
  }
  public String getAdditionalInstruction() {
    return this.additionalInstruction;
  }
  public void setAdditionalInstruction( String value) {
    this.additionalInstruction = value;
  }
  public String getPatientInstruction() {
    return this.patientInstruction;
  }
  public void setPatientInstruction( String value) {
    this.patientInstruction = value;
  }
  public String getTiming() {
    return this.timing;
  }
  public void setTiming( String value) {
    this.timing = value;
  }
  public Boolean getAsNeededBoolean() {
    return this.asNeededBoolean;
  }
  public void setAsNeededBoolean( Boolean value) {
    this.asNeededBoolean = value;
  }
  public String getAsNeededCodeableConcept() {
    return this.asNeededCodeableConcept;
  }
  public void setAsNeededCodeableConcept( String value) {
    this.asNeededCodeableConcept = value;
  }
  public String getSite() {
    return this.site;
  }
  public void setSite( String value) {
    this.site = value;
  }
  public String getRoute() {
    return this.route;
  }
  public void setRoute( String value) {
    this.route = value;
  }
  public String getMethod() {
    return this.method;
  }
  public void setMethod( String value) {
    this.method = value;
  }
  public String getDoseRange() {
    return this.doseRange;
  }
  public void setDoseRange( String value) {
    this.doseRange = value;
  }
  public String getDoseSimpleQuantity() {
    return this.doseSimpleQuantity;
  }
  public void setDoseSimpleQuantity( String value) {
    this.doseSimpleQuantity = value;
  }
  public String getMaxDosePerPeriod() {
    return this.maxDosePerPeriod;
  }
  public void setMaxDosePerPeriod( String value) {
    this.maxDosePerPeriod = value;
  }
  public String getMaxDosePerAdministration() {
    return this.maxDosePerAdministration;
  }
  public void setMaxDosePerAdministration( String value) {
    this.maxDosePerAdministration = value;
  }
  public String getMaxDosePerLifetime() {
    return this.maxDosePerLifetime;
  }
  public void setMaxDosePerLifetime( String value) {
    this.maxDosePerLifetime = value;
  }
  public String getRateRatio() {
    return this.rateRatio;
  }
  public void setRateRatio( String value) {
    this.rateRatio = value;
  }
  public String getRateRange() {
    return this.rateRange;
  }
  public void setRateRange( String value) {
    this.rateRange = value;
  }
  public String getRateSimpleQuantity() {
    return this.rateSimpleQuantity;
  }
  public void setRateSimpleQuantity( String value) {
    this.rateSimpleQuantity = value;
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
    builder.append("[DosageModel]:" + "\n");
     builder.append("sequence" + "->" + this.sequence + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("additionalInstruction" + "->" + this.additionalInstruction + "\n"); 
     builder.append("patientInstruction" + "->" + this.patientInstruction + "\n"); 
     builder.append("timing" + "->" + this.timing + "\n"); 
     builder.append("asNeededBoolean" + "->" + this.asNeededBoolean + "\n"); 
     builder.append("asNeededCodeableConcept" + "->" + this.asNeededCodeableConcept + "\n"); 
     builder.append("site" + "->" + this.site + "\n"); 
     builder.append("route" + "->" + this.route + "\n"); 
     builder.append("method" + "->" + this.method + "\n"); 
     builder.append("doseRange" + "->" + this.doseRange + "\n"); 
     builder.append("doseSimpleQuantity" + "->" + this.doseSimpleQuantity + "\n"); 
     builder.append("maxDosePerPeriod" + "->" + this.maxDosePerPeriod + "\n"); 
     builder.append("maxDosePerAdministration" + "->" + this.maxDosePerAdministration + "\n"); 
     builder.append("maxDosePerLifetime" + "->" + this.maxDosePerLifetime + "\n"); 
     builder.append("rateRatio" + "->" + this.rateRatio + "\n"); 
     builder.append("rateRange" + "->" + this.rateRange + "\n"); 
     builder.append("rateSimpleQuantity" + "->" + this.rateSimpleQuantity + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DosageModel]:" + "\n");
     builder.append("sequence" + "->" + this.sequence + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("additionalInstruction" + "->" + this.additionalInstruction + "\n"); 
     builder.append("patientInstruction" + "->" + this.patientInstruction + "\n"); 
     builder.append("timing" + "->" + this.timing + "\n"); 
     builder.append("asNeededBoolean" + "->" + this.asNeededBoolean + "\n"); 
     builder.append("asNeededCodeableConcept" + "->" + this.asNeededCodeableConcept + "\n"); 
     builder.append("site" + "->" + this.site + "\n"); 
     builder.append("route" + "->" + this.route + "\n"); 
     builder.append("method" + "->" + this.method + "\n"); 
     builder.append("doseRange" + "->" + this.doseRange + "\n"); 
     builder.append("doseSimpleQuantity" + "->" + this.doseSimpleQuantity + "\n"); 
     builder.append("maxDosePerPeriod" + "->" + this.maxDosePerPeriod + "\n"); 
     builder.append("maxDosePerAdministration" + "->" + this.maxDosePerAdministration + "\n"); 
     builder.append("maxDosePerLifetime" + "->" + this.maxDosePerLifetime + "\n"); 
     builder.append("rateRatio" + "->" + this.rateRatio + "\n"); 
     builder.append("rateRange" + "->" + this.rateRange + "\n"); 
     builder.append("rateSimpleQuantity" + "->" + this.rateSimpleQuantity + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}
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
* "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner."
*/
@Entity
@Table(name="medicationadministrationdosage")
public class MedicationAdministrationDosageModel  implements Serializable {
	private static final long serialVersionUID = 15185766968168102L;
  /**
  * Description: "Free text dosage can be used for cases where the dosage administered is too complex to code. When coded dosage is present, the free text dosage may still be present for display to humans.\r\rThe dosage instructions should reflect the dosage of the medication that was administered."
  */
  @javax.persistence.Basic
  @Column(name="\"text\"")
  private String text;

  /**
  * Description: "A coded specification of the anatomic site where the medication first entered the body.  For example, \"left arm\"."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"site\"", length = 16777215)
  private String site;

  /**
  * Description: "A code specifying the route or physiological path of administration of a therapeutic agent into or onto the patient.  For example, topical, intravenous, etc."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"route\"", length = 16777215)
  private String route;

  /**
  * Description: "A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"method\"", length = 16777215)
  private String method;

  /**
  * Description: "The amount of the medication given at one administration event.   Use this value when the administration is essentially an instantaneous event such as a swallowing a tablet or giving an injection."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"dose\"", length = 16777215)
  private String dose;

  /**
  * Description: "Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"rateRatio\"", length = 16777215)
  private String rateRatio;

  /**
  * Description: "Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"rateSimpleQuantity\"", length = 16777215)
  private String rateSimpleQuantity;

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

  public MedicationAdministrationDosageModel() {
  }

  public MedicationAdministrationDosageModel(MedicationAdministrationDosage o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.text = o.getText();
    this.site = CodeableConceptHelper.toJson(o.getSite());
    this.route = CodeableConceptHelper.toJson(o.getRoute());
    this.method = CodeableConceptHelper.toJson(o.getMethod());
    this.dose = QuantityHelper.toJson(o.getDose());
    this.rateRatio = RatioHelper.toJson(o.getRateRatio());
    this.rateSimpleQuantity = QuantityHelper.toJson(o.getRateSimpleQuantity());
  }

  public String getText() {
    return this.text;
  }
  public void setText( String value) {
    this.text = value;
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
  public String getDose() {
    return this.dose;
  }
  public void setDose( String value) {
    this.dose = value;
  }
  public String getRateRatio() {
    return this.rateRatio;
  }
  public void setRateRatio( String value) {
    this.rateRatio = value;
  }
  public String getRateSimpleQuantity() {
    return this.rateSimpleQuantity;
  }
  public void setRateSimpleQuantity( String value) {
    this.rateSimpleQuantity = value;
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
    builder.append("[MedicationAdministrationDosageModel]:" + "\n");
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("site" + "->" + this.site + "\n"); 
     builder.append("route" + "->" + this.route + "\n"); 
     builder.append("method" + "->" + this.method + "\n"); 
     builder.append("dose" + "->" + this.dose + "\n"); 
     builder.append("rateRatio" + "->" + this.rateRatio + "\n"); 
     builder.append("rateSimpleQuantity" + "->" + this.rateSimpleQuantity + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MedicationAdministrationDosageModel]:" + "\n");
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("site" + "->" + this.site + "\n"); 
     builder.append("route" + "->" + this.route + "\n"); 
     builder.append("method" + "->" + this.method + "\n"); 
     builder.append("dose" + "->" + this.dose + "\n"); 
     builder.append("rateRatio" + "->" + this.rateRatio + "\n"); 
     builder.append("rateSimpleQuantity" + "->" + this.rateSimpleQuantity + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}
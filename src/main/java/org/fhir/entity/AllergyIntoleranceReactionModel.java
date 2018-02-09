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
* "Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance."
*/
@Entity
@Table(name="allergyintolerancereaction")
public class AllergyIntoleranceReactionModel  {
  /**
  * Description: "Identification of the specific substance (or pharmaceutical product) considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different from the substance identified as the cause of the risk, but it must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite product that includes the identified substance. It must be clinically safe to only process the 'code' and ignore the 'reaction.substance'."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"substance\"", length = 16777215)
  private String substance;

  /**
  * Description: "Clinical symptoms and/or signs that are observed or associated with the adverse reaction event."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"manifestation\"", length = 16777215)
  private String manifestation;

  /**
  * Description: "Text description about the reaction as a whole, including details of the manifestation if required."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "Record of the date and/or time of the onset of the Reaction."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"onset\"")
  private String onset;

  /**
  * Description: "Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations."
  */
  @javax.persistence.Basic
  @Column(name="\"severity\"")
  private String severity;

  /**
  * Description: "Identification of the route by which the subject was exposed to the substance."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"exposureRoute\"", length = 16777215)
  private String exposureRoute;

  /**
  * Description: "Additional text about the adverse reaction event not captured in other fields."
  * Actual type: Array of Annotation-> List<Annotation>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

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

  public AllergyIntoleranceReactionModel() {
  }

  public AllergyIntoleranceReactionModel(AllergyIntoleranceReaction o) {
    this.id = o.getId();
      this.substance = CodeableConcept.toJson(o.getSubstance());
      this.manifestation = CodeableConcept.toJson(o.getManifestation());
      this.description = o.getDescription();

      this.onset = o.getOnset();

      this.severity = o.getSeverity();

      this.exposureRoute = CodeableConcept.toJson(o.getExposureRoute());
      this.note = Annotation.toJson(o.getNote());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setSubstance( String value) {
    this.substance = value;
  }
  public String getSubstance() {
    return this.substance;
  }
  public void setManifestation( String value) {
    this.manifestation = value;
  }
  public String getManifestation() {
    return this.manifestation;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setOnset( String value) {
    this.onset = value;
  }
  public String getOnset() {
    return this.onset;
  }
  public void setSeverity( String value) {
    this.severity = value;
  }
  public String getSeverity() {
    return this.severity;
  }
  public void setExposureRoute( String value) {
    this.exposureRoute = value;
  }
  public String getExposureRoute() {
    return this.exposureRoute;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public String getNote() {
    return this.note;
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
     builder.append("substance" + "[" + String.valueOf(this.substance) + "]\n"); 
     builder.append("manifestation" + "[" + String.valueOf(this.manifestation) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("onset" + "[" + String.valueOf(this.onset) + "]\n"); 
     builder.append("severity" + "[" + String.valueOf(this.severity) + "]\n"); 
     builder.append("exposureRoute" + "[" + String.valueOf(this.exposureRoute) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
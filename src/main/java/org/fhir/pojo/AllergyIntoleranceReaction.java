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
import org.fhir.entity.AllergyIntoleranceReactionModel;
import com.google.gson.GsonBuilder;

/**
* "Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance."
*/
public class AllergyIntoleranceReaction  {
  /**
  * Description: "Identification of the specific substance (or pharmaceutical product) considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different from the substance identified as the cause of the risk, but it must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite product that includes the identified substance. It must be clinically safe to only process the 'code' and ignore the 'reaction.substance'."
  */
  private CodeableConcept substance;

  /**
  * Description: "Clinical symptoms and/or signs that are observed or associated with the adverse reaction event."
  */
  @javax.validation.constraints.NotNull
  private java.util.List<CodeableConcept> manifestation = new java.util.ArrayList<>();

  /**
  * Description: "Text description about the reaction as a whole, including details of the manifestation if required."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "Record of the date and/or time of the onset of the Reaction."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String onset;

  /**
  * Description: "Extensions for onset"
  */
  private transient Element _onset;

  /**
  * Description: "Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations."
  */
  private String severity;

  /**
  * Description: "Extensions for severity"
  */
  private transient Element _severity;

  /**
  * Description: "Identification of the route by which the subject was exposed to the substance."
  */
  private CodeableConcept exposureRoute;

  /**
  * Description: "Additional text about the adverse reaction event not captured in other fields."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public AllergyIntoleranceReaction() {
  }

  public AllergyIntoleranceReaction(AllergyIntoleranceReactionModel o) {
    this.id = o.getId();
      this.substance = CodeableConcept.fromJson(o.getSubstance());
      this.manifestation = CodeableConcept.fromArray(o.getManifestation());
      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      if (null != o.getOnset()) {
        this.onset = new String(o.getOnset());
      }

      if (null != o.getSeverity()) {
        this.severity = new String(o.getSeverity());
      }

      this.exposureRoute = CodeableConcept.fromJson(o.getExposureRoute());
      this.note = Annotation.fromArray(o.getNote());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setSubstance( CodeableConcept value) {
    this.substance = value;
  }
  public CodeableConcept getSubstance() {
    return this.substance;
  }
  public void setManifestation( java.util.List<CodeableConcept> value) {
    this.manifestation = value;
  }
  public java.util.List<CodeableConcept> getManifestation() {
    return this.manifestation;
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
  public void setOnset( String value) {
    this.onset = value;
  }
  public String getOnset() {
    return this.onset;
  }
  public void set_onset( Element value) {
    this._onset = value;
  }
  public Element get_onset() {
    return this._onset;
  }
  public void setSeverity( String value) {
    this.severity = SeverityEnum.fromCode(value);
  }
  public String getSeverity() {
    return this.severity;
  }
  public void set_severity( Element value) {
    this._severity = value;
  }
  public Element get_severity() {
    return this._severity;
  }
  public void setExposureRoute( CodeableConcept value) {
    this.exposureRoute = value;
  }
  public CodeableConcept getExposureRoute() {
    return this.exposureRoute;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("substance" + "[" + String.valueOf(this.substance) + "]\n"); 
     builder.append("manifestation" + "[" + String.valueOf(this.manifestation) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("onset" + "[" + String.valueOf(this.onset) + "]\n"); 
     builder.append("_onset" + "[" + String.valueOf(this._onset) + "]\n"); 
     builder.append("severity" + "[" + String.valueOf(this.severity) + "]\n"); 
     builder.append("_severity" + "[" + String.valueOf(this._severity) + "]\n"); 
     builder.append("exposureRoute" + "[" + String.valueOf(this.exposureRoute) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum SeverityEnum {
  	mild,
  	moderate,
  	severe,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "mild" : { return mild.toString(); }
  			case "moderate" : { return moderate.toString(); }
  			case "severe" : { return severe.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<AllergyIntoleranceReaction> fromArray(java.util.List<AllergyIntoleranceReactionModel> list) {
    return (java.util.List<AllergyIntoleranceReaction>)list.stream()
      .map(model -> new AllergyIntoleranceReaction(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<AllergyIntoleranceReactionModel> toModelArray(java.util.List<AllergyIntoleranceReaction> list) {
    return (java.util.List<AllergyIntoleranceReactionModel>)list.stream()
      .map(model -> new AllergyIntoleranceReactionModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static AllergyIntoleranceReaction fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, AllergyIntoleranceReaction.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(AllergyIntoleranceReaction o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<AllergyIntoleranceReaction> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
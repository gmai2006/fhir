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
import org.fhir.entity.EpisodeOfCareDiagnosisModel;
import com.google.gson.GsonBuilder;

/**
* "An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time."
*/
public class EpisodeOfCareDiagnosis  {
  /**
  * Description: "A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for."
  */
  @javax.validation.constraints.NotNull
  private Reference condition;

  /**
  * Description: "Role that this diagnosis has within the episode of care (e.g. admission, billing, discharge …)."
  */
  private CodeableConcept role;

  /**
  * Description: "Ranking of the diagnosis (for each role type)."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float rank;

  /**
  * Description: "Extensions for rank"
  */
  private transient Element _rank;

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

  public EpisodeOfCareDiagnosis() {
  }

  public EpisodeOfCareDiagnosis(EpisodeOfCareDiagnosisModel o) {
    this.id = o.getId();
      if (null != o.getCondition()) {
        this.condition = new Reference(o.getCondition());
        this.condition.setId(this.getId());
      }

      this.role = CodeableConcept.fromJson(o.getRole());
      if (null != o.getRank()) {
        this.rank = new Float(o.getRank());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setCondition( Reference value) {
    this.condition = value;
  }
  public Reference getCondition() {
    return this.condition;
  }
  public void setRole( CodeableConcept value) {
    this.role = value;
  }
  public CodeableConcept getRole() {
    return this.role;
  }
  public void setRank( Float value) {
    this.rank = value;
  }
  public Float getRank() {
    return this.rank;
  }
  public void set_rank( Element value) {
    this._rank = value;
  }
  public Element get_rank() {
    return this._rank;
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
     builder.append("condition" + "[" + String.valueOf(this.condition) + "]\n"); 
     builder.append("role" + "[" + String.valueOf(this.role) + "]\n"); 
     builder.append("rank" + "[" + String.valueOf(this.rank) + "]\n"); 
     builder.append("_rank" + "[" + String.valueOf(this._rank) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<EpisodeOfCareDiagnosis> fromArray(java.util.List<EpisodeOfCareDiagnosisModel> list) {
    return (java.util.List<EpisodeOfCareDiagnosis>)list.stream()
      .map(model -> new EpisodeOfCareDiagnosis(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<EpisodeOfCareDiagnosisModel> toModelArray(java.util.List<EpisodeOfCareDiagnosis> list) {
    return (java.util.List<EpisodeOfCareDiagnosisModel>)list.stream()
      .map(model -> new EpisodeOfCareDiagnosisModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static EpisodeOfCareDiagnosis fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, EpisodeOfCareDiagnosis.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(EpisodeOfCareDiagnosis o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<EpisodeOfCareDiagnosis> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
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
import org.fhir.entity.ClaimCareTeamModel;
import com.google.gson.GsonBuilder;

/**
* "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
*/
public class ClaimCareTeam  {
  /**
  * Description: "Sequence of the careTeam which serves to order and provide a link."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float sequence;

  /**
  * Description: "Extensions for sequence"
  */
  private transient Element _sequence;

  /**
  * Description: "Member of the team who provided the overall service."
  */
  @javax.validation.constraints.NotNull
  private Reference provider;

  /**
  * Description: "The party who is billing and responsible for the claimed good or service rendered to the patient."
  */
  private Boolean responsible;

  /**
  * Description: "Extensions for responsible"
  */
  private transient Element _responsible;

  /**
  * Description: "The lead, assisting or supervising practitioner and their discipline if a multidisiplinary team."
  */
  private CodeableConcept role;

  /**
  * Description: "The qualification which is applicable for this service."
  */
  private CodeableConcept qualification;

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

  public ClaimCareTeam() {
  }

  public ClaimCareTeam(ClaimCareTeamModel o) {
    this.id = o.getId();
      if (null != o.getSequence()) {
        this.sequence = new Float(o.getSequence());
      }

      if (null != o.getProvider()) {
        this.provider = new Reference(o.getProvider());
        this.provider.setId(this.getId());
      }

      if (null != o.getResponsible()) {
        this.responsible = new Boolean(o.getResponsible());
      }

      this.role = CodeableConcept.fromJson(o.getRole());
      this.qualification = CodeableConcept.fromJson(o.getQualification());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setSequence( Float value) {
    this.sequence = value;
  }
  public Float getSequence() {
    return this.sequence;
  }
  public void set_sequence( Element value) {
    this._sequence = value;
  }
  public Element get_sequence() {
    return this._sequence;
  }
  public void setProvider( Reference value) {
    this.provider = value;
  }
  public Reference getProvider() {
    return this.provider;
  }
  public void setResponsible( Boolean value) {
    this.responsible = value;
  }
  public Boolean getResponsible() {
    return this.responsible;
  }
  public void set_responsible( Element value) {
    this._responsible = value;
  }
  public Element get_responsible() {
    return this._responsible;
  }
  public void setRole( CodeableConcept value) {
    this.role = value;
  }
  public CodeableConcept getRole() {
    return this.role;
  }
  public void setQualification( CodeableConcept value) {
    this.qualification = value;
  }
  public CodeableConcept getQualification() {
    return this.qualification;
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
     builder.append("sequence" + "[" + String.valueOf(this.sequence) + "]\n"); 
     builder.append("_sequence" + "[" + String.valueOf(this._sequence) + "]\n"); 
     builder.append("provider" + "[" + String.valueOf(this.provider) + "]\n"); 
     builder.append("responsible" + "[" + String.valueOf(this.responsible) + "]\n"); 
     builder.append("_responsible" + "[" + String.valueOf(this._responsible) + "]\n"); 
     builder.append("role" + "[" + String.valueOf(this.role) + "]\n"); 
     builder.append("qualification" + "[" + String.valueOf(this.qualification) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ClaimCareTeam> fromArray(java.util.List<ClaimCareTeamModel> list) {
    return (java.util.List<ClaimCareTeam>)list.stream()
      .map(model -> new ClaimCareTeam(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ClaimCareTeamModel> toModelArray(java.util.List<ClaimCareTeam> list) {
    return (java.util.List<ClaimCareTeamModel>)list.stream()
      .map(model -> new ClaimCareTeamModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ClaimCareTeam fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ClaimCareTeam.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ClaimCareTeam o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ClaimCareTeam> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
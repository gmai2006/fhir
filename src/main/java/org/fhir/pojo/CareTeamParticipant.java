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
import org.fhir.entity.CareTeamParticipantModel;
import com.google.gson.GsonBuilder;

/**
* "The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient."
*/
public class CareTeamParticipant  {
  /**
  * Description: "Indicates specific responsibility of an individual within the care team, such as \"Primary care physician\", \"Trained social worker counselor\", \"Caregiver\", etc."
  */
  private CodeableConcept role;

  /**
  * Description: "The specific person or organization who is participating/expected to participate in the care team."
  */
  private Reference member;

  /**
  * Description: "The organization of the practitioner."
  */
  private Reference onBehalfOf;

  /**
  * Description: "Indicates when the specific member or organization did (or is intended to) come into effect and end."
  */
  private Period period;

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

  public CareTeamParticipant() {
  }

  public CareTeamParticipant(CareTeamParticipantModel o) {
    this.id = o.getId();
      this.role = CodeableConcept.fromJson(o.getRole());
      if (null != o.getMember()) {
        this.member = new Reference(o.getMember());
        this.member.setId(this.getId());
      }

      if (null != o.getOnBehalfOf()) {
        this.onBehalfOf = new Reference(o.getOnBehalfOf());
        this.onBehalfOf.setId(this.getId());
      }

      this.period = Period.fromJson(o.getPeriod());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setRole( CodeableConcept value) {
    this.role = value;
  }
  public CodeableConcept getRole() {
    return this.role;
  }
  public void setMember( Reference value) {
    this.member = value;
  }
  public Reference getMember() {
    return this.member;
  }
  public void setOnBehalfOf( Reference value) {
    this.onBehalfOf = value;
  }
  public Reference getOnBehalfOf() {
    return this.onBehalfOf;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
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
     builder.append("role" + "[" + String.valueOf(this.role) + "]\n"); 
     builder.append("member" + "[" + String.valueOf(this.member) + "]\n"); 
     builder.append("onBehalfOf" + "[" + String.valueOf(this.onBehalfOf) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<CareTeamParticipant> fromArray(java.util.List<CareTeamParticipantModel> list) {
    return (java.util.List<CareTeamParticipant>)list.stream()
      .map(model -> new CareTeamParticipant(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CareTeamParticipantModel> toModelArray(java.util.List<CareTeamParticipant> list) {
    return (java.util.List<CareTeamParticipantModel>)list.stream()
      .map(model -> new CareTeamParticipantModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static CareTeamParticipant fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CareTeamParticipant.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(CareTeamParticipant o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<CareTeamParticipant> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
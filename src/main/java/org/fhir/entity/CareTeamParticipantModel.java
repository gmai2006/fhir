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
* "The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient."
*/
@Entity
@Table(name="careteamparticipant")
public class CareTeamParticipantModel  {
  /**
  * Description: "Indicates specific responsibility of an individual within the care team, such as \"Primary care physician\", \"Trained social worker counselor\", \"Caregiver\", etc."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"role\"", length = 16777215)
  private String role;

  /**
  * Description: "The specific person or organization who is participating/expected to participate in the care team."
  */
  @javax.persistence.Basic
  @Column(name="\"member_id\"")
  private String member_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`member_id`", insertable=false, updatable=false)
  private ReferenceModel member;

  /**
  * Description: "The organization of the practitioner."
  */
  @javax.persistence.Basic
  @Column(name="\"onbehalfof_id\"")
  private String onbehalfof_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`onbehalfof_id`", insertable=false, updatable=false)
  private ReferenceModel onBehalfOf;

  /**
  * Description: "Indicates when the specific member or organization did (or is intended to) come into effect and end."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

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

  public CareTeamParticipantModel() {
  }

  public CareTeamParticipantModel(CareTeamParticipant o) {
    this.id = o.getId();
      this.role = CodeableConcept.toJson(o.getRole());
      if (null != o.getMember()) {
      	this.member_id = "member" + this.getId();
        this.member = new ReferenceModel(o.getMember());
        this.member.setId(this.member_id);
        this.member.parent_id = this.member.getId();
      }

      if (null != o.getOnBehalfOf()) {
      	this.onbehalfof_id = "onBehalfOf" + this.getId();
        this.onBehalfOf = new ReferenceModel(o.getOnBehalfOf());
        this.onBehalfOf.setId(this.onbehalfof_id);
        this.onBehalfOf.parent_id = this.onBehalfOf.getId();
      }

      this.period = Period.toJson(o.getPeriod());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setRole( String value) {
    this.role = value;
  }
  public String getRole() {
    return this.role;
  }
  public void setMember( ReferenceModel value) {
    this.member = value;
  }
  public ReferenceModel getMember() {
    return this.member;
  }
  public void setOnBehalfOf( ReferenceModel value) {
    this.onBehalfOf = value;
  }
  public ReferenceModel getOnBehalfOf() {
    return this.onBehalfOf;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public String getPeriod() {
    return this.period;
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
     builder.append("role" + "[" + String.valueOf(this.role) + "]\n"); 
     builder.append("member" + "[" + String.valueOf(this.member) + "]\n"); 
     builder.append("onBehalfOf" + "[" + String.valueOf(this.onBehalfOf) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
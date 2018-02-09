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
* "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order."
*/
@Entity
@Table(name="medicationdispenseperformer")
public class MedicationDispensePerformerModel  {
  /**
  * Description: "The device, practitioner, etc. who performed the action.  It should be assumed that the actor is the dispenser of the medication."
  */
  @javax.persistence.Basic
  @Column(name="\"actor_id\"")
  private String actor_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`actor_id`", insertable=false, updatable=false)
  private ReferenceModel actor;

  /**
  * Description: "The organization the device or practitioner was acting on behalf of."
  */
  @javax.persistence.Basic
  @Column(name="\"onbehalfof_id\"")
  private String onbehalfof_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`onbehalfof_id`", insertable=false, updatable=false)
  private ReferenceModel onBehalfOf;

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

  public MedicationDispensePerformerModel() {
  }

  public MedicationDispensePerformerModel(MedicationDispensePerformer o) {
    this.id = o.getId();
      if (null != o.getActor()) {
      	this.actor_id = "actor" + this.getId();
        this.actor = new ReferenceModel(o.getActor());
        this.actor.setId(this.actor_id);
        this.actor.parent_id = this.actor.getId();
      }

      if (null != o.getOnBehalfOf()) {
      	this.onbehalfof_id = "onBehalfOf" + this.getId();
        this.onBehalfOf = new ReferenceModel(o.getOnBehalfOf());
        this.onBehalfOf.setId(this.onbehalfof_id);
        this.onBehalfOf.parent_id = this.onBehalfOf.getId();
      }

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setActor( ReferenceModel value) {
    this.actor = value;
  }
  public ReferenceModel getActor() {
    return this.actor;
  }
  public void setOnBehalfOf( ReferenceModel value) {
    this.onBehalfOf = value;
  }
  public ReferenceModel getOnBehalfOf() {
    return this.onBehalfOf;
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
     builder.append("actor" + "[" + String.valueOf(this.actor) + "]\n"); 
     builder.append("onBehalfOf" + "[" + String.valueOf(this.onBehalfOf) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
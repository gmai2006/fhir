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
* "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order."
*/
@Entity
@Table(name="medicationdispensesubstitution")
public class MedicationDispenseSubstitutionModel  implements Serializable {
	private static final long serialVersionUID = 151857669646677346L;
  /**
  * Description: "True if the dispenser dispensed a different drug or product from what was prescribed."
  */
  @javax.persistence.Basic
  @Column(name="\"wasSubstituted\"")
  private Boolean wasSubstituted;

  /**
  * Description: "A code signifying whether a different drug was dispensed from what was prescribed."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "Indicates the reason for the substitution of (or lack of substitution) from what was prescribed."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reason\"", length = 16777215)
  private String reason;

  /**
  * Description: "The person or organization that has primary responsibility for the substitution."
  */
  @javax.persistence.Basic
  @Column(name="\"responsibleparty_id\"")
  private String responsibleparty_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="responsibleparty_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> responsibleParty;

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

  public MedicationDispenseSubstitutionModel() {
  }

  public MedicationDispenseSubstitutionModel(MedicationDispenseSubstitution o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.wasSubstituted = o.getWasSubstituted();
    this.type = CodeableConceptHelper.toJson(o.getType());
    if (null != o.getResponsibleParty() && !o.getResponsibleParty().isEmpty()) {
    	this.responsibleparty_id = "responsibleparty" + this.parent_id;
    	this.responsibleParty = ReferenceHelper.toModelFromArray(o.getResponsibleParty(), this.responsibleparty_id);
    }
  }

  public Boolean getWasSubstituted() {
    return this.wasSubstituted;
  }
  public void setWasSubstituted( Boolean value) {
    this.wasSubstituted = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getReason() {
    return this.reason;
  }
  public void setReason( String value) {
    this.reason = value;
  }
  public java.util.List<ReferenceModel> getResponsibleParty() {
    return this.responsibleParty;
  }
  public void setResponsibleParty( java.util.List<ReferenceModel> value) {
    this.responsibleParty = value;
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
    builder.append("[MedicationDispenseSubstitutionModel]:" + "\n");
     builder.append("wasSubstituted" + "->" + this.wasSubstituted + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("reason" + "->" + this.reason + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MedicationDispenseSubstitutionModel]:" + "\n");
     builder.append("wasSubstituted" + "->" + this.wasSubstituted + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("reason" + "->" + this.reason + "\n"); 
     builder.append("responsibleParty" + "->" + this.responsibleParty + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}
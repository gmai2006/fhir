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
import org.fhir.utils.JsonUtils;
/**
* "The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient."
* generated on 07/14/2018
*/
@Entity
@Table(name="careteamparticipant")
public class CareTeamParticipantModel  implements Serializable {
	private static final long serialVersionUID = 153159210217123266L;
  /**
  * Description: "Indicates specific responsibility of an individual within the care team, such as \"Primary care physician\", \"Trained social worker counselor\", \"Caregiver\", etc."
  */
  @javax.persistence.Basic
  @Column(name="\"role_id\"")
  private String role_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="role_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> role;

  /**
  * Description: "The specific person or organization who is participating/expected to participate in the care team."
  */
  @javax.persistence.Basic
  @Column(name="\"member_id\"")
  private String member_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="member_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> member;

  /**
  * Description: "The organization of the practitioner."
  */
  @javax.persistence.Basic
  @Column(name="\"onbehalfof_id\"")
  private String onbehalfof_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="onbehalfof_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> onBehalfOf;

  /**
  * Description: "Indicates when the specific member or organization did (or is intended to) come into effect and end."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

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
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public CareTeamParticipantModel() {
  }

  public CareTeamParticipantModel(CareTeamParticipant o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getRole() ) {
    	this.role_id = "role" + this.id;
    	this.role = CodeableConceptHelper.toModel(o.getRole(), this.role_id);
    }
    if (null != o.getMember() ) {
    	this.member_id = "member" + this.id;
    	this.member = ReferenceHelper.toModel(o.getMember(), this.member_id);
    }
    if (null != o.getOnBehalfOf() ) {
    	this.onbehalfof_id = "onbehalfof" + this.id;
    	this.onBehalfOf = ReferenceHelper.toModel(o.getOnBehalfOf(), this.onbehalfof_id);
    }
    if (null != o.getPeriod()) {
    	this.period = JsonUtils.toJson(o.getPeriod());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodeableConceptModel> getRole() {
    return this.role;
  }
  public void setRole( java.util.List<CodeableConceptModel> value) {
    this.role = value;
  }
  public java.util.List<ReferenceModel> getMember() {
    return this.member;
  }
  public void setMember( java.util.List<ReferenceModel> value) {
    this.member = value;
  }
  public java.util.List<ReferenceModel> getOnBehalfOf() {
    return this.onBehalfOf;
  }
  public void setOnBehalfOf( java.util.List<ReferenceModel> value) {
    this.onBehalfOf = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setPeriod( String value) {
    this.period = value;
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
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CareTeamParticipantModel]:" + "\n");
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CareTeamParticipantModel]:" + "\n");
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}
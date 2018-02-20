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
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
*/
@Entity
@Table(name="explanationofbenefitcareteam")
public class ExplanationOfBenefitCareTeamModel  implements Serializable {
	private static final long serialVersionUID = 15191089376412266L;
  /**
  * Description: "Sequence of careteam which serves to order and provide a link."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"sequence\"")
  private Float sequence;

  /**
  * Description: "The members of the team who provided the overall service."
  */
  @javax.persistence.Basic
  @Column(name="\"provider_id\"")
  private String provider_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="provider_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> provider;

  /**
  * Description: "The practitioner who is billing and responsible for the claimed services rendered to the patient."
  */
  @javax.persistence.Basic
  @Column(name="\"responsible\"")
  private Boolean responsible;

  /**
  * Description: "The lead, assisting or supervising practitioner and their discipline if a multidisiplinary team."
  */
  @javax.persistence.Basic
  @Column(name="\"role_id\"")
  private String role_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="role_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> role;

  /**
  * Description: "The qualification which is applicable for this service."
  */
  @javax.persistence.Basic
  @Column(name="\"qualification_id\"")
  private String qualification_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="qualification_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> qualification;

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

  public ExplanationOfBenefitCareTeamModel() {
  }

  public ExplanationOfBenefitCareTeamModel(ExplanationOfBenefitCareTeam o, String parentId) {
  	this.parent_id = parentId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.sequence = o.getSequence();
    if (null != o.getProvider() ) {
    	this.provider_id = "provider" + this.parent_id;
    	this.provider = ReferenceHelper.toModel(o.getProvider(), this.provider_id);
    }
    this.responsible = o.getResponsible();
    if (null != o.getRole() ) {
    	this.role_id = "role" + this.parent_id;
    	this.role = CodeableConceptHelper.toModel(o.getRole(), this.role_id);
    }
    if (null != o.getQualification() ) {
    	this.qualification_id = "qualification" + this.parent_id;
    	this.qualification = CodeableConceptHelper.toModel(o.getQualification(), this.qualification_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public Float getSequence() {
    return this.sequence;
  }
  public void setSequence( Float value) {
    this.sequence = value;
  }
  public java.util.List<ReferenceModel> getProvider() {
    return this.provider;
  }
  public void setProvider( java.util.List<ReferenceModel> value) {
    this.provider = value;
  }
  public Boolean getResponsible() {
    return this.responsible;
  }
  public void setResponsible( Boolean value) {
    this.responsible = value;
  }
  public java.util.List<CodeableConceptModel> getRole() {
    return this.role;
  }
  public void setRole( java.util.List<CodeableConceptModel> value) {
    this.role = value;
  }
  public java.util.List<CodeableConceptModel> getQualification() {
    return this.qualification;
  }
  public void setQualification( java.util.List<CodeableConceptModel> value) {
    this.qualification = value;
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
    builder.append("[ExplanationOfBenefitCareTeamModel]:" + "\n");
     builder.append("sequence" + "->" + this.sequence + "\n"); 
     builder.append("responsible" + "->" + this.responsible + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ExplanationOfBenefitCareTeamModel]:" + "\n");
     builder.append("sequence" + "->" + this.sequence + "\n"); 
     builder.append("provider" + "->" + this.provider + "\n"); 
     builder.append("responsible" + "->" + this.responsible + "\n"); 
     builder.append("role" + "->" + this.role + "\n"); 
     builder.append("qualification" + "->" + this.qualification + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}
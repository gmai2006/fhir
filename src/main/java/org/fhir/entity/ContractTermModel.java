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
* "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
*/
@Entity
@Table(name="contractterm")
public class ContractTermModel  {
  /**
  * Description: "Unique identifier for this particular Contract Provision."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "When this Contract Provision was issued."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"issued\"")
  private String issued;

  /**
  * Description: "Relevant time or time-period when this Contract Provision is applicable."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"applies\"", length = 16777215)
  private String applies;

  /**
  * Description: "Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "Subtype of this Contract Provision, e.g. life time maximum payment for a contract term for specific valued item, e.g. disability payment."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"subType\"", length = 16777215)
  private String subType;

  /**
  * Description: "The matter of concern in the context of this provision of the agrement."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> topic = new java.util.ArrayList<>();

  /**
  * Description: "Action stipulated by this Contract Provision."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"action\"", length = 16777215)
  private String action;

  /**
  * Description: "Reason or purpose for the action stipulated by this Contract Provision."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"actionReason\"", length = 16777215)
  private String actionReason;

  /**
  * Description: "A set of security labels that define which terms are controlled by this condition."
  * Actual type: Array of Coding-> List<Coding>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"securityLabel\"", length = 16777215)
  private String securityLabel;

  /**
  * Description: "An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ContractAgent1Model> agent = new java.util.ArrayList<>();

  /**
  * Description: "Human readable form of this Contract Provision."
  */
  @javax.persistence.Basic
  @Column(name="\"text\"")
  private String text;

  /**
  * Description: "Contract Provision Valued Item List."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ContractValuedItem1Model> valuedItem = new java.util.ArrayList<>();

  /**
  * Description: "Nested group of Contract Provisions."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ContractTermModel> group = new java.util.ArrayList<>();

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

  public ContractTermModel() {
  }

  public ContractTermModel(ContractTerm o) {
    this.id = o.getId();
      this.identifier = Identifier.toJson(o.getIdentifier());
      this.issued = o.getIssued();

      this.applies = Period.toJson(o.getApplies());
      this.type = CodeableConcept.toJson(o.getType());
      this.subType = CodeableConcept.toJson(o.getSubType());
      this.topic = Reference.toModelArray(o.getTopic());

      this.action = CodeableConcept.toJson(o.getAction());
      this.actionReason = CodeableConcept.toJson(o.getActionReason());
      this.securityLabel = Coding.toJson(o.getSecurityLabel());
      this.agent = ContractAgent1.toModelArray(o.getAgent());

      this.text = o.getText();

      this.valuedItem = ContractValuedItem1.toModelArray(o.getValuedItem());

      this.group = ContractTerm.toModelArray(o.getGroup());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIssued( String value) {
    this.issued = value;
  }
  public String getIssued() {
    return this.issued;
  }
  public void setApplies( String value) {
    this.applies = value;
  }
  public String getApplies() {
    return this.applies;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setSubType( String value) {
    this.subType = value;
  }
  public String getSubType() {
    return this.subType;
  }
  public void setTopic( java.util.List<ReferenceModel> value) {
    this.topic = value;
  }
  public java.util.List<ReferenceModel> getTopic() {
    return this.topic;
  }
  public void setAction( String value) {
    this.action = value;
  }
  public String getAction() {
    return this.action;
  }
  public void setActionReason( String value) {
    this.actionReason = value;
  }
  public String getActionReason() {
    return this.actionReason;
  }
  public void setSecurityLabel( String value) {
    this.securityLabel = value;
  }
  public String getSecurityLabel() {
    return this.securityLabel;
  }
  public void setAgent( java.util.List<ContractAgent1Model> value) {
    this.agent = value;
  }
  public java.util.List<ContractAgent1Model> getAgent() {
    return this.agent;
  }
  public void setText( String value) {
    this.text = value;
  }
  public String getText() {
    return this.text;
  }
  public void setValuedItem( java.util.List<ContractValuedItem1Model> value) {
    this.valuedItem = value;
  }
  public java.util.List<ContractValuedItem1Model> getValuedItem() {
    return this.valuedItem;
  }
  public void setGroup( java.util.List<ContractTermModel> value) {
    this.group = value;
  }
  public java.util.List<ContractTermModel> getGroup() {
    return this.group;
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
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("issued" + "[" + String.valueOf(this.issued) + "]\n"); 
     builder.append("applies" + "[" + String.valueOf(this.applies) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("subType" + "[" + String.valueOf(this.subType) + "]\n"); 
     builder.append("topic" + "[" + String.valueOf(this.topic) + "]\n"); 
     builder.append("action" + "[" + String.valueOf(this.action) + "]\n"); 
     builder.append("actionReason" + "[" + String.valueOf(this.actionReason) + "]\n"); 
     builder.append("securityLabel" + "[" + String.valueOf(this.securityLabel) + "]\n"); 
     builder.append("agent" + "[" + String.valueOf(this.agent) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("valuedItem" + "[" + String.valueOf(this.valuedItem) + "]\n"); 
     builder.append("group" + "[" + String.valueOf(this.group) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
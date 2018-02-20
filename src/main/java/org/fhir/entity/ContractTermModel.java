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
* "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
*/
@Entity
@Table(name="contractterm")
public class ContractTermModel  implements Serializable {
	private static final long serialVersionUID = 151910893740351448L;
  /**
  * Description: "Unique identifier for this particular Contract Provision."
  * Actual type: String;
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
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"applies\"", length = 16777215)
  private String applies;

  /**
  * Description: "Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> type;

  /**
  * Description: "Subtype of this Contract Provision, e.g. life time maximum payment for a contract term for specific valued item, e.g. disability payment."
  */
  @javax.persistence.Basic
  @Column(name="\"subtype_id\"")
  private String subtype_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="subtype_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> subType;

  /**
  * Description: "The matter of concern in the context of this provision of the agrement."
  */
  @javax.persistence.Basic
  @Column(name="\"topic_id\"")
  private String topic_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="topic_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> topic;

  /**
  * Description: "Action stipulated by this Contract Provision."
  */
  @javax.persistence.Basic
  @Column(name="\"action_id\"")
  private String action_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="action_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> action;

  /**
  * Description: "Reason or purpose for the action stipulated by this Contract Provision."
  */
  @javax.persistence.Basic
  @Column(name="\"actionreason_id\"")
  private String actionreason_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="actionreason_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> actionReason;

  /**
  * Description: "A set of security labels that define which terms are controlled by this condition."
  */
  @javax.persistence.Basic
  @Column(name="\"securitylabel_id\"")
  private String securitylabel_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="securitylabel_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> securityLabel;

  /**
  * Description: "An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place."
  */
  @javax.persistence.Basic
  @Column(name="\"agent_id\"")
  private String agent_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="agent_id", insertable=false, updatable=false)
  private java.util.List<ContractAgent1Model> agent;

  /**
  * Description: "Human readable form of this Contract Provision."
  */
  @javax.persistence.Basic
  @Column(name="\"text\"")
  private String text;

  /**
  * Description: "Contract Provision Valued Item List."
  */
  @javax.persistence.Basic
  @Column(name="\"valueditem_id\"")
  private String valueditem_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valueditem_id", insertable=false, updatable=false)
  private java.util.List<ContractValuedItem1Model> valuedItem;

  /**
  * Description: "Nested group of Contract Provisions."
  */
  @javax.persistence.Basic
  @Column(name="\"group_id\"")
  private String group_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="group_id", insertable=false, updatable=false)
  private java.util.List<ContractTermModel> group;

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

  public ContractTermModel() {
  }

  public ContractTermModel(ContractTerm o, String parentId) {
  	this.parent_id = parentId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.issued = o.getIssued();
    if (null != o.getApplies()) {
    	this.applies = JsonUtils.toJson(o.getApplies());
    }
    if (null != o.getType() ) {
    	this.type_id = "type" + this.parent_id;
    	this.type = CodeableConceptHelper.toModel(o.getType(), this.type_id);
    }
    if (null != o.getSubType() ) {
    	this.subtype_id = "subtype" + this.parent_id;
    	this.subType = CodeableConceptHelper.toModel(o.getSubType(), this.subtype_id);
    }
    if (null != o.getTopic() && !o.getTopic().isEmpty()) {
    	this.topic_id = "topic" + this.parent_id;
    	this.topic = ReferenceHelper.toModelFromArray(o.getTopic(), this.topic_id);
    }
    if (null != o.getAction() && !o.getAction().isEmpty()) {
    	this.action_id = "action" + this.parent_id;
    	this.action = CodeableConceptHelper.toModelFromArray(o.getAction(), this.action_id);
    }
    if (null != o.getActionReason() && !o.getActionReason().isEmpty()) {
    	this.actionreason_id = "actionreason" + this.parent_id;
    	this.actionReason = CodeableConceptHelper.toModelFromArray(o.getActionReason(), this.actionreason_id);
    }
    if (null != o.getSecurityLabel() && !o.getSecurityLabel().isEmpty()) {
    	this.securitylabel_id = "securitylabel" + this.parent_id;
    	this.securityLabel = CodingHelper.toModelFromArray(o.getSecurityLabel(), this.securitylabel_id);
    }
    if (null != o.getAgent() && !o.getAgent().isEmpty()) {
    	this.agent_id = "agent" + this.parent_id;
    	this.agent = ContractAgent1Helper.toModelFromArray(o.getAgent(), this.agent_id);
    }
    this.text = o.getText();
    if (null != o.getValuedItem() && !o.getValuedItem().isEmpty()) {
    	this.valueditem_id = "valueditem" + this.parent_id;
    	this.valuedItem = ContractValuedItem1Helper.toModelFromArray(o.getValuedItem(), this.valueditem_id);
    }
    if (null != o.getGroup() && !o.getGroup().isEmpty()) {
    	this.group_id = "group" + this.parent_id;
    	this.group = ContractTermHelper.toModelFromArray(o.getGroup(), this.group_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIssued() {
    return this.issued;
  }
  public void setIssued( String value) {
    this.issued = value;
  }
  public String getApplies() {
    return this.applies;
  }
  public void setApplies( String value) {
    this.applies = value;
  }
  public java.util.List<CodeableConceptModel> getType() {
    return this.type;
  }
  public void setType( java.util.List<CodeableConceptModel> value) {
    this.type = value;
  }
  public java.util.List<CodeableConceptModel> getSubType() {
    return this.subType;
  }
  public void setSubType( java.util.List<CodeableConceptModel> value) {
    this.subType = value;
  }
  public java.util.List<ReferenceModel> getTopic() {
    return this.topic;
  }
  public void setTopic( java.util.List<ReferenceModel> value) {
    this.topic = value;
  }
  public java.util.List<CodeableConceptModel> getAction() {
    return this.action;
  }
  public void setAction( java.util.List<CodeableConceptModel> value) {
    this.action = value;
  }
  public java.util.List<CodeableConceptModel> getActionReason() {
    return this.actionReason;
  }
  public void setActionReason( java.util.List<CodeableConceptModel> value) {
    this.actionReason = value;
  }
  public java.util.List<CodingModel> getSecurityLabel() {
    return this.securityLabel;
  }
  public void setSecurityLabel( java.util.List<CodingModel> value) {
    this.securityLabel = value;
  }
  public java.util.List<ContractAgent1Model> getAgent() {
    return this.agent;
  }
  public void setAgent( java.util.List<ContractAgent1Model> value) {
    this.agent = value;
  }
  public String getText() {
    return this.text;
  }
  public void setText( String value) {
    this.text = value;
  }
  public java.util.List<ContractValuedItem1Model> getValuedItem() {
    return this.valuedItem;
  }
  public void setValuedItem( java.util.List<ContractValuedItem1Model> value) {
    this.valuedItem = value;
  }
  public java.util.List<ContractTermModel> getGroup() {
    return this.group;
  }
  public void setGroup( java.util.List<ContractTermModel> value) {
    this.group = value;
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
    builder.append("[ContractTermModel]:" + "\n");
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("issued" + "->" + this.issued + "\n"); 
     builder.append("applies" + "->" + this.applies + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ContractTermModel]:" + "\n");
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("issued" + "->" + this.issued + "\n"); 
     builder.append("applies" + "->" + this.applies + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("subType" + "->" + this.subType + "\n"); 
     builder.append("topic" + "->" + this.topic + "\n"); 
     builder.append("action" + "->" + this.action + "\n"); 
     builder.append("actionReason" + "->" + this.actionReason + "\n"); 
     builder.append("securityLabel" + "->" + this.securityLabel + "\n"); 
     builder.append("agent" + "->" + this.agent + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("valuedItem" + "->" + this.valuedItem + "\n"); 
     builder.append("group" + "->" + this.group + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}
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
import org.fhir.entity.ContractTermModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ContractTerm  extends BackboneElement  {
  /**
  * Description: "Unique identifier for this particular Contract Provision."
  */
  protected Identifier identifier;

  /**
  * Description: "When this Contract Provision was issued."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String issued;

  /**
  * Description: "Extensions for issued"
  */
  protected transient Element _issued;

  /**
  * Description: "Relevant time or time-period when this Contract Provision is applicable."
  */
  protected Period applies;

  /**
  * Description: "Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit."
  */
  protected CodeableConcept type;

  /**
  * Description: "Subtype of this Contract Provision, e.g. life time maximum payment for a contract term for specific valued item, e.g. disability payment."
  */
  protected CodeableConcept subType;

  /**
  * Description: "The matter of concern in the context of this provision of the agrement."
  */
  protected java.util.List<Reference> topic;

  /**
  * Description: "Action stipulated by this Contract Provision."
  */
  protected java.util.List<CodeableConcept> action;

  /**
  * Description: "Reason or purpose for the action stipulated by this Contract Provision."
  */
  protected java.util.List<CodeableConcept> actionReason;

  /**
  * Description: "A set of security labels that define which terms are controlled by this condition."
  */
  protected java.util.List<Coding> securityLabel;

  /**
  * Description: "An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place."
  */
  protected java.util.List<ContractAgent1> agent;

  /**
  * Description: "Human readable form of this Contract Provision."
  */
  protected String text;

  /**
  * Description: "Extensions for text"
  */
  protected transient Element _text;

  /**
  * Description: "Contract Provision Valued Item List."
  */
  protected java.util.List<ContractValuedItem1> valuedItem;

  /**
  * Description: "Nested group of Contract Provisions."
  */
  protected java.util.List<ContractTerm> group;

  public ContractTerm() {
  }

  public ContractTerm(ContractTermModel o) {
    this.id = o.getId();
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getIssued()) {
      this.issued = o.getIssued();
    }
    this.applies = PeriodHelper.fromJson(o.getApplies());
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getSubType() && !o.getSubType().isEmpty()) {
      this.subType = new CodeableConcept(o.getSubType().get(0));
    }
    if (null != o.getTopic() && !o.getTopic().isEmpty()) {
    	this.topic = ReferenceHelper.fromArray2Array(o.getTopic());
    }
    if (null != o.getAction() && !o.getAction().isEmpty()) {
    	this.action = CodeableConceptHelper.fromArray2Array(o.getAction());
    }
    if (null != o.getActionReason() && !o.getActionReason().isEmpty()) {
    	this.actionReason = CodeableConceptHelper.fromArray2Array(o.getActionReason());
    }
    if (null != o.getSecurityLabel() && !o.getSecurityLabel().isEmpty()) {
    	this.securityLabel = CodingHelper.fromArray2Array(o.getSecurityLabel());
    }
    if (null != o.getAgent() && !o.getAgent().isEmpty()) {
    	this.agent = ContractAgent1Helper.fromArray2Array(o.getAgent());
    }
    if (null != o.getText()) {
      this.text = o.getText();
    }
    if (null != o.getValuedItem() && !o.getValuedItem().isEmpty()) {
    	this.valuedItem = ContractValuedItem1Helper.fromArray2Array(o.getValuedItem());
    }
    if (null != o.getGroup() && !o.getGroup().isEmpty()) {
    	this.group = ContractTermHelper.fromArray2Array(o.getGroup());
    }
  }

  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setIssued( String value) {
    this.issued = value;
  }
  public String getIssued() {
    return this.issued;
  }
  public void set_issued( Element value) {
    this._issued = value;
  }
  public Element get_issued() {
    return this._issued;
  }
  public void setApplies( Period value) {
    this.applies = value;
  }
  public Period getApplies() {
    return this.applies;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setSubType( CodeableConcept value) {
    this.subType = value;
  }
  public CodeableConcept getSubType() {
    return this.subType;
  }
  public void setTopic( java.util.List<Reference> value) {
    this.topic = value;
  }
  public java.util.List<Reference> getTopic() {
    return this.topic;
  }
  public void setAction( java.util.List<CodeableConcept> value) {
    this.action = value;
  }
  public java.util.List<CodeableConcept> getAction() {
    return this.action;
  }
  public void setActionReason( java.util.List<CodeableConcept> value) {
    this.actionReason = value;
  }
  public java.util.List<CodeableConcept> getActionReason() {
    return this.actionReason;
  }
  public void setSecurityLabel( java.util.List<Coding> value) {
    this.securityLabel = value;
  }
  public java.util.List<Coding> getSecurityLabel() {
    return this.securityLabel;
  }
  public void setAgent( java.util.List<ContractAgent1> value) {
    this.agent = value;
  }
  public java.util.List<ContractAgent1> getAgent() {
    return this.agent;
  }
  public void setText( String value) {
    this.text = value;
  }
  public String getText() {
    return this.text;
  }
  public void set_text( Element value) {
    this._text = value;
  }
  public Element get_text() {
    return this._text;
  }
  public void setValuedItem( java.util.List<ContractValuedItem1> value) {
    this.valuedItem = value;
  }
  public java.util.List<ContractValuedItem1> getValuedItem() {
    return this.valuedItem;
  }
  public void setGroup( java.util.List<ContractTerm> value) {
    this.group = value;
  }
  public java.util.List<ContractTerm> getGroup() {
    return this.group;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ContractTerm]:" + "\n");
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.issued != null) builder.append("issued" + "->" + this.issued.toString() + "\n"); 
     if(this._issued != null) builder.append("_issued" + "->" + this._issued.toString() + "\n"); 
     if(this.applies != null) builder.append("applies" + "->" + this.applies.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.subType != null) builder.append("subType" + "->" + this.subType.toString() + "\n"); 
     if(this.topic != null) builder.append("topic" + "->" + this.topic.toString() + "\n"); 
     if(this.action != null) builder.append("action" + "->" + this.action.toString() + "\n"); 
     if(this.actionReason != null) builder.append("actionReason" + "->" + this.actionReason.toString() + "\n"); 
     if(this.securityLabel != null) builder.append("securityLabel" + "->" + this.securityLabel.toString() + "\n"); 
     if(this.agent != null) builder.append("agent" + "->" + this.agent.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this._text != null) builder.append("_text" + "->" + this._text.toString() + "\n"); 
     if(this.valuedItem != null) builder.append("valuedItem" + "->" + this.valuedItem.toString() + "\n"); 
     if(this.group != null) builder.append("group" + "->" + this.group.toString() + "\n"); ;
    return builder.toString();
  }


}
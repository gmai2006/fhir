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
import com.google.gson.GsonBuilder;

/**
* "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
*/
public class ContractTerm  {
  /**
  * Description: "Unique identifier for this particular Contract Provision."
  */
  private Identifier identifier;

  /**
  * Description: "When this Contract Provision was issued."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String issued;

  /**
  * Description: "Extensions for issued"
  */
  private transient Element _issued;

  /**
  * Description: "Relevant time or time-period when this Contract Provision is applicable."
  */
  private Period applies;

  /**
  * Description: "Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit."
  */
  private CodeableConcept type;

  /**
  * Description: "Subtype of this Contract Provision, e.g. life time maximum payment for a contract term for specific valued item, e.g. disability payment."
  */
  private CodeableConcept subType;

  /**
  * Description: "The matter of concern in the context of this provision of the agrement."
  */
  private java.util.List<Reference> topic = new java.util.ArrayList<>();

  /**
  * Description: "Action stipulated by this Contract Provision."
  */
  private java.util.List<CodeableConcept> action = new java.util.ArrayList<>();

  /**
  * Description: "Reason or purpose for the action stipulated by this Contract Provision."
  */
  private java.util.List<CodeableConcept> actionReason = new java.util.ArrayList<>();

  /**
  * Description: "A set of security labels that define which terms are controlled by this condition."
  */
  private java.util.List<Coding> securityLabel = new java.util.ArrayList<>();

  /**
  * Description: "An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place."
  */
  private java.util.List<ContractAgent1> agent = new java.util.ArrayList<>();

  /**
  * Description: "Human readable form of this Contract Provision."
  */
  private String text;

  /**
  * Description: "Extensions for text"
  */
  private transient Element _text;

  /**
  * Description: "Contract Provision Valued Item List."
  */
  private java.util.List<ContractValuedItem1> valuedItem = new java.util.ArrayList<>();

  /**
  * Description: "Nested group of Contract Provisions."
  */
  private java.util.List<ContractTerm> group = new java.util.ArrayList<>();

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

  public ContractTerm() {
  }

  public ContractTerm(ContractTermModel o) {
    this.id = o.getId();
      this.identifier = Identifier.fromJson(o.getIdentifier());
      if (null != o.getIssued()) {
        this.issued = new String(o.getIssued());
      }

      this.applies = Period.fromJson(o.getApplies());
      this.type = CodeableConcept.fromJson(o.getType());
      this.subType = CodeableConcept.fromJson(o.getSubType());
      this.topic = Reference.fromArray(o.getTopic());

      this.action = CodeableConcept.fromArray(o.getAction());
      this.actionReason = CodeableConcept.fromArray(o.getActionReason());
      this.securityLabel = Coding.fromArray(o.getSecurityLabel());
      this.agent = ContractAgent1.fromArray(o.getAgent());

      if (null != o.getText()) {
        this.text = new String(o.getText());
      }

      this.valuedItem = ContractValuedItem1.fromArray(o.getValuedItem());

      this.group = ContractTerm.fromArray(o.getGroup());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("issued" + "[" + String.valueOf(this.issued) + "]\n"); 
     builder.append("_issued" + "[" + String.valueOf(this._issued) + "]\n"); 
     builder.append("applies" + "[" + String.valueOf(this.applies) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("subType" + "[" + String.valueOf(this.subType) + "]\n"); 
     builder.append("topic" + "[" + String.valueOf(this.topic) + "]\n"); 
     builder.append("action" + "[" + String.valueOf(this.action) + "]\n"); 
     builder.append("actionReason" + "[" + String.valueOf(this.actionReason) + "]\n"); 
     builder.append("securityLabel" + "[" + String.valueOf(this.securityLabel) + "]\n"); 
     builder.append("agent" + "[" + String.valueOf(this.agent) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("_text" + "[" + String.valueOf(this._text) + "]\n"); 
     builder.append("valuedItem" + "[" + String.valueOf(this.valuedItem) + "]\n"); 
     builder.append("group" + "[" + String.valueOf(this.group) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ContractTerm> fromArray(java.util.List<ContractTermModel> list) {
    return (java.util.List<ContractTerm>)list.stream()
      .map(model -> new ContractTerm(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ContractTermModel> toModelArray(java.util.List<ContractTerm> list) {
    return (java.util.List<ContractTermModel>)list.stream()
      .map(model -> new ContractTermModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ContractTerm fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ContractTerm.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ContractTerm o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ContractTerm> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
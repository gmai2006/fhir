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
import org.fhir.entity.AccountModel;
import com.google.gson.GsonBuilder;

/**
* "A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc."
*/
public class Account  {
  /**
  * Description: "This is a Account resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Unique identifier used to reference the account.  May or may not be intended for human use (e.g. credit card number)."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Indicates whether the account is presently used/usable or not."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Categorizes the account for reporting and searching purposes."
  */
  private CodeableConcept type;

  /**
  * Description: "Name used for the account when displaying it to humans in reports, etc."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "Identifies the patient, device, practitioner, location or other object the account is associated with."
  */
  private Reference subject;

  /**
  * Description: "Identifies the period of time the account applies to; e.g. accounts created per fiscal year, quarter, etc."
  */
  private Period period;

  /**
  * Description: "Indicates the period of time over which the account is allowed to have transactions posted to it.\nThis period may be different to the coveragePeriod which is the duration of time that services may occur."
  */
  private Period active;

  /**
  * Description: "Represents the sum of all credits less all debits associated with the account.  Might be positive, zero or negative."
  */
  private Money balance;

  /**
  * Description: "The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account."
  */
  private java.util.List<AccountCoverage> coverage = new java.util.ArrayList<>();

  /**
  * Description: "Indicates the organization, department, etc. with responsibility for the account."
  */
  private Reference owner;

  /**
  * Description: "Provides additional information about what the account tracks and how it is used."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "Parties financially responsible for the account."
  */
  private java.util.List<AccountGuarantor> guarantor = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  private Narrative text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  */
  private java.util.List<ResourceList> contained = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _language;

  public Account() {
  }

  public Account(AccountModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.type = CodeableConcept.fromJson(o.getType());
      if (null != o.getName()) {
        this.name = new String(o.getName());
      }

      if (null != o.getSubject()) {
        this.subject = new Reference(o.getSubject());
        this.subject.setId(this.getId());
      }

      this.period = Period.fromJson(o.getPeriod());
      this.active = Period.fromJson(o.getActive());
      this.balance = Money.fromJson(o.getBalance());
      this.coverage = AccountCoverage.fromArray(o.getCoverage());

      if (null != o.getOwner()) {
        this.owner = new Reference(o.getOwner());
        this.owner.setId(this.getId());
      }

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      this.guarantor = AccountGuarantor.fromArray(o.getGuarantor());

      if (null != o.getText()) {
        this.text = new Narrative(o.getText());
        this.text.setId(this.getId());
      }

      this.contained = ResourceList.fromArray(o.getContained());
      this.extension = Extension.fromArray(o.getExtension());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      if (null != o.getMeta()) {
        this.meta = new Meta(o.getMeta());
        this.meta.setId(this.getId());
      }

      if (null != o.getImplicitRules()) {
        this.implicitRules = new String(o.getImplicitRules());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
      }

  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
  }
  public void setStatus( String value) {
    this.status = StatusEnum.fromCode(value);
  }
  public String getStatus() {
    return this.status;
  }
  public void set_status( Element value) {
    this._status = value;
  }
  public Element get_status() {
    return this._status;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void set_name( Element value) {
    this._name = value;
  }
  public Element get_name() {
    return this._name;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setActive( Period value) {
    this.active = value;
  }
  public Period getActive() {
    return this.active;
  }
  public void setBalance( Money value) {
    this.balance = value;
  }
  public Money getBalance() {
    return this.balance;
  }
  public void setCoverage( java.util.List<AccountCoverage> value) {
    this.coverage = value;
  }
  public java.util.List<AccountCoverage> getCoverage() {
    return this.coverage;
  }
  public void setOwner( Reference value) {
    this.owner = value;
  }
  public Reference getOwner() {
    return this.owner;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setGuarantor( java.util.List<AccountGuarantor> value) {
    this.guarantor = value;
  }
  public java.util.List<AccountGuarantor> getGuarantor() {
    return this.guarantor;
  }
  public void setText( Narrative value) {
    this.text = value;
  }
  public Narrative getText() {
    return this.text;
  }
  public void setContained( java.util.List<ResourceList> value) {
    this.contained = value;
  }
  public java.util.List<ResourceList> getContained() {
    return this.contained;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
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
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("active" + "[" + String.valueOf(this.active) + "]\n"); 
     builder.append("balance" + "[" + String.valueOf(this.balance) + "]\n"); 
     builder.append("coverage" + "[" + String.valueOf(this.coverage) + "]\n"); 
     builder.append("owner" + "[" + String.valueOf(this.owner) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("guarantor" + "[" + String.valueOf(this.guarantor) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Account,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Account" : { return Account.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	active,
  	inactive,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "active" : { return active.toString(); }
  			case "inactive" : { return inactive.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<Account> fromArray(java.util.List<AccountModel> list) {
    return (java.util.List<Account>)list.stream()
      .map(model -> new Account(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<AccountModel> toModelArray(java.util.List<Account> list) {
    return (java.util.List<AccountModel>)list.stream()
      .map(model -> new AccountModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Account fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Account.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Account o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Account> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
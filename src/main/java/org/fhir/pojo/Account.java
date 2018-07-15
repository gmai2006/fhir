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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Account  extends DomainResource  {
  /**
  * Description: "This is a Account resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Unique identifier used to reference the account.  May or may not be intended for human use (e.g. credit card number)."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "Indicates whether the account is presently used/usable or not."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Categorizes the account for reporting and searching purposes."
  */
  protected CodeableConcept type;

  /**
  * Description: "Name used for the account when displaying it to humans in reports, etc."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "Identifies the patient, device, practitioner, location or other object the account is associated with."
  */
  protected Reference subject;

  /**
  * Description: "Identifies the period of time the account applies to; e.g. accounts created per fiscal year, quarter, etc."
  */
  protected Period period;

  /**
  * Description: "Indicates the period of time over which the account is allowed to have transactions posted to it.\nThis period may be different to the coveragePeriod which is the duration of time that services may occur."
  */
  protected Period active;

  /**
  * Description: "Represents the sum of all credits less all debits associated with the account.  Might be positive, zero or negative."
  */
  protected Money balance;

  /**
  * Description: "The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account."
  */
  protected java.util.List<AccountCoverage> coverage;

  /**
  * Description: "Indicates the organization, department, etc. with responsibility for the account."
  */
  protected Reference owner;

  /**
  * Description: "Provides additional information about what the account tracks and how it is used."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "Parties financially responsible for the account."
  */
  protected java.util.List<AccountGuarantor> guarantor;

  public Account() {
  }

  public Account(AccountModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
    this.active = PeriodHelper.fromJson(o.getActive());
    if (null != o.getBalance() && !o.getBalance().isEmpty()) {
      this.balance = new Money(o.getBalance().get(0));
    }
    if (null != o.getCoverage() && !o.getCoverage().isEmpty()) {
    	this.coverage = AccountCoverageHelper.fromArray2Array(o.getCoverage());
    }
    if (null != o.getOwner() && !o.getOwner().isEmpty()) {
      this.owner = new Reference(o.getOwner().get(0));
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getGuarantor() && !o.getGuarantor().isEmpty()) {
    	this.guarantor = AccountGuarantorHelper.fromArray2Array(o.getGuarantor());
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Account]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.active != null) builder.append("active" + "->" + this.active.toString() + "\n"); 
     if(this.balance != null) builder.append("balance" + "->" + this.balance.toString() + "\n"); 
     if(this.coverage != null) builder.append("coverage" + "->" + this.coverage.toString() + "\n"); 
     if(this.owner != null) builder.append("owner" + "->" + this.owner.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.guarantor != null) builder.append("guarantor" + "->" + this.guarantor.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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

}
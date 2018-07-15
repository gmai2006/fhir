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
import org.fhir.entity.EligibilityRequestModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "The EligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an EligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EligibilityRequest  extends DomainResource  {
  /**
  * Description: "This is a EligibilityRequest resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "The Response business identifier."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "The status of the resource instance."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Immediate (STAT), best effort (NORMAL), deferred (DEFER)."
  */
  protected CodeableConcept priority;

  /**
  * Description: "Patient Resource."
  */
  protected Reference patient;

  /**
  * Description: "The date or dates when the enclosed suite of services were performed or completed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String servicedDate;

  /**
  * Description: "Extensions for servicedDate"
  */
  protected transient Element _servicedDate;

  /**
  * Description: "The date or dates when the enclosed suite of services were performed or completed."
  */
  protected Period servicedPeriod;

  /**
  * Description: "The date when this resource was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String created;

  /**
  * Description: "Extensions for created"
  */
  protected transient Element _created;

  /**
  * Description: "Person who created the invoice/claim/pre-determination or pre-authorization."
  */
  protected Reference enterer;

  /**
  * Description: "The practitioner who is responsible for the services rendered to the patient."
  */
  protected Reference provider;

  /**
  * Description: "The organization which is responsible for the services rendered to the patient."
  */
  protected Reference organization;

  /**
  * Description: "The Insurer who is target  of the request."
  */
  protected Reference insurer;

  /**
  * Description: "Facility where the services were provided."
  */
  protected Reference facility;

  /**
  * Description: "Financial instrument by which payment information for health care."
  */
  protected Reference coverage;

  /**
  * Description: "The contract number of a business agreement which describes the terms and conditions."
  */
  protected String businessArrangement;

  /**
  * Description: "Extensions for businessArrangement"
  */
  protected transient Element _businessArrangement;

  /**
  * Description: "Dental, Vision, Medical, Pharmacy, Rehab etc."
  */
  protected CodeableConcept benefitCategory;

  /**
  * Description: "Dental: basic, major, ortho; Vision exam, glasses, contacts; etc."
  */
  protected CodeableConcept benefitSubCategory;

  public EligibilityRequest() {
  }

  public EligibilityRequest(EligibilityRequestModel o) {
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
    if (null != o.getPriority() && !o.getPriority().isEmpty()) {
      this.priority = new CodeableConcept(o.getPriority().get(0));
    }
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
    }
    if (null != o.getServicedDate()) {
      this.servicedDate = o.getServicedDate();
    }
    this.servicedPeriod = PeriodHelper.fromJson(o.getServicedPeriod());
    if (null != o.getCreated()) {
      this.created = o.getCreated();
    }
    if (null != o.getEnterer() && !o.getEnterer().isEmpty()) {
      this.enterer = new Reference(o.getEnterer().get(0));
    }
    if (null != o.getProvider() && !o.getProvider().isEmpty()) {
      this.provider = new Reference(o.getProvider().get(0));
    }
    if (null != o.getOrganization() && !o.getOrganization().isEmpty()) {
      this.organization = new Reference(o.getOrganization().get(0));
    }
    if (null != o.getInsurer() && !o.getInsurer().isEmpty()) {
      this.insurer = new Reference(o.getInsurer().get(0));
    }
    if (null != o.getFacility() && !o.getFacility().isEmpty()) {
      this.facility = new Reference(o.getFacility().get(0));
    }
    if (null != o.getCoverage() && !o.getCoverage().isEmpty()) {
      this.coverage = new Reference(o.getCoverage().get(0));
    }
    if (null != o.getBusinessArrangement()) {
      this.businessArrangement = o.getBusinessArrangement();
    }
    if (null != o.getBenefitCategory() && !o.getBenefitCategory().isEmpty()) {
      this.benefitCategory = new CodeableConcept(o.getBenefitCategory().get(0));
    }
    if (null != o.getBenefitSubCategory() && !o.getBenefitSubCategory().isEmpty()) {
      this.benefitSubCategory = new CodeableConcept(o.getBenefitSubCategory().get(0));
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
    this.status = value;
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
  public void setPriority( CodeableConcept value) {
    this.priority = value;
  }
  public CodeableConcept getPriority() {
    return this.priority;
  }
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
  }
  public void setServicedDate( String value) {
    this.servicedDate = value;
  }
  public String getServicedDate() {
    return this.servicedDate;
  }
  public void set_servicedDate( Element value) {
    this._servicedDate = value;
  }
  public Element get_servicedDate() {
    return this._servicedDate;
  }
  public void setServicedPeriod( Period value) {
    this.servicedPeriod = value;
  }
  public Period getServicedPeriod() {
    return this.servicedPeriod;
  }
  public void setCreated( String value) {
    this.created = value;
  }
  public String getCreated() {
    return this.created;
  }
  public void set_created( Element value) {
    this._created = value;
  }
  public Element get_created() {
    return this._created;
  }
  public void setEnterer( Reference value) {
    this.enterer = value;
  }
  public Reference getEnterer() {
    return this.enterer;
  }
  public void setProvider( Reference value) {
    this.provider = value;
  }
  public Reference getProvider() {
    return this.provider;
  }
  public void setOrganization( Reference value) {
    this.organization = value;
  }
  public Reference getOrganization() {
    return this.organization;
  }
  public void setInsurer( Reference value) {
    this.insurer = value;
  }
  public Reference getInsurer() {
    return this.insurer;
  }
  public void setFacility( Reference value) {
    this.facility = value;
  }
  public Reference getFacility() {
    return this.facility;
  }
  public void setCoverage( Reference value) {
    this.coverage = value;
  }
  public Reference getCoverage() {
    return this.coverage;
  }
  public void setBusinessArrangement( String value) {
    this.businessArrangement = value;
  }
  public String getBusinessArrangement() {
    return this.businessArrangement;
  }
  public void set_businessArrangement( Element value) {
    this._businessArrangement = value;
  }
  public Element get_businessArrangement() {
    return this._businessArrangement;
  }
  public void setBenefitCategory( CodeableConcept value) {
    this.benefitCategory = value;
  }
  public CodeableConcept getBenefitCategory() {
    return this.benefitCategory;
  }
  public void setBenefitSubCategory( CodeableConcept value) {
    this.benefitSubCategory = value;
  }
  public CodeableConcept getBenefitSubCategory() {
    return this.benefitSubCategory;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[EligibilityRequest]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.priority != null) builder.append("priority" + "->" + this.priority.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.servicedDate != null) builder.append("servicedDate" + "->" + this.servicedDate.toString() + "\n"); 
     if(this._servicedDate != null) builder.append("_servicedDate" + "->" + this._servicedDate.toString() + "\n"); 
     if(this.servicedPeriod != null) builder.append("servicedPeriod" + "->" + this.servicedPeriod.toString() + "\n"); 
     if(this.created != null) builder.append("created" + "->" + this.created.toString() + "\n"); 
     if(this._created != null) builder.append("_created" + "->" + this._created.toString() + "\n"); 
     if(this.enterer != null) builder.append("enterer" + "->" + this.enterer.toString() + "\n"); 
     if(this.provider != null) builder.append("provider" + "->" + this.provider.toString() + "\n"); 
     if(this.organization != null) builder.append("organization" + "->" + this.organization.toString() + "\n"); 
     if(this.insurer != null) builder.append("insurer" + "->" + this.insurer.toString() + "\n"); 
     if(this.facility != null) builder.append("facility" + "->" + this.facility.toString() + "\n"); 
     if(this.coverage != null) builder.append("coverage" + "->" + this.coverage.toString() + "\n"); 
     if(this.businessArrangement != null) builder.append("businessArrangement" + "->" + this.businessArrangement.toString() + "\n"); 
     if(this._businessArrangement != null) builder.append("_businessArrangement" + "->" + this._businessArrangement.toString() + "\n"); 
     if(this.benefitCategory != null) builder.append("benefitCategory" + "->" + this.benefitCategory.toString() + "\n"); 
     if(this.benefitSubCategory != null) builder.append("benefitSubCategory" + "->" + this.benefitSubCategory.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	EligibilityRequest,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "EligibilityRequest" : { return EligibilityRequest.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}
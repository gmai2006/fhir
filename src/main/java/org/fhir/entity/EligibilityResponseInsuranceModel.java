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
* "This resource provides eligibility and plan details from the processing of an Eligibility resource."
*/
@Entity
@Table(name="eligibilityresponseinsurance")
public class EligibilityResponseInsuranceModel  {
  /**
  * Description: "A suite of updated or additional Coverages from the Insurer."
  */
  @javax.persistence.Basic
  @Column(name="\"coverage_id\"")
  private String coverage_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`coverage_id`", insertable=false, updatable=false)
  private ReferenceModel coverage;

  /**
  * Description: "The contract resource which may provide more detailed information."
  */
  @javax.persistence.Basic
  @Column(name="\"contract_id\"")
  private String contract_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`contract_id`", insertable=false, updatable=false)
  private ReferenceModel contract;

  /**
  * Description: "Benefits and optionally current balances by Category."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<EligibilityResponseBenefitBalanceModel> benefitBalance = new java.util.ArrayList<>();

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

  public EligibilityResponseInsuranceModel() {
  }

  public EligibilityResponseInsuranceModel(EligibilityResponseInsurance o) {
    this.id = o.getId();
      if (null != o.getCoverage()) {
      	this.coverage_id = "coverage" + this.getId();
        this.coverage = new ReferenceModel(o.getCoverage());
        this.coverage.setId(this.coverage_id);
        this.coverage.parent_id = this.coverage.getId();
      }

      if (null != o.getContract()) {
      	this.contract_id = "contract" + this.getId();
        this.contract = new ReferenceModel(o.getContract());
        this.contract.setId(this.contract_id);
        this.contract.parent_id = this.contract.getId();
      }

      this.benefitBalance = EligibilityResponseBenefitBalance.toModelArray(o.getBenefitBalance());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setCoverage( ReferenceModel value) {
    this.coverage = value;
  }
  public ReferenceModel getCoverage() {
    return this.coverage;
  }
  public void setContract( ReferenceModel value) {
    this.contract = value;
  }
  public ReferenceModel getContract() {
    return this.contract;
  }
  public void setBenefitBalance( java.util.List<EligibilityResponseBenefitBalanceModel> value) {
    this.benefitBalance = value;
  }
  public java.util.List<EligibilityResponseBenefitBalanceModel> getBenefitBalance() {
    return this.benefitBalance;
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
     builder.append("coverage" + "[" + String.valueOf(this.coverage) + "]\n"); 
     builder.append("contract" + "[" + String.valueOf(this.contract) + "]\n"); 
     builder.append("benefitBalance" + "[" + String.valueOf(this.benefitBalance) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
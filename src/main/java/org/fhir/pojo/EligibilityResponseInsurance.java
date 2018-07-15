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
import org.fhir.entity.EligibilityResponseInsuranceModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "This resource provides eligibility and plan details from the processing of an Eligibility resource."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EligibilityResponseInsurance  extends BackboneElement  {
  /**
  * Description: "A suite of updated or additional Coverages from the Insurer."
  */
  protected Reference coverage;

  /**
  * Description: "The contract resource which may provide more detailed information."
  */
  protected Reference contract;

  /**
  * Description: "Benefits and optionally current balances by Category."
  */
  protected java.util.List<EligibilityResponseBenefitBalance> benefitBalance;

  public EligibilityResponseInsurance() {
  }

  public EligibilityResponseInsurance(EligibilityResponseInsuranceModel o) {
    this.id = o.getId();
    if (null != o.getCoverage() && !o.getCoverage().isEmpty()) {
      this.coverage = new Reference(o.getCoverage().get(0));
    }
    if (null != o.getContract() && !o.getContract().isEmpty()) {
      this.contract = new Reference(o.getContract().get(0));
    }
    if (null != o.getBenefitBalance() && !o.getBenefitBalance().isEmpty()) {
    	this.benefitBalance = EligibilityResponseBenefitBalanceHelper.fromArray2Array(o.getBenefitBalance());
    }
  }

  public void setCoverage( Reference value) {
    this.coverage = value;
  }
  public Reference getCoverage() {
    return this.coverage;
  }
  public void setContract( Reference value) {
    this.contract = value;
  }
  public Reference getContract() {
    return this.contract;
  }
  public void setBenefitBalance( java.util.List<EligibilityResponseBenefitBalance> value) {
    this.benefitBalance = value;
  }
  public java.util.List<EligibilityResponseBenefitBalance> getBenefitBalance() {
    return this.benefitBalance;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[EligibilityResponseInsurance]:" + "\n");
     if(this.coverage != null) builder.append("coverage" + "->" + this.coverage.toString() + "\n"); 
     if(this.contract != null) builder.append("contract" + "->" + this.contract.toString() + "\n"); 
     if(this.benefitBalance != null) builder.append("benefitBalance" + "->" + this.benefitBalance.toString() + "\n"); ;
    return builder.toString();
  }


}
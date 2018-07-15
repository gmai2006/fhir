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
import org.fhir.entity.MedicationRequestDispenseRequestModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MedicationRequestDispenseRequest  extends BackboneElement  {
  /**
  * Description: "This indicates the validity period of a prescription (stale dating the Prescription)."
  */
  protected Period validityPeriod;

  /**
  * Description: "An integer indicating the number of times, in addition to the original dispense, (aka refills or repeats) that the patient can receive the prescribed medication. Usage Notes: This integer does not include the original order dispense. This means that if an order indicates dispense 30 tablets plus \"3 repeats\", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float numberOfRepeatsAllowed;

  /**
  * Description: "Extensions for numberOfRepeatsAllowed"
  */
  protected transient Element _numberOfRepeatsAllowed;

  /**
  * Description: "The amount that is to be dispensed for one fill."
  */
  protected Quantity quantity;

  /**
  * Description: "Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last."
  */
  protected Duration expectedSupplyDuration;

  /**
  * Description: "Indicates the intended dispensing Organization specified by the prescriber."
  */
  protected Reference performer;

  public MedicationRequestDispenseRequest() {
  }

  public MedicationRequestDispenseRequest(MedicationRequestDispenseRequestModel o) {
    this.id = o.getId();
    this.validityPeriod = PeriodHelper.fromJson(o.getValidityPeriod());
    if (null != o.getNumberOfRepeatsAllowed()) {
      this.numberOfRepeatsAllowed = o.getNumberOfRepeatsAllowed();
    }
    if (null != o.getQuantity() && !o.getQuantity().isEmpty()) {
      this.quantity = new Quantity(o.getQuantity().get(0));
    }
    this.expectedSupplyDuration = DurationHelper.fromJson(o.getExpectedSupplyDuration());
    if (null != o.getPerformer() && !o.getPerformer().isEmpty()) {
      this.performer = new Reference(o.getPerformer().get(0));
    }
  }

  public void setValidityPeriod( Period value) {
    this.validityPeriod = value;
  }
  public Period getValidityPeriod() {
    return this.validityPeriod;
  }
  public void setNumberOfRepeatsAllowed( Float value) {
    this.numberOfRepeatsAllowed = value;
  }
  public Float getNumberOfRepeatsAllowed() {
    return this.numberOfRepeatsAllowed;
  }
  public void set_numberOfRepeatsAllowed( Element value) {
    this._numberOfRepeatsAllowed = value;
  }
  public Element get_numberOfRepeatsAllowed() {
    return this._numberOfRepeatsAllowed;
  }
  public void setQuantity( Quantity value) {
    this.quantity = value;
  }
  public Quantity getQuantity() {
    return this.quantity;
  }
  public void setExpectedSupplyDuration( Duration value) {
    this.expectedSupplyDuration = value;
  }
  public Duration getExpectedSupplyDuration() {
    return this.expectedSupplyDuration;
  }
  public void setPerformer( Reference value) {
    this.performer = value;
  }
  public Reference getPerformer() {
    return this.performer;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MedicationRequestDispenseRequest]:" + "\n");
     if(this.validityPeriod != null) builder.append("validityPeriod" + "->" + this.validityPeriod.toString() + "\n"); 
     if(this.numberOfRepeatsAllowed != null) builder.append("numberOfRepeatsAllowed" + "->" + this.numberOfRepeatsAllowed.toString() + "\n"); 
     if(this._numberOfRepeatsAllowed != null) builder.append("_numberOfRepeatsAllowed" + "->" + this._numberOfRepeatsAllowed.toString() + "\n"); 
     if(this.quantity != null) builder.append("quantity" + "->" + this.quantity.toString() + "\n"); 
     if(this.expectedSupplyDuration != null) builder.append("expectedSupplyDuration" + "->" + this.expectedSupplyDuration.toString() + "\n"); 
     if(this.performer != null) builder.append("performer" + "->" + this.performer.toString() + "\n"); ;
    return builder.toString();
  }


}
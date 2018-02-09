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
* "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns."
*/
@Entity
@Table(name="medicationrequestdispenserequest")
public class MedicationRequestDispenseRequestModel  {
  /**
  * Description: "This indicates the validity period of a prescription (stale dating the Prescription)."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"validityPeriod\"", length = 16777215)
  private String validityPeriod;

  /**
  * Description: "An integer indicating the number of times, in addition to the original dispense, (aka refills or repeats) that the patient can receive the prescribed medication. Usage Notes: This integer does not include the original order dispense. This means that if an order indicates dispense 30 tablets plus \"3 repeats\", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"numberOfRepeatsAllowed\"")
  private Float numberOfRepeatsAllowed;

  /**
  * Description: "The amount that is to be dispensed for one fill."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"quantity\"", length = 16777215)
  private String quantity;

  /**
  * Description: "Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last."
  * Actual type: Duration
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"expectedSupplyDuration\"", length = 16777215)
  private String expectedSupplyDuration;

  /**
  * Description: "Indicates the intended dispensing Organization specified by the prescriber."
  */
  @javax.persistence.Basic
  @Column(name="\"performer_id\"")
  private String performer_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`performer_id`", insertable=false, updatable=false)
  private ReferenceModel performer;

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

  public MedicationRequestDispenseRequestModel() {
  }

  public MedicationRequestDispenseRequestModel(MedicationRequestDispenseRequest o) {
    this.id = o.getId();
      this.validityPeriod = Period.toJson(o.getValidityPeriod());
      this.numberOfRepeatsAllowed = o.getNumberOfRepeatsAllowed();

      this.quantity = Quantity.toJson(o.getQuantity());
      this.expectedSupplyDuration = Duration.toJson(o.getExpectedSupplyDuration());
      if (null != o.getPerformer()) {
      	this.performer_id = "performer" + this.getId();
        this.performer = new ReferenceModel(o.getPerformer());
        this.performer.setId(this.performer_id);
        this.performer.parent_id = this.performer.getId();
      }

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setValidityPeriod( String value) {
    this.validityPeriod = value;
  }
  public String getValidityPeriod() {
    return this.validityPeriod;
  }
  public void setNumberOfRepeatsAllowed( Float value) {
    this.numberOfRepeatsAllowed = value;
  }
  public Float getNumberOfRepeatsAllowed() {
    return this.numberOfRepeatsAllowed;
  }
  public void setQuantity( String value) {
    this.quantity = value;
  }
  public String getQuantity() {
    return this.quantity;
  }
  public void setExpectedSupplyDuration( String value) {
    this.expectedSupplyDuration = value;
  }
  public String getExpectedSupplyDuration() {
    return this.expectedSupplyDuration;
  }
  public void setPerformer( ReferenceModel value) {
    this.performer = value;
  }
  public ReferenceModel getPerformer() {
    return this.performer;
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
     builder.append("validityPeriod" + "[" + String.valueOf(this.validityPeriod) + "]\n"); 
     builder.append("numberOfRepeatsAllowed" + "[" + String.valueOf(this.numberOfRepeatsAllowed) + "]\n"); 
     builder.append("quantity" + "[" + String.valueOf(this.quantity) + "]\n"); 
     builder.append("expectedSupplyDuration" + "[" + String.valueOf(this.expectedSupplyDuration) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
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
import com.google.gson.GsonBuilder;

/**
* "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns."
*/
public class MedicationRequestDispenseRequest  {
  /**
  * Description: "This indicates the validity period of a prescription (stale dating the Prescription)."
  */
  private Period validityPeriod;

  /**
  * Description: "An integer indicating the number of times, in addition to the original dispense, (aka refills or repeats) that the patient can receive the prescribed medication. Usage Notes: This integer does not include the original order dispense. This means that if an order indicates dispense 30 tablets plus \"3 repeats\", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float numberOfRepeatsAllowed;

  /**
  * Description: "Extensions for numberOfRepeatsAllowed"
  */
  private transient Element _numberOfRepeatsAllowed;

  /**
  * Description: "The amount that is to be dispensed for one fill."
  */
  private Quantity quantity;

  /**
  * Description: "Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last."
  */
  private Duration expectedSupplyDuration;

  /**
  * Description: "Indicates the intended dispensing Organization specified by the prescriber."
  */
  private Reference performer;

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

  public MedicationRequestDispenseRequest() {
  }

  public MedicationRequestDispenseRequest(MedicationRequestDispenseRequestModel o) {
    this.id = o.getId();
      this.validityPeriod = Period.fromJson(o.getValidityPeriod());
      if (null != o.getNumberOfRepeatsAllowed()) {
        this.numberOfRepeatsAllowed = new Float(o.getNumberOfRepeatsAllowed());
      }

      this.quantity = Quantity.fromJson(o.getQuantity());
      this.expectedSupplyDuration = Duration.fromJson(o.getExpectedSupplyDuration());
      if (null != o.getPerformer()) {
        this.performer = new Reference(o.getPerformer());
        this.performer.setId(this.getId());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
     builder.append("validityPeriod" + "[" + String.valueOf(this.validityPeriod) + "]\n"); 
     builder.append("numberOfRepeatsAllowed" + "[" + String.valueOf(this.numberOfRepeatsAllowed) + "]\n"); 
     builder.append("_numberOfRepeatsAllowed" + "[" + String.valueOf(this._numberOfRepeatsAllowed) + "]\n"); 
     builder.append("quantity" + "[" + String.valueOf(this.quantity) + "]\n"); 
     builder.append("expectedSupplyDuration" + "[" + String.valueOf(this.expectedSupplyDuration) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<MedicationRequestDispenseRequest> fromArray(java.util.List<MedicationRequestDispenseRequestModel> list) {
    return (java.util.List<MedicationRequestDispenseRequest>)list.stream()
      .map(model -> new MedicationRequestDispenseRequest(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<MedicationRequestDispenseRequestModel> toModelArray(java.util.List<MedicationRequestDispenseRequest> list) {
    return (java.util.List<MedicationRequestDispenseRequestModel>)list.stream()
      .map(model -> new MedicationRequestDispenseRequestModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static MedicationRequestDispenseRequest fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, MedicationRequestDispenseRequest.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(MedicationRequestDispenseRequest o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<MedicationRequestDispenseRequest> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
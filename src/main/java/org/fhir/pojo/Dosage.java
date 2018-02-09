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
import org.fhir.entity.DosageModel;
import com.google.gson.GsonBuilder;

/**
* "Indicates how the medication is/was taken or should be taken by the patient."
*/
public class Dosage  {
  /**
  * Description: "Indicates the order in which the dosage instructions should be applied or interpreted."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float sequence;

  /**
  * Description: "Extensions for sequence"
  */
  private transient Element _sequence;

  /**
  * Description: "Free text dosage instructions e.g. SIG."
  */
  private String text;

  /**
  * Description: "Extensions for text"
  */
  private transient Element _text;

  /**
  * Description: "Supplemental instruction - e.g. \"with meals\"."
  */
  private java.util.List<CodeableConcept> additionalInstruction = new java.util.ArrayList<>();

  /**
  * Description: "Instructions in terms that are understood by the patient or consumer."
  */
  private String patientInstruction;

  /**
  * Description: "Extensions for patientInstruction"
  */
  private transient Element _patientInstruction;

  /**
  * Description: "When medication should be administered."
  */
  private Timing timing;

  /**
  * Description: "Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept)."
  */
  private Boolean asNeededBoolean;

  /**
  * Description: "Extensions for asNeededBoolean"
  */
  private transient Element _asNeededBoolean;

  /**
  * Description: "Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept)."
  */
  private CodeableConcept asNeededCodeableConcept;

  /**
  * Description: "Body site to administer to."
  */
  private CodeableConcept site;

  /**
  * Description: "How drug should enter body."
  */
  private CodeableConcept route;

  /**
  * Description: "Technique for administering medication."
  */
  private CodeableConcept method;

  /**
  * Description: "Amount of medication per dose."
  */
  private Range doseRange;

  /**
  * Description: "Amount of medication per dose."
  */
  private Quantity doseSimpleQuantity;

  /**
  * Description: "Upper limit on medication per unit of time."
  */
  private Ratio maxDosePerPeriod;

  /**
  * Description: "Upper limit on medication per administration."
  */
  private Quantity maxDosePerAdministration;

  /**
  * Description: "Upper limit on medication per lifetime of the patient."
  */
  private Quantity maxDosePerLifetime;

  /**
  * Description: "Amount of medication per unit of time."
  */
  private Ratio rateRatio;

  /**
  * Description: "Amount of medication per unit of time."
  */
  private Range rateRange;

  /**
  * Description: "Amount of medication per unit of time."
  */
  private Quantity rateSimpleQuantity;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public Dosage() {
  }

  public Dosage(DosageModel o) {
    this.id = o.getId();
      if (null != o.getSequence()) {
        this.sequence = new Float(o.getSequence());
      }

      if (null != o.getText()) {
        this.text = new String(o.getText());
      }

      this.additionalInstruction = CodeableConcept.fromArray(o.getAdditionalInstruction());
      if (null != o.getPatientInstruction()) {
        this.patientInstruction = new String(o.getPatientInstruction());
      }

      this.timing = Timing.fromJson(o.getTiming());
      if (null != o.getAsNeededBoolean()) {
        this.asNeededBoolean = new Boolean(o.getAsNeededBoolean());
      }

      this.asNeededCodeableConcept = CodeableConcept.fromJson(o.getAsNeededCodeableConcept());
      this.site = CodeableConcept.fromJson(o.getSite());
      this.route = CodeableConcept.fromJson(o.getRoute());
      this.method = CodeableConcept.fromJson(o.getMethod());
      this.doseRange = Range.fromJson(o.getDoseRange());
      this.doseSimpleQuantity = Quantity.fromJson(o.getDoseSimpleQuantity());
      this.maxDosePerPeriod = Ratio.fromJson(o.getMaxDosePerPeriod());
      this.maxDosePerAdministration = Quantity.fromJson(o.getMaxDosePerAdministration());
      this.maxDosePerLifetime = Quantity.fromJson(o.getMaxDosePerLifetime());
      this.rateRatio = Ratio.fromJson(o.getRateRatio());
      this.rateRange = Range.fromJson(o.getRateRange());
      this.rateSimpleQuantity = Quantity.fromJson(o.getRateSimpleQuantity());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setSequence( Float value) {
    this.sequence = value;
  }
  public Float getSequence() {
    return this.sequence;
  }
  public void set_sequence( Element value) {
    this._sequence = value;
  }
  public Element get_sequence() {
    return this._sequence;
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
  public void setAdditionalInstruction( java.util.List<CodeableConcept> value) {
    this.additionalInstruction = value;
  }
  public java.util.List<CodeableConcept> getAdditionalInstruction() {
    return this.additionalInstruction;
  }
  public void setPatientInstruction( String value) {
    this.patientInstruction = value;
  }
  public String getPatientInstruction() {
    return this.patientInstruction;
  }
  public void set_patientInstruction( Element value) {
    this._patientInstruction = value;
  }
  public Element get_patientInstruction() {
    return this._patientInstruction;
  }
  public void setTiming( Timing value) {
    this.timing = value;
  }
  public Timing getTiming() {
    return this.timing;
  }
  public void setAsNeededBoolean( Boolean value) {
    this.asNeededBoolean = value;
  }
  public Boolean getAsNeededBoolean() {
    return this.asNeededBoolean;
  }
  public void set_asNeededBoolean( Element value) {
    this._asNeededBoolean = value;
  }
  public Element get_asNeededBoolean() {
    return this._asNeededBoolean;
  }
  public void setAsNeededCodeableConcept( CodeableConcept value) {
    this.asNeededCodeableConcept = value;
  }
  public CodeableConcept getAsNeededCodeableConcept() {
    return this.asNeededCodeableConcept;
  }
  public void setSite( CodeableConcept value) {
    this.site = value;
  }
  public CodeableConcept getSite() {
    return this.site;
  }
  public void setRoute( CodeableConcept value) {
    this.route = value;
  }
  public CodeableConcept getRoute() {
    return this.route;
  }
  public void setMethod( CodeableConcept value) {
    this.method = value;
  }
  public CodeableConcept getMethod() {
    return this.method;
  }
  public void setDoseRange( Range value) {
    this.doseRange = value;
  }
  public Range getDoseRange() {
    return this.doseRange;
  }
  public void setDoseSimpleQuantity( Quantity value) {
    this.doseSimpleQuantity = value;
  }
  public Quantity getDoseSimpleQuantity() {
    return this.doseSimpleQuantity;
  }
  public void setMaxDosePerPeriod( Ratio value) {
    this.maxDosePerPeriod = value;
  }
  public Ratio getMaxDosePerPeriod() {
    return this.maxDosePerPeriod;
  }
  public void setMaxDosePerAdministration( Quantity value) {
    this.maxDosePerAdministration = value;
  }
  public Quantity getMaxDosePerAdministration() {
    return this.maxDosePerAdministration;
  }
  public void setMaxDosePerLifetime( Quantity value) {
    this.maxDosePerLifetime = value;
  }
  public Quantity getMaxDosePerLifetime() {
    return this.maxDosePerLifetime;
  }
  public void setRateRatio( Ratio value) {
    this.rateRatio = value;
  }
  public Ratio getRateRatio() {
    return this.rateRatio;
  }
  public void setRateRange( Range value) {
    this.rateRange = value;
  }
  public Range getRateRange() {
    return this.rateRange;
  }
  public void setRateSimpleQuantity( Quantity value) {
    this.rateSimpleQuantity = value;
  }
  public Quantity getRateSimpleQuantity() {
    return this.rateSimpleQuantity;
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
     builder.append("sequence" + "[" + String.valueOf(this.sequence) + "]\n"); 
     builder.append("_sequence" + "[" + String.valueOf(this._sequence) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("_text" + "[" + String.valueOf(this._text) + "]\n"); 
     builder.append("additionalInstruction" + "[" + String.valueOf(this.additionalInstruction) + "]\n"); 
     builder.append("patientInstruction" + "[" + String.valueOf(this.patientInstruction) + "]\n"); 
     builder.append("_patientInstruction" + "[" + String.valueOf(this._patientInstruction) + "]\n"); 
     builder.append("timing" + "[" + String.valueOf(this.timing) + "]\n"); 
     builder.append("asNeededBoolean" + "[" + String.valueOf(this.asNeededBoolean) + "]\n"); 
     builder.append("_asNeededBoolean" + "[" + String.valueOf(this._asNeededBoolean) + "]\n"); 
     builder.append("asNeededCodeableConcept" + "[" + String.valueOf(this.asNeededCodeableConcept) + "]\n"); 
     builder.append("site" + "[" + String.valueOf(this.site) + "]\n"); 
     builder.append("route" + "[" + String.valueOf(this.route) + "]\n"); 
     builder.append("method" + "[" + String.valueOf(this.method) + "]\n"); 
     builder.append("doseRange" + "[" + String.valueOf(this.doseRange) + "]\n"); 
     builder.append("doseSimpleQuantity" + "[" + String.valueOf(this.doseSimpleQuantity) + "]\n"); 
     builder.append("maxDosePerPeriod" + "[" + String.valueOf(this.maxDosePerPeriod) + "]\n"); 
     builder.append("maxDosePerAdministration" + "[" + String.valueOf(this.maxDosePerAdministration) + "]\n"); 
     builder.append("maxDosePerLifetime" + "[" + String.valueOf(this.maxDosePerLifetime) + "]\n"); 
     builder.append("rateRatio" + "[" + String.valueOf(this.rateRatio) + "]\n"); 
     builder.append("rateRange" + "[" + String.valueOf(this.rateRange) + "]\n"); 
     builder.append("rateSimpleQuantity" + "[" + String.valueOf(this.rateSimpleQuantity) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<Dosage> fromArray(java.util.List<DosageModel> list) {
    return (java.util.List<Dosage>)list.stream()
      .map(model -> new Dosage(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<DosageModel> toModelArray(java.util.List<Dosage> list) {
    return (java.util.List<DosageModel>)list.stream()
      .map(model -> new DosageModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Dosage fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Dosage.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Dosage o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Dosage> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
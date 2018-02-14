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
import org.fhir.entity.SpecimenCollectionModel;
import com.google.gson.GsonBuilder;

/**
* "A sample to be used for analysis."
*/
public class SpecimenCollection  {
  /**
  * Description: "Person who collected the specimen."
  */
  private Reference collector;

  /**
  * Description: "Time when specimen was collected from subject - the physiologically relevant time."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String collectedDateTime;

  /**
  * Description: "Extensions for collectedDateTime"
  */
  private transient Element _collectedDateTime;

  /**
  * Description: "Time when specimen was collected from subject - the physiologically relevant time."
  */
  private Period collectedPeriod;

  /**
  * Description: "The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample."
  */
  private Quantity quantity;

  /**
  * Description: "A coded value specifying the technique that is used to perform the procedure."
  */
  private CodeableConcept method;

  /**
  * Description: "Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens."
  */
  private CodeableConcept bodySite;

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
  @javax.validation.constraints.NotNull
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

  public SpecimenCollection() {
  }

  public SpecimenCollection(SpecimenCollectionModel o) {
    this.id = o.getId();
    if (null != o.getCollector() && !o.getCollector().isEmpty()) {
      this.collector = new Reference(o.getCollector().get(0));
    }
    if (null != o.getCollectedDateTime()) {
      this.collectedDateTime = o.getCollectedDateTime();
    }
    this.collectedPeriod = PeriodHelper.fromJson(o.getCollectedPeriod());
    this.quantity = QuantityHelper.fromJson(o.getQuantity());
    this.method = CodeableConceptHelper.fromJson(o.getMethod());
    this.bodySite = CodeableConceptHelper.fromJson(o.getBodySite());
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setCollector( Reference value) {
    this.collector = value;
  }
  public Reference getCollector() {
    return this.collector;
  }
  public void setCollectedDateTime( String value) {
    this.collectedDateTime = value;
  }
  public String getCollectedDateTime() {
    return this.collectedDateTime;
  }
  public void set_collectedDateTime( Element value) {
    this._collectedDateTime = value;
  }
  public Element get_collectedDateTime() {
    return this._collectedDateTime;
  }
  public void setCollectedPeriod( Period value) {
    this.collectedPeriod = value;
  }
  public Period getCollectedPeriod() {
    return this.collectedPeriod;
  }
  public void setQuantity( Quantity value) {
    this.quantity = value;
  }
  public Quantity getQuantity() {
    return this.quantity;
  }
  public void setMethod( CodeableConcept value) {
    this.method = value;
  }
  public CodeableConcept getMethod() {
    return this.method;
  }
  public void setBodySite( CodeableConcept value) {
    this.bodySite = value;
  }
  public CodeableConcept getBodySite() {
    return this.bodySite;
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
    builder.append("[SpecimenCollection]:" + "\n");
     if(this.collector != null) builder.append("collector" + "->" + this.collector.toString() + "\n"); 
     if(this.collectedDateTime != null) builder.append("collectedDateTime" + "->" + this.collectedDateTime.toString() + "\n"); 
     if(this._collectedDateTime != null) builder.append("_collectedDateTime" + "->" + this._collectedDateTime.toString() + "\n"); 
     if(this.collectedPeriod != null) builder.append("collectedPeriod" + "->" + this.collectedPeriod.toString() + "\n"); 
     if(this.quantity != null) builder.append("quantity" + "->" + this.quantity.toString() + "\n"); 
     if(this.method != null) builder.append("method" + "->" + this.method.toString() + "\n"); 
     if(this.bodySite != null) builder.append("bodySite" + "->" + this.bodySite.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}
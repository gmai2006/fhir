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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A sample to be used for analysis."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SpecimenCollection  extends BackboneElement  {
  /**
  * Description: "Person who collected the specimen."
  */
  protected Reference collector;

  /**
  * Description: "Time when specimen was collected from subject - the physiologically relevant time."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String collectedDateTime;

  /**
  * Description: "Extensions for collectedDateTime"
  */
  protected transient Element _collectedDateTime;

  /**
  * Description: "Time when specimen was collected from subject - the physiologically relevant time."
  */
  protected Period collectedPeriod;

  /**
  * Description: "The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample."
  */
  protected Quantity quantity;

  /**
  * Description: "A coded value specifying the technique that is used to perform the procedure."
  */
  protected CodeableConcept method;

  /**
  * Description: "Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens."
  */
  protected CodeableConcept bodySite;

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
    if (null != o.getQuantity() && !o.getQuantity().isEmpty()) {
      this.quantity = new Quantity(o.getQuantity().get(0));
    }
    if (null != o.getMethod() && !o.getMethod().isEmpty()) {
      this.method = new CodeableConcept(o.getMethod().get(0));
    }
    if (null != o.getBodySite() && !o.getBodySite().isEmpty()) {
      this.bodySite = new CodeableConcept(o.getBodySite().get(0));
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
     if(this.bodySite != null) builder.append("bodySite" + "->" + this.bodySite.toString() + "\n"); ;
    return builder.toString();
  }


}
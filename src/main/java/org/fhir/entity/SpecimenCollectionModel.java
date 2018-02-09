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
* "A sample to be used for analysis."
*/
@Entity
@Table(name="specimencollection")
public class SpecimenCollectionModel  {
  /**
  * Description: "Person who collected the specimen."
  */
  @javax.persistence.Basic
  @Column(name="\"collector_id\"")
  private String collector_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`collector_id`", insertable=false, updatable=false)
  private ReferenceModel collector;

  /**
  * Description: "Time when specimen was collected from subject - the physiologically relevant time."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"collectedDateTime\"")
  private String collectedDateTime;

  /**
  * Description: "Time when specimen was collected from subject - the physiologically relevant time."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"collectedPeriod\"", length = 16777215)
  private String collectedPeriod;

  /**
  * Description: "The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"quantity\"", length = 16777215)
  private String quantity;

  /**
  * Description: "A coded value specifying the technique that is used to perform the procedure."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"method\"", length = 16777215)
  private String method;

  /**
  * Description: "Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"bodySite\"", length = 16777215)
  private String bodySite;

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

  public SpecimenCollectionModel() {
  }

  public SpecimenCollectionModel(SpecimenCollection o) {
    this.id = o.getId();
      if (null != o.getCollector()) {
      	this.collector_id = "collector" + this.getId();
        this.collector = new ReferenceModel(o.getCollector());
        this.collector.setId(this.collector_id);
        this.collector.parent_id = this.collector.getId();
      }

      this.collectedDateTime = o.getCollectedDateTime();

      this.collectedPeriod = Period.toJson(o.getCollectedPeriod());
      this.quantity = Quantity.toJson(o.getQuantity());
      this.method = CodeableConcept.toJson(o.getMethod());
      this.bodySite = CodeableConcept.toJson(o.getBodySite());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setCollector( ReferenceModel value) {
    this.collector = value;
  }
  public ReferenceModel getCollector() {
    return this.collector;
  }
  public void setCollectedDateTime( String value) {
    this.collectedDateTime = value;
  }
  public String getCollectedDateTime() {
    return this.collectedDateTime;
  }
  public void setCollectedPeriod( String value) {
    this.collectedPeriod = value;
  }
  public String getCollectedPeriod() {
    return this.collectedPeriod;
  }
  public void setQuantity( String value) {
    this.quantity = value;
  }
  public String getQuantity() {
    return this.quantity;
  }
  public void setMethod( String value) {
    this.method = value;
  }
  public String getMethod() {
    return this.method;
  }
  public void setBodySite( String value) {
    this.bodySite = value;
  }
  public String getBodySite() {
    return this.bodySite;
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
     builder.append("collector" + "[" + String.valueOf(this.collector) + "]\n"); 
     builder.append("collectedDateTime" + "[" + String.valueOf(this.collectedDateTime) + "]\n"); 
     builder.append("collectedPeriod" + "[" + String.valueOf(this.collectedPeriod) + "]\n"); 
     builder.append("quantity" + "[" + String.valueOf(this.quantity) + "]\n"); 
     builder.append("method" + "[" + String.valueOf(this.method) + "]\n"); 
     builder.append("bodySite" + "[" + String.valueOf(this.bodySite) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
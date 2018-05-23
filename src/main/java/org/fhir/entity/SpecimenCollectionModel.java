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
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "A sample to be used for analysis."
*/
@Entity
@Table(name="specimencollection")
public class SpecimenCollectionModel  implements Serializable {
	private static final long serialVersionUID = 151967883162696644L;
  /**
  * Description: "Person who collected the specimen."
  */
  @javax.persistence.Basic
  @Column(name="\"collector_id\"")
  private String collector_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="collector_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> collector;

  /**
  * Description: "Time when specimen was collected from subject - the physiologically relevant time."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"collectedDateTime\"")
  private String collectedDateTime;

  /**
  * Description: "Time when specimen was collected from subject - the physiologically relevant time."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"collectedPeriod\"", length = 16777215)
  private String collectedPeriod;

  /**
  * Description: "The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample."
  */
  @javax.persistence.Basic
  @Column(name="\"quantity_id\"")
  private String quantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="quantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> quantity;

  /**
  * Description: "A coded value specifying the technique that is used to perform the procedure."
  */
  @javax.persistence.Basic
  @Column(name="\"method_id\"")
  private String method_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="method_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> method;

  /**
  * Description: "Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens."
  */
  @javax.persistence.Basic
  @Column(name="\"bodysite_id\"")
  private String bodysite_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="bodysite_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> bodySite;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public SpecimenCollectionModel() {
  }

  public SpecimenCollectionModel(SpecimenCollection o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getCollector() ) {
    	this.collector_id = "collector" + this.id;
    	this.collector = ReferenceHelper.toModel(o.getCollector(), this.collector_id);
    }
    this.collectedDateTime = o.getCollectedDateTime();
    if (null != o.getCollectedPeriod()) {
    	this.collectedPeriod = JsonUtils.toJson(o.getCollectedPeriod());
    }
    if (null != o.getQuantity() ) {
    	this.quantity_id = "quantity" + this.id;
    	this.quantity = QuantityHelper.toModel(o.getQuantity(), this.quantity_id);
    }
    if (null != o.getMethod() ) {
    	this.method_id = "method" + this.id;
    	this.method = CodeableConceptHelper.toModel(o.getMethod(), this.method_id);
    }
    if (null != o.getBodySite() ) {
    	this.bodysite_id = "bodysite" + this.id;
    	this.bodySite = CodeableConceptHelper.toModel(o.getBodySite(), this.bodysite_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<ReferenceModel> getCollector() {
    return this.collector;
  }
  public void setCollector( java.util.List<ReferenceModel> value) {
    this.collector = value;
  }
  public String getCollectedDateTime() {
    return this.collectedDateTime;
  }
  public void setCollectedDateTime( String value) {
    this.collectedDateTime = value;
  }
  public String getCollectedPeriod() {
    return this.collectedPeriod;
  }
  public void setCollectedPeriod( String value) {
    this.collectedPeriod = value;
  }
  public java.util.List<QuantityModel> getQuantity() {
    return this.quantity;
  }
  public void setQuantity( java.util.List<QuantityModel> value) {
    this.quantity = value;
  }
  public java.util.List<CodeableConceptModel> getMethod() {
    return this.method;
  }
  public void setMethod( java.util.List<CodeableConceptModel> value) {
    this.method = value;
  }
  public java.util.List<CodeableConceptModel> getBodySite() {
    return this.bodySite;
  }
  public void setBodySite( java.util.List<CodeableConceptModel> value) {
    this.bodySite = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SpecimenCollectionModel]:" + "\n");
     builder.append("collectedDateTime" + "->" + this.collectedDateTime + "\n"); 
     builder.append("collectedPeriod" + "->" + this.collectedPeriod + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SpecimenCollectionModel]:" + "\n");
     builder.append("collector" + "->" + this.collector + "\n"); 
     builder.append("collectedDateTime" + "->" + this.collectedDateTime + "\n"); 
     builder.append("collectedPeriod" + "->" + this.collectedPeriod + "\n"); 
     builder.append("quantity" + "->" + this.quantity + "\n"); 
     builder.append("method" + "->" + this.method + "\n"); 
     builder.append("bodySite" + "->" + this.bodySite + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}
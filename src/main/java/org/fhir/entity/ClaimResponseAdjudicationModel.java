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
* "This resource provides the adjudication details from the processing of a Claim resource."
* generated on 07/14/2018
*/
@Entity
@Table(name="claimresponseadjudication")
public class ClaimResponseAdjudicationModel  implements Serializable {
	private static final long serialVersionUID = 153159210205790497L;
  /**
  * Description: "Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"category_id\"")
  private String category_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="category_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> category;

  /**
  * Description: "Adjudication reason such as limit reached."
  */
  @javax.persistence.Basic
  @Column(name="\"reason_id\"")
  private String reason_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="reason_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> reason;

  /**
  * Description: "Monetary amount associated with the code."
  */
  @javax.persistence.Basic
  @Column(name="\"amount_id\"")
  private String amount_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="amount_id", insertable=false, updatable=false)
  private java.util.List<MoneyModel> amount;

  /**
  * Description: "A non-monetary value for example a percentage. Mutually exclusive to the amount element above."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"value\"")
  private Float value;

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

  public ClaimResponseAdjudicationModel() {
  }

  public ClaimResponseAdjudicationModel(ClaimResponseAdjudication o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getCategory() ) {
    	this.category_id = "category" + this.id;
    	this.category = CodeableConceptHelper.toModel(o.getCategory(), this.category_id);
    }
    if (null != o.getReason() ) {
    	this.reason_id = "reason" + this.id;
    	this.reason = CodeableConceptHelper.toModel(o.getReason(), this.reason_id);
    }
    if (null != o.getAmount() ) {
    	this.amount_id = "amount" + this.id;
    	this.amount = MoneyHelper.toModel(o.getAmount(), this.amount_id);
    }
    this.value = o.getValue();
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodeableConceptModel> getCategory() {
    return this.category;
  }
  public void setCategory( java.util.List<CodeableConceptModel> value) {
    this.category = value;
  }
  public java.util.List<CodeableConceptModel> getReason() {
    return this.reason;
  }
  public void setReason( java.util.List<CodeableConceptModel> value) {
    this.reason = value;
  }
  public java.util.List<MoneyModel> getAmount() {
    return this.amount;
  }
  public void setAmount( java.util.List<MoneyModel> value) {
    this.amount = value;
  }
  public Float getValue() {
    return this.value;
  }
  public void setValue( Float value) {
    this.value = value;
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
    builder.append("[ClaimResponseAdjudicationModel]:" + "\n");
     builder.append("value" + "->" + this.value + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimResponseAdjudicationModel]:" + "\n");
     builder.append("value" + "->" + this.value + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}
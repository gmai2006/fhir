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
/**
* "This resource provides eligibility and plan details from the processing of an Eligibility resource."
*/
@Entity
@Table(name="eligibilityresponsefinancial")
public class EligibilityResponseFinancialModel  implements Serializable {
	private static final long serialVersionUID = 151857669657333984L;
  /**
  * Description: "Deductable, visits, benefit amount."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "Benefits allowed."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  @javax.persistence.Basic
  @Column(name="\"allowedUnsignedInt\"")
  private Float allowedUnsignedInt;

  /**
  * Description: "Benefits allowed."
  */
  @javax.persistence.Basic
  @Column(name="\"allowedString\"")
  private String allowedString;

  /**
  * Description: "Benefits allowed."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"allowedMoney\"", length = 16777215)
  private String allowedMoney;

  /**
  * Description: "Benefits used."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  @javax.persistence.Basic
  @Column(name="\"usedUnsignedInt\"")
  private Float usedUnsignedInt;

  /**
  * Description: "Benefits used."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"usedMoney\"", length = 16777215)
  private String usedMoney;

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
  @Column(name="\"parent_id\"")
  private String parent_id;

  public EligibilityResponseFinancialModel() {
  }

  public EligibilityResponseFinancialModel(EligibilityResponseFinancial o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.type = CodeableConceptHelper.toJson(o.getType());
    this.allowedUnsignedInt = o.getAllowedUnsignedInt();
    this.allowedString = o.getAllowedString();
    this.allowedMoney = MoneyHelper.toJson(o.getAllowedMoney());
    this.usedUnsignedInt = o.getUsedUnsignedInt();
    this.usedMoney = MoneyHelper.toJson(o.getUsedMoney());
  }

  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public Float getAllowedUnsignedInt() {
    return this.allowedUnsignedInt;
  }
  public void setAllowedUnsignedInt( Float value) {
    this.allowedUnsignedInt = value;
  }
  public String getAllowedString() {
    return this.allowedString;
  }
  public void setAllowedString( String value) {
    this.allowedString = value;
  }
  public String getAllowedMoney() {
    return this.allowedMoney;
  }
  public void setAllowedMoney( String value) {
    this.allowedMoney = value;
  }
  public Float getUsedUnsignedInt() {
    return this.usedUnsignedInt;
  }
  public void setUsedUnsignedInt( Float value) {
    this.usedUnsignedInt = value;
  }
  public String getUsedMoney() {
    return this.usedMoney;
  }
  public void setUsedMoney( String value) {
    this.usedMoney = value;
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
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[EligibilityResponseFinancialModel]:" + "\n");
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("allowedUnsignedInt" + "->" + this.allowedUnsignedInt + "\n"); 
     builder.append("allowedString" + "->" + this.allowedString + "\n"); 
     builder.append("allowedMoney" + "->" + this.allowedMoney + "\n"); 
     builder.append("usedUnsignedInt" + "->" + this.usedUnsignedInt + "\n"); 
     builder.append("usedMoney" + "->" + this.usedMoney + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[EligibilityResponseFinancialModel]:" + "\n");
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("allowedUnsignedInt" + "->" + this.allowedUnsignedInt + "\n"); 
     builder.append("allowedString" + "->" + this.allowedString + "\n"); 
     builder.append("allowedMoney" + "->" + this.allowedMoney + "\n"); 
     builder.append("usedUnsignedInt" + "->" + this.usedUnsignedInt + "\n"); 
     builder.append("usedMoney" + "->" + this.usedMoney + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}
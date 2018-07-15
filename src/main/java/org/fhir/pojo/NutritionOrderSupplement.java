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
import org.fhir.entity.NutritionOrderSupplementModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class NutritionOrderSupplement  extends BackboneElement  {
  /**
  * Description: "The kind of nutritional supplement product required such as a high protein or pediatric clear liquid supplement."
  */
  protected CodeableConcept type;

  /**
  * Description: "The product or brand name of the nutritional supplement such as \"Acme Protein Shake\"."
  */
  protected String productName;

  /**
  * Description: "Extensions for productName"
  */
  protected transient Element _productName;

  /**
  * Description: "The time period and frequency at which the supplement(s) should be given.  The supplement should be given for the combination of all schedules if more than one schedule is present."
  */
  protected java.util.List<Timing> schedule;

  /**
  * Description: "The amount of the nutritional supplement to be given."
  */
  protected Quantity quantity;

  /**
  * Description: "Free text or additional instructions or information pertaining to the oral supplement."
  */
  protected String instruction;

  /**
  * Description: "Extensions for instruction"
  */
  protected transient Element _instruction;

  public NutritionOrderSupplement() {
  }

  public NutritionOrderSupplement(NutritionOrderSupplementModel o) {
    this.id = o.getId();
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getProductName()) {
      this.productName = o.getProductName();
    }
    if (o.getSchedule() != null) {
    	this.schedule = org.fhir.utils.JsonUtils.json2Array(o.getSchedule());
    }
    if (null != o.getQuantity() && !o.getQuantity().isEmpty()) {
      this.quantity = new Quantity(o.getQuantity().get(0));
    }
    if (null != o.getInstruction()) {
      this.instruction = o.getInstruction();
    }
  }

  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setProductName( String value) {
    this.productName = value;
  }
  public String getProductName() {
    return this.productName;
  }
  public void set_productName( Element value) {
    this._productName = value;
  }
  public Element get_productName() {
    return this._productName;
  }
  public void setSchedule( java.util.List<Timing> value) {
    this.schedule = value;
  }
  public java.util.List<Timing> getSchedule() {
    return this.schedule;
  }
  public void setQuantity( Quantity value) {
    this.quantity = value;
  }
  public Quantity getQuantity() {
    return this.quantity;
  }
  public void setInstruction( String value) {
    this.instruction = value;
  }
  public String getInstruction() {
    return this.instruction;
  }
  public void set_instruction( Element value) {
    this._instruction = value;
  }
  public Element get_instruction() {
    return this._instruction;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[NutritionOrderSupplement]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.productName != null) builder.append("productName" + "->" + this.productName.toString() + "\n"); 
     if(this._productName != null) builder.append("_productName" + "->" + this._productName.toString() + "\n"); 
     if(this.schedule != null) builder.append("schedule" + "->" + this.schedule.toString() + "\n"); 
     if(this.quantity != null) builder.append("quantity" + "->" + this.quantity.toString() + "\n"); 
     if(this.instruction != null) builder.append("instruction" + "->" + this.instruction.toString() + "\n"); 
     if(this._instruction != null) builder.append("_instruction" + "->" + this._instruction.toString() + "\n"); ;
    return builder.toString();
  }


}
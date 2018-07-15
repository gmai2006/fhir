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
import org.fhir.entity.NutritionOrderAdministrationModel;
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
public class NutritionOrderAdministration  extends BackboneElement  {
  /**
  * Description: "The time period and frequency at which the enteral formula should be delivered to the patient."
  */
  protected Timing schedule;

  /**
  * Description: "The volume of formula to provide to the patient per the specified administration schedule."
  */
  protected Quantity quantity;

  /**
  * Description: "The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to the specified schedule."
  */
  protected Quantity rateSimpleQuantity;

  /**
  * Description: "The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to the specified schedule."
  */
  protected Ratio rateRatio;

  public NutritionOrderAdministration() {
  }

  public NutritionOrderAdministration(NutritionOrderAdministrationModel o) {
    this.id = o.getId();
    this.schedule = TimingHelper.fromJson(o.getSchedule());
    if (null != o.getQuantity() && !o.getQuantity().isEmpty()) {
      this.quantity = new Quantity(o.getQuantity().get(0));
    }
    if (null != o.getRateSimpleQuantity() && !o.getRateSimpleQuantity().isEmpty()) {
      this.rateSimpleQuantity = new Quantity(o.getRateSimpleQuantity().get(0));
    }
    this.rateRatio = RatioHelper.fromJson(o.getRateRatio());
  }

  public void setSchedule( Timing value) {
    this.schedule = value;
  }
  public Timing getSchedule() {
    return this.schedule;
  }
  public void setQuantity( Quantity value) {
    this.quantity = value;
  }
  public Quantity getQuantity() {
    return this.quantity;
  }
  public void setRateSimpleQuantity( Quantity value) {
    this.rateSimpleQuantity = value;
  }
  public Quantity getRateSimpleQuantity() {
    return this.rateSimpleQuantity;
  }
  public void setRateRatio( Ratio value) {
    this.rateRatio = value;
  }
  public Ratio getRateRatio() {
    return this.rateRatio;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[NutritionOrderAdministration]:" + "\n");
     if(this.schedule != null) builder.append("schedule" + "->" + this.schedule.toString() + "\n"); 
     if(this.quantity != null) builder.append("quantity" + "->" + this.quantity.toString() + "\n"); 
     if(this.rateSimpleQuantity != null) builder.append("rateSimpleQuantity" + "->" + this.rateSimpleQuantity.toString() + "\n"); 
     if(this.rateRatio != null) builder.append("rateRatio" + "->" + this.rateRatio.toString() + "\n"); ;
    return builder.toString();
  }


}
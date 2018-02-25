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
import org.fhir.entity.AccountGuarantorModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AccountGuarantor  extends BackboneElement  {
  /**
  * Description: "The entity who is responsible."
  */
  @javax.validation.constraints.NotNull
  protected Reference party;

  /**
  * Description: "A guarantor may be placed on credit hold or otherwise have their role temporarily suspended."
  */
  protected Boolean onHold;

  /**
  * Description: "Extensions for onHold"
  */
  protected transient Element _onHold;

  /**
  * Description: "The timeframe during which the guarantor accepts responsibility for the account."
  */
  protected Period period;

  public AccountGuarantor() {
  }

  public AccountGuarantor(AccountGuarantorModel o) {
    this.id = o.getId();
    if (null != o.getParty() && !o.getParty().isEmpty()) {
      this.party = new Reference(o.getParty().get(0));
    }
    if (null != o.getOnHold()) {
      this.onHold = o.getOnHold();
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
  }

  public void setParty( Reference value) {
    this.party = value;
  }
  public Reference getParty() {
    return this.party;
  }
  public void setOnHold( Boolean value) {
    this.onHold = value;
  }
  public Boolean getOnHold() {
    return this.onHold;
  }
  public void set_onHold( Element value) {
    this._onHold = value;
  }
  public Element get_onHold() {
    return this._onHold;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AccountGuarantor]:" + "\n");
     if(this.party != null) builder.append("party" + "->" + this.party.toString() + "\n"); 
     if(this.onHold != null) builder.append("onHold" + "->" + this.onHold.toString() + "\n"); 
     if(this._onHold != null) builder.append("_onHold" + "->" + this._onHold.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); ;
    return builder.toString();
  }


}
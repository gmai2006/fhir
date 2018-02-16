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
import org.fhir.entity.AccountCoverageModel;
import com.google.gson.GsonBuilder;

/**
* "A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc."
*/
public class AccountCoverage  extends BackboneElement  {
  /**
  * Description: "The party(s) that are responsible for payment (or part of) of charges applied to this account (including self-pay).\n\nA coverage may only be resposible for specific types of charges, and the sequence of the coverages in the account could be important when processing billing."
  */
  @javax.validation.constraints.NotNull
  protected Reference coverage;

  /**
  * Description: "The priority of the coverage in the context of this account."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float priority;

  /**
  * Description: "Extensions for priority"
  */
  protected transient Element _priority;

  public AccountCoverage() {
  }

  public AccountCoverage(AccountCoverageModel o) {
    this.id = o.getId();
    if (null != o.getCoverage() && !o.getCoverage().isEmpty()) {
      this.coverage = new Reference(o.getCoverage().get(0));
    }
    if (null != o.getPriority()) {
      this.priority = o.getPriority();
    }
  }

  public void setCoverage( Reference value) {
    this.coverage = value;
  }
  public Reference getCoverage() {
    return this.coverage;
  }
  public void setPriority( Float value) {
    this.priority = value;
  }
  public Float getPriority() {
    return this.priority;
  }
  public void set_priority( Element value) {
    this._priority = value;
  }
  public Element get_priority() {
    return this._priority;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AccountCoverage]:" + "\n");
     if(this.coverage != null) builder.append("coverage" + "->" + this.coverage.toString() + "\n"); 
     if(this.priority != null) builder.append("priority" + "->" + this.priority.toString() + "\n"); 
     if(this._priority != null) builder.append("_priority" + "->" + this._priority.toString() + "\n"); ;
    return builder.toString();
  }


}
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
import org.fhir.entity.TaskRestrictionModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A task to be performed."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TaskRestriction  extends BackboneElement  {
  /**
  * Description: "Indicates the number of times the requested action should occur."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float repetitions;

  /**
  * Description: "Extensions for repetitions"
  */
  protected transient Element _repetitions;

  /**
  * Description: "Over what time-period is fulfillment sought."
  */
  protected Period period;

  /**
  * Description: "For requests that are targeted to more than on potential recipient/target, for whom is fulfillment sought?"
  */
  protected java.util.List<Reference> recipient;

  public TaskRestriction() {
  }

  public TaskRestriction(TaskRestrictionModel o) {
    this.id = o.getId();
    if (null != o.getRepetitions()) {
      this.repetitions = o.getRepetitions();
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
    if (null != o.getRecipient() && !o.getRecipient().isEmpty()) {
    	this.recipient = ReferenceHelper.fromArray2Array(o.getRecipient());
    }
  }

  public void setRepetitions( Float value) {
    this.repetitions = value;
  }
  public Float getRepetitions() {
    return this.repetitions;
  }
  public void set_repetitions( Element value) {
    this._repetitions = value;
  }
  public Element get_repetitions() {
    return this._repetitions;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setRecipient( java.util.List<Reference> value) {
    this.recipient = value;
  }
  public java.util.List<Reference> getRecipient() {
    return this.recipient;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TaskRestriction]:" + "\n");
     if(this.repetitions != null) builder.append("repetitions" + "->" + this.repetitions.toString() + "\n"); 
     if(this._repetitions != null) builder.append("_repetitions" + "->" + this._repetitions.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.recipient != null) builder.append("recipient" + "->" + this.recipient.toString() + "\n"); ;
    return builder.toString();
  }


}
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
import org.fhir.entity.UsageContextModel;
import com.google.gson.GsonBuilder;

/**
* "Specifies clinical/business/etc metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care)."
*/
public class UsageContext  extends Element  {
  /**
  * Description: "A code that identifies the type of context being specified by this usage context."
  */
  @javax.validation.constraints.NotNull
  protected Coding code;

  /**
  * Description: "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code."
  */
  protected CodeableConcept valueCodeableConcept;

  /**
  * Description: "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code."
  */
  protected Quantity valueQuantity;

  /**
  * Description: "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code."
  */
  protected Range valueRange;

  public UsageContext() {
  }

  public UsageContext(UsageContextModel o) {
    this.id = o.getId();
    if (null != o.getCode() && !o.getCode().isEmpty()) {
      this.code = new Coding(o.getCode().get(0));
    }
    if (null != o.getValueCodeableConcept() && !o.getValueCodeableConcept().isEmpty()) {
      this.valueCodeableConcept = new CodeableConcept(o.getValueCodeableConcept().get(0));
    }
    if (null != o.getValueQuantity() && !o.getValueQuantity().isEmpty()) {
      this.valueQuantity = new Quantity(o.getValueQuantity().get(0));
    }
    this.valueRange = RangeHelper.fromJson(o.getValueRange());
  }

  public void setCode( Coding value) {
    this.code = value;
  }
  public Coding getCode() {
    return this.code;
  }
  public void setValueCodeableConcept( CodeableConcept value) {
    this.valueCodeableConcept = value;
  }
  public CodeableConcept getValueCodeableConcept() {
    return this.valueCodeableConcept;
  }
  public void setValueQuantity( Quantity value) {
    this.valueQuantity = value;
  }
  public Quantity getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueRange( Range value) {
    this.valueRange = value;
  }
  public Range getValueRange() {
    return this.valueRange;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[UsageContext]:" + "\n");
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.valueCodeableConcept != null) builder.append("valueCodeableConcept" + "->" + this.valueCodeableConcept.toString() + "\n"); 
     if(this.valueQuantity != null) builder.append("valueQuantity" + "->" + this.valueQuantity.toString() + "\n"); 
     if(this.valueRange != null) builder.append("valueRange" + "->" + this.valueRange.toString() + "\n"); ;
    return builder.toString();
  }


}
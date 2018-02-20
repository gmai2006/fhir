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
import org.fhir.entity.PractitionerQualificationModel;
import com.google.gson.GsonBuilder;

/**
* "A person who is directly or indirectly involved in the provisioning of healthcare."
*/
public class PractitionerQualification  extends BackboneElement  {
  /**
  * Description: "An identifier that applies to this person's qualification in this role."
  */
  protected java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Coded representation of the qualification."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept code;

  /**
  * Description: "Period during which the qualification is valid."
  */
  protected Period period;

  /**
  * Description: "Organization that regulates and issues the qualification."
  */
  protected Reference issuer;

  public PractitionerQualification() {
  }

  public PractitionerQualification(PractitionerQualificationModel o) {
    this.id = o.getId();
    if (null != o.getCode() && !o.getCode().isEmpty()) {
      this.code = new CodeableConcept(o.getCode().get(0));
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
    if (null != o.getIssuer() && !o.getIssuer().isEmpty()) {
      this.issuer = new Reference(o.getIssuer().get(0));
    }
  }

  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setIssuer( Reference value) {
    this.issuer = value;
  }
  public Reference getIssuer() {
    return this.issuer;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PractitionerQualification]:" + "\n");
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.issuer != null) builder.append("issuer" + "->" + this.issuer.toString() + "\n"); ;
    return builder.toString();
  }


}
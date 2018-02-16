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
import org.fhir.entity.ClaimPayeeModel;
import com.google.gson.GsonBuilder;

/**
* "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
*/
public class ClaimPayee  extends BackboneElement  {
  /**
  * Description: "Type of Party to be reimbursed: Subscriber, provider, other."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept type;

  /**
  * Description: "organization | patient | practitioner | relatedperson."
  */
  protected Coding resourceType;

  /**
  * Description: "Party to be reimbursed: Subscriber, provider, other."
  */
  protected Reference party;

  public ClaimPayee() {
  }

  public ClaimPayee(ClaimPayeeModel o) {
    this.id = o.getId();
    this.type = CodeableConceptHelper.fromJson(o.getType());
    this.resourceType = CodingHelper.fromJson(o.getResourceType());
    if (null != o.getParty() && !o.getParty().isEmpty()) {
      this.party = new Reference(o.getParty().get(0));
    }
  }

  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setResourceType( Coding value) {
    this.resourceType = value;
  }
  public Coding getResourceType() {
    return this.resourceType;
  }
  public void setParty( Reference value) {
    this.party = value;
  }
  public Reference getParty() {
    return this.party;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimPayee]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.party != null) builder.append("party" + "->" + this.party.toString() + "\n"); ;
    return builder.toString();
  }


}
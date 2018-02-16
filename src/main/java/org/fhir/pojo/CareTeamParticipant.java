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
import org.fhir.entity.CareTeamParticipantModel;
import com.google.gson.GsonBuilder;

/**
* "The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient."
*/
public class CareTeamParticipant  extends BackboneElement  {
  /**
  * Description: "Indicates specific responsibility of an individual within the care team, such as \"Primary care physician\", \"Trained social worker counselor\", \"Caregiver\", etc."
  */
  protected CodeableConcept role;

  /**
  * Description: "The specific person or organization who is participating/expected to participate in the care team."
  */
  protected Reference member;

  /**
  * Description: "The organization of the practitioner."
  */
  protected Reference onBehalfOf;

  /**
  * Description: "Indicates when the specific member or organization did (or is intended to) come into effect and end."
  */
  protected Period period;

  public CareTeamParticipant() {
  }

  public CareTeamParticipant(CareTeamParticipantModel o) {
    this.id = o.getId();
    this.role = CodeableConceptHelper.fromJson(o.getRole());
    if (null != o.getMember() && !o.getMember().isEmpty()) {
      this.member = new Reference(o.getMember().get(0));
    }
    if (null != o.getOnBehalfOf() && !o.getOnBehalfOf().isEmpty()) {
      this.onBehalfOf = new Reference(o.getOnBehalfOf().get(0));
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
  }

  public void setRole( CodeableConcept value) {
    this.role = value;
  }
  public CodeableConcept getRole() {
    return this.role;
  }
  public void setMember( Reference value) {
    this.member = value;
  }
  public Reference getMember() {
    return this.member;
  }
  public void setOnBehalfOf( Reference value) {
    this.onBehalfOf = value;
  }
  public Reference getOnBehalfOf() {
    return this.onBehalfOf;
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
    builder.append("[CareTeamParticipant]:" + "\n");
     if(this.role != null) builder.append("role" + "->" + this.role.toString() + "\n"); 
     if(this.member != null) builder.append("member" + "->" + this.member.toString() + "\n"); 
     if(this.onBehalfOf != null) builder.append("onBehalfOf" + "->" + this.onBehalfOf.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); ;
    return builder.toString();
  }


}
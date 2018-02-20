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
import org.fhir.entity.EncounterParticipantModel;
import com.google.gson.GsonBuilder;

/**
* "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
*/
public class EncounterParticipant  extends BackboneElement  {
  /**
  * Description: "Role of participant in encounter."
  */
  protected java.util.List<CodeableConcept> type = new java.util.ArrayList<>();

  /**
  * Description: "The period of time that the specified participant participated in the encounter. These can overlap or be sub-sets of the overall encounter's period."
  */
  protected Period period;

  /**
  * Description: "Persons involved in the encounter other than the patient."
  */
  protected Reference individual;

  public EncounterParticipant() {
  }

  public EncounterParticipant(EncounterParticipantModel o) {
    this.id = o.getId();
    if (null != o.getType() && !o.getType().isEmpty()) {
    	this.type = CodeableConceptHelper.fromArray2Array(o.getType());
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
    if (null != o.getIndividual() && !o.getIndividual().isEmpty()) {
      this.individual = new Reference(o.getIndividual().get(0));
    }
  }

  public void setType( java.util.List<CodeableConcept> value) {
    this.type = value;
  }
  public java.util.List<CodeableConcept> getType() {
    return this.type;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setIndividual( Reference value) {
    this.individual = value;
  }
  public Reference getIndividual() {
    return this.individual;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[EncounterParticipant]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.individual != null) builder.append("individual" + "->" + this.individual.toString() + "\n"); ;
    return builder.toString();
  }


}
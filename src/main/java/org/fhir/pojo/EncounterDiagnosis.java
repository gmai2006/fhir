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
import org.fhir.entity.EncounterDiagnosisModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EncounterDiagnosis  extends BackboneElement  {
  /**
  * Description: "Reason the encounter takes place, as specified using information from another resource. For admissions, this is the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure."
  */
  @javax.validation.constraints.NotNull
  protected Reference condition;

  /**
  * Description: "Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …)."
  */
  protected CodeableConcept role;

  /**
  * Description: "Ranking of the diagnosis (for each role type)."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float rank;

  /**
  * Description: "Extensions for rank"
  */
  protected transient Element _rank;

  public EncounterDiagnosis() {
  }

  public EncounterDiagnosis(EncounterDiagnosisModel o) {
    this.id = o.getId();
    if (null != o.getCondition() && !o.getCondition().isEmpty()) {
      this.condition = new Reference(o.getCondition().get(0));
    }
    if (null != o.getRole() && !o.getRole().isEmpty()) {
      this.role = new CodeableConcept(o.getRole().get(0));
    }
    if (null != o.getRank()) {
      this.rank = o.getRank();
    }
  }

  public void setCondition( Reference value) {
    this.condition = value;
  }
  public Reference getCondition() {
    return this.condition;
  }
  public void setRole( CodeableConcept value) {
    this.role = value;
  }
  public CodeableConcept getRole() {
    return this.role;
  }
  public void setRank( Float value) {
    this.rank = value;
  }
  public Float getRank() {
    return this.rank;
  }
  public void set_rank( Element value) {
    this._rank = value;
  }
  public Element get_rank() {
    return this._rank;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[EncounterDiagnosis]:" + "\n");
     if(this.condition != null) builder.append("condition" + "->" + this.condition.toString() + "\n"); 
     if(this.role != null) builder.append("role" + "->" + this.role.toString() + "\n"); 
     if(this.rank != null) builder.append("rank" + "->" + this.rank.toString() + "\n"); 
     if(this._rank != null) builder.append("_rank" + "->" + this._rank.toString() + "\n"); ;
    return builder.toString();
  }


}
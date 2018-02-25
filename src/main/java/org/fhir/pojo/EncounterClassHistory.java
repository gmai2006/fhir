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
import org.fhir.entity.EncounterClassHistoryModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EncounterClassHistory  extends BackboneElement  {
  /**
  * Description: "inpatient | outpatient | ambulatory | emergency +."
  */
  protected Coding FHIRclass;

  /**
  * Description: "The time that the episode was in the specified class."
  */
  @javax.validation.constraints.NotNull
  protected Period period;

  public EncounterClassHistory() {
  }

  public EncounterClassHistory(EncounterClassHistoryModel o) {
    this.id = o.getId();
    if (null != o.getFHIRclass() && !o.getFHIRclass().isEmpty()) {
      this.FHIRclass = new Coding(o.getFHIRclass().get(0));
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
  }

  public void setFHIRclass( Coding value) {
    this.FHIRclass = value;
  }
  public Coding getFHIRclass() {
    return this.FHIRclass;
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
    builder.append("[EncounterClassHistory]:" + "\n");
     if(this.FHIRclass != null) builder.append("FHIRclass" + "->" + this.FHIRclass.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); ;
    return builder.toString();
  }


}
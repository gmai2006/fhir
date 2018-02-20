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
import org.fhir.entity.DiagnosticReportPerformerModel;
import com.google.gson.GsonBuilder;

/**
* "The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports."
*/
public class DiagnosticReportPerformer  extends BackboneElement  {
  /**
  * Description: "Describes the type of participation (e.g.  a responsible party, author, or verifier)."
  */
  protected CodeableConcept role;

  /**
  * Description: "The reference to the  practitioner or organization involved in producing the report. For example, the diagnostic service that is responsible for issuing the report."
  */
  @javax.validation.constraints.NotNull
  protected Reference actor;

  public DiagnosticReportPerformer() {
  }

  public DiagnosticReportPerformer(DiagnosticReportPerformerModel o) {
    this.id = o.getId();
    if (null != o.getRole() && !o.getRole().isEmpty()) {
      this.role = new CodeableConcept(o.getRole().get(0));
    }
    if (null != o.getActor() && !o.getActor().isEmpty()) {
      this.actor = new Reference(o.getActor().get(0));
    }
  }

  public void setRole( CodeableConcept value) {
    this.role = value;
  }
  public CodeableConcept getRole() {
    return this.role;
  }
  public void setActor( Reference value) {
    this.actor = value;
  }
  public Reference getActor() {
    return this.actor;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DiagnosticReportPerformer]:" + "\n");
     if(this.role != null) builder.append("role" + "->" + this.role.toString() + "\n"); 
     if(this.actor != null) builder.append("actor" + "->" + this.actor.toString() + "\n"); ;
    return builder.toString();
  }


}
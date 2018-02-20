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
import org.fhir.entity.ClinicalImpressionFindingModel;
import com.google.gson.GsonBuilder;

/**
* "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score."
*/
public class ClinicalImpressionFinding  extends BackboneElement  {
  /**
  * Description: "Specific text, code or reference for finding or diagnosis, which may include ruled-out or resolved conditions."
  */
  protected CodeableConcept itemCodeableConcept;

  /**
  * Description: "Specific text, code or reference for finding or diagnosis, which may include ruled-out or resolved conditions."
  */
  protected Reference itemReference;

  /**
  * Description: "Which investigations support finding or diagnosis."
  */
  protected String basis;

  /**
  * Description: "Extensions for basis"
  */
  protected transient Element _basis;

  public ClinicalImpressionFinding() {
  }

  public ClinicalImpressionFinding(ClinicalImpressionFindingModel o) {
    this.id = o.getId();
    if (null != o.getItemCodeableConcept() && !o.getItemCodeableConcept().isEmpty()) {
      this.itemCodeableConcept = new CodeableConcept(o.getItemCodeableConcept().get(0));
    }
    if (null != o.getItemReference() && !o.getItemReference().isEmpty()) {
      this.itemReference = new Reference(o.getItemReference().get(0));
    }
    if (null != o.getBasis()) {
      this.basis = o.getBasis();
    }
  }

  public void setItemCodeableConcept( CodeableConcept value) {
    this.itemCodeableConcept = value;
  }
  public CodeableConcept getItemCodeableConcept() {
    return this.itemCodeableConcept;
  }
  public void setItemReference( Reference value) {
    this.itemReference = value;
  }
  public Reference getItemReference() {
    return this.itemReference;
  }
  public void setBasis( String value) {
    this.basis = value;
  }
  public String getBasis() {
    return this.basis;
  }
  public void set_basis( Element value) {
    this._basis = value;
  }
  public Element get_basis() {
    return this._basis;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClinicalImpressionFinding]:" + "\n");
     if(this.itemCodeableConcept != null) builder.append("itemCodeableConcept" + "->" + this.itemCodeableConcept.toString() + "\n"); 
     if(this.itemReference != null) builder.append("itemReference" + "->" + this.itemReference.toString() + "\n"); 
     if(this.basis != null) builder.append("basis" + "->" + this.basis.toString() + "\n"); 
     if(this._basis != null) builder.append("_basis" + "->" + this._basis.toString() + "\n"); ;
    return builder.toString();
  }


}
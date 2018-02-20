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
import org.fhir.entity.ClinicalImpressionInvestigationModel;
import com.google.gson.GsonBuilder;

/**
* "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score."
*/
public class ClinicalImpressionInvestigation  extends BackboneElement  {
  /**
  * Description: "A name/code for the group (\"set\") of investigations. Typically, this will be something like \"signs\", \"symptoms\", \"clinical\", \"diagnostic\", but the list is not constrained, and others such groups such as (exposure|family|travel|nutitirional) history may be used."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept code;

  /**
  * Description: "A record of a specific investigation that was undertaken."
  */
  protected java.util.List<Reference> item = new java.util.ArrayList<>();

  public ClinicalImpressionInvestigation() {
  }

  public ClinicalImpressionInvestigation(ClinicalImpressionInvestigationModel o) {
    this.id = o.getId();
    if (null != o.getCode() && !o.getCode().isEmpty()) {
      this.code = new CodeableConcept(o.getCode().get(0));
    }
    if (null != o.getItem() && !o.getItem().isEmpty()) {
    	this.item = ReferenceHelper.fromArray2Array(o.getItem());
    }
  }

  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setItem( java.util.List<Reference> value) {
    this.item = value;
  }
  public java.util.List<Reference> getItem() {
    return this.item;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClinicalImpressionInvestigation]:" + "\n");
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.item != null) builder.append("item" + "->" + this.item.toString() + "\n"); ;
    return builder.toString();
  }


}
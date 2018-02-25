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
import org.fhir.entity.AdverseEventSuspectEntityModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AdverseEventSuspectEntity  extends BackboneElement  {
  /**
  * Description: "Identifies the actual instance of what caused the adverse event.  May be a substance, medication, medication administration, medication statement or a device."
  */
  @javax.validation.constraints.NotNull
  protected Reference instance;

  /**
  * Description: "causality1 | causality2."
  */
  protected String causality;

  /**
  * Description: "Extensions for causality"
  */
  protected transient Element _causality;

  /**
  * Description: "assess1 | assess2."
  */
  protected CodeableConcept causalityAssessment;

  /**
  * Description: "AdverseEvent.suspectEntity.causalityProductRelatedness."
  */
  protected String causalityProductRelatedness;

  /**
  * Description: "Extensions for causalityProductRelatedness"
  */
  protected transient Element _causalityProductRelatedness;

  /**
  * Description: "method1 | method2."
  */
  protected CodeableConcept causalityMethod;

  /**
  * Description: "AdverseEvent.suspectEntity.causalityAuthor."
  */
  protected Reference causalityAuthor;

  /**
  * Description: "result1 | result2."
  */
  protected CodeableConcept causalityResult;

  public AdverseEventSuspectEntity() {
  }

  public AdverseEventSuspectEntity(AdverseEventSuspectEntityModel o) {
    this.id = o.getId();
    if (null != o.getInstance() && !o.getInstance().isEmpty()) {
      this.instance = new Reference(o.getInstance().get(0));
    }
    if (null != o.getCausality()) {
      this.causality = o.getCausality();
    }
    if (null != o.getCausalityAssessment() && !o.getCausalityAssessment().isEmpty()) {
      this.causalityAssessment = new CodeableConcept(o.getCausalityAssessment().get(0));
    }
    if (null != o.getCausalityProductRelatedness()) {
      this.causalityProductRelatedness = o.getCausalityProductRelatedness();
    }
    if (null != o.getCausalityMethod() && !o.getCausalityMethod().isEmpty()) {
      this.causalityMethod = new CodeableConcept(o.getCausalityMethod().get(0));
    }
    if (null != o.getCausalityAuthor() && !o.getCausalityAuthor().isEmpty()) {
      this.causalityAuthor = new Reference(o.getCausalityAuthor().get(0));
    }
    if (null != o.getCausalityResult() && !o.getCausalityResult().isEmpty()) {
      this.causalityResult = new CodeableConcept(o.getCausalityResult().get(0));
    }
  }

  public void setInstance( Reference value) {
    this.instance = value;
  }
  public Reference getInstance() {
    return this.instance;
  }
  public void setCausality( String value) {
    this.causality = CausalityEnum.fromCode(value);
  }
  public String getCausality() {
    return this.causality;
  }
  public void set_causality( Element value) {
    this._causality = value;
  }
  public Element get_causality() {
    return this._causality;
  }
  public void setCausalityAssessment( CodeableConcept value) {
    this.causalityAssessment = value;
  }
  public CodeableConcept getCausalityAssessment() {
    return this.causalityAssessment;
  }
  public void setCausalityProductRelatedness( String value) {
    this.causalityProductRelatedness = value;
  }
  public String getCausalityProductRelatedness() {
    return this.causalityProductRelatedness;
  }
  public void set_causalityProductRelatedness( Element value) {
    this._causalityProductRelatedness = value;
  }
  public Element get_causalityProductRelatedness() {
    return this._causalityProductRelatedness;
  }
  public void setCausalityMethod( CodeableConcept value) {
    this.causalityMethod = value;
  }
  public CodeableConcept getCausalityMethod() {
    return this.causalityMethod;
  }
  public void setCausalityAuthor( Reference value) {
    this.causalityAuthor = value;
  }
  public Reference getCausalityAuthor() {
    return this.causalityAuthor;
  }
  public void setCausalityResult( CodeableConcept value) {
    this.causalityResult = value;
  }
  public CodeableConcept getCausalityResult() {
    return this.causalityResult;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AdverseEventSuspectEntity]:" + "\n");
     if(this.instance != null) builder.append("instance" + "->" + this.instance.toString() + "\n"); 
     if(this.causality != null) builder.append("causality" + "->" + this.causality.toString() + "\n"); 
     if(this._causality != null) builder.append("_causality" + "->" + this._causality.toString() + "\n"); 
     if(this.causalityAssessment != null) builder.append("causalityAssessment" + "->" + this.causalityAssessment.toString() + "\n"); 
     if(this.causalityProductRelatedness != null) builder.append("causalityProductRelatedness" + "->" + this.causalityProductRelatedness.toString() + "\n"); 
     if(this._causalityProductRelatedness != null) builder.append("_causalityProductRelatedness" + "->" + this._causalityProductRelatedness.toString() + "\n"); 
     if(this.causalityMethod != null) builder.append("causalityMethod" + "->" + this.causalityMethod.toString() + "\n"); 
     if(this.causalityAuthor != null) builder.append("causalityAuthor" + "->" + this.causalityAuthor.toString() + "\n"); 
     if(this.causalityResult != null) builder.append("causalityResult" + "->" + this.causalityResult.toString() + "\n"); ;
    return builder.toString();
  }

  public enum CausalityEnum {
  	causality1,
  	causality2,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "causality1" : { return causality1.toString(); }
  			case "causality2" : { return causality2.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}
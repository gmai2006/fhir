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
import org.fhir.entity.AllergyIntoleranceReactionModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AllergyIntoleranceReaction  extends BackboneElement  {
  /**
  * Description: "Identification of the specific substance (or pharmaceutical product) considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different from the substance identified as the cause of the risk, but it must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite product that includes the identified substance. It must be clinically safe to only process the 'code' and ignore the 'reaction.substance'."
  */
  protected CodeableConcept substance;

  /**
  * Description: "Clinical symptoms and/or signs that are observed or associated with the adverse reaction event."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<CodeableConcept> manifestation;

  /**
  * Description: "Text description about the reaction as a whole, including details of the manifestation if required."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "Record of the date and/or time of the onset of the Reaction."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String onset;

  /**
  * Description: "Extensions for onset"
  */
  protected transient Element _onset;

  /**
  * Description: "Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations."
  */
  protected String severity;

  /**
  * Description: "Extensions for severity"
  */
  protected transient Element _severity;

  /**
  * Description: "Identification of the route by which the subject was exposed to the substance."
  */
  protected CodeableConcept exposureRoute;

  /**
  * Description: "Additional text about the adverse reaction event not captured in other fields."
  */
  protected java.util.List<Annotation> note;

  public AllergyIntoleranceReaction() {
  }

  public AllergyIntoleranceReaction(AllergyIntoleranceReactionModel o) {
    this.id = o.getId();
    if (null != o.getSubstance() && !o.getSubstance().isEmpty()) {
      this.substance = new CodeableConcept(o.getSubstance().get(0));
    }
    if (null != o.getManifestation() && !o.getManifestation().isEmpty()) {
    	this.manifestation = CodeableConceptHelper.fromArray2Array(o.getManifestation());
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getOnset()) {
      this.onset = o.getOnset();
    }
    if (null != o.getSeverity()) {
      this.severity = o.getSeverity();
    }
    if (null != o.getExposureRoute() && !o.getExposureRoute().isEmpty()) {
      this.exposureRoute = new CodeableConcept(o.getExposureRoute().get(0));
    }
    if (o.getNote() != null) {
    	this.note = org.fhir.utils.JsonUtils.json2Array(o.getNote());
    }
  }

  public void setSubstance( CodeableConcept value) {
    this.substance = value;
  }
  public CodeableConcept getSubstance() {
    return this.substance;
  }
  public void setManifestation( java.util.List<CodeableConcept> value) {
    this.manifestation = value;
  }
  public java.util.List<CodeableConcept> getManifestation() {
    return this.manifestation;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setOnset( String value) {
    this.onset = value;
  }
  public String getOnset() {
    return this.onset;
  }
  public void set_onset( Element value) {
    this._onset = value;
  }
  public Element get_onset() {
    return this._onset;
  }
  public void setSeverity( String value) {
    this.severity = SeverityEnum.fromCode(value);
  }
  public String getSeverity() {
    return this.severity;
  }
  public void set_severity( Element value) {
    this._severity = value;
  }
  public Element get_severity() {
    return this._severity;
  }
  public void setExposureRoute( CodeableConcept value) {
    this.exposureRoute = value;
  }
  public CodeableConcept getExposureRoute() {
    return this.exposureRoute;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AllergyIntoleranceReaction]:" + "\n");
     if(this.substance != null) builder.append("substance" + "->" + this.substance.toString() + "\n"); 
     if(this.manifestation != null) builder.append("manifestation" + "->" + this.manifestation.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.onset != null) builder.append("onset" + "->" + this.onset.toString() + "\n"); 
     if(this._onset != null) builder.append("_onset" + "->" + this._onset.toString() + "\n"); 
     if(this.severity != null) builder.append("severity" + "->" + this.severity.toString() + "\n"); 
     if(this._severity != null) builder.append("_severity" + "->" + this._severity.toString() + "\n"); 
     if(this.exposureRoute != null) builder.append("exposureRoute" + "->" + this.exposureRoute.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); ;
    return builder.toString();
  }

  public enum SeverityEnum {
  	mild,
  	moderate,
  	severe,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "mild" : { return mild.toString(); }
  			case "moderate" : { return moderate.toString(); }
  			case "severe" : { return severe.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}
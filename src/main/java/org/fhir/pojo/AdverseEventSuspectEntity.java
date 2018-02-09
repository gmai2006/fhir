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
import com.google.gson.GsonBuilder;

/**
* "Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death."
*/
public class AdverseEventSuspectEntity  {
  /**
  * Description: "Identifies the actual instance of what caused the adverse event.  May be a substance, medication, medication administration, medication statement or a device."
  */
  @javax.validation.constraints.NotNull
  private Reference instance;

  /**
  * Description: "causality1 | causality2."
  */
  private String causality;

  /**
  * Description: "Extensions for causality"
  */
  private transient Element _causality;

  /**
  * Description: "assess1 | assess2."
  */
  private CodeableConcept causalityAssessment;

  /**
  * Description: "AdverseEvent.suspectEntity.causalityProductRelatedness."
  */
  private String causalityProductRelatedness;

  /**
  * Description: "Extensions for causalityProductRelatedness"
  */
  private transient Element _causalityProductRelatedness;

  /**
  * Description: "method1 | method2."
  */
  private CodeableConcept causalityMethod;

  /**
  * Description: "AdverseEvent.suspectEntity.causalityAuthor."
  */
  private Reference causalityAuthor;

  /**
  * Description: "result1 | result2."
  */
  private CodeableConcept causalityResult;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public AdverseEventSuspectEntity() {
  }

  public AdverseEventSuspectEntity(AdverseEventSuspectEntityModel o) {
    this.id = o.getId();
      if (null != o.getInstance()) {
        this.instance = new Reference(o.getInstance());
        this.instance.setId(this.getId());
      }

      if (null != o.getCausality()) {
        this.causality = new String(o.getCausality());
      }

      this.causalityAssessment = CodeableConcept.fromJson(o.getCausalityAssessment());
      if (null != o.getCausalityProductRelatedness()) {
        this.causalityProductRelatedness = new String(o.getCausalityProductRelatedness());
      }

      this.causalityMethod = CodeableConcept.fromJson(o.getCausalityMethod());
      if (null != o.getCausalityAuthor()) {
        this.causalityAuthor = new Reference(o.getCausalityAuthor());
        this.causalityAuthor.setId(this.getId());
      }

      this.causalityResult = CodeableConcept.fromJson(o.getCausalityResult());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("instance" + "[" + String.valueOf(this.instance) + "]\n"); 
     builder.append("causality" + "[" + String.valueOf(this.causality) + "]\n"); 
     builder.append("_causality" + "[" + String.valueOf(this._causality) + "]\n"); 
     builder.append("causalityAssessment" + "[" + String.valueOf(this.causalityAssessment) + "]\n"); 
     builder.append("causalityProductRelatedness" + "[" + String.valueOf(this.causalityProductRelatedness) + "]\n"); 
     builder.append("_causalityProductRelatedness" + "[" + String.valueOf(this._causalityProductRelatedness) + "]\n"); 
     builder.append("causalityMethod" + "[" + String.valueOf(this.causalityMethod) + "]\n"); 
     builder.append("causalityAuthor" + "[" + String.valueOf(this.causalityAuthor) + "]\n"); 
     builder.append("causalityResult" + "[" + String.valueOf(this.causalityResult) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
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

  public static java.util.List<AdverseEventSuspectEntity> fromArray(java.util.List<AdverseEventSuspectEntityModel> list) {
    return (java.util.List<AdverseEventSuspectEntity>)list.stream()
      .map(model -> new AdverseEventSuspectEntity(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<AdverseEventSuspectEntityModel> toModelArray(java.util.List<AdverseEventSuspectEntity> list) {
    return (java.util.List<AdverseEventSuspectEntityModel>)list.stream()
      .map(model -> new AdverseEventSuspectEntityModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static AdverseEventSuspectEntity fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, AdverseEventSuspectEntity.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(AdverseEventSuspectEntity o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<AdverseEventSuspectEntity> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
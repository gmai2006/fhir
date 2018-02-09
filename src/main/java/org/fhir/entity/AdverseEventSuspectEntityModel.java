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

package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;

/**
* "Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death."
*/
@Entity
@Table(name="adverseeventsuspectentity")
public class AdverseEventSuspectEntityModel  {
  /**
  * Description: "Identifies the actual instance of what caused the adverse event.  May be a substance, medication, medication administration, medication statement or a device."
  */
  @javax.persistence.Basic
  @Column(name="\"instance_id\"")
  private String instance_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`instance_id`", insertable=false, updatable=false)
  private ReferenceModel instance;

  /**
  * Description: "causality1 | causality2."
  */
  @javax.persistence.Basic
  @Column(name="\"causality\"")
  private String causality;

  /**
  * Description: "assess1 | assess2."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"causalityAssessment\"", length = 16777215)
  private String causalityAssessment;

  /**
  * Description: "AdverseEvent.suspectEntity.causalityProductRelatedness."
  */
  @javax.persistence.Basic
  @Column(name="\"causalityProductRelatedness\"")
  private String causalityProductRelatedness;

  /**
  * Description: "method1 | method2."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"causalityMethod\"", length = 16777215)
  private String causalityMethod;

  /**
  * Description: "AdverseEvent.suspectEntity.causalityAuthor."
  */
  @javax.persistence.Basic
  @Column(name="\"causalityauthor_id\"")
  private String causalityauthor_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`causalityauthor_id`", insertable=false, updatable=false)
  private ReferenceModel causalityAuthor;

  /**
  * Description: "result1 | result2."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"causalityResult\"", length = 16777215)
  private String causalityResult;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public AdverseEventSuspectEntityModel() {
  }

  public AdverseEventSuspectEntityModel(AdverseEventSuspectEntity o) {
    this.id = o.getId();
      if (null != o.getInstance()) {
      	this.instance_id = "instance" + this.getId();
        this.instance = new ReferenceModel(o.getInstance());
        this.instance.setId(this.instance_id);
        this.instance.parent_id = this.instance.getId();
      }

      this.causality = o.getCausality();

      this.causalityAssessment = CodeableConcept.toJson(o.getCausalityAssessment());
      this.causalityProductRelatedness = o.getCausalityProductRelatedness();

      this.causalityMethod = CodeableConcept.toJson(o.getCausalityMethod());
      if (null != o.getCausalityAuthor()) {
      	this.causalityauthor_id = "causalityAuthor" + this.getId();
        this.causalityAuthor = new ReferenceModel(o.getCausalityAuthor());
        this.causalityAuthor.setId(this.causalityauthor_id);
        this.causalityAuthor.parent_id = this.causalityAuthor.getId();
      }

      this.causalityResult = CodeableConcept.toJson(o.getCausalityResult());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setInstance( ReferenceModel value) {
    this.instance = value;
  }
  public ReferenceModel getInstance() {
    return this.instance;
  }
  public void setCausality( String value) {
    this.causality = value;
  }
  public String getCausality() {
    return this.causality;
  }
  public void setCausalityAssessment( String value) {
    this.causalityAssessment = value;
  }
  public String getCausalityAssessment() {
    return this.causalityAssessment;
  }
  public void setCausalityProductRelatedness( String value) {
    this.causalityProductRelatedness = value;
  }
  public String getCausalityProductRelatedness() {
    return this.causalityProductRelatedness;
  }
  public void setCausalityMethod( String value) {
    this.causalityMethod = value;
  }
  public String getCausalityMethod() {
    return this.causalityMethod;
  }
  public void setCausalityAuthor( ReferenceModel value) {
    this.causalityAuthor = value;
  }
  public ReferenceModel getCausalityAuthor() {
    return this.causalityAuthor;
  }
  public void setCausalityResult( String value) {
    this.causalityResult = value;
  }
  public String getCausalityResult() {
    return this.causalityResult;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("instance" + "[" + String.valueOf(this.instance) + "]\n"); 
     builder.append("causality" + "[" + String.valueOf(this.causality) + "]\n"); 
     builder.append("causalityAssessment" + "[" + String.valueOf(this.causalityAssessment) + "]\n"); 
     builder.append("causalityProductRelatedness" + "[" + String.valueOf(this.causalityProductRelatedness) + "]\n"); 
     builder.append("causalityMethod" + "[" + String.valueOf(this.causalityMethod) + "]\n"); 
     builder.append("causalityAuthor" + "[" + String.valueOf(this.causalityAuthor) + "]\n"); 
     builder.append("causalityResult" + "[" + String.valueOf(this.causalityResult) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
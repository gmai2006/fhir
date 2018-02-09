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
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
*/
@Entity
@Table(name="explanationofbenefitprocedure")
public class ExplanationOfBenefitProcedureModel  {
  /**
  * Description: "Sequence of procedures which serves to order and provide a link."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"sequence\"")
  private Float sequence;

  /**
  * Description: "Date and optionally time the procedure was performed ."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "The procedure code."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"procedureCodeableConcept\"", length = 16777215)
  private String procedureCodeableConcept;

  /**
  * Description: "The procedure code."
  */
  @javax.persistence.Basic
  @Column(name="\"procedurereference_id\"")
  private String procedurereference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`procedurereference_id`", insertable=false, updatable=false)
  private ReferenceModel procedureReference;

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

  public ExplanationOfBenefitProcedureModel() {
  }

  public ExplanationOfBenefitProcedureModel(ExplanationOfBenefitProcedure o) {
    this.id = o.getId();
      this.sequence = o.getSequence();

      this.date = o.getDate();

      this.procedureCodeableConcept = CodeableConcept.toJson(o.getProcedureCodeableConcept());
      if (null != o.getProcedureReference()) {
      	this.procedurereference_id = "procedureReference" + this.getId();
        this.procedureReference = new ReferenceModel(o.getProcedureReference());
        this.procedureReference.setId(this.procedurereference_id);
        this.procedureReference.parent_id = this.procedureReference.getId();
      }

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setSequence( Float value) {
    this.sequence = value;
  }
  public Float getSequence() {
    return this.sequence;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public String getDate() {
    return this.date;
  }
  public void setProcedureCodeableConcept( String value) {
    this.procedureCodeableConcept = value;
  }
  public String getProcedureCodeableConcept() {
    return this.procedureCodeableConcept;
  }
  public void setProcedureReference( ReferenceModel value) {
    this.procedureReference = value;
  }
  public ReferenceModel getProcedureReference() {
    return this.procedureReference;
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
     builder.append("sequence" + "[" + String.valueOf(this.sequence) + "]\n"); 
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("procedureCodeableConcept" + "[" + String.valueOf(this.procedureCodeableConcept) + "]\n"); 
     builder.append("procedureReference" + "[" + String.valueOf(this.procedureReference) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
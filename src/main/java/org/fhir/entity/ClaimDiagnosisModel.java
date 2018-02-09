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
* "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
*/
@Entity
@Table(name="claimdiagnosis")
public class ClaimDiagnosisModel  {
  /**
  * Description: "Sequence of diagnosis which serves to provide a link."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"sequence\"")
  private Float sequence;

  /**
  * Description: "The diagnosis."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"diagnosisCodeableConcept\"", length = 16777215)
  private String diagnosisCodeableConcept;

  /**
  * Description: "The diagnosis."
  */
  @javax.persistence.Basic
  @Column(name="\"diagnosisreference_id\"")
  private String diagnosisreference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`diagnosisreference_id`", insertable=false, updatable=false)
  private ReferenceModel diagnosisReference;

  /**
  * Description: "The type of the Diagnosis, for example: admitting, primary, secondary, discharge."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "The package billing code, for example DRG, based on the assigned grouping code system."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"packageCode\"", length = 16777215)
  private String packageCode;

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

  public ClaimDiagnosisModel() {
  }

  public ClaimDiagnosisModel(ClaimDiagnosis o) {
    this.id = o.getId();
      this.sequence = o.getSequence();

      this.diagnosisCodeableConcept = CodeableConcept.toJson(o.getDiagnosisCodeableConcept());
      if (null != o.getDiagnosisReference()) {
      	this.diagnosisreference_id = "diagnosisReference" + this.getId();
        this.diagnosisReference = new ReferenceModel(o.getDiagnosisReference());
        this.diagnosisReference.setId(this.diagnosisreference_id);
        this.diagnosisReference.parent_id = this.diagnosisReference.getId();
      }

      this.type = CodeableConcept.toJson(o.getType());
      this.packageCode = CodeableConcept.toJson(o.getPackageCode());
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
  public void setDiagnosisCodeableConcept( String value) {
    this.diagnosisCodeableConcept = value;
  }
  public String getDiagnosisCodeableConcept() {
    return this.diagnosisCodeableConcept;
  }
  public void setDiagnosisReference( ReferenceModel value) {
    this.diagnosisReference = value;
  }
  public ReferenceModel getDiagnosisReference() {
    return this.diagnosisReference;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setPackageCode( String value) {
    this.packageCode = value;
  }
  public String getPackageCode() {
    return this.packageCode;
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
     builder.append("diagnosisCodeableConcept" + "[" + String.valueOf(this.diagnosisCodeableConcept) + "]\n"); 
     builder.append("diagnosisReference" + "[" + String.valueOf(this.diagnosisReference) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("packageCode" + "[" + String.valueOf(this.packageCode) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
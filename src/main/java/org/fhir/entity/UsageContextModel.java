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
* "Specifies clinical/business/etc metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care)."
*/
@Entity
@Table(name="usagecontext")
public class UsageContextModel  {
  /**
  * Description: "A code that identifies the type of context being specified by this usage context."
  * Actual type: Coding
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueCodeableConcept\"", length = 16777215)
  private String valueCodeableConcept;

  /**
  * Description: "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueQuantity\"", length = 16777215)
  private String valueQuantity;

  /**
  * Description: "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code."
  * Actual type: Range
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueRange\"", length = 16777215)
  private String valueRange;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public UsageContextModel() {
  }

  public UsageContextModel(UsageContext o) {
    this.id = o.getId();
      this.code = Coding.toJson(o.getCode());
      this.valueCodeableConcept = CodeableConcept.toJson(o.getValueCodeableConcept());
      this.valueQuantity = Quantity.toJson(o.getValueQuantity());
      this.valueRange = Range.toJson(o.getValueRange());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setValueCodeableConcept( String value) {
    this.valueCodeableConcept = value;
  }
  public String getValueCodeableConcept() {
    return this.valueCodeableConcept;
  }
  public void setValueQuantity( String value) {
    this.valueQuantity = value;
  }
  public String getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueRange( String value) {
    this.valueRange = value;
  }
  public String getValueRange() {
    return this.valueRange;
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
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("valueCodeableConcept" + "[" + String.valueOf(this.valueCodeableConcept) + "]\n"); 
     builder.append("valueQuantity" + "[" + String.valueOf(this.valueQuantity) + "]\n"); 
     builder.append("valueRange" + "[" + String.valueOf(this.valueRange) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
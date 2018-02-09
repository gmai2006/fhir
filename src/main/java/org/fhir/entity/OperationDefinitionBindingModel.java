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
* "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction)."
*/
@Entity
@Table(name="operationdefinitionbinding")
public class OperationDefinitionBindingModel  {
  /**
  * Description: "Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances."
  */
  @javax.persistence.Basic
  @Column(name="\"strength\"")
  private String strength;

  /**
  * Description: "Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used."
  */
  @javax.persistence.Basic
  @Column(name="\"valueSetUri\"")
  private String valueSetUri;

  /**
  * Description: "Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used."
  */
  @javax.persistence.Basic
  @Column(name="\"valuesetreference_id\"")
  private String valuesetreference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`valuesetreference_id`", insertable=false, updatable=false)
  private ReferenceModel valueSetReference;

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

  public OperationDefinitionBindingModel() {
  }

  public OperationDefinitionBindingModel(OperationDefinitionBinding o) {
    this.id = o.getId();
      this.strength = o.getStrength();

      this.valueSetUri = o.getValueSetUri();

      if (null != o.getValueSetReference()) {
      	this.valuesetreference_id = "valueSetReference" + this.getId();
        this.valueSetReference = new ReferenceModel(o.getValueSetReference());
        this.valueSetReference.setId(this.valuesetreference_id);
        this.valueSetReference.parent_id = this.valueSetReference.getId();
      }

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setStrength( String value) {
    this.strength = value;
  }
  public String getStrength() {
    return this.strength;
  }
  public void setValueSetUri( String value) {
    this.valueSetUri = value;
  }
  public String getValueSetUri() {
    return this.valueSetUri;
  }
  public void setValueSetReference( ReferenceModel value) {
    this.valueSetReference = value;
  }
  public ReferenceModel getValueSetReference() {
    return this.valueSetReference;
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
     builder.append("strength" + "[" + String.valueOf(this.strength) + "]\n"); 
     builder.append("valueSetUri" + "[" + String.valueOf(this.valueSetUri) + "]\n"); 
     builder.append("valueSetReference" + "[" + String.valueOf(this.valueSetReference) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
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
* "Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data."
*/
@Entity
@Table(name="datarequirementcodefilter")
public class DataRequirementCodeFilterModel  {
  /**
  * Description: "The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept."
  */
  @javax.persistence.Basic
  @Column(name="\"path\"")
  private String path;

  /**
  * Description: "The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset."
  */
  @javax.persistence.Basic
  @Column(name="\"valueSetString\"")
  private String valueSetString;

  /**
  * Description: "The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset."
  */
  @javax.persistence.Basic
  @Column(name="\"valuesetreference_id\"")
  private String valuesetreference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`valuesetreference_id`", insertable=false, updatable=false)
  private ReferenceModel valueSetReference;

  /**
  * Description: "The codes for the code filter. Only one of valueSet, valueCode, valueCoding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes."
  * Actual type: Array of string-> List<string>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueCode\"", length = 16777215)
  private String valueCode;

  /**
  * Description: "The Codings for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified Codings."
  * Actual type: Array of Coding-> List<Coding>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueCoding\"", length = 16777215)
  private String valueCoding;

  /**
  * Description: "The CodeableConcepts for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified CodeableConcepts."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueCodeableConcept\"", length = 16777215)
  private String valueCodeableConcept;

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

  public DataRequirementCodeFilterModel() {
  }

  public DataRequirementCodeFilterModel(DataRequirementCodeFilter o) {
    this.id = o.getId();
      this.path = o.getPath();

      this.valueSetString = o.getValueSetString();

      if (null != o.getValueSetReference()) {
      	this.valuesetreference_id = "valueSetReference" + this.getId();
        this.valueSetReference = new ReferenceModel(o.getValueSetReference());
        this.valueSetReference.setId(this.valuesetreference_id);
        this.valueSetReference.parent_id = this.valueSetReference.getId();
      }

      this.valueCode = org.fhir.utils.JsonUtils.write2String(o.getValueCode());

      this.valueCoding = Coding.toJson(o.getValueCoding());
      this.valueCodeableConcept = CodeableConcept.toJson(o.getValueCodeableConcept());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setPath( String value) {
    this.path = value;
  }
  public String getPath() {
    return this.path;
  }
  public void setValueSetString( String value) {
    this.valueSetString = value;
  }
  public String getValueSetString() {
    return this.valueSetString;
  }
  public void setValueSetReference( ReferenceModel value) {
    this.valueSetReference = value;
  }
  public ReferenceModel getValueSetReference() {
    return this.valueSetReference;
  }
  public void setValueCode( String value) {
    this.valueCode = value;
  }
  public String getValueCode() {
    return this.valueCode;
  }
  public void setValueCoding( String value) {
    this.valueCoding = value;
  }
  public String getValueCoding() {
    return this.valueCoding;
  }
  public void setValueCodeableConcept( String value) {
    this.valueCodeableConcept = value;
  }
  public String getValueCodeableConcept() {
    return this.valueCodeableConcept;
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
     builder.append("path" + "[" + String.valueOf(this.path) + "]\n"); 
     builder.append("valueSetString" + "[" + String.valueOf(this.valueSetString) + "]\n"); 
     builder.append("valueSetReference" + "[" + String.valueOf(this.valueSetReference) + "]\n"); 
     builder.append("valueCode" + "[" + String.valueOf(this.valueCode) + "]\n"); 
     builder.append("valueCoding" + "[" + String.valueOf(this.valueCoding) + "]\n"); 
     builder.append("valueCodeableConcept" + "[" + String.valueOf(this.valueCodeableConcept) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
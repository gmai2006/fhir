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
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data."
* generated on 07/14/2018
*/
@Entity
@Table(name="datarequirementcodefilter")
public class DataRequirementCodeFilterModel  implements Serializable {
	private static final long serialVersionUID = 153159210188278449L;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="valuesetreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> valueSetReference;

  /**
  * Description: "The codes for the code filter. Only one of valueSet, valueCode, valueCoding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes."
  */
  @javax.persistence.Basic
  @Column(name="\"valueCode\"")
  private String valueCode;

  /**
  * Description: "The Codings for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified Codings."
  */
  @javax.persistence.Basic
  @Column(name="\"valuecoding_id\"")
  private String valuecoding_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="valuecoding_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> valueCoding;

  /**
  * Description: "The CodeableConcepts for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified CodeableConcepts."
  */
  @javax.persistence.Basic
  @Column(name="\"valuecodeableconcept_id\"")
  private String valuecodeableconcept_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="valuecodeableconcept_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> valueCodeableConcept;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public DataRequirementCodeFilterModel() {
  }

  public DataRequirementCodeFilterModel(DataRequirementCodeFilter o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.path = o.getPath();
    this.valueSetString = o.getValueSetString();
    if (null != o.getValueSetReference() ) {
    	this.valuesetreference_id = "valuesetreference" + this.id;
    	this.valueSetReference = ReferenceHelper.toModel(o.getValueSetReference(), this.valuesetreference_id);
    }
    this.valueCode = org.fhir.utils.JsonUtils.toJson(o.getValueCode());
    if (null != o.getValueCoding() && !o.getValueCoding().isEmpty()) {
    	this.valuecoding_id = "valuecoding" + this.id;
    	this.valueCoding = CodingHelper.toModelFromArray(o.getValueCoding(), this.valuecoding_id);
    }
    if (null != o.getValueCodeableConcept() && !o.getValueCodeableConcept().isEmpty()) {
    	this.valuecodeableconcept_id = "valuecodeableconcept" + this.id;
    	this.valueCodeableConcept = CodeableConceptHelper.toModelFromArray(o.getValueCodeableConcept(), this.valuecodeableconcept_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getPath() {
    return this.path;
  }
  public void setPath( String value) {
    this.path = value;
  }
  public String getValueSetString() {
    return this.valueSetString;
  }
  public void setValueSetString( String value) {
    this.valueSetString = value;
  }
  public java.util.List<ReferenceModel> getValueSetReference() {
    return this.valueSetReference;
  }
  public void setValueSetReference( java.util.List<ReferenceModel> value) {
    this.valueSetReference = value;
  }
  public String getValueCode() {
    return this.valueCode;
  }
  public void setValueCode( String value) {
    this.valueCode = value;
  }
  public java.util.List<CodingModel> getValueCoding() {
    return this.valueCoding;
  }
  public void setValueCoding( java.util.List<CodingModel> value) {
    this.valueCoding = value;
  }
  public java.util.List<CodeableConceptModel> getValueCodeableConcept() {
    return this.valueCodeableConcept;
  }
  public void setValueCodeableConcept( java.util.List<CodeableConceptModel> value) {
    this.valueCodeableConcept = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DataRequirementCodeFilterModel]:" + "\n");
     builder.append("path" + "->" + this.path + "\n"); 
     builder.append("valueSetString" + "->" + this.valueSetString + "\n"); 
     builder.append("valueCode" + "->" + this.valueCode + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DataRequirementCodeFilterModel]:" + "\n");
     builder.append("path" + "->" + this.path + "\n"); 
     builder.append("valueSetString" + "->" + this.valueSetString + "\n"); 
     builder.append("valueCode" + "->" + this.valueCode + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}
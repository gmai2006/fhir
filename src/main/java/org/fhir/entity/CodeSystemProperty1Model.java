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
* "A code system resource specifies a set of codes drawn from one or more code systems."
* generated on 07/14/2018
*/
@Entity
@Table(name="codesystemproperty1")
public class CodeSystemProperty1Model  implements Serializable {
	private static final long serialVersionUID = 153159210194615414L;
  /**
  * Description: "A code that is a reference to CodeSystem.property.code."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"code\"")
  private String code;

  /**
  * Description: "The value of this property."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"valueCode\"")
  private String valueCode;

  /**
  * Description: "The value of this property."
  */
  @javax.persistence.Basic
  @Column(name="\"valuecoding_id\"")
  private String valuecoding_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="valuecoding_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> valueCoding;

  /**
  * Description: "The value of this property."
  */
  @javax.persistence.Basic
  @Column(name="\"valueString\"")
  private String valueString;

  /**
  * Description: "The value of this property."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"valueInteger\"")
  private Float valueInteger;

  /**
  * Description: "The value of this property."
  */
  @javax.persistence.Basic
  @Column(name="\"valueBoolean\"")
  private Boolean valueBoolean;

  /**
  * Description: "The value of this property."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"valueDateTime\"")
  private String valueDateTime;

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

  public CodeSystemProperty1Model() {
  }

  public CodeSystemProperty1Model(CodeSystemProperty1 o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.code = o.getCode();
    this.valueCode = o.getValueCode();
    if (null != o.getValueCoding() ) {
    	this.valuecoding_id = "valuecoding" + this.id;
    	this.valueCoding = CodingHelper.toModel(o.getValueCoding(), this.valuecoding_id);
    }
    this.valueString = o.getValueString();
    this.valueInteger = o.getValueInteger();
    this.valueBoolean = o.getValueBoolean();
    this.valueDateTime = o.getValueDateTime();
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
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
  public String getValueString() {
    return this.valueString;
  }
  public void setValueString( String value) {
    this.valueString = value;
  }
  public Float getValueInteger() {
    return this.valueInteger;
  }
  public void setValueInteger( Float value) {
    this.valueInteger = value;
  }
  public Boolean getValueBoolean() {
    return this.valueBoolean;
  }
  public void setValueBoolean( Boolean value) {
    this.valueBoolean = value;
  }
  public String getValueDateTime() {
    return this.valueDateTime;
  }
  public void setValueDateTime( String value) {
    this.valueDateTime = value;
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
    builder.append("[CodeSystemProperty1Model]:" + "\n");
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("valueCode" + "->" + this.valueCode + "\n"); 
     builder.append("valueString" + "->" + this.valueString + "\n"); 
     builder.append("valueInteger" + "->" + this.valueInteger + "\n"); 
     builder.append("valueBoolean" + "->" + this.valueBoolean + "\n"); 
     builder.append("valueDateTime" + "->" + this.valueDateTime + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CodeSystemProperty1Model]:" + "\n");
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("valueCode" + "->" + this.valueCode + "\n"); 
     builder.append("valueString" + "->" + this.valueString + "\n"); 
     builder.append("valueInteger" + "->" + this.valueInteger + "\n"); 
     builder.append("valueBoolean" + "->" + this.valueBoolean + "\n"); 
     builder.append("valueDateTime" + "->" + this.valueDateTime + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}
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
* "A value set specifies a set of codes drawn from one or more code systems."
*/
@Entity
@Table(name="valuesetexpansion")
public class ValueSetExpansionModel  implements Serializable {
	private static final long serialVersionUID = 151910893756759854L;
  /**
  * Description: "An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so."
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"")
  private String identifier;

  /**
  * Description: "The time at which the expansion was produced by the expanding system."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"timestamp\"")
  private String timestamp;

  /**
  * Description: "The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"total\"")
  private Float total;

  /**
  * Description: "If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"offset\"")
  private Float offset;

  /**
  * Description: "A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion."
  */
  @javax.persistence.Basic
  @Column(name="\"parameter_id\"")
  private String parameter_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="parameter_id", insertable=false, updatable=false)
  private java.util.List<ValueSetParameterModel> parameter;

  /**
  * Description: "The codes that are contained in the value set expansion."
  */
  @javax.persistence.Basic
  @Column(name="\"contains_id\"")
  private String contains_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="contains_id", insertable=false, updatable=false)
  private java.util.List<ValueSetContainsModel> contains;

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
  @Column(name="\"parent_id\"")
  private String parent_id;

  public ValueSetExpansionModel() {
  }

  public ValueSetExpansionModel(ValueSetExpansion o, String parentId) {
  	this.parent_id = parentId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.identifier = o.getIdentifier();
    this.timestamp = o.getTimestamp();
    this.total = o.getTotal();
    this.offset = o.getOffset();
    if (null != o.getParameter() && !o.getParameter().isEmpty()) {
    	this.parameter_id = "parameter" + this.parent_id;
    	this.parameter = ValueSetParameterHelper.toModelFromArray(o.getParameter(), this.parameter_id);
    }
    if (null != o.getContains() && !o.getContains().isEmpty()) {
    	this.contains_id = "contains" + this.parent_id;
    	this.contains = ValueSetContainsHelper.toModelFromArray(o.getContains(), this.contains_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getTimestamp() {
    return this.timestamp;
  }
  public void setTimestamp( String value) {
    this.timestamp = value;
  }
  public Float getTotal() {
    return this.total;
  }
  public void setTotal( Float value) {
    this.total = value;
  }
  public Float getOffset() {
    return this.offset;
  }
  public void setOffset( Float value) {
    this.offset = value;
  }
  public java.util.List<ValueSetParameterModel> getParameter() {
    return this.parameter;
  }
  public void setParameter( java.util.List<ValueSetParameterModel> value) {
    this.parameter = value;
  }
  public java.util.List<ValueSetContainsModel> getContains() {
    return this.contains;
  }
  public void setContains( java.util.List<ValueSetContainsModel> value) {
    this.contains = value;
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
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ValueSetExpansionModel]:" + "\n");
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("timestamp" + "->" + this.timestamp + "\n"); 
     builder.append("total" + "->" + this.total + "\n"); 
     builder.append("offset" + "->" + this.offset + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ValueSetExpansionModel]:" + "\n");
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("timestamp" + "->" + this.timestamp + "\n"); 
     builder.append("total" + "->" + this.total + "\n"); 
     builder.append("offset" + "->" + this.offset + "\n"); 
     builder.append("parameter" + "->" + this.parameter + "\n"); 
     builder.append("contains" + "->" + this.contains + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}
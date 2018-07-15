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
* "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction)."
* generated on 07/14/2018
*/
@Entity
@Table(name="operationdefinitionparameter")
public class OperationDefinitionParameterModel  implements Serializable {
	private static final long serialVersionUID = 153159210194265351L;
  /**
  * Description: "The name of used to identify the parameter."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "Whether this is an input or an output parameter."
  */
  @javax.persistence.Basic
  @Column(name="\"use\"")
  private String use;

  /**
  * Description: "The minimum number of times this parameter SHALL appear in the request or response."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"min\"")
  private Float min;

  /**
  * Description: "The maximum number of times this element is permitted to appear in the request or response."
  */
  @javax.persistence.Basic
  @Column(name="\"max\"")
  private String max;

  /**
  * Description: "Describes the meaning or use of this parameter."
  */
  @javax.persistence.Basic
  @Column(name="\"documentation\"")
  private String documentation;

  /**
  * Description: "The type for this parameter."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "How the parameter is understood as a search parameter. This is only used if the parameter type is 'string'."
  */
  @javax.persistence.Basic
  @Column(name="\"searchType\"")
  private String searchType;

  /**
  * Description: "A profile the specifies the rules that this parameter must conform to."
  */
  @javax.persistence.Basic
  @Column(name="\"profile_id\"")
  private String profile_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="profile_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> profile;

  /**
  * Description: "Binds to a value set if this parameter is coded (code, Coding, CodeableConcept)."
  */
  @javax.persistence.Basic
  @Column(name="\"binding_id\"")
  private String binding_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="binding_id", insertable=false, updatable=false)
  private java.util.List<OperationDefinitionBindingModel> binding;

  /**
  * Description: "The parts of a nested Parameter."
  */
  @javax.persistence.Basic
  @Column(name="\"part_id\"")
  private String part_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="part_id", insertable=false, updatable=false)
  private java.util.List<OperationDefinitionParameterModel> part;

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

  public OperationDefinitionParameterModel() {
  }

  public OperationDefinitionParameterModel(OperationDefinitionParameter o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.name = o.getName();
    this.use = o.getUse();
    this.min = o.getMin();
    this.max = o.getMax();
    this.documentation = o.getDocumentation();
    this.type = o.getType();
    this.searchType = o.getSearchType();
    if (null != o.getProfile() ) {
    	this.profile_id = "profile" + this.id;
    	this.profile = ReferenceHelper.toModel(o.getProfile(), this.profile_id);
    }
    if (null != o.getBinding() ) {
    	this.binding_id = "binding" + this.id;
    	this.binding = OperationDefinitionBindingHelper.toModel(o.getBinding(), this.binding_id);
    }
    if (null != o.getPart() && !o.getPart().isEmpty()) {
    	this.part_id = "part" + this.id;
    	this.part = OperationDefinitionParameterHelper.toModelFromArray(o.getPart(), this.part_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getUse() {
    return this.use;
  }
  public void setUse( String value) {
    this.use = value;
  }
  public Float getMin() {
    return this.min;
  }
  public void setMin( Float value) {
    this.min = value;
  }
  public String getMax() {
    return this.max;
  }
  public void setMax( String value) {
    this.max = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getSearchType() {
    return this.searchType;
  }
  public void setSearchType( String value) {
    this.searchType = value;
  }
  public java.util.List<ReferenceModel> getProfile() {
    return this.profile;
  }
  public void setProfile( java.util.List<ReferenceModel> value) {
    this.profile = value;
  }
  public java.util.List<OperationDefinitionBindingModel> getBinding() {
    return this.binding;
  }
  public void setBinding( java.util.List<OperationDefinitionBindingModel> value) {
    this.binding = value;
  }
  public java.util.List<OperationDefinitionParameterModel> getPart() {
    return this.part;
  }
  public void setPart( java.util.List<OperationDefinitionParameterModel> value) {
    this.part = value;
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
    builder.append("[OperationDefinitionParameterModel]:" + "\n");
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("use" + "->" + this.use + "\n"); 
     builder.append("min" + "->" + this.min + "\n"); 
     builder.append("max" + "->" + this.max + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("searchType" + "->" + this.searchType + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[OperationDefinitionParameterModel]:" + "\n");
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("use" + "->" + this.use + "\n"); 
     builder.append("min" + "->" + this.min + "\n"); 
     builder.append("max" + "->" + this.max + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("searchType" + "->" + this.searchType + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}
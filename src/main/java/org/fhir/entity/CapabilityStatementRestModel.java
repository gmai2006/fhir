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
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
*/
@Entity
@Table(name="capabilitystatementrest")
public class CapabilityStatementRestModel  implements Serializable {
	private static final long serialVersionUID = 151910893760630714L;
  /**
  * Description: "Identifies whether this portion of the statement is describing the ability to initiate or receive restful operations."
  */
  @javax.persistence.Basic
  @Column(name="\"mode\"")
  private String mode;

  /**
  * Description: "Information about the system's restful capabilities that apply across all applications, such as security."
  */
  @javax.persistence.Basic
  @Column(name="\"documentation\"")
  private String documentation;

  /**
  * Description: "Information about security implementation from an interface perspective - what a client needs to know."
  */
  @javax.persistence.Basic
  @Column(name="\"security_id\"")
  private String security_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="security_id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementSecurityModel> security;

  /**
  * Description: "A specification of the restful capabilities of the solution for a specific resource type."
  */
  @javax.persistence.Basic
  @Column(name="\"resource_id\"")
  private String resource_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="resource_id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementResourceModel> resource;

  /**
  * Description: "A specification of restful operations supported by the system."
  */
  @javax.persistence.Basic
  @Column(name="\"interaction_id\"")
  private String interaction_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="interaction_id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementInteraction1Model> interaction;

  /**
  * Description: "Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation."
  */
  @javax.persistence.Basic
  @Column(name="\"searchparam_id\"")
  private String searchparam_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="searchparam_id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementSearchParamModel> searchParam;

  /**
  * Description: "Definition of an operation or a named query together with its parameters and their meaning and type."
  */
  @javax.persistence.Basic
  @Column(name="\"operation_id\"")
  private String operation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="operation_id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementOperationModel> operation;

  /**
  * Description: "An absolute URI which is a reference to the definition of a compartment that the system supports. The reference is to a CompartmentDefinition resource by its canonical URL ."
  */
  @javax.persistence.Basic
  @Column(name="\"compartment\"")
  private String compartment;

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

  public CapabilityStatementRestModel() {
  }

  public CapabilityStatementRestModel(CapabilityStatementRest o, String parentId) {
  	this.parent_id = parentId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.mode = o.getMode();
    this.documentation = o.getDocumentation();
    if (null != o.getSecurity() ) {
    	this.security_id = "security" + this.parent_id;
    	this.security = CapabilityStatementSecurityHelper.toModel(o.getSecurity(), this.security_id);
    }
    if (null != o.getResource() && !o.getResource().isEmpty()) {
    	this.resource_id = "resource" + this.parent_id;
    	this.resource = CapabilityStatementResourceHelper.toModelFromArray(o.getResource(), this.resource_id);
    }
    if (null != o.getInteraction() && !o.getInteraction().isEmpty()) {
    	this.interaction_id = "interaction" + this.parent_id;
    	this.interaction = CapabilityStatementInteraction1Helper.toModelFromArray(o.getInteraction(), this.interaction_id);
    }
    if (null != o.getSearchParam() && !o.getSearchParam().isEmpty()) {
    	this.searchparam_id = "searchparam" + this.parent_id;
    	this.searchParam = CapabilityStatementSearchParamHelper.toModelFromArray(o.getSearchParam(), this.searchparam_id);
    }
    if (null != o.getOperation() && !o.getOperation().isEmpty()) {
    	this.operation_id = "operation" + this.parent_id;
    	this.operation = CapabilityStatementOperationHelper.toModelFromArray(o.getOperation(), this.operation_id);
    }
    this.compartment = org.fhir.utils.JsonUtils.toJson(o.getCompartment());
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getMode() {
    return this.mode;
  }
  public void setMode( String value) {
    this.mode = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
  }
  public java.util.List<CapabilityStatementSecurityModel> getSecurity() {
    return this.security;
  }
  public void setSecurity( java.util.List<CapabilityStatementSecurityModel> value) {
    this.security = value;
  }
  public java.util.List<CapabilityStatementResourceModel> getResource() {
    return this.resource;
  }
  public void setResource( java.util.List<CapabilityStatementResourceModel> value) {
    this.resource = value;
  }
  public java.util.List<CapabilityStatementInteraction1Model> getInteraction() {
    return this.interaction;
  }
  public void setInteraction( java.util.List<CapabilityStatementInteraction1Model> value) {
    this.interaction = value;
  }
  public java.util.List<CapabilityStatementSearchParamModel> getSearchParam() {
    return this.searchParam;
  }
  public void setSearchParam( java.util.List<CapabilityStatementSearchParamModel> value) {
    this.searchParam = value;
  }
  public java.util.List<CapabilityStatementOperationModel> getOperation() {
    return this.operation;
  }
  public void setOperation( java.util.List<CapabilityStatementOperationModel> value) {
    this.operation = value;
  }
  public String getCompartment() {
    return this.compartment;
  }
  public void setCompartment( String value) {
    this.compartment = value;
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
    builder.append("[CapabilityStatementRestModel]:" + "\n");
     builder.append("mode" + "->" + this.mode + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("compartment" + "->" + this.compartment + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CapabilityStatementRestModel]:" + "\n");
     builder.append("mode" + "->" + this.mode + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("security" + "->" + this.security + "\n"); 
     builder.append("resource" + "->" + this.resource + "\n"); 
     builder.append("interaction" + "->" + this.interaction + "\n"); 
     builder.append("searchParam" + "->" + this.searchParam + "\n"); 
     builder.append("operation" + "->" + this.operation + "\n"); 
     builder.append("compartment" + "->" + this.compartment + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}
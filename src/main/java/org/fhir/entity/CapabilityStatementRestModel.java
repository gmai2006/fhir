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
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
*/
@Entity
@Table(name="capabilitystatementrest")
public class CapabilityStatementRestModel  {
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`security_id`", insertable=false, updatable=false)
  private CapabilityStatementSecurityModel security;

  /**
  * Description: "A specification of the restful capabilities of the solution for a specific resource type."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementResourceModel> resource = new java.util.ArrayList<>();

  /**
  * Description: "A specification of restful operations supported by the system."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementInteraction1Model> interaction = new java.util.ArrayList<>();

  /**
  * Description: "Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementSearchParamModel> searchParam = new java.util.ArrayList<>();

  /**
  * Description: "Definition of an operation or a named query together with its parameters and their meaning and type."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementOperationModel> operation = new java.util.ArrayList<>();

  /**
  * Description: "An absolute URI which is a reference to the definition of a compartment that the system supports. The reference is to a CompartmentDefinition resource by its canonical URL ."
  * Actual type: Array of string-> List<string>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"compartment\"", length = 16777215)
  private String compartment;

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

  public CapabilityStatementRestModel() {
  }

  public CapabilityStatementRestModel(CapabilityStatementRest o) {
    this.id = o.getId();
      this.mode = o.getMode();

      this.documentation = o.getDocumentation();

      if (null != o.getSecurity()) {
      	this.security_id = "security" + this.getId();
        this.security = new CapabilityStatementSecurityModel(o.getSecurity());
        this.security.setId(this.security_id);
        this.security.parent_id = this.security.getId();
      }

      this.resource = CapabilityStatementResource.toModelArray(o.getResource());

      this.interaction = CapabilityStatementInteraction1.toModelArray(o.getInteraction());

      this.searchParam = CapabilityStatementSearchParam.toModelArray(o.getSearchParam());

      this.operation = CapabilityStatementOperation.toModelArray(o.getOperation());

      this.compartment = org.fhir.utils.JsonUtils.write2String(o.getCompartment());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setMode( String value) {
    this.mode = value;
  }
  public String getMode() {
    return this.mode;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void setSecurity( CapabilityStatementSecurityModel value) {
    this.security = value;
  }
  public CapabilityStatementSecurityModel getSecurity() {
    return this.security;
  }
  public void setResource( java.util.List<CapabilityStatementResourceModel> value) {
    this.resource = value;
  }
  public java.util.List<CapabilityStatementResourceModel> getResource() {
    return this.resource;
  }
  public void setInteraction( java.util.List<CapabilityStatementInteraction1Model> value) {
    this.interaction = value;
  }
  public java.util.List<CapabilityStatementInteraction1Model> getInteraction() {
    return this.interaction;
  }
  public void setSearchParam( java.util.List<CapabilityStatementSearchParamModel> value) {
    this.searchParam = value;
  }
  public java.util.List<CapabilityStatementSearchParamModel> getSearchParam() {
    return this.searchParam;
  }
  public void setOperation( java.util.List<CapabilityStatementOperationModel> value) {
    this.operation = value;
  }
  public java.util.List<CapabilityStatementOperationModel> getOperation() {
    return this.operation;
  }
  public void setCompartment( String value) {
    this.compartment = value;
  }
  public String getCompartment() {
    return this.compartment;
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
     builder.append("mode" + "[" + String.valueOf(this.mode) + "]\n"); 
     builder.append("documentation" + "[" + String.valueOf(this.documentation) + "]\n"); 
     builder.append("security" + "[" + String.valueOf(this.security) + "]\n"); 
     builder.append("resource" + "[" + String.valueOf(this.resource) + "]\n"); 
     builder.append("interaction" + "[" + String.valueOf(this.interaction) + "]\n"); 
     builder.append("searchParam" + "[" + String.valueOf(this.searchParam) + "]\n"); 
     builder.append("operation" + "[" + String.valueOf(this.operation) + "]\n"); 
     builder.append("compartment" + "[" + String.valueOf(this.compartment) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}
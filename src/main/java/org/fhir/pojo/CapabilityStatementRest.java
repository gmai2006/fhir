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

package org.fhir.pojo;
import org.fhir.entity.CapabilityStatementRestModel;
import com.google.gson.GsonBuilder;

/**
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
*/
public class CapabilityStatementRest  {
  /**
  * Description: "Identifies whether this portion of the statement is describing the ability to initiate or receive restful operations."
  */
  private String mode;

  /**
  * Description: "Extensions for mode"
  */
  private transient Element _mode;

  /**
  * Description: "Information about the system's restful capabilities that apply across all applications, such as security."
  */
  private String documentation;

  /**
  * Description: "Extensions for documentation"
  */
  private transient Element _documentation;

  /**
  * Description: "Information about security implementation from an interface perspective - what a client needs to know."
  */
  private CapabilityStatementSecurity security;

  /**
  * Description: "A specification of the restful capabilities of the solution for a specific resource type."
  */
  private java.util.List<CapabilityStatementResource> resource = new java.util.ArrayList<>();

  /**
  * Description: "A specification of restful operations supported by the system."
  */
  private java.util.List<CapabilityStatementInteraction1> interaction = new java.util.ArrayList<>();

  /**
  * Description: "Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation."
  */
  private java.util.List<CapabilityStatementSearchParam> searchParam = new java.util.ArrayList<>();

  /**
  * Description: "Definition of an operation or a named query together with its parameters and their meaning and type."
  */
  private java.util.List<CapabilityStatementOperation> operation = new java.util.ArrayList<>();

  /**
  * Description: "An absolute URI which is a reference to the definition of a compartment that the system supports. The reference is to a CompartmentDefinition resource by its canonical URL ."
  */
  private java.util.List<String> compartment = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for compartment"
  */
  private transient java.util.List<Element> _compartment = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public CapabilityStatementRest() {
  }

  public CapabilityStatementRest(CapabilityStatementRestModel o) {
    this.id = o.getId();
      if (null != o.getMode()) {
        this.mode = new String(o.getMode());
      }

      if (null != o.getDocumentation()) {
        this.documentation = new String(o.getDocumentation());
      }

      if (null != o.getSecurity()) {
        this.security = new CapabilityStatementSecurity(o.getSecurity());
        this.security.setId(this.getId());
      }

      this.resource = CapabilityStatementResource.fromArray(o.getResource());

      this.interaction = CapabilityStatementInteraction1.fromArray(o.getInteraction());

      this.searchParam = CapabilityStatementSearchParam.fromArray(o.getSearchParam());

      this.operation = CapabilityStatementOperation.fromArray(o.getOperation());

      this.compartment = org.fhir.utils.JsonUtils.json2Array(o.getCompartment());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setMode( String value) {
    this.mode = ModeEnum.fromCode(value);
  }
  public String getMode() {
    return this.mode;
  }
  public void set_mode( Element value) {
    this._mode = value;
  }
  public Element get_mode() {
    return this._mode;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void set_documentation( Element value) {
    this._documentation = value;
  }
  public Element get_documentation() {
    return this._documentation;
  }
  public void setSecurity( CapabilityStatementSecurity value) {
    this.security = value;
  }
  public CapabilityStatementSecurity getSecurity() {
    return this.security;
  }
  public void setResource( java.util.List<CapabilityStatementResource> value) {
    this.resource = value;
  }
  public java.util.List<CapabilityStatementResource> getResource() {
    return this.resource;
  }
  public void setInteraction( java.util.List<CapabilityStatementInteraction1> value) {
    this.interaction = value;
  }
  public java.util.List<CapabilityStatementInteraction1> getInteraction() {
    return this.interaction;
  }
  public void setSearchParam( java.util.List<CapabilityStatementSearchParam> value) {
    this.searchParam = value;
  }
  public java.util.List<CapabilityStatementSearchParam> getSearchParam() {
    return this.searchParam;
  }
  public void setOperation( java.util.List<CapabilityStatementOperation> value) {
    this.operation = value;
  }
  public java.util.List<CapabilityStatementOperation> getOperation() {
    return this.operation;
  }
  public void setCompartment( java.util.List<String> value) {
    this.compartment = value;
  }
  public java.util.List<String> getCompartment() {
    return this.compartment;
  }
  public void set_compartment( java.util.List<Element> value) {
    this._compartment = value;
  }
  public java.util.List<Element> get_compartment() {
    return this._compartment;
  }
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("mode" + "[" + String.valueOf(this.mode) + "]\n"); 
     builder.append("_mode" + "[" + String.valueOf(this._mode) + "]\n"); 
     builder.append("documentation" + "[" + String.valueOf(this.documentation) + "]\n"); 
     builder.append("_documentation" + "[" + String.valueOf(this._documentation) + "]\n"); 
     builder.append("security" + "[" + String.valueOf(this.security) + "]\n"); 
     builder.append("resource" + "[" + String.valueOf(this.resource) + "]\n"); 
     builder.append("interaction" + "[" + String.valueOf(this.interaction) + "]\n"); 
     builder.append("searchParam" + "[" + String.valueOf(this.searchParam) + "]\n"); 
     builder.append("operation" + "[" + String.valueOf(this.operation) + "]\n"); 
     builder.append("compartment" + "[" + String.valueOf(this.compartment) + "]\n"); 
     builder.append("_compartment" + "[" + String.valueOf(this._compartment) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum ModeEnum {
  	client,
  	server,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "client" : { return client.toString(); }
  			case "server" : { return server.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<CapabilityStatementRest> fromArray(java.util.List<CapabilityStatementRestModel> list) {
    return (java.util.List<CapabilityStatementRest>)list.stream()
      .map(model -> new CapabilityStatementRest(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CapabilityStatementRestModel> toModelArray(java.util.List<CapabilityStatementRest> list) {
    return (java.util.List<CapabilityStatementRestModel>)list.stream()
      .map(model -> new CapabilityStatementRestModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static CapabilityStatementRest fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CapabilityStatementRest.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(CapabilityStatementRest o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<CapabilityStatementRest> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
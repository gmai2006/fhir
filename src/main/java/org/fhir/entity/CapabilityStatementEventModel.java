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
* generated on 07/14/2018
*/
@Entity
@Table(name="capabilitystatementevent")
public class CapabilityStatementEventModel  implements Serializable {
	private static final long serialVersionUID = 153159210227898181L;
  /**
  * Description: "A coded identifier of a supported messaging event."
  */
  @javax.persistence.Basic
  @Column(name="\"code_id\"")
  private String code_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="code_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> code;

  /**
  * Description: "The impact of the content of the message."
  */
  @javax.persistence.Basic
  @Column(name="\"category\"")
  private String category;

  /**
  * Description: "The mode of this event declaration - whether an application is a sender or receiver."
  */
  @javax.persistence.Basic
  @Column(name="\"mode\"")
  private String mode;

  /**
  * Description: "A resource associated with the event.  This is the resource that defines the event."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"focus\"")
  private String focus;

  /**
  * Description: "Information about the request for this event."
  */
  @javax.persistence.Basic
  @Column(name="\"request_id\"")
  private String request_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="request_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> request;

  /**
  * Description: "Information about the response for this event."
  */
  @javax.persistence.Basic
  @Column(name="\"response_id\"")
  private String response_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="response_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> response;

  /**
  * Description: "Guidance on how this event is handled, such as internal system trigger points, business rules, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"documentation\"")
  private String documentation;

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

  public CapabilityStatementEventModel() {
  }

  public CapabilityStatementEventModel(CapabilityStatementEvent o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getCode() ) {
    	this.code_id = "code" + this.id;
    	this.code = CodingHelper.toModel(o.getCode(), this.code_id);
    }
    this.category = o.getCategory();
    this.mode = o.getMode();
    this.focus = o.getFocus();
    if (null != o.getRequest() ) {
    	this.request_id = "request" + this.id;
    	this.request = ReferenceHelper.toModel(o.getRequest(), this.request_id);
    }
    if (null != o.getResponse() ) {
    	this.response_id = "response" + this.id;
    	this.response = ReferenceHelper.toModel(o.getResponse(), this.response_id);
    }
    this.documentation = o.getDocumentation();
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodingModel> getCode() {
    return this.code;
  }
  public void setCode( java.util.List<CodingModel> value) {
    this.code = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getMode() {
    return this.mode;
  }
  public void setMode( String value) {
    this.mode = value;
  }
  public String getFocus() {
    return this.focus;
  }
  public void setFocus( String value) {
    this.focus = value;
  }
  public java.util.List<ReferenceModel> getRequest() {
    return this.request;
  }
  public void setRequest( java.util.List<ReferenceModel> value) {
    this.request = value;
  }
  public java.util.List<ReferenceModel> getResponse() {
    return this.response;
  }
  public void setResponse( java.util.List<ReferenceModel> value) {
    this.response = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
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
    builder.append("[CapabilityStatementEventModel]:" + "\n");
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("mode" + "->" + this.mode + "\n"); 
     builder.append("focus" + "->" + this.focus + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CapabilityStatementEventModel]:" + "\n");
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("mode" + "->" + this.mode + "\n"); 
     builder.append("focus" + "->" + this.focus + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}
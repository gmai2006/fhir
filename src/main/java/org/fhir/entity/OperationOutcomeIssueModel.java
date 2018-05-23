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
* "A collection of error, warning or information messages that result from a system action."
*/
@Entity
@Table(name="operationoutcomeissue")
public class OperationOutcomeIssueModel  implements Serializable {
	private static final long serialVersionUID = 151967883198034244L;
  /**
  * Description: "Indicates whether the issue indicates a variation from successful processing."
  */
  @javax.persistence.Basic
  @Column(name="\"severity\"")
  private String severity;

  /**
  * Description: "Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide its own code for the error in the details element."
  */
  @javax.persistence.Basic
  @Column(name="\"code\"")
  private String code;

  /**
  * Description: "Additional details about the error. This may be a text description of the error, or a system code that identifies the error."
  */
  @javax.persistence.Basic
  @Column(name="\"details_id\"")
  private String details_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="details_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> details;

  /**
  * Description: "Additional diagnostic information about the issue.  Typically, this may be a description of how a value is erroneous, or a stack dump to help trace the issue."
  */
  @javax.persistence.Basic
  @Column(name="\"diagnostics\"")
  private String diagnostics;

  /**
  * Description: "For resource issues, this will be a simple XPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised.  For HTTP errors, will be \"http.\" + the parameter name."
  */
  @javax.persistence.Basic
  @Column(name="\"location\"")
  private String location;

  /**
  * Description: "A simple FHIRPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised."
  */
  @javax.persistence.Basic
  @Column(name="\"expression\"")
  private String expression;

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

  public OperationOutcomeIssueModel() {
  }

  public OperationOutcomeIssueModel(OperationOutcomeIssue o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.severity = o.getSeverity();
    this.code = o.getCode();
    if (null != o.getDetails() ) {
    	this.details_id = "details" + this.id;
    	this.details = CodeableConceptHelper.toModel(o.getDetails(), this.details_id);
    }
    this.diagnostics = o.getDiagnostics();
    this.location = org.fhir.utils.JsonUtils.toJson(o.getLocation());
    this.expression = org.fhir.utils.JsonUtils.toJson(o.getExpression());
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getSeverity() {
    return this.severity;
  }
  public void setSeverity( String value) {
    this.severity = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public java.util.List<CodeableConceptModel> getDetails() {
    return this.details;
  }
  public void setDetails( java.util.List<CodeableConceptModel> value) {
    this.details = value;
  }
  public String getDiagnostics() {
    return this.diagnostics;
  }
  public void setDiagnostics( String value) {
    this.diagnostics = value;
  }
  public String getLocation() {
    return this.location;
  }
  public void setLocation( String value) {
    this.location = value;
  }
  public String getExpression() {
    return this.expression;
  }
  public void setExpression( String value) {
    this.expression = value;
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
    builder.append("[OperationOutcomeIssueModel]:" + "\n");
     builder.append("severity" + "->" + this.severity + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("diagnostics" + "->" + this.diagnostics + "\n"); 
     builder.append("location" + "->" + this.location + "\n"); 
     builder.append("expression" + "->" + this.expression + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[OperationOutcomeIssueModel]:" + "\n");
     builder.append("severity" + "->" + this.severity + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("details" + "->" + this.details + "\n"); 
     builder.append("diagnostics" + "->" + this.diagnostics + "\n"); 
     builder.append("location" + "->" + this.location + "\n"); 
     builder.append("expression" + "->" + this.expression + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}
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
import org.fhir.entity.OperationOutcomeIssueModel;
import com.google.gson.GsonBuilder;

/**
* "A collection of error, warning or information messages that result from a system action."
*/
public class OperationOutcomeIssue  {
  /**
  * Description: "Indicates whether the issue indicates a variation from successful processing."
  */
  private String severity;

  /**
  * Description: "Extensions for severity"
  */
  private transient Element _severity;

  /**
  * Description: "Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide its own code for the error in the details element."
  */
  private String code;

  /**
  * Description: "Extensions for code"
  */
  private transient Element _code;

  /**
  * Description: "Additional details about the error. This may be a text description of the error, or a system code that identifies the error."
  */
  private CodeableConcept details;

  /**
  * Description: "Additional diagnostic information about the issue.  Typically, this may be a description of how a value is erroneous, or a stack dump to help trace the issue."
  */
  private String diagnostics;

  /**
  * Description: "Extensions for diagnostics"
  */
  private transient Element _diagnostics;

  /**
  * Description: "For resource issues, this will be a simple XPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised.  For HTTP errors, will be \"http.\" + the parameter name."
  */
  private java.util.List<String> location = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for location"
  */
  private transient java.util.List<Element> _location = new java.util.ArrayList<>();

  /**
  * Description: "A simple FHIRPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised."
  */
  private java.util.List<String> expression = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for expression"
  */
  private transient java.util.List<Element> _expression = new java.util.ArrayList<>();

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

  public OperationOutcomeIssue() {
  }

  public OperationOutcomeIssue(OperationOutcomeIssueModel o) {
    this.id = o.getId();
      if (null != o.getSeverity()) {
        this.severity = new String(o.getSeverity());
      }

      if (null != o.getCode()) {
        this.code = new String(o.getCode());
      }

      this.details = CodeableConcept.fromJson(o.getDetails());
      if (null != o.getDiagnostics()) {
        this.diagnostics = new String(o.getDiagnostics());
      }

      this.location = org.fhir.utils.JsonUtils.json2Array(o.getLocation());

      this.expression = org.fhir.utils.JsonUtils.json2Array(o.getExpression());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setSeverity( String value) {
    this.severity = SeverityEnum.fromCode(value);
  }
  public String getSeverity() {
    return this.severity;
  }
  public void set_severity( Element value) {
    this._severity = value;
  }
  public Element get_severity() {
    return this._severity;
  }
  public void setCode( String value) {
    this.code = CodeEnum.fromCode(value);
  }
  public String getCode() {
    return this.code;
  }
  public void set_code( Element value) {
    this._code = value;
  }
  public Element get_code() {
    return this._code;
  }
  public void setDetails( CodeableConcept value) {
    this.details = value;
  }
  public CodeableConcept getDetails() {
    return this.details;
  }
  public void setDiagnostics( String value) {
    this.diagnostics = value;
  }
  public String getDiagnostics() {
    return this.diagnostics;
  }
  public void set_diagnostics( Element value) {
    this._diagnostics = value;
  }
  public Element get_diagnostics() {
    return this._diagnostics;
  }
  public void setLocation( java.util.List<String> value) {
    this.location = value;
  }
  public java.util.List<String> getLocation() {
    return this.location;
  }
  public void set_location( java.util.List<Element> value) {
    this._location = value;
  }
  public java.util.List<Element> get_location() {
    return this._location;
  }
  public void setExpression( java.util.List<String> value) {
    this.expression = value;
  }
  public java.util.List<String> getExpression() {
    return this.expression;
  }
  public void set_expression( java.util.List<Element> value) {
    this._expression = value;
  }
  public java.util.List<Element> get_expression() {
    return this._expression;
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
     builder.append("severity" + "[" + String.valueOf(this.severity) + "]\n"); 
     builder.append("_severity" + "[" + String.valueOf(this._severity) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("_code" + "[" + String.valueOf(this._code) + "]\n"); 
     builder.append("details" + "[" + String.valueOf(this.details) + "]\n"); 
     builder.append("diagnostics" + "[" + String.valueOf(this.diagnostics) + "]\n"); 
     builder.append("_diagnostics" + "[" + String.valueOf(this._diagnostics) + "]\n"); 
     builder.append("location" + "[" + String.valueOf(this.location) + "]\n"); 
     builder.append("_location" + "[" + String.valueOf(this._location) + "]\n"); 
     builder.append("expression" + "[" + String.valueOf(this.expression) + "]\n"); 
     builder.append("_expression" + "[" + String.valueOf(this._expression) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum SeverityEnum {
  	fatal,
  	error,
  	warning,
  	information,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "fatal" : { return fatal.toString(); }
  			case "error" : { return error.toString(); }
  			case "warning" : { return warning.toString(); }
  			case "information" : { return information.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum CodeEnum {
  	invalid,
  	structure,
  	required,
  	value,
  	invariant,
  	security,
  	login,
  	unknown,
  	expired,
  	forbidden,
  	suppressed,
  	processing,
  	notsupported,
  	duplicate,
  	notfound,
  	toolong,
  	codeinvalid,
  	extension,
  	toocostly,
  	businessrule,
  	conflict,
  	incomplete,
  	FHIRtransient,
  	lockerror,
  	nostore,
  	exception,
  	timeout,
  	throttled,
  	informational,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "invalid" : { return invalid.toString(); }
  			case "structure" : { return structure.toString(); }
  			case "required" : { return required.toString(); }
  			case "value" : { return value.toString(); }
  			case "invariant" : { return invariant.toString(); }
  			case "security" : { return security.toString(); }
  			case "login" : { return login.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			case "expired" : { return expired.toString(); }
  			case "forbidden" : { return forbidden.toString(); }
  			case "suppressed" : { return suppressed.toString(); }
  			case "processing" : { return processing.toString(); }
  			case "notsupported" : { return notsupported.toString(); }
  			case "duplicate" : { return duplicate.toString(); }
  			case "notfound" : { return notfound.toString(); }
  			case "toolong" : { return toolong.toString(); }
  			case "codeinvalid" : { return codeinvalid.toString(); }
  			case "extension" : { return extension.toString(); }
  			case "toocostly" : { return toocostly.toString(); }
  			case "businessrule" : { return businessrule.toString(); }
  			case "conflict" : { return conflict.toString(); }
  			case "incomplete" : { return incomplete.toString(); }
  			case "transient" : { return FHIRtransient.toString(); }
  			case "lockerror" : { return lockerror.toString(); }
  			case "nostore" : { return nostore.toString(); }
  			case "exception" : { return exception.toString(); }
  			case "timeout" : { return timeout.toString(); }
  			case "throttled" : { return throttled.toString(); }
  			case "informational" : { return informational.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<OperationOutcomeIssue> fromArray(java.util.List<OperationOutcomeIssueModel> list) {
    return (java.util.List<OperationOutcomeIssue>)list.stream()
      .map(model -> new OperationOutcomeIssue(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<OperationOutcomeIssueModel> toModelArray(java.util.List<OperationOutcomeIssue> list) {
    return (java.util.List<OperationOutcomeIssueModel>)list.stream()
      .map(model -> new OperationOutcomeIssueModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static OperationOutcomeIssue fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, OperationOutcomeIssue.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(OperationOutcomeIssue o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<OperationOutcomeIssue> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
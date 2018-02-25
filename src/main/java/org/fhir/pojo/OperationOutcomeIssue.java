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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A collection of error, warning or information messages that result from a system action."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OperationOutcomeIssue  extends BackboneElement  {
  /**
  * Description: "Indicates whether the issue indicates a variation from successful processing."
  */
  protected String severity;

  /**
  * Description: "Extensions for severity"
  */
  protected transient Element _severity;

  /**
  * Description: "Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide its own code for the error in the details element."
  */
  protected String code;

  /**
  * Description: "Extensions for code"
  */
  protected transient Element _code;

  /**
  * Description: "Additional details about the error. This may be a text description of the error, or a system code that identifies the error."
  */
  protected CodeableConcept details;

  /**
  * Description: "Additional diagnostic information about the issue.  Typically, this may be a description of how a value is erroneous, or a stack dump to help trace the issue."
  */
  protected String diagnostics;

  /**
  * Description: "Extensions for diagnostics"
  */
  protected transient Element _diagnostics;

  /**
  * Description: "For resource issues, this will be a simple XPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised.  For HTTP errors, will be \"http.\" + the parameter name."
  */
  protected java.util.List<String> location;

  /**
  * Description: "Extensions for location"
  */
  protected transient java.util.List<Element> _location;

  /**
  * Description: "A simple FHIRPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised."
  */
  protected java.util.List<String> expression;

  /**
  * Description: "Extensions for expression"
  */
  protected transient java.util.List<Element> _expression;

  public OperationOutcomeIssue() {
  }

  public OperationOutcomeIssue(OperationOutcomeIssueModel o) {
    this.id = o.getId();
    if (null != o.getSeverity()) {
      this.severity = o.getSeverity();
    }
    if (null != o.getCode()) {
      this.code = o.getCode();
    }
    if (null != o.getDetails() && !o.getDetails().isEmpty()) {
      this.details = new CodeableConcept(o.getDetails().get(0));
    }
    if (null != o.getDiagnostics()) {
      this.diagnostics = o.getDiagnostics();
    }
    if (o.getLocation() != null) {
    	this.location = org.fhir.utils.JsonUtils.json2Array(o.getLocation());
    }
    if (o.getExpression() != null) {
    	this.expression = org.fhir.utils.JsonUtils.json2Array(o.getExpression());
    }
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[OperationOutcomeIssue]:" + "\n");
     if(this.severity != null) builder.append("severity" + "->" + this.severity.toString() + "\n"); 
     if(this._severity != null) builder.append("_severity" + "->" + this._severity.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this._code != null) builder.append("_code" + "->" + this._code.toString() + "\n"); 
     if(this.details != null) builder.append("details" + "->" + this.details.toString() + "\n"); 
     if(this.diagnostics != null) builder.append("diagnostics" + "->" + this.diagnostics.toString() + "\n"); 
     if(this._diagnostics != null) builder.append("_diagnostics" + "->" + this._diagnostics.toString() + "\n"); 
     if(this.location != null) builder.append("location" + "->" + this.location.toString() + "\n"); 
     if(this._location != null) builder.append("_location" + "->" + this._location.toString() + "\n"); 
     if(this.expression != null) builder.append("expression" + "->" + this.expression.toString() + "\n"); 
     if(this._expression != null) builder.append("_expression" + "->" + this._expression.toString() + "\n"); ;
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

}
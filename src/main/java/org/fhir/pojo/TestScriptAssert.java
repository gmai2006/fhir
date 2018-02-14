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
import com.google.gson.GsonBuilder;

/**
* "A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification."
*/
public class TestScriptAssert  {
  /**
  * Description: "The label would be used for tracking/logging purposes by test engines."
  */
  private String label;

  /**
  * Description: "Extensions for label"
  */
  private transient Element _label;

  /**
  * Description: "The description would be used by test engines for tracking and reporting purposes."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "The direction to use for the assertion."
  */
  private String direction;

  /**
  * Description: "Extensions for direction"
  */
  private transient Element _direction;

  /**
  * Description: "Id of the source fixture used as the contents to be evaluated by either the \"source/expression\" or \"sourceId/path\" definition."
  */
  private String compareToSourceId;

  /**
  * Description: "Extensions for compareToSourceId"
  */
  private transient Element _compareToSourceId;

  /**
  * Description: "The fluentpath expression to evaluate against the source fixture. When compareToSourceId is defined, either compareToSourceExpression or compareToSourcePath must be defined, but not both."
  */
  private String compareToSourceExpression;

  /**
  * Description: "Extensions for compareToSourceExpression"
  */
  private transient Element _compareToSourceExpression;

  /**
  * Description: "XPath or JSONPath expression to evaluate against the source fixture. When compareToSourceId is defined, either compareToSourceExpression or compareToSourcePath must be defined, but not both."
  */
  private String compareToSourcePath;

  /**
  * Description: "Extensions for compareToSourcePath"
  */
  private transient Element _compareToSourcePath;

  /**
  * Description: "The content-type or mime-type to use for RESTful operation in the 'Content-Type' header."
  */
  private String contentType;

  /**
  * Description: "Extensions for contentType"
  */
  private transient Element _contentType;

  /**
  * Description: "The fluentpath expression to be evaluated against the request or response message contents - HTTP headers and payload."
  */
  private String expression;

  /**
  * Description: "Extensions for expression"
  */
  private transient Element _expression;

  /**
  * Description: "The HTTP header field name e.g. 'Location'."
  */
  private String headerField;

  /**
  * Description: "Extensions for headerField"
  */
  private transient Element _headerField;

  /**
  * Description: "The ID of a fixture.  Asserts that the response contains at a minimum the fixture specified by minimumId."
  */
  private String minimumId;

  /**
  * Description: "Extensions for minimumId"
  */
  private transient Element _minimumId;

  /**
  * Description: "Whether or not the test execution performs validation on the bundle navigation links."
  */
  private Boolean navigationLinks;

  /**
  * Description: "Extensions for navigationLinks"
  */
  private transient Element _navigationLinks;

  /**
  * Description: "The operator type defines the conditional behavior of the assert. If not defined, the default is equals."
  */
  private String operator;

  /**
  * Description: "Extensions for operator"
  */
  private transient Element _operator;

  /**
  * Description: "The XPath or JSONPath expression to be evaluated against the fixture representing the response received from server."
  */
  private String path;

  /**
  * Description: "Extensions for path"
  */
  private transient Element _path;

  /**
  * Description: "The request method or HTTP operation code to compare against that used by the client system under test."
  */
  private String requestMethod;

  /**
  * Description: "Extensions for requestMethod"
  */
  private transient Element _requestMethod;

  /**
  * Description: "The value to use in a comparison against the request URL path string."
  */
  private String requestURL;

  /**
  * Description: "Extensions for requestURL"
  */
  private transient Element _requestURL;

  /**
  * Description: "The type of the resource.  See http://build.fhir.org/resourcelist.html."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String resource;

  /**
  * Description: "Extensions for resource"
  */
  private transient Element _resource;

  /**
  * Description: "okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable."
  */
  private String response;

  /**
  * Description: "Extensions for response"
  */
  private transient Element _response;

  /**
  * Description: "The value of the HTTP response code to be tested."
  */
  private String responseCode;

  /**
  * Description: "Extensions for responseCode"
  */
  private transient Element _responseCode;

  /**
  * Description: "The TestScript.rule this assert will evaluate."
  */
  private TestScriptRule2 rule;

  /**
  * Description: "The TestScript.ruleset this assert will evaluate."
  */
  private TestScriptRuleset1 ruleset;

  /**
  * Description: "Fixture to evaluate the XPath/JSONPath expression or the headerField  against."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String sourceId;

  /**
  * Description: "Extensions for sourceId"
  */
  private transient Element _sourceId;

  /**
  * Description: "The ID of the Profile to validate against."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String validateProfileId;

  /**
  * Description: "Extensions for validateProfileId"
  */
  private transient Element _validateProfileId;

  /**
  * Description: "The value to compare to."
  */
  private String value;

  /**
  * Description: "Extensions for value"
  */
  private transient Element _value;

  /**
  * Description: "Whether or not the test execution will produce a warning only on error for this assert."
  */
  private Boolean warningOnly;

  /**
  * Description: "Extensions for warningOnly"
  */
  private transient Element _warningOnly;

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
  @javax.validation.constraints.NotNull
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

  public TestScriptAssert() {}

  public void setLabel( String value) {
    this.label = value;
  }
  public String getLabel() {
    return this.label;
  }
  public void set_label( Element value) {
    this._label = value;
  }
  public Element get_label() {
    return this._label;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setDirection( String value) {
    this.direction = DirectionEnum.fromCode(value);
  }
  public String getDirection() {
    return this.direction;
  }
  public void set_direction( Element value) {
    this._direction = value;
  }
  public Element get_direction() {
    return this._direction;
  }
  public void setCompareToSourceId( String value) {
    this.compareToSourceId = value;
  }
  public String getCompareToSourceId() {
    return this.compareToSourceId;
  }
  public void set_compareToSourceId( Element value) {
    this._compareToSourceId = value;
  }
  public Element get_compareToSourceId() {
    return this._compareToSourceId;
  }
  public void setCompareToSourceExpression( String value) {
    this.compareToSourceExpression = value;
  }
  public String getCompareToSourceExpression() {
    return this.compareToSourceExpression;
  }
  public void set_compareToSourceExpression( Element value) {
    this._compareToSourceExpression = value;
  }
  public Element get_compareToSourceExpression() {
    return this._compareToSourceExpression;
  }
  public void setCompareToSourcePath( String value) {
    this.compareToSourcePath = value;
  }
  public String getCompareToSourcePath() {
    return this.compareToSourcePath;
  }
  public void set_compareToSourcePath( Element value) {
    this._compareToSourcePath = value;
  }
  public Element get_compareToSourcePath() {
    return this._compareToSourcePath;
  }
  public void setContentType( String value) {
    this.contentType = ContentTypeEnum.fromCode(value);
  }
  public String getContentType() {
    return this.contentType;
  }
  public void set_contentType( Element value) {
    this._contentType = value;
  }
  public Element get_contentType() {
    return this._contentType;
  }
  public void setExpression( String value) {
    this.expression = value;
  }
  public String getExpression() {
    return this.expression;
  }
  public void set_expression( Element value) {
    this._expression = value;
  }
  public Element get_expression() {
    return this._expression;
  }
  public void setHeaderField( String value) {
    this.headerField = value;
  }
  public String getHeaderField() {
    return this.headerField;
  }
  public void set_headerField( Element value) {
    this._headerField = value;
  }
  public Element get_headerField() {
    return this._headerField;
  }
  public void setMinimumId( String value) {
    this.minimumId = value;
  }
  public String getMinimumId() {
    return this.minimumId;
  }
  public void set_minimumId( Element value) {
    this._minimumId = value;
  }
  public Element get_minimumId() {
    return this._minimumId;
  }
  public void setNavigationLinks( Boolean value) {
    this.navigationLinks = value;
  }
  public Boolean getNavigationLinks() {
    return this.navigationLinks;
  }
  public void set_navigationLinks( Element value) {
    this._navigationLinks = value;
  }
  public Element get_navigationLinks() {
    return this._navigationLinks;
  }
  public void setOperator( String value) {
    this.operator = OperatorEnum.fromCode(value);
  }
  public String getOperator() {
    return this.operator;
  }
  public void set_operator( Element value) {
    this._operator = value;
  }
  public Element get_operator() {
    return this._operator;
  }
  public void setPath( String value) {
    this.path = value;
  }
  public String getPath() {
    return this.path;
  }
  public void set_path( Element value) {
    this._path = value;
  }
  public Element get_path() {
    return this._path;
  }
  public void setRequestMethod( String value) {
    this.requestMethod = RequestMethodEnum.fromCode(value);
  }
  public String getRequestMethod() {
    return this.requestMethod;
  }
  public void set_requestMethod( Element value) {
    this._requestMethod = value;
  }
  public Element get_requestMethod() {
    return this._requestMethod;
  }
  public void setRequestURL( String value) {
    this.requestURL = value;
  }
  public String getRequestURL() {
    return this.requestURL;
  }
  public void set_requestURL( Element value) {
    this._requestURL = value;
  }
  public Element get_requestURL() {
    return this._requestURL;
  }
  public void setResource( String value) {
    this.resource = value;
  }
  public String getResource() {
    return this.resource;
  }
  public void set_resource( Element value) {
    this._resource = value;
  }
  public Element get_resource() {
    return this._resource;
  }
  public void setResponse( String value) {
    this.response = ResponseEnum.fromCode(value);
  }
  public String getResponse() {
    return this.response;
  }
  public void set_response( Element value) {
    this._response = value;
  }
  public Element get_response() {
    return this._response;
  }
  public void setResponseCode( String value) {
    this.responseCode = value;
  }
  public String getResponseCode() {
    return this.responseCode;
  }
  public void set_responseCode( Element value) {
    this._responseCode = value;
  }
  public Element get_responseCode() {
    return this._responseCode;
  }
  public void setRule( TestScriptRule2 value) {
    this.rule = value;
  }
  public TestScriptRule2 getRule() {
    return this.rule;
  }
  public void setRuleset( TestScriptRuleset1 value) {
    this.ruleset = value;
  }
  public TestScriptRuleset1 getRuleset() {
    return this.ruleset;
  }
  public void setSourceId( String value) {
    this.sourceId = value;
  }
  public String getSourceId() {
    return this.sourceId;
  }
  public void set_sourceId( Element value) {
    this._sourceId = value;
  }
  public Element get_sourceId() {
    return this._sourceId;
  }
  public void setValidateProfileId( String value) {
    this.validateProfileId = value;
  }
  public String getValidateProfileId() {
    return this.validateProfileId;
  }
  public void set_validateProfileId( Element value) {
    this._validateProfileId = value;
  }
  public Element get_validateProfileId() {
    return this._validateProfileId;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }
  public void set_value( Element value) {
    this._value = value;
  }
  public Element get_value() {
    return this._value;
  }
  public void setWarningOnly( Boolean value) {
    this.warningOnly = value;
  }
  public Boolean getWarningOnly() {
    return this.warningOnly;
  }
  public void set_warningOnly( Element value) {
    this._warningOnly = value;
  }
  public Element get_warningOnly() {
    return this._warningOnly;
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
    builder.append("[TestScriptAssert]:" + "\n");
     if(this.label != null) builder.append("label" + "->" + this.label.toString() + "\n"); 
     if(this._label != null) builder.append("_label" + "->" + this._label.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.direction != null) builder.append("direction" + "->" + this.direction.toString() + "\n"); 
     if(this._direction != null) builder.append("_direction" + "->" + this._direction.toString() + "\n"); 
     if(this.compareToSourceId != null) builder.append("compareToSourceId" + "->" + this.compareToSourceId.toString() + "\n"); 
     if(this._compareToSourceId != null) builder.append("_compareToSourceId" + "->" + this._compareToSourceId.toString() + "\n"); 
     if(this.compareToSourceExpression != null) builder.append("compareToSourceExpression" + "->" + this.compareToSourceExpression.toString() + "\n"); 
     if(this._compareToSourceExpression != null) builder.append("_compareToSourceExpression" + "->" + this._compareToSourceExpression.toString() + "\n"); 
     if(this.compareToSourcePath != null) builder.append("compareToSourcePath" + "->" + this.compareToSourcePath.toString() + "\n"); 
     if(this._compareToSourcePath != null) builder.append("_compareToSourcePath" + "->" + this._compareToSourcePath.toString() + "\n"); 
     if(this.contentType != null) builder.append("contentType" + "->" + this.contentType.toString() + "\n"); 
     if(this._contentType != null) builder.append("_contentType" + "->" + this._contentType.toString() + "\n"); 
     if(this.expression != null) builder.append("expression" + "->" + this.expression.toString() + "\n"); 
     if(this._expression != null) builder.append("_expression" + "->" + this._expression.toString() + "\n"); 
     if(this.headerField != null) builder.append("headerField" + "->" + this.headerField.toString() + "\n"); 
     if(this._headerField != null) builder.append("_headerField" + "->" + this._headerField.toString() + "\n"); 
     if(this.minimumId != null) builder.append("minimumId" + "->" + this.minimumId.toString() + "\n"); 
     if(this._minimumId != null) builder.append("_minimumId" + "->" + this._minimumId.toString() + "\n"); 
     if(this.navigationLinks != null) builder.append("navigationLinks" + "->" + this.navigationLinks.toString() + "\n"); 
     if(this._navigationLinks != null) builder.append("_navigationLinks" + "->" + this._navigationLinks.toString() + "\n"); 
     if(this.operator != null) builder.append("operator" + "->" + this.operator.toString() + "\n"); 
     if(this._operator != null) builder.append("_operator" + "->" + this._operator.toString() + "\n"); 
     if(this.path != null) builder.append("path" + "->" + this.path.toString() + "\n"); 
     if(this._path != null) builder.append("_path" + "->" + this._path.toString() + "\n"); 
     if(this.requestMethod != null) builder.append("requestMethod" + "->" + this.requestMethod.toString() + "\n"); 
     if(this._requestMethod != null) builder.append("_requestMethod" + "->" + this._requestMethod.toString() + "\n"); 
     if(this.requestURL != null) builder.append("requestURL" + "->" + this.requestURL.toString() + "\n"); 
     if(this._requestURL != null) builder.append("_requestURL" + "->" + this._requestURL.toString() + "\n"); 
     if(this.resource != null) builder.append("resource" + "->" + this.resource.toString() + "\n"); 
     if(this._resource != null) builder.append("_resource" + "->" + this._resource.toString() + "\n"); 
     if(this.response != null) builder.append("response" + "->" + this.response.toString() + "\n"); 
     if(this._response != null) builder.append("_response" + "->" + this._response.toString() + "\n"); 
     if(this.responseCode != null) builder.append("responseCode" + "->" + this.responseCode.toString() + "\n"); 
     if(this._responseCode != null) builder.append("_responseCode" + "->" + this._responseCode.toString() + "\n"); 
     if(this.rule != null) builder.append("rule" + "->" + this.rule.toString() + "\n"); 
     if(this.ruleset != null) builder.append("ruleset" + "->" + this.ruleset.toString() + "\n"); 
     if(this.sourceId != null) builder.append("sourceId" + "->" + this.sourceId.toString() + "\n"); 
     if(this._sourceId != null) builder.append("_sourceId" + "->" + this._sourceId.toString() + "\n"); 
     if(this.validateProfileId != null) builder.append("validateProfileId" + "->" + this.validateProfileId.toString() + "\n"); 
     if(this._validateProfileId != null) builder.append("_validateProfileId" + "->" + this._validateProfileId.toString() + "\n"); 
     if(this.value != null) builder.append("value" + "->" + this.value.toString() + "\n"); 
     if(this._value != null) builder.append("_value" + "->" + this._value.toString() + "\n"); 
     if(this.warningOnly != null) builder.append("warningOnly" + "->" + this.warningOnly.toString() + "\n"); 
     if(this._warningOnly != null) builder.append("_warningOnly" + "->" + this._warningOnly.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }

  public enum DirectionEnum {
  	response,
  	request,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "response" : { return response.toString(); }
  			case "request" : { return request.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }public enum ContentTypeEnum {
  	xml,
  	json,
  	ttl,
  	none,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "xml" : { return xml.toString(); }
  			case "json" : { return json.toString(); }
  			case "ttl" : { return ttl.toString(); }
  			case "none" : { return none.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }public enum OperatorEnum {
  	equals,
  	notEquals,
  	in,
  	notIn,
  	greaterThan,
  	lessThan,
  	empty,
  	notEmpty,
  	contains,
  	notContains,
  	eval,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "equals" : { return equals.toString(); }
  			case "notEquals" : { return notEquals.toString(); }
  			case "in" : { return in.toString(); }
  			case "notIn" : { return notIn.toString(); }
  			case "greaterThan" : { return greaterThan.toString(); }
  			case "lessThan" : { return lessThan.toString(); }
  			case "empty" : { return empty.toString(); }
  			case "notEmpty" : { return notEmpty.toString(); }
  			case "contains" : { return contains.toString(); }
  			case "notContains" : { return notContains.toString(); }
  			case "eval" : { return eval.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }public enum RequestMethodEnum {
  	delete,
  	get,
  	options,
  	patch,
  	post,
  	put,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "delete" : { return delete.toString(); }
  			case "get" : { return get.toString(); }
  			case "options" : { return options.toString(); }
  			case "patch" : { return patch.toString(); }
  			case "post" : { return post.toString(); }
  			case "put" : { return put.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }public enum ResponseEnum {
  	okay,
  	created,
  	noContent,
  	notModified,
  	bad,
  	forbidden,
  	notFound,
  	methodNotAllowed,
  	conflict,
  	gone,
  	preconditionFailed,
  	unprocessable,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "okay" : { return okay.toString(); }
  			case "created" : { return created.toString(); }
  			case "noContent" : { return noContent.toString(); }
  			case "notModified" : { return notModified.toString(); }
  			case "bad" : { return bad.toString(); }
  			case "forbidden" : { return forbidden.toString(); }
  			case "notFound" : { return notFound.toString(); }
  			case "methodNotAllowed" : { return methodNotAllowed.toString(); }
  			case "conflict" : { return conflict.toString(); }
  			case "gone" : { return gone.toString(); }
  			case "preconditionFailed" : { return preconditionFailed.toString(); }
  			case "unprocessable" : { return unprocessable.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }
}
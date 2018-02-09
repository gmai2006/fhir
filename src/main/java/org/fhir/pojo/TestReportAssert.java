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
* "A summary of information based on the results of executing a TestScript."
*/
public class TestReportAssert  {
  /**
  * Description: "The result of this assertion."
  */
  private String result;

  /**
  * Description: "Extensions for result"
  */
  private transient Element _result;

  /**
  * Description: "An explanatory message associated with the result."
  */
  private String message;

  /**
  * Description: "Extensions for message"
  */
  private transient Element _message;

  /**
  * Description: "A link to further details on the result."
  */
  private String detail;

  /**
  * Description: "Extensions for detail"
  */
  private transient Element _detail;

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

  public TestReportAssert() {}

  public void setResult( String value) {
    this.result = ResultEnum.fromCode(value);
  }
  public String getResult() {
    return this.result;
  }
  public void set_result( Element value) {
    this._result = value;
  }
  public Element get_result() {
    return this._result;
  }
  public void setMessage( String value) {
    this.message = value;
  }
  public String getMessage() {
    return this.message;
  }
  public void set_message( Element value) {
    this._message = value;
  }
  public Element get_message() {
    return this._message;
  }
  public void setDetail( String value) {
    this.detail = value;
  }
  public String getDetail() {
    return this.detail;
  }
  public void set_detail( Element value) {
    this._detail = value;
  }
  public Element get_detail() {
    return this._detail;
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
     builder.append("result" + "[" + String.valueOf(this.result) + "]\n"); 
     builder.append("_result" + "[" + String.valueOf(this._result) + "]\n"); 
     builder.append("message" + "[" + String.valueOf(this.message) + "]\n"); 
     builder.append("_message" + "[" + String.valueOf(this._message) + "]\n"); 
     builder.append("detail" + "[" + String.valueOf(this.detail) + "]\n"); 
     builder.append("_detail" + "[" + String.valueOf(this._detail) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public static TestReportAssert fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, TestReportAssert.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(TestReportAssert o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<TestReportAssert> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public enum ResultEnum {
  	pass,
  	skip,
  	fail,
  	warning,
  	error,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "pass" : { return pass.toString(); }
  			case "skip" : { return skip.toString(); }
  			case "fail" : { return fail.toString(); }
  			case "warning" : { return warning.toString(); }
  			case "error" : { return error.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }
}
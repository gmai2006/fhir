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
import org.fhir.entity.TestReportOperationModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A summary of information based on the results of executing a TestScript."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TestReportOperation  extends BackboneElement  {
  /**
  * Description: "The result of this operation."
  */
  protected String result;

  /**
  * Description: "Extensions for result"
  */
  protected transient Element _result;

  /**
  * Description: "An explanatory message associated with the result."
  */
  protected String message;

  /**
  * Description: "Extensions for message"
  */
  protected transient Element _message;

  /**
  * Description: "A link to further details on the result."
  */
  protected String detail;

  /**
  * Description: "Extensions for detail"
  */
  protected transient Element _detail;

  public TestReportOperation() {
  }

  public TestReportOperation(TestReportOperationModel o) {
    this.id = o.getId();
    if (null != o.getResult()) {
      this.result = o.getResult();
    }
    if (null != o.getMessage()) {
      this.message = o.getMessage();
    }
    if (null != o.getDetail()) {
      this.detail = o.getDetail();
    }
  }

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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TestReportOperation]:" + "\n");
     if(this.result != null) builder.append("result" + "->" + this.result.toString() + "\n"); 
     if(this._result != null) builder.append("_result" + "->" + this._result.toString() + "\n"); 
     if(this.message != null) builder.append("message" + "->" + this.message.toString() + "\n"); 
     if(this._message != null) builder.append("_message" + "->" + this._message.toString() + "\n"); 
     if(this.detail != null) builder.append("detail" + "->" + this.detail.toString() + "\n"); 
     if(this._detail != null) builder.append("_detail" + "->" + this._detail.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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
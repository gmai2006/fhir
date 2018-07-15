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
import org.fhir.entity.CapabilityStatementInteraction1Model;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CapabilityStatementInteraction1  extends BackboneElement  {
  /**
  * Description: "A coded identifier of the operation, supported by the system."
  */
  protected String code;

  /**
  * Description: "Extensions for code"
  */
  protected transient Element _code;

  /**
  * Description: "Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented."
  */
  protected String documentation;

  /**
  * Description: "Extensions for documentation"
  */
  protected transient Element _documentation;

  public CapabilityStatementInteraction1() {
  }

  public CapabilityStatementInteraction1(CapabilityStatementInteraction1Model o) {
    this.id = o.getId();
    if (null != o.getCode()) {
      this.code = o.getCode();
    }
    if (null != o.getDocumentation()) {
      this.documentation = o.getDocumentation();
    }
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CapabilityStatementInteraction1]:" + "\n");
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this._code != null) builder.append("_code" + "->" + this._code.toString() + "\n"); 
     if(this.documentation != null) builder.append("documentation" + "->" + this.documentation.toString() + "\n"); 
     if(this._documentation != null) builder.append("_documentation" + "->" + this._documentation.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum CodeEnum {
  	transaction,
  	batch,
  	searchsystem,
  	historysystem,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "transaction" : { return transaction.toString(); }
  			case "batch" : { return batch.toString(); }
  			case "searchsystem" : { return searchsystem.toString(); }
  			case "historysystem" : { return historysystem.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}
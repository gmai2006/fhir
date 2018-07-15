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
import org.fhir.entity.CompartmentDefinitionResourceModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A compartment definition that defines how resources are accessed on a server."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CompartmentDefinitionResource  extends BackboneElement  {
  /**
  * Description: "The name of a resource supported by the server."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String code;

  /**
  * Description: "Extensions for code"
  */
  protected transient Element _code;

  /**
  * Description: "The name of a search parameter that represents the link to the compartment. More than one may be listed because a resource may be linked to a compartment in more than one way,."
  */
  protected java.util.List<String> param;

  /**
  * Description: "Extensions for param"
  */
  protected transient java.util.List<Element> _param;

  /**
  * Description: "Additional documentation about the resource and compartment."
  */
  protected String documentation;

  /**
  * Description: "Extensions for documentation"
  */
  protected transient Element _documentation;

  public CompartmentDefinitionResource() {
  }

  public CompartmentDefinitionResource(CompartmentDefinitionResourceModel o) {
    this.id = o.getId();
    if (null != o.getCode()) {
      this.code = o.getCode();
    }
    if (o.getParam() != null) {
    	this.param = org.fhir.utils.JsonUtils.json2Array(o.getParam());
    }
    if (null != o.getDocumentation()) {
      this.documentation = o.getDocumentation();
    }
  }

  public void setCode( String value) {
    this.code = value;
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
  public void setParam( java.util.List<String> value) {
    this.param = value;
  }
  public java.util.List<String> getParam() {
    return this.param;
  }
  public void set_param( java.util.List<Element> value) {
    this._param = value;
  }
  public java.util.List<Element> get_param() {
    return this._param;
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
    builder.append("[CompartmentDefinitionResource]:" + "\n");
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this._code != null) builder.append("_code" + "->" + this._code.toString() + "\n"); 
     if(this.param != null) builder.append("param" + "->" + this.param.toString() + "\n"); 
     if(this._param != null) builder.append("_param" + "->" + this._param.toString() + "\n"); 
     if(this.documentation != null) builder.append("documentation" + "->" + this.documentation.toString() + "\n"); 
     if(this._documentation != null) builder.append("_documentation" + "->" + this._documentation.toString() + "\n"); ;
    return builder.toString();
  }


}
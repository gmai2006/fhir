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
import org.fhir.entity.OperationDefinitionOverloadModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction)."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OperationDefinitionOverload  extends BackboneElement  {
  /**
  * Description: "Name of parameter to include in overload."
  */
  protected java.util.List<String> parameterName;

  /**
  * Description: "Extensions for parameterName"
  */
  protected transient java.util.List<Element> _parameterName;

  /**
  * Description: "Comments to go on overload."
  */
  protected String comment;

  /**
  * Description: "Extensions for comment"
  */
  protected transient Element _comment;

  public OperationDefinitionOverload() {
  }

  public OperationDefinitionOverload(OperationDefinitionOverloadModel o) {
    this.id = o.getId();
    if (o.getParameterName() != null) {
    	this.parameterName = org.fhir.utils.JsonUtils.json2Array(o.getParameterName());
    }
    if (null != o.getComment()) {
      this.comment = o.getComment();
    }
  }

  public void setParameterName( java.util.List<String> value) {
    this.parameterName = value;
  }
  public java.util.List<String> getParameterName() {
    return this.parameterName;
  }
  public void set_parameterName( java.util.List<Element> value) {
    this._parameterName = value;
  }
  public java.util.List<Element> get_parameterName() {
    return this._parameterName;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void set_comment( Element value) {
    this._comment = value;
  }
  public Element get_comment() {
    return this._comment;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[OperationDefinitionOverload]:" + "\n");
     if(this.parameterName != null) builder.append("parameterName" + "->" + this.parameterName.toString() + "\n"); 
     if(this._parameterName != null) builder.append("_parameterName" + "->" + this._parameterName.toString() + "\n"); 
     if(this.comment != null) builder.append("comment" + "->" + this.comment.toString() + "\n"); 
     if(this._comment != null) builder.append("_comment" + "->" + this._comment.toString() + "\n"); ;
    return builder.toString();
  }


}
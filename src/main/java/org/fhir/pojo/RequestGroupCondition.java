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
import org.fhir.entity.RequestGroupConditionModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\"."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestGroupCondition  extends BackboneElement  {
  /**
  * Description: "The kind of condition."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String kind;

  /**
  * Description: "Extensions for kind"
  */
  protected transient Element _kind;

  /**
  * Description: "A brief, natural language description of the condition that effectively communicates the intended semantics."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "The media type of the language for the expression."
  */
  protected String language;

  /**
  * Description: "Extensions for language"
  */
  protected transient Element _language;

  /**
  * Description: "An expression that returns true or false, indicating whether or not the condition is satisfied."
  */
  protected String expression;

  /**
  * Description: "Extensions for expression"
  */
  protected transient Element _expression;

  public RequestGroupCondition() {
  }

  public RequestGroupCondition(RequestGroupConditionModel o) {
    this.id = o.getId();
    if (null != o.getKind()) {
      this.kind = o.getKind();
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getLanguage()) {
      this.language = o.getLanguage();
    }
    if (null != o.getExpression()) {
      this.expression = o.getExpression();
    }
  }

  public void setKind( String value) {
    this.kind = value;
  }
  public String getKind() {
    return this.kind;
  }
  public void set_kind( Element value) {
    this._kind = value;
  }
  public Element get_kind() {
    return this._kind;
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
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[RequestGroupCondition]:" + "\n");
     if(this.kind != null) builder.append("kind" + "->" + this.kind.toString() + "\n"); 
     if(this._kind != null) builder.append("_kind" + "->" + this._kind.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); 
     if(this._language != null) builder.append("_language" + "->" + this._language.toString() + "\n"); 
     if(this.expression != null) builder.append("expression" + "->" + this.expression.toString() + "\n"); 
     if(this._expression != null) builder.append("_expression" + "->" + this._expression.toString() + "\n"); ;
    return builder.toString();
  }


}
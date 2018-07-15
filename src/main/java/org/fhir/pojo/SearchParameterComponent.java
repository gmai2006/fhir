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
import org.fhir.entity.SearchParameterComponentModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A search parameter that defines a named search item that can be used to search/filter on a resource."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchParameterComponent  extends BackboneElement  {
  /**
  * Description: "The definition of the search parameter that describes this part."
  */
  @javax.validation.constraints.NotNull
  protected Reference definition;

  /**
  * Description: "A sub-expression that defines how to extract values for this component from the output of the main SearchParameter.expression."
  */
  protected String expression;

  /**
  * Description: "Extensions for expression"
  */
  protected transient Element _expression;

  public SearchParameterComponent() {
  }

  public SearchParameterComponent(SearchParameterComponentModel o) {
    this.id = o.getId();
    if (null != o.getDefinition() && !o.getDefinition().isEmpty()) {
      this.definition = new Reference(o.getDefinition().get(0));
    }
    if (null != o.getExpression()) {
      this.expression = o.getExpression();
    }
  }

  public void setDefinition( Reference value) {
    this.definition = value;
  }
  public Reference getDefinition() {
    return this.definition;
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
    builder.append("[SearchParameterComponent]:" + "\n");
     if(this.definition != null) builder.append("definition" + "->" + this.definition.toString() + "\n"); 
     if(this.expression != null) builder.append("expression" + "->" + this.expression.toString() + "\n"); 
     if(this._expression != null) builder.append("_expression" + "->" + this._expression.toString() + "\n"); ;
    return builder.toString();
  }


}
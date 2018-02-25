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
import com.fasterxml.jackson.annotation.JsonInclude;
/**
* "Captures constraints on each element within the resource, profile, or extension."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ElementDefinitionSlicing  extends BackboneElement  {
  /**
  * Description: "Designates which child elements are used to discriminate between the slices when processing an instance. If one or more discriminators are provided, the value of the child elements in the instance data SHALL completely distinguish which slice the element in the resource matches based on the allowed values for those elements in each of the slices."
  */
  protected java.util.List<ElementDefinitionDiscriminator> discriminator;

  /**
  * Description: "A human-readable text description of how the slicing works. If there is no discriminator, this is required to be present to provide whatever information is possible about how the slices can be differentiated."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "If the matching elements have to occur in the same order as defined in the profile."
  */
  protected Boolean ordered;

  /**
  * Description: "Extensions for ordered"
  */
  protected transient Element _ordered;

  /**
  * Description: "Whether additional slices are allowed or not. When the slices are ordered, profile authors can also say that additional slices are only allowed at the end."
  */
  protected String rules;

  /**
  * Description: "Extensions for rules"
  */
  protected transient Element _rules;

  public ElementDefinitionSlicing() {}

  public void setDiscriminator( java.util.List<ElementDefinitionDiscriminator> value) {
    this.discriminator = value;
  }
  public java.util.List<ElementDefinitionDiscriminator> getDiscriminator() {
    return this.discriminator;
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
  public void setOrdered( Boolean value) {
    this.ordered = value;
  }
  public Boolean getOrdered() {
    return this.ordered;
  }
  public void set_ordered( Element value) {
    this._ordered = value;
  }
  public Element get_ordered() {
    return this._ordered;
  }
  public void setRules( String value) {
    this.rules = RulesEnum.fromCode(value);
  }
  public String getRules() {
    return this.rules;
  }
  public void set_rules( Element value) {
    this._rules = value;
  }
  public Element get_rules() {
    return this._rules;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ElementDefinitionSlicing]:" + "\n");
     if(this.discriminator != null) builder.append("discriminator" + "->" + this.discriminator.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.ordered != null) builder.append("ordered" + "->" + this.ordered.toString() + "\n"); 
     if(this._ordered != null) builder.append("_ordered" + "->" + this._ordered.toString() + "\n"); 
     if(this.rules != null) builder.append("rules" + "->" + this.rules.toString() + "\n"); 
     if(this._rules != null) builder.append("_rules" + "->" + this._rules.toString() + "\n"); ;
    return builder.toString();
  }

  public enum RulesEnum {
  	closed,
  	open,
  	openAtEnd,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "closed" : { return closed.toString(); }
  			case "open" : { return open.toString(); }
  			case "openAtEnd" : { return openAtEnd.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }
}
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
* "Captures constraints on each element within the resource, profile, or extension."
*/
public class ElementDefinitionSlicing  {
  /**
  * Description: "Designates which child elements are used to discriminate between the slices when processing an instance. If one or more discriminators are provided, the value of the child elements in the instance data SHALL completely distinguish which slice the element in the resource matches based on the allowed values for those elements in each of the slices."
  */
  private java.util.List<ElementDefinitionDiscriminator> discriminator = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable text description of how the slicing works. If there is no discriminator, this is required to be present to provide whatever information is possible about how the slices can be differentiated."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "If the matching elements have to occur in the same order as defined in the profile."
  */
  private Boolean ordered;

  /**
  * Description: "Extensions for ordered"
  */
  private transient Element _ordered;

  /**
  * Description: "Whether additional slices are allowed or not. When the slices are ordered, profile authors can also say that additional slices are only allowed at the end."
  */
  private String rules;

  /**
  * Description: "Extensions for rules"
  */
  private transient Element _rules;

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
    builder.append("[ElementDefinitionSlicing]:" + "\n");
     if(this.discriminator != null) builder.append("discriminator" + "->" + this.discriminator.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.ordered != null) builder.append("ordered" + "->" + this.ordered.toString() + "\n"); 
     if(this._ordered != null) builder.append("_ordered" + "->" + this._ordered.toString() + "\n"); 
     if(this.rules != null) builder.append("rules" + "->" + this.rules.toString() + "\n"); 
     if(this._rules != null) builder.append("_rules" + "->" + this._rules.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
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
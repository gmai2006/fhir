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
import org.fhir.entity.ActivityDefinitionDynamicValueModel;
import com.google.gson.GsonBuilder;

/**
* "This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context."
*/
public class ActivityDefinitionDynamicValue  {
  /**
  * Description: "A brief, natural language description of the intended semantics of the dynamic value."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "The path to the element to be customized. This is the path on the resource that will hold the result of the calculation defined by the expression."
  */
  private String path;

  /**
  * Description: "Extensions for path"
  */
  private transient Element _path;

  /**
  * Description: "The media type of the language for the expression."
  */
  private String language;

  /**
  * Description: "Extensions for language"
  */
  private transient Element _language;

  /**
  * Description: "An expression specifying the value of the customized element."
  */
  private String expression;

  /**
  * Description: "Extensions for expression"
  */
  private transient Element _expression;

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

  public ActivityDefinitionDynamicValue() {
  }

  public ActivityDefinitionDynamicValue(ActivityDefinitionDynamicValueModel o) {
    this.id = o.getId();
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getPath()) {
      this.path = o.getPath();
    }
    if (null != o.getLanguage()) {
      this.language = o.getLanguage();
    }
    if (null != o.getExpression()) {
      this.expression = o.getExpression();
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
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
    builder.append("[ActivityDefinitionDynamicValue]:" + "\n");
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.path != null) builder.append("path" + "->" + this.path.toString() + "\n"); 
     if(this._path != null) builder.append("_path" + "->" + this._path.toString() + "\n"); 
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); 
     if(this._language != null) builder.append("_language" + "->" + this._language.toString() + "\n"); 
     if(this.expression != null) builder.append("expression" + "->" + this.expression.toString() + "\n"); 
     if(this._expression != null) builder.append("_expression" + "->" + this._expression.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}
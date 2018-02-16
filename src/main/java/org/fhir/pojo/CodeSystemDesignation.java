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
import org.fhir.entity.CodeSystemDesignationModel;
import com.google.gson.GsonBuilder;

/**
* "A code system resource specifies a set of codes drawn from one or more code systems."
*/
public class CodeSystemDesignation  extends BackboneElement  {
  /**
  * Description: "The language this designation is defined for."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String language;

  /**
  * Description: "Extensions for language"
  */
  protected transient Element _language;

  /**
  * Description: "A code that details how this designation would be used."
  */
  protected Coding use;

  /**
  * Description: "The text value for this designation."
  */
  protected String value;

  /**
  * Description: "Extensions for value"
  */
  protected transient Element _value;

  public CodeSystemDesignation() {
  }

  public CodeSystemDesignation(CodeSystemDesignationModel o) {
    this.id = o.getId();
    if (null != o.getLanguage()) {
      this.language = o.getLanguage();
    }
    this.use = CodingHelper.fromJson(o.getUse());
    if (null != o.getValue()) {
      this.value = o.getValue();
    }
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
  public void setUse( Coding value) {
    this.use = value;
  }
  public Coding getUse() {
    return this.use;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }
  public void set_value( Element value) {
    this._value = value;
  }
  public Element get_value() {
    return this._value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CodeSystemDesignation]:" + "\n");
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); 
     if(this._language != null) builder.append("_language" + "->" + this._language.toString() + "\n"); 
     if(this.use != null) builder.append("use" + "->" + this.use.toString() + "\n"); 
     if(this.value != null) builder.append("value" + "->" + this.value.toString() + "\n"); 
     if(this._value != null) builder.append("_value" + "->" + this._value.toString() + "\n"); ;
    return builder.toString();
  }


}
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
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ElementDefinitionMapping  extends BackboneElement  {
  /**
  * Description: "An internal reference to the definition of a mapping."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String identity;

  /**
  * Description: "Extensions for identity"
  */
  protected transient Element _identity;

  /**
  * Description: "Identifies the computable language in which mapping.map is expressed."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String language;

  /**
  * Description: "Extensions for language"
  */
  protected transient Element _language;

  /**
  * Description: "Expresses what part of the target specification corresponds to this element."
  */
  protected String map;

  /**
  * Description: "Extensions for map"
  */
  protected transient Element _map;

  /**
  * Description: "Comments that provide information about the mapping or its use."
  */
  protected String comment;

  /**
  * Description: "Extensions for comment"
  */
  protected transient Element _comment;

  public ElementDefinitionMapping() {}

  public void setIdentity( String value) {
    this.identity = value;
  }
  public String getIdentity() {
    return this.identity;
  }
  public void set_identity( Element value) {
    this._identity = value;
  }
  public Element get_identity() {
    return this._identity;
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
  public void setMap( String value) {
    this.map = value;
  }
  public String getMap() {
    return this.map;
  }
  public void set_map( Element value) {
    this._map = value;
  }
  public Element get_map() {
    return this._map;
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
    builder.append("[ElementDefinitionMapping]:" + "\n");
     if(this.identity != null) builder.append("identity" + "->" + this.identity.toString() + "\n"); 
     if(this._identity != null) builder.append("_identity" + "->" + this._identity.toString() + "\n"); 
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); 
     if(this._language != null) builder.append("_language" + "->" + this._language.toString() + "\n"); 
     if(this.map != null) builder.append("map" + "->" + this.map.toString() + "\n"); 
     if(this._map != null) builder.append("_map" + "->" + this._map.toString() + "\n"); 
     if(this.comment != null) builder.append("comment" + "->" + this.comment.toString() + "\n"); 
     if(this._comment != null) builder.append("_comment" + "->" + this._comment.toString() + "\n"); ;
    return builder.toString();
  }

}
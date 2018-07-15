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
* "A  text note which also  contains information about who made the statement and when."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Annotation  extends Element  {
  /**
  * Description: "The individual responsible for making the annotation."
  */
  protected Reference authorReference;

  /**
  * Description: "The individual responsible for making the annotation."
  */
  protected String authorString;

  /**
  * Description: "Extensions for authorString"
  */
  protected transient Element _authorString;

  /**
  * Description: "Indicates when this particular annotation was made."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String time;

  /**
  * Description: "Extensions for time"
  */
  protected transient Element _time;

  /**
  * Description: "The text of the annotation."
  */
  protected String text;

  /**
  * Description: "Extensions for text"
  */
  protected transient Element _text;

  public Annotation() {}

  public void setAuthorReference( Reference value) {
    this.authorReference = value;
  }
  public Reference getAuthorReference() {
    return this.authorReference;
  }
  public void setAuthorString( String value) {
    this.authorString = value;
  }
  public String getAuthorString() {
    return this.authorString;
  }
  public void set_authorString( Element value) {
    this._authorString = value;
  }
  public Element get_authorString() {
    return this._authorString;
  }
  public void setTime( String value) {
    this.time = value;
  }
  public String getTime() {
    return this.time;
  }
  public void set_time( Element value) {
    this._time = value;
  }
  public Element get_time() {
    return this._time;
  }
  public void setText( String value) {
    this.text = value;
  }
  public String getText() {
    return this.text;
  }
  public void set_text( Element value) {
    this._text = value;
  }
  public Element get_text() {
    return this._text;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Annotation]:" + "\n");
     if(this.authorReference != null) builder.append("authorReference" + "->" + this.authorReference.toString() + "\n"); 
     if(this.authorString != null) builder.append("authorString" + "->" + this.authorString.toString() + "\n"); 
     if(this._authorString != null) builder.append("_authorString" + "->" + this._authorString.toString() + "\n"); 
     if(this.time != null) builder.append("time" + "->" + this.time.toString() + "\n"); 
     if(this._time != null) builder.append("_time" + "->" + this._time.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this._text != null) builder.append("_text" + "->" + this._text.toString() + "\n"); ;
    return builder.toString();
  }

}
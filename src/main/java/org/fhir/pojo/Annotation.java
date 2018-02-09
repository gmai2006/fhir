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
* "A  text note which also  contains information about who made the statement and when."
*/
public class Annotation  {
  /**
  * Description: "The individual responsible for making the annotation."
  */
  private Reference authorReference;

  /**
  * Description: "The individual responsible for making the annotation."
  */
  private String authorString;

  /**
  * Description: "Extensions for authorString"
  */
  private transient Element _authorString;

  /**
  * Description: "Indicates when this particular annotation was made."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String time;

  /**
  * Description: "Extensions for time"
  */
  private transient Element _time;

  /**
  * Description: "The text of the annotation."
  */
  private String text;

  /**
  * Description: "Extensions for text"
  */
  private transient Element _text;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

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
     builder.append("authorReference" + "[" + String.valueOf(this.authorReference) + "]\n"); 
     builder.append("authorString" + "[" + String.valueOf(this.authorString) + "]\n"); 
     builder.append("_authorString" + "[" + String.valueOf(this._authorString) + "]\n"); 
     builder.append("time" + "[" + String.valueOf(this.time) + "]\n"); 
     builder.append("_time" + "[" + String.valueOf(this._time) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("_text" + "[" + String.valueOf(this._text) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public static Annotation fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Annotation.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Annotation o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Annotation> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

}
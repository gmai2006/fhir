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
* "For referring to data content defined in other formats."
*/
public class Attachment  {
  /**
  * Description: "Identifies the type of the data in the attachment and allows a method to be chosen to interpret or render the data. Includes mime type parameters such as charset where appropriate."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String contentType;

  /**
  * Description: "Extensions for contentType"
  */
  private transient Element _contentType;

  /**
  * Description: "The human language of the content. The value can be any valid value according to BCP 47."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
  */
  private transient Element _language;

  /**
  * Description: "The actual data of the attachment - a sequence of bytes. In XML, represented using base64."
  */
  private String data;

  /**
  * Description: "Extensions for data"
  */
  private transient Element _data;

  /**
  * Description: "An alternative location where the data can be accessed."
  */
  private String url;

  /**
  * Description: "Extensions for url"
  */
  private transient Element _url;

  /**
  * Description: "The number of bytes of data that make up this attachment (before base64 encoding, if that is done)."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  private Float size;

  /**
  * Description: "Extensions for size"
  */
  private transient Element _size;

  /**
  * Description: "The calculated hash of the data using SHA-1. Represented using base64."
  */
  private String hash;

  /**
  * Description: "Extensions for hash"
  */
  private transient Element _hash;

  /**
  * Description: "A label or set of text to display in place of the data."
  */
  private String title;

  /**
  * Description: "Extensions for title"
  */
  private transient Element _title;

  /**
  * Description: "The date that the attachment was first created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String creation;

  /**
  * Description: "Extensions for creation"
  */
  private transient Element _creation;

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

  public Attachment() {}

  public void setContentType( String value) {
    this.contentType = value;
  }
  public String getContentType() {
    return this.contentType;
  }
  public void set_contentType( Element value) {
    this._contentType = value;
  }
  public Element get_contentType() {
    return this._contentType;
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
  public void setData( String value) {
    this.data = value;
  }
  public String getData() {
    return this.data;
  }
  public void set_data( Element value) {
    this._data = value;
  }
  public Element get_data() {
    return this._data;
  }
  public void setUrl( String value) {
    this.url = value;
  }
  public String getUrl() {
    return this.url;
  }
  public void set_url( Element value) {
    this._url = value;
  }
  public Element get_url() {
    return this._url;
  }
  public void setSize( Float value) {
    this.size = value;
  }
  public Float getSize() {
    return this.size;
  }
  public void set_size( Element value) {
    this._size = value;
  }
  public Element get_size() {
    return this._size;
  }
  public void setHash( String value) {
    this.hash = value;
  }
  public String getHash() {
    return this.hash;
  }
  public void set_hash( Element value) {
    this._hash = value;
  }
  public Element get_hash() {
    return this._hash;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void set_title( Element value) {
    this._title = value;
  }
  public Element get_title() {
    return this._title;
  }
  public void setCreation( String value) {
    this.creation = value;
  }
  public String getCreation() {
    return this.creation;
  }
  public void set_creation( Element value) {
    this._creation = value;
  }
  public Element get_creation() {
    return this._creation;
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
     builder.append("contentType" + "[" + String.valueOf(this.contentType) + "]\n"); 
     builder.append("_contentType" + "[" + String.valueOf(this._contentType) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); 
     builder.append("data" + "[" + String.valueOf(this.data) + "]\n"); 
     builder.append("_data" + "[" + String.valueOf(this._data) + "]\n"); 
     builder.append("url" + "[" + String.valueOf(this.url) + "]\n"); 
     builder.append("_url" + "[" + String.valueOf(this._url) + "]\n"); 
     builder.append("size" + "[" + String.valueOf(this.size) + "]\n"); 
     builder.append("_size" + "[" + String.valueOf(this._size) + "]\n"); 
     builder.append("hash" + "[" + String.valueOf(this.hash) + "]\n"); 
     builder.append("_hash" + "[" + String.valueOf(this._hash) + "]\n"); 
     builder.append("title" + "[" + String.valueOf(this.title) + "]\n"); 
     builder.append("_title" + "[" + String.valueOf(this._title) + "]\n"); 
     builder.append("creation" + "[" + String.valueOf(this.creation) + "]\n"); 
     builder.append("_creation" + "[" + String.valueOf(this._creation) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public static Attachment fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Attachment.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Attachment o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Attachment> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

}
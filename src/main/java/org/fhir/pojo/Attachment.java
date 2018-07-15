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
* "For referring to data content defined in other formats."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Attachment  extends Element  {
  /**
  * Description: "Identifies the type of the data in the attachment and allows a method to be chosen to interpret or render the data. Includes mime type parameters such as charset where appropriate."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String contentType;

  /**
  * Description: "Extensions for contentType"
  */
  protected transient Element _contentType;

  /**
  * Description: "The human language of the content. The value can be any valid value according to BCP 47."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String language;

  /**
  * Description: "Extensions for language"
  */
  protected transient Element _language;

  /**
  * Description: "The actual data of the attachment - a sequence of bytes. In XML, represented using base64."
  */
  protected String data;

  /**
  * Description: "Extensions for data"
  */
  protected transient Element _data;

  /**
  * Description: "An alternative location where the data can be accessed."
  */
  protected String url;

  /**
  * Description: "Extensions for url"
  */
  protected transient Element _url;

  /**
  * Description: "The number of bytes of data that make up this attachment (before base64 encoding, if that is done)."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  protected Float size;

  /**
  * Description: "Extensions for size"
  */
  protected transient Element _size;

  /**
  * Description: "The calculated hash of the data using SHA-1. Represented using base64."
  */
  protected String hash;

  /**
  * Description: "Extensions for hash"
  */
  protected transient Element _hash;

  /**
  * Description: "A label or set of text to display in place of the data."
  */
  protected String title;

  /**
  * Description: "Extensions for title"
  */
  protected transient Element _title;

  /**
  * Description: "The date that the attachment was first created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String creation;

  /**
  * Description: "Extensions for creation"
  */
  protected transient Element _creation;

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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Attachment]:" + "\n");
     if(this.contentType != null) builder.append("contentType" + "->" + this.contentType.toString() + "\n"); 
     if(this._contentType != null) builder.append("_contentType" + "->" + this._contentType.toString() + "\n"); 
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); 
     if(this._language != null) builder.append("_language" + "->" + this._language.toString() + "\n"); 
     if(this.data != null) builder.append("data" + "->" + this.data.toString() + "\n"); 
     if(this._data != null) builder.append("_data" + "->" + this._data.toString() + "\n"); 
     if(this.url != null) builder.append("url" + "->" + this.url.toString() + "\n"); 
     if(this._url != null) builder.append("_url" + "->" + this._url.toString() + "\n"); 
     if(this.size != null) builder.append("size" + "->" + this.size.toString() + "\n"); 
     if(this._size != null) builder.append("_size" + "->" + this._size.toString() + "\n"); 
     if(this.hash != null) builder.append("hash" + "->" + this.hash.toString() + "\n"); 
     if(this._hash != null) builder.append("_hash" + "->" + this._hash.toString() + "\n"); 
     if(this.title != null) builder.append("title" + "->" + this.title.toString() + "\n"); 
     if(this._title != null) builder.append("_title" + "->" + this._title.toString() + "\n"); 
     if(this.creation != null) builder.append("creation" + "->" + this.creation.toString() + "\n"); 
     if(this._creation != null) builder.append("_creation" + "->" + this._creation.toString() + "\n"); ;
    return builder.toString();
  }

}
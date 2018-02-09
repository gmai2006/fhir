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
* "An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world."
*/
public class Address  {
  /**
  * Description: "The purpose of this address."
  */
  private String use;

  /**
  * Description: "Extensions for use"
  */
  private transient Element _use;

  /**
  * Description: "Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both."
  */
  private String type;

  /**
  * Description: "Extensions for type"
  */
  private transient Element _type;

  /**
  * Description: "A full text representation of the address."
  */
  private String text;

  /**
  * Description: "Extensions for text"
  */
  private transient Element _text;

  /**
  * Description: "This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information."
  */
  private java.util.List<String> line = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for line"
  */
  private transient java.util.List<Element> _line = new java.util.ArrayList<>();

  /**
  * Description: "The name of the city, town, village or other community or delivery center."
  */
  private String city;

  /**
  * Description: "Extensions for city"
  */
  private transient Element _city;

  /**
  * Description: "The name of the administrative area (county)."
  */
  private String district;

  /**
  * Description: "Extensions for district"
  */
  private transient Element _district;

  /**
  * Description: "Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes)."
  */
  private String state;

  /**
  * Description: "Extensions for state"
  */
  private transient Element _state;

  /**
  * Description: "A postal code designating a region defined by the postal service."
  */
  private String postalCode;

  /**
  * Description: "Extensions for postalCode"
  */
  private transient Element _postalCode;

  /**
  * Description: "Country - a nation as commonly understood or generally accepted."
  */
  private String country;

  /**
  * Description: "Extensions for country"
  */
  private transient Element _country;

  /**
  * Description: "Time period when address was/is in use."
  */
  private Period period;

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

  public Address() {}

  public void setUse( String value) {
    this.use = UseEnum.fromCode(value);
  }
  public String getUse() {
    return this.use;
  }
  public void set_use( Element value) {
    this._use = value;
  }
  public Element get_use() {
    return this._use;
  }
  public void setType( String value) {
    this.type = TypeEnum.fromCode(value);
  }
  public String getType() {
    return this.type;
  }
  public void set_type( Element value) {
    this._type = value;
  }
  public Element get_type() {
    return this._type;
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
  public void setLine( java.util.List<String> value) {
    this.line = value;
  }
  public java.util.List<String> getLine() {
    return this.line;
  }
  public void set_line( java.util.List<Element> value) {
    this._line = value;
  }
  public java.util.List<Element> get_line() {
    return this._line;
  }
  public void setCity( String value) {
    this.city = value;
  }
  public String getCity() {
    return this.city;
  }
  public void set_city( Element value) {
    this._city = value;
  }
  public Element get_city() {
    return this._city;
  }
  public void setDistrict( String value) {
    this.district = value;
  }
  public String getDistrict() {
    return this.district;
  }
  public void set_district( Element value) {
    this._district = value;
  }
  public Element get_district() {
    return this._district;
  }
  public void setState( String value) {
    this.state = value;
  }
  public String getState() {
    return this.state;
  }
  public void set_state( Element value) {
    this._state = value;
  }
  public Element get_state() {
    return this._state;
  }
  public void setPostalCode( String value) {
    this.postalCode = value;
  }
  public String getPostalCode() {
    return this.postalCode;
  }
  public void set_postalCode( Element value) {
    this._postalCode = value;
  }
  public Element get_postalCode() {
    return this._postalCode;
  }
  public void setCountry( String value) {
    this.country = value;
  }
  public String getCountry() {
    return this.country;
  }
  public void set_country( Element value) {
    this._country = value;
  }
  public Element get_country() {
    return this._country;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
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
     builder.append("use" + "[" + String.valueOf(this.use) + "]\n"); 
     builder.append("_use" + "[" + String.valueOf(this._use) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("_type" + "[" + String.valueOf(this._type) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("_text" + "[" + String.valueOf(this._text) + "]\n"); 
     builder.append("line" + "[" + String.valueOf(this.line) + "]\n"); 
     builder.append("_line" + "[" + String.valueOf(this._line) + "]\n"); 
     builder.append("city" + "[" + String.valueOf(this.city) + "]\n"); 
     builder.append("_city" + "[" + String.valueOf(this._city) + "]\n"); 
     builder.append("district" + "[" + String.valueOf(this.district) + "]\n"); 
     builder.append("_district" + "[" + String.valueOf(this._district) + "]\n"); 
     builder.append("state" + "[" + String.valueOf(this.state) + "]\n"); 
     builder.append("_state" + "[" + String.valueOf(this._state) + "]\n"); 
     builder.append("postalCode" + "[" + String.valueOf(this.postalCode) + "]\n"); 
     builder.append("_postalCode" + "[" + String.valueOf(this._postalCode) + "]\n"); 
     builder.append("country" + "[" + String.valueOf(this.country) + "]\n"); 
     builder.append("_country" + "[" + String.valueOf(this._country) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public static Address fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Address.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Address o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Address> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public enum UseEnum {
  	home,
  	work,
  	temp,
  	old,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "home" : { return home.toString(); }
  			case "work" : { return work.toString(); }
  			case "temp" : { return temp.toString(); }
  			case "old" : { return old.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }public enum TypeEnum {
  	postal,
  	physical,
  	both,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "postal" : { return postal.toString(); }
  			case "physical" : { return physical.toString(); }
  			case "both" : { return both.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }
}
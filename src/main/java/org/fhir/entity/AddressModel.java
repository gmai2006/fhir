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

package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world."
*/
@Entity
@Table(name="address")
public class AddressModel  implements Serializable {
	private static final long serialVersionUID = 151873631155286873L;
  /**
  * Description: "The purpose of this address."
  */
  @javax.persistence.Basic
  @Column(name="\"use\"")
  private String use;

  /**
  * Description: "Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both."
  */
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "A full text representation of the address."
  */
  @javax.persistence.Basic
  @Column(name="\"text\"")
  private String text;

  /**
  * Description: "This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information."
  */
  @javax.persistence.Basic
  @Column(name="\"line\"")
  private String line;

  /**
  * Description: "The name of the city, town, village or other community or delivery center."
  */
  @javax.persistence.Basic
  @Column(name="\"city\"")
  private String city;

  /**
  * Description: "The name of the administrative area (county)."
  */
  @javax.persistence.Basic
  @Column(name="\"district\"")
  private String district;

  /**
  * Description: "Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes)."
  */
  @javax.persistence.Basic
  @Column(name="\"state\"")
  private String state;

  /**
  * Description: "A postal code designating a region defined by the postal service."
  */
  @javax.persistence.Basic
  @Column(name="\"postalCode\"")
  private String postalCode;

  /**
  * Description: "Country - a nation as commonly understood or generally accepted."
  */
  @javax.persistence.Basic
  @Column(name="\"country\"")
  private String country;

  /**
  * Description: "Time period when address was/is in use."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public AddressModel() {
  }

  public AddressModel(Address o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.use = o.getUse();
    this.type = o.getType();
    this.text = o.getText();
    this.line = org.fhir.utils.JsonUtils.write2String(o.getLine());
    this.city = o.getCity();
    this.district = o.getDistrict();
    this.state = o.getState();
    this.postalCode = o.getPostalCode();
    this.country = o.getCountry();
    this.period = JsonUtils.toJson(o.getPeriod());
  }

  public String getUse() {
    return this.use;
  }
  public void setUse( String value) {
    this.use = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getText() {
    return this.text;
  }
  public void setText( String value) {
    this.text = value;
  }
  public String getLine() {
    return this.line;
  }
  public void setLine( String value) {
    this.line = value;
  }
  public String getCity() {
    return this.city;
  }
  public void setCity( String value) {
    this.city = value;
  }
  public String getDistrict() {
    return this.district;
  }
  public void setDistrict( String value) {
    this.district = value;
  }
  public String getState() {
    return this.state;
  }
  public void setState( String value) {
    this.state = value;
  }
  public String getPostalCode() {
    return this.postalCode;
  }
  public void setPostalCode( String value) {
    this.postalCode = value;
  }
  public String getCountry() {
    return this.country;
  }
  public void setCountry( String value) {
    this.country = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AddressModel]:" + "\n");
     builder.append("use" + "->" + this.use + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("line" + "->" + this.line + "\n"); 
     builder.append("city" + "->" + this.city + "\n"); 
     builder.append("district" + "->" + this.district + "\n"); 
     builder.append("state" + "->" + this.state + "\n"); 
     builder.append("postalCode" + "->" + this.postalCode + "\n"); 
     builder.append("country" + "->" + this.country + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AddressModel]:" + "\n");
     builder.append("use" + "->" + this.use + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("line" + "->" + this.line + "\n"); 
     builder.append("city" + "->" + this.city + "\n"); 
     builder.append("district" + "->" + this.district + "\n"); 
     builder.append("state" + "->" + this.state + "\n"); 
     builder.append("postalCode" + "->" + this.postalCode + "\n"); 
     builder.append("country" + "->" + this.country + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}
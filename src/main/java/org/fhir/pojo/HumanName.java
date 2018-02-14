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
* "A human's name with the ability to identify parts and usage."
*/
public class HumanName  {
  /**
  * Description: "Identifies the purpose for this name."
  */
  private String use;

  /**
  * Description: "Extensions for use"
  */
  private transient Element _use;

  /**
  * Description: "A full text representation of the name."
  */
  private String text;

  /**
  * Description: "Extensions for text"
  */
  private transient Element _text;

  /**
  * Description: "The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name of his father."
  */
  private String family;

  /**
  * Description: "Extensions for family"
  */
  private transient Element _family;

  /**
  * Description: "Given name."
  */
  private java.util.List<String> given = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for given"
  */
  private transient java.util.List<Element> _given = new java.util.ArrayList<>();

  /**
  * Description: "Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name."
  */
  private java.util.List<String> prefix = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for prefix"
  */
  private transient java.util.List<Element> _prefix = new java.util.ArrayList<>();

  /**
  * Description: "Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name."
  */
  private java.util.List<String> suffix = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for suffix"
  */
  private transient java.util.List<Element> _suffix = new java.util.ArrayList<>();

  /**
  * Description: "Indicates the period of time when this name was valid for the named person."
  */
  private Period period;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  @javax.validation.constraints.NotNull
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

  public HumanName() {}

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
  public void setFamily( String value) {
    this.family = value;
  }
  public String getFamily() {
    return this.family;
  }
  public void set_family( Element value) {
    this._family = value;
  }
  public Element get_family() {
    return this._family;
  }
  public void setGiven( java.util.List<String> value) {
    this.given = value;
  }
  public java.util.List<String> getGiven() {
    return this.given;
  }
  public void set_given( java.util.List<Element> value) {
    this._given = value;
  }
  public java.util.List<Element> get_given() {
    return this._given;
  }
  public void setPrefix( java.util.List<String> value) {
    this.prefix = value;
  }
  public java.util.List<String> getPrefix() {
    return this.prefix;
  }
  public void set_prefix( java.util.List<Element> value) {
    this._prefix = value;
  }
  public java.util.List<Element> get_prefix() {
    return this._prefix;
  }
  public void setSuffix( java.util.List<String> value) {
    this.suffix = value;
  }
  public java.util.List<String> getSuffix() {
    return this.suffix;
  }
  public void set_suffix( java.util.List<Element> value) {
    this._suffix = value;
  }
  public java.util.List<Element> get_suffix() {
    return this._suffix;
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
    builder.append("[HumanName]:" + "\n");
     if(this.use != null) builder.append("use" + "->" + this.use.toString() + "\n"); 
     if(this._use != null) builder.append("_use" + "->" + this._use.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this._text != null) builder.append("_text" + "->" + this._text.toString() + "\n"); 
     if(this.family != null) builder.append("family" + "->" + this.family.toString() + "\n"); 
     if(this._family != null) builder.append("_family" + "->" + this._family.toString() + "\n"); 
     if(this.given != null) builder.append("given" + "->" + this.given.toString() + "\n"); 
     if(this._given != null) builder.append("_given" + "->" + this._given.toString() + "\n"); 
     if(this.prefix != null) builder.append("prefix" + "->" + this.prefix.toString() + "\n"); 
     if(this._prefix != null) builder.append("_prefix" + "->" + this._prefix.toString() + "\n"); 
     if(this.suffix != null) builder.append("suffix" + "->" + this.suffix.toString() + "\n"); 
     if(this._suffix != null) builder.append("_suffix" + "->" + this._suffix.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }

  public enum UseEnum {
  	usual,
  	official,
  	temp,
  	nickname,
  	anonymous,
  	old,
  	maiden,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "usual" : { return usual.toString(); }
  			case "official" : { return official.toString(); }
  			case "temp" : { return temp.toString(); }
  			case "nickname" : { return nickname.toString(); }
  			case "anonymous" : { return anonymous.toString(); }
  			case "old" : { return old.toString(); }
  			case "maiden" : { return maiden.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }
}
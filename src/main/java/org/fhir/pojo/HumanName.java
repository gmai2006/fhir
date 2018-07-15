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
* "A human's name with the ability to identify parts and usage."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HumanName  extends Element  {
  /**
  * Description: "Identifies the purpose for this name."
  */
  protected String use;

  /**
  * Description: "Extensions for use"
  */
  protected transient Element _use;

  /**
  * Description: "A full text representation of the name."
  */
  protected String text;

  /**
  * Description: "Extensions for text"
  */
  protected transient Element _text;

  /**
  * Description: "The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name of his father."
  */
  protected String family;

  /**
  * Description: "Extensions for family"
  */
  protected transient Element _family;

  /**
  * Description: "Given name."
  */
  protected java.util.List<String> given;

  /**
  * Description: "Extensions for given"
  */
  protected transient java.util.List<Element> _given;

  /**
  * Description: "Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name."
  */
  protected java.util.List<String> prefix;

  /**
  * Description: "Extensions for prefix"
  */
  protected transient java.util.List<Element> _prefix;

  /**
  * Description: "Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name."
  */
  protected java.util.List<String> suffix;

  /**
  * Description: "Extensions for suffix"
  */
  protected transient java.util.List<Element> _suffix;

  /**
  * Description: "Indicates the period of time when this name was valid for the named person."
  */
  protected Period period;

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
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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
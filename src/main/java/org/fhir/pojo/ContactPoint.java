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
* "Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactPoint  extends Element  {
  /**
  * Description: "Telecommunications form for contact point - what communications system is required to make use of the contact."
  */
  protected String system;

  /**
  * Description: "Extensions for system"
  */
  protected transient Element _system;

  /**
  * Description: "The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address)."
  */
  protected String value;

  /**
  * Description: "Extensions for value"
  */
  protected transient Element _value;

  /**
  * Description: "Identifies the purpose for the contact point."
  */
  protected String use;

  /**
  * Description: "Extensions for use"
  */
  protected transient Element _use;

  /**
  * Description: "Specifies a preferred order in which to use a set of contacts. Contacts are ranked with lower values coming before higher values."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float rank;

  /**
  * Description: "Extensions for rank"
  */
  protected transient Element _rank;

  /**
  * Description: "Time period when the contact point was/is in use."
  */
  protected Period period;

  public ContactPoint() {}

  public void setSystem( String value) {
    this.system = SystemEnum.fromCode(value);
  }
  public String getSystem() {
    return this.system;
  }
  public void set_system( Element value) {
    this._system = value;
  }
  public Element get_system() {
    return this._system;
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
  public void setRank( Float value) {
    this.rank = value;
  }
  public Float getRank() {
    return this.rank;
  }
  public void set_rank( Element value) {
    this._rank = value;
  }
  public Element get_rank() {
    return this._rank;
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
    builder.append("[ContactPoint]:" + "\n");
     if(this.system != null) builder.append("system" + "->" + this.system.toString() + "\n"); 
     if(this._system != null) builder.append("_system" + "->" + this._system.toString() + "\n"); 
     if(this.value != null) builder.append("value" + "->" + this.value.toString() + "\n"); 
     if(this._value != null) builder.append("_value" + "->" + this._value.toString() + "\n"); 
     if(this.use != null) builder.append("use" + "->" + this.use.toString() + "\n"); 
     if(this._use != null) builder.append("_use" + "->" + this._use.toString() + "\n"); 
     if(this.rank != null) builder.append("rank" + "->" + this.rank.toString() + "\n"); 
     if(this._rank != null) builder.append("_rank" + "->" + this._rank.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum SystemEnum {
  	phone,
  	fax,
  	email,
  	pager,
  	url,
  	sms,
  	other,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "phone" : { return phone.toString(); }
  			case "fax" : { return fax.toString(); }
  			case "email" : { return email.toString(); }
  			case "pager" : { return pager.toString(); }
  			case "url" : { return url.toString(); }
  			case "sms" : { return sms.toString(); }
  			case "other" : { return other.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }/**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum UseEnum {
  	home,
  	work,
  	temp,
  	old,
  	mobile,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "home" : { return home.toString(); }
  			case "work" : { return work.toString(); }
  			case "temp" : { return temp.toString(); }
  			case "old" : { return old.toString(); }
  			case "mobile" : { return mobile.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }
}
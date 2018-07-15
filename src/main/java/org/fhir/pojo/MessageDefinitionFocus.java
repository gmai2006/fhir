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
import org.fhir.entity.MessageDefinitionFocusModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MessageDefinitionFocus  extends BackboneElement  {
  /**
  * Description: "The kind of resource that must be the focus for this message."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String code;

  /**
  * Description: "Extensions for code"
  */
  protected transient Element _code;

  /**
  * Description: "A profile that reflects constraints for the focal resource (and potentially for related resources)."
  */
  protected Reference profile;

  /**
  * Description: "Identifies the minimum number of resources of this type that must be pointed to by a message in order for it to be valid against this MessageDefinition."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  protected Float min;

  /**
  * Description: "Extensions for min"
  */
  protected transient Element _min;

  /**
  * Description: "Identifies the maximum number of resources of this type that must be pointed to by a message in order for it to be valid against this MessageDefinition."
  */
  protected String max;

  /**
  * Description: "Extensions for max"
  */
  protected transient Element _max;

  public MessageDefinitionFocus() {
  }

  public MessageDefinitionFocus(MessageDefinitionFocusModel o) {
    this.id = o.getId();
    if (null != o.getCode()) {
      this.code = o.getCode();
    }
    if (null != o.getProfile() && !o.getProfile().isEmpty()) {
      this.profile = new Reference(o.getProfile().get(0));
    }
    if (null != o.getMin()) {
      this.min = o.getMin();
    }
    if (null != o.getMax()) {
      this.max = o.getMax();
    }
  }

  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void set_code( Element value) {
    this._code = value;
  }
  public Element get_code() {
    return this._code;
  }
  public void setProfile( Reference value) {
    this.profile = value;
  }
  public Reference getProfile() {
    return this.profile;
  }
  public void setMin( Float value) {
    this.min = value;
  }
  public Float getMin() {
    return this.min;
  }
  public void set_min( Element value) {
    this._min = value;
  }
  public Element get_min() {
    return this._min;
  }
  public void setMax( String value) {
    this.max = value;
  }
  public String getMax() {
    return this.max;
  }
  public void set_max( Element value) {
    this._max = value;
  }
  public Element get_max() {
    return this._max;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MessageDefinitionFocus]:" + "\n");
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this._code != null) builder.append("_code" + "->" + this._code.toString() + "\n"); 
     if(this.profile != null) builder.append("profile" + "->" + this.profile.toString() + "\n"); 
     if(this.min != null) builder.append("min" + "->" + this.min.toString() + "\n"); 
     if(this._min != null) builder.append("_min" + "->" + this._min.toString() + "\n"); 
     if(this.max != null) builder.append("max" + "->" + this.max.toString() + "\n"); 
     if(this._max != null) builder.append("_max" + "->" + this._max.toString() + "\n"); ;
    return builder.toString();
  }


}
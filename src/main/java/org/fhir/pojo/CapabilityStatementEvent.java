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
import org.fhir.entity.CapabilityStatementEventModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CapabilityStatementEvent  extends BackboneElement  {
  /**
  * Description: "A coded identifier of a supported messaging event."
  */
  @javax.validation.constraints.NotNull
  protected Coding code;

  /**
  * Description: "The impact of the content of the message."
  */
  protected String category;

  /**
  * Description: "Extensions for category"
  */
  protected transient Element _category;

  /**
  * Description: "The mode of this event declaration - whether an application is a sender or receiver."
  */
  protected String mode;

  /**
  * Description: "Extensions for mode"
  */
  protected transient Element _mode;

  /**
  * Description: "A resource associated with the event.  This is the resource that defines the event."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String focus;

  /**
  * Description: "Extensions for focus"
  */
  protected transient Element _focus;

  /**
  * Description: "Information about the request for this event."
  */
  @javax.validation.constraints.NotNull
  protected Reference request;

  /**
  * Description: "Information about the response for this event."
  */
  @javax.validation.constraints.NotNull
  protected Reference response;

  /**
  * Description: "Guidance on how this event is handled, such as internal system trigger points, business rules, etc."
  */
  protected String documentation;

  /**
  * Description: "Extensions for documentation"
  */
  protected transient Element _documentation;

  public CapabilityStatementEvent() {
  }

  public CapabilityStatementEvent(CapabilityStatementEventModel o) {
    this.id = o.getId();
    if (null != o.getCode() && !o.getCode().isEmpty()) {
      this.code = new Coding(o.getCode().get(0));
    }
    if (null != o.getCategory()) {
      this.category = o.getCategory();
    }
    if (null != o.getMode()) {
      this.mode = o.getMode();
    }
    if (null != o.getFocus()) {
      this.focus = o.getFocus();
    }
    if (null != o.getRequest() && !o.getRequest().isEmpty()) {
      this.request = new Reference(o.getRequest().get(0));
    }
    if (null != o.getResponse() && !o.getResponse().isEmpty()) {
      this.response = new Reference(o.getResponse().get(0));
    }
    if (null != o.getDocumentation()) {
      this.documentation = o.getDocumentation();
    }
  }

  public void setCode( Coding value) {
    this.code = value;
  }
  public Coding getCode() {
    return this.code;
  }
  public void setCategory( String value) {
    this.category = CategoryEnum.fromCode(value);
  }
  public String getCategory() {
    return this.category;
  }
  public void set_category( Element value) {
    this._category = value;
  }
  public Element get_category() {
    return this._category;
  }
  public void setMode( String value) {
    this.mode = ModeEnum.fromCode(value);
  }
  public String getMode() {
    return this.mode;
  }
  public void set_mode( Element value) {
    this._mode = value;
  }
  public Element get_mode() {
    return this._mode;
  }
  public void setFocus( String value) {
    this.focus = value;
  }
  public String getFocus() {
    return this.focus;
  }
  public void set_focus( Element value) {
    this._focus = value;
  }
  public Element get_focus() {
    return this._focus;
  }
  public void setRequest( Reference value) {
    this.request = value;
  }
  public Reference getRequest() {
    return this.request;
  }
  public void setResponse( Reference value) {
    this.response = value;
  }
  public Reference getResponse() {
    return this.response;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void set_documentation( Element value) {
    this._documentation = value;
  }
  public Element get_documentation() {
    return this._documentation;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CapabilityStatementEvent]:" + "\n");
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this._category != null) builder.append("_category" + "->" + this._category.toString() + "\n"); 
     if(this.mode != null) builder.append("mode" + "->" + this.mode.toString() + "\n"); 
     if(this._mode != null) builder.append("_mode" + "->" + this._mode.toString() + "\n"); 
     if(this.focus != null) builder.append("focus" + "->" + this.focus.toString() + "\n"); 
     if(this._focus != null) builder.append("_focus" + "->" + this._focus.toString() + "\n"); 
     if(this.request != null) builder.append("request" + "->" + this.request.toString() + "\n"); 
     if(this.response != null) builder.append("response" + "->" + this.response.toString() + "\n"); 
     if(this.documentation != null) builder.append("documentation" + "->" + this.documentation.toString() + "\n"); 
     if(this._documentation != null) builder.append("_documentation" + "->" + this._documentation.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum CategoryEnum {
  	Consequence,
  	Currency,
  	Notification,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Consequence" : { return Consequence.toString(); }
  			case "Currency" : { return Currency.toString(); }
  			case "Notification" : { return Notification.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ModeEnum {
  	sender,
  	receiver,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "sender" : { return sender.toString(); }
  			case "receiver" : { return receiver.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}
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
import com.google.gson.GsonBuilder;

/**
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
*/
public class CapabilityStatementEvent  {
  /**
  * Description: "A coded identifier of a supported messaging event."
  */
  @javax.validation.constraints.NotNull
  private Coding code;

  /**
  * Description: "The impact of the content of the message."
  */
  private String category;

  /**
  * Description: "Extensions for category"
  */
  private transient Element _category;

  /**
  * Description: "The mode of this event declaration - whether an application is a sender or receiver."
  */
  private String mode;

  /**
  * Description: "Extensions for mode"
  */
  private transient Element _mode;

  /**
  * Description: "A resource associated with the event.  This is the resource that defines the event."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String focus;

  /**
  * Description: "Extensions for focus"
  */
  private transient Element _focus;

  /**
  * Description: "Information about the request for this event."
  */
  @javax.validation.constraints.NotNull
  private Reference request;

  /**
  * Description: "Information about the response for this event."
  */
  @javax.validation.constraints.NotNull
  private Reference response;

  /**
  * Description: "Guidance on how this event is handled, such as internal system trigger points, business rules, etc."
  */
  private String documentation;

  /**
  * Description: "Extensions for documentation"
  */
  private transient Element _documentation;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public CapabilityStatementEvent() {
  }

  public CapabilityStatementEvent(CapabilityStatementEventModel o) {
    this.id = o.getId();
      this.code = Coding.fromJson(o.getCode());
      if (null != o.getCategory()) {
        this.category = new String(o.getCategory());
      }

      if (null != o.getMode()) {
        this.mode = new String(o.getMode());
      }

      if (null != o.getFocus()) {
        this.focus = new String(o.getFocus());
      }

      if (null != o.getRequest()) {
        this.request = new Reference(o.getRequest());
        this.request.setId(this.getId());
      }

      if (null != o.getResponse()) {
        this.response = new Reference(o.getResponse());
        this.response.setId(this.getId());
      }

      if (null != o.getDocumentation()) {
        this.documentation = new String(o.getDocumentation());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
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
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("_category" + "[" + String.valueOf(this._category) + "]\n"); 
     builder.append("mode" + "[" + String.valueOf(this.mode) + "]\n"); 
     builder.append("_mode" + "[" + String.valueOf(this._mode) + "]\n"); 
     builder.append("focus" + "[" + String.valueOf(this.focus) + "]\n"); 
     builder.append("_focus" + "[" + String.valueOf(this._focus) + "]\n"); 
     builder.append("request" + "[" + String.valueOf(this.request) + "]\n"); 
     builder.append("response" + "[" + String.valueOf(this.response) + "]\n"); 
     builder.append("documentation" + "[" + String.valueOf(this.documentation) + "]\n"); 
     builder.append("_documentation" + "[" + String.valueOf(this._documentation) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

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

  public static java.util.List<CapabilityStatementEvent> fromArray(java.util.List<CapabilityStatementEventModel> list) {
    return (java.util.List<CapabilityStatementEvent>)list.stream()
      .map(model -> new CapabilityStatementEvent(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CapabilityStatementEventModel> toModelArray(java.util.List<CapabilityStatementEvent> list) {
    return (java.util.List<CapabilityStatementEventModel>)list.stream()
      .map(model -> new CapabilityStatementEventModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static CapabilityStatementEvent fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CapabilityStatementEvent.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(CapabilityStatementEvent o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<CapabilityStatementEvent> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}
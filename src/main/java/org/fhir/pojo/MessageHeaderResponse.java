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
import org.fhir.entity.MessageHeaderResponseModel;
import com.google.gson.GsonBuilder;

/**
* "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle."
*/
public class MessageHeaderResponse  {
  /**
  * Description: "The MessageHeader.id of the message to which this message is a response."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String identifier;

  /**
  * Description: "Extensions for identifier"
  */
  private transient Element _identifier;

  /**
  * Description: "Code that identifies the type of response to the message - whether it was successful or not, and whether it should be resent or not."
  */
  private String code;

  /**
  * Description: "Extensions for code"
  */
  private transient Element _code;

  /**
  * Description: "Full details of any issues found in the message."
  */
  private Reference details;

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

  public MessageHeaderResponse() {
  }

  public MessageHeaderResponse(MessageHeaderResponseModel o) {
    this.id = o.getId();
      if (null != o.getIdentifier()) {
        this.identifier = new String(o.getIdentifier());
      }

      if (null != o.getCode()) {
        this.code = new String(o.getCode());
      }

      if (null != o.getDetails()) {
        this.details = new Reference(o.getDetails());
        this.details.setId(this.getId());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void set_identifier( Element value) {
    this._identifier = value;
  }
  public Element get_identifier() {
    return this._identifier;
  }
  public void setCode( String value) {
    this.code = CodeEnum.fromCode(value);
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
  public void setDetails( Reference value) {
    this.details = value;
  }
  public Reference getDetails() {
    return this.details;
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
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("_identifier" + "[" + String.valueOf(this._identifier) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("_code" + "[" + String.valueOf(this._code) + "]\n"); 
     builder.append("details" + "[" + String.valueOf(this.details) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum CodeEnum {
  	ok,
  	transienterror,
  	fatalerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ok" : { return ok.toString(); }
  			case "transienterror" : { return transienterror.toString(); }
  			case "fatalerror" : { return fatalerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<MessageHeaderResponse> fromArray(java.util.List<MessageHeaderResponseModel> list) {
    return (java.util.List<MessageHeaderResponse>)list.stream()
      .map(model -> new MessageHeaderResponse(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<MessageHeaderResponseModel> toModelArray(java.util.List<MessageHeaderResponse> list) {
    return (java.util.List<MessageHeaderResponseModel>)list.stream()
      .map(model -> new MessageHeaderResponseModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static MessageHeaderResponse fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, MessageHeaderResponse.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(MessageHeaderResponse o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<MessageHeaderResponse> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}